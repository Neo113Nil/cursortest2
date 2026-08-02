package ru.ozon.app.android.ads.data.pixel.presentation;

import Xc.a;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", "action", "", ImagesContract.URL, "<init>", "(Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", "getAction", "()Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", "Ljava/lang/String;", "getUrl", "ActionType", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Pixel {

    @NotNull
    private final ActionType action;

    @NotNull
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", FraudMonInfo.UNKNOWN, "VIDEO_START", "VIDEO_VIEWABLE_IMPRESSIONS", "VIDEO_CLICK", "CLICK", "VIEW", "IMPRESSION", "Companion", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final ActionType UNKNOWN = new ActionType(FraudMonInfo.UNKNOWN, 0, FraudMonInfo.UNKNOWN);
        public static final ActionType VIDEO_START = new ActionType("VIDEO_START", 1, "VideoStart");
        public static final ActionType VIDEO_VIEWABLE_IMPRESSIONS = new ActionType("VIDEO_VIEWABLE_IMPRESSIONS", 2, "VideoViewableImpressions");
        public static final ActionType VIDEO_CLICK = new ActionType("VIDEO_CLICK", 3, "VideoClick");
        public static final ActionType CLICK = new ActionType("CLICK", 4, "Click");
        public static final ActionType VIEW = new ActionType("VIEW", 5, "View");
        public static final ActionType IMPRESSION = new ActionType("IMPRESSION", 6, "Impression");

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType$Companion;", "", "<init>", "()V", "stringToVoActionType", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel$ActionType;", "actionTypeString", "", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionType stringToVoActionType(@NotNull String actionTypeString) {
                ActionType actionType;
                Intrinsics.checkNotNullParameter(actionTypeString, "actionTypeString");
                ActionType[] values = ActionType.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        actionType = null;
                        break;
                    }
                    actionType = values[i11];
                    if (h.D(actionType.getValue(), actionTypeString, true)) {
                        break;
                    }
                    i11++;
                }
                return actionType == null ? ActionType.UNKNOWN : actionType;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{UNKNOWN, VIDEO_START, VIDEO_VIEWABLE_IMPRESSIONS, VIDEO_CLICK, CLICK, VIEW, IMPRESSION};
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private ActionType(String str, int i11, String str2) {
            this.value = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public Pixel(@NotNull ActionType action, @NotNull String url) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(url, "url");
        this.action = action;
        this.url = url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pixel)) {
            return false;
        }
        Pixel pixel = (Pixel) other;
        return this.action == pixel.action && Intrinsics.d(this.url, pixel.url);
    }

    @NotNull
    public final ActionType getAction() {
        return this.action;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.action.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Pixel(action=" + this.action + ", url=" + this.url + ")";
    }
}
