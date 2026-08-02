package spay.sdk;

import B0.C2454a;
import Sc.r;
import Sc.s;
import Ve.Bi;
import Ve.C4180da;
import Ve.C4204e6;
import Ve.C4463n5;
import Ve.C4776y3;
import Ve.C4792yj;
import Ve.Ep;
import Ve.Fa;
import Ve.Hq;
import Ve.InterfaceC4273gh;
import Ve.InterfaceC4436m7;
import Ve.InterfaceC4686uq;
import Ve.Ld;
import Ve.Or;
import Ve.P0;
import Ve.Pe;
import Ve.Te;
import Ve.Ul;
import Ve.Ur;
import Ve.Vl;
import Ve.Vm;
import Ve.Wn;
import Ve.Y9;
import Ve.Yc;
import Ve.Yj;
import Ve.Yo;
import android.content.Context;
import android.provider.Settings;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SdkReadyCheckResult;
import spay.sdk.api.model.SPaymentRequest;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final Wn f98848g = new Wn();

    /* renamed from: h, reason: collision with root package name */
    public static volatile d f98849h;

    /* renamed from: a, reason: collision with root package name */
    public Vm f98850a;

    /* renamed from: b, reason: collision with root package name */
    public Yc f98851b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4436m7 f98852c;

    /* renamed from: d, reason: collision with root package name */
    public C4463n5 f98853d;

    /* renamed from: e, reason: collision with root package name */
    public final Te f98854e;

    /* renamed from: f, reason: collision with root package name */
    public final M f98855f;

    public d() {
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        this.f98854e = sdkComponent != null ? ((Yj) sdkComponent).c() : null;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f98855f = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11).plus(new P0(J.f105405n0)));
        a();
    }

    public final synchronized void a() {
        InterfaceC4273gh sdkComponent;
        try {
            if (Ul.f30136b == null && (sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent()) != null) {
                Ul.f30136b = new C4792yj(((Yj) sdkComponent).f30475c);
            }
            C4792yj c4792yj = Ul.f30136b;
            if (c4792yj != null) {
                this.f98850a = (Vm) c4792yj.f32584a.f30483k.get();
                this.f98851b = c4792yj.a();
                this.f98852c = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
                Vm vm = (Vm) c4792yj.f32584a.f30483k.get();
                Te c11 = c4792yj.f32584a.c();
                C4776y3 c4776y3 = (C4776y3) c4792yj.f32592i.get();
                InterfaceC4686uq interfaceC4686uq = (InterfaceC4686uq) c4792yj.f32584a.f30495w.get();
                Y9 y92 = (Y9) c4792yj.f32590g.get();
                Vl vl = (Vl) c4792yj.f32586c.get();
                C8060b c8060b = c4792yj.f32584a.f30474b;
                this.f98853d = new C4463n5(vm, c11, c4776y3, interfaceC4686uq, y92, vl, new Fa());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final SdkReadyCheckResult b(Context context) {
        if (this.f98853d != null) {
            return (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || Settings.Global.getInt(context.getContentResolver(), "always_finish_activities", 0) == 0) ? SdkReadyCheckResult.Ready.INSTANCE : new SdkReadyCheckResult.NotReady("Not ready for SPaySdk.");
        }
        throw C4204e6.f30913a;
    }

    public final void a(Context context, Function1 callback) {
        Object a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Ul.f30138d++;
        try {
            r.Companion companion = r.INSTANCE;
            callback.invoke(b(context));
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (r.b(a11) != null) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.d(He.b.f10879b, new Hq(context, callback, this, null));
        } else {
            boolean z11 = a11 instanceof r.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        Yo yo;
        int i11;
        dVar.getClass();
        if (cVar instanceof Yo) {
            yo = (Yo) cVar;
            int i12 = yo.f30516g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                yo.f30516g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = yo.f30514e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = yo.f30516g;
                if (i11 != 0) {
                    s.b(obj);
                    if (Ul.f30138d < 1) {
                        if (function1 != null) {
                            InterfaceC4436m7 interfaceC4436m7 = dVar.f98852c;
                            if (interfaceC4436m7 != null) {
                                yo.f30513d = function1;
                                yo.f30516g = 1;
                                obj = ((C4180da) interfaceC4436m7).b(yo);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            } else {
                                Intrinsics.n("userIdManager");
                                throw null;
                            }
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.TRUE;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = yo.f30513d;
                s.b(obj);
                function1.invoke(new PaymentResult.Error((String) obj, "000000000000", new MerchantError.IsReadyCheckHasNotBeenCalled(null, 1, null)));
                return Boolean.FALSE;
            }
        }
        yo = new Yo(dVar, cVar);
        Object obj2 = yo.f30514e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = yo.f30516g;
        if (i11 != 0) {
        }
        function1.invoke(new PaymentResult.Error((String) obj2, "000000000000", new MerchantError.IsReadyCheckHasNotBeenCalled(null, 1, null)));
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        Ep ep;
        int i11;
        dVar.getClass();
        if (cVar instanceof Ep) {
            ep = (Ep) cVar;
            int i12 = ep.f28950h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ep.f28950h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ep.f28948f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ep.f28950h;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC4436m7 interfaceC4436m7 = dVar.f98852c;
                    if (interfaceC4436m7 != null) {
                        ep.f28946d = str;
                        ep.f28947e = str2;
                        ep.f28950h = 1;
                        obj = ((C4180da) interfaceC4436m7).b(ep);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        Intrinsics.n("userIdManager");
                        throw null;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = ep.f28947e;
                    str = ep.f28946d;
                    s.b(obj);
                }
                return new PaymentResult.Error((String) obj, str, new MerchantError.RequiredDataNotSent(str2));
            }
        }
        ep = new Ep(dVar, cVar);
        Object obj2 = ep.f28948f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ep.f28950h;
        if (i11 != 0) {
        }
        return new PaymentResult.Error((String) obj2, str, new MerchantError.RequiredDataNotSent(str2));
    }

    public final void a(SPayMethod sPayMethod, SPaymentRequest sPaymentRequest) {
        Intrinsics.checkNotNullParameter(sPayMethod, "sPayMethod");
        Intrinsics.checkNotNullParameter(sPaymentRequest, "sPaymentRequest");
        C10727i.c(this.f98855f, null, null, new Or(sPaymentRequest, this, sPayMethod, null), 3);
    }

    public final Pair a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> b02 = C7714v.b0("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        ArrayList arrayList = new ArrayList();
        for (String str : b02) {
            if (androidx.core.content.a.checkSelfPermission(context, str) == -1) {
                arrayList.add(str);
            }
        }
        Pair pair = new Pair(Boolean.valueOf(arrayList.isEmpty()), arrayList);
        if (((Boolean) pair.e()).booleanValue()) {
            Te te2 = this.f98854e;
            if (te2 != null) {
                te2.b(new Bi(Ld.SC_GOOD_PERMISSIONS, Ur.MERCHANT_VIEW, Pe.SC, null, null, null, null, 120));
                return pair;
            }
        } else {
            Te te3 = this.f98854e;
            if (te3 != null) {
                te3.b(new Bi(Ld.SC_FAIL_PERMISSIONS, Ur.MERCHANT_VIEW, Pe.SC, C2454a.b("Denied", pair.f().toString()), null, null, null, 112));
            }
        }
        return pair;
    }
}
