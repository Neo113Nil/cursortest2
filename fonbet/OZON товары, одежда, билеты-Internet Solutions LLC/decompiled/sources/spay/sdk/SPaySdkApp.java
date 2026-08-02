package spay.sdk;

import Ae.C;
import Ae.C2399j;
import Bl0.k0;
import Sc.InterfaceC3999a;
import Sc.s;
import T0.g;
import Ve.AbstractC4445mg;
import Ve.AbstractC4477nj;
import Ve.C4381ka;
import Ve.C4549q4;
import Ve.C4565qk;
import Ve.C4618sg;
import Ve.C4726w9;
import Ve.C4727wa;
import Ve.C4729wc;
import Ve.C4738wl;
import Ve.Dd;
import Ve.InterfaceC4273gh;
import Ve.Le;
import Ve.Ma;
import Ve.Nh;
import Ve.Pj;
import Ve.Sk;
import Ve.T8;
import Ve.Tf;
import Ve.Ul;
import Ve.Wk;
import Ve.Y1;
import Ve.Yj;
import W2.f;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import spay.sdk.api.SPaymentTool;
import spay.sdk.api.SdkReadyCheckResult;
import spay.sdk.api.model.SPaymentRequest;
import spay.sdk.data.dto.SPaySdkInitConfigDto;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 a2\u00020\u0001:\u0001aJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0017\u0010\u0013J_\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b \u0010!Jg\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b#\u0010$Jg\u0010&\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J]\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b)\u0010!J]\u0010*\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b*\u0010!J_\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b+\u0010!J_\u0010,\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b,\u0010!J'\u00100\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180/0-2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u00020\u001f¢\u0006\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010F\u001a\u00020E8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lspay/sdk/SPaySdkApp;", "", "Lspay/sdk/api/SPayMethod;", "method", "Lspay/sdk/api/model/SPaymentRequest;", "request", "", "pay", "(Lspay/sdk/api/SPayMethod;Lspay/sdk/api/model/SPaymentRequest;)V", "Landroid/content/Context;", "context", "Lspay/sdk/api/SPaySdkInitConfig;", "config", "initialize", "(Landroid/content/Context;Lspay/sdk/api/SPaySdkInitConfig;)V", "Lkotlin/Function1;", "Lspay/sdk/api/InitializationResult;", "initializationResultCallback", "reInitialize$SPaySDK_baseRelease", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "reInitialize", "Lspay/sdk/api/SdkReadyCheckResult;", "callback", "isReadyForSPaySdk", "", "apiKey", "merchantLogin", "bankInvoiceId", "orderNumber", "appPackage", "language", "Lspay/sdk/api/PaymentResult;", "payWithBonuses", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "phoneNumber", "payWithPaymentAccounts", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bindingId", "payWithBinding", "logout", "()V", "payWithoutRefresh", "payWithPartPay", "payWithBankInvoiceId", "payOnline", "Lkotlin/Pair;", "", "", "checkPermissions", "(Landroid/content/Context;)Lkotlin/Pair;", "paymentResult", "completePayment", "(Landroid/content/Context;Lspay/sdk/api/PaymentResult;)V", "LVe/gh;", "a", "LVe/gh;", "getSdkComponent$SPaySDK_baseRelease", "()LVe/gh;", "setSdkComponent$SPaySDK_baseRelease", "(LVe/gh;)V", "sdkComponent", "Lxe/M;", "b", "Lxe/M;", "getScope$SPaySDK_baseRelease", "()Lxe/M;", "setScope$SPaySDK_baseRelease", "(Lxe/M;)V", "scope", "LVe/T8;", "sPaySdkMerchantOptionsRepository", "LVe/T8;", "getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease", "()LVe/T8;", "setSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease", "(LVe/T8;)V", "LVe/Nh;", "securePreferences", "LVe/Nh;", "getSecurePreferences$SPaySDK_baseRelease", "()LVe/Nh;", "setSecurePreferences$SPaySDK_baseRelease", "(LVe/Nh;)V", "LVe/Ma;", "defaultPreferences", "LVe/Ma;", "getDefaultPreferences$SPaySDK_baseRelease", "()LVe/Ma;", "setDefaultPreferences$SPaySDK_baseRelease", "(LVe/Ma;)V", "LVe/Tf;", "loggingContract", "LVe/Tf;", "getLoggingContract$SPaySDK_baseRelease", "()LVe/Tf;", "setLoggingContract$SPaySDK_baseRelease", "(LVe/Tf;)V", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SPaySdkApp {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String INIT_CONFIG = "SPaySdkInitConfig";

    /* renamed from: c, reason: collision with root package name */
    public static volatile SPaySdkApp f98838c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public InterfaceC4273gh sdkComponent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public M scope;
    public Ma defaultPreferences;
    public Tf loggingContract;
    public T8 sPaySdkMerchantOptionsRepository;
    public Nh securePreferences;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lspay/sdk/SPaySdkApp$Companion;", "", "Lspay/sdk/SPaySdkApp;", "getInstance", "()Lspay/sdk/SPaySdkApp;", "", "INIT_CONFIG", "Ljava/lang/String;", "instance", "Lspay/sdk/SPaySdkApp;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final synchronized SPaySdkApp getInstance() {
            SPaySdkApp sPaySdkApp;
            try {
                if (SPaySdkApp.f98838c == null) {
                    SPaySdkApp.f98838c = new SPaySdkApp(null);
                }
                sPaySdkApp = SPaySdkApp.f98838c;
                Intrinsics.f(sPaySdkApp);
            } catch (Throwable th2) {
                throw th2;
            }
            return sPaySdkApp;
        }
    }

    public SPaySdkApp(DefaultConstructorMarker defaultConstructorMarker) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(He.b.f10879b);
    }

    public static final Object access$cacheConfigToPreferences(SPaySdkApp sPaySdkApp, SPaySdkInitConfig sPaySdkInitConfig, kotlin.coroutines.d dVar) {
        sPaySdkApp.getClass();
        String k11 = new Gson().k(sPaySdkInitConfig.toSPaySdkInitConfigDto());
        Intrinsics.checkNotNullExpressionValue(k11, "gson.toJson(config.toSPaySdkInitConfigDto())");
        Ma defaultPreferences$SPaySDK_baseRelease = sPaySdkApp.getDefaultPreferences$SPaySDK_baseRelease();
        Ma.f29467a.getClass();
        Le le2 = (Le) defaultPreferences$SPaySDK_baseRelease;
        Object a11 = AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).a(new Dd(k11, le2, C4381ka.f31432c, null), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (a11 != aVar) {
            a11 = Unit.f71690a;
        }
        return a11 == aVar ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, kotlin.coroutines.d dVar) {
        Pj pj2;
        int i11;
        SPaySdkApp sPaySdkApp;
        String str;
        try {
            if (dVar instanceof Pj) {
                pj2 = (Pj) dVar;
                int i12 = pj2.f29725h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    pj2.f29725h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = pj2.f29723f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = pj2.f29725h;
                    if (i11 != 0) {
                        s.b(obj);
                        Ma defaultPreferences$SPaySDK_baseRelease = getDefaultPreferences$SPaySDK_baseRelease();
                        Ma.f29467a.getClass();
                        f.a key = C4381ka.f31432c;
                        pj2.f29721d = this;
                        pj2.f29722e = function1;
                        pj2.f29725h = 1;
                        Le le2 = (Le) defaultPreferences$SPaySDK_baseRelease;
                        le2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        obj = C2399j.w(new C(new C4729wc(AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).getData(), key), new C4727wa()), pj2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        sPaySdkApp = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function1 = pj2.f29722e;
                        sPaySdkApp = pj2.f29721d;
                        s.b(obj);
                    }
                    str = (String) obj;
                    if (str != null) {
                        try {
                            return ((SPaySdkInitConfigDto) new Gson().d(str, SPaySdkInitConfigDto.class)).toSPaySdkInitConfig();
                        } catch (Exception e11) {
                            sPaySdkApp.a(e11);
                        }
                    }
                    return null;
                }
            }
            if (i11 != 0) {
            }
            str = (String) obj;
            if (str != null) {
            }
            return null;
        } catch (Exception e12) {
            function1.invoke(new InitializationResult.ConfigError(Nk.a.b("SPaySdkApp initialize with exception : ", e12.getMessage())));
            return null;
        }
        pj2 = new Pj(this, dVar);
        Object obj2 = pj2.f29723f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pj2.f29725h;
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

    public final void completePayment(@NotNull Context context, @NotNull PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        synchronized (Ul.f30135a) {
            d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        context.startActivity(new Intent(context, (Class<?>) RedirectActivity.class).putExtra("PAYMENT_RESULT", paymentResult));
    }

    @NotNull
    public final Ma getDefaultPreferences$SPaySDK_baseRelease() {
        Ma ma2 = this.defaultPreferences;
        if (ma2 != null) {
            return ma2;
        }
        Intrinsics.n("defaultPreferences");
        throw null;
    }

    @NotNull
    public final Tf getLoggingContract$SPaySDK_baseRelease() {
        Tf tf2 = this.loggingContract;
        if (tf2 != null) {
            return tf2;
        }
        Intrinsics.n("loggingContract");
        throw null;
    }

    @NotNull
    public final T8 getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease() {
        T8 t82 = this.sPaySdkMerchantOptionsRepository;
        if (t82 != null) {
            return t82;
        }
        Intrinsics.n("sPaySdkMerchantOptionsRepository");
        throw null;
    }

    @NotNull
    /* renamed from: getScope$SPaySDK_baseRelease, reason: from getter */
    public final M getScope() {
        return this.scope;
    }

    /* renamed from: getSdkComponent$SPaySDK_baseRelease, reason: from getter */
    public final InterfaceC4273gh getSdkComponent() {
        return this.sdkComponent;
    }

    @NotNull
    public final Nh getSecurePreferences$SPaySDK_baseRelease() {
        Nh nh2 = this.securePreferences;
        if (nh2 != null) {
            return nh2;
        }
        Intrinsics.n("securePreferences");
        throw null;
    }

    public final void initialize(@NotNull Context context, @NotNull SPaySdkInitConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            int i11 = AbstractC4477nj.f31664a[config.getStage().ordinal()];
            if (i11 == 1) {
                Wk.f30290b = 7;
            } else if (i11 != 2) {
                Wk.f30290b = 1;
            } else {
                Wk.f30290b = 6;
            }
            a(context);
            InterfaceC4273gh interfaceC4273gh = this.sdkComponent;
            if (interfaceC4273gh != null) {
                ((Yj) interfaceC4273gh).b(this);
            }
            SPayStage stage = config.getStage();
            boolean enableLogging = config.getEnableLogging();
            M9.a.a(context);
            if ((stage == SPayStage.SandBoxWithoutBankApp || stage == SPayStage.SandboxRealBankApp) && enableLogging) {
                Lm0.a.f17149a.a(new Y1());
                ((C4618sg) getLoggingContract$SPaySDK_baseRelease()).f32052a = true;
            }
            C10727i.d(C10720e0.a(), new C4565qk(this, config, null));
            C4726w9 c4726w9 = (C4726w9) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease();
            c4726w9.getClass();
            Intrinsics.checkNotNullParameter(config, "options");
            c4726w9.f32350a = config;
            g.f26424b = config.getSpasiboBonuses();
            SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f32350a;
            if (sPaySdkInitConfig == null) {
                throw C4549q4.f31841a;
            }
            sPaySdkInitConfig.getInitializationResult().invoke(InitializationResult.Success.INSTANCE);
        } catch (Exception e11) {
            SPaySdkInitConfig sPaySdkInitConfig2 = ((C4726w9) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f32350a;
            if (sPaySdkInitConfig2 == null) {
                throw C4549q4.f31841a;
            }
            sPaySdkInitConfig2.getInitializationResult().invoke(new InitializationResult.ConfigError(Nk.a.b("SPaySdkApp initialize with exception : ", e11.getMessage())));
        }
    }

    public final void isReadyForSPaySdk(@NotNull Context context, @NotNull Function1<? super SdkReadyCheckResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            synchronized (Ul.f30135a) {
                a11 = d.f98848g.a();
            }
            a11.a(context, callback);
        } catch (Exception unused) {
            Ul ul = Ul.f30135a;
            Ul.f30136b = null;
            Ul.f30137c = null;
            d.f98849h = null;
            synchronized (ul) {
                d.f98848g.a().a(context, callback);
            }
        }
    }

    public final void logout() {
        d a11;
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        C10727i.c(a11.f98855f, null, null, new c(null), 3);
    }

    public final void pay(@NotNull SPayMethod method, @NotNull SPaymentRequest request) {
        d a11;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        a11.a(method, request);
    }

    @InterfaceC3999a
    public final void payOnline(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(SPayMethod.Default.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @InterfaceC3999a
    public final void payWithBankInvoiceId(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Lf.a.o0(a11, context, apiKey, merchantLogin, bankInvoiceId, orderNumber, appPackage, callback);
    }

    @InterfaceC3999a
    public final void payWithBinding(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String bindingId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(new SPayMethod.WithBinding(bindingId), new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @InterfaceC3999a
    public final void payWithBonuses(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(SPayMethod.WithBonuses.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @InterfaceC3999a
    public final void payWithPartPay(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(SPayMethod.WithPartPay.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @InterfaceC3999a
    public final void payWithPaymentAccounts(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, @NotNull String phoneNumber, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(new SPayMethod.WithPhoneNumber(SPaymentTool.PAYMENT_ACCOUNTS), new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, phoneNumber, callback));
    }

    @InterfaceC3999a
    public final void payWithoutRefresh(@NotNull Context context, @NotNull String apiKey, @NotNull String merchantLogin, @NotNull String bankInvoiceId, @NotNull String orderNumber, @NotNull String appPackage, String language, @NotNull Function1<? super PaymentResult, Unit> callback) {
        d a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (Ul.f30135a) {
            a11 = d.f98848g.a();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(merchantLogin, "merchantLogin");
        Intrinsics.checkNotNullParameter(bankInvoiceId, "bankInvoiceId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter("", "phoneNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a11.a(SPayMethod.WithoutRefresh.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void reInitialize$SPaySDK_baseRelease(@NotNull Context context, @NotNull Function1<? super InitializationResult, Unit> initializationResultCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationResultCallback, "initializationResultCallback");
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        C10727i.d(kotlin.coroutines.g.f71771a, new Sk(m11, this, initializationResultCallback, null));
        if (this.sdkComponent != null) {
            SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f32350a;
            if (sPaySdkInitConfig == null) {
                throw C4549q4.f31841a;
            }
            sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp reInitialize failed. Please initialize SDK again."));
            return;
        }
        SPaySdkInitConfig sPaySdkInitConfig2 = (SPaySdkInitConfig) m11.f71787a;
        if (sPaySdkInitConfig2 == null) {
            new C4738wl(this);
        } else {
            initialize(context, SPaySdkInitConfig.copy$default(sPaySdkInitConfig2, false, null, null, false, false, false, false, null, initializationResultCallback, 255, null));
            Unit unit = Unit.f71690a;
        }
    }

    public final void setDefaultPreferences$SPaySDK_baseRelease(@NotNull Ma ma2) {
        Intrinsics.checkNotNullParameter(ma2, "<set-?>");
        this.defaultPreferences = ma2;
    }

    public final void setLoggingContract$SPaySDK_baseRelease(@NotNull Tf tf2) {
        Intrinsics.checkNotNullParameter(tf2, "<set-?>");
        this.loggingContract = tf2;
    }

    public final void setSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease(@NotNull T8 t82) {
        Intrinsics.checkNotNullParameter(t82, "<set-?>");
        this.sPaySdkMerchantOptionsRepository = t82;
    }

    public final void setScope$SPaySDK_baseRelease(@NotNull M m11) {
        Intrinsics.checkNotNullParameter(m11, "<set-?>");
        this.scope = m11;
    }

    public final void setSdkComponent$SPaySDK_baseRelease(InterfaceC4273gh interfaceC4273gh) {
        this.sdkComponent = interfaceC4273gh;
    }

    public final void setSecurePreferences$SPaySDK_baseRelease(@NotNull Nh nh2) {
        Intrinsics.checkNotNullParameter(nh2, "<set-?>");
        this.securePreferences = nh2;
    }

    public final void a(Exception exc) {
        SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f32350a;
        if (sPaySdkInitConfig != null) {
            sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError(Nk.a.b("SPaySdkApp initialize with exception : ", exc.getMessage())));
            return;
        }
        throw C4549q4.f31841a;
    }

    public final synchronized void a(Context context) {
        if (this.sdkComponent != null) {
            return;
        }
        context.getClass();
        this.sdkComponent = new Yj(new G10.a(), new k0(), new Lh0.a(), new C8060b(), context);
    }
}
