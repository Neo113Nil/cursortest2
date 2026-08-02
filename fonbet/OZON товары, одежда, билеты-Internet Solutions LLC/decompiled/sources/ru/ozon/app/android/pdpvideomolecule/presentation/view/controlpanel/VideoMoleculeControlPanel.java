package ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.databinding.PdpVideoMoleculeControlPanelViewBinding;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/controlpanel/VideoMoleculeControlPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/pdpvideomolecule/databinding/PdpVideoMoleculeControlPanelViewBinding;", "dp20", "dp16", "dp6", "dp4", "dp2", "prevOrientation", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "changeToPortrait", "changeToLandscape", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeControlPanel extends ConstraintLayout {

    @NotNull
    private final PdpVideoMoleculeControlPanelViewBinding binding;
    private final int dp16;
    private final int dp2;
    private final int dp20;
    private final int dp4;
    private final int dp6;
    private int prevOrientation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeControlPanel(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeToLandscape() {
        PdpVideoMoleculeControlPanelViewBinding pdpVideoMoleculeControlPanelViewBinding = this.binding;
        FrameLayout frameLayout = pdpVideoMoleculeControlPanelViewBinding.pausePlayContainer;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41642l = R.id.exo_progress;
        bVar.f41657u = R.id.exo_progress;
        bVar.f41636i = R.id.exo_progress;
        bVar.f41656t = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = this.dp6;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = this.dp4;
        frameLayout.setLayoutParams(bVar);
        pdpVideoMoleculeControlPanelViewBinding.exoPlay.setImageResource(R$drawable.ic_m_circle_play);
        pdpVideoMoleculeControlPanelViewBinding.exoPause.setImageResource(R$drawable.ic_m_circle_pause);
        pdpVideoMoleculeControlPanelViewBinding.modeButton.setImageResource(R$drawable.ic_m_full_screen_exit);
        VideoMoleculeTimeBar videoMoleculeTimeBar = pdpVideoMoleculeControlPanelViewBinding.exoProgress;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, this.dp20);
        bVar2.f41657u = R$id.timeGroup;
        bVar2.f41655s = R$id.pausePlayContainer;
        bVar2.f41636i = 0;
        bVar2.f41603J = 2;
        bVar2.setMarginStart(this.dp6);
        bVar2.setMarginEnd(this.dp6);
        videoMoleculeTimeBar.setLayoutParams(bVar2);
        pdpVideoMoleculeControlPanelViewBinding.exoProgress.setPadding(0, 0, 0, this.dp4);
        LinearLayout linearLayout = pdpVideoMoleculeControlPanelViewBinding.timeGroup;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(pdpVideoMoleculeControlPanelViewBinding.timeGroup.getLayoutParams().width, -2);
        bVar3.f41642l = 0;
        bVar3.f41636i = 0;
        bVar3.f41657u = R$id.modeButton;
        bVar3.f41655s = R.id.exo_progress;
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = this.dp16;
        linearLayout.setLayoutParams(bVar3);
        SwitchingImageView switchingImageView = pdpVideoMoleculeControlPanelViewBinding.modeButton;
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        int i11 = R$id.timeGroup;
        bVar4.f41642l = i11;
        bVar4.f41658v = 0;
        bVar4.f41655s = i11;
        bVar4.f41636i = i11;
        switchingImageView.setLayoutParams(bVar4);
    }

    private final void changeToPortrait() {
        PdpVideoMoleculeControlPanelViewBinding pdpVideoMoleculeControlPanelViewBinding = this.binding;
        VideoMoleculeTimeBar videoMoleculeTimeBar = pdpVideoMoleculeControlPanelViewBinding.exoProgress;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, this.dp20);
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41603J = 2;
        videoMoleculeTimeBar.setLayoutParams(bVar);
        pdpVideoMoleculeControlPanelViewBinding.exoProgress.setPadding(0, 0, 0, this.dp2);
        FrameLayout frameLayout = pdpVideoMoleculeControlPanelViewBinding.pausePlayContainer;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41656t = 0;
        bVar2.f41638j = R.id.exo_progress;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = this.dp6;
        ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = this.dp4;
        frameLayout.setLayoutParams(bVar2);
        pdpVideoMoleculeControlPanelViewBinding.exoPlay.setImageResource(R$drawable.ic_s_circle_play);
        pdpVideoMoleculeControlPanelViewBinding.exoPause.setImageResource(R$drawable.ic_s_circle_pause);
        LinearLayout linearLayout = pdpVideoMoleculeControlPanelViewBinding.timeGroup;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41638j = R.id.exo_progress;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = this.dp6;
        linearLayout.setLayoutParams(bVar3);
        SwitchingImageView switchingImageView = pdpVideoMoleculeControlPanelViewBinding.modeButton;
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41658v = 0;
        bVar4.f41638j = R.id.exo_progress;
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = this.dp6;
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = this.dp2;
        switchingImageView.setLayoutParams(bVar4);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig != null) {
            int i11 = this.prevOrientation;
            int i12 = newConfig.orientation;
            if (i11 == i12) {
                return;
            }
            this.prevOrientation = i12;
            if (i12 == 1) {
                changeToPortrait();
            } else {
                changeToLandscape();
            }
        }
    }

    public /* synthetic */ VideoMoleculeControlPanel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeControlPanel(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PdpVideoMoleculeControlPanelViewBinding inflate = PdpVideoMoleculeControlPanelViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.dp20 = ResourceExtKt.toPx(20, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.prevOrientation = context.getResources().getConfiguration().orientation;
    }
}
