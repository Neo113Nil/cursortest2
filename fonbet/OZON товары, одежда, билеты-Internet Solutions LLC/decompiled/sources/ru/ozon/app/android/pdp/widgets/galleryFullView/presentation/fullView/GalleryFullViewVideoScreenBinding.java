package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.core.widget.ContentLoadingProgressBar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding;", "", "Landroid/widget/ImageView;", "videoBackgroundIv", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "ozonVideoMoleculeV", "ozonVideoVolumeIv", "Landroidx/core/widget/ContentLoadingProgressBar;", "ozonVideoPb", "Landroid/view/View;", "root", "<init>", "(Landroid/widget/ImageView;Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Landroid/widget/ImageView;Landroidx/core/widget/ContentLoadingProgressBar;Landroid/view/View;)V", "Landroid/widget/ImageView;", "getVideoBackgroundIv", "()Landroid/widget/ImageView;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "getOzonVideoMoleculeV", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "getOzonVideoVolumeIv", "Landroidx/core/widget/ContentLoadingProgressBar;", "getOzonVideoPb", "()Landroidx/core/widget/ContentLoadingProgressBar;", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewVideoScreenBinding {

    @NotNull
    private final VideoMoleculeApi ozonVideoMoleculeV;

    @NotNull
    private final ContentLoadingProgressBar ozonVideoPb;

    @NotNull
    private final ImageView ozonVideoVolumeIv;

    @NotNull
    private final View root;

    @NotNull
    private final ImageView videoBackgroundIv;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding$Companion;", "", "<init>", "()V", "videoBackgroundId", "", "getVideoBackgroundId", "()I", "ozonVideoMoleculeId", "getOzonVideoMoleculeId", "ozonVideoVolumeId", "getOzonVideoVolumeId", "ozonVideoId", "getOzonVideoId", "inflate", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/GalleryFullViewVideoScreenBinding;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "bind", "root", "Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getOzonVideoId() {
            return R$id.ozonVideoPb;
        }

        private final int getOzonVideoMoleculeId() {
            return R$id.ozonVideoMoleculeV;
        }

        private final int getOzonVideoVolumeId() {
            return R$id.ozonVideoVolumeIv;
        }

        private final int getVideoBackgroundId() {
            return R$id.videoBackgroundIv;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final GalleryFullViewVideoScreenBinding bind(@NotNull View root) {
            VideoMoleculeApi videoMoleculeApi;
            ImageView imageView;
            ContentLoadingProgressBar contentLoadingProgressBar;
            Intrinsics.checkNotNullParameter(root, "root");
            ImageView imageView2 = null;
            ViewGroup viewGroup = root instanceof ViewGroup ? (ViewGroup) root : null;
            if (viewGroup != null) {
                Iterator<View> it = C5316f0.b(viewGroup).iterator();
                videoMoleculeApi = null;
                imageView = null;
                contentLoadingProgressBar = null;
                while (true) {
                    C5314e0 c5314e0 = (C5314e0) it;
                    if (!c5314e0.hasNext()) {
                        break;
                    }
                    View view = (View) c5314e0.next();
                    int id2 = view.getId();
                    Companion companion = GalleryFullViewVideoScreenBinding.INSTANCE;
                    if (id2 == companion.getVideoBackgroundId()) {
                        imageView2 = (ImageView) view;
                    } else if (id2 == companion.getOzonVideoMoleculeId()) {
                        videoMoleculeApi = (VideoMoleculeApi) view;
                    } else if (id2 == companion.getOzonVideoVolumeId()) {
                        imageView = (ImageView) view;
                    } else if (id2 == companion.getOzonVideoId()) {
                        contentLoadingProgressBar = (ContentLoadingProgressBar) view;
                    }
                }
            } else {
                videoMoleculeApi = null;
                imageView = null;
                contentLoadingProgressBar = null;
            }
            if (imageView2 == null) {
                View findViewById = root.findViewById(getVideoBackgroundId());
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                imageView2 = (ImageView) findViewById;
            }
            ImageView imageView3 = imageView2;
            if (videoMoleculeApi == null) {
                videoMoleculeApi = (VideoMoleculeApi) root.findViewById(getOzonVideoMoleculeId());
            }
            VideoMoleculeApi videoMoleculeApi2 = videoMoleculeApi;
            if (imageView == null) {
                View findViewById2 = root.findViewById(getOzonVideoVolumeId());
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                imageView = (ImageView) findViewById2;
            }
            ImageView imageView4 = imageView;
            if (contentLoadingProgressBar == null) {
                View findViewById3 = root.findViewById(getOzonVideoId());
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                contentLoadingProgressBar = (ContentLoadingProgressBar) findViewById3;
            }
            return new GalleryFullViewVideoScreenBinding(imageView3, videoMoleculeApi2, imageView4, contentLoadingProgressBar, root, null);
        }

        @NotNull
        public final GalleryFullViewVideoScreenBinding inflate(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = inflater.inflate(R$layout.item_gallery_full_view_video_screen_lite, parent, false);
            Intrinsics.f(inflate);
            return bind(inflate);
        }

        private Companion() {
        }
    }

    public /* synthetic */ GalleryFullViewVideoScreenBinding(ImageView imageView, VideoMoleculeApi videoMoleculeApi, ImageView imageView2, ContentLoadingProgressBar contentLoadingProgressBar, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, videoMoleculeApi, imageView2, contentLoadingProgressBar, view);
    }

    @NotNull
    public final VideoMoleculeApi getOzonVideoMoleculeV() {
        return this.ozonVideoMoleculeV;
    }

    @NotNull
    public final ContentLoadingProgressBar getOzonVideoPb() {
        return this.ozonVideoPb;
    }

    @NotNull
    public final ImageView getOzonVideoVolumeIv() {
        return this.ozonVideoVolumeIv;
    }

    @NotNull
    public final View getRoot() {
        return this.root;
    }

    private GalleryFullViewVideoScreenBinding(ImageView imageView, VideoMoleculeApi videoMoleculeApi, ImageView imageView2, ContentLoadingProgressBar contentLoadingProgressBar, View view) {
        this.videoBackgroundIv = imageView;
        this.ozonVideoMoleculeV = videoMoleculeApi;
        this.ozonVideoVolumeIv = imageView2;
        this.ozonVideoPb = contentLoadingProgressBar;
        this.root = view;
    }
}
