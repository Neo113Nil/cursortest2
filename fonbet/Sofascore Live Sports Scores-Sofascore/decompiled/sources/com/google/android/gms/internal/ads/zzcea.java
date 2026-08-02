package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.e3c;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.mpo;
import defpackage.vlo;
import defpackage.w1l;
import defpackage.wjn;
import defpackage.xlo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcea implements zzcef {
    public static final List l = w1l.n();
    public final zzijq a;
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final zzcec g;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object h = new Object();
    public final HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public zzcea(Context context, VersionInfoParcel versionInfoParcel, zzcec zzcecVar, String str) {
        Preconditions.j(zzcecVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.g = zzcecVar;
        Iterator it = zzcecVar.e.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzijq G = zzilp.G();
        G.n();
        ((zzilp) G.b).R(9);
        if (str != null) {
            G.n();
            ((zzilp) G.b).H(str);
            G.n();
            ((zzilp) G.b).I(str);
        }
        zzijr D = zzijs.D();
        String str2 = this.g.a;
        if (str2 != null) {
            D.n();
            ((zzijs) D.b).E(str2);
        }
        zzijs zzijsVar = (zzijs) D.o();
        G.n();
        ((zzilp) G.b).J(zzijsVar);
        zzilb D2 = zzilc.D();
        boolean c = Wrappers.a(this.e).c();
        D2.n();
        ((zzilc) D2.b).G(c);
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            D2.n();
            ((zzilc) D2.b).E(str3);
        }
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
        Context context2 = this.e;
        googleApiAvailabilityLight.getClass();
        long b = GooglePlayServicesUtilLight.b(context2);
        if (b > 0) {
            D2.n();
            ((zzilc) D2.b).F(b);
        }
        zzilc zzilcVar = (zzilc) D2.o();
        G.n();
        ((zzilp) G.b).O(zzilcVar);
        this.a = G;
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void a(int i, String str, Map map) {
        synchronized (this.h) {
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    zzikz zzikzVar = (zzikz) linkedHashMap.get(str);
                    zzikzVar.n();
                    ((zzila) zzikzVar.b).K(4);
                }
                return;
            }
            zzikz F = zzila.F();
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i2 != 0) {
                F.n();
                ((zzila) F.b).K(i2);
            }
            int size = linkedHashMap.size();
            F.n();
            ((zzila) F.b).G(size);
            F.n();
            ((zzila) F.b).H(str);
            zzikd D = zzikg.D();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzikb D2 = zzikc.D();
                        mpo mpoVar = zziei.b;
                        mpo mpoVar2 = str2.isEmpty() ? zziei.b : new mpo(str2.getBytes(StandardCharsets.UTF_8));
                        D2.n();
                        ((zzikc) D2.b).E(mpoVar2);
                        mpo mpoVar3 = str3.isEmpty() ? zziei.b : new mpo(str3.getBytes(StandardCharsets.UTF_8));
                        D2.n();
                        ((zzikc) D2.b).F(mpoVar3);
                        zzikc zzikcVar = (zzikc) D2.o();
                        D.n();
                        ((zzikg) D.b).E(zzikcVar);
                    }
                }
            }
            zzikg zzikgVar = (zzikg) D.o();
            F.n();
            ((zzila) F.b).I(zzikgVar);
            linkedHashMap.put(str, F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzcef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.g.c && !this.j) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzcee.a("Failed to capture the webview bitmap.");
                return;
            }
            this.j = true;
            wjn wjnVar = new wjn(4, this, bitmap2);
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                wjnVar.run();
            } else {
                zzcgj.a.execute(wjnVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final zzcec zza() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void zzb(String str) {
        synchronized (this.h) {
            zzijq zzijqVar = this.a;
            if (str == null) {
                zzijqVar.n();
                ((zzilp) zzijqVar.b).M();
            } else {
                zzijqVar.n();
                ((zzilp) zzijqVar.b).L(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final boolean zzc() {
        return this.g.c && !this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void zzf() {
        synchronized (this.h) {
            this.b.keySet();
            xlo a = zzhcy.a(Collections.EMPTY_MAP);
            cpn cpnVar = new cpn(this, 1);
            hsn hsnVar = zzcgj.h;
            hlo h = zzhcy.h(a, cpnVar, hsnVar);
            ddb g = zzhcy.g(h, 10L, TimeUnit.SECONDS, zzcgj.d);
            h.addListener(new vlo(0, h, new e3c(this, g)), hsnVar);
            l.add(g);
        }
    }
}
