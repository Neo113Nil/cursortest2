package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "", "<init>", "()V", "Pause", "Resume", "VideoItemClicked", "OpenGalleyVideoItem", "UpdateVideoPosition", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$OpenGalleyVideoItem;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$Pause;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$Resume;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$UpdateVideoPosition;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$VideoItemClicked;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryAction {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$OpenGalleyVideoItem;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "item", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "position", "", "fullScreen", "", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;JZ)V", "getItem", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "getPosition", "()J", "getFullScreen", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenGalleyVideoItem extends GalleryAction {
        private final boolean fullScreen;

        @NotNull
        private final GalleryV3VO.Item item;
        private final long position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenGalleyVideoItem(@NotNull GalleryV3VO.Item item, long j11, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.position = j11;
            this.fullScreen = z11;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        @NotNull
        public final GalleryV3VO.Item getItem() {
            return this.item;
        }

        public final long getPosition() {
            return this.position;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$Pause;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "<init>", "()V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pause extends GalleryAction {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$Resume;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "<init>", "()V", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Resume extends GalleryAction {

        @NotNull
        public static final Resume INSTANCE = new Resume();

        private Resume() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$UpdateVideoPosition;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "position", "Lru/ozon/app/android/video/VideoPosition;", "<init>", "(Lru/ozon/app/android/video/VideoPosition;)V", "getPosition", "()Lru/ozon/app/android/video/VideoPosition;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateVideoPosition extends GalleryAction {
        public static final int $stable = VideoPosition.$stable;

        @NotNull
        private final VideoPosition position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateVideoPosition(@NotNull VideoPosition position) {
            super(null);
            Intrinsics.checkNotNullParameter(position, "position");
            this.position = position;
        }

        @NotNull
        public final VideoPosition getPosition() {
            return this.position;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction$VideoItemClicked;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "fullScreen", "", "<init>", "(Z)V", "getFullScreen", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VideoItemClicked extends GalleryAction {
        private final boolean fullScreen;

        public VideoItemClicked(boolean z11) {
            super(null);
            this.fullScreen = z11;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }
    }

    public /* synthetic */ GalleryAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GalleryAction() {
    }
}
