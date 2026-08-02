package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g0g extends hoi implements Function2 {
    public LinkedHashSet r;
    public int s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ ucd u;
    public final /* synthetic */ SharedPreferences v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0g(Context context, ucd ucdVar, SharedPreferences sharedPreferences, rq3 rq3Var) {
        super(2, rq3Var);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.t = context;
        this.u = ucdVar;
        this.v = sharedPreferences;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        return new g0g(this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c1, code lost:
    
        if (r16.length() == 4) goto L123;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var;
        byte b;
        ja0 ja0Var;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        vek vekVar;
        LinkedHashSet f;
        byte[] bArr;
        byte[] bArr2;
        int i2;
        int i3;
        String str5;
        String str6;
        String str7;
        vek vekVar2;
        String str8;
        String str9;
        Object u2gVar;
        Boolean bool;
        Object u2gVar2;
        ak6 ak6Var;
        tcd tcdVar;
        List list;
        byte b2;
        mz0[] mz0VarArr;
        String str10 = Build.MODEL;
        String str11 = Build.MANUFACTURER;
        ucd ucdVar = this.u;
        LinkedHashSet linkedHashSet = ucdVar.c;
        pv1 pv1Var = ucdVar.a;
        lu3 lu3Var2 = lu3.a;
        int i4 = this.s;
        if (i4 == 0) {
            y6a.M(obj);
            Context context = this.t;
            Resources resources = context.getResources();
            resources.getClass();
            rod rodVar = i0g.a;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i5 = displayMetrics.widthPixels;
            int i6 = displayMetrics.heightPixels;
            tm8 tm8Var = new tm8(i5, i6);
            String str12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            hw9 hw9Var = pv1Var.a[0];
            gw9 gw9Var = hw9Var.f;
            gw9Var.a = StringsKt.l0(gw9Var.a).toString();
            mz0 mz0Var = hw9Var.a;
            byte[] bArr3 = ucd.g;
            if (mz0Var != null && mz0Var.g == null) {
                mz0Var.g = bArr3;
            }
            xok xokVar = hw9Var.b;
            byte[] bArr4 = ucd.h;
            if (xokVar != null) {
                b = 7;
                if (xokVar.f == 0) {
                    xokVar.f = i5;
                }
                if (xokVar.g == 0) {
                    xokVar.g = i6;
                }
                if (xokVar.s == null) {
                    b2 = 1;
                    xokVar.s = new byte[]{7};
                } else {
                    b2 = 1;
                }
                mz0[] mz0VarArr2 = xokVar.t;
                byte b3 = b2;
                if (mz0VarArr2 == null) {
                    if (td4.c0(ucdVar) == 4) {
                        Byte valueOf = Byte.valueOf(b3);
                        lu3Var = lu3Var2;
                        mz0VarArr = new mz0[]{context.getResources().getConfiguration().orientation == 2 ? new mz0(480, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, (byte) 0, bArr3, valueOf, 60) : new mz0(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, (byte) 0, bArr3, valueOf, 60)};
                    } else {
                        p53[] p53VarArr = ucdVar.b;
                        if (p53VarArr.length == 0) {
                            p53VarArr = null;
                        }
                        if (p53VarArr != null) {
                            lu3Var = lu3Var2;
                            ArrayList arrayList = new ArrayList(p53VarArr.length);
                            int length = p53VarArr.length;
                            p53[] p53VarArr2 = p53VarArr;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = length;
                                p53 p53Var = p53VarArr2[i7];
                                arrayList.add(new mz0(p53Var.a, p53Var.c, (byte) 0, bArr3, Byte.valueOf(p53Var.b ? (byte) 1 : (byte) 0), 60));
                                i7++;
                                length = i8;
                            }
                            mz0VarArr = (mz0[]) arrayList.toArray(new mz0[0]);
                        } else {
                            lu3Var = lu3Var2;
                            mz0VarArr = null;
                        }
                    }
                    xokVar.t = mz0VarArr;
                    mz0VarArr2 = mz0VarArr;
                } else {
                    lu3Var = lu3Var2;
                }
                if (mz0VarArr2 != null && xokVar.u == null) {
                    xokVar.u = new byte[]{1, 2};
                }
                if (xokVar.e == null) {
                    xokVar.e = bArr4;
                }
                if (xokVar.b == null) {
                    xokVar.b = gcd.c;
                }
            } else {
                lu3Var = lu3Var2;
                b = 7;
            }
            t3d t3dVar = hw9Var.c;
            if (t3dVar != null && (ak6Var = t3dVar.f) != null && (tcdVar = ak6Var.a) != null && (list = tcdVar.e) != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    li0 li0Var = ((mi0) it.next()).f;
                    if (li0Var != null) {
                        arrayList2.add(li0Var);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    li0 li0Var2 = (li0) it2.next();
                    if (li0Var2.d == null) {
                        li0Var2.d = bArr4;
                    }
                    if (li0Var2.a == null) {
                        li0Var2.a = gcd.c;
                    }
                }
                Unit unit = Unit.a;
            }
            ja0 ja0Var2 = pv1Var.b;
            if (ja0Var2 == null) {
                rod rodVar2 = i0g.a;
                ja0 ja0Var3 = new ja0();
                ja0Var3.a = null;
                ja0Var3.b = null;
                ja0Var3.c = null;
                ja0Var3.d = null;
                ja0Var3.e = str12;
                ja0Var3.f = null;
                ja0Var3.g = null;
                ja0Var3.h = null;
                ja0Var3.i = null;
                ja0Var3.j = null;
                ja0Var3.k = null;
                ja0Var3.l = null;
                pv1Var.b = ja0Var3;
            } else if (!Intrinsics.c(ja0Var2.e, str12) && (ja0Var = pv1Var.b) != null) {
                ja0Var.e = str12;
            }
            t05 t05Var = pv1Var.c;
            if (t05Var == null) {
                String id = iie.b.getId();
                if (id == null) {
                    id = "00000000-0000-0000-0000-000000000000";
                }
                boolean isLimitAdTrackingEnabled = iie.b.isLimitAdTrackingEnabled();
                iie iieVar = iie.a;
                String b4 = iie.b();
                String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
                float f2 = context.getResources().getDisplayMetrics().density;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                byte E = wnn.E(applicationContext);
                byte b5 = isLimitAdTrackingEnabled ? (byte) 1 : (byte) 0;
                byte b6 = E;
                String str13 = Build.VERSION.RELEASE;
                str11.getClass();
                str10.getClass();
                str13.getClass();
                if (id.length() != 36) {
                    id = null;
                }
                pv1Var.c = new t05(b4, id == null ? "00000000-0000-0000-0000-000000000000" : id, tm8Var.b, tm8Var.a, Float.valueOf(f2), language, b6, b5);
            } else {
                t05Var.i = i5;
                t05Var.h = i6;
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                t05Var.m = wnn.E(applicationContext2);
                if (t05Var.k == null) {
                    t05Var.k = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
                }
                if (t05Var.j == null) {
                    t05Var.j = new Float(context.getResources().getDisplayMetrics().density);
                }
                if (t05Var.e == null) {
                    t05Var.e = wv8.i(str11, ", ", str10);
                }
            }
            pv1Var.d = tm8Var;
            uvf uvfVar = pv1Var.j;
            if (uvfVar == null) {
                tvf tvfVar = new tvf();
                uvfVar = new uvf();
                uvfVar.a = (byte) 0;
                uvfVar.b = tvfVar;
            }
            uvf uvfVar2 = uvfVar;
            tvf tvfVar2 = uvfVar2.b;
            String str14 = gcd.a;
            SharedPreferences sharedPreferences = this.v;
            if (sharedPreferences == null || (r16 = sharedPreferences.getString("IABUSPrivacy_String", null)) == null) {
                i = 4;
            } else {
                i = 4;
            }
            String str15 = null;
            if (str15 != null) {
                String string = sharedPreferences.getString("IABUSPrivacy_String", null);
                tvfVar2.b = (string == null || string.length() != i) ? null : string;
            } else if (tvfVar2.b == null) {
                tvfVar2.b = null;
            }
            if (sharedPreferences != null) {
                String str16 = sharedPreferences.contains("IABTCF_gdprApplies") ? "IABTCF_gdprApplies" : null;
                if (str16 != null) {
                    try {
                        p2g p2gVar = w2g.b;
                        int i9 = sharedPreferences.getInt(str16, -1);
                        Integer valueOf2 = Integer.valueOf(i9);
                        if (i9 <= -1) {
                            valueOf2 = null;
                        }
                        u2gVar = valueOf2 != null ? Boolean.valueOf(valueOf2.intValue() == 1) : null;
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    if (u2gVar instanceof u2g) {
                        u2gVar = null;
                    }
                    bool = (Boolean) u2gVar;
                    if (bool == null) {
                        try {
                            String string2 = sharedPreferences.getString(str16, null);
                            u2gVar2 = string2 != null ? Boolean.valueOf(StringsKt.J(string2, "1", false)) : null;
                        } catch (Throwable th2) {
                            p2g p2gVar3 = w2g.b;
                            u2gVar2 = new u2g(th2);
                        }
                        if (u2gVar2 instanceof u2g) {
                            u2gVar2 = null;
                        }
                        bool = (Boolean) u2gVar2;
                    }
                } else {
                    bool = null;
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    rod rodVar3 = i0g.a;
                    Byte valueOf3 = Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0);
                    Byte b7 = tvfVar2.a;
                    if (b7 != null && booleanValue == b7.byteValue()) {
                        valueOf3 = null;
                    }
                    if (valueOf3 != null) {
                        tvfVar2.a = Byte.valueOf(valueOf3.byteValue());
                    }
                }
            }
            if (sharedPreferences == null || (str = sharedPreferences.getString("IABGPP_HDR_GppString", null)) == null || StringsKt.R(str)) {
                str = null;
            }
            if (str != null || (str9 = tvfVar2.c) == null || str9.length() == 0) {
                if (sharedPreferences == null || (str2 = sharedPreferences.getString("IABGPP_HDR_GppString", null)) == null || StringsKt.R(str2)) {
                    str2 = null;
                }
                tvfVar2.c = str2;
            }
            if (sharedPreferences == null || (str3 = sharedPreferences.getString("IABGPP_GppSID", null)) == null || StringsKt.R(str3)) {
                str3 = null;
            }
            if (str3 != null || (str8 = tvfVar2.d) == null || str8.length() == 0) {
                if (sharedPreferences == null || (str4 = sharedPreferences.getString("IABGPP_GppSID", null)) == null || StringsKt.R(str4)) {
                    str4 = null;
                }
                tvfVar2.d = str4;
            }
            pv1Var.j = uvfVar2;
            String str17 = gcd.a;
            wek wekVar = pv1Var.e;
            if (wekVar == null || (vekVar2 = wekVar.h) == null) {
                vekVar = null;
            } else {
                vekVar = null;
                vekVar2.b = null;
                vekVar2.c = null;
                vekVar2.e = null;
                vekVar2.f = null;
                vekVar2.h = null;
                vekVar2.i = null;
                vekVar2.j = null;
            }
            if (wekVar == null) {
                rod rodVar4 = i0g.a;
                wekVar = new wek(vekVar, 255);
                vek vekVar3 = wekVar.h;
                String str18 = vekVar3 != null ? vekVar3.a : null;
                if ((str18 == null || str18.length() == 0) && sharedPreferences != null) {
                    String string3 = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
                    if (string3 == null || StringsKt.R(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        vek vekVar4 = wekVar.h;
                        if (vekVar4 != null) {
                            vekVar4.a = string3;
                        } else {
                            vekVar4 = new vek(string3, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                        }
                        wekVar.h = vekVar4;
                    }
                }
            }
            pv1Var.e = wekVar;
            wek wekVar2 = pv1Var.e;
            if (wekVar2 != null) {
                if (wekVar2.a != 0) {
                    c1h O = hda.O(wekVar2, "age");
                    if (((O == null || (str7 = O.c) == null) ? null : Integer.valueOf(Integer.parseInt(str7))) == null) {
                        Integer num = new Integer(wekVar2.a);
                        LinkedHashSet K = hda.K(wekVar2);
                        Iterator it3 = K.iterator();
                        while (it3.hasNext()) {
                            c1h c1hVar = (c1h) it3.next();
                            c1hVar.getClass();
                            if (Intrinsics.c(c1hVar.b, "age")) {
                                it3.remove();
                            }
                        }
                        K.add(new c1h("age", num.toString()));
                        wekVar2.a = 0;
                    }
                }
                if (wekVar2.d != null) {
                    c1h O2 = hda.O(wekVar2, InneractiveMediationDefs.KEY_GENDER);
                    if (O2 != null) {
                        String str19 = O2.c;
                        for (int i10 : wt3.D(3)) {
                            String valueOf4 = String.valueOf(iii.E(lnb.y(i10)));
                            if (str19 != null) {
                                String valueOf5 = String.valueOf(iii.E(str19));
                                valueOf5.getClass();
                                str6 = valueOf5.toUpperCase(Locale.ROOT);
                                str6.getClass();
                            } else {
                                str6 = null;
                            }
                            if (Intrinsics.c(valueOf4, str6)) {
                                i2 = i10;
                                break;
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 == 0) {
                        String str20 = wekVar2.d;
                        int[] D = wt3.D(3);
                        int length2 = D.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length2) {
                                i3 = 0;
                                break;
                            }
                            int i12 = D[i11];
                            String valueOf6 = String.valueOf(iii.E(lnb.y(i12)));
                            if (str20 != null) {
                                String valueOf7 = String.valueOf(iii.E(str20));
                                valueOf7.getClass();
                                str5 = valueOf7.toUpperCase(Locale.ROOT);
                                str5.getClass();
                            } else {
                                str5 = null;
                            }
                            if (Intrinsics.c(valueOf6, str5)) {
                                i3 = i12;
                                break;
                            }
                            i11++;
                        }
                        LinkedHashSet K2 = hda.K(wekVar2);
                        Iterator it4 = K2.iterator();
                        while (it4.hasNext()) {
                            c1h c1hVar2 = (c1h) it4.next();
                            c1hVar2.getClass();
                            if (Intrinsics.c(c1hVar2.b, InneractiveMediationDefs.KEY_GENDER)) {
                                it4.remove();
                            }
                        }
                        if (i3 != 0) {
                            K2.add(new c1h(InneractiveMediationDefs.KEY_GENDER, String.valueOf(iii.E(lnb.y(i3)))));
                        }
                        wekVar2.d = null;
                    }
                }
                Unit unit2 = Unit.a;
            }
            ArrayList arrayList3 = ovk.a;
            if (pv1Var.i == null) {
                hw9 hw9Var2 = pv1Var.a[0];
                hw9Var2.getClass();
                mz0 mz0Var2 = hw9Var2.a;
                if (mz0Var2 != null) {
                    byte[] bArr5 = mz0Var2.g;
                    if (bArr5 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = bArr5.length;
                        int i13 = 0;
                        while (i13 < length3) {
                            byte b8 = bArr5[i13];
                            if (b8 != b) {
                                arrayList4.add(Byte.valueOf(b8));
                            }
                            i13++;
                            b = 7;
                        }
                        bArr2 = CollectionsKt.O0(arrayList4);
                    } else {
                        bArr2 = null;
                    }
                    mz0Var2.g = bArr2;
                }
                xok xokVar2 = hw9Var2.b;
                if (xokVar2 != null) {
                    byte[] bArr6 = xokVar2.s;
                    if (bArr6 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        for (byte b9 : bArr6) {
                            if (b9 != 7) {
                                arrayList5.add(Byte.valueOf(b9));
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList5 = null;
                        }
                        if (arrayList5 != null) {
                            bArr = CollectionsKt.O0(arrayList5);
                            xokVar2.s = bArr;
                        }
                    }
                    bArr = null;
                    xokVar2.s = bArr;
                }
            }
            linkedHashSet.addAll(j0g.a);
            f = y9h.f(o0g.a, ucdVar.e);
            wek wekVar3 = pv1Var.e;
            if (wekVar3 != null) {
                vek vekVar5 = wekVar3.h;
                if (vekVar5 != null) {
                    Set set = vekVar5.g;
                    if (set != null) {
                        linkedHashSet = y9h.f(set, linkedHashSet);
                    }
                    vekVar5.g = linkedHashSet;
                } else {
                    vekVar5 = new vek(null, linkedHashSet, 959);
                }
                wekVar3.h = vekVar5;
            }
            k7h k7hVar = new k7h(xcd.a.incrementAndGet(), (SystemClock.elapsedRealtime() - iie.j) / 1000);
            ygh yghVar = new ygh();
            yghVar.a = k7hVar;
            pv1Var.k = yghVar;
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = f.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
            this.r = f;
            this.s = 1;
            Object A = z8e.A(arrayList6, ucdVar, this);
            lu3 lu3Var3 = lu3Var;
            if (A == lu3Var3) {
                return lu3Var3;
            }
        } else {
            if (i4 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.r;
            y6a.M(obj);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : f) {
            if (obj2 != null) {
                pvd.j();
                return null;
            }
            arrayList7.add(obj2);
        }
        Iterator it6 = arrayList7.iterator();
        if (it6.hasNext()) {
            throw lnb.i(it6);
        }
        return ucdVar;
    }
}
