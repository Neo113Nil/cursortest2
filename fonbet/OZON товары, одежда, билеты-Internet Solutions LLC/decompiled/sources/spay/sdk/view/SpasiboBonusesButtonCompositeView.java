package spay.sdk.view;

import B1.C2548q;
import Jm0.a;
import Ve.C4330ih;
import Ve.C4515p;
import Ve.C4676ug;
import Ve.Fi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lspay/sdk/view/SpasiboBonusesButtonCompositeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pxMargin", "", "setTopMargin", "(I)V", "LVe/Fi;", "btnState", "setSpasiboButtonState", "(LVe/Fi;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpasiboBonusesButtonCompositeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C4330ih f98876a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void b(Function0 onSwitchClicked, View view) {
        Intrinsics.checkNotNullParameter(onSwitchClicked, "$onSwitchClicked");
        onSwitchClicked.invoke();
    }

    private final void setTopMargin(int pxMargin) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, pxMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        setLayoutParams(marginLayoutParams);
    }

    public final void a(C4676ug onSwitchClicked) {
        Intrinsics.checkNotNullParameter(onSwitchClicked, "onSwitchClicked");
        this.f98876a.f31299a.setOnClickListener(new a(onSwitchClicked, 0));
        this.f98876a.f31302d.setOnClickListener(new FX.a(onSwitchClicked, 1));
    }

    public final void setSpasiboButtonState(@NotNull Fi btnState) {
        String a11;
        Intrinsics.checkNotNullParameter(btnState, "btnState");
        int i11 = btnState.f29008b ? R.drawable.spay_ic_switch_bnpl_on : R.drawable.spay_ic_switch_bnpl_off;
        AppCompatImageView appCompatImageView = this.f98876a.f31302d;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.spaySpasiboSwitch");
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(g.d(appCompatImageView.getResources(), i11, null));
        boolean z11 = btnState.f29009c;
        if (z11) {
            a11 = getContext().getString(R.string.spay_spasibo_button_zero_order_title);
        } else {
            String string = getContext().getString(R.string.spay_spasibo_button_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…pay_spasibo_button_title)");
            a11 = C4515p.a(string);
        }
        Intrinsics.checkNotNullExpressionValue(a11, "if (btnState.isZeroOrder…ay_spasibo_button_title))");
        this.f98876a.f31301c.setText(a11);
        if (z11 && btnState.f29008b) {
            this.f98876a.f31300b.setText(getContext().getString(R.string.spay_spasibo_button_zero_order_subtitle_on));
            return;
        }
        int i12 = btnState.f29007a;
        if (z11) {
            String quantityString = getResources().getQuantityString(R.plurals.spay_bonuses, i12, Integer.valueOf(i12));
            Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…onuses, btnState.bonuses)");
            this.f98876a.f31300b.setText(getContext().getString(R.string.spay_spasibo_button_zero_order_subtitle_off, quantityString));
        } else {
            String quantityString2 = getResources().getQuantityString(R.plurals.spay_bonuses, i12, Integer.valueOf(i12));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "resources.getQuantityStr…onuses, btnState.bonuses)");
            this.f98876a.f31300b.setText(getContext().getString(R.string.spay_spasibo_off_button_subtitle, quantityString2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b() {
        setVisibility(0);
        setTopMargin((int) getResources().getDimension(R.dimen.spay_order_bnpl_btn_margin_top));
    }

    public /* synthetic */ SpasiboBonusesButtonCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpasiboBonusesButtonCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_spasibo_bonuses_button, (ViewGroup) this, false);
        addView(inflate);
        int i12 = R.id.spay_actv_spasibo_subtitle;
        SPayTextView sPayTextView = (SPayTextView) C2548q.d(i12, inflate);
        if (sPayTextView != null) {
            i12 = R.id.spay_actv_spasibo_title;
            SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i12, inflate);
            if (sPayTextView2 != null) {
                i12 = R.id.spay_cl_selected_card;
                if (((ConstraintLayout) C2548q.d(i12, inflate)) != null) {
                    CardView cardView = (CardView) inflate;
                    int i13 = R.id.spay_iv_spasibo_logo;
                    if (((ImageView) C2548q.d(i13, inflate)) != null) {
                        i13 = R.id.spay_spasibo_switch;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i13, inflate);
                        if (appCompatImageView != null) {
                            C4330ih c4330ih = new C4330ih(cardView, sPayTextView, sPayTextView2, appCompatImageView);
                            Intrinsics.checkNotNullExpressionValue(c4330ih, "inflate(\n        LayoutI… this,\n        true\n    )");
                            this.f98876a = c4330ih;
                            return;
                        }
                    }
                    i12 = i13;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }

    public static final void a(Function0 onSwitchClicked, View view) {
        Intrinsics.checkNotNullParameter(onSwitchClicked, "$onSwitchClicked");
        onSwitchClicked.invoke();
    }

    public final void a() {
        setVisibility(8);
        setTopMargin(0);
    }
}
