package ru.ozon.android.uikit.view.atoms.buttons.icons;

import Hj.C3143a;
import Sc.InterfaceC3999a;
import Yg.C4894a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ji.C7431b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.appearance.atom.SmallIconButtonAppearance;
import ru.ozon.android.uikit.extensions.ResourceExtKt;
import ru.ozon.app.android.R;

@InterfaceC3999a
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "defaultWidth", "I", "defaultHeight", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SmallIconButtonView extends AppCompatImageView {
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4894a.f35033e);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            SmallIconButtonAppearance smallIconButtonAppearance = new SmallIconButtonAppearance();
            smallIconButtonAppearance.readAttribute(0, obtainStyledAttributes);
            smallIconButtonAppearance.readAttribute(1, obtainStyledAttributes);
            smallIconButtonAppearance.apply(this);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            setImageResource(R.drawable.ic_l_icon360);
        }
        if (C7431b.a(context)) {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.android.uikit.view.atoms.buttons.icons.SmallIconButtonView.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), ResourceExtKt.toPxF(99));
                }
            });
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
