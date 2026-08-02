package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemWiseBannerBinding implements a {

    @NonNull
    public final ImageView backgroundImageView;

    @NonNull
    public final BadgeView badgeView;

    @NonNull
    public final ImageView labelImageView;

    @NonNull
    public final ImageView paranjaImageView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextAtomV2View titleTextView;

    @NonNull
    public final PlayerView videoView;

    private ItemWiseBannerBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull BadgeView badgeView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextAtomV2View textAtomV2View, @NonNull PlayerView playerView) {
        this.rootView = relativeLayout;
        this.backgroundImageView = imageView;
        this.badgeView = badgeView;
        this.labelImageView = imageView2;
        this.paranjaImageView = imageView3;
        this.titleTextView = textAtomV2View;
        this.videoView = playerView;
    }

    @NonNull
    public static ItemWiseBannerBinding bind(@NonNull View view) {
        int i11 = R$id.backgroundImageView;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.badgeView;
            BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
            if (badgeView != null) {
                i11 = R$id.labelImageView;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.paranjaImageView;
                    ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                    if (imageView3 != null) {
                        i11 = R$id.titleTextView;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.videoView;
                            PlayerView playerView = (PlayerView) C2548q.d(i11, view);
                            if (playerView != null) {
                                return new ItemWiseBannerBinding((RelativeLayout) view, imageView, badgeView, imageView2, imageView3, textAtomV2View, playerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemWiseBannerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_wise_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public RelativeLayout getConstraintLayout() {
        return this.rootView;
    }
}
