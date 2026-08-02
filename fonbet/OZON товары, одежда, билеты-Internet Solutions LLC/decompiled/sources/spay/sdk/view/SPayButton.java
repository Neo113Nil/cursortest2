package spay.sdk.view;

import Cz.ViewOnClickListenerC2788a;
import Lf.a;
import Sc.InterfaceC3999a;
import Ve.Bi;
import Ve.InterfaceC4273gh;
import Ve.Ld;
import Ve.Pe;
import Ve.Te;
import Ve.Ul;
import Ve.Ur;
import Ve.Yj;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SdkReadyCheckResult;
import spay.sdk.d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 JW\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b#\u0010 J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lspay/sdk/view/SPayButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "dpRadius", "", "setCornerRadius", "(I)V", "Lkotlin/Pair;", "", "", "", "checkPermissions", "(Landroid/content/Context;)Lkotlin/Pair;", "Lkotlin/Function1;", "Lspay/sdk/api/SdkReadyCheckResult;", "callback", "isReadyForSPaySdk", "(Lkotlin/jvm/functions/Function1;)V", "authorization", "merchantLogin", "orderId", "orderNumber", "appPackage", "language", "Lspay/sdk/api/PaymentResult;", "payWithOrderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "apiKey", "bankInvoiceId", "payWithBankInvoiceId", "paymentResult", "completePayment", "(Lspay/sdk/api/PaymentResult;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SPayButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final View f98875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPayButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R.layout.spay_button, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(context, R.layout.spay_button, this)");
        this.f98875a = inflate;
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        Te c11 = sdkComponent != null ? ((Yj) sdkComponent).c() : null;
        a();
        if (c11 != null) {
            c11.b(new Bi(Ld.LC_PAY_BUTTON_INITED, Ur.MERCHANT_VIEW, Pe.LC, null, null, null, null, 120));
        }
    }

    public static /* synthetic */ void payWithBankInvoiceId$default(SPayButton sPayButton, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        sPayButton.payWithBankInvoiceId(str, str2, str3, str4, str5, str6, function1);
    }

    public static /* synthetic */ void payWithOrderId$default(SPayButton sPayButton, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        sPayButton.payWithOrderId(str, str2, str3, str4, str5, str6, function1);
    }

    public final void a() {
        ((MaterialButton) this.f98875a.findViewById(R.id.f152spay_v_btn_pay)).setOnClickListener(new ViewOnClickListenerC2788a(this, 1));
    }

    @NotNull
    public final Pair<Boolean, List<String>> checkPermissions(@NotNull Context context) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        return a11.a(context);
    }

    @InterfaceC3999a
    public final void completePayment(@NotNull PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        synchronized (Ul.f30135a) {
            d.f98848g.a();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        context.startActivity(new Intent(context, (Class<?>) RedirectActivity.class).putExtra("PAYMENT_RESULT", paymentResult));
    }

    @InterfaceC3999a
    public final void isReadyForSPaySdk(@NotNull Function1<? super SdkReadyCheckResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        a11.a(context, callback);
    }

    @InterfaceC3999a
    public final void payWithBankInvoiceId(@NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        a.o0(a11, context, apiKey, merchantLogin, bankInvoiceId, orderNumber, appPackage, callback);
    }

    @InterfaceC3999a
    public final void payWithOrderId(@NotNull String authorization, @NotNull String merchantLogin, @NotNull String orderId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        a.o0(a11, context, authorization, merchantLogin, orderId, orderNumber, appPackage, callback);
    }

    public final void setCornerRadius(int dpRadius) {
        ((MaterialButton) this.f98875a.findViewById(R.id.f152spay_v_btn_pay)).setCornerRadius((int) (dpRadius * Resources.getSystem().getDisplayMetrics().density));
    }

    public static final void a(SPayButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.performClick();
    }
}
