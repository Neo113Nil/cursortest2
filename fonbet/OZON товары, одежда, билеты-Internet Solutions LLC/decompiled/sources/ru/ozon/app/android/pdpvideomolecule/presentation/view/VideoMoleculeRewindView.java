package ru.ozon.app.android.pdpvideomolecule.presentation.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdpvideomolecule.R$drawable;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.presentation.MapperKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010\"J7\u0010,\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014¢\u0006\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u000eR\u001b\u00104\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u0010\u0011R\u001b\u00107\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u000eR\u0016\u00108\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109¨\u0006="}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeRewindView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/TextView;", "createRewindTimeTextView", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "createDotImageView", "()Landroid/widget/ImageView;", "createTotalTimeTextView", "Landroid/widget/LinearLayout$LayoutParams;", "getTextLayoutParams", "()Landroid/widget/LinearLayout$LayoutParams;", "getImageViewLayoutParams", "", "mills", "", "setRewindTime", "(J)V", "setTotalDuration", "totalDuration", "position", "bindTime", "(JJ)V", "viewGone", "()V", "viewShow", "hideTime", "showTime", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "rewindTimeView$delegate", "LSc/j;", "getRewindTimeView", "rewindTimeView", "dotImageView$delegate", "getDotImageView", "dotImageView", "totalTimeView$delegate", "getTotalTimeView", "totalTimeView", "showHours", "Z", "isRewindTextViewCreated", "isDotImageViewCreated", "Companion", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeRewindView extends LinearLayout implements RewindableView {
    private static final int bottomPadding = Dimens.INSTANCE.getDP_118();

    /* renamed from: dotImageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dotImageView;
    private boolean isDotImageViewCreated;
    private boolean isRewindTextViewCreated;

    /* renamed from: rewindTimeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rewindTimeView;
    private boolean showHours;

    /* renamed from: totalTimeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j totalTimeView;

    public /* synthetic */ VideoMoleculeRewindView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView createDotImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.dot);
        imageView.setBackgroundResource(R$drawable.pdp_video_molecule_rewind_time_delimiter);
        LinearLayout.LayoutParams imageViewLayoutParams = getImageViewLayoutParams();
        imageViewLayoutParams.gravity = 81;
        imageView.setLayoutParams(imageViewLayoutParams);
        this.isDotImageViewCreated = true;
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView createRewindTimeTextView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.rewindTime);
        appCompatTextView.setTextAlignment(3);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Head_XXL);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textLightKey));
        LinearLayout.LayoutParams textLayoutParams = getTextLayoutParams();
        int dp_12 = Dimens.INSTANCE.getDP_12();
        int marginStart = textLayoutParams.getMarginStart();
        int i11 = ((ViewGroup.MarginLayoutParams) textLayoutParams).topMargin;
        int i12 = ((ViewGroup.MarginLayoutParams) textLayoutParams).bottomMargin;
        textLayoutParams.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) textLayoutParams).topMargin = i11;
        textLayoutParams.setMarginEnd(dp_12);
        ((ViewGroup.MarginLayoutParams) textLayoutParams).bottomMargin = i12;
        appCompatTextView.setLayoutParams(textLayoutParams);
        this.isRewindTextViewCreated = true;
        return appCompatTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView createTotalTimeTextView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.totalTime);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Head_XXL);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.graphicSecondaryOnDark));
        LinearLayout.LayoutParams textLayoutParams = getTextLayoutParams();
        int dp_12 = Dimens.INSTANCE.getDP_12();
        int i11 = ((ViewGroup.MarginLayoutParams) textLayoutParams).topMargin;
        int marginEnd = textLayoutParams.getMarginEnd();
        int i12 = ((ViewGroup.MarginLayoutParams) textLayoutParams).bottomMargin;
        textLayoutParams.setMarginStart(dp_12);
        ((ViewGroup.MarginLayoutParams) textLayoutParams).topMargin = i11;
        textLayoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) textLayoutParams).bottomMargin = i12;
        appCompatTextView.setLayoutParams(textLayoutParams);
        return appCompatTextView;
    }

    private final ImageView getDotImageView() {
        return (ImageView) this.dotImageView.getValue();
    }

    private final LinearLayout.LayoutParams getImageViewLayoutParams() {
        Dimens dimens = Dimens.INSTANCE;
        return new LinearLayout.LayoutParams(dimens.getDP_8(), dimens.getDP_8());
    }

    private final TextView getRewindTimeView() {
        return (TextView) this.rewindTimeView.getValue();
    }

    private final LinearLayout.LayoutParams getTextLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.gravity = 80;
        return layoutParams;
    }

    private final TextView getTotalTimeView() {
        return (TextView) this.totalTimeView.getValue();
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void bindTime(long totalDuration, long position) {
        this.showHours = totalDuration >= 3600000;
        setRewindTime(position);
        setTotalDuration(totalDuration);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void hideTime() {
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ViewExtKt.gone((View) c5314e0.next());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.isRewindTextViewCreated && this.isDotImageViewCreated) {
            getDotImageView().setY(((getMeasuredHeight() - (getRewindTimeView().getMeasuredHeight() / 2.0f)) - bottomPadding) - (getDotImageView().getMeasuredHeight() / 2.0f));
        }
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void setRewindTime(long mills) {
        getRewindTimeView().setText(MapperKt.toTimeString(mills, this.showHours));
    }

    public void setTotalDuration(long mills) {
        getTotalTimeView().setText(MapperKt.toTimeString(mills, this.showHours));
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void showTime() {
        ViewExtKt.show(getRewindTimeView());
        ViewExtKt.show(getDotImageView());
        ViewExtKt.show(getTotalTimeView());
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void viewGone() {
        ViewExtKt.gone(this);
    }

    @Override // ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView
    public void viewShow() {
        ViewExtKt.show(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeRewindView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rewindTimeView = DelegatesKt.lazyUnsafe(new VideoMoleculeRewindView$special$$inlined$lazyView$1(this, this));
        this.dotImageView = DelegatesKt.lazyUnsafe(new VideoMoleculeRewindView$special$$inlined$lazyView$2(this, this));
        this.totalTimeView = DelegatesKt.lazyUnsafe(new VideoMoleculeRewindView$special$$inlined$lazyView$3(this, this));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerOverlayDimming));
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), bottomPadding);
    }
}
