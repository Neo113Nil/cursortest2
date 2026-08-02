package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class m72 implements xs8 {
    public final /* synthetic */ int a;

    public /* synthetic */ m72(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x048d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // defpackage.xs8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        String str;
        float f;
        int i;
        String str2;
        float f2;
        int i2;
        String str3;
        int i3;
        int i4 = 2;
        int i5 = 19;
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((ll6) obj).c().getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(m74.s);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(m74.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            Bundle bundle2 = (Bundle) it.next();
                            int i6 = bundle2.getInt(o94.a);
                            int i7 = bundle2.getInt(o94.b);
                            int i8 = bundle2.getInt(o94.c);
                            int i9 = bundle2.getInt(o94.d, -1);
                            Bundle bundle3 = bundle2.getBundle(o94.e);
                            if (i9 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(i9g.c);
                                string.getClass();
                                charSequence2.setSpan(new i9g(string, bundle3.getInt(i9g.d)), i6, i7, i8);
                            } else if (i9 == i4) {
                                bundle3.getClass();
                                charSequence2.setSpan(new j9j(bundle3.getInt(j9j.d), bundle3.getInt(j9j.e), bundle3.getInt(j9j.f)), i6, i7, i8);
                            } else if (i9 == 3) {
                                charSequence2.setSpan(new lf9(), i6, i7, i8);
                            } else if (i9 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(mwk.b);
                                string2.getClass();
                                charSequence2.setSpan(new mwk(string2), i6, i7, i8);
                            }
                            i4 = 2;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m74.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(m74.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(m74.w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle.getByteArray(m74.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        str = m74.y;
                        if (bundle.containsKey(str)) {
                            String str4 = m74.z;
                            if (bundle.containsKey(str4)) {
                                f = bundle.getFloat(str);
                                i = bundle.getInt(str4);
                                String str5 = m74.A;
                                int i10 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                                String str6 = m74.B;
                                float f3 = bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                                String str7 = m74.C;
                                int i11 = bundle.containsKey(str7) ? bundle.getInt(str7) : Integer.MIN_VALUE;
                                str2 = m74.E;
                                if (bundle.containsKey(str2)) {
                                    String str8 = m74.D;
                                    if (bundle.containsKey(str8)) {
                                        f2 = bundle.getFloat(str2);
                                        i2 = bundle.getInt(str8);
                                        String str9 = m74.F;
                                        float f4 = !bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                                        String str10 = m74.G;
                                        float f5 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        str3 = m74.H;
                                        if (bundle.containsKey(str3)) {
                                            i3 = -16777216;
                                            z = false;
                                        } else {
                                            i3 = bundle.getInt(str3);
                                        }
                                        int i12 = i3;
                                        boolean z2 = bundle.getBoolean(m74.I, false) ? false : z;
                                        String str11 = m74.J;
                                        int i13 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                                        String str12 = m74.K;
                                        float f6 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        String str13 = m74.L;
                                        return new m74(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f5, z2, i12, i13, f6, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f2 = -3.4028235E38f;
                                i2 = Integer.MIN_VALUE;
                                String str92 = m74.F;
                                if (!bundle.containsKey(str92)) {
                                }
                                String str102 = m74.G;
                                float f52 = bundle.containsKey(str102) ? bundle.getFloat(str102) : -3.4028235E38f;
                                str3 = m74.H;
                                if (bundle.containsKey(str3)) {
                                }
                                int i122 = i3;
                                if (bundle.getBoolean(m74.I, false)) {
                                }
                                String str112 = m74.J;
                                int i132 = bundle.containsKey(str112) ? bundle.getInt(str112) : Integer.MIN_VALUE;
                                String str122 = m74.K;
                                float f62 = !bundle.containsKey(str122) ? bundle.getFloat(str122) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                String str132 = m74.L;
                                return new m74(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f52, z2, i122, i132, f62, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                        String str52 = m74.A;
                        if (bundle.containsKey(str52)) {
                        }
                        String str62 = m74.B;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = m74.C;
                        if (bundle.containsKey(str72)) {
                        }
                        str2 = m74.E;
                        if (bundle.containsKey(str2)) {
                        }
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                        String str922 = m74.F;
                        if (!bundle.containsKey(str922)) {
                        }
                        String str1022 = m74.G;
                        float f522 = bundle.containsKey(str1022) ? bundle.getFloat(str1022) : -3.4028235E38f;
                        str3 = m74.H;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1222 = i3;
                        if (bundle.getBoolean(m74.I, false)) {
                        }
                        String str1122 = m74.J;
                        int i1322 = bundle.containsKey(str1122) ? bundle.getInt(str1122) : Integer.MIN_VALUE;
                        String str1222 = m74.K;
                        float f622 = !bundle.containsKey(str1222) ? bundle.getFloat(str1222) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        String str1322 = m74.L;
                        return new m74(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f522, z2, i1222, i1322, f622, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                str = m74.y;
                if (bundle.containsKey(str)) {
                }
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
                String str522 = m74.A;
                if (bundle.containsKey(str522)) {
                }
                String str622 = m74.B;
                if (bundle.containsKey(str622)) {
                }
                String str722 = m74.C;
                if (bundle.containsKey(str722)) {
                }
                str2 = m74.E;
                if (bundle.containsKey(str2)) {
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str9222 = m74.F;
                if (!bundle.containsKey(str9222)) {
                }
                String str10222 = m74.G;
                float f5222 = bundle.containsKey(str10222) ? bundle.getFloat(str10222) : -3.4028235E38f;
                str3 = m74.H;
                if (bundle.containsKey(str3)) {
                }
                int i12222 = i3;
                if (bundle.getBoolean(m74.I, false)) {
                }
                String str11222 = m74.J;
                int i13222 = bundle.containsKey(str11222) ? bundle.getInt(str11222) : Integer.MIN_VALUE;
                String str12222 = m74.K;
                float f6222 = !bundle.containsKey(str12222) ? bundle.getFloat(str12222) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                String str13222 = m74.L;
                return new m74(charSequence, alignment2, alignment4, bitmap, f, i, i10, f3, i11, i2, f2, f4, f5222, z2, i12222, i13222, f6222, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 2:
                m74 m74Var = (m74) obj;
                Bitmap bitmap3 = m74Var.d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence3 = m74Var.a;
                if (charSequence3 != null) {
                    bundle4.putCharSequence(m74.s, charSequence3);
                    if (charSequence3 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence3;
                        String str14 = o94.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (i9g i9gVar : (i9g[]) spanned.getSpans(0, spanned.length(), i9g.class)) {
                            i9gVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(i9g.c, i9gVar.a);
                            bundle5.putInt(i9g.d, i9gVar.b);
                            arrayList.add(o94.a(spanned, i9gVar, 1, bundle5));
                        }
                        for (j9j j9jVar : (j9j[]) spanned.getSpans(0, spanned.length(), j9j.class)) {
                            j9jVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(j9j.d, j9jVar.a);
                            bundle6.putInt(j9j.e, j9jVar.b);
                            bundle6.putInt(j9j.f, j9jVar.c);
                            arrayList.add(o94.a(spanned, j9jVar, 2, bundle6));
                        }
                        for (lf9 lf9Var : (lf9[]) spanned.getSpans(0, spanned.length(), lf9.class)) {
                            arrayList.add(o94.a(spanned, lf9Var, 3, null));
                        }
                        for (mwk mwkVar : (mwk[]) spanned.getSpans(0, spanned.length(), mwk.class)) {
                            mwkVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(mwk.b, mwkVar.a);
                            arrayList.add(o94.a(spanned, mwkVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(m74.t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(m74.u, m74Var.b);
                bundle4.putSerializable(m74.v, m74Var.c);
                bundle4.putFloat(m74.y, m74Var.e);
                bundle4.putInt(m74.z, m74Var.f);
                bundle4.putInt(m74.A, m74Var.g);
                bundle4.putFloat(m74.B, m74Var.h);
                bundle4.putInt(m74.C, m74Var.i);
                bundle4.putInt(m74.D, m74Var.n);
                bundle4.putFloat(m74.E, m74Var.o);
                bundle4.putFloat(m74.F, m74Var.j);
                bundle4.putFloat(m74.G, m74Var.k);
                bundle4.putBoolean(m74.I, m74Var.l);
                bundle4.putInt(m74.H, m74Var.m);
                bundle4.putInt(m74.J, m74Var.p);
                bundle4.putFloat(m74.K, m74Var.q);
                bundle4.putInt(m74.L, m74Var.r);
                if (bitmap3 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    z1a.E(bitmap3.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(m74.x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 3:
                return Integer.valueOf(((m74) obj).r);
            case 4:
                long j = ((q74) obj).b;
                if (j == C.TIME_UNSET) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 5:
                return hv9.z(Integer.valueOf(((su2) obj).a));
            case 6:
                return new bn4((sqi) obj);
            case 7:
                return new cn4((tqi) obj);
            case 8:
                uka ukaVar = (uka) obj;
                return ukaVar.a + ": " + ukaVar.b;
            case 9:
                return (isj) obj;
            case 10:
                return (jsj) obj;
            case 11:
                pd9 pd9Var = (pd9) obj;
                pd9Var.h();
                return hv9.v(w3a.S(pd9Var.I.b, new m72(i5)));
            case 12:
                String str15 = (String) obj;
                zo2 zo2Var = ydc.g;
                zo2Var.getClass();
                int length = str15.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (zo2Var.b(str15.charAt(length))) {
                            length--;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z && !str15.isEmpty()) {
                    return str15;
                }
                StringBuilder sb = new StringBuilder(str15.length() + 16);
                sb.append('\"');
                while (r7 < str15.length()) {
                    char charAt = str15.charAt(r7);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                    r7++;
                }
                sb.append('\"');
                return sb.toString();
            case 13:
                Collection collection = (Collection) obj;
                int i14 = sv9.d;
                if (collection instanceof sv9) {
                    return (sv9) collection;
                }
                boolean z3 = collection instanceof sv9;
                int size = z3 ? ((bwf) ((dwf) ((sv9) collection)).r()).size() : 11;
                qv9 qv9Var = new qv9();
                qv9Var.b = false;
                rjd rjdVar = new rjd();
                rjdVar.d(size);
                qv9Var.a = rjdVar;
                if (z3) {
                    sv9 sv9Var = (sv9) collection;
                    rjd rjdVar2 = sv9Var instanceof dwf ? ((dwf) sv9Var).e : null;
                    if (rjdVar2 != null) {
                        rjdVar.a(Math.max(rjdVar.c, rjdVar2.c));
                        r7 = rjdVar2.c == 0 ? -1 : 0;
                        while (r7 >= 0) {
                            z1a.v(r7, rjdVar2.c);
                            Object obj2 = rjdVar2.a[r7];
                            z1a.v(r7, rjdVar2.c);
                            qv9Var.c(rjdVar2.b[r7], obj2);
                            r7++;
                            if (r7 >= rjdVar2.c) {
                                r7 = -1;
                            }
                        }
                    } else {
                        vv9 s = sv9Var.s();
                        rjd rjdVar3 = qv9Var.a;
                        rjdVar3.a(Math.max(rjdVar3.c, s.size()));
                        for (qjd qjdVar : sv9Var.s()) {
                            qv9Var.c(qjdVar.a(), qjdVar.a);
                        }
                    }
                } else {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        qv9Var.a(it2.next());
                    }
                }
                if (qv9Var.a.c == 0) {
                    int i15 = sv9.d;
                    return dwf.h;
                }
                qv9Var.b = true;
                return new dwf(qv9Var.a);
            case 14:
                return Long.valueOf(((q74) obj).b);
            case 15:
                return Long.valueOf(((q74) obj).c);
            case 16:
                return hv9.v(w3a.S(((w6c) obj).getTrackGroups().b, new m72(i5)));
            case 17:
                return (isj) obj;
            case 18:
                return (jsj) obj;
            default:
                return Integer.valueOf(((osj) obj).c);
        }
    }
}
