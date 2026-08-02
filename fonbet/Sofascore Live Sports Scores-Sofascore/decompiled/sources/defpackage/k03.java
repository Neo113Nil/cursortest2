package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.facebook.internal.k0;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.f;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k03 implements qs3, uqg, zzyh, zzqp, f, puk, PurchasesUpdatedListener, m4f, sdd {
    public static final k03 a = new k03();
    public static final k03 b = new k03();
    public static final k03 c = new k03();
    public static final k03 d = new k03();
    public static final k03 e = new k03();
    public static final ilg f = new ilg(8);
    public static final ilg g = new ilg(9);
    public static final ilg h = new ilg(10);
    public static final ilg i = new ilg(11);
    public static final ilg j = new ilg(12);
    public static final k03 k = new k03();
    public static final k03 l = new k03();
    public static final k03 m = new k03();
    public static final k03 n = new k03();
    public static final k03 o = new k03();
    public static final k03 p = new k03();
    public static final k03 q = new k03();
    public static final k03 r = new k03();
    public static k03 s;

    public static LayerDrawable i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((tse) it.next()).a);
        }
        int i2 = 0;
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList2.toArray(new Drawable[0]));
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            tse tseVar = (tse) it2.next();
            i3 += tseVar.b + tseVar.c;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            tse tseVar2 = (tse) arrayList.get(i4);
            int i5 = tseVar2.c;
            int i6 = tseVar2.b;
            int i7 = i3 - (i5 + i6);
            int i8 = i2 + i5;
            layerDrawable.setLayerInset(i4, i8, 0, i7, 0);
            i2 = i8 + i6;
            i4++;
            i3 = i7;
        }
        return layerDrawable;
    }

    public static xse l(String str, String str2) {
        Object obj = null;
        if (str.equals(Sports.BASKETBALL)) {
            is1.d.getClass();
            Iterator<E> it = is1.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((is1) next).a.equals(str2)) {
                    obj = next;
                    break;
                }
            }
            is1 is1Var = (is1) obj;
            return is1Var == null ? is1.f : is1Var;
        }
        oxk.d.getClass();
        Iterator<E> it2 = oxk.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((oxk) next2).a.equals(str2)) {
                obj = next2;
                break;
            }
        }
        oxk oxkVar = (oxk) obj;
        return oxkVar == null ? oxk.e : oxkVar;
    }

    public static List m(Context context, int i2, Drawable drawable, boolean z, int i3) {
        List split$default;
        if (drawable == null) {
            return km5.a;
        }
        int s2 = ao2.s(6, context);
        int s3 = ao2.s(8, context);
        int s4 = ao2.s(16, context);
        ArrayList arrayList = new ArrayList();
        if (i3 > 1) {
            split$default = StringsKt__StringsKt.split$default(String.valueOf(i3), new String[]{""}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : split$default) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                str.getClass();
                arrayList4.add(new c9j(context, str));
            }
            int size = arrayList4.size();
            int i4 = 0;
            while (i4 < size) {
                arrayList.add(new tse((Drawable) arrayList4.get(i4), s3, (i4 != 0 || i2 <= 0) ? 0 : s2));
                i4++;
            }
        }
        if (i3 > 1 || !z) {
            s2 = 0;
        }
        arrayList.add(new tse(drawable, s4, s2));
        return arrayList;
    }

    public static final void p(et5 et5Var, View view, View view2) {
        if (cw3.a.contains(k03.class)) {
            return;
        }
        try {
            et5Var.getClass();
            String str = et5Var.a;
            f8h f8hVar = p03.g;
            Bundle t = f8h.t(et5Var, view, view2);
            a.r(t);
            w.c().execute(new r0(t, str));
        } catch (Throwable th) {
            cw3.a(k03.class, th);
        }
    }

    public static void q() {
        File[] listFiles;
        if (k0.y()) {
            return;
        }
        File o2 = f6a.o();
        if (o2 == null) {
            listFiles = new File[0];
        } else {
            listFiles = o2.listFiles(new dw3(6));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(b6a.v(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((e6a) next).a()) {
                arrayList2.add(next);
            }
        }
        List H0 = CollectionsKt.H0(arrayList2, new z(9));
        JSONArray jSONArray = new JSONArray();
        v6a it2 = llf.j(0, Math.min(H0.size(), 5)).iterator();
        while (it2.c) {
            jSONArray.put(H0.get(it2.nextInt()));
        }
        f6a.E("crash_reports", jSONArray, new a0(H0, 1));
    }

    @Override // defpackage.sdd
    public boolean a(wtc wtcVar) {
        return false;
    }

    @Override // defpackage.sdd
    public int b() {
        return 8;
    }

    @Override // defpackage.m4f
    public CharSequence c(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.S;
        int z = listPreference.z(listPreference.U);
        if (TextUtils.isEmpty((z < 0 || charSequenceArr == null) ? null : charSequenceArr[z])) {
            return listPreference.a.getString(R.string.not_set);
        }
        int z2 = listPreference.z(listPreference.U);
        if (z2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[z2];
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        ((i2g) obj).close();
        return null;
    }

    @Override // defpackage.sdd
    public boolean d(wtc wtcVar) {
        return rd0.K(ufa.e(c6o.c0(wtcVar), false));
    }

    @Override // defpackage.sdd
    public void e(wma wmaVar, long j2, jc9 jc9Var, int i2, boolean z) {
        c40 c40Var = wmaVar.F;
        wdd wddVar = (wdd) c40Var.e;
        f4g f4gVar = wdd.N;
        ((wdd) c40Var.e).j1(wdd.R, wddVar.b1(j2), jc9Var, 1, z);
    }

    @Override // defpackage.sdd
    public boolean f(jc9 jc9Var, wma wmaVar) {
        return false;
    }

    @Override // defpackage.uqg
    public Object g(lpg lpgVar, Object obj) {
        scj scjVar = (scj) obj;
        String obj2 = scjVar.c().c.toString();
        long j2 = scjVar.c().d;
        int i2 = pej.c;
        return b.j(obj2, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (scjVar.c().d & 4294967295L)), fqj.H(lpgVar, scjVar.a));
    }

    @Override // defpackage.sdd
    public boolean h(wma wmaVar) {
        l3h x = wmaVar.x();
        boolean z = false;
        if (x != null && x.d) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.puk
    public void j(View view, float f2) {
        int i2 = view.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? -1 : 1;
        if (f2 <= -1.0f || f2 >= 1.0f) {
            view.setTranslationX(view.getWidth() * i2 * f2);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setAlpha(1.0f);
        } else {
            view.setTranslationX(view.getWidth() * i2 * (-f2));
            view.setAlpha(1.0f - Math.abs(f2));
        }
    }

    @Override // defpackage.uqg
    public Object k(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        obj3.getClass();
        int intValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long g2 = t6a.g(intValue, ((Integer) obj4).intValue());
        obj5.getClass();
        return new scj((String) obj2, g2, fqj.G(obj5));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public de0 n() {
        de0 de0Var;
        de0 de0Var2 = null;
        if (!cw3.a.contains(de0.class)) {
            try {
                de0Var = de0.d;
            } catch (Throwable th) {
                cw3.a(de0.class, th);
            }
            if (de0Var == null) {
                return de0Var;
            }
            synchronized (this) {
                if (!w.q.get()) {
                    return null;
                }
                if (!cw3.a.contains(de0.class)) {
                    try {
                        de0Var2 = de0.d;
                    } catch (Throwable th2) {
                        cw3.a(de0.class, th2);
                    }
                }
                if (de0Var2 == null) {
                    de0Var2 = new de0(0);
                    if (!cw3.a.contains(de0.class)) {
                        try {
                            de0.d = de0Var2;
                        } catch (Throwable th3) {
                            cw3.a(de0.class, th3);
                        }
                    }
                }
                return de0Var2;
            }
        }
        de0Var = null;
        if (de0Var == null) {
        }
    }

    public int o(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        billingResult.getClass();
        Unit unit = Unit.a;
    }

    public void r(Bundle bundle) {
        Locale locale;
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double d2 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        try {
                            locale = w.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        d2 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", d2);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
