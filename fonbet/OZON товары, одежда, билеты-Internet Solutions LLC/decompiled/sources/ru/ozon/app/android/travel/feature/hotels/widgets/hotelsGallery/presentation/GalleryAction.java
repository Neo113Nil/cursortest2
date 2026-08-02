package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Kk.C3532b;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction;", "", "VideoItemClicked", "OpenGalleryVideoItem", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction$OpenGalleryVideoItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction$VideoItemClicked;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GalleryAction {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction$OpenGalleryVideoItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "item", "", "position", "", "fullScreen", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;JZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "getItem", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "J", "getPosition", "()J", "Z", "getFullScreen", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenGalleryVideoItem implements GalleryAction {
        private final AtomAction atomAction;
        private final boolean fullScreen;

        @NotNull
        private final HotelsGalleryVO.Video item;
        private final long position;

        public OpenGalleryVideoItem(@NotNull HotelsGalleryVO.Video item, long j11, boolean z11, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.position = j11;
            this.fullScreen = z11;
            this.atomAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenGalleryVideoItem)) {
                return false;
            }
            OpenGalleryVideoItem openGalleryVideoItem = (OpenGalleryVideoItem) other;
            return Intrinsics.d(this.item, openGalleryVideoItem.item) && this.position == openGalleryVideoItem.position && this.fullScreen == openGalleryVideoItem.fullScreen && Intrinsics.d(this.atomAction, openGalleryVideoItem.atomAction);
        }

        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        @NotNull
        public final HotelsGalleryVO.Video getItem() {
            return this.item;
        }

        public final long getPosition() {
            return this.position;
        }

        public int hashCode() {
            int a11 = C3532b.a(c.a(this.item.hashCode() * 31, 31, this.position), 31, this.fullScreen);
            AtomAction atomAction = this.atomAction;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "OpenGalleryVideoItem(item=" + this.item + ", position=" + this.position + ", fullScreen=" + this.fullScreen + ", atomAction=" + this.atomAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction$VideoItemClicked;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction;", "", "fullScreen", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(ZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getFullScreen", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoItemClicked implements GalleryAction {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction atomAction;
        private final boolean fullScreen;

        public VideoItemClicked(boolean z11, AtomAction atomAction) {
            this.fullScreen = z11;
            this.atomAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoItemClicked)) {
                return false;
            }
            VideoItemClicked videoItemClicked = (VideoItemClicked) other;
            return this.fullScreen == videoItemClicked.fullScreen && Intrinsics.d(this.atomAction, videoItemClicked.atomAction);
        }

        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.fullScreen) * 31;
            AtomAction atomAction = this.atomAction;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "VideoItemClicked(fullScreen=" + this.fullScreen + ", atomAction=" + this.atomAction + ")";
        }
    }
}
