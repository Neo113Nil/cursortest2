package io.sentry.android.replay;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanDataConvention;
import io.sentry.TypeCheckHint;
import io.sentry.protocol.Device;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.NetworkRequestData;
import io.sentry.util.network.ReplayNetworkRequestOrResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: DefaultReplayBreadcrumbConverter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\bH\u0002J\f\u0010\u0013\u001a\u00020\r*\u00020\rH\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\bH\u0002RN\u0010\u0006\u001aB\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n \t* \u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\n0\n\u0018\u00010\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;", "Lio/sentry/ReplayBreadcrumbConverter;", "options", "Lio/sentry/SentryOptions;", "(Lio/sentry/SentryOptions;)V", "()V", "httpNetworkDetails", "", "Lio/sentry/Breadcrumb;", "kotlin.jvm.PlatformType", "Lio/sentry/util/network/NetworkRequestData;", "", "lastConnectivityState", "", "convert", "Lio/sentry/rrweb/RRWebEvent;", RRWebBreadcrumbEvent.EVENT_TAG, "isValidForRRWebSpan", "", "snakeToCamelCase", "toRRWebSpanEvent", "Lio/sentry/rrweb/RRWebSpanEvent;", "Companion", "ReplayBeforeBreadcrumbCallback", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DefaultReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final int MAX_HTTP_NETWORK_DETAILS = 32;
    private static final HashSet<String> supportedNetworkData;
    private final Map<Breadcrumb, NetworkRequestData> httpNetworkDetails;
    private String lastConnectivityState;
    private SentryOptions options;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<Regex> snakecasePattern$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Regex>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2
        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    });

    public DefaultReplayBreadcrumbConverter() {
        this.httpNetworkDetails = Collections.synchronizedMap(new LinkedHashMap<Breadcrumb, NetworkRequestData>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$httpNetworkDetails$1
            public /* bridge */ boolean containsKey(Breadcrumb breadcrumb) {
                return super.containsKey((Object) breadcrumb);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return containsKey((Breadcrumb) obj);
                }
                return false;
            }

            public /* bridge */ boolean containsValue(NetworkRequestData networkRequestData) {
                return super.containsValue((Object) networkRequestData);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof NetworkRequestData) {
                    return containsValue((NetworkRequestData) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> entrySet() {
                return getEntries();
            }

            public /* bridge */ NetworkRequestData get(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.get((Object) breadcrumb);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return get((Breadcrumb) obj);
                }
                return null;
            }

            public /* bridge */ Set<Map.Entry<Breadcrumb, NetworkRequestData>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Breadcrumb> getKeys() {
                return super.keySet();
            }

            public /* bridge */ NetworkRequestData getOrDefault(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return (NetworkRequestData) super.getOrDefault((Object) breadcrumb, (Breadcrumb) networkRequestData);
            }

            public final /* bridge */ NetworkRequestData getOrDefault(Object obj, NetworkRequestData networkRequestData) {
                return !(obj instanceof Breadcrumb) ? networkRequestData : getOrDefault((Breadcrumb) obj, networkRequestData);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Breadcrumb) ? obj2 : getOrDefault((Breadcrumb) obj, (NetworkRequestData) obj2);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<NetworkRequestData> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Breadcrumb> keySet() {
                return getKeys();
            }

            public /* bridge */ NetworkRequestData remove(Breadcrumb breadcrumb) {
                return (NetworkRequestData) super.remove((Object) breadcrumb);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ NetworkRequestData remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Breadcrumb) {
                    return remove((Breadcrumb) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(Breadcrumb breadcrumb, NetworkRequestData networkRequestData) {
                return super.remove((Object) breadcrumb, (Object) networkRequestData);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Breadcrumb) && (obj2 instanceof NetworkRequestData)) {
                    return remove((Breadcrumb) obj, (NetworkRequestData) obj2);
                }
                return false;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<NetworkRequestData> values() {
                return getValues();
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Breadcrumb, NetworkRequestData> eldest) {
                return size() > 32;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultReplayBreadcrumbConverter(SentryOptions options) {
        this();
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new ReplayBeforeBreadcrumbCallback(options.getBeforeBreadcrumb()));
    }

    /* compiled from: DefaultReplayBreadcrumbConverter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$Companion;", "", "()V", "MAX_HTTP_NETWORK_DETAILS", "", "snakecasePattern", "Lkotlin/text/Regex;", "getSnakecasePattern", "()Lkotlin/text/Regex;", "snakecasePattern$delegate", "Lkotlin/Lazy;", "supportedNetworkData", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex getSnakecasePattern() {
            return (Regex) DefaultReplayBreadcrumbConverter.snakecasePattern$delegate.getValue();
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(SpanDataConvention.HTTP_RESPONSE_CONTENT_LENGTH_KEY);
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    /* compiled from: DefaultReplayBreadcrumbConverter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$ReplayBeforeBreadcrumbCallback;", "Lio/sentry/SentryOptions$BeforeBreadcrumbCallback;", "delegate", "(Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;Lio/sentry/SentryOptions$BeforeBreadcrumbCallback;)V", "execute", "Lio/sentry/Breadcrumb;", RRWebBreadcrumbEvent.EVENT_TAG, ViewHierarchyConstants.HINT_KEY, "Lio/sentry/Hint;", "extractNetworkRequestDataFromHint", "Lio/sentry/util/network/NetworkRequestData;", "breadcrumbHint", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ReplayBeforeBreadcrumbCallback implements SentryOptions.BeforeBreadcrumbCallback {
        private final SentryOptions.BeforeBreadcrumbCallback delegate;

        public ReplayBeforeBreadcrumbCallback(SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
            this.delegate = beforeBreadcrumbCallback;
        }

        @Override // io.sentry.SentryOptions.BeforeBreadcrumbCallback
        public Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
            Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
            Intrinsics.checkNotNullParameter(hint, "hint");
            SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback = this.delegate;
            if (beforeBreadcrumbCallback != null) {
                breadcrumb = beforeBreadcrumbCallback.execute(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                DefaultReplayBreadcrumbConverter defaultReplayBreadcrumbConverter = DefaultReplayBreadcrumbConverter.this;
                NetworkRequestData extractNetworkRequestDataFromHint = extractNetworkRequestDataFromHint(breadcrumb, hint);
                if (extractNetworkRequestDataFromHint != null) {
                    Map map = defaultReplayBreadcrumbConverter.httpNetworkDetails;
                    Intrinsics.checkNotNullExpressionValue(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, extractNetworkRequestDataFromHint);
                }
            }
            return breadcrumb;
        }

        private final NetworkRequestData extractNetworkRequestDataFromHint(Breadcrumb breadcrumb, Hint breadcrumbHint) {
            if (!Intrinsics.areEqual(breadcrumb.getType(), "http") && !Intrinsics.areEqual(breadcrumb.getCategory(), "http")) {
                return null;
            }
            Object obj = breadcrumbHint.get(TypeCheckHint.SENTRY_REPLAY_NETWORK_DETAILS);
            if (obj instanceof NetworkRequestData) {
                return (NetworkRequestData) obj;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @Override // io.sentry.ReplayBreadcrumbConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RRWebEvent convert(Breadcrumb breadcrumb) {
        String message;
        SentryLevel level;
        Object obj;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(breadcrumb.getCategory(), "http")) {
            if (isValidForRRWebSpan(breadcrumb)) {
                return toRRWebSpanEvent(breadcrumb);
            }
            return null;
        }
        String str3 = "navigation";
        if (Intrinsics.areEqual(breadcrumb.getType(), "navigation") && Intrinsics.areEqual(breadcrumb.getCategory(), "app.lifecycle")) {
            str3 = "app." + breadcrumb.getData().get("state");
        } else if (Intrinsics.areEqual(breadcrumb.getType(), "navigation") && Intrinsics.areEqual(breadcrumb.getCategory(), "device.orientation")) {
            str3 = breadcrumb.getCategory();
            Intrinsics.checkNotNull(str3);
            Object obj2 = breadcrumb.getData().get(ViewProps.POSITION);
            if (!Intrinsics.areEqual(obj2, "landscape") && !Intrinsics.areEqual(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put(ViewProps.POSITION, obj2);
        } else if (Intrinsics.areEqual(breadcrumb.getType(), "navigation")) {
            if (Intrinsics.areEqual(breadcrumb.getData().get("state"), "resumed")) {
                Object obj3 = breadcrumb.getData().get(AnalyticsConstantsKt.KEY_SCREEN);
                String str4 = obj3 instanceof String ? (String) obj3 : null;
                if (str4 != null) {
                    str = StringsKt.substringAfterLast$default(str4, '.', (String) null, 2, (Object) null);
                    if (str != null) {
                        return null;
                    }
                    linkedHashMap.put("to", str);
                }
                str = null;
                if (str != null) {
                }
            } else {
                Map<String, Object> data = breadcrumb.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                if (data.containsKey("to")) {
                    Object obj4 = breadcrumb.getData().get("to");
                    if (obj4 instanceof String) {
                        str = (String) obj4;
                        if (str != null) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        } else {
            if (Intrinsics.areEqual(breadcrumb.getCategory(), "ui.click")) {
                Object obj5 = breadcrumb.getData().get("view.id");
                if (obj5 == null && (obj5 = breadcrumb.getData().get("view.tag")) == null) {
                    obj5 = breadcrumb.getData().get("view.class");
                }
                message = obj5 instanceof String ? (String) obj5 : null;
                if (message == null) {
                    return null;
                }
                Map<String, Object> data2 = breadcrumb.getData();
                Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
                linkedHashMap.putAll(data2);
                str3 = "ui.tap";
                level = null;
            } else if (Intrinsics.areEqual(breadcrumb.getType(), "system") && Intrinsics.areEqual(breadcrumb.getCategory(), "network.event")) {
                if (!Intrinsics.areEqual(breadcrumb.getData().get("action"), "NETWORK_LOST")) {
                    Map<String, Object> data3 = breadcrumb.getData();
                    Intrinsics.checkNotNullExpressionValue(data3, "getData(...)");
                    if (data3.containsKey("network_type")) {
                        Object obj6 = breadcrumb.getData().get("network_type");
                        String str5 = obj6 instanceof String ? (String) obj6 : null;
                        obj = (str5 == null || str5.length() == 0) ? "offline" : breadcrumb.getData().get("network_type");
                    }
                    return null;
                }
                linkedHashMap.put("state", obj);
                if (Intrinsics.areEqual(this.lastConnectivityState, linkedHashMap.get("state"))) {
                    return null;
                }
                Object obj7 = linkedHashMap.get("state");
                this.lastConnectivityState = obj7 instanceof String ? (String) obj7 : null;
                str3 = "device.connectivity";
            } else if (Intrinsics.areEqual(breadcrumb.getData().get("action"), "BATTERY_CHANGED")) {
                Map<String, Object> data4 = breadcrumb.getData();
                Intrinsics.checkNotNullExpressionValue(data4, "getData(...)");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : data4.entrySet()) {
                    String key = entry.getKey();
                    if (Intrinsics.areEqual(key, "level") || Intrinsics.areEqual(key, Device.JsonKeys.CHARGING)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
                str3 = "device.battery";
            } else {
                str3 = breadcrumb.getCategory();
                message = breadcrumb.getMessage();
                level = breadcrumb.getLevel();
                Map<String, Object> data5 = breadcrumb.getData();
                Intrinsics.checkNotNullExpressionValue(data5, "getData(...)");
                linkedHashMap.putAll(data5);
            }
            str2 = str3;
            if (str2 == null && str2.length() != 0) {
                RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
                rRWebBreadcrumbEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
                rRWebBreadcrumbEvent.setBreadcrumbTimestamp(breadcrumb.getTimestamp().getTime() / 1000.0d);
                rRWebBreadcrumbEvent.setBreadcrumbType("default");
                rRWebBreadcrumbEvent.setCategory(str3);
                rRWebBreadcrumbEvent.setMessage(message);
                rRWebBreadcrumbEvent.setLevel(level);
                rRWebBreadcrumbEvent.setData(linkedHashMap);
                return rRWebBreadcrumbEvent;
            }
        }
        message = null;
        level = null;
        str2 = str3;
        return str2 == null ? null : null;
    }

    private final boolean isValidForRRWebSpan(Breadcrumb breadcrumb) {
        Object obj = breadcrumb.getData().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map<String, Object> data = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (!data.containsKey(SpanDataConvention.HTTP_START_TIMESTAMP)) {
            return false;
        }
        Map<String, Object> data2 = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        return data2.containsKey(SpanDataConvention.HTTP_END_TIMESTAMP);
    }

    private final String snakeToCamelCase(String str) {
        return INSTANCE.getSnakecasePattern().replace(str, new Function1<MatchResult, CharSequence>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$snakeToCamelCase$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String upperCase = String.valueOf(StringsKt.last(it.getValue())).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return upperCase;
            }
        });
    }

    private final RRWebSpanEvent toRRWebSpanEvent(Breadcrumb breadcrumb) {
        double longValue;
        double longValue2;
        Object obj = breadcrumb.getData().get(SpanDataConvention.HTTP_START_TIMESTAMP);
        Object obj2 = breadcrumb.getData().get(SpanDataConvention.HTTP_END_TIMESTAMP);
        RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
        rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        rRWebSpanEvent.setOp("resource.http");
        Object obj3 = breadcrumb.getData().get("url");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        rRWebSpanEvent.setDescription((String) obj3);
        if (obj instanceof Double) {
            longValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((Long) obj).longValue();
        }
        rRWebSpanEvent.setStartTimestamp(longValue / 1000.0d);
        if (obj2 instanceof Double) {
            longValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            longValue2 = ((Long) obj2).longValue();
        }
        rRWebSpanEvent.setEndTimestamp(longValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NetworkRequestData remove = this.httpNetworkDetails.remove(breadcrumb);
        if (remove != null) {
            String method = remove.getMethod();
            if (method != null) {
                linkedHashMap.put("method", method);
            }
            Integer statusCode = remove.getStatusCode();
            if (statusCode != null) {
                linkedHashMap.put("statusCode", statusCode);
            }
            Long requestBodySize = remove.getRequestBodySize();
            if (requestBodySize != null) {
                linkedHashMap.put("requestBodySize", requestBodySize);
            }
            Long responseBodySize = remove.getResponseBodySize();
            if (responseBodySize != null) {
                linkedHashMap.put("responseBodySize", responseBodySize);
            }
            ReplayNetworkRequestOrResponse request = remove.getRequest();
            if (request != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Long size = request.getSize();
                if (size != null) {
                    linkedHashMap2.put(RRWebVideoEvent.JsonKeys.SIZE, size);
                }
                NetworkBody body = request.getBody();
                if (body != null) {
                    linkedHashMap2.put("body", body.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings = body.getWarnings();
                    if (warnings != null) {
                        Intrinsics.checkNotNull(warnings);
                        List<NetworkBody.NetworkBodyWarning> list = warnings;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((NetworkBody.NetworkBodyWarning) it.next()).getValue());
                        }
                        linkedHashMap2.put("warnings", arrayList);
                    }
                }
                Map<String, String> headers = request.getHeaders();
                Intrinsics.checkNotNullExpressionValue(headers, "getHeaders(...)");
                if (!headers.isEmpty()) {
                    linkedHashMap2.put("headers", request.getHeaders());
                }
                if (!linkedHashMap2.isEmpty()) {
                    linkedHashMap.put("request", linkedHashMap2);
                }
            }
            ReplayNetworkRequestOrResponse response = remove.getResponse();
            if (response != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Long size2 = response.getSize();
                if (size2 != null) {
                    linkedHashMap3.put(RRWebVideoEvent.JsonKeys.SIZE, size2);
                }
                NetworkBody body2 = response.getBody();
                if (body2 != null) {
                    linkedHashMap3.put("body", body2.getBody());
                    List<NetworkBody.NetworkBodyWarning> warnings2 = body2.getWarnings();
                    if (warnings2 != null) {
                        Intrinsics.checkNotNull(warnings2);
                        List<NetworkBody.NetworkBodyWarning> list2 = warnings2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((NetworkBody.NetworkBodyWarning) it2.next()).getValue());
                        }
                        linkedHashMap3.put("warnings", arrayList2);
                    }
                }
                Map<String, String> headers2 = response.getHeaders();
                Intrinsics.checkNotNullExpressionValue(headers2, "getHeaders(...)");
                if (!headers2.isEmpty()) {
                    linkedHashMap3.put("headers", response.getHeaders());
                }
                if (!linkedHashMap3.isEmpty()) {
                    linkedHashMap.put(Response.TYPE, linkedHashMap3);
                }
            }
        }
        Map<String, Object> data = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                Intrinsics.checkNotNull(key);
                linkedHashMap.put(snakeToCamelCase(StringsKt.substringAfter$default(StringsKt.replace$default(key, "content_length", "body_size", false, 4, (Object) null), ".", (String) null, 2, (Object) null)), value);
            }
        }
        rRWebSpanEvent.setData(linkedHashMap);
        return rRWebSpanEvent;
    }
}
