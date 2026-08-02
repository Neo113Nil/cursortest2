package hd;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.sports.insider.MyApp;
import com.sports.insider.ui.settings.SettingFragment;
import com.sports.insider.ui.views.SwitchButton;
import eg.c0;
import eg.m0;
import hg.d1;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import le.z;
import okio.Segment;
import pd.v;
import pe.s;
import q4.r;
import rc.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10531b;

    /* renamed from: c, reason: collision with root package name */
    public int f10532c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, boolean z5, Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f10531b = i5;
        this.f10533d = context;
        this.f10534e = z5;
        this.f10535f = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f10531b) {
            case 0:
                return new g((Context) this.f10533d, this.f10534e, (l1.a) this.f10535f, continuation, 0);
            case 1:
                return new g((Context) this.f10533d, this.f10534e, (z) this.f10535f, continuation, 1);
            case 2:
                return new g((me.h) this.f10535f, this.f10534e, continuation);
            case 3:
                return new g((SettingFragment) this.f10533d, (SwitchButton) this.f10535f, this.f10534e, continuation);
            case 4:
                return new g((w) this.f10533d, continuation, (Function1) this.f10535f, this.f10534e);
            default:
                return new g((s) this.f10533d, (Function2) this.f10535f, this.f10534e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f10531b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e A[Catch: all -> 0x0137, Exception -> 0x013a, TRY_LEAVE, TryCatch #3 {Exception -> 0x013a, blocks: (B:67:0x0132, B:74:0x0147, B:77:0x0180, B:82:0x019e, B:83:0x014b, B:85:0x016f, B:90:0x0154), top: B:62:0x012a, outer: #6 }] */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Bundle x10;
        Object q;
        kc.b bVar;
        Object A;
        Object b10;
        Object A2;
        int i5 = this.f10531b;
        int i10 = 18;
        i10 = 18;
        boolean z5 = this.f10534e;
        Object obj2 = this.f10535f;
        int i11 = 1;
        switch (i5) {
            case 0:
                Context context = (Context) this.f10533d;
                boolean z7 = this.f10534e;
                l1.a aVar = (l1.a) obj2;
                Object obj3 = lf.a.f20034a;
                int i12 = this.f10532c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    try {
                        try {
                            String packageName = context.getPackageName();
                            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                            Intrinsics.checkNotNullParameter(packageName, "packageName");
                            intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                        } catch (Exception e7) {
                            zc.d.b(6, null, e7);
                            l1.a.E();
                        }
                    } catch (ActivityNotFoundException e9) {
                        e = e9;
                        intent2 = null;
                    } catch (SecurityException unused) {
                        intent = null;
                    }
                    try {
                        Intent flags = intent3.setFlags(67108864);
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 24 || i13 >= 28) {
                            flags.addFlags(268435456);
                        }
                        if (i13 >= 30 && z7) {
                            flags.addFlags(Segment.SHARE_MINIMUM);
                        }
                        context.startActivity(flags);
                    } catch (ActivityNotFoundException e10) {
                        e = e10;
                        intent2 = intent3;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "ActivityNotFoundException";
                        }
                        zc.d.c(message, null);
                        if (intent2 != null && !z7) {
                            this.f10532c = 1;
                            Object i14 = c0.i(new e(intent2, false, context, aVar, null), this);
                            Object obj4 = i14;
                            if (i14 != lf.a.f20034a) {
                                obj4 = Unit.f19194a;
                            }
                            if (obj4 == obj3) {
                                return obj3;
                            }
                        } else if (z7) {
                            l1.a.f(aVar);
                        } else {
                            l1.a.E();
                        }
                        return Unit.f19194a;
                    } catch (SecurityException unused2) {
                        intent = intent3;
                        if (intent != null) {
                            this.f10532c = 2;
                            Object i15 = c0.i(new e(intent, z7, context, aVar, null), this);
                            Object obj5 = i15;
                            if (i15 != lf.a.f20034a) {
                                obj5 = Unit.f19194a;
                            }
                            if (obj5 == obj3) {
                                return obj3;
                            }
                        } else if (z7) {
                            l1.a.f(aVar);
                        } else {
                            l1.a.E();
                        }
                        return Unit.f19194a;
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i16 = this.f10532c;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        sd.b bVar2 = new sd.b((Context) this.f10533d, 2);
                        z zVar = (z) obj2;
                        if (z5) {
                            ic.a aVar3 = zVar.f20019p;
                            x10 = com.google.android.play.core.appupdate.b.y(aVar3 != null ? aVar3.f11064l : null);
                        } else {
                            ic.a aVar4 = zVar.f20020r;
                            x10 = com.google.android.play.core.appupdate.b.x(aVar4 != null ? aVar4.f11064l : 0);
                        }
                        this.f10532c = 1;
                        if (bVar2.d(x10, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e11) {
                    zc.d.b(4, "showHintMessL", e11);
                }
                return Unit.f19194a;
            case 2:
                me.h hVar = (me.h) obj2;
                l1.a aVar5 = hVar.f20612b;
                d1 d1Var = hVar.f20625i;
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f10532c;
                try {
                    try {
                    } catch (Exception ex) {
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar = MyApp.f6830c;
                        lg.e eVar = m0.f9201a;
                        c0.t(dVar, lg.d.f20063c, null, new r(ex, r8, i10), 2);
                    }
                    if (i17 == 0) {
                        h8.b.B(obj);
                        Boolean bool = Boolean.TRUE;
                        d1Var.getClass();
                        d1Var.k(null, bool);
                        Integer num = new Integer(hVar.f20619f);
                        this.f10532c = 1;
                        aVar5.getClass();
                        q = l1.a.q(num, this);
                        if (q == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                return Unit.f19194a;
                            }
                            bVar = (kc.b) this.f10533d;
                            h8.b.B(obj);
                            if (bVar != null || z5) {
                                Integer num2 = new Integer(hVar.f20619f);
                                this.f10533d = null;
                                this.f10532c = 3;
                                aVar5.getClass();
                                lg.e eVar2 = m0.f9201a;
                                A = c0.A(lg.d.f20063c, new id.i(num2, true, aVar5, (Continuation) null), this);
                                if (A == aVar6) {
                                    A = Unit.f19194a;
                                }
                                if (A == aVar6) {
                                    return aVar6;
                                }
                            }
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        q = obj;
                    }
                    bVar = (kc.b) q;
                    this.f10533d = bVar;
                    this.f10532c = 2;
                    if (hVar.j(bVar, this) == aVar6) {
                        return aVar6;
                    }
                    if (bVar != null) {
                    }
                    Integer num22 = new Integer(hVar.f20619f);
                    this.f10533d = null;
                    this.f10532c = 3;
                    aVar5.getClass();
                    lg.e eVar22 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new id.i(num22, true, aVar5, (Continuation) null), this);
                    if (A == aVar6) {
                    }
                    if (A == aVar6) {
                    }
                    return Unit.f19194a;
                } finally {
                    Boolean bool2 = Boolean.FALSE;
                    d1Var.getClass();
                    d1Var.k(null, bool2);
                }
            case 3:
                SwitchButton switchButton = (SwitchButton) obj2;
                SettingFragment settingFragment = (SettingFragment) this.f10533d;
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f10532c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    oe.k M = settingFragment.M();
                    this.f10532c = 1;
                    M.getClass();
                    gf.k.b(new v(9));
                    b10 = new zc.j().b(this);
                    if (b10 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        A2 = obj;
                        if (!((Boolean) A2).booleanValue()) {
                            switchButton.d(false, false);
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    b10 = obj;
                }
                if (!Intrinsics.areEqual((Boolean) b10, Boolean.TRUE)) {
                    switchButton.d(false, false);
                    return Unit.f19194a;
                }
                oe.k M2 = settingFragment.M();
                this.f10532c = 2;
                M2.getClass();
                m7.b bVar3 = new m7.b();
                lg.e eVar3 = m0.f9201a;
                A2 = c0.A(lg.d.f20063c, new t(bVar3, z5, r8, i11), this);
                if (A2 == aVar7) {
                    return aVar7;
                }
                if (!((Boolean) A2).booleanValue()) {
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar8 = lf.a.f20034a;
                int i19 = this.f10532c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                w wVar = (w) this.f10533d;
                id.i iVar = new id.i(wVar, (Continuation) null, (Function1) obj2, z5);
                this.f10532c = 1;
                Object s8 = wVar.s(z5, iVar, this);
                return s8 == aVar8 ? aVar8 : s8;
            default:
                d1 d1Var2 = ((s) this.f10533d).f21871k;
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f10532c;
                try {
                    try {
                        if (i20 == 0) {
                            h8.b.B(obj);
                            Boolean bool3 = Boolean.TRUE;
                            d1Var2.getClass();
                            d1Var2.k(null, bool3);
                            Boolean valueOf = Boolean.valueOf(z5);
                            this.f10532c = 1;
                            Object invoke = ((FunctionReferenceImpl) obj2).invoke(valueOf, this);
                            i10 = invoke;
                            if (invoke == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                        }
                    } finally {
                        Boolean bool4 = Boolean.FALSE;
                        d1Var2.getClass();
                        d1Var2.k(null, bool4);
                    }
                } catch (Exception ex2) {
                    Intrinsics.checkNotNullParameter(ex2, "ex");
                    jg.d dVar2 = MyApp.f6830c;
                    lg.e eVar4 = m0.f9201a;
                    c0.t(dVar2, lg.d.f20063c, null, new r(ex2, r8, i10), 2);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SettingFragment settingFragment, SwitchButton switchButton, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f10531b = 3;
        this.f10533d = settingFragment;
        this.f10535f = switchButton;
        this.f10534e = z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar, Continuation continuation, Function1 function1, boolean z5) {
        super(2, continuation);
        this.f10531b = 4;
        this.f10533d = wVar;
        this.f10534e = z5;
        this.f10535f = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(me.h hVar, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f10531b = 2;
        this.f10535f = hVar;
        this.f10534e = z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(s sVar, Function2 function2, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f10531b = 5;
        this.f10533d = sVar;
        this.f10535f = (FunctionReferenceImpl) function2;
        this.f10534e = z5;
    }
}
