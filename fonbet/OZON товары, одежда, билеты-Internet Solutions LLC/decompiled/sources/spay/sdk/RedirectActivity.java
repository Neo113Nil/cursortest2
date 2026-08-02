package spay.sdk;

import Sc.o;
import Sc.s;
import Ve.C4085a2;
import Ve.C4123bb;
import Ve.C4180da;
import Ve.C4224eq;
import Ve.C4238fb;
import Ve.C4312hr;
import Ve.C4345j3;
import Ve.C4427lr;
import Ve.C4463n5;
import Ve.C4644td;
import Ve.C4654tn;
import Ve.C4661u1;
import Ve.C4673ud;
import Ve.C4731we;
import Ve.C4744x;
import Ve.C4776y3;
import Ve.C4811za;
import Ve.C4816zf;
import Ve.Dq;
import Ve.EnumC4290h5;
import Ve.EnumC4801z0;
import Ve.InterfaceC4436m7;
import Ve.M8;
import Ve.Oc;
import Ve.Rq;
import Ve.Sd;
import Ve.Ul;
import Ve.Vf;
import Ve.Wk;
import Ve.Y9;
import Ve.Yc;
import Ve.Ze;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.g;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import spay.sdk.api.ErrorCode;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.domain.model.AuthMethod;
import spay.sdk.domain.model.response.ErrorEntity;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lspay/sdk/RedirectActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RedirectActivity extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f98831g = 0;

    /* renamed from: a, reason: collision with root package name */
    public Rq f98832a;

    /* renamed from: b, reason: collision with root package name */
    public C4744x f98833b;

    /* renamed from: c, reason: collision with root package name */
    public C4463n5 f98834c;

    /* renamed from: d, reason: collision with root package name */
    public Yc f98835d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4436m7 f98836e;

    /* renamed from: f, reason: collision with root package name */
    public WebView f98837f;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        C4224eq c4224eq;
        int i11;
        RedirectActivity redirectActivity2;
        C4427lr c4427lr;
        if (cVar instanceof C4224eq) {
            c4224eq = (C4224eq) cVar;
            int i12 = c4224eq.f30957h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4224eq.f30957h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4224eq.f30955f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4224eq.f30957h;
                if (i11 != 0) {
                    s.b(obj);
                    if (redirectActivity.f98832a == null && Ul.f30136b == null) {
                        C4427lr c4427lr2 = Ul.f30137c;
                        if (c4427lr2 != null) {
                            InterfaceC4436m7 interfaceC4436m7 = redirectActivity.f98836e;
                            if (interfaceC4436m7 == null) {
                                Intrinsics.n("userIdManager");
                                throw null;
                            }
                            c4224eq.f30953d = redirectActivity;
                            c4224eq.f30954e = c4427lr2;
                            c4224eq.f30957h = 1;
                            Object b11 = ((C4180da) interfaceC4436m7).b(c4224eq);
                            if (b11 == aVar) {
                                return aVar;
                            }
                            redirectActivity2 = redirectActivity;
                            c4427lr = c4427lr2;
                            obj = b11;
                        }
                        redirectActivity.finish();
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4427lr = c4224eq.f30954e;
                redirectActivity2 = c4224eq.f30953d;
                s.b(obj);
                c4427lr.invoke(new PaymentResult.Error((String) obj, ErrorCode.INNER_COMPONENTS_HAS_NOT_BEEN_INITIALIZED_ON_COMPONENT_READY_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
                redirectActivity = redirectActivity2;
                redirectActivity.finish();
                return Unit.f71690a;
            }
        }
        c4224eq = new C4224eq(redirectActivity, cVar);
        Object obj2 = c4224eq.f30955f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4224eq.f30957h;
        if (i11 != 0) {
        }
        c4427lr.invoke(new PaymentResult.Error((String) obj2, ErrorCode.INNER_COMPONENTS_HAS_NOT_BEEN_INITIALIZED_ON_COMPONENT_READY_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
        redirectActivity = redirectActivity2;
        redirectActivity.finish();
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        Dq dq;
        int i11;
        RedirectActivity redirectActivity2;
        C4427lr c4427lr;
        C4744x c4744x;
        if (cVar instanceof Dq) {
            dq = (Dq) cVar;
            int i12 = dq.f28888h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dq.f28888h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dq.f28886f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dq.f28888h;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c4744x = (C4744x) dq.f28884d;
                        s.b(obj);
                        c4744x.f32400E = ((Boolean) obj).booleanValue();
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4427lr = dq.f28885e;
                    redirectActivity2 = (RedirectActivity) dq.f28884d;
                    s.b(obj);
                    c4427lr.invoke(new PaymentResult.Error((String) obj, ErrorCode.BANK_AUTHENTICATOR_DEPENDENCY_IS_NOT_INITIALIZED_ON_MOBILE_APP_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
                    redirectActivity = redirectActivity2;
                    redirectActivity.finish();
                    return Unit.f71690a;
                }
                s.b(obj);
                C4463n5 c4463n5 = redirectActivity.f98834c;
                if (c4463n5 == null) {
                    C4427lr c4427lr2 = Ul.f30137c;
                    if (c4427lr2 != null) {
                        InterfaceC4436m7 interfaceC4436m7 = redirectActivity.f98836e;
                        if (interfaceC4436m7 == null) {
                            Intrinsics.n("userIdManager");
                            throw null;
                        }
                        dq.f28884d = redirectActivity;
                        dq.f28885e = c4427lr2;
                        dq.f28888h = 2;
                        Object b11 = ((C4180da) interfaceC4436m7).b(dq);
                        if (b11 != aVar) {
                            redirectActivity2 = redirectActivity;
                            c4427lr = c4427lr2;
                            obj = b11;
                            c4427lr.invoke(new PaymentResult.Error((String) obj, ErrorCode.BANK_AUTHENTICATOR_DEPENDENCY_IS_NOT_INITIALIZED_ON_MOBILE_APP_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
                            redirectActivity = redirectActivity2;
                        }
                    }
                    redirectActivity.finish();
                    return Unit.f71690a;
                }
                C4744x c4744x2 = redirectActivity.f98833b;
                if (c4744x2 == null) {
                    Intrinsics.n("viewModel");
                    throw null;
                }
                dq.f28884d = c4744x2;
                dq.f28888h = 1;
                obj = c4463n5.a(redirectActivity, dq);
                if (obj != aVar) {
                    c4744x = c4744x2;
                    c4744x.f32400E = ((Boolean) obj).booleanValue();
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        dq = new Dq(redirectActivity, cVar);
        Object obj2 = dq.f28886f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dq.f28888h;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        C4312hr c4312hr;
        int i11;
        RedirectActivity redirectActivity2;
        C4427lr c4427lr;
        if (cVar instanceof C4312hr) {
            c4312hr = (C4312hr) cVar;
            int i12 = c4312hr.f31221h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4312hr.f31221h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4312hr.f31219f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4312hr.f31221h;
                if (i11 != 0) {
                    s.b(obj);
                    Rq rq2 = redirectActivity.f98832a;
                    if (rq2 != null) {
                        redirectActivity.f98833b = (C4744x) new z0(redirectActivity, rq2).a(C4744x.class);
                        return Unit.f71690a;
                    }
                    C4427lr c4427lr2 = Ul.f30137c;
                    if (c4427lr2 != null) {
                        InterfaceC4436m7 interfaceC4436m7 = redirectActivity.f98836e;
                        if (interfaceC4436m7 == null) {
                            Intrinsics.n("userIdManager");
                            throw null;
                        }
                        c4312hr.f31217d = redirectActivity;
                        c4312hr.f31218e = c4427lr2;
                        c4312hr.f31221h = 1;
                        Object b11 = ((C4180da) interfaceC4436m7).b(c4312hr);
                        if (b11 == aVar) {
                            return aVar;
                        }
                        redirectActivity2 = redirectActivity;
                        c4427lr = c4427lr2;
                        obj = b11;
                    }
                    redirectActivity.finish();
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4427lr = c4312hr.f31218e;
                redirectActivity2 = c4312hr.f31217d;
                s.b(obj);
                c4427lr.invoke(new PaymentResult.Error((String) obj, "000000000000", new MerchantError.UnexpectedError("Ошибка внутренних компонентов SPaySdk")));
                redirectActivity = redirectActivity2;
                redirectActivity.finish();
                return Unit.f71690a;
            }
        }
        c4312hr = new C4312hr(redirectActivity, cVar);
        Object obj2 = c4312hr.f31219f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4312hr.f31221h;
        if (i11 != 0) {
        }
        c4427lr.invoke(new PaymentResult.Error((String) obj2, "000000000000", new MerchantError.UnexpectedError("Ошибка внутренних компонентов SPaySdk")));
        redirectActivity = redirectActivity2;
        redirectActivity.finish();
        return Unit.f71690a;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C10727i.c(K.a(this), null, null, new C4811za(this, bundle, (kotlin.coroutines.d) null), 3);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    public final void onDestroy() {
        C4744x c4744x = this.f98833b;
        if (c4744x != null) {
            c4744x.f32423l.f32533a = false;
        }
        Yc yc2 = this.f98835d;
        if (yc2 != null) {
            C10727i.c(SPaySdkApp.INSTANCE.getInstance().getScope(), null, null, new C4345j3(yc2, (kotlin.coroutines.d) null), 3);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        M1.b payStatus;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Parcelable parcelableExtra = intent.getParcelableExtra("PAYMENT_RESULT");
        PaymentResult paymentResult = parcelableExtra instanceof PaymentResult ? (PaymentResult) parcelableExtra : null;
        if (paymentResult != null) {
            C4744x c4744x = this.f98833b;
            if (c4744x == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            Intrinsics.checkNotNullParameter(paymentResult, "<this>");
            boolean z11 = paymentResult instanceof PaymentResult.Error;
            M1.b bVar = Ze.f30586a;
            C4731we c4731we = C4731we.f32365a;
            if (z11) {
                payStatus = new Sd(ErrorEntity.Unknown.INSTANCE);
            } else if (paymentResult instanceof PaymentResult.Processing) {
                payStatus = c4731we;
            } else if (paymentResult instanceof PaymentResult.Success) {
                payStatus = bVar;
            } else {
                if (!(paymentResult instanceof PaymentResult.Cancel)) {
                    throw new o();
                }
                payStatus = new Sd(ErrorEntity.CanceledByUser.INSTANCE);
            }
            Intrinsics.checkNotNullParameter(payStatus, "payStatus");
            if (payStatus instanceof Sd) {
                bVar = new Sd(((Sd) payStatus).f29970a);
            } else if (payStatus instanceof C4731we) {
                bVar = c4731we;
            } else if (!(payStatus instanceof Ze)) {
                throw new o();
            }
            ((C4238fb) c4744x.f32424m).b(new C4085a2(bVar));
        }
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onResume() {
        super.onResume();
        C4744x c4744x = this.f98833b;
        if (c4744x == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        C4776y3 c4776y3 = c4744x.f32423l;
        if (c4776y3.f32533a) {
            return;
        }
        c4776y3.f32533a = true;
        EnumC4801z0 enumC4801z0 = ((C4673ud) c4744x.f32412a).a().f29004a instanceof C4816zf ? EnumC4801z0.f32616b : EnumC4801z0.f32615a;
        boolean z11 = ((C4654tn) c4744x.f32413b).j() instanceof AuthMethod.ByPhoneNumber;
        Y9 y92 = c4744x.f32424m;
        if (z11 && Lf.a.r0(c4744x.f32422k, EnumC4290h5.PHONE_NUMBER_AUTH, null) && Wk.f30290b != 6) {
            C4661u1 block = new C4661u1(c4744x, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            ((C4238fb) y92).b(new C4644td(enumC4801z0));
        } else if (enumC4801z0 == EnumC4801z0.f32616b) {
            ((C4238fb) y92).b(new Oc(Vf.f30201a, false));
        } else {
            ((C4238fb) y92).b(new C4085a2(new Sd(ErrorEntity.Unknown.INSTANCE)));
        }
    }

    public static final void a(RedirectActivity redirectActivity) {
        LinearLayout linearLayout = new LinearLayout(redirectActivity);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        WebView webView = new WebView(redirectActivity);
        redirectActivity.f98837f = webView;
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setDomStorageEnabled(true);
        }
        WebView webView2 = redirectActivity.f98837f;
        if (webView2 != null) {
            webView2.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        }
        linearLayout.addView(redirectActivity.f98837f);
    }

    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Hm0.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                RedirectActivity.a(RedirectActivity.this, thread, th2);
            }
        });
    }

    public static final void a(RedirectActivity this$0, Thread thread, Throwable exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4744x c4744x = this$0.f98833b;
        if (c4744x != null) {
            Intrinsics.checkNotNullExpressionValue(exception, "exception");
            Intrinsics.checkNotNullParameter(exception, "exception");
            C10727i.c(x0.a(c4744x), null, null, new M8(exception, c4744x, (kotlin.coroutines.d) null), 3);
            C4123bb block = new C4123bb(this$0, exception);
            Intrinsics.checkNotNullParameter(block, "block");
            return;
        }
        Intrinsics.n("viewModel");
        throw null;
    }
}
