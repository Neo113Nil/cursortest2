package ru.ozon.app.android.pdpvideomolecule.presentation.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdpvideomolecule.R$drawable;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.R$styleable;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "portraitOrientation", "()V", "landscapeOrientation", "newTimeGroupWidth", "setTimeGroupWidth", "(I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "newWidth", "setLandscapeTimeGroupWidth", "orientation", "setCurrentOrientation", "", "enableRoundCorners", "applyResize", "setConfig", "(ZZ)V", "landScapeTimeGroupWidth", "I", "prevOrientation", "Z", "Landroidx/constraintlayout/widget/d;", "prevConstraintSet", "Landroidx/constraintlayout/widget/d;", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "modeButton", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "Landroid/view/View;", "timeGroup", "Landroid/view/View;", "isCompactControls", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "getBinding", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeView extends ConstraintLayout implements VideoMoleculeApi {
    private boolean applyResize;

    @NotNull
    private final PdpVideoMoleculeBinding binding;
    private boolean isCompactControls;
    private int landScapeTimeGroupWidth;
    private final SwitchingImageView modeButton;

    @NotNull
    private d prevConstraintSet;
    private int prevOrientation;
    private final View timeGroup;

    public /* synthetic */ VideoMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void landscapeOrientation() {
        PdpVideoMoleculeBinding binding = getBinding();
        binding.getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_landscape);
        ViewExtKt.gone(binding.getTopGradient());
        ViewExtKt.show(binding.getBottomGradient());
        View bottomGradient = binding.getBottomGradient();
        ViewGroup.LayoutParams layoutParams = bottomGradient.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).height = dimens.getDP_118();
        bottomGradient.setLayoutParams(bVar);
        this.prevConstraintSet.p(this);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, binding.getReplayContainer());
        RewindableView rewindContainer = binding.getRewindContainer();
        VideoMoleculeRewindView videoMoleculeRewindView = rewindContainer instanceof VideoMoleculeRewindView ? (VideoMoleculeRewindView) rewindContainer : null;
        if (videoMoleculeRewindView != null) {
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, videoMoleculeRewindView);
        }
        dVar.f(this);
        ViewExtKt.updatePadding(binding.getPlayerControlsView(), dimens.getDP_60(), 0, dimens.getDP_60(), (binding.getPlayerControlsView().getHeight() - dimens.getDP_4()) + (dimens.getDP_36() * 2));
        binding.getVideoMoleculePlayer().C(0);
        PlayerView videoMoleculePlayer = binding.getVideoMoleculePlayer();
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        videoMoleculePlayer.setLayoutParams(bVar2);
        setTimeGroupWidth(this.landScapeTimeGroupWidth);
    }

    private final void portraitOrientation() {
        PdpVideoMoleculeBinding binding = getBinding();
        binding.getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_portrait);
        if (this.applyResize) {
            getBinding().getVideoMoleculePlayer().C(4);
        }
        ViewExtKt.show(binding.getTopGradient());
        ViewExtKt.show(binding.getBottomGradient());
        View bottomGradient = binding.getBottomGradient();
        ViewGroup.LayoutParams layoutParams = bottomGradient.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).height = dimens.getDP_242();
        bottomGradient.setLayoutParams(bVar);
        ViewExtKt.updatePadding(binding.getPlayerControlsView(), dimens.getDP_14(), dimens.getDP_4(), dimens.getDP_14(), 0);
        int visibility = binding.getReplayContainer().getVisibility();
        this.prevConstraintSet.f(this);
        binding.getReplayContainer().setVisibility(visibility);
        setTimeGroupWidth(-2);
    }

    private final void setTimeGroupWidth(int newTimeGroupWidth) {
        View view = this.timeGroup;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = newTimeGroupWidth;
            view.setLayoutParams(bVar);
        }
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    @NotNull
    public PdpVideoMoleculeBinding getBinding() {
        return this.binding;
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    @NotNull
    public LegacyPlayerControlView getPlayerControllerView() {
        return VideoMoleculeApi.DefaultImpls.getPlayerControllerView(this);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    @NotNull
    public PlayerView getPlayerView() {
        return VideoMoleculeApi.DefaultImpls.getPlayerView(this);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig == null) {
            return;
        }
        setCurrentOrientation(newConfig.orientation);
        if (newConfig.orientation == 1) {
            portraitOrientation();
        } else {
            landscapeOrientation();
        }
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    public void setConfig(boolean enableRoundCorners, boolean applyResize) {
        this.applyResize = applyResize;
        getBinding().getVideoMoleculePlayer().C(applyResize ? 4 : 0);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    public void setCurrentOrientation(int orientation) {
        this.prevOrientation = orientation;
        SwitchingImageView switchingImageView = this.modeButton;
        if (switchingImageView != null) {
            switchingImageView.switchButton(orientation != 1);
        }
        if (this.prevOrientation == 2) {
            setTimeGroupWidth(this.landScapeTimeGroupWidth);
        }
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi
    public void setLandscapeTimeGroupWidth(int newWidth) {
        this.landScapeTimeGroupWidth = newWidth;
        if (this.prevOrientation == 2) {
            setTimeGroupWidth(newWidth);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.landScapeTimeGroupWidth = -2;
        this.prevConstraintSet = new d();
        int[] PdpVideoMoleculeView = R$styleable.PdpVideoMoleculeView;
        Intrinsics.checkNotNullExpressionValue(PdpVideoMoleculeView, "PdpVideoMoleculeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PdpVideoMoleculeView, 0, 0);
        this.isCompactControls = obtainStyledAttributes.getBoolean(R$styleable.PdpVideoMoleculeView_compact_controls, false);
        obtainStyledAttributes.recycle();
        PdpVideoMoleculeBinding.Companion companion = PdpVideoMoleculeBinding.INSTANCE;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        this.binding = companion.inflate(from, this, this.isCompactControls);
        setClipToOutline(true);
        getBinding().getVideoMoleculePlayer().setClipToOutline(true);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicDarkKey));
        getBinding().getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_portrait);
        View findViewById = findViewById(R$id.modeButton);
        this.modeButton = findViewById instanceof SwitchingImageView ? (SwitchingImageView) findViewById : null;
        this.timeGroup = findViewById(R$id.timeGroup);
        this.prevOrientation = context.getResources().getConfiguration().orientation;
    }
}
