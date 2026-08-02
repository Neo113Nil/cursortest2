package ru.ozon.uni.android.uikit.view.atoms.buttons.icons;

import Hj.C3143a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.atom.SmallIconButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "color", "setTint", "(I)V", "defaultWidth", "I", "defaultHeight", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SmallIconButtonView extends AppCompatImageView implements AtomView {
    public static final int $stable = 0;
    private final int defaultHeight;
    private final int defaultWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallIconButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(widthMeasureSpec) : this.defaultWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(heightMeasureSpec) : this.defaultHeight, 1073741824));
    }

    public void setTint(int color) {
        setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    public /* synthetic */ SmallIconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallIconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultWidth = ResourceExtKt.toPx(32);
        this.defaultHeight = ResourceExtKt.toPx(32);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmallIconButtonView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            SmallIconButtonAppearance smallIconButtonAppearance = new SmallIconButtonAppearance();
            smallIconButtonAppearance.readAttribute(R$styleable.SmallIconButtonView_android_src, obtainStyledAttributes);
            smallIconButtonAppearance.readAttribute(R$styleable.SmallIconButtonView_srcCompat, obtainStyledAttributes);
            smallIconButtonAppearance.apply(this);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            setImageResource(R$drawable.ic_l_icon360);
        }
        if (UniGlobalConfigKt.getRoundCornersFlag(context)) {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), ResourceExtKt.toPxF(99));
                }
            });
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
