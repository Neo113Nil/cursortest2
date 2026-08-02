package ru.ozon.app.android.videomolecule.presentation.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.videomolecule.R$drawable;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\"J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010)R\u0016\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "portraitOrientation", "()V", "landscapeOrientation", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "attachAdapter", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "Landroidx/media3/ui/LegacyPlayerControlView;", "getPlayerControllerView", "()Landroidx/media3/ui/LegacyPlayerControlView;", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "newWidth", "setLandscapeTimeGroupWidth", "(I)V", "orientation", "setCurrentOrientation", "Landroidx/recyclerview/widget/RecyclerView;", "getBottomContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "landScapeTimeGroupWidth", "I", "prevOrientation", "dp242", "dp118", "dp60", "dp36", "dp16", "dp14", "dp12", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/SwitchingImageView;", "modeButton", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/SwitchingImageView;", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "binding", "Lru/ozon/app/android/storefront/ui/videomolecule/databinding/VideoMoleculeBinding;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeView extends ConstraintLayout {

    @NotNull
    private final VideoMoleculeBinding binding;
    private final int dp118;
    private final int dp12;
    private final int dp14;
    private final int dp16;
    private final int dp242;
    private final int dp36;
    private final int dp60;
    private int landScapeTimeGroupWidth;
    private final SwitchingImageView modeButton;
    private int prevOrientation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void landscapeOrientation() {
        VideoMoleculeBinding videoMoleculeBinding = this.binding;
        videoMoleculeBinding.videoMoleculePlayer.setBackgroundResource(R$drawable.video_molecule_widget_bg_landscape);
        videoMoleculeBinding.videoMoleculePlayer.setFitsSystemWindows(true);
        videoMoleculeBinding.getConstraintLayout().setFitsSystemWindows(true);
        PlayerView videoMoleculePlayer = videoMoleculeBinding.videoMoleculePlayer;
        Intrinsics.checkNotNullExpressionValue(videoMoleculePlayer, "videoMoleculePlayer");
        ViewGroup.LayoutParams layoutParams = videoMoleculePlayer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        videoMoleculePlayer.setLayoutParams(layoutParams);
        View topGradient = videoMoleculeBinding.topGradient;
        Intrinsics.checkNotNullExpressionValue(topGradient, "topGradient");
        ViewExtKt.gone(topGradient);
        View bottomGradient = videoMoleculeBinding.bottomGradient;
        Intrinsics.checkNotNullExpressionValue(bottomGradient, "bottomGradient");
        ViewExtKt.show(bottomGradient);
        View bottomGradient2 = videoMoleculeBinding.bottomGradient;
        Intrinsics.checkNotNullExpressionValue(bottomGradient2, "bottomGradient");
        ViewGroup.LayoutParams layoutParams2 = bottomGradient2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) bVar).height = this.dp118;
        bottomGradient2.setLayoutParams(bVar);
        LegacyPlayerControlView playerControlsView = videoMoleculeBinding.playerControlsView;
        Intrinsics.checkNotNullExpressionValue(playerControlsView, "playerControlsView");
        int i11 = this.dp60;
        ViewExtKt.updatePadding(playerControlsView, i11, this.dp12, i11, this.dp36);
        View findViewById = findViewById(R$id.timeGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = this.landScapeTimeGroupWidth;
        findViewById.setLayoutParams(layoutParams3);
    }

    private final void portraitOrientation() {
        VideoMoleculeBinding videoMoleculeBinding = this.binding;
        videoMoleculeBinding.videoMoleculePlayer.setBackgroundResource(R$drawable.video_molecule_widget_bg_portrait);
        videoMoleculeBinding.videoMoleculePlayer.setFitsSystemWindows(false);
        videoMoleculeBinding.getConstraintLayout().setFitsSystemWindows(false);
        View topGradient = videoMoleculeBinding.topGradient;
        Intrinsics.checkNotNullExpressionValue(topGradient, "topGradient");
        ViewExtKt.show(topGradient);
        View bottomGradient = videoMoleculeBinding.bottomGradient;
        Intrinsics.checkNotNullExpressionValue(bottomGradient, "bottomGradient");
        ViewExtKt.show(bottomGradient);
        View bottomGradient2 = videoMoleculeBinding.bottomGradient;
        Intrinsics.checkNotNullExpressionValue(bottomGradient2, "bottomGradient");
        ViewGroup.LayoutParams layoutParams = bottomGradient2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = this.dp242;
        bottomGradient2.setLayoutParams(bVar);
        LegacyPlayerControlView playerControlsView = videoMoleculeBinding.playerControlsView;
        Intrinsics.checkNotNullExpressionValue(playerControlsView, "playerControlsView");
        int i11 = this.dp14;
        ViewExtKt.updatePadding(playerControlsView, i11, 0, i11, this.dp16);
        View findViewById = findViewById(R$id.timeGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -2;
        findViewById.setLayoutParams(layoutParams2);
    }

    public final void attachAdapter(@NotNull RecyclerView.g<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.binding.videoMoleculeBottomContainer.setAdapter(adapter);
    }

    @NotNull
    public final RecyclerView getBottomContainer() {
        RecyclerView videoMoleculeBottomContainer = this.binding.videoMoleculeBottomContainer;
        Intrinsics.checkNotNullExpressionValue(videoMoleculeBottomContainer, "videoMoleculeBottomContainer");
        return videoMoleculeBottomContainer;
    }

    @NotNull
    public final LegacyPlayerControlView getPlayerControllerView() {
        LegacyPlayerControlView playerControlsView = this.binding.playerControlsView;
        Intrinsics.checkNotNullExpressionValue(playerControlsView, "playerControlsView");
        return playerControlsView;
    }

    @NotNull
    public final PlayerView getPlayerView() {
        PlayerView videoMoleculePlayer = this.binding.videoMoleculePlayer;
        Intrinsics.checkNotNullExpressionValue(videoMoleculePlayer, "videoMoleculePlayer");
        return videoMoleculePlayer;
    }

    @Override // android.view.View
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            insets = getChildAt(i11).dispatchApplyWindowInsets(insets);
        }
        return insets;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig == null) {
            return;
        }
        int i11 = newConfig.orientation;
        this.prevOrientation = i11;
        if (i11 == 1) {
            portraitOrientation();
        } else {
            landscapeOrientation();
        }
    }

    public final void setCurrentOrientation(int orientation) {
        this.prevOrientation = orientation;
        SwitchingImageView switchingImageView = this.modeButton;
        if (switchingImageView != null) {
            switchingImageView.switchButton(orientation != 1);
        }
        if (this.prevOrientation == 2) {
            View findViewById = findViewById(R$id.timeGroup);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = this.landScapeTimeGroupWidth;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void setLandscapeTimeGroupWidth(int newWidth) {
        this.landScapeTimeGroupWidth = newWidth;
        if (this.prevOrientation == 2) {
            View findViewById = findViewById(R$id.timeGroup);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = this.landScapeTimeGroupWidth;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public /* synthetic */ VideoMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.landScapeTimeGroupWidth = -2;
        this.dp242 = ResourceExtKt.toPx(242, context);
        this.dp118 = ResourceExtKt.toPx(118, context);
        this.dp60 = ResourceExtKt.toPx(60, context);
        this.dp36 = ResourceExtKt.toPx(36, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp14 = ResourceExtKt.toPx(14, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        VideoMoleculeBinding inflate = VideoMoleculeBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setClipToOutline(true);
        inflate.videoMoleculePlayer.setClipToOutline(true);
        setBackgroundColor(ResourceExtKt.color(context, R$color.oz_semantic_bg_videopleer));
        inflate.videoMoleculePlayer.setBackgroundResource(R$drawable.video_molecule_widget_bg_portrait);
        View findViewById = findViewById(R$id.modeButton);
        this.modeButton = findViewById instanceof SwitchingImageView ? (SwitchingImageView) findViewById : null;
        this.prevOrientation = context.getResources().getConfiguration().orientation;
    }
}
