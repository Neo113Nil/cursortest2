package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.facebook.q;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.zzanu;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcvn;
import com.google.android.gms.internal.ads.zzcx;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdhf;
import com.google.android.gms.internal.ads.zzdig;
import com.google.android.gms.internal.ads.zzdmx;
import com.google.android.gms.internal.ads.zzdoe;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzdwp;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzesj;
import com.google.android.gms.internal.ads.zzesn;
import com.google.android.gms.internal.ads.zzeua;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzeux;
import com.google.android.gms.internal.ads.zzfgl;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfkh;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.cloudmessaging.zzm;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p03 implements e8e, kli, lli, lwm, zzanu, zzg, zzhcv {
    public static p03 h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public static final f8h g = new f8h(18);
    public static final qe8 i = new qe8(27);

    public p03(q80 q80Var, dfj dfjVar, List list, kx4 kx4Var, sf8 sf8Var) {
        int i2;
        String str;
        ArrayList arrayList;
        List list2;
        q80 q80Var2 = q80Var;
        dfj dfjVar2 = dfjVar;
        this.a = 11;
        this.b = q80Var2;
        this.c = list;
        ysa ysaVar = ysa.c;
        final int i3 = 0;
        this.d = ypa.a(ysaVar, new Function0(this) { // from class: fyc
            public final /* synthetic */ p03 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                d8e d8eVar = null;
                int i5 = 1;
                p03 p03Var = this.b;
                switch (i4) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) p03Var.f;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float d = ((d8e) r0).a.d();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float d2 = ((d8e) obj).a.d();
                                    r0 = z;
                                    if (Float.compare(d, d2) < 0) {
                                        r0 = obj;
                                        d = d2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            d8eVar = r0;
                        }
                        d8e d8eVar2 = d8eVar;
                        if (d8eVar2 != null) {
                            f = d8eVar2.a.d();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList3 = (ArrayList) p03Var.f;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float c = ((d8e) r02).a.i.c();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float c2 = ((d8e) obj2).a.i.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            d8eVar = r02;
                        }
                        d8e d8eVar3 = d8eVar;
                        if (d8eVar3 != null) {
                            f = d8eVar3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        final int i4 = 1;
        this.e = ypa.a(ysaVar, new Function0(this) { // from class: fyc
            public final /* synthetic */ p03 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                d8e d8eVar = null;
                int i5 = 1;
                p03 p03Var = this.b;
                switch (i42) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) p03Var.f;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float d = ((d8e) r0).a.d();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float d2 = ((d8e) obj).a.d();
                                    r0 = z;
                                    if (Float.compare(d, d2) < 0) {
                                        r0 = obj;
                                        d = d2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            d8eVar = r0;
                        }
                        d8e d8eVar2 = d8eVar;
                        if (d8eVar2 != null) {
                            f = d8eVar2.a.d();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList3 = (ArrayList) p03Var.f;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float c = ((d8e) r02).a.i.c();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float c2 = ((d8e) obj2).a.i.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            d8eVar = r02;
                        }
                        d8e d8eVar3 = d8eVar;
                        if (d8eVar3 != null) {
                            f = d8eVar3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        g8e g8eVar = dfjVar2.b;
        q80 q80Var3 = r80.a;
        ArrayList arrayList2 = q80Var2.d;
        String str2 = q80Var2.b;
        List list3 = (arrayList2 == null || (list3 = CollectionsKt.H0(arrayList2, new qe8(12))) == null) ? km5.a : list3;
        ArrayList arrayList3 = new ArrayList();
        vg0 vg0Var = new vg0();
        int size = list3.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            p80 p80Var = (p80) list3.get(i5);
            p80 a = p80.a(p80Var, g8eVar.a((g8e) p80Var.a), i3, i3, 14);
            Object obj = a.a;
            int i7 = a.c;
            int i8 = a.b;
            while (i6 < i8 && !vg0Var.isEmpty()) {
                p80 p80Var2 = (p80) vg0Var.last();
                int i9 = p80Var2.c;
                List list4 = list3;
                Object obj2 = p80Var2.a;
                if (i8 < i9) {
                    arrayList3.add(new p80(obj2, i6, i8));
                    i6 = i8;
                    list3 = list4;
                } else {
                    int i10 = size;
                    arrayList3.add(new p80(obj2, i6, i9));
                    i6 = p80Var2.c;
                    while (!vg0Var.isEmpty() && i6 == ((p80) vg0Var.last()).c) {
                        vg0Var.removeLast();
                    }
                    list3 = list4;
                    size = i10;
                }
            }
            List list5 = list3;
            int i11 = size;
            if (i6 < i8) {
                arrayList3.add(new p80(g8eVar, i6, i8));
                i6 = i8;
            }
            p80 p80Var3 = (p80) vg0Var.m();
            if (p80Var3 != null) {
                int i12 = p80Var3.c;
                Object obj3 = p80Var3.a;
                int i13 = p80Var3.b;
                if (i13 == i8 && i12 == i7) {
                    vg0Var.removeLast();
                    vg0Var.addLast(new p80(((g8e) obj3).a((g8e) obj), i8, i7));
                } else if (i13 == i12) {
                    arrayList3.add(new p80(obj3, i13, i12));
                    vg0Var.removeLast();
                    vg0Var.addLast(new p80(obj, i8, i7));
                } else {
                    if (i12 < i7) {
                        ilg.c();
                        throw null;
                    }
                    vg0Var.addLast(new p80(((g8e) obj3).a((g8e) obj), i8, i7));
                }
            } else {
                vg0Var.addLast(new p80(obj, i8, i7));
            }
            i5++;
            list3 = list5;
            size = i11;
            i3 = 0;
        }
        while (i6 <= str2.length() && !vg0Var.isEmpty()) {
            p80 p80Var4 = (p80) vg0Var.last();
            Object obj4 = p80Var4.a;
            int i14 = p80Var4.c;
            arrayList3.add(new p80(obj4, i6, i14));
            while (!vg0Var.isEmpty() && i14 == ((p80) vg0Var.last()).c) {
                vg0Var.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList3.add(new p80(g8eVar, i6, str2.length()));
        }
        if (arrayList3.isEmpty()) {
            i2 = 0;
            arrayList3.add(new p80(g8eVar, 0, 0));
        } else {
            i2 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i15 = i2;
        while (i15 < size2) {
            p80 p80Var5 = (p80) arrayList3.get(i15);
            int i16 = p80Var5.b;
            int i17 = p80Var5.c;
            String substring = i16 != i17 ? str2.substring(i16, i17) : "";
            List a2 = r80.a(q80Var2, i16, i17, new dt(19));
            q80 q80Var4 = new q80(substring, a2 == null ? km5.a : a2);
            g8e g8eVar2 = (g8e) p80Var5.a;
            if (g8eVar2.b == 0) {
                str = str2;
                arrayList = arrayList3;
                g8eVar2 = new g8e(g8eVar2.a, g8eVar.b, g8eVar2.c, g8eVar2.d, g8eVar2.e, g8eVar2.f, g8eVar2.g, g8eVar2.h, g8eVar2.i);
            } else {
                str = str2;
                arrayList = arrayList3;
            }
            dfj dfjVar3 = new dfj(dfjVar2.a, g8eVar.a(g8eVar2));
            List list6 = q80Var4.a;
            List list7 = list6 == null ? km5.a : list6;
            List list8 = (List) this.c;
            ArrayList arrayList5 = new ArrayList(list8.size());
            int size3 = list8.size();
            int i18 = 0;
            while (i18 < size3) {
                p80 p80Var6 = (p80) list8.get(i18);
                int i19 = p80Var6.b;
                g8e g8eVar3 = g8eVar;
                int i20 = p80Var6.c;
                if (r80.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        s3a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list8;
                    arrayList5.add(new p80(p80Var6.a, i19 - i16, i20 - i16));
                } else {
                    list2 = list8;
                }
                i18++;
                list8 = list2;
                g8eVar = g8eVar3;
            }
            arrayList4.add(new d8e(new a20(substring, dfjVar3, list7, arrayList5, sf8Var, kx4Var), i16, i17));
            i15++;
            q80Var2 = q80Var;
            dfjVar2 = dfjVar;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f = arrayList4;
    }

    public static p03 D(kif kifVar, WebView webView, String str, String str2) {
        pea.J(webView, "WebView is null");
        if (str2 == null || str2.length() <= 256) {
            return new p03(kifVar, webView, str, str2);
        }
        a70.p("CustomReferenceData is greater than 256 characters");
        return null;
    }

    public static void r(int i2, int i3, int i4, int[] iArr) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = ((i6 >> 10) & 31) | ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5);
            i3++;
        }
    }

    public static int s(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    public static HashSet v() {
        nem nemVar;
        HashSet hashSet = new HashSet();
        for (htm htmVar : htm.e.values()) {
            if (htmVar != null) {
                nem nemVar2 = htmVar.d;
                hashSet.add(cga.R(nemVar2.vj(), nemVar2.nac()).getAbsolutePath());
                hashSet.add(cga.C(nemVar2.vj(), nemVar2.nac()).getAbsolutePath());
            }
        }
        for (rwm rwmVar : rem.a.values()) {
            if (rwmVar != null && (nemVar = rwmVar.b) != null) {
                hashSet.add(cga.R(nemVar.vj(), nemVar.nac()).getAbsolutePath());
                hashSet.add(cga.C(nemVar.vj(), nemVar.nac()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public boolean A(float[] fArr) {
        h7e[] h7eVarArr = (h7e[]) this.e;
        if (h7eVarArr != null && h7eVarArr.length > 0) {
            for (h7e h7eVar : h7eVarArr) {
                h7eVar.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        if (r1.getWindowVisibility() == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B() {
        double d;
        Rect rect = new Rect();
        View view = (View) this.b;
        boolean z = true;
        if (view.getLocalVisibleRect(rect)) {
            Rect rect2 = new Rect();
            int paddingTop = view.getPaddingTop();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect3 = new Rect();
            FrameLayout frameLayout = (FrameLayout) this.c;
            frameLayout.getGlobalVisibleRect(rect3);
            rect3.right = frameLayout.getWidth() + rect3.left;
            rect3.bottom = frameLayout.getHeight() + rect3.top;
            rect3.top = frameLayout.getPaddingTop() + rect3.top;
            rect3.bottom += -frameLayout.getPaddingBottom();
            rect3.left = frameLayout.getPaddingLeft() + rect3.left;
            rect3.right += -frameLayout.getPaddingRight();
            int i2 = iArr[0] - rect3.left;
            int i3 = (iArr[1] - rect3.top) + paddingTop;
            rect2.set(i2, i3, view.getWidth() + i2, (view.getHeight() + i3) - paddingTop);
            d = Math.abs(rect.width() * rect.height()) / Math.abs(rect2.width() * rect2.height());
        } else {
            d = 0.0d;
        }
        View view2 = view;
        while (true) {
            if (view2.getVisibility() != 0 || view2.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                break;
            }
            view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            if (view2 == null) {
            }
        }
        blg blgVar = new blg(z, d, rect);
        blg blgVar2 = (blg) this.f;
        if (blgVar2 == null || !blgVar.equals(blgVar2)) {
            ((zag) ((xag) this.d)).j(blgVar);
        }
        this.f = blgVar;
    }

    public ArrayList C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ntm(new File(u()).listFiles(), sea.n));
        arrayList.add(new ntm(new File(z()).listFiles(), sea.m));
        if (((String) this.d) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            this.d = mz1.o(sb, File.separator, "video_brand");
            File file = new File((String) this.d);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new ntm(new File((String) this.d).listFiles(), sea.o));
        arrayList.add(new ntm(new File(m()).listFiles(), sea.p));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E(String str) {
        i2o i2oVar = new i2o(new fjg(false), D((kif) this.b, (WebView) this.c, null, null), str);
        ((HashMap) this.f).put(str, i2oVar);
        f0l f0lVar = (f0l) this.d;
        i2oVar.b(f0lVar != null ? (View) f0lVar.get() : null);
        Iterator it = ((ytn) this.e).a.iterator();
        while (it.hasNext()) {
            ptn ptnVar = (ptn) it.next();
            View view = (View) ptnVar.a.get();
            cs8 cs8Var = ptnVar.c;
            String str2 = ptnVar.d;
            if (!i2oVar.f) {
                i2oVar.b.a(view, cs8Var, str2);
            }
        }
        i2oVar.a();
    }

    @Override // defpackage.e8e
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((d8e) arrayList.get(i2)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public ArrayList b(long j) {
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.f;
        HashMap hashMap2 = (HashMap) this.e;
        gin ginVar = (gin) this.b;
        ArrayList arrayList = new ArrayList();
        String str = ginVar.h;
        ginVar.g(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        ginVar.h(j, false, str, treeMap);
        ginVar.j(j, map, hashMap, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            String str2 = (String) hashMap2.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                min minVar = (min) hashMap.get(pair.first);
                minVar.getClass();
                zzcx zzcxVar = new zzcx();
                zzcxVar.b = decodeByteArray;
                zzcxVar.a = null;
                zzcxVar.h = minVar.b;
                zzcxVar.i = 0;
                zzcxVar.e = minVar.c;
                zzcxVar.f = 0;
                zzcxVar.g = minVar.e;
                zzcxVar.l = minVar.f;
                zzcxVar.m = minVar.g;
                zzcxVar.n = minVar.j;
                arrayList2.add(zzcxVar.b());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            min minVar2 = (min) hashMap.get(entry.getKey());
            minVar2.getClass();
            zzcx zzcxVar2 = (zzcx) entry.getValue();
            CharSequence charSequence = zzcxVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ein einVar : (ein[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ein.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(einVar), spannableStringBuilder.getSpanEnd(einVar), (CharSequence) "");
            }
            int i3 = 0;
            while (i3 < spannableStringBuilder.length()) {
                int i4 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
                i3 = i4;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i7 = 0;
            while (i7 < spannableStringBuilder.length() - 1) {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i8) == ' ') {
                    spannableStringBuilder.delete(i8, i7 + 2);
                }
                i7 = i8;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ' && spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i9, i10);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = minVar2.c;
            int i11 = minVar2.d;
            zzcxVar2.e = f;
            zzcxVar2.f = i11;
            zzcxVar2.g = minVar2.e;
            zzcxVar2.h = minVar2.b;
            zzcxVar2.l = minVar2.f;
            float f2 = minVar2.i;
            int i12 = minVar2.h;
            zzcxVar2.k = f2;
            zzcxVar2.j = i12;
            zzcxVar2.n = minVar2.j;
            arrayList2.add(zzcxVar2.b());
        }
        return arrayList2;
    }

    @Override // defpackage.e8e
    public float c() {
        return ((Number) ((joa) this.e).getValue()).floatValue();
    }

    @Override // defpackage.e8e
    public float d() {
        return ((Number) ((joa) this.d).getValue()).floatValue();
    }

    public void e(Activity activity) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new q("Can't add activity to CodelessMatcher on non-UI thread");
            }
            ((Set) this.c).add(activity);
            ((HashSet) this.e).clear();
            HashSet hashSet = (HashSet) ((HashMap) this.f).get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.e = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    q();
                } else {
                    ((Handler) this.b).post(new y2(this, 29));
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public qj2 f(pw0 pw0Var, Function0 function0) {
        int i2;
        int i3;
        int i4;
        dsf dsfVar = new dsf();
        dsfVar.a = -1;
        synchronized (this.b) {
            Throwable th = (Throwable) this.c;
            if (th != null) {
                pw0Var.b(th);
                return it7.j;
            }
            em0 em0Var = (em0) this.d;
            do {
                i2 = em0Var.get();
                i3 = i2 + 1;
            } while (!em0Var.compareAndSet(i2, i3));
            boolean z = (134217727 & i3) == 1;
            dsfVar.a = (i3 >>> 27) & 15;
            ((l0d) this.e).a(pw0Var);
            if (z) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.b) {
                        try {
                            if (((Throwable) this.c) == null) {
                                this.c = th2;
                                l0d l0dVar = (l0d) this.e;
                                Object[] objArr = l0dVar.a;
                                int i5 = l0dVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((pw0) objArr[i6]).b(th2);
                                }
                                ((l0d) this.e).d();
                                em0 em0Var2 = (em0) this.d;
                                do {
                                    i4 = em0Var2.get();
                                } while (!em0Var2.compareAndSet(i4, ((((i4 >>> 27) & 15) + 1) & 15) << 27));
                                Unit unit = Unit.a;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new k1d(new mi(4, pw0Var, this, dsfVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi g(int i2) {
        Bidi bidi;
        Layout layout = (Layout) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.e;
        if (zArr[i2]) {
            return (Bidi) arrayList2.get(i2);
        }
        int intValue = i2 == 0 ? 0 : ((Number) arrayList.get(i2 - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i2)).intValue();
        int i3 = intValue2 - intValue;
        char[] cArr = (char[]) this.f;
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i3)) {
            bidi = new Bidi(cArr2, 0, null, 0, i3, layout.getParagraphDirection(layout.getLineForOffset(l(i2))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i2, bidi);
        zArr[i2] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f = cArr2;
        return bidi;
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        switch (this.a) {
            case 17:
                g2k g2kVar = (g2k) this.b;
                Map map = (Map) this.d;
                HashMap hashMap = (HashMap) this.f;
                HashMap hashMap2 = (HashMap) this.e;
                ArrayList arrayList = new ArrayList();
                g2kVar.g(j, g2kVar.h, arrayList);
                TreeMap treeMap = new TreeMap();
                g2kVar.i(j, false, g2kVar.h, treeMap);
                g2kVar.h(j, map, hashMap, g2kVar.h, treeMap);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) hashMap2.get(pair.second);
                    if (str != null) {
                        byte[] decode = Base64.decode(str, 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        j2k j2kVar = (j2k) hashMap.get(pair.first);
                        j2kVar.getClass();
                        arrayList2.add(new l74(null, null, null, decodeByteArray, j2kVar.c, 0, j2kVar.e, j2kVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, j2kVar.f, j2kVar.g, false, -16777216, j2kVar.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    j2k j2kVar2 = (j2k) hashMap.get(entry.getKey());
                    j2kVar2.getClass();
                    j74 j74Var = (j74) entry.getValue();
                    CharSequence charSequence = j74Var.a;
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    for (bx4 bx4Var : (bx4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bx4.class)) {
                        spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(bx4Var), spannableStringBuilder.getSpanEnd(bx4Var), (CharSequence) "");
                    }
                    for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                        if (spannableStringBuilder.charAt(i2) == ' ') {
                            int i3 = i2 + 1;
                            int i4 = i3;
                            while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                                i4++;
                            }
                            int i5 = i4 - i3;
                            if (i5 > 0) {
                                spannableStringBuilder.delete(i2, i5 + i2);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                        spannableStringBuilder.delete(0, 1);
                    }
                    for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                        if (spannableStringBuilder.charAt(i6) == '\n') {
                            int i7 = i6 + 1;
                            if (spannableStringBuilder.charAt(i7) == ' ') {
                                spannableStringBuilder.delete(i7, i6 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                        if (spannableStringBuilder.charAt(i8) == ' ') {
                            int i9 = i8 + 1;
                            if (spannableStringBuilder.charAt(i9) == '\n') {
                                spannableStringBuilder.delete(i8, i9);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    float f = j2kVar2.c;
                    int i10 = j2kVar2.d;
                    j74Var.e = f;
                    j74Var.f = i10;
                    j74Var.g = j2kVar2.e;
                    j74Var.h = j2kVar2.b;
                    j74Var.l = j2kVar2.f;
                    float f2 = j2kVar2.i;
                    int i11 = j2kVar2.h;
                    j74Var.k = f2;
                    j74Var.j = i11;
                    j74Var.p = j2kVar2.j;
                    arrayList2.add(j74Var.a());
                }
                return arrayList2;
            default:
                h2k h2kVar = (h2k) this.b;
                Map map2 = (Map) this.d;
                HashMap hashMap3 = (HashMap) this.f;
                HashMap hashMap4 = (HashMap) this.e;
                ArrayList arrayList3 = new ArrayList();
                h2kVar.g(j, h2kVar.h, arrayList3);
                TreeMap treeMap2 = new TreeMap();
                h2kVar.i(j, false, h2kVar.h, treeMap2);
                h2kVar.h(j, map2, hashMap3, h2kVar.h, treeMap2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    String str2 = (String) hashMap4.get(pair2.second);
                    if (str2 != null) {
                        byte[] decode2 = Base64.decode(str2, 0);
                        Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
                        k2k k2kVar = (k2k) hashMap3.get(pair2.first);
                        k2kVar.getClass();
                        arrayList4.add(new m74(null, null, null, decodeByteArray2, k2kVar.c, 0, k2kVar.e, k2kVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, k2kVar.f, k2kVar.g, false, -16777216, k2kVar.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    }
                }
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    k2k k2kVar2 = (k2k) hashMap3.get(entry2.getKey());
                    k2kVar2.getClass();
                    k74 k74Var = (k74) entry2.getValue();
                    CharSequence charSequence2 = k74Var.a;
                    charSequence2.getClass();
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence2;
                    for (cx4 cx4Var : (cx4[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), cx4.class)) {
                        spannableStringBuilder2.replace(spannableStringBuilder2.getSpanStart(cx4Var), spannableStringBuilder2.getSpanEnd(cx4Var), (CharSequence) "");
                    }
                    for (int i12 = 0; i12 < spannableStringBuilder2.length(); i12++) {
                        if (spannableStringBuilder2.charAt(i12) == ' ') {
                            int i13 = i12 + 1;
                            int i14 = i13;
                            while (i14 < spannableStringBuilder2.length() && spannableStringBuilder2.charAt(i14) == ' ') {
                                i14++;
                            }
                            int i15 = i14 - i13;
                            if (i15 > 0) {
                                spannableStringBuilder2.delete(i12, i15 + i12);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(0) == ' ') {
                        spannableStringBuilder2.delete(0, 1);
                    }
                    for (int i16 = 0; i16 < spannableStringBuilder2.length() - 1; i16++) {
                        if (spannableStringBuilder2.charAt(i16) == '\n') {
                            int i17 = i16 + 1;
                            if (spannableStringBuilder2.charAt(i17) == ' ') {
                                spannableStringBuilder2.delete(i17, i16 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == ' ') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    for (int i18 = 0; i18 < spannableStringBuilder2.length() - 1; i18++) {
                        if (spannableStringBuilder2.charAt(i18) == ' ') {
                            int i19 = i18 + 1;
                            if (spannableStringBuilder2.charAt(i19) == '\n') {
                                spannableStringBuilder2.delete(i18, i19);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    float f3 = k2kVar2.c;
                    int i20 = k2kVar2.d;
                    k74Var.e = f3;
                    k74Var.f = i20;
                    k74Var.g = k2kVar2.e;
                    k74Var.h = k2kVar2.b;
                    k74Var.l = k2kVar2.f;
                    float f4 = k2kVar2.i;
                    int i21 = k2kVar2.h;
                    k74Var.k = f4;
                    k74Var.j = i21;
                    k74Var.p = k2kVar2.j;
                    arrayList4.add(k74Var.a());
                }
                return arrayList4;
        }
    }

    @Override // defpackage.kli
    public long getEventTime(int i2) {
        switch (this.a) {
        }
        return ((long[]) this.c)[i2];
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        switch (this.a) {
        }
        return ((long[]) this.c).length;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        switch (this.a) {
            case 17:
                long[] jArr = (long[]) this.c;
                int b = lik.b(jArr, j, false);
                if (b < jArr.length) {
                    return b;
                }
                return -1;
            default:
                long[] jArr2 = (long[]) this.c;
                int b2 = nik.b(jArr2, j, false);
                if (b2 < jArr2.length) {
                    return b2;
                }
                return -1;
        }
    }

    public void h(Function1 function1) {
        int i2;
        synchronized (this.b) {
            try {
                l0d l0dVar = (l0d) this.e;
                this.e = (l0d) this.f;
                this.f = l0dVar;
                em0 em0Var = (em0) this.d;
                do {
                    i2 = em0Var.get();
                } while (!em0Var.compareAndSet(i2, ((((i2 >>> 27) & 15) + 1) & 15) << 27));
                int i3 = l0dVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    function1.invoke(l0dVar.f(i4));
                }
                l0dVar.d();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float i(int i2, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    public float j(int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return i(i2, z);
        }
        int p = f6a.p(layout, i2, z2);
        int lineStart = layout.getLineStart(p);
        int lineEnd = layout.getLineEnd(p);
        if (i2 != lineStart && i2 != lineEnd) {
            return i(i2, z);
        }
        if (i2 == 0 || i2 == layout.getText().length()) {
            return i(i2, z);
        }
        int k = k(i2, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(l(k))) == -1;
        int o = o(lineEnd, lineStart);
        int l = l(k);
        int i5 = lineStart - l;
        int i6 = o - l;
        Bidi g2 = g(k);
        Bidi createLineBidi = g2 != null ? g2.createLineBidi(i5, i6) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i2 == lineStart ? z3 : !z3 ? layout.getLineLeft(p) : layout.getLineRight(p);
        }
        int runCount = createLineBidi.getRunCount();
        gma[] gmaVarArr = new gma[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            gmaVarArr[i7] = new gma(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) createLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, gmaVarArr, 0, runCount);
        if (i2 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i4 = -1;
                    break;
                }
                if (gmaVarArr[i9].a == i2) {
                    i4 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == gmaVarArr[i4].c) ? !z3 : z3;
            return (i4 == 0 && z4) ? layout.getLineLeft(p) : (i4 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(gmaVarArr[i4 - 1].a) : layout.getPrimaryHorizontal(gmaVarArr[i4 + 1].a) : layout.getLineRight(p);
        }
        int o2 = i2 > o ? o(i2, lineStart) : i2;
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i3 = -1;
                break;
            }
            if (gmaVarArr[i10].b == o2) {
                i3 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == gmaVarArr[i3].c) ? z3 : !z3;
        return (i3 == 0 && z5) ? layout.getLineLeft(p) : (i3 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(gmaVarArr[i3 - 1].b) : layout.getPrimaryHorizontal(gmaVarArr[i3 + 1].b) : layout.getLineRight(p);
    }

    public int k(int i2, boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        int f = b.f(arrayList, Integer.valueOf(i2));
        int i3 = f < 0 ? -(f + 1) : f + 1;
        if (z && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == ((Number) arrayList.get(i4)).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public int l(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.c).get(i2 - 1)).intValue();
    }

    public String m() {
        if (((String) this.f) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            this.f = mz1.o(sb, File.separator, "video_default");
            File file = new File((String) this.f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f;
    }

    public boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        r38 r38Var = (r38) this.c;
        r38Var.a();
        Context context = r38Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public int o(int i2, int i3) {
        while (i2 > i3) {
            char charAt = ((Layout) this.b).getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.d(charAt, 8192) < 0 || Intrinsics.d(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i2;
            }
            i2--;
        }
        return i2;
    }

    public tmi p(int i2) {
        tmi tmiVar;
        HashMap hashMap = (HashMap) this.f;
        tmi tmiVar2 = (tmi) hashMap.get(Integer.valueOf(i2));
        if (tmiVar2 != null) {
            return tmiVar2;
        }
        oe4 oe4Var = (oe4) this.d;
        oe4Var.getClass();
        final oe4 oe4Var2 = oe4Var;
        if (i2 != 0) {
            final int i3 = 1;
            if (i2 != 1) {
                final int i4 = 2;
                if (i2 == 2) {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(qcc.class);
                    tmiVar = new tmi() { // from class: dr4
                        @Override // defpackage.tmi
                        public final Object get() {
                            switch (i4) {
                            }
                            return hr4.e(asSubclass, oe4Var2);
                        }
                    };
                } else if (i2 == 3) {
                    tmiVar = new er4(i3, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(qcc.class));
                } else {
                    if (i2 != 4) {
                        a70.p(ljg.j(i2, "Unrecognized contentType: "));
                        return null;
                    }
                    tmiVar = new fr4(i3, this, oe4Var2);
                }
            } else {
                final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(qcc.class);
                tmiVar = new tmi() { // from class: dr4
                    @Override // defpackage.tmi
                    public final Object get() {
                        switch (i3) {
                        }
                        return hr4.e(asSubclass2, oe4Var2);
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(qcc.class);
            final int i5 = 0;
            tmiVar = new tmi() { // from class: dr4
                @Override // defpackage.tmi
                public final Object get() {
                    switch (i5) {
                    }
                    return hr4.e(asSubclass3, oe4Var2);
                }
            };
        }
        hashMap.put(Integer.valueOf(i2), tmiVar);
        return tmiVar;
    }

    public void q() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : (Set) this.c) {
                if (activity != null) {
                    ((LinkedHashSet) this.d).add(new o03(pd0.z(activity), (Handler) this.b, (HashSet) this.e, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public synchronized void t() {
        try {
            Iterator it = C().iterator();
            HashSet hashSet = null;
            while (it.hasNext()) {
                ntm ntmVar = (ntm) it.next();
                File[] fileArr = ntmVar.a;
                if (fileArr != null && fileArr.length >= ntmVar.b) {
                    if (hashSet == null) {
                        hashSet = v();
                    }
                    int i2 = ntmVar.b - 2;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    File[] fileArr2 = ntmVar.a;
                    if (i2 >= 0 && fileArr2 != null) {
                        try {
                            if (fileArr2.length > i2) {
                                List asList = Arrays.asList(fileArr2);
                                Collections.sort(asList, new q6i(24));
                                while (i2 < asList.size()) {
                                    if (!hashSet.contains(((File) asList.get(i2)).getAbsolutePath())) {
                                        ((File) asList.get(i2)).delete();
                                    }
                                    i2++;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String u() {
        if (((String) this.c) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            this.c = mz1.o(sb, File.separator, "video_reward_full");
            File file = new File((String) this.c);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.c;
    }

    public void w(Activity activity) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new q("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            ((Set) this.c).remove(activity);
            ((LinkedHashSet) this.d).clear();
            HashMap hashMap = (HashMap) this.f;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            Object clone = ((HashSet) this.e).clone();
            clone.getClass();
            hashMap.put(valueOf, (HashSet) clone);
            ((HashSet) this.e).clear();
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public void x(cu0 cu0Var, hyj hyjVar) {
        gyj gyjVar = (gyj) this.f;
        jv0 jv0Var = (jv0) this.b;
        String str = (String) this.c;
        if (str == null) {
            yhk.s("Null transportName");
            return;
        }
        kwj kwjVar = (kwj) this.e;
        if (kwjVar == null) {
            yhk.s("Null transformer");
            return;
        }
        kn5 kn5Var = (kn5) this.d;
        is4 is4Var = gyjVar.c;
        jv0 b = jv0Var.b(cu0Var.c);
        c40 c40Var = new c40();
        c40Var.g = new HashMap();
        c40Var.e = Long.valueOf(gyjVar.a.getTime());
        c40Var.f = Long.valueOf(gyjVar.b.getTime());
        c40Var.b = str;
        c40Var.d = new dn5(kn5Var, (byte[]) kwjVar.apply(cu0Var.b));
        c40Var.c = cu0Var.a;
        vu0 vu0Var = cu0Var.d;
        if (vu0Var != null) {
            c40Var.h = vu0Var.a;
        }
        is4Var.b.execute(new kx0(is4Var, b, hyjVar, c40Var.i(), 2));
    }

    public void y(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.b).put(str, obj);
        f1d f1dVar = (f1d) ((LinkedHashMap) this.d).get(str);
        if (f1dVar != null) {
            ((fdi) f1dVar).l(obj);
        }
        f1d f1dVar2 = (f1d) ((LinkedHashMap) this.e).get(str);
        if (f1dVar2 != null) {
            ((fdi) f1dVar2).l(obj);
        }
    }

    public String z() {
        if (((String) this.e) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            this.e = mz1.o(sb, File.separator, "video_splash");
            File file = new File((String) this.e);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzfrg zzfrgVar;
        zzfrg zzfrgVar2;
        zzfrg zzfrgVar3;
        zzfrg zzfrgVar4;
        int i2 = 18;
        boolean z = false;
        switch (this.a) {
            case 23:
                zzfqw zzfqwVar = (zzfqw) this.d;
                if (((Boolean) zzba.zzc().a(zzbjg.R6)).booleanValue()) {
                    zze.zzb("Native ad failed to load", th);
                }
                zzdpa zzdpaVar = (zzdpa) this.e;
                com.google.android.gms.ads.internal.client.zze b = zzfmy.b(th, zzdpaVar.a().l);
                zzdpaVar.b().i0(b);
                zzeux zzeuxVar = (zzeux) this.f;
                zzeuxVar.b.d().execute(new bnn(17, this, b));
                zzfmt.a(b.zza, "NativeAdLoader.onFailure", th);
                ((fjn) this.b).mo17zza();
                if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar = (zzfrg) this.c) == null) {
                    zzfrj zzfrjVar = zzeuxVar.e;
                    zzfqwVar.b(b);
                    zzfqwVar.a(th);
                    zzfqwVar.zzd(false);
                    zzfrjVar.b(zzfqwVar.zzm());
                    return;
                }
                zzfrgVar.f(b);
                zzfqwVar.a(th);
                zzfqwVar.zzd(false);
                zzfrgVar.a(zzfqwVar);
                zzfrgVar.h();
                return;
            case 24:
                if (((Boolean) zzba.zzc().a(zzbjg.R6)).booleanValue()) {
                    zze.zzb("App open ad failed to load", th);
                }
                zzfgl zzfglVar = (zzfgl) this.f;
                zzcvn zzcvnVar = (zzcvn) zzfglVar.e.zzd();
                com.google.android.gms.ads.internal.client.zze b2 = zzcvnVar == null ? zzfmy.b(th, null) : zzfmy.b(th, zzcvnVar.zza().l);
                synchronized (zzfglVar) {
                    try {
                        zzfglVar.j = null;
                        if (zzcvnVar != null) {
                            zzcvnVar.zze().i0(b2);
                            if (((Boolean) zzba.zzc().a(zzbjg.B9)).booleanValue()) {
                                zzfglVar.b.execute(new wjn(i2, this, b2));
                            }
                        } else {
                            zzfglVar.d.i0(b2);
                            ((zzcvn) zzfglVar.c((a8o) this.e).zzh()).zza().f.zzo();
                        }
                        zzfmt.a(b2.zza, "AppOpenAdLoader.onFailure", th);
                        ((zzeup) this.b).mo12zza();
                        if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar2 = (zzfrg) this.c) == null) {
                            zzfrj zzfrjVar2 = zzfglVar.h;
                            zzfqw zzfqwVar2 = (zzfqw) this.d;
                            zzfqwVar2.b(b2);
                            zzfqwVar2.a(th);
                            zzfqwVar2.zzd(false);
                            zzfrjVar2.b(zzfqwVar2.zzm());
                        } else {
                            zzfrgVar2.f(b2);
                            zzfqw zzfqwVar3 = (zzfqw) this.d;
                            zzfqwVar3.a(th);
                            zzfqwVar3.zzd(false);
                            zzfrgVar2.a(zzfqwVar3);
                            zzfrgVar2.h();
                        }
                    } finally {
                    }
                }
                return;
            case 25:
                if (((Boolean) zzba.zzc().a(zzbjg.R6)).booleanValue()) {
                    zze.zzb("Interstitial ad failed to load", th);
                }
                zzdoe zzdoeVar = (zzdoe) this.e;
                com.google.android.gms.ads.internal.client.zze b3 = zzfmy.b(th, zzdoeVar.b().l);
                zzfjg zzfjgVar = (zzfjg) this.f;
                synchronized (zzfjgVar) {
                    try {
                        zzfjgVar.i = null;
                        zzdoeVar.a().i0(b3);
                        if (((Boolean) zzba.zzc().a(zzbjg.C9)).booleanValue()) {
                            zzfjgVar.b.execute(new bnn(i2, this, b3));
                            zzfjgVar.b.execute(new wjn(19, this, b3));
                        }
                        zzfmt.a(b3.zza, "InterstitialAdLoader.onFailure", th);
                        ((zzeup) this.b).mo12zza();
                        if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar3 = (zzfrg) this.c) == null) {
                            zzfrj zzfrjVar3 = zzfjgVar.g;
                            zzfqw zzfqwVar4 = (zzfqw) this.d;
                            zzfqwVar4.b(b3);
                            zzfqwVar4.a(th);
                            zzfqwVar4.zzd(false);
                            zzfrjVar3.b(zzfqwVar4.zzm());
                        } else {
                            zzfrgVar3.f(b3);
                            zzfqw zzfqwVar5 = (zzfqw) this.d;
                            zzfqwVar5.a(th);
                            zzfqwVar5.zzd(false);
                            zzfrgVar3.a(zzfqwVar5);
                            zzfrgVar3.h();
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(zzbjg.R6)).booleanValue()) {
                    zze.zzb("Rewarded ad failed to load", th);
                }
                zzfkq zzfkqVar = (zzfkq) this.f;
                zzdwp zzdwpVar = (zzdwp) zzfkqVar.e.zzd();
                com.google.android.gms.ads.internal.client.zze b4 = zzdwpVar == null ? zzfmy.b(th, null) : zzfmy.b(th, ((o) zzdwpVar).zza().l);
                synchronized (zzfkqVar) {
                    try {
                        if (zzdwpVar != null) {
                            zzdwpVar.zze().i0(b4);
                            zzfkqVar.b.execute(new nkn(this, b4, z, 21));
                        } else {
                            zzfkqVar.d.i0(b4);
                            ((ivn) zzfkqVar.b((o8o) this.e)).zzh().zza().f.zzo();
                        }
                        zzfmt.a(b4.zza, "RewardedAdLoader.onFailure", th);
                        ((zzeup) this.b).mo12zza();
                        if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar4 = (zzfrg) this.c) == null) {
                            zzfrj zzfrjVar4 = zzfkqVar.g;
                            zzfqw zzfqwVar6 = (zzfqw) this.d;
                            zzfqwVar6.b(b4);
                            zzfqwVar6.a(th);
                            zzfqwVar6.zzd(false);
                            zzfrjVar4.b(zzfqwVar6.zzm());
                        } else {
                            zzfrgVar4.f(b4);
                            zzfqw zzfqwVar7 = (zzfqw) this.d;
                            zzfqwVar7.a(th);
                            zzfqwVar7.zzd(false);
                            zzfrgVar4.a(zzfqwVar7);
                            zzfrgVar4.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zzfrg zzfrgVar;
        zzfrg zzfrgVar2;
        zzfrg zzfrgVar3;
        zzfrg zzfrgVar4;
        final int i2 = 1;
        switch (this.a) {
            case 23:
                zzeux zzeuxVar = (zzeux) this.f;
                zzcyl zzcylVar = (zzcyl) obj;
                synchronized (zzeuxVar) {
                    if (zzcylVar != null) {
                        try {
                            zzcylVar.b();
                        } finally {
                        }
                    }
                    zzcylVar.g.a.a.b = zzeuxVar.d.b;
                    ((fjn) this.b).c(zzcylVar);
                    zzeuxVar.b.d().execute(new rxn(this, i2));
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar = (zzfrg) this.c) == null) {
                        zzfrj zzfrjVar = zzeuxVar.e;
                        zzfqw zzfqwVar = (zzfqw) this.d;
                        zzfqwVar.f(zzcylVar.a.b);
                        zzfqwVar.zzi(zzcylVar.f.a);
                        zzfqwVar.zzd(true);
                        zzfrjVar.b(zzfqwVar.zzm());
                    } else {
                        zzfrgVar.e(zzcylVar.a.b);
                        zzfrgVar.g(zzcylVar.f.a);
                        zzfqw zzfqwVar2 = (zzfqw) this.d;
                        zzfqwVar2.zzd(true);
                        zzfrgVar.a(zzfqwVar2);
                        zzfrgVar.h();
                    }
                }
                return;
            case 24:
                zzfgl zzfglVar = (zzfgl) this.f;
                zzcyl zzcylVar2 = (zzcyl) obj;
                synchronized (zzfglVar) {
                    if (zzcylVar2 != null) {
                        try {
                            zzcylVar2.b();
                        } finally {
                        }
                    }
                    zzfglVar.j = null;
                    if (((Boolean) zzba.zzc().a(zzbjg.B9)).booleanValue()) {
                        zzcylVar2.g.a.a.d = zzfglVar.d;
                    }
                    ((zzeup) this.b).c(zzcylVar2);
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar2 = (zzfrg) this.c) == null) {
                        zzfrj zzfrjVar2 = zzfglVar.h;
                        zzfqw zzfqwVar3 = (zzfqw) this.d;
                        zzfqwVar3.f(zzcylVar2.a.b);
                        zzfqwVar3.zzi(zzcylVar2.f.a);
                        zzfqwVar3.zzd(true);
                        zzfrjVar2.b(zzfqwVar3.zzm());
                    } else {
                        zzfrgVar2.e(zzcylVar2.a.b);
                        zzfrgVar2.g(zzcylVar2.f.a);
                        zzfqw zzfqwVar4 = (zzfqw) this.d;
                        zzfqwVar4.zzd(true);
                        zzfrgVar2.a(zzfqwVar4);
                        zzfrgVar2.h();
                    }
                }
                return;
            case 25:
                zzfjg zzfjgVar = (zzfjg) this.f;
                zzdmx zzdmxVar = (zzdmx) obj;
                synchronized (zzfjgVar) {
                    if (zzdmxVar != null) {
                        try {
                            zzdmxVar.b();
                        } finally {
                        }
                    }
                    zzfjgVar.i = null;
                    inn innVar = zzbjg.C9;
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                        zzdhf zzdhfVar = zzdmxVar.g.a;
                        zzeua zzeuaVar = zzfjgVar.d;
                        zzdig zzdigVar = zzdhfVar.a;
                        zzdigVar.b = zzeuaVar;
                        zzdigVar.e = zzfjgVar.e;
                    }
                    ((zzeup) this.b).c(zzdmxVar);
                    if (((Boolean) zzba.zzc().a(innVar)).booleanValue()) {
                        zzfjgVar.b.execute(new Runnable(this) { // from class: m8o
                            public final /* synthetic */ p03 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                int i3 = i2;
                                p03 p03Var = this.b;
                                switch (i3) {
                                    case 0:
                                        ((zzfjg) p03Var.f).e.zzg();
                                        break;
                                    default:
                                        ((zzfjg) p03Var.f).d.zzg();
                                        break;
                                }
                            }
                        });
                        final int i3 = 0;
                        zzfjgVar.b.execute(new Runnable(this) { // from class: m8o
                            public final /* synthetic */ p03 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                int i32 = i3;
                                p03 p03Var = this.b;
                                switch (i32) {
                                    case 0:
                                        ((zzfjg) p03Var.f).e.zzg();
                                        break;
                                    default:
                                        ((zzfjg) p03Var.f).d.zzg();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar3 = (zzfrg) this.c) == null) {
                        zzfrj zzfrjVar3 = zzfjgVar.g;
                        zzfqw zzfqwVar5 = (zzfqw) this.d;
                        zzfqwVar5.f(zzdmxVar.a.b);
                        zzfqwVar5.zzi(zzdmxVar.f.a);
                        zzfqwVar5.zzd(true);
                        zzfrjVar3.b(zzfqwVar5.zzm());
                    } else {
                        zzfrgVar3.e(zzdmxVar.a.b);
                        zzfrgVar3.g(zzdmxVar.f.a);
                        zzfqw zzfqwVar6 = (zzfqw) this.d;
                        zzfqwVar6.zzd(true);
                        zzfrgVar3.a(zzfqwVar6);
                        zzfrgVar3.h();
                    }
                }
                return;
            default:
                zzfkq zzfkqVar = (zzfkq) this.f;
                zzdwk zzdwkVar = (zzdwk) obj;
                synchronized (zzfkqVar) {
                    if (zzdwkVar != null) {
                        try {
                            zzdwkVar.b();
                        } finally {
                        }
                    }
                    zzdwkVar.g.a.a.e = zzfkqVar.d;
                    ((zzeup) this.b).c(zzdwkVar);
                    Executor executor = zzfkqVar.b;
                    zzfkh zzfkhVar = zzfkqVar.d;
                    Objects.requireNonNull(zzfkhVar);
                    executor.execute(new x3o(zzfkhVar, 12));
                    zzfkqVar.d.onAdMetadataChanged();
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar4 = (zzfrg) this.c) == null) {
                        zzfrj zzfrjVar4 = zzfkqVar.g;
                        zzfqw zzfqwVar7 = (zzfqw) this.d;
                        zzfqwVar7.f(zzdwkVar.a.b);
                        zzfqwVar7.zzi(zzdwkVar.f.a);
                        zzfqwVar7.zzd(true);
                        zzfrjVar4.b(zzfqwVar7.zzm());
                    } else {
                        zzfrgVar4.e(zzdwkVar.a.b);
                        zzfrgVar4.g(zzdwkVar.f.a);
                        zzfqw zzfqwVar8 = (zzfqw) this.d;
                        zzfqwVar8.zzd(true);
                        zzfrgVar4.a(zzfqwVar8);
                        zzfrgVar4.h();
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public long zzb(int i2) {
        return ((long[]) this.c)[i2];
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
    }

    public /* synthetic */ p03(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ p03(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, boolean z) {
        this.a = i2;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj;
    }

    public p03(xuo xuoVar, File file, File file2, File file3) {
        this.a = 28;
        this.b = xuoVar;
        this.c = file;
        this.d = file3;
        this.e = file2;
    }

    public p03(kif kifVar, WebView webView) {
        int i2 = 27;
        this.a = 27;
        this.f = new HashMap();
        this.e = new ytn();
        if (cqn.a.a) {
            this.b = kifVar;
            this.c = webView;
            if (y0l.b("WEB_MESSAGE_LISTENER")) {
                v0l.d(webView, "omidJsSessionService");
                v0l.a(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new b1l(this, i2));
                return;
            }
            a70.m("The JavaScriptSessionService cannot be supported in this WebView version.");
            throw null;
        }
        a70.r("Method called before OM SDK activation");
        throw null;
    }

    public p03(kif kifVar, WebView webView, String str, String str2) {
        this.a = 21;
        this.d = new ArrayList();
        new HashMap();
        this.b = kifVar;
        this.c = webView;
        this.f = str;
        this.e = str2;
    }

    public p03(Context context, r38 r38Var, l48 l48Var, ox9 ox9Var, pic picVar) {
        this.a = 9;
        this.b = new zzm(context, zzm.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
        this.c = r38Var;
        this.d = l48Var;
        this.e = ox9Var;
        this.f = picVar;
    }

    public p03(gin ginVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 20;
        this.b = ginVar;
        this.f = hashMap2;
        this.e = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        ginVar.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        this.c = jArr;
    }

    public p03(w1 w1Var) {
        this.a = 15;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public p03(Map map) {
        this.a = 14;
        map.getClass();
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new qb3(this, 6);
    }

    public p03(Drawable.Callback callback) {
        this.a = 8;
        this.b = new tm0();
        this.f = new HashMap();
        this.c = new HashMap();
        this.e = ".ttf";
        if (!(callback instanceof View)) {
            ajb.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }

    public p03(Layout layout) {
        this.a = 10;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int O = StringsKt.O(((Layout) this.b).getText(), '\n', i2, 4);
            i2 = O < 0 ? ((Layout) this.b).getText().length() : O + 1;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < ((Layout) this.b).getText().length());
        this.c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.d = arrayList2;
        this.e = new boolean[((ArrayList) this.c).size()];
        ((ArrayList) this.c).size();
    }

    public p03(z88 z88Var, iz2 iz2Var) {
        this.a = 4;
        z88Var.getClass();
        this.b = new b10((byte) 0, 5);
        aeh a = beh.a(1, Integer.MAX_VALUE, a62.a);
        this.c = a;
        rq3 rq3Var = null;
        this.d = new gki(a, new g2(this, rq3Var, 17));
        g9i L = xw3.L(iz2Var, null, nu3.b, new hy1(z88Var, this, rq3Var, 4), 1);
        L.n(new ox1(this, 14));
        this.e = L;
        this.f = new pog(new hy1(this, rq3Var, 3));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
        zzesj zzesjVar = (zzesj) this.e;
        zzesn zzesnVar = ((zzese) this.f).d;
        zzflo zzfloVar = (zzflo) this.c;
        zzfld zzfldVar = (zzfld) this.d;
        zzcgo zzcgoVar = (zzcgo) this.b;
        int i2 = 19;
        z5o z5oVar = new z5o(new b1l(i2, zzesnVar, zzfldVar), null);
        evn d = zzesnVar.a.d(new zzczb(zzfloVar, zzfldVar, null), z5oVar);
        d1l d1lVar = new d1l(i2, zzesnVar, d);
        synchronized (zzesjVar) {
            zzesjVar.a = d1lVar;
        }
        zzcgoVar.zzc(d.d());
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public int zza() {
        return ((long[]) this.c).length;
    }

    public p03(g2k g2kVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 17;
        this.b = g2kVar;
        this.f = hashMap2;
        this.e = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        g2kVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        this.c = jArr;
    }

    public p03(h2k h2kVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 18;
        this.b = h2kVar;
        this.f = hashMap2;
        this.e = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        h2kVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        this.c = jArr;
    }

    public p03(int i2) {
        this.a = i2;
        final int i3 = 0;
        switch (i2) {
            case 3:
                this.b = new Object();
                this.d = new em0(0);
                this.e = new l0d();
                this.f = new l0d();
                break;
            case 12:
                this.e = ypa.b(new Function0(this) { // from class: d0e
                    public final /* synthetic */ p03 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = i3;
                        p03 p03Var = this.b;
                        switch (i4) {
                            case 0:
                                Context context = (Context) p03Var.b;
                                if (context == null) {
                                    Intrinsics.i("context");
                                    throw null;
                                }
                                h0e h0eVar = new h0e(context);
                                gpe gpeVar = (gpe) p03Var.d;
                                if (gpeVar != null) {
                                    h0eVar.c = gpeVar;
                                    return h0eVar;
                                }
                                Intrinsics.i("onSwipeCallback");
                                throw null;
                            default:
                                return new f0e(p03Var);
                        }
                    }
                });
                final int i4 = 1;
                this.f = ypa.b(new Function0(this) { // from class: d0e
                    public final /* synthetic */ p03 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i4;
                        p03 p03Var = this.b;
                        switch (i42) {
                            case 0:
                                Context context = (Context) p03Var.b;
                                if (context == null) {
                                    Intrinsics.i("context");
                                    throw null;
                                }
                                h0e h0eVar = new h0e(context);
                                gpe gpeVar = (gpe) p03Var.d;
                                if (gpeVar != null) {
                                    h0eVar.c = gpeVar;
                                    return h0eVar;
                                }
                                Intrinsics.i("onSwipeCallback");
                                throw null;
                            default:
                                return new f0e(p03Var);
                        }
                    }
                });
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                newSetFromMap.getClass();
                this.c = newSetFromMap;
                this.d = new LinkedHashSet();
                this.e = new HashSet();
                this.f = new HashMap();
                break;
        }
    }

    public /* synthetic */ p03(int i2, boolean z) {
        this.a = i2;
    }

    public p03(int[] iArr, int i2, h7e[] h7eVarArr) {
        s13 s13Var;
        this.a = 1;
        this.f = new float[3];
        this.e = h7eVarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int s = s(Color.blue(i4), 8, 5) | (s(Color.red(i4), 8, 5) << 10) | (s(Color.green(i4), 8, 5) << 5);
            iArr[i3] = s;
            iArr2[s] = iArr2[s] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(s((i6 >> 10) & 31, 5, 8), s((i6 >> 5) & 31, 5, 8), s(i6 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                ThreadLocal threadLocal = o23.a;
                o23.b(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (A(fArr)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.b = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i2) {
            this.d = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                ((ArrayList) this.d).add(new i7e(Color.rgb(s((i10 >> 10) & 31, 5, 8), s((i10 >> 5) & 31, 5, 8), s(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i2, i);
        priorityQueue.offer(new s13(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i2 && (s13Var = (s13) priorityQueue.poll()) != null) {
            int i11 = s13Var.b;
            int i12 = s13Var.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            }
            p03 p03Var = s13Var.j;
            if ((i11 + 1) - i12 > 1) {
                int i13 = s13Var.e - s13Var.d;
                int i14 = s13Var.g - s13Var.f;
                int i15 = s13Var.i - s13Var.h;
                int i16 = (i13 < i14 || i13 < i15) ? (i14 < i13 || i14 < i15) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) p03Var.b;
                int[] iArr5 = (int[]) p03Var.c;
                r(i16, i12, i11, iArr4);
                Arrays.sort(iArr4, i12, s13Var.b + 1);
                r(i16, i12, s13Var.b, iArr4);
                int i17 = s13Var.c / 2;
                int i18 = 0;
                int i19 = i12;
                while (true) {
                    int i20 = s13Var.b;
                    if (i19 > i20) {
                        break;
                    }
                    i18 += iArr5[iArr4[i19]];
                    if (i18 >= i17) {
                        i12 = Math.min(i20 - 1, i19);
                        break;
                    }
                    i19++;
                }
                s13 s13Var2 = new s13(p03Var, i12 + 1, s13Var.b);
                s13Var.b = i12;
                s13Var.a();
                priorityQueue.offer(s13Var2);
                priorityQueue.offer(s13Var);
            } else {
                a70.r("Can not split a box with only 1 color");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            s13 s13Var3 = (s13) it.next();
            p03 p03Var2 = s13Var3.j;
            int[] iArr6 = (int[]) p03Var2.b;
            int[] iArr7 = (int[]) p03Var2.c;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = s13Var3.a; i25 <= s13Var3.b; i25++) {
                int i26 = iArr6[i25];
                int i27 = iArr7[i26];
                i22 += i27;
                i21 = (((i26 >> 10) & 31) * i27) + i21;
                i23 = (((i26 >> 5) & 31) * i27) + i23;
                i24 += i27 * (i26 & 31);
            }
            float f = i22;
            i7e i7eVar = new i7e(Color.rgb(s(Math.round(i21 / f), 5, 8), s(Math.round(i23 / f), 5, 8), s(Math.round(i24 / f), 5, 8)), i22);
            if (!A(i7eVar.b())) {
                arrayList.add(i7eVar);
            }
        }
        this.d = arrayList;
    }

    public p03(gp4 gp4Var) {
        this.a = 5;
        this.b = gp4Var;
        this.f = new HashMap();
        this.e = new HashSet();
        this.c = new HashMap();
    }

    public p03(hp4 hp4Var, zic zicVar) {
        this.a = 6;
        this.b = hp4Var;
        this.e = zicVar;
        this.f = new HashMap();
        this.c = new HashMap();
    }
}
