package io.sentry.android.replay;

import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.sentry.Breadcrumb;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.SentryLevel;
import io.sentry.SpanDataConvention;
import io.sentry.protocol.Device;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: DefaultReplayBreadcrumbConverter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\bH\u0002J\f\u0010\u000b\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\f\u001a\u00020\r*\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;", "Lio/sentry/ReplayBreadcrumbConverter;", "()V", "lastConnectivityState", "", "convert", "Lio/sentry/rrweb/RRWebEvent;", RRWebBreadcrumbEvent.EVENT_TAG, "Lio/sentry/Breadcrumb;", "isValidForRRWebSpan", "", "snakeToCamelCase", "toRRWebSpanEvent", "Lio/sentry/rrweb/RRWebSpanEvent;", k.M, "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final HashSet<String> supportedNetworkData;
    private String lastConnectivityState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<Regex> snakecasePattern$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Regex>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2
        @Override // kotlin.jvm.functions.Function0
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    });

    /* compiled from: DefaultReplayBreadcrumbConverter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$Companion;", "", "()V", "snakecasePattern", "Lkotlin/text/Regex;", "getSnakecasePattern", "()Lkotlin/text/Regex;", "snakecasePattern$delegate", "Lkotlin/Lazy;", "supportedNetworkData", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        hashSet.add(Response.JsonKeys.STATUS_CODE);
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(SpanDataConvention.HTTP_RESPONSE_CONTENT_LENGTH_KEY);
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
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
        String type = breadcrumb.getType();
        String str3 = NotificationCompat.CATEGORY_NAVIGATION;
        if (Intrinsics.areEqual(type, NotificationCompat.CATEGORY_NAVIGATION) && Intrinsics.areEqual(breadcrumb.getCategory(), "app.lifecycle")) {
            str3 = "app." + breadcrumb.getData().get("state");
        } else if (Intrinsics.areEqual(breadcrumb.getType(), NotificationCompat.CATEGORY_NAVIGATION) && Intrinsics.areEqual(breadcrumb.getCategory(), "device.orientation")) {
            str3 = breadcrumb.getCategory();
            Intrinsics.checkNotNull(str3);
            Object obj2 = breadcrumb.getData().get(X3.i.L);
            if (!Intrinsics.areEqual(obj2, X3.i.C) && !Intrinsics.areEqual(obj2, X3.i.D)) {
                return null;
            }
            linkedHashMap.put(X3.i.L, obj2);
        } else if (Intrinsics.areEqual(breadcrumb.getType(), NotificationCompat.CATEGORY_NAVIGATION)) {
            if (Intrinsics.areEqual(breadcrumb.getData().get("state"), "resumed")) {
                Object obj3 = breadcrumb.getData().get("screen");
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
                Intrinsics.checkNotNullExpressionValue(data, "breadcrumb.data");
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
                Intrinsics.checkNotNullExpressionValue(data2, "breadcrumb.data");
                linkedHashMap.putAll(data2);
                str3 = "ui.tap";
                level = null;
            } else if (Intrinsics.areEqual(breadcrumb.getType(), "system") && Intrinsics.areEqual(breadcrumb.getCategory(), "network.event")) {
                if (!Intrinsics.areEqual(breadcrumb.getData().get("action"), "NETWORK_LOST")) {
                    Map<String, Object> data3 = breadcrumb.getData();
                    Intrinsics.checkNotNullExpressionValue(data3, "breadcrumb.data");
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
                Intrinsics.checkNotNullExpressionValue(data4, "breadcrumb.data");
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
                Intrinsics.checkNotNullExpressionValue(data5, "breadcrumb.data");
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
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!data.containsKey(SpanDataConvention.HTTP_START_TIMESTAMP)) {
            return false;
        }
        Map<String, Object> data2 = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data2, "data");
        return data2.containsKey(SpanDataConvention.HTTP_END_TIMESTAMP);
    }

    private final String snakeToCamelCase(String str) {
        return INSTANCE.getSnakecasePattern().replace(str, new Function1<MatchResult, CharSequence>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$snakeToCamelCase$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String valueOf = String.valueOf(StringsKt.last(it.getValue()));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
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
        Map<String, Object> data = breadcrumb.getData();
        Intrinsics.checkNotNullExpressionValue(data, "breadcrumb.data");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(snakeToCamelCase(StringsKt.substringAfter$default(StringsKt.replace$default(key, "content_length", "body_size", false, 4, (Object) null), ".", (String) null, 2, (Object) null)), value);
            }
        }
        rRWebSpanEvent.setData(linkedHashMap);
        return rRWebSpanEvent;
    }
}
