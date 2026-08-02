package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.BaseAdUnit;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i11 extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ u11 u;
    public final /* synthetic */ esf v;
    public final /* synthetic */ AdManagerAdView w;
    public final /* synthetic */ ng x;
    public final /* synthetic */ tm8 y;
    public final /* synthetic */ AdSize[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i11(boolean z, u11 u11Var, esf esfVar, AdManagerAdView adManagerAdView, ng ngVar, tm8 tm8Var, AdSize[] adSizeArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = z;
        this.u = u11Var;
        this.v = esfVar;
        this.w = adManagerAdView;
        this.x = ngVar;
        this.y = tm8Var;
        this.z = adSizeArr;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        i11 i11Var = new i11(this.t, this.u, this.v, this.w, this.x, this.y, this.z, rq3Var);
        i11Var.s = obj;
        return i11Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i11) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(3:10|11|12)|13|14|15|16|(1:201)(8:18|(1:20)(1:200)|21|22|(1:199)(1:26)|(1:198)|30|31)|32|(1:34)|35|(3:37|(1:193)(1:41)|42)(2:194|195)|43|(1:45)|46|47|(2:191|192)(3:49|(1:51)(1:189)|188)) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:62|(1:63)|64|66|67|68|69|70|71|72|73|74|75|76|77|(6:129|130|131|(14:133|134|135|136|137|138|139|(1:141)|(2:151|152)(1:143)|144|145|146|147|149)|165|166)(1:79)|80|81|(3:113|114|(15:116|117|118|84|85|87|88|89|90|91|92|93|94|(15:96|13|14|15|16|(0)(0)|32|(0)|35|(0)(0)|43|(0)|46|47|(0)(0))|188))|83|84|85|87|88|89|90|91|92|93|94|(0)|188) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:62|63|64|66|67|68|69|70|71|72|73|74|75|76|77|(6:129|130|131|(14:133|134|135|136|137|138|139|(1:141)|(2:151|152)(1:143)|144|145|146|147|149)|165|166)(1:79)|80|81|(3:113|114|(15:116|117|118|84|85|87|88|89|90|91|92|93|94|(15:96|13|14|15|16|(0)(0)|32|(0)|35|(0)(0)|43|(0)|46|47|(0)(0))|188))|83|84|85|87|88|89|90|91|92|93|94|(0)|188) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0219, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021a, code lost:
    
        r19 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0221, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0222, code lost:
    
        r4 = r8;
        r19 = r9;
        r22 = r17;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022a, code lost:
    
        r21 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x023f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0240, code lost:
    
        r21 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0242, code lost:
    
        r20 = r4;
        r23 = r6;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0260, code lost:
    
        r22 = r17;
        r19 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0248, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0249, code lost:
    
        r21 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x024c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x024d, code lost:
    
        r20 = r4;
        r23 = r6;
        r4 = r8;
        r22 = r17;
        r19 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0258, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0259, code lost:
    
        r20 = r4;
        r23 = r6;
        r4 = r8;
        r21 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00ac, code lost:
    
        if (r5.b(r9, r6, r29) == r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0212, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
    
        if (r5.k(r9, r6, r29) == r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        if (defpackage.u11.s(r5, r0, new android.graphics.Rect(), new android.graphics.Point(), r29) == r14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0215, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0216, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0266 -> B:15:0x020f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x020a -> B:13:0x020b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fdi fdiVar;
        int i;
        int i2;
        BaseAdUnit baseAdUnit;
        char c;
        Throwable th;
        Object u2gVar;
        boolean z;
        lu3 lu3Var;
        esf esfVar;
        wcd wcdVar;
        FragmentActivity fragmentActivity;
        int intValue;
        char c2;
        Object a;
        int i3;
        Throwable a2;
        String message;
        int i4;
        ng ngVar = this.x;
        int i5 = ngVar.a;
        BaseAdUnit baseAdUnit2 = ngVar.c;
        u11 u11Var = this.u;
        fdi fdiVar2 = u11Var.e;
        FragmentActivity fragmentActivity2 = u11Var.b;
        ku3 ku3Var = (ku3) this.s;
        lu3 lu3Var2 = lu3.a;
        int i6 = this.r;
        esf esfVar2 = this.v;
        int i7 = 2;
        int i8 = 1;
        if (i6 == 0) {
            y6a.M(obj);
            if (!s9a.w(ku3Var)) {
            }
        } else if (i6 == 1 || i6 == 2) {
            y6a.M(obj);
            i3 = i8;
            ViewGroup viewGroup = u11Var.a;
            this.s = ku3Var;
            this.r = 3;
            z = i3;
        } else {
            if (i6 != 3) {
                if (i6 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    y6a.M(obj);
                    a = obj;
                    baseAdUnit = baseAdUnit2;
                    fdiVar = fdiVar2;
                    c = 3;
                    i2 = 2;
                    i = 1;
                } catch (Throwable th2) {
                    th = th2;
                    baseAdUnit = baseAdUnit2;
                    fdiVar = fdiVar2;
                    c = 3;
                    i2 = 2;
                    i = 1;
                    p2g p2gVar = w2g.b;
                    u2gVar = new u2g(th);
                    ku3 ku3Var2 = ku3Var;
                    a2 = w2g.a(u2gVar);
                    if (a2 == null) {
                    }
                    if (u2gVar instanceof u2g) {
                    }
                    wcdVar = (wcd) u2gVar;
                    if (wcdVar != null) {
                    }
                    if (s9a.w(ku3Var)) {
                    }
                    lu3Var2 = lu3Var;
                    baseAdUnit2 = baseAdUnit;
                    i7 = i2;
                    i8 = i;
                    fdiVar2 = fdiVar;
                    esfVar2 = esfVar;
                    if (!s9a.w(ku3Var)) {
                    }
                }
                u2gVar = (wcd) a;
                p2g p2gVar2 = w2g.b;
                ku3 ku3Var22 = ku3Var;
                a2 = w2g.a(u2gVar);
                if (a2 == null) {
                    lu3Var = lu3Var2;
                    esfVar = esfVar2;
                } else {
                    qcd qcdVar = a2 instanceof qcd ? (qcd) a2 : null;
                    String str = u11Var.B;
                    AdType.Banner banner = ngVar.d;
                    ru ruVar = ru.NIMBUS;
                    String adUnitId = ((BaseAdUnit.GamAdUnit) baseAdUnit).getAdUnitId();
                    int C = (qcdVar == null || (i4 = qcdVar.a) == 0) ? -1 : wt3.C(i4);
                    if ((qcdVar == null || (message = qcdVar.getMessage()) == null) && (message = a2.getMessage()) == null) {
                        message = "";
                    }
                    esfVar = esfVar2;
                    int i9 = C;
                    lu3Var = lu3Var2;
                    nv.j(fragmentActivity2, str, banner, ruVar, adUnitId, i9, message, qu.LOAD, null, null, 768);
                }
                if (u2gVar instanceof u2g) {
                    u2gVar = null;
                }
                wcdVar = (wcd) u2gVar;
                if (wcdVar != null) {
                    sv1 sv1Var = wcdVar.a;
                    if (wcdVar.i() || sv1Var.h > i5) {
                        String str2 = u11Var.B;
                        AdType.Banner banner2 = ngVar.d;
                        ru ruVar2 = ru.NIMBUS;
                        String adUnitId2 = ((BaseAdUnit.GamAdUnit) baseAdUnit).getAdUnitId();
                        int i10 = sv1Var.i;
                        int i11 = sv1Var.h;
                        String str3 = sv1Var.b;
                        StringBuilder s = lnb.s(i10, i11, "oversized bid ", "x", " auction=");
                        s.append(str3);
                        nv.j(fragmentActivity2, str2, banner2, ruVar2, adUnitId2, -2, s.toString(), qu.LOAD, null, null, 768);
                        wcdVar = null;
                    } else {
                        nv.e(fragmentActivity2, u11Var.B, ngVar.d, ru.NIMBUS, ((BaseAdUnit.GamAdUnit) baseAdUnit).getAdUnitId(), new Double(sv1Var.d / 100000.0d), null, null, PsExtractor.AUDIO_STREAM);
                    }
                    ku3Var = ku3Var22;
                } else {
                    ku3Var = ku3Var22;
                    wcdVar = null;
                }
                if (s9a.w(ku3Var)) {
                    u11Var.m(this.w, ngVar.d, i5, wcdVar);
                }
                lu3Var2 = lu3Var;
                baseAdUnit2 = baseAdUnit;
                i7 = i2;
                i8 = i;
                fdiVar2 = fdiVar;
                esfVar2 = esfVar;
                if (!s9a.w(ku3Var)) {
                    return Unit.a;
                }
                if (this.t) {
                    wd5 wd5Var = xd5.b;
                    long S = wkn.S(u11Var.F - (System.currentTimeMillis() - esfVar2.a), be5.MILLISECONDS);
                    this.s = ku3Var;
                    this.r = i8;
                    lu3Var2 = lu3Var2;
                } else {
                    wd5 wd5Var2 = xd5.b;
                    i3 = i8;
                    long S2 = wkn.S(u11Var.F - (System.currentTimeMillis() - esfVar2.a), be5.MILLISECONDS);
                    this.s = ku3Var;
                    this.r = i7;
                }
                return lu3Var2;
            }
            y6a.M(obj);
            z = 1;
            if (!s9a.w(ku3Var)) {
                return Unit.a;
            }
            esfVar2.a = System.currentTimeMillis();
            yea yeaVar = j58.a;
            if (j58.l(z)) {
                tm8 tm8Var = this.y;
                AdSize[] adSizeArr = this.z;
                try {
                } catch (Throwable th3) {
                    th = th3;
                    baseAdUnit = baseAdUnit2;
                    fdiVar = fdiVar2;
                    i2 = i7;
                    i = z;
                    c = 3;
                }
                p2g p2gVar3 = w2g.b;
                String adUnitId3 = ((BaseAdUnit.GamAdUnit) baseAdUnit2).getAdUnitId();
                adUnitId3.getClass();
                ucd ucdVar = new ucd(adUnitId3);
                pv1 pv1Var = ucdVar.a;
                pv1Var.a[0].a = new mz0(tm8Var.a, tm8Var.b, (byte) 0, ucd.g, null, 156);
                td4.v0(ucdVar, 2);
                mz0 mz0Var = pv1Var.a[0].a;
                if (mz0Var != null) {
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        baseAdUnit = baseAdUnit2;
                    }
                    ArrayList arrayList = new ArrayList(adSizeArr.length);
                    int length = adSizeArr.length;
                    baseAdUnit = baseAdUnit2;
                    int i12 = 0;
                    while (i12 < length) {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            fdiVar = fdiVar2;
                            i = z;
                            c = 3;
                            i2 = 2;
                            p2g p2gVar4 = w2g.b;
                            u2gVar = new u2g(th);
                            ku3 ku3Var222 = ku3Var;
                            a2 = w2g.a(u2gVar);
                            if (a2 == null) {
                            }
                            if (u2gVar instanceof u2g) {
                            }
                            wcdVar = (wcd) u2gVar;
                            if (wcdVar != null) {
                            }
                            if (s9a.w(ku3Var)) {
                            }
                            lu3Var2 = lu3Var;
                            baseAdUnit2 = baseAdUnit;
                            i7 = i2;
                            i8 = i;
                            fdiVar2 = fdiVar;
                            esfVar2 = esfVar;
                            if (!s9a.w(ku3Var)) {
                            }
                        }
                        AdSize adSize = adSizeArr[i12];
                        int i13 = i12;
                        fdiVar = fdiVar2;
                        try {
                        } catch (Throwable th6) {
                            th = th6;
                            fragmentActivity = fragmentActivity2;
                        }
                        Integer num = new Integer(adSize.getHeight());
                        try {
                        } catch (Throwable th7) {
                            th = th7;
                            i = z;
                            c = 3;
                            i2 = 2;
                            p2g p2gVar42 = w2g.b;
                            u2gVar = new u2g(th);
                            ku3 ku3Var2222 = ku3Var;
                            a2 = w2g.a(u2gVar);
                            if (a2 == null) {
                            }
                            if (u2gVar instanceof u2g) {
                            }
                            wcdVar = (wcd) u2gVar;
                            if (wcdVar != null) {
                            }
                            if (s9a.w(ku3Var)) {
                            }
                            lu3Var2 = lu3Var;
                            baseAdUnit2 = baseAdUnit;
                            i7 = i2;
                            i8 = i;
                            fdiVar2 = fdiVar;
                            esfVar2 = esfVar;
                            if (!s9a.w(ku3Var)) {
                            }
                        }
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            try {
                            } catch (Throwable th8) {
                                th = th8;
                                i = z;
                                c = 3;
                                i2 = 2;
                                p2g p2gVar422 = w2g.b;
                                u2gVar = new u2g(th);
                                ku3 ku3Var22222 = ku3Var;
                                a2 = w2g.a(u2gVar);
                                if (a2 == null) {
                                }
                                if (u2gVar instanceof u2g) {
                                }
                                wcdVar = (wcd) u2gVar;
                                if (wcdVar != null) {
                                }
                                if (s9a.w(ku3Var)) {
                                }
                                lu3Var2 = lu3Var;
                                baseAdUnit2 = baseAdUnit;
                                i7 = i2;
                                i8 = i;
                                fdiVar2 = fdiVar;
                                esfVar2 = esfVar;
                                if (!s9a.w(ku3Var)) {
                                }
                            }
                            intValue = num.intValue();
                        } else {
                            intValue = i5;
                        }
                        fragmentActivity = fragmentActivity2;
                        try {
                        } catch (Throwable th9) {
                            th = th9;
                            i = z;
                            fragmentActivity2 = fragmentActivity;
                            c = 3;
                            i2 = 2;
                            p2g p2gVar4222 = w2g.b;
                            u2gVar = new u2g(th);
                            ku3 ku3Var222222 = ku3Var;
                            a2 = w2g.a(u2gVar);
                            if (a2 == null) {
                            }
                            if (u2gVar instanceof u2g) {
                            }
                            wcdVar = (wcd) u2gVar;
                            if (wcdVar != null) {
                            }
                            if (s9a.w(ku3Var)) {
                            }
                            lu3Var2 = lu3Var;
                            baseAdUnit2 = baseAdUnit;
                            i7 = i2;
                            i8 = i;
                            fdiVar2 = fdiVar;
                            esfVar2 = esfVar;
                            if (!s9a.w(ku3Var)) {
                            }
                        }
                        arrayList.add(new tm8(adSize.getWidth(), intValue));
                        i12 = i13 + 1;
                        fdiVar2 = fdiVar;
                        fragmentActivity2 = fragmentActivity;
                    }
                    fdiVar = fdiVar2;
                    fragmentActivity = fragmentActivity2;
                    mz0Var.c = (tm8[]) arrayList.toArray(new tm8[0]);
                } else {
                    baseAdUnit = baseAdUnit2;
                    fdiVar = fdiVar2;
                    fragmentActivity = fragmentActivity2;
                }
                hw9 hw9Var = (hw9) ph0.A(pv1Var.a);
                if (hw9Var != null) {
                    try {
                    } catch (Throwable th10) {
                        th = th10;
                        c2 = 3;
                    }
                    mz0 mz0Var2 = hw9Var.a;
                    if (mz0Var2 != null) {
                        c2 = 3;
                        try {
                        } catch (Throwable th11) {
                            th = th11;
                            c = c2;
                            i = z;
                            fragmentActivity2 = fragmentActivity;
                            i2 = 2;
                            p2g p2gVar42222 = w2g.b;
                            u2gVar = new u2g(th);
                            ku3 ku3Var2222222 = ku3Var;
                            a2 = w2g.a(u2gVar);
                            if (a2 == null) {
                            }
                            if (u2gVar instanceof u2g) {
                            }
                            wcdVar = (wcd) u2gVar;
                            if (wcdVar != null) {
                            }
                            if (s9a.w(ku3Var)) {
                            }
                            lu3Var2 = lu3Var;
                            baseAdUnit2 = baseAdUnit;
                            i7 = i2;
                            i8 = i;
                            fdiVar2 = fdiVar;
                            esfVar2 = esfVar;
                            if (!s9a.w(ku3Var)) {
                            }
                        }
                        mz0Var2.e = new byte[]{3, 4, 5};
                        String uuid = UUID.randomUUID().toString();
                        uuid.getClass();
                        u11Var.B = uuid;
                        char c3 = c2;
                        ku3 ku3Var3 = ku3Var;
                        c = c3;
                        i = z;
                        fragmentActivity2 = fragmentActivity;
                        i2 = 2;
                        nv.f(fragmentActivity2, uuid, ngVar.d, ru.NIMBUS, ((BaseAdUnit.GamAdUnit) baseAdUnit).getAdUnitId(), null, 96);
                        jcd jcdVar = (jcd) u11Var.f.getValue();
                        Context applicationContext = fragmentActivity2.getApplicationContext();
                        applicationContext.getClass();
                        this.s = ku3Var3;
                        this.r = 4;
                        a = jcdVar.a(applicationContext, ucdVar, this);
                        if (a != lu3Var2) {
                            ku3Var = ku3Var3;
                            u2gVar = (wcd) a;
                            p2g p2gVar22 = w2g.b;
                            ku3 ku3Var22222222 = ku3Var;
                            a2 = w2g.a(u2gVar);
                            if (a2 == null) {
                            }
                            if (u2gVar instanceof u2g) {
                            }
                            wcdVar = (wcd) u2gVar;
                            if (wcdVar != null) {
                            }
                            if (s9a.w(ku3Var)) {
                            }
                            lu3Var2 = lu3Var;
                            baseAdUnit2 = baseAdUnit;
                            i7 = i2;
                            i8 = i;
                            fdiVar2 = fdiVar;
                            esfVar2 = esfVar;
                            if (!s9a.w(ku3Var)) {
                            }
                        }
                        return lu3Var2;
                    }
                }
                c2 = 3;
                String uuid2 = UUID.randomUUID().toString();
                uuid2.getClass();
                u11Var.B = uuid2;
                char c32 = c2;
                ku3 ku3Var32 = ku3Var;
                c = c32;
                i = z;
                fragmentActivity2 = fragmentActivity;
                i2 = 2;
                nv.f(fragmentActivity2, uuid2, ngVar.d, ru.NIMBUS, ((BaseAdUnit.GamAdUnit) baseAdUnit).getAdUnitId(), null, 96);
                jcd jcdVar2 = (jcd) u11Var.f.getValue();
                Context applicationContext2 = fragmentActivity2.getApplicationContext();
                applicationContext2.getClass();
                this.s = ku3Var32;
                this.r = 4;
                a = jcdVar2.a(applicationContext2, ucdVar, this);
                if (a != lu3Var2) {
                }
                return lu3Var2;
            }
            baseAdUnit = baseAdUnit2;
            fdiVar = fdiVar2;
            i2 = i7;
            lu3Var = lu3Var2;
            esfVar = esfVar2;
            i = z;
            c = 3;
            wcdVar = null;
            if (s9a.w(ku3Var)) {
            }
            lu3Var2 = lu3Var;
            baseAdUnit2 = baseAdUnit;
            i7 = i2;
            i8 = i;
            fdiVar2 = fdiVar;
            esfVar2 = esfVar;
            if (!s9a.w(ku3Var)) {
            }
        }
    }
}
