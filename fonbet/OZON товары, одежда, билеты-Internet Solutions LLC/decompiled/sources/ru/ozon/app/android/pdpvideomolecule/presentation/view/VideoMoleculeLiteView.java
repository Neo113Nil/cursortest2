package ru.ozon.app.android.pdpvideomolecule.presentation.view;

import Sc.InterfaceC4008j;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdpvideomolecule.R$drawable;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.utils.PdpVideoMoleculeBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u001dJ\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0017R\u001b\u0010;\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010\u0017R\u001b\u0010>\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u0017R\u001b\u0010A\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010\u0017R\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeLiteView;", "Landroid/widget/RelativeLayout;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "portraitOrientation", "()V", "landscapeOrientation", "showRoundCorners", "hideRoundCorners", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeLiteView$Corner;", "corner", "getCornerDrawable", "(Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeLiteView$Corner;)I", "Landroid/view/View;", "createTopLeftCornerView", "()Landroid/view/View;", "createTopRightCornerView", "createBottomLeftCornerView", "createBottomRightCornerView", "newTimeGroupWidth", "setTimeGroupWidth", "(I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "newWidth", "setLandscapeTimeGroupWidth", "orientation", "setCurrentOrientation", "", "enableRoundCorners", "applyResize", "setConfig", "(ZZ)V", "landScapeTimeGroupWidth", "I", "prevOrientation", "roundCornersEnabled", "Z", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "modeButton", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "timeGroup", "Landroid/view/View;", "topLeftCornerView$delegate", "LSc/j;", "getTopLeftCornerView", "topLeftCornerView", "topRightCornerView$delegate", "getTopRightCornerView", "topRightCornerView", "bottomLeftCornerView$delegate", "getBottomLeftCornerView", "bottomLeftCornerView", "bottomRightCornerView$delegate", "getBottomRightCornerView", "bottomRightCornerView", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "binding", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "getBinding", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "Corner", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeLiteView extends RelativeLayout implements VideoMoleculeApi {

    @NotNull
    private final PdpVideoMoleculeBinding binding;

    /* renamed from: bottomLeftCornerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomLeftCornerView;

    /* renamed from: bottomRightCornerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomRightCornerView;
    private int landScapeTimeGroupWidth;
    private final SwitchingImageView modeButton;
    private int prevOrientation;
    private boolean roundCornersEnabled;
    private final View timeGroup;

    /* renamed from: topLeftCornerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topLeftCornerView;

    /* renamed from: topRightCornerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRightCornerView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeLiteView$Corner;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Corner {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Corner[] $VALUES;
        public static final Corner TOP_LEFT = new Corner("TOP_LEFT", 0);
        public static final Corner TOP_RIGHT = new Corner("TOP_RIGHT", 1);
        public static final Corner BOTTOM_LEFT = new Corner("BOTTOM_LEFT", 2);
        public static final Corner BOTTOM_RIGHT = new Corner("BOTTOM_RIGHT", 3);

        private static final /* synthetic */ Corner[] $values() {
            return new Corner[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        }

        static {
            Corner[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Corner(String str, int i11) {
        }

        public static Corner valueOf(String str) {
            return (Corner) Enum.valueOf(Corner.class, str);
        }

        public static Corner[] values() {
            return (Corner[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Corner.values().length];
            try {
                iArr[Corner.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Corner.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Corner.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Corner.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeLiteView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createBottomLeftCornerView() {
        View view = new View(getContext());
        Dimens dimens = Dimens.INSTANCE;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimens.getDP_28(), dimens.getDP_28());
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        view.setLayoutParams(layoutParams);
        view.setBackground(C7232a.a(view.getContext(), getCornerDrawable(Corner.BOTTOM_LEFT)));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createBottomRightCornerView() {
        View view = new View(getContext());
        Dimens dimens = Dimens.INSTANCE;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimens.getDP_28(), dimens.getDP_28());
        layoutParams.addRule(12);
        layoutParams.addRule(21);
        view.setLayoutParams(layoutParams);
        view.setBackground(C7232a.a(view.getContext(), getCornerDrawable(Corner.BOTTOM_RIGHT)));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createTopLeftCornerView() {
        View view = new View(getContext());
        Dimens dimens = Dimens.INSTANCE;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimens.getDP_28(), dimens.getDP_28());
        layoutParams.addRule(10);
        layoutParams.addRule(20);
        view.setLayoutParams(layoutParams);
        view.setBackground(C7232a.a(view.getContext(), getCornerDrawable(Corner.TOP_LEFT)));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createTopRightCornerView() {
        View view = new View(getContext());
        Dimens dimens = Dimens.INSTANCE;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimens.getDP_28(), dimens.getDP_28());
        layoutParams.addRule(10);
        layoutParams.addRule(21);
        view.setLayoutParams(layoutParams);
        view.setBackground(C7232a.a(view.getContext(), getCornerDrawable(Corner.TOP_RIGHT)));
        return view;
    }

    private final View getBottomLeftCornerView() {
        return (View) this.bottomLeftCornerView.getValue();
    }

    private final View getBottomRightCornerView() {
        return (View) this.bottomRightCornerView.getValue();
    }

    private final int getCornerDrawable(Corner corner) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[corner.ordinal()];
        if (i11 == 1) {
            return R$drawable.pdp_video_molecule_corner_top_left;
        }
        if (i11 == 2) {
            return R$drawable.pdp_video_molecule_corner_top_right;
        }
        if (i11 == 3) {
            return R$drawable.pdp_video_molecule_corner_bottom_left;
        }
        if (i11 == 4) {
            return R$drawable.pdp_video_molecule_corner_bottom_right;
        }
        throw new o();
    }

    private final View getTopLeftCornerView() {
        return (View) this.topLeftCornerView.getValue();
    }

    private final View getTopRightCornerView() {
        return (View) this.topRightCornerView.getValue();
    }

    private final void hideRoundCorners() {
        ViewExtKt.gone(getTopLeftCornerView());
        ViewExtKt.gone(getTopRightCornerView());
        ViewExtKt.gone(getBottomLeftCornerView());
        ViewExtKt.gone(getBottomRightCornerView());
    }

    private final void landscapeOrientation() {
        PdpVideoMoleculeBinding binding = getBinding();
        binding.getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_landscape);
        if (this.roundCornersEnabled) {
            hideRoundCorners();
        }
        ViewExtKt.gone(binding.getTopGradient());
        ViewExtKt.show(binding.getBottomGradient());
        View bottomGradient = binding.getBottomGradient();
        ViewGroup.LayoutParams layoutParams = bottomGradient.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.height = dimens.getDP_118();
        bottomGradient.setLayoutParams(layoutParams2);
        ViewExtKt.updatePadding(binding.getPlayerControlsView(), dimens.getDP_60(), dimens.getDP_12(), dimens.getDP_60(), dimens.getDP_36());
        setTimeGroupWidth(this.landScapeTimeGroupWidth);
    }

    private final void portraitOrientation() {
        PdpVideoMoleculeBinding binding = getBinding();
        if (this.roundCornersEnabled) {
            showRoundCorners();
        } else {
            binding.getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_portrait);
        }
        ViewExtKt.show(binding.getTopGradient());
        ViewExtKt.show(binding.getBottomGradient());
        View bottomGradient = binding.getBottomGradient();
        ViewGroup.LayoutParams layoutParams = bottomGradient.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.height = dimens.getDP_242();
        bottomGradient.setLayoutParams(layoutParams2);
        ViewExtKt.updatePadding(binding.getPlayerControlsView(), dimens.getDP_14(), 0, dimens.getDP_14(), dimens.getDP_16());
        setTimeGroupWidth(-2);
    }

    private final void setTimeGroupWidth(int newTimeGroupWidth) {
        View view = this.timeGroup;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = newTimeGroupWidth;
            view.setLayoutParams(layoutParams);
        }
    }

    private final void showRoundCorners() {
        ViewExtKt.show(getTopLeftCornerView());
        ViewExtKt.show(getTopRightCornerView());
        ViewExtKt.show(getBottomLeftCornerView());
        ViewExtKt.show(getBottomRightCornerView());
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
        this.roundCornersEnabled = enableRoundCorners;
        if (enableRoundCorners) {
            getBinding().getVideoMoleculePlayer().setBackgroundResource(R$drawable.pdp_video_molecule_widget_bg_landscape);
            showRoundCorners();
        }
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

    public /* synthetic */ VideoMoleculeLiteView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeLiteView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.landScapeTimeGroupWidth = -2;
        this.topLeftCornerView = DelegatesKt.lazyUnsafe(new VideoMoleculeLiteView$special$$inlined$lazyView$1(this, this));
        this.topRightCornerView = DelegatesKt.lazyUnsafe(new VideoMoleculeLiteView$special$$inlined$lazyView$2(this, this));
        this.bottomLeftCornerView = DelegatesKt.lazyUnsafe(new VideoMoleculeLiteView$special$$inlined$lazyView$3(this, this));
        this.bottomRightCornerView = DelegatesKt.lazyUnsafe(new VideoMoleculeLiteView$special$$inlined$lazyView$4(this, this));
        PdpVideoMoleculeBinding.Companion companion = PdpVideoMoleculeBinding.INSTANCE;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        this.binding = PdpVideoMoleculeBinding.Companion.inflate$default(companion, from, this, false, 4, null);
        View findViewById = findViewById(R$id.modeButton);
        this.modeButton = findViewById instanceof SwitchingImageView ? (SwitchingImageView) findViewById : null;
        this.timeGroup = findViewById(R$id.timeGroup);
        this.prevOrientation = context.getResources().getConfiguration().orientation;
    }
}
