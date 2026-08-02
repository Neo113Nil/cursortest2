package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzayz;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgrh;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sdo extends zzgka {
    public final /* synthetic */ int f = 3;
    public final Object g;
    public final Object h;

    public sdo(zzaya zzayaVar, zzgiw zzgiwVar, DisplayMetrics displayMetrics, View view, zzgrh zzgrhVar) {
        super("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.g = displayMetrics;
        this.h = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.h, (Activity) this.g);
                objArr.getClass();
                synchronized (zzayaVar) {
                    long longValue = ((Long) objArr[0]).longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).h0(longValue);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).i0(longValue2);
                    String str = (String) objArr[2];
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).j0(str);
                }
                return;
            case 1:
                Long l = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l2 = (Long) method.invoke("", (Context) this.g);
                        if (l2 == null) {
                            throw null;
                        }
                        l = l2;
                    } else {
                        ddb ddbVar = (ddb) ((Map) this.h).get("gs");
                        if (ddbVar != null && ddbVar.isDone()) {
                            l = Long.valueOf(((zzaza) ddbVar.get()).C0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (zzayaVar) {
                    long longValue3 = l.longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).g0(longValue3);
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.g;
                Long l3 = (Long) map.get("tcq");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[0] = l3;
                Long l4 = (Long) map.get("tpq");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[1] = l4;
                Long l5 = (Long) map.get("tcv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[2] = l5;
                Long l6 = (Long) map.get("tpv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[3] = l6;
                Long l7 = (Long) map.get("tchv");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[4] = l7;
                Long l8 = (Long) map.get("tphv");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[5] = l8;
                Long l9 = (Long) map.get("tcc");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[6] = l9;
                Long l10 = (Long) map.get("tpc");
                if (l10 == null) {
                    l10 = -1L;
                }
                lArr[7] = l10;
                Long l11 = (Long) map.get("tst");
                if (l11 == null) {
                    l11 = -1L;
                }
                lArr[8] = l11;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((zzgff) this.h).ordinal()));
                lArr2.getClass();
                synchronized (zzayaVar) {
                    long longValue4 = lArr2[0].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).r0(longValue4);
                    long longValue5 = lArr2[1].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).G(longValue5);
                    long longValue6 = lArr2[2].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).V0(longValue6);
                    long longValue7 = lArr2[3].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).S0(longValue7);
                    long longValue8 = lArr2[4].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).n0(longValue8);
                    long longValue9 = lArr2[5].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).o0(longValue9);
                    long longValue10 = lArr2[6].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).U(longValue10);
                    long longValue11 = lArr2[7].longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).V(longValue11);
                }
                return;
            default:
                View view = (View) this.h;
                if (view == null) {
                    return;
                }
                Object invoke = method.invoke("", (DisplayMetrics) this.g, view);
                invoke.getClass();
                Long[] lArr3 = (Long[]) invoke;
                zzayy D = zzayz.D();
                long longValue12 = lArr3[2].longValue();
                D.n();
                ((zzayz) D.b).F(longValue12);
                long longValue13 = lArr3[1].longValue();
                D.n();
                ((zzayz) D.b).G(longValue13);
                long longValue14 = lArr3[0].longValue();
                D.n();
                ((zzayz) D.b).H(longValue14);
                long longValue15 = lArr3[3].longValue();
                D.n();
                ((zzayz) D.b).E(longValue15);
                long longValue16 = lArr3[4].longValue();
                D.n();
                ((zzayz) D.b).I(longValue16);
                zzayz zzayzVar = (zzayz) D.o();
                zzayaVar.n();
                ((zzaza) zzayaVar.b).a0(zzayzVar);
                return;
        }
    }

    public sdo(zzaya zzayaVar, zzgiw zzgiwVar, View view, Activity activity, zzgrh zzgrhVar) {
        super("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", zzayaVar, zzgiwVar, zzgrhVar.a(111));
        this.h = view;
        this.g = activity;
    }

    public sdo(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Map map, zzgrh zzgrhVar) {
        super("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        this.g = map;
        this.h = zzgffVar;
    }

    public sdo(zzaya zzayaVar, zzgiw zzgiwVar, Map map, Context context, zzgrh zzgrhVar) {
        super("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", zzayaVar, zzgiwVar, zzgrhVar.a(120));
        this.g = context;
        this.h = map;
    }
}
