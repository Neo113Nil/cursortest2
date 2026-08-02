package ru.ozon.app.android.inapppush.presentation;

import ei0.InterfaceC6369b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import zd0.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f*\u00060\u0004j\u0002`\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/InAppPushAnalyticsManager;", "", "Lei0/b;", "tracker", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lei0/b;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "key", "", "trackKey", "(Ljava/lang/String;)V", "json", "", "fromJsonSafely", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/util/Map;", "Lzd0/c$c;", "trackingInfo", "trackCLick", "(Ljava/util/Map;)V", "trackShow", "Lei0/b;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppPushAnalyticsManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final InterfaceC6369b tracker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/InAppPushAnalyticsManager$Companion;", "", "<init>", "()V", "CLICK_ACTION_TYPE", "", "SHOW_ACTION_TYPE", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InAppPushAnalyticsManager(@NotNull InterfaceC6369b tracker, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.tracker = tracker;
        this.jsonDeserializer = jsonDeserializer;
    }

    private final Map<String, Object> fromJsonSafely(JsonParser jsonParser, String str) {
        try {
            return (Map) jsonParser.fromJson(str, Map.class);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private final void trackKey(String key) {
        Map<String, ? extends Object> fromJsonSafely = fromJsonSafely(this.jsonDeserializer, key);
        if (fromJsonSafely == null) {
            return;
        }
        this.tracker.sendCustomEvent(null, fromJsonSafely);
    }

    public final void trackCLick(Map<String, c.C2348c> trackingInfo) {
        c.C2348c c2348c;
        String a11;
        if (trackingInfo == null || (c2348c = trackingInfo.get("click")) == null || (a11 = c2348c.a()) == null) {
            return;
        }
        trackKey(a11);
    }

    public final void trackShow(@NotNull Map<String, c.C2348c> trackingInfo) {
        String a11;
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        c.C2348c c2348c = trackingInfo.get("view");
        if (c2348c == null || (a11 = c2348c.a()) == null) {
            return;
        }
        trackKey(a11);
    }
}
