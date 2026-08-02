package ru.ozon.app.android.domain.tiles.dislike.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;", "", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "getDislikeId", "()Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "Disliked", "Failure", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult$Disliked;", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult$Failure;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DislikeResult {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult$Disliked;", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "<init>", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "getDislikeId", "()Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disliked implements DislikeResult {

        @NotNull
        private final TileDislikeId dislikeId;
        private final NotificationDTO notificationDTO;

        public Disliked(@NotNull TileDislikeId dislikeId, NotificationDTO notificationDTO) {
            Intrinsics.checkNotNullParameter(dislikeId, "dislikeId");
            this.dislikeId = dislikeId;
            this.notificationDTO = notificationDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disliked)) {
                return false;
            }
            Disliked disliked = (Disliked) other;
            return Intrinsics.d(this.dislikeId, disliked.dislikeId) && Intrinsics.d(this.notificationDTO, disliked.notificationDTO);
        }

        @Override // ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult
        @NotNull
        public TileDislikeId getDislikeId() {
            return this.dislikeId;
        }

        public NotificationDTO getNotificationDTO() {
            return this.notificationDTO;
        }

        public int hashCode() {
            int hashCode = this.dislikeId.hashCode() * 31;
            NotificationDTO notificationDTO = this.notificationDTO;
            return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Disliked(dislikeId=" + this.dislikeId + ", notificationDTO=" + this.notificationDTO + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult$Failure;", "Lru/ozon/app/android/domain/tiles/dislike/model/DislikeResult;", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "dislikeId", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "<init>", "(Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "getDislikeId", "()Lru/ozon/app/android/domain/tiles/dislike/model/TileDislikeId;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements DislikeResult {

        @NotNull
        private final TileDislikeId dislikeId;
        private final NotificationDTO notificationDTO;

        public Failure(@NotNull TileDislikeId dislikeId, NotificationDTO notificationDTO) {
            Intrinsics.checkNotNullParameter(dislikeId, "dislikeId");
            this.dislikeId = dislikeId;
            this.notificationDTO = notificationDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.d(this.dislikeId, failure.dislikeId) && Intrinsics.d(this.notificationDTO, failure.notificationDTO);
        }

        @Override // ru.ozon.app.android.domain.tiles.dislike.model.DislikeResult
        @NotNull
        public TileDislikeId getDislikeId() {
            return this.dislikeId;
        }

        public NotificationDTO getNotificationDTO() {
            return this.notificationDTO;
        }

        public int hashCode() {
            int hashCode = this.dislikeId.hashCode() * 31;
            NotificationDTO notificationDTO = this.notificationDTO;
            return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(dislikeId=" + this.dislikeId + ", notificationDTO=" + this.notificationDTO + ")";
        }
    }

    @NotNull
    TileDislikeId getDislikeId();
}
