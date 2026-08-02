package spay.sdk.view;

import B1.C2548q;
import Ve.C4218ek;
import Ve.C4300hf;
import Ve.O7;
import Ve.Sh;
import Ve.ViewOnClickListenerC4697v8;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import v5.C10234h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lspay/sdk/view/BnplButtonCompositeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "bnplNewSubTitle", "", "setBnplNewSubTitle", "(Ljava/lang/String;)V", "pxMargin", "setTopMargin", "(I)V", "bnplNewTitle", "setBnplTitle", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BnplButtonCompositeView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f98858c;

    /* renamed from: a, reason: collision with root package name */
    public final C4300hf f98859a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f98860b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setBnplNewSubTitle(String bnplNewSubTitle) {
        this.f98859a.f31189c.setText(bnplNewSubTitle);
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

    public final void a() {
        setVisibility(8);
        this.f98860b = true;
        setTopMargin(0);
    }

    public final void b(ButtonBnpl bnpl) {
        Intrinsics.checkNotNullParameter(bnpl, "bnpl");
        setVisibility(0);
        a(bnpl);
        if (this.f98860b) {
            setTopMargin((int) getResources().getDimension(R.dimen.spay_order_bnpl_btn_margin_top));
            this.f98860b = false;
        }
    }

    public final void setBnplTitle(@NotNull String bnplNewTitle) {
        Intrinsics.checkNotNullParameter(bnplNewTitle, "bnplNewTitle");
        this.f98859a.f31190d.setText(bnplNewTitle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BnplButtonCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BnplButtonCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_button, (ViewGroup) this, false);
        addView(inflate);
        int i12 = R.id.spay_aciv_bnpl_icon;
        BnplLogoCompositeView bnplLogoCompositeView = (BnplLogoCompositeView) C2548q.d(i12, inflate);
        if (bnplLogoCompositeView != null) {
            i12 = R.id.spay_actv_bnpl_subtitle;
            SPayTextView sPayTextView = (SPayTextView) C2548q.d(i12, inflate);
            if (sPayTextView != null) {
                i12 = R.id.spay_actv_bnpl_title;
                SPayTextView sPayTextView2 = (SPayTextView) C2548q.d(i12, inflate);
                if (sPayTextView2 != null) {
                    i12 = R.id.spay_cl_selected_card;
                    if (((ConstraintLayout) C2548q.d(i12, inflate)) != null) {
                        CardView cardView = (CardView) inflate;
                        i12 = R.id.spay_sclbb_aciv_switch;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i12, inflate);
                        if (appCompatImageView != null) {
                            C4300hf c4300hf = new C4300hf(cardView, bnplLogoCompositeView, sPayTextView, sPayTextView2, appCompatImageView);
                            Intrinsics.checkNotNullExpressionValue(c4300hf, "inflate(\n        LayoutI… this,\n        true\n    )");
                            this.f98859a = c4300hf;
                            Intrinsics.checkNotNullExpressionValue(cardView, "binding.spayCvBnplRoot");
                            cardView.setOnClickListener(new ViewOnClickListenerC4697v8(new L(), this));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }

    public final void a(String numOfPayments, ButtonBnpl bnpl) {
        String string;
        Intrinsics.checkNotNullParameter(numOfPayments, "numOfPayments");
        Intrinsics.checkNotNullParameter(bnpl, "bnpl");
        BnplLogoCompositeView bnplLogoCompositeView = this.f98859a.f31188b;
        String activeButtonLogo = bnpl.getActiveButtonLogo();
        ImageView targetView = bnplLogoCompositeView.f98862b;
        ShimmerFrameLayout shimmerFrame = bnplLogoCompositeView.f98863c;
        Drawable drawable = bnplLogoCompositeView.f98864d;
        Intrinsics.checkNotNullParameter(targetView, "shimmerImageView");
        Intrinsics.checkNotNullParameter(shimmerFrame, "shimmerFrame");
        O7 imageRequestListener = new O7(shimmerFrame, targetView, drawable);
        Sh coilImpl = bnplLogoCompositeView.getCoilImpl();
        Intrinsics.checkNotNullParameter(targetView, "<this>");
        Intrinsics.checkNotNullParameter(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            C4218ek imageRequestBuilder = new C4218ek(imageRequestListener);
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
            C10234h.a aVar = new C10234h.a(coilImpl.f29980a);
            aVar.b(activeButtonLogo);
            aVar.h(targetView);
            imageRequestBuilder.invoke(aVar);
            coilImpl.f29981b.a(aVar.a());
        }
        AppCompatImageView appCompatImageView = this.f98859a.f31191e;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.spaySclbbAcivSwitch");
        int i11 = R.drawable.spay_ic_switch_bnpl_on;
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(g.d(appCompatImageView.getResources(), i11, null));
        if (f98858c) {
            string = bnpl.getContent();
        } else {
            string = getResources().getString(R.string.spay_bnpl_on_button_subtitle);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                resour…          )\n            }");
        }
        setBnplNewSubTitle(string);
    }

    public final void a(ButtonBnpl bnpl) {
        Intrinsics.checkNotNullParameter(bnpl, "bnpl");
        setBnplTitle(bnpl.getHeader());
        setBnplNewSubTitle(bnpl.getContent());
        BnplLogoCompositeView bnplLogoCompositeView = this.f98859a.f31188b;
        String inactiveButtonLogo = bnpl.getInactiveButtonLogo();
        ImageView targetView = bnplLogoCompositeView.f98862b;
        ShimmerFrameLayout shimmerFrame = bnplLogoCompositeView.f98863c;
        Drawable drawable = bnplLogoCompositeView.f98865e;
        Intrinsics.checkNotNullParameter(targetView, "shimmerImageView");
        Intrinsics.checkNotNullParameter(shimmerFrame, "shimmerFrame");
        O7 imageRequestListener = new O7(shimmerFrame, targetView, drawable);
        Sh coilImpl = bnplLogoCompositeView.getCoilImpl();
        Intrinsics.checkNotNullParameter(targetView, "<this>");
        Intrinsics.checkNotNullParameter(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            C4218ek imageRequestBuilder = new C4218ek(imageRequestListener);
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
            C10234h.a aVar = new C10234h.a(coilImpl.f29980a);
            aVar.b(inactiveButtonLogo);
            aVar.h(targetView);
            imageRequestBuilder.invoke(aVar);
            coilImpl.f29981b.a(aVar.a());
        }
        AppCompatImageView appCompatImageView = this.f98859a.f31191e;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.spaySclbbAcivSwitch");
        int i11 = R.drawable.spay_ic_switch_bnpl_off;
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        appCompatImageView.setImageDrawable(g.d(appCompatImageView.getResources(), i11, null));
    }
}
