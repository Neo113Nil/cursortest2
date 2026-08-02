package ru.ozon.app.android.favorites.data.api;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse;", "", "trackingInfo", "Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo;", "<init>", "(Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo;)V", "getTrackingInfo", "()Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrackingInfo", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeFavoriteStateResponse {
    private final TrackingInfo trackingInfo;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo;", "", "composerAction", "Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo$ComposerAction;", "<init>", "(Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo$ComposerAction;)V", "getComposerAction", "()Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo$ComposerAction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ComposerAction", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TrackingInfo {

        @NotNull
        private final ComposerAction composerAction;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/favorites/data/api/ChangeFavoriteStateResponse$TrackingInfo$ComposerAction;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getPayload", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ComposerAction {

            @NotNull
            private final String actionType;

            @NotNull
            private final String payload;

            public ComposerAction(@NotNull String actionType, @NotNull String payload) {
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(payload, "payload");
                this.actionType = actionType;
                this.payload = payload;
            }

            public static /* synthetic */ ComposerAction copy$default(ComposerAction composerAction, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = composerAction.actionType;
                }
                if ((i11 & 2) != 0) {
                    str2 = composerAction.payload;
                }
                return composerAction.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getActionType() {
                return this.actionType;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPayload() {
                return this.payload;
            }

            @NotNull
            public final ComposerAction copy(@NotNull String actionType, @NotNull String payload) {
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(payload, "payload");
                return new ComposerAction(actionType, payload);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ComposerAction)) {
                    return false;
                }
                ComposerAction composerAction = (ComposerAction) other;
                return Intrinsics.d(this.actionType, composerAction.actionType) && Intrinsics.d(this.payload, composerAction.payload);
            }

            @NotNull
            public final String getActionType() {
                return this.actionType;
            }

            @NotNull
            public final String getPayload() {
                return this.payload;
            }

            public int hashCode() {
                return this.payload.hashCode() + (this.actionType.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("ComposerAction(actionType=", this.actionType, ", payload=", this.payload, ")");
            }
        }

        public TrackingInfo(@NotNull ComposerAction composerAction) {
            Intrinsics.checkNotNullParameter(composerAction, "composerAction");
            this.composerAction = composerAction;
        }

        public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, ComposerAction composerAction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                composerAction = trackingInfo.composerAction;
            }
            return trackingInfo.copy(composerAction);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ComposerAction getComposerAction() {
            return this.composerAction;
        }

        @NotNull
        public final TrackingInfo copy(@NotNull ComposerAction composerAction) {
            Intrinsics.checkNotNullParameter(composerAction, "composerAction");
            return new TrackingInfo(composerAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrackingInfo) && Intrinsics.d(this.composerAction, ((TrackingInfo) other).composerAction);
        }

        @NotNull
        public final ComposerAction getComposerAction() {
            return this.composerAction;
        }

        public int hashCode() {
            return this.composerAction.hashCode();
        }

        @NotNull
        public String toString() {
            return "TrackingInfo(composerAction=" + this.composerAction + ")";
        }
    }

    public ChangeFavoriteStateResponse(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ ChangeFavoriteStateResponse copy$default(ChangeFavoriteStateResponse changeFavoriteStateResponse, TrackingInfo trackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            trackingInfo = changeFavoriteStateResponse.trackingInfo;
        }
        return changeFavoriteStateResponse.copy(trackingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final ChangeFavoriteStateResponse copy(TrackingInfo trackingInfo) {
        return new ChangeFavoriteStateResponse(trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChangeFavoriteStateResponse) && Intrinsics.d(this.trackingInfo, ((ChangeFavoriteStateResponse) other).trackingInfo);
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TrackingInfo trackingInfo = this.trackingInfo;
        if (trackingInfo == null) {
            return 0;
        }
        return trackingInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChangeFavoriteStateResponse(trackingInfo=" + this.trackingInfo + ")";
    }
}
