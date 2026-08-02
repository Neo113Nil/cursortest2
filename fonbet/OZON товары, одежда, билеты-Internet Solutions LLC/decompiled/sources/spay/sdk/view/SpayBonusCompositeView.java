package spay.sdk.view;

import B1.C2548q;
import T0.g;
import Ve.Gg;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lspay/sdk/view/SpayBonusCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayBonusCompositeView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f98881a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg f98882b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i11, boolean z11) {
        Gg gg = this.f98882b;
        if (i11 <= 0 || !g.f26423a || !g.f26424b || z11) {
            ConstraintLayout spaySclbvRoot = gg.f29077c;
            Intrinsics.checkNotNullExpressionValue(spaySclbvRoot, "spaySclbvRoot");
            spaySclbvRoot.setVisibility(8);
        } else {
            ConstraintLayout spaySclbvRoot2 = gg.f29077c;
            Intrinsics.checkNotNullExpressionValue(spaySclbvRoot2, "spaySclbvRoot");
            spaySclbvRoot2.setVisibility(0);
            gg.f29076b.setText(getContext().getString(R.string.spay_bonus_pattern, new DecimalFormat("#,###").format(Integer.valueOf(i11))));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpayBonusCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBonusCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bonus_view, (ViewGroup) this, false);
        addView(inflate);
        int i12 = R.id.spay_rics_actv_spasibo_bonus;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i12, inflate);
        if (sPayTextView != null) {
            i12 = R.id.spay_rics_iv_spasibo_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i12, inflate);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                Gg gg = new Gg(constraintLayout, sPayTextView, constraintLayout);
                Intrinsics.checkNotNullExpressionValue(gg, "inflate(\n        LayoutI… this,\n        true\n    )");
                this.f98882b = gg;
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SpayBonusCompositeView, 0, 0);
                Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…,\n            0\n        )");
                obtainStyledAttributes.getColor(R.styleable.SpayBonusCompositeView_spay_bonus_view_selected_color, a.getColor(context, R.color.spay_bonus_selected_color));
                int color = obtainStyledAttributes.getColor(R.styleable.SpayBonusCompositeView_spay_bonus_view_default_color, a.getColor(context, R.color.spay_bonus_default_color));
                this.f98881a = color;
                obtainStyledAttributes.recycle();
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.spayRicsIvSpasiboIcon");
                Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
                ColorStateList valueOf = ColorStateList.valueOf(color);
                Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(color)");
                androidx.core.widget.g.a(appCompatImageView, valueOf);
                sPayTextView.setTextColor(color);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
