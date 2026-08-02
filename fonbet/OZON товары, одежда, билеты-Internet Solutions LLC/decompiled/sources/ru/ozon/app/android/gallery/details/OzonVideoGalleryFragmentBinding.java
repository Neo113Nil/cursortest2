package ru.ozon.app.android.gallery.details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.ContentLoadingProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.R$id;
import ru.ozon.app.android.gallery.R$layout;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding;", "", "root", "Landroid/view/View;", "ozonVideoMoleculeV", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "ozonVideoVolumeIv", "Landroid/widget/ImageView;", "ozonVideoPb", "Landroidx/core/widget/ContentLoadingProgressBar;", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Landroid/widget/ImageView;Landroidx/core/widget/ContentLoadingProgressBar;)V", "getRoot", "()Landroid/view/View;", "getOzonVideoMoleculeV", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "getOzonVideoVolumeIv", "()Landroid/widget/ImageView;", "getOzonVideoPb", "()Landroidx/core/widget/ContentLoadingProgressBar;", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonVideoGalleryFragmentBinding {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final VideoMoleculeApi ozonVideoMoleculeV;

    @NotNull
    private final ContentLoadingProgressBar ozonVideoPb;

    @NotNull
    private final ImageView ozonVideoVolumeIv;

    @NotNull
    private final View root;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding$Companion;", "", "<init>", "()V", "inflate", "Lru/ozon/app/android/gallery/details/OzonVideoGalleryFragmentBinding;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "attachToRoot", "", "bind", "root", "Landroid/view/View;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OzonVideoGalleryFragmentBinding bind(@NotNull View root) {
            Intrinsics.checkNotNullParameter(root, "root");
            VideoMoleculeApi videoMoleculeApi = (VideoMoleculeApi) root.findViewById(R$id.ozonVideoMoleculeV);
            View findViewById = root.findViewById(R$id.ozonVideoVolumeIv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = root.findViewById(R$id.ozonVideoPb);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            return new OzonVideoGalleryFragmentBinding(root, videoMoleculeApi, imageView, (ContentLoadingProgressBar) findViewById2, null);
        }

        @NotNull
        public final OzonVideoGalleryFragmentBinding inflate(@NotNull LayoutInflater inflater, ViewGroup parent, boolean attachToRoot) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View inflate = inflater.inflate(R$layout.fragment_gallery_ozon_video_screen_lite, parent, attachToRoot);
            Intrinsics.f(inflate);
            return bind(inflate);
        }

        private Companion() {
        }
    }

    public /* synthetic */ OzonVideoGalleryFragmentBinding(View view, VideoMoleculeApi videoMoleculeApi, ImageView imageView, ContentLoadingProgressBar contentLoadingProgressBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, videoMoleculeApi, imageView, contentLoadingProgressBar);
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

    private OzonVideoGalleryFragmentBinding(View view, VideoMoleculeApi videoMoleculeApi, ImageView imageView, ContentLoadingProgressBar contentLoadingProgressBar) {
        this.root = view;
        this.ozonVideoMoleculeV = videoMoleculeApi;
        this.ozonVideoVolumeIv = imageView;
        this.ozonVideoPb = contentLoadingProgressBar;
    }
}
