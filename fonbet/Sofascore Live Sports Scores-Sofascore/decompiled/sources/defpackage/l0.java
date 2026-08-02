package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.chat.ChatImageUrls;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.newNetwork.post.ImageUploadResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.settings.about.AboutActivity;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    private final Object e(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            pr4 pr4Var = (pr4) this.t;
            int k = pr4Var.k() + 1;
            int i2 = b.i((gv9) this.u);
            if (k > i2) {
                k = i2;
            }
            this.s = 1;
            if (a6e.g(pr4Var, k, null, this, 6) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object f(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            n29 n29Var = (n29) this.t;
            this.s = 1;
            obj = n29Var.i(this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        ((Function1) this.u).invoke(c6o.z((a10) obj));
        return Unit.a;
    }

    private final Object g(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (((mn1) this.t).d > 9) {
                qug qugVar = (qug) this.u;
                int h = qugVar.e.h();
                this.s = 1;
                if (v8a.G(qugVar, h - qugVar.a.h(), this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object h(Object obj) {
        ie8 ie8Var = (ie8) this.t;
        ykj ykjVar = (ykj) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (ie8Var.g()) {
                m1d m1dVar = m1d.c;
                this.s = 1;
                if (ykjVar.c(m1dVar, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        if (ykjVar.b() && !ie8Var.g()) {
            ykjVar.a();
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new l0((AboutActivity) this.t, (String) obj2, rq3Var, 0);
            case 1:
                l0 l0Var = new l0((AbstractActivity) obj2, rq3Var, 1);
                l0Var.t = obj;
                return l0Var;
            case 2:
                return new l0((Function2) this.t, (x0) obj2, rq3Var, 2);
            case 3:
                return new l0((wzc) this.t, (sf9) obj2, rq3Var, 3);
            case 4:
                return new l0((wzc) this.t, (tf9) obj2, rq3Var, 4);
            case 5:
                return new l0((AbstractFragment) this.t, (r3) obj2, rq3Var, 5);
            case 6:
                l0 l0Var2 = new l0((AbstractFragment) obj2, rq3Var, 6);
                l0Var2.t = obj;
                return l0Var2;
            case 7:
                return new l0((Intent) this.t, (Context) obj2, rq3Var, 7);
            case 8:
                return new l0((hcd) this.t, (ct8) obj2, rq3Var, 8);
            case 9:
                return new l0((vj) this.t, (OddsCountryProvider) obj2, rq3Var, 9);
            case 10:
                return new l0((sw) this.t, (s85) obj2, rq3Var, 10);
            case 11:
                return new l0((i10) this.t, (f4a) obj2, rq3Var, 11);
            case 12:
                l0 l0Var3 = new l0((j20) obj2, rq3Var, 12);
                l0Var3.t = obj;
                return l0Var3;
            case 13:
                l0 l0Var4 = new l0((b2f) obj2, rq3Var, 13);
                l0Var4.t = obj;
                return l0Var4;
            case 14:
                return new l0((jwj) this.t, (z41) obj2, rq3Var, 14);
            case 15:
                return new l0((b1d) this.t, (z41) obj2, rq3Var, 15);
            case 16:
                return new l0((zj0) obj2, rq3Var, 16);
            case 17:
                l0 l0Var5 = new l0((ucd) obj2, rq3Var, 17);
                l0Var5.t = obj;
                return l0Var5;
            case 18:
                l0 l0Var6 = new l0((BaseActivity) obj2, rq3Var, 18);
                l0Var6.t = obj;
                return l0Var6;
            case 19:
                return new l0((y11) this.t, (Message) obj2, rq3Var, 19);
            case 20:
                return new l0((us2) this.t, (Uri) obj2, rq3Var, 20);
            case 21:
                l0 l0Var7 = new l0((g21) obj2, rq3Var, 21);
                l0Var7.t = obj;
                return l0Var7;
            case 22:
                return new l0((x21) this.t, (Event) obj2, rq3Var, 22);
            case 23:
                return new l0((j31) this.t, (ArrayList) obj2, rq3Var, 23);
            case 24:
                l0 l0Var8 = new l0((BaseModalBottomSheetDialog) obj2, rq3Var, 24);
                l0Var8.t = obj;
                return l0Var8;
            case 25:
                return new l0((pr4) this.t, (gv9) obj2, rq3Var, 25);
            case 26:
                return new l0((n29) this.t, (Function1) obj2, rq3Var, 26);
            case 27:
                return new l0((mn1) this.t, (qug) obj2, rq3Var, 27);
            case 28:
                return new l0((ie8) this.t, (ykj) obj2, rq3Var, 28);
            default:
                return new l0((su1) this.t, (String) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 12:
                ((l0) create((g4a) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 14:
                ((l0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 15:
                ((l0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((l0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0264, code lost:
    
        if (r2 == r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x023c, code lost:
    
        if (r2 == r1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x033d, code lost:
    
        if (r4.e() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x046e, code lost:
    
        if (r2 == r1) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04df, code lost:
    
        if (r1.collect(r2, r22) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04c9, code lost:
    
        if (defpackage.bea.R(r1, r22) == r0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x05fe, code lost:
    
        if (defpackage.bea.R(r1, r22) == r0) goto L298;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x057c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x0552 -> B:260:0x0556). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        List<ProviderOdds> list;
        ku3 ku3Var;
        Object r;
        u2g u2gVar;
        Object V;
        lgh lghVar;
        Object R;
        zdc zdcVar;
        Object P2;
        Object b;
        String string;
        int i = 10;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    bfk bfkVar = ((AboutActivity) this.t).N;
                    if (bfkVar == null) {
                        Intrinsics.i("userAccountManager");
                        throw null;
                    }
                    String str = (String) this.u;
                    this.s = 1;
                    if (bfkVar.a(str, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 != 0 && i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var2)) {
                    ((AbstractActivity) this.u).N();
                    long j = ke0.b * 1000;
                    this.t = ku3Var2;
                    this.s = 1;
                    if (n4o.y(j, this) == lu3Var2) {
                        return lu3Var2;
                    }
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Function2 function2 = (Function2) this.t;
                    x0 x0Var = (x0) this.u;
                    this.s = 1;
                    if (function2.invoke(x0Var, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    wzc wzcVar = (wzc) this.t;
                    sf9 sf9Var = (sf9) this.u;
                    this.s = 1;
                    if (wzcVar.a(sf9Var, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    wzc wzcVar2 = (wzc) this.t;
                    tf9 tf9Var = (tf9) this.u;
                    this.s = 1;
                    if (wzcVar2.a(tf9Var, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                AbstractFragment abstractFragment = (AbstractFragment) this.t;
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    SwipeRefreshLayout swipeRefreshLayout = abstractFragment.d;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(true);
                    }
                    r3 r3Var = (r3) this.u;
                    this.s = 1;
                    if (r3Var.invoke(this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                abstractFragment.n();
                return Unit.a;
            case 6:
                AbstractFragment abstractFragment2 = (AbstractFragment) this.u;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i11 = this.s;
                if (i11 != 0 && i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var3)) {
                    abstractFragment2.f = true;
                    abstractFragment2.u();
                    if (!abstractFragment2.g) {
                        return Unit.a;
                    }
                    long j2 = ke0.b * 1000;
                    this.t = ku3Var3;
                    this.s = 1;
                    if (n4o.y(j2, this) == lu3Var7) {
                        return lu3Var7;
                    }
                }
                return Unit.a;
            case 7:
                Intent intent = (Intent) this.t;
                lu3 lu3Var8 = lu3.a;
                int i12 = this.s;
                try {
                    if (i12 == 0) {
                        y6a.M(obj);
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            throw new IllegalArgumentException("The intent must have action parameters extras.");
                        }
                        Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                        if (bundle == null) {
                            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                        }
                        pzc A = zm2.A(new lc[0]);
                        LinkedHashMap linkedHashMap = A.a;
                        for (String str2 : bundle.keySet()) {
                            kc kcVar = new kc(str2);
                            Object obj2 = bundle.get(str2);
                            linkedHashMap.get(kcVar);
                            if (obj2 == null) {
                                linkedHashMap.remove(kcVar);
                            } else {
                                linkedHashMap.put(kcVar, obj2);
                            }
                        }
                        if (extras.containsKey("android.widget.extra.CHECKED")) {
                            kc kcVar2 = ktm.t;
                            Boolean valueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
                            linkedHashMap.get(kcVar2);
                            linkedHashMap.put(kcVar2, valueOf);
                        }
                        String string2 = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                        if (string2 == null) {
                            throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                        }
                        if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                            throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                        }
                        re0 re0Var = new re0(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
                        Context context = (Context) this.u;
                        this.s = 1;
                        Class<?> cls = Class.forName(string2);
                        if (!nb.class.isAssignableFrom(cls)) {
                            throw new IllegalStateException("Provided class must implement ActionCallback.");
                        }
                        Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                        newInstance.getClass();
                        Object a = ((nb) newInstance).a(context, re0Var, A, this);
                        if (a != lu3.a) {
                            a = Unit.a;
                        }
                        if (a == lu3Var8) {
                            return lu3Var8;
                        }
                    } else {
                        if (i12 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    Collection h = ((hcd) this.t).h();
                    if (h != null) {
                        Collection<String> collection = h;
                        ArrayList arrayList = new ArrayList(k13.r(collection, 10));
                        for (String str3 : collection) {
                            str3.getClass();
                            arrayList.add(new k38(str3));
                        }
                        Map o = wv8.o("Nimbus-Session-Id", gcd.a);
                        ct8 ct8Var = (ct8) this.u;
                        tyd tydVar = new tyd(i4, 13);
                        this.s = 1;
                        if (ztj.a(arrayList, o, ct8Var, null, tydVar, this, 4) == lu3Var9) {
                            return lu3Var9;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.u;
                vj vjVar = (vj) this.t;
                lu3 lu3Var10 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    umd umdVar = vjVar.l;
                    OddsEventUIModel oddsEventUIModel = vjVar.m;
                    int i15 = oddsEventUIModel.a;
                    String str4 = oddsEventUIModel.b;
                    boolean z = oddsEventUIModel.e;
                    this.s = 1;
                    umdVar.getClass();
                    P = yaa.P(new gmd(umdVar, oddsCountryProvider, str4, i15, z, null), this);
                    if (P == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                AllOddsResponse allOddsResponse = (AllOddsResponse) yaa.x((x2g) P);
                if (allOddsResponse == null || (list = allOddsResponse.getMarkets()) == null) {
                    list = km5.a;
                }
                vjVar.o(new fa(i4, vjVar, oddsCountryProvider, list));
                return Unit.a;
            case 10:
                sw swVar = (sw) this.t;
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    long f = vmk.f(((s85) this.u).a, swVar.G1() ? -1.0f : 1.0f);
                    float c = swVar.K == ewd.a ? vmk.c(f) : vmk.b(f);
                    this.s = 1;
                    if (swVar.F1(c, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else if (i16 == 1) {
                    y6a.M(obj);
                } else {
                    if (i16 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    Unit unit = Unit.a;
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    dt dtVar = new dt(15);
                    this.s = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            throw wt3.i(obj);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                b1d i18 = ((i10) this.t).i();
                if (i18 == null) {
                    return Unit.a;
                }
                f10 f10Var = new f10((f4a) this.u, i3);
                this.s = 2;
                aeh.m((aeh) i18, f10Var, this);
                return lu3Var12;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    g4a g4aVar = (g4a) this.t;
                    j20 j20Var = (j20) this.u;
                    this.t = g4aVar;
                    this.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(this));
                    lj2Var.t();
                    gdj gdjVar = j20Var.b;
                    sje sjeVar = gdjVar.a;
                    sjeVar.a();
                    gdjVar.b.set(new jdj(gdjVar, sjeVar));
                    lj2Var.v(new i20(i4, g4aVar, j20Var));
                    if (lj2Var.q() == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                    if (s9a.w(ku3Var)) {
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                    b2f b2fVar = (b2f) this.u;
                    int[] iArr = b2fVar.D;
                    if (b2fVar.isAttachedToWindow()) {
                        int i21 = iArr[0];
                        int i22 = iArr[1];
                        b2fVar.n.getLocationOnScreen(iArr);
                        if (i21 != iArr[0] || i22 != iArr[1]) {
                            b2fVar.o();
                        }
                    }
                    if (s9a.w(ku3Var)) {
                        ry ryVar = ry.o;
                        this.t = ku3Var;
                        this.s = 1;
                        if (getContext().get(mx9.d) != null) {
                            pvd.j();
                            return null;
                        }
                        if (bea.y(getContext()).p(ryVar, this) == lu3Var14) {
                            return lu3Var14;
                        }
                        b2f b2fVar2 = (b2f) this.u;
                        int[] iArr2 = b2fVar2.D;
                        if (b2fVar2.isAttachedToWindow()) {
                        }
                        if (s9a.w(ku3Var)) {
                            return Unit.a;
                        }
                    }
                }
                break;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                jwj jwjVar = (jwj) this.t;
                b40 b40Var = new b40((z41) this.u);
                this.s = 1;
                jwjVar.b(b40Var, this);
                return lu3Var15;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    dt dtVar2 = new dt(16);
                    this.s = 1;
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        pvd.x();
                        return null;
                    }
                    y6a.M(obj);
                }
                b1d b1dVar = (b1d) this.t;
                f10 f10Var2 = new f10((z41) this.u, i4);
                this.s = 2;
                break;
            case 16:
                zj0 zj0Var = (zj0) this.u;
                Object obj3 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    bpf bpfVar = (bpf) ((eoh) zj0Var.s).getValue();
                    ot9 ot9Var = (ot9) ((eoh) zj0Var.r).getValue();
                    it9 a2 = ot9.a(ot9Var);
                    a2.d = new sa0(zj0Var, i2);
                    a2.b();
                    gv4 gv4Var = ot9Var.w;
                    if (gv4Var.a == null) {
                        a2.s = new xj0(zj0Var);
                        a2.b();
                    }
                    if (gv4Var.b == 0) {
                        op3 op3Var = zj0Var.n;
                        int i26 = ajk.b;
                        a2.y = Intrinsics.c(op3Var, mp3.b) ? true : Intrinsics.c(op3Var, mp3.e) ? 2 : 1;
                    }
                    if (gv4Var.g != 1) {
                        a2.v = 2;
                    }
                    ot9 a3 = a2.a();
                    this.t = zj0Var;
                    this.s = 1;
                    bpfVar.getClass();
                    r = s9a.r(new v1f((Object) a3, (Object) bpfVar, (rq3) (objArr == true ? 1 : 0), 5), this);
                    break;
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zj0Var = (zj0) this.t;
                    y6a.M(obj);
                    r = obj;
                }
                xt9 xt9Var = (xt9) r;
                zj0Var.getClass();
                if (xt9Var instanceof fmi) {
                    fmi fmiVar = (fmi) xt9Var;
                    return new qj0(zj0Var.k(fmiVar.a), fmiVar);
                }
                if (!(xt9Var instanceof gq5)) {
                    zzl.b();
                    return null;
                }
                gq5 gq5Var = (gq5) xt9Var;
                Drawable drawable = gq5Var.a;
                obj3 = new mj0(drawable != null ? zj0Var.k(drawable) : null, gq5Var);
                return obj3;
            case 17:
                lu3 lu3Var17 = lu3.a;
                int i27 = this.s;
                try {
                    if (i27 == 0) {
                        y6a.M(obj);
                        ucd ucdVar = (ucd) this.u;
                        p2g p2gVar = w2g.b;
                        q3 q3Var = new q3(ucdVar, objArr2 == true ? 1 : 0, 4);
                        this.s = 1;
                        V = wba.V(500L, q3Var, this);
                        if (V == lu3Var17) {
                            return lu3Var17;
                        }
                    } else {
                        if (i27 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        V = obj;
                    }
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (V != null) {
                    throw new ClassCastException();
                }
                p2g p2gVar3 = w2g.b;
                u2gVar = null;
                if (u2gVar != null) {
                    return null;
                }
                return u2gVar;
            case 18:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var18 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    BaseActivity baseActivity = (BaseActivity) this.u;
                    v8l.D7.getClass();
                    k8l k8lVar = (k8l) u8l.b.getValue();
                    if (k8lVar == null) {
                        ngh nghVar = ngh.c;
                        if (ngh.c == null) {
                            ReentrantLock reentrantLock = ngh.d;
                            reentrantLock.lock();
                            try {
                                if (ngh.c == null) {
                                    try {
                                        hok b2 = kgh.b();
                                        if (b2 != null) {
                                            hok hokVar = hok.f;
                                            hokVar.getClass();
                                            Object value = b2.e.getValue();
                                            value.getClass();
                                            Object value2 = hokVar.e.getValue();
                                            value2.getClass();
                                            if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                                lghVar = new lgh(baseActivity);
                                                break;
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                    lghVar = null;
                                    ngh.c = new ngh(lghVar);
                                }
                                Unit unit2 = Unit.a;
                                reentrantLock.unlock();
                            } catch (Throwable th2) {
                                reentrantLock.unlock();
                                throw th2;
                            }
                        }
                        k8lVar = ngh.c;
                        k8lVar.getClass();
                    }
                    e3c e3cVar = new e3c(new lal(), k8lVar, new zid());
                    u8l.c.getClass();
                    th2 q = yso.q(new h4i((Object) e3cVar, (Object) baseActivity, (rq3) (objArr3 == true ? 1 : 0), 28));
                    hs4 hs4Var = z45.a;
                    z88 g0 = k53.g0(q, rob.a);
                    nk0 nk0Var = new nk0(ku3Var4, baseActivity, baseActivity);
                    this.t = null;
                    this.s = 1;
                    if (g0.collect(nk0Var, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                lu3 lu3Var19 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = ((y11) this.t).e;
                    int id = ((Message) this.u).getId();
                    this.s = 1;
                    cs2Var.getClass();
                    if (yaa.P(new xr2(cs2Var, id, objArr4 == true ? 1 : 0, i3), this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                us2 us2Var = (us2) this.t;
                lu3 lu3Var20 = lu3.a;
                int i30 = this.s;
                ChatImageUrls chatImageUrls = null;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                if (i30 == 0) {
                    y6a.M(obj);
                    Context i31 = us2Var.i();
                    Uri uri = (Uri) this.u;
                    this.s = 1;
                    Size size = new Size(600, 600);
                    hs4 hs4Var2 = z45.a;
                    R = xw3.R(hq4.c, new zi7((Object) i31, (Object) uri, (Object) size, (rq3) (objArr6 == true ? 1 : 0), 13), this);
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        P2 = obj;
                        x2g x2gVar = (x2g) P2;
                        yzc yzcVar = us2Var.l;
                        if (x2gVar instanceof v2g) {
                            chatImageUrls = ((ImageUploadResponse) ((v2g) x2gVar).a).getImageUrls();
                        } else {
                            if (!(x2gVar instanceof t2g)) {
                                zzl.b();
                                return null;
                            }
                            us2Var.j.j(((t2g) x2gVar).a.getMessage());
                        }
                        yzcVar.j(chatImageUrls);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                byte[] bArr = (byte[]) R;
                if (bArr != null) {
                    xzf xzfVar = yzf.Companion;
                    Regex regex = zdc.e;
                    try {
                        zdcVar = bea.v("image/jpeg");
                    } catch (IllegalArgumentException unused3) {
                        zdcVar = null;
                    }
                    wzf d = xzf.d(xzfVar, bArr, zdcVar, 0, 6);
                    cs2 cs2Var2 = us2Var.e;
                    this.s = 2;
                    cs2Var2.getClass();
                    P2 = yaa.P(new cl(cs2Var2, d, objArr7 == true ? 1 : 0, 6), this);
                    break;
                }
                return Unit.a;
            case 21:
                lu3 lu3Var21 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    k8f k8fVar = (k8f) this.t;
                    g21 g21Var = (g21) this.u;
                    f21 f21Var = new f21(g21Var, k8fVar);
                    um3 um3Var = g21Var.a;
                    um3Var.getClass();
                    synchronized (um3Var.c) {
                        try {
                            if (um3Var.d.add(f21Var)) {
                                if (um3Var.d.size() == 1) {
                                    um3Var.e = um3Var.a();
                                    rik o2 = rik.o();
                                    int i33 = vm3.a;
                                    Objects.toString(um3Var.e);
                                    o2.getClass();
                                    um3Var.c();
                                }
                                f21Var.a(um3Var.e);
                            }
                            Unit unit3 = Unit.a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    j4 j4Var = new j4(14, (g21) this.u, f21Var);
                    this.s = 1;
                    if (v7a.i(k8fVar, j4Var, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var22 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    x21 x21Var = (x21) this.t;
                    Event event = (Event) this.u;
                    this.s = 1;
                    if (x21Var.u(event, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                j31 j31Var = (j31) this.t;
                lu3 lu3Var23 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    gzh gzhVar = j31Var.e;
                    this.s = 1;
                    b = gzhVar.b(this);
                    if (b == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                List list2 = (List) b;
                fdi fdiVar = j31Var.g;
                ArrayList arrayList2 = (ArrayList) this.u;
                while (true) {
                    Object value3 = fdiVar.getValue();
                    List<String> H0 = CollectionsKt.H0(arrayList2, new h31(list2, i3));
                    ArrayList arrayList3 = new ArrayList(k13.r(H0, i));
                    for (String str5 : H0) {
                        if (list2.contains(str5)) {
                            string = wyh.c(j31Var.i(), str5);
                        } else {
                            string = j31Var.i().getString(R.string.all_sports);
                            string.getClass();
                        }
                        String str6 = string;
                        String str7 = str5.length() > 0 ? str5 : null;
                        Integer num = str7 != null ? new Integer(wyh.a(str7)) : null;
                        arrayList3.add(new vt2(str5, str6, false, num != null ? new tc3(1288201422, new g31(num, i3), true) : null, null, null, null, 244));
                    }
                    if (fdiVar.k(value3, arrayList3)) {
                        return Unit.a;
                    }
                    i = 10;
                }
            case 24:
                BaseModalBottomSheetDialog baseModalBottomSheetDialog = (BaseModalBottomSheetDialog) this.u;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var24 = lu3.a;
                int i36 = this.s;
                if (i36 != 0 && i36 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var5)) {
                    baseModalBottomSheetDialog.E();
                    long v = baseModalBottomSheetDialog.getV() * 1000;
                    this.t = ku3Var5;
                    this.s = 1;
                    if (n4o.y(v, this) == lu3Var24) {
                        return lu3Var24;
                    }
                }
                return Unit.a;
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                lu3 lu3Var25 = lu3.a;
                int i37 = this.s;
                if (i37 != 0) {
                    if (i37 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                umd umdVar2 = ((su1) this.t).e;
                String str8 = (String) this.u;
                this.s = 1;
                umdVar2.getClass();
                Object P3 = yaa.P(new cmd(i3, objArr5 == true ? 1 : 0, umdVar2, str8), this);
                return P3 == lu3Var25 ? lu3Var25 : P3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
