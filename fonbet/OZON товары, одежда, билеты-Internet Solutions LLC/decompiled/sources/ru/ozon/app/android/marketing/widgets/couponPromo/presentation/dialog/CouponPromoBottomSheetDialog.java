package ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog;

import GJ.b;
import GZ.g;
import Mc.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ImagesContract;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.databinding.CouponPromoDialogBinding;
import ru.ozon.app.android.marketing.widgets.couponPromo.di.CouponPromoBottomSheetComponent;
import ru.ozon.app.android.marketing.widgets.couponPromo.di.DaggerCouponPromoBottomSheetComponent;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 c2\u00020\u0001:\u0002cdB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#Ja\u00101\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\u0006\u0010!\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010(2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u0019\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b5\u00106J5\u00107\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010!\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010ZR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "stepsState", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "promoCode", "updateData", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "textColor", "", "activeStateButton", "inActiveStateButton", "", "isActivatedPromoCode", "deeplink", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "updateListener", "withShowSuccess", "putData", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;Z)V", "bindData", ImagesContract.URL, "onClick", "(Ljava/lang/String;)V", "onActionButtonCLick", "(ZLru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;Ljava/lang/String;Ljava/lang/String;)V", "isShowSuccess", "showSuccess", "(Z)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "couponActivationRepository", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "getCouponActivationRepository", "()Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "setCouponActivationRepository", "(Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthManager", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "setAuthManager", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "couponPromoRouter", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "getCouponPromoRouter", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;", "setCouponPromoRouter", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoRouter;)V", "stepsText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Z", "Ljava/lang/String;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "Lru/ozon/app/android/marketing/databinding/CouponPromoDialogBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/CouponPromoDialogBinding;", "Companion", "UpdateListener", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponPromoBottomSheetDialog extends DialogInterfaceOnCancelListenerC5390k {
    private String activeStateButton;
    public AuthStateStorage authManager;
    private CouponPromoDialogBinding binding;

    @NotNull
    private final C8486a compositeDisposable = new C8486a();
    public CouponActivationRepository couponActivationRepository;
    public CouponPromoRouter couponPromoRouter;
    private boolean isActivatedPromoCode;
    public g router;
    private OzonSpannableString stepsText;
    private UpdateListener updateListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$Companion;", "", "<init>", "()V", "KEY_STEPS_TEXT", "", "KEY_TEXT_COLOR", "KEY_ACTIVE_STATE_BUTTON", "KEY_INACTIVE_STATE_BUTTON", "KEY_IS_PROMO_CODE_ACTIVE", "KEY_PROMO_CODE", "KEY_DEEPLINK", "KEY_LISTENER", "KEY_NEED_SHOW_SUCCESS", "newInstance", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "activeStateButton", "inActiveStateButton", "isActivatedPromoCode", "", "promoCode", "deeplink", "updateListener", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "withShowSuccess", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;Z)Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CouponPromoBottomSheetDialog newInstance(@NotNull OzonSpannableString text, Integer textColor, String activeStateButton, String inActiveStateButton, boolean isActivatedPromoCode, @NotNull String promoCode, String deeplink, UpdateListener updateListener, boolean withShowSuccess) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(promoCode, "promoCode");
            CouponPromoBottomSheetDialog couponPromoBottomSheetDialog = new CouponPromoBottomSheetDialog();
            couponPromoBottomSheetDialog.putData(text, textColor, activeStateButton, inActiveStateButton, isActivatedPromoCode, promoCode, deeplink, updateListener, withShowSuccess);
            return couponPromoBottomSheetDialog;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog$UpdateListener;", "Ljava/io/Serializable;", "onUpdate", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UpdateListener extends Serializable {
        void onUpdate();
    }

    private final void bindData() {
        Button button;
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button2;
        Button button3;
        Button button4;
        CharSequence charSequence = requireArguments().getCharSequence("KEY_STEPS_TEXT");
        OzonSpannableString ozonSpannableString = charSequence instanceof OzonSpannableString ? (OzonSpannableString) charSequence : null;
        if (ozonSpannableString == null) {
            dismiss();
            return;
        }
        this.stepsText = ozonSpannableString;
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("KEY_TEXT_COLOR")) : null;
        Bundle arguments2 = getArguments();
        this.activeStateButton = arguments2 != null ? arguments2.getString("KEY_ACTIVE_STATE_BUTTON") : null;
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("KEY_INACTIVE_STATE_BUTTON") : null;
        Bundle arguments4 = getArguments();
        this.isActivatedPromoCode = arguments4 != null ? arguments4.getBoolean("KEY_IS_PROMO_CODE_ACTIVE") : false;
        Bundle arguments5 = getArguments();
        final String string2 = arguments5 != null ? arguments5.getString("KEY_PROMO_CODE") : null;
        Bundle arguments6 = getArguments();
        Serializable serializable = arguments6 != null ? arguments6.getSerializable("KEY_LISTENER") : null;
        this.updateListener = serializable instanceof UpdateListener ? (UpdateListener) serializable : null;
        Bundle arguments7 = getArguments();
        final boolean z11 = arguments7 != null ? arguments7.getBoolean("KEY_NEED_SHOW_SUCCESS") : false;
        Bundle arguments8 = getArguments();
        final String string3 = arguments8 != null ? arguments8.getString("KEY_DEEPLINK") : null;
        if (this.activeStateButton == null || string == null) {
            CouponPromoDialogBinding couponPromoDialogBinding = this.binding;
            if (couponPromoDialogBinding != null && (button = couponPromoDialogBinding.actionBtn) != null) {
                ViewExtKt.gone(button);
            }
        } else {
            CouponPromoDialogBinding couponPromoDialogBinding2 = this.binding;
            if (couponPromoDialogBinding2 != null && (button4 = couponPromoDialogBinding2.actionBtn) != null) {
                ViewExtKt.show(button4);
            }
            if (this.isActivatedPromoCode || z11) {
                string = this.activeStateButton;
            }
            CouponPromoDialogBinding couponPromoDialogBinding3 = this.binding;
            if (couponPromoDialogBinding3 != null && (button3 = couponPromoDialogBinding3.actionBtn) != null) {
                button3.setText(string);
            }
            CouponPromoDialogBinding couponPromoDialogBinding4 = this.binding;
            if (couponPromoDialogBinding4 != null && (button2 = couponPromoDialogBinding4.actionBtn) != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: xz.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CouponPromoBottomSheetDialog.bindData$lambda$7(CouponPromoBottomSheetDialog.this, z11, string2, string3, view);
                    }
                });
            }
        }
        if (valueOf != null) {
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                CouponPromoDialogBinding couponPromoDialogBinding5 = this.binding;
                if (couponPromoDialogBinding5 != null && (textView3 = couponPromoDialogBinding5.stepsTv) != null) {
                    textView3.setTextColor(intValue);
                }
            }
        }
        CouponPromoDialogBinding couponPromoDialogBinding6 = this.binding;
        if (couponPromoDialogBinding6 != null && (textView2 = couponPromoDialogBinding6.stepsTv) != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        CouponPromoDialogBinding couponPromoDialogBinding7 = this.binding;
        if (couponPromoDialogBinding7 != null && (textView = couponPromoDialogBinding7.stepsTv) != null) {
            OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
            OzonSpannableString ozonSpannableString2 = this.stepsText;
            if (ozonSpannableString2 == null) {
                Intrinsics.n("stepsText");
                throw null;
            }
            textView.setText(companion.setOnUrlSpanClick(ozonSpannableString2, textView, new CouponPromoBottomSheetDialog$bindData$4$1(this)));
        }
        new Handler().postDelayed(new Runnable() { // from class: xz.b
            @Override // java.lang.Runnable
            public final void run() {
                CouponPromoBottomSheetDialog.this.showSuccess(z11);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$7(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog, boolean z11, String str, String str2, View view) {
        couponPromoBottomSheetDialog.onActionButtonCLick(couponPromoBottomSheetDialog.isActivatedPromoCode || z11, couponPromoBottomSheetDialog.updateListener, str, str2);
    }

    private final void onActionButtonCLick(boolean isActivatedPromoCode, UpdateListener updateListener, String promoCode, String deeplink) {
        if (isActivatedPromoCode) {
            if (deeplink != null) {
                g.a.a(getRouter(), deeplink, null, null, 6);
                return;
            }
            if (updateListener != null) {
                updateListener.onUpdate();
            }
            dismiss();
            return;
        }
        if (promoCode != null) {
            if (!getAuthManager().isAuthenticated()) {
                getCouponPromoRouter().showNeedAuthTooltip(this);
                return;
            }
            C8486a c8486a = this.compositeDisposable;
            InterfaceC8487b h11 = getCouponActivationRepository().activateCode(promoCode).j(a.b()).g(C8125a.a()).h(new GJ.a(new CouponPromoBottomSheetDialog$onActionButtonCLick$1$1(this), 9), new b(new CouponPromoBottomSheetDialog$onActionButtonCLick$1$2(this), 6));
            Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, h11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick(String url) {
        if (url != null) {
            if (!h.t(url, "ozon://", false)) {
                url = LinkGenerator.webView$default(LinkGenerator.INSTANCE, url, null, false, false, 14, null).toString();
                Intrinsics.f(url);
            }
            g.a.a(getRouter(), url, null, null, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putData(OzonSpannableString text, Integer textColor, String activeStateButton, String inActiveStateButton, boolean isActivatedPromoCode, String promoCode, String deeplink, UpdateListener updateListener, boolean withShowSuccess) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("KEY_STEPS_TEXT", text);
        if (textColor != null) {
            bundle.putInt("KEY_TEXT_COLOR", textColor.intValue());
        }
        if (activeStateButton != null) {
            bundle.putString("KEY_ACTIVE_STATE_BUTTON", activeStateButton);
        }
        if (inActiveStateButton != null) {
            bundle.putString("KEY_INACTIVE_STATE_BUTTON", inActiveStateButton);
        }
        bundle.putBoolean("KEY_IS_PROMO_CODE_ACTIVE", isActivatedPromoCode);
        bundle.putString("KEY_PROMO_CODE", promoCode);
        if (updateListener != null) {
            bundle.putSerializable("KEY_LISTENER", updateListener);
        }
        bundle.putBoolean("KEY_NEED_SHOW_SUCCESS", withShowSuccess);
        if (deeplink != null) {
            bundle.putString("KEY_DEEPLINK", deeplink);
        }
        setArguments(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccess(boolean isShowSuccess) {
        if (isShowSuccess) {
            CouponPromoRouter couponPromoRouter = getCouponPromoRouter();
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CouponPromoRouter.showSuccessToolTip$default(couponPromoRouter, viewLifecycleOwner, resources, ContextExtKt.getRootView(this), null, null, 24, null);
        }
    }

    @NotNull
    public final AuthStateStorage getAuthManager() {
        AuthStateStorage authStateStorage = this.authManager;
        if (authStateStorage != null) {
            return authStateStorage;
        }
        Intrinsics.n("authManager");
        throw null;
    }

    @NotNull
    public final CouponActivationRepository getCouponActivationRepository() {
        CouponActivationRepository couponActivationRepository = this.couponActivationRepository;
        if (couponActivationRepository != null) {
            return couponActivationRepository;
        }
        Intrinsics.n("couponActivationRepository");
        throw null;
    }

    @NotNull
    public final CouponPromoRouter getCouponPromoRouter() {
        CouponPromoRouter couponPromoRouter = this.couponPromoRouter;
        if (couponPromoRouter != null) {
            return couponPromoRouter;
        }
        Intrinsics.n("couponPromoRouter");
        throw null;
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CouponPromoBottomSheetComponent.Factory factory = DaggerCouponPromoBottomSheetComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, CouponComponentApi.class).getDependencyStorage();
        if (CouponComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CouponComponentApi is not DiComponent");
        }
        factory.create(storageComponentApi, navigationComponentApi, (CouponComponentApi) dependencyStorage3.b(CouponComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, false, false, false, null, false, 1014, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        CouponPromoDialogBinding inflate = CouponPromoDialogBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        this.compositeDisposable.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        UpdateListener updateListener;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.isActivatedPromoCode || (updateListener = this.updateListener) == null) {
            return;
        }
        updateListener.onUpdate();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        bindData();
        CouponPromoDialogBinding couponPromoDialogBinding = this.binding;
        if (couponPromoDialogBinding == null || (imageView = couponPromoDialogBinding.navigationUpIv) == null) {
            return;
        }
        imageView.setOnClickListener(new BQ.b(this, 10));
    }

    public final void updateData(@NotNull CouponPromoVO.StepsStateVO stepsState, @NotNull CouponPromoVO.PromoCodeVO promoCode) {
        Intrinsics.checkNotNullParameter(stepsState, "stepsState");
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        OzonSpannableString text = stepsState.getStepsText().getText();
        Integer textColor = stepsState.getStepsText().getTextColor();
        CouponPromoVO.StepsStateVO.StepsActionVO stepsAction = stepsState.getStepsAction();
        String activeStateTitle = stepsAction != null ? stepsAction.getActiveStateTitle() : null;
        CouponPromoVO.StepsStateVO.StepsActionVO stepsAction2 = stepsState.getStepsAction();
        String inactiveStateTitle = stepsAction2 != null ? stepsAction2.getInactiveStateTitle() : null;
        boolean isActivated = promoCode.getIsActivated();
        String promoCode2 = promoCode.getPromoCode();
        CouponPromoVO.StepsStateVO.StepsActionVO stepsAction3 = stepsState.getStepsAction();
        putData(text, textColor, activeStateTitle, inactiveStateTitle, isActivated, promoCode2, stepsAction3 != null ? stepsAction3.getDeeplink() : null, this.updateListener, false);
        bindData();
    }
}
