package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzate;
import com.google.android.gms.internal.ads.zzatj;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaue;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnc;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdcq;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.network.response.AmericanFootballPlayerEventStatistics;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import kotlin.collections.b;
import kotlin.reflect.KClass;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g7h implements tti, epe, ooh, s35, zli, zzaat, zzhcv {
    public static g7h f;
    public static final h7e g = new h7e();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public g7h(Typeface typeface, yic yicVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 12;
        this.e = typeface;
        this.b = yicVar;
        this.d = new bjc(1024);
        int a = yicVar.a(6);
        if (a != 0) {
            int i5 = a + yicVar.a;
            i = ((ByteBuffer) yicVar.d).getInt(((ByteBuffer) yicVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int a2 = yicVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + yicVar.a;
            i2 = ((ByteBuffer) yicVar.d).getInt(((ByteBuffer) yicVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            d6k d6kVar = new d6k(this, i7);
            xic b = d6kVar.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.c, i7 * 2);
            xic b2 = d6kVar.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            l4a.h("invalid metadata codepoint length", i3 > 0);
            bjc bjcVar = (bjc) this.d;
            xic b3 = d6kVar.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            bjcVar.a(d6kVar, 0, i4 - 1);
        }
    }

    public static synchronized g7h s() {
        g7h g7hVar;
        synchronized (g7h.class) {
            g7hVar = f;
            if (g7hVar == null) {
                g7hVar = new g7h(0);
                f = g7hVar;
            }
        }
        return g7hVar;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        dd ddVar = (dd) this.d;
        PhotoView photoView = (PhotoView) ddVar.d;
        Resources resources = ((AbstractChatFragment) this.e).getResources();
        resources.getClass();
        photoView.setImageDrawable(rfo.t(nr9Var, resources));
        ((ProgressBar) ddVar.c).setVisibility(8);
    }

    public void B(cci cciVar) {
        cciVar.getClass();
        ecg ecgVar = new ecg(10, this, cciVar);
        synchronized (this.d) {
        }
        ((Handler) ((dad) this.b).b).postDelayed(ecgVar, 5400000L);
    }

    public synchronized void C(zzats zzatsVar) {
        try {
            HashMap hashMap = (HashMap) this.b;
            String zzi = zzatsVar.zzi();
            List list = (List) hashMap.remove(zzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzaue.a) {
                zzaue.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzi);
            }
            zzats zzatsVar2 = (zzats) list.remove(0);
            hashMap.put(zzi, list);
            synchronized (zzatsVar2.e) {
                zzatsVar2.k = this;
            }
            try {
                ((PriorityBlockingQueue) this.d).put(zzatsVar2);
            } catch (InterruptedException e) {
                zzaue.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                zzate zzateVar = (zzate) this.c;
                zzateVar.d = true;
                zzateVar.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
        ((ProgressBar) ((dd) this.b).c).setVisibility(8);
        ((Dialog) this.c).dismiss();
    }

    public synchronized boolean E(zzats zzatsVar) {
        try {
            HashMap hashMap = (HashMap) this.b;
            String zzi = zzatsVar.zzi();
            if (!hashMap.containsKey(zzi)) {
                hashMap.put(zzi, null);
                synchronized (zzatsVar.e) {
                    zzatsVar.k = this;
                }
                if (zzaue.a) {
                    zzaue.b("new request, sending to network %s", zzi);
                }
                return false;
            }
            List list = (List) hashMap.get(zzi);
            if (list == null) {
                list = new ArrayList();
            }
            zzatsVar.zzc("waiting-for-response");
            list.add(zzatsVar);
            hashMap.put(zzi, list);
            if (zzaue.a) {
                zzaue.b("Request for cacheKey=%s is in flight, putting on hold.", zzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.epe
    public List a() {
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics = (AmericanFootballPlayerEventStatistics) this.d;
        AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2 = (AmericanFootballPlayerEventStatistics) this.c;
        ArrayList arrayList = new ArrayList();
        for (rt rtVar : (List) this.e) {
            if (rtVar.b(americanFootballPlayerEventStatistics2, americanFootballPlayerEventStatistics)) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                }
                arrayList.addAll(rtVar.a((Context) this.b, americanFootballPlayerEventStatistics2, americanFootballPlayerEventStatistics));
            }
        }
        return arrayList;
    }

    @Override // defpackage.s35
    public File b(pia piaVar) {
        String u = ((y3g) this.b).u(piaVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(piaVar);
        }
        try {
            de0 j = r().j(u);
            if (j != null) {
                return ((File[]) j.b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public void c() {
        lql lqlVar;
        hpo.a("%s : start", "OneDTPropertyWatchdog");
        Context context = (Context) this.c;
        if (context == null || (lqlVar = (lql) this.b) == null || lqlVar.b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(lqlVar, intentFilter, 4);
        } else {
            context.registerReceiver(lqlVar, intentFilter);
        }
        ((lql) this.b).b = true;
    }

    @Override // defpackage.s35
    public void d(pia piaVar, sx2 sx2Var) {
        u35 u35Var;
        boolean z;
        String u = ((y3g) this.b).u(piaVar);
        fp4 fp4Var = (fp4) this.d;
        synchronized (fp4Var) {
            u35Var = (u35) ((HashMap) fp4Var.b).get(u);
            if (u35Var == null) {
                ba2 ba2Var = (ba2) fp4Var.c;
                synchronized (ba2Var.a) {
                    u35Var = (u35) ba2Var.a.poll();
                }
                if (u35Var == null) {
                    u35Var = new u35();
                }
                ((HashMap) fp4Var.b).put(u, u35Var);
            }
            u35Var.b++;
        }
        u35Var.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(piaVar);
            }
            try {
                k45 r = r();
                if (r.j(u) == null) {
                    en0 h = r.h(u);
                    if (h == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(u));
                    }
                    try {
                        if (((gn5) sx2Var.a).i(sx2Var.b, h.q(), (uvd) sx2Var.c)) {
                            ((k45) h.e).f(h, true);
                            h.b = true;
                        }
                        if (!z) {
                            h.b();
                        }
                    } finally {
                        if (!h.b) {
                            try {
                                h.b();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            ((fp4) this.d).H(u);
        }
    }

    public void e(ArrayList arrayList) {
        if (arrayList == null) {
            a70.p("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = (ArrayList) this.d;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList2 = (ArrayList) this.c;
            if (TextUtils.isEmpty(str)) {
                a70.p("groupMemberId must not be empty");
                return;
            } else if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    public synchronized void g() {
        if (!((LinkedHashSet) this.b).isEmpty()) {
            ((ni3) this.c).e(0L);
        }
    }

    @Override // defpackage.ooh
    public cwh getSource() {
        return (ss4) this.d;
    }

    @Override // defpackage.zli
    public void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var) {
        m74 m74Var;
        int i3;
        int i4;
        int i5;
        int D;
        sfe sfeVar = (sfe) this.d;
        int[] iArr = sfeVar.a;
        j9e j9eVar = (j9e) sfeVar.i;
        j9e j9eVar2 = (j9e) this.c;
        j9e j9eVar3 = (j9e) this.b;
        j9eVar3.L(bArr, i + i2);
        j9eVar3.N(i);
        Inflater inflater = (Inflater) this.e;
        if (inflater == null) {
            inflater = new Inflater();
            this.e = inflater;
        }
        String str = nik.a;
        if (j9eVar3.a() > 0 && j9eVar3.j() == 120 && nik.M(j9eVar3, j9eVar2, inflater)) {
            j9eVar3.L(j9eVar2.a, j9eVar2.c);
        }
        int i6 = 0;
        sfeVar.c = 0;
        sfeVar.d = 0;
        sfeVar.e = 0;
        sfeVar.f = 0;
        sfeVar.g = 0;
        sfeVar.h = 0;
        j9eVar.K(0);
        sfeVar.b = false;
        ArrayList arrayList = new ArrayList();
        while (j9eVar3.a() >= 3) {
            int i7 = j9eVar3.c;
            int A = j9eVar3.A();
            int H = j9eVar3.H();
            int i8 = j9eVar3.b + H;
            if (i8 > i7) {
                j9eVar3.N(i7);
                i3 = i6;
                m74Var = null;
            } else {
                char c = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                j9eVar3.O(2);
                                Arrays.fill(iArr, i6);
                                int i9 = H / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int A2 = j9eVar3.A();
                                    char c2 = c;
                                    double A3 = j9eVar3.A();
                                    double A4 = j9eVar3.A() - 128;
                                    double A5 = j9eVar3.A() - 128;
                                    iArr[A2] = nik.j((int) ((A5 * 1.772d) + A3), 0, 255) | (j9eVar3.A() << 24) | (nik.j((int) ((1.402d * A4) + A3), 0, 255) << 16) | (nik.j((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    c = c2;
                                    sfeVar = sfeVar;
                                }
                                sfeVar.b = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                j9eVar3.O(3);
                                int i11 = H - 4;
                                if (((128 & j9eVar3.A()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (D = j9eVar3.D()) >= 4) {
                                        sfeVar.g = j9eVar3.H();
                                        sfeVar.h = j9eVar3.H();
                                        j9eVar.K(D - 4);
                                        i11 = H - 11;
                                    }
                                }
                                int i12 = j9eVar.b;
                                int i13 = j9eVar.c;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    j9eVar3.k(j9eVar.a, i12, min);
                                    j9eVar.N(i12 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                sfeVar.c = j9eVar3.H();
                                sfeVar.d = j9eVar3.H();
                                j9eVar3.O(11);
                                sfeVar.e = j9eVar3.H();
                                sfeVar.f = j9eVar3.H();
                                break;
                            }
                            break;
                    }
                    m74Var = null;
                    i3 = 0;
                } else {
                    if (sfeVar.c == 0 || sfeVar.d == 0 || sfeVar.g == 0 || sfeVar.h == 0 || (i4 = j9eVar.c) == 0 || j9eVar.b != i4 || !sfeVar.b) {
                        m74Var = null;
                    } else {
                        j9eVar.N(0);
                        int i14 = sfeVar.g * sfeVar.h;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int A6 = j9eVar.A();
                            if (A6 != 0) {
                                i5 = i15 + 1;
                                iArr2[i15] = iArr[A6];
                            } else {
                                int A7 = j9eVar.A();
                                if (A7 != 0) {
                                    i5 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | j9eVar.A()) + i15;
                                    Arrays.fill(iArr2, i15, i5, (A7 & 128) == 0 ? iArr[0] : iArr[j9eVar.A()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, sfeVar.g, sfeVar.h, Bitmap.Config.ARGB_8888);
                        float f2 = sfeVar.e;
                        float f3 = sfeVar.c;
                        float f4 = f2 / f3;
                        float f5 = sfeVar.f;
                        float f6 = sfeVar.d;
                        m74Var = new m74(null, null, null, createBitmap, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, sfeVar.g / f3, sfeVar.h / f6, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    i3 = 0;
                    sfeVar.c = 0;
                    sfeVar.d = 0;
                    sfeVar.e = 0;
                    sfeVar.f = 0;
                    sfeVar.g = 0;
                    sfeVar.h = 0;
                    j9eVar.K(0);
                    sfeVar.b = false;
                }
                j9eVar3.N(i8);
            }
            if (m74Var != null) {
                arrayList.add(m74Var);
            }
            i6 = i3;
        }
        wn3Var.accept(new q74(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // defpackage.ooh
    public ejh i() {
        return (rs4) this.e;
    }

    public mac k() {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.d));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.c));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.e));
        return new mac(bundle);
    }

    @Override // defpackage.zli
    public int l() {
        return 2;
    }

    public void m(cci cciVar) {
        Runnable runnable;
        cciVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.e).remove(cciVar);
        }
        if (runnable != null) {
            ((Handler) ((dad) this.b).b).removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // com.google.android.gms.internal.ads.zzaat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s o(int i, zzbg zzbgVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Point point;
        int i7;
        zzbg zzbgVar2 = zzbgVar;
        gio gioVar = zzabc.k;
        Point point2 = (Point) this.e;
        int i8 = ((int[]) this.d)[i];
        zzaaq zzaaqVar = (zzaaq) this.c;
        int i9 = point2 != null ? point2.x : zzaaqVar.e;
        int i10 = point2 != null ? point2.y : zzaaqVar.f;
        boolean z = zzaaqVar.h;
        if (i9 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < zzbgVar2.a; i12++) {
                zzv zzvVar = zzbgVar2.d[i12];
                int i13 = zzvVar.v;
                if (i13 > 0 && (i4 = zzvVar.w) > 0) {
                    if (z) {
                        if ((i13 > i4) != (i9 > i10)) {
                            i6 = i10;
                            i5 = i9;
                            if (i13 * i5 < i4 * i6) {
                                String str = zzfm.a;
                                point = new Point(i6, ((r11 + i13) - 1) / i13);
                            } else {
                                String str2 = zzfm.a;
                                point = new Point(((r10 + i4) - 1) / i4, i5);
                            }
                            i7 = i13 * i4;
                            if (i13 >= ((int) (point.x * 0.98f)) && i4 >= ((int) (point.y * 0.98f)) && i7 < i11) {
                                i11 = i7;
                            }
                        }
                    }
                    i5 = i10;
                    i6 = i9;
                    if (i13 * i5 < i4 * i6) {
                    }
                    i7 = i13 * i4;
                    if (i13 >= ((int) (point.x * 0.98f))) {
                        i11 = i7;
                    }
                }
            }
            i2 = i11;
        }
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        int i14 = 0;
        while (i14 < zzbgVar2.a) {
            zzv zzvVar2 = zzbgVar2.d[i14];
            int i15 = zzvVar2.v;
            int i16 = (i15 == -1 || (i3 = zzvVar2.w) == -1) ? -1 : i15 * i3;
            zzgxjVar.c(new o6n(i, zzbgVar2, i14, zzaaqVar, iArr[i14], (String) this.b, i2 == Integer.MAX_VALUE || (i16 != -1 && i16 <= i2)));
            i14++;
            zzbgVar2 = zzbgVar;
        }
        return zzgxjVar.f();
    }

    public void p(fze fzeVar, boolean z) {
        tze tzeVar = (tze) this.e;
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((mze) list.get(i)).b()) {
                z(fzeVar);
                return;
            }
        }
        wdd wddVar = (wdd) this.b;
        if (wddVar == null) {
            a70.r("layoutCoordinates not set");
            return;
        }
        yfa.Q(fzeVar, wddVar.P(0L), new i20(11, this, tzeVar), false);
        if (((rze) this.c) == rze.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((mze) list.get(i2)).a();
                }
            }
            yih yihVar = fzeVar.b;
            if (yihVar != null) {
                yihVar.b = !tzeVar.c;
            }
        }
    }

    public xmi q(hc hcVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xmi xmiVar = (xmi) arrayList.get(i);
            if (xmiVar != null && xmiVar.b == hcVar) {
                return xmiVar;
            }
        }
        xmi xmiVar2 = new xmi((Context) this.c, hcVar);
        arrayList.add(xmiVar2);
        return xmiVar2;
    }

    public synchronized k45 r() {
        k45 k45Var;
        k45Var = (k45) this.e;
        if (k45Var == null) {
            k45Var = k45.m((File) this.c);
            this.e = k45Var;
        }
        return k45Var;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                String socket = ((Socket) this.b).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public ltk u(String str, KClass kClass) {
        ltk ltkVar;
        ltk b;
        kClass.getClass();
        str.getClass();
        synchronized (((w9f) this.e)) {
            try {
                ltkVar = (ltk) ((stk) this.b).a.get(str);
                if (kClass.isInstance(ltkVar)) {
                    qtk qtkVar = (qtk) this.c;
                    if (qtkVar instanceof sqg) {
                        sqg sqgVar = (sqg) qtkVar;
                        ltkVar.getClass();
                        g6b g6bVar = sqgVar.d;
                        if (g6bVar != null) {
                            nqg nqgVar = sqgVar.e;
                            nqgVar.getClass();
                            nq8.t(ltkVar, nqgVar, g6bVar);
                        }
                    }
                    ltkVar.getClass();
                } else {
                    qzc qzcVar = new qzc((ly3) this.d);
                    qzcVar.a.put(dy0.m, str);
                    qtk qtkVar2 = (qtk) this.c;
                    qtkVar2.getClass();
                    try {
                        try {
                            b = qtkVar2.c(kClass, qzcVar);
                        } catch (AbstractMethodError unused) {
                            b = qtkVar2.a(sha.x(kClass), qzcVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        b = qtkVar2.b(sha.x(kClass));
                    }
                    ltkVar = b;
                    stk stkVar = (stk) this.b;
                    stkVar.getClass();
                    ltkVar.getClass();
                    ltk ltkVar2 = (ltk) stkVar.a.put(str, ltkVar);
                    if (ltkVar2 != null) {
                        ltkVar2.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ltkVar;
    }

    public boolean v(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.d).booleanValue();
    }

    public boolean w(Context context) {
        Boolean bool = (Boolean) this.c;
        if (bool == null) {
            bool = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.c = bool;
        }
        bool.booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public boolean x(hc hcVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(q(hcVar), new jfc((Context) this.c, (bni) menuItem));
    }

    public boolean y(hc hcVar, vec vecVar) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        xmi q = q(hcVar);
        fhh fhhVar = (fhh) this.e;
        Menu menu = (Menu) fhhVar.get(vecVar);
        if (menu == null) {
            menu = new dgc((Context) this.c, vecVar);
            fhhVar.put(vecVar, menu);
        }
        return callback.onCreateActionMode(q, menu);
    }

    public void z(fze fzeVar) {
        if (((rze) this.c) == rze.b) {
            wdd wddVar = (wdd) this.b;
            if (wddVar == null) {
                a70.r("layoutCoordinates not set");
                return;
            }
            yfa.Q(fzeVar, wddVar.P(0L), new sze((tze) this.e, 1), true);
        }
        this.c = rze.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzt.zzh().d("OpenGmsgHandler.attributionReportingManager", th);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c7 A[Catch: all -> 0x04a0, TryCatch #0 {all -> 0x04a0, blocks: (B:166:0x045d, B:170:0x048e, B:179:0x0494, B:173:0x04b3, B:175:0x04c7, B:183:0x04a3, B:184:0x04d5), top: B:165:0x045d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0494 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0528  */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(Object obj) {
        boolean z;
        Intent parseUri;
        boolean z2;
        boolean z3;
        String str;
        int i;
        Intent intent;
        boolean z4;
        String str2;
        String str3;
        Bundle zzl;
        IHsdpDeepLinkServiceWrapper a;
        zzdcq zzdcqVar;
        Uri data;
        String str4 = (String) obj;
        if (((Boolean) zzba.zzc().a(zzbjg.Ib)).booleanValue()) {
            ((Map) this.c).put("u", str4);
        }
        zzbqv zzbqvVar = (zzbqv) this.e;
        zza zzaVar = (zza) this.d;
        Map map = (Map) this.c;
        String str5 = (String) this.b;
        zzclm zzclmVar = (zzclm) zzaVar;
        zzfld e = zzclmVar.e();
        zzflg g2 = zzclmVar.g();
        String str6 = "";
        boolean z5 = false;
        if (e == null || g2 == null) {
            z = false;
        } else {
            str6 = g2.b;
            z = e.b();
        }
        boolean z6 = (((Boolean) zzba.zzc().a(zzbjg.qc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z7 = ((Boolean) zzba.zzc().a(zzbjg.ve)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str5)) {
            if (zzclmVar.d()) {
                int i2 = zze.zza;
                zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzbqvVar.i(false);
                ((zzcnc) zzaVar).I(zzbqv.b(map), "1".equals(map.get("custom_close")), z6);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str5)) {
            zzbqvVar.i(false);
            if (((Boolean) zzba.zzc().a(zzbjg.Dd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z5 = true;
            }
            if (str4 != null) {
                ((zzcnc) zzaVar).i0(zzbqv.b(map), str4, "1".equals(map.get("custom_close")), z6, z5);
                return;
            } else {
                ((zzcnc) zzaVar).N("1".equals(map.get("custom_close")), zzbqv.b(map), (String) map.get("html"), z6, (String) map.get("baseurl"));
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str5)) {
            Context context = zzclmVar.getContext();
            if (((Boolean) zzba.zzc().a(zzbjg.P5)).booleanValue()) {
                zze.zza("User opt out chrome custom tab.");
                zzbqvVar.j(10);
            } else {
                if (((Boolean) zzba.zzc().a(zzbjg.I5)).booleanValue()) {
                    String b = ba4.b(context);
                    if (b != null && !context.getPackageName().equals(b)) {
                        z5 = true;
                    }
                } else {
                    z5 = zzbkh.a(context);
                }
                if (z5) {
                    zzbqvVar.i(true);
                    if (TextUtils.isEmpty(str4)) {
                        int i3 = zze.zza;
                        zzo.zzi("Cannot open browser with null or empty url");
                        zzbqvVar.j(7);
                        return;
                    }
                    Uri d = zzbqv.d(zzbqv.c(zzclmVar.getContext(), zzclmVar.p(), Uri.parse(str4), zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT()));
                    if (z && zzbqvVar.e != null && zzbqvVar.f(zzaVar, zzclmVar.getContext(), d.toString(), str6)) {
                        return;
                    }
                    zzbqvVar.i = new ton(zzbqvVar);
                    zzcnc zzcncVar = (zzcnc) zzaVar;
                    String uri = d.toString();
                    zzaa zzaaVar = zzbqvVar.i;
                    Bundle bundle = new Bundle();
                    if (((Boolean) zzba.zzc().a(zzbjg.O5)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt(h.b, Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e2) {
                                zze.zzb("Invalid cct initial height parameter.", e2);
                                zzt.zzh().d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e2);
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e3) {
                                zze.zzb("Invalid cct close button position parameter.", e3);
                                zzt.zzh().d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e3);
                            }
                        }
                    }
                    zzcncVar.b0(new zzc(null, uri, null, null, null, null, null, null, new ObjectWrapper(zzaaVar), true, bundle), z6, z7, str6);
                    return;
                }
                zzbqvVar.j(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzbqvVar.h(zzaVar, map, z, str6, z6, z7);
            return;
        }
        if ("app".equalsIgnoreCase(str5) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzbqvVar.h(zzaVar, map, z, str6, z6, z7);
            return;
        }
        String str7 = str6;
        boolean z8 = z7;
        boolean z9 = z;
        if ("open_app".equalsIgnoreCase(str5)) {
            if (((Boolean) zzba.zzc().a(zzbjg.E9)).booleanValue()) {
                zzbqvVar.i(true);
                String str8 = (String) map.get(TtmlNode.TAG_P);
                if (str8 == null) {
                    int i4 = zze.zza;
                    zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z9 && zzbqvVar.e != null && zzbqvVar.f(zzaVar, zzclmVar.getContext(), str8, str7)) {
                    return;
                }
                PackageManager packageManager = zzclmVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = zze.zza;
                    zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str8);
                    if (launchIntentForPackage != null) {
                        ((zzcnc) zzaVar).b0(new zzc(launchIntentForPackage, zzbqvVar.i), z6, z8, str7);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzbqvVar.i(true);
        String str9 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str9)) {
            try {
                parseUri = Intent.parseUri(str9, 0);
            } catch (URISyntaxException e4) {
                String valueOf = String.valueOf(str9);
                int i6 = zze.zza;
                zzo.zzg("Error parsing the url: ".concat(valueOf), e4);
            }
            if (parseUri != null && parseUri.getData() != null) {
                data = parseUri.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri d2 = zzbqv.d(zzbqv.c(zzclmVar.getContext(), zzclmVar.p(), data, zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT()));
                    if (!TextUtils.isEmpty(parseUri.getType())) {
                        if (((Boolean) zzba.zzc().a(zzbjg.F9)).booleanValue()) {
                            parseUri.setDataAndType(d2, parseUri.getType());
                        }
                    }
                    parseUri.setData(d2);
                }
            }
            z2 = !((Boolean) zzba.zzc().a(zzbjg.aa)).booleanValue() && "intent_async".equalsIgnoreCase(str5) && map.containsKey("event_id");
            if (((Boolean) zzba.zzc().a(zzbjg.Ae)).booleanValue() || (zzdcqVar = zzbqvVar.g) == null) {
                z3 = z2;
                str = str4;
                i = 4;
            } else {
                synchronized (zzdcqVar.a) {
                    int i7 = zzdcqVar.c.E0;
                    if (i7 > 0) {
                        i = 4;
                        if (!zzdcqVar.h) {
                            zzfsc zzfscVar = zzdcqVar.g;
                            z3 = z2;
                            str = str4;
                            long a2 = zzdcqVar.d.a();
                            zzfscVar.n();
                            ((zzfsd) zzfscVar.b).F(a2);
                            zzdcqVar.h = true;
                            zzdcqVar.f.schedule(new fsn(zzdcqVar, 17), i7, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        i = 4;
                    }
                    z3 = z2;
                    str = str4;
                }
            }
            if (((Boolean) zzba.zzc().a(zzbjg.Ce)).booleanValue() && zzbqvVar.h != null && map.get("hf") != null && ((String) map.get("hf")).equals("2") && map.get("hstp") != null) {
                try {
                    String str10 = (String) map.get("hstp");
                    str2 = (String) map.get("hsr");
                    str3 = (String) map.get("hseqp");
                    boolean equals = ((String) map.getOrDefault("hsat", "false")).equals("true");
                    if (str2 != null && str3 != null) {
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                zzl = zzbp.zzl(new JSONObject(str3));
                            } catch (JSONException e5) {
                                int i8 = zze.zza;
                                zzo.zzm(i);
                                zzt.zzh().d("OpenGmsgHandler.parseHsdpExtraQueryParams", e5);
                            }
                            zzdcg zzdcgVar = zzbqvVar.h;
                            Context context2 = ((zzclm) zzaVar).getContext();
                            uon uonVar = new uon(zzbqvVar, str7);
                            a = zzdcgVar.a(context2);
                            if (a != null) {
                                a.open(new ObjectWrapper(context2), str10, str2, zzl, equals, uonVar);
                                return;
                            }
                            return;
                        }
                        zzl = null;
                        zzdcg zzdcgVar2 = zzbqvVar.h;
                        Context context22 = ((zzclm) zzaVar).getContext();
                        uon uonVar2 = new uon(zzbqvVar, str7);
                        a = zzdcgVar2.a(context22);
                        if (a != null) {
                        }
                    }
                    zze.zza("HSDP service parameters missing.");
                } catch (Throwable th) {
                    if (((Boolean) zzba.zzc().a(zzbjg.Fe)).booleanValue()) {
                        zzcaq.e(zzclmVar.getContext()).a("HsdpServiceUnsampled.invokeOpen", th);
                    } else {
                        zzcaq.c(zzclmVar.getContext()).a("HsdpService.invokeOpen", th);
                    }
                }
            }
            HashMap hashMap = new HashMap();
            if (z3) {
                intent = parseUri;
                z4 = z6;
            } else {
                intent = parseUri;
                von vonVar = new von(zzbqvVar, z6, zzaVar, hashMap, map);
                zzbqvVar = zzbqvVar;
                zzaVar = zzaVar;
                map = map;
                zzbqvVar.i = vonVar;
                z4 = false;
            }
            if (intent == null) {
                if (!z9 || zzbqvVar.e == null || !zzbqvVar.f(zzaVar, zzclmVar.getContext(), intent.getData().toString(), str7)) {
                    ((zzcnc) zzaVar).b0(new zzc(intent, zzbqvVar.i), z4, z8, str7);
                    return;
                } else {
                    if (z3) {
                        hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                        ((zzbte) zzaVar).n("openIntentAsync", hashMap);
                        return;
                    }
                    return;
                }
            }
            String uri2 = !TextUtils.isEmpty(str) ? zzbqv.d(zzbqv.c(zzclmVar.getContext(), zzclmVar.p(), Uri.parse(str), zzclmVar.zzE(), zzclmVar.zzj(), zzclmVar.zzT())).toString() : str;
            if (!z9 || zzbqvVar.e == null || !zzbqvVar.f(zzaVar, zzclmVar.getContext(), uri2, str7)) {
                ((zzcnc) zzaVar).b0(new zzc((String) map.get(i.a), uri2, (String) map.get(InneractiveMediationDefs.GENDER_MALE), (String) map.get(TtmlNode.TAG_P), (String) map.get(a.q), (String) map.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map.get("e"), zzbqvVar.i), z4, z8, str7);
                return;
            } else {
                if (z3) {
                    hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbte) zzaVar).n("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        parseUri = null;
        if (parseUri != null) {
            data = parseUri.getData();
            if (!Uri.EMPTY.equals(data)) {
            }
        }
        if (((Boolean) zzba.zzc().a(zzbjg.aa)).booleanValue()) {
        }
        if (((Boolean) zzba.zzc().a(zzbjg.Ae)).booleanValue()) {
        }
        z3 = z2;
        str = str4;
        i = 4;
        if (((Boolean) zzba.zzc().a(zzbjg.Ce)).booleanValue()) {
            String str102 = (String) map.get("hstp");
            str2 = (String) map.get("hsr");
            str3 = (String) map.get("hseqp");
            boolean equals2 = ((String) map.getOrDefault("hsat", "false")).equals("true");
            if (str2 != null) {
                if (!TextUtils.isEmpty(str3)) {
                }
                zzl = null;
                zzdcg zzdcgVar22 = zzbqvVar.h;
                Context context222 = ((zzclm) zzaVar).getContext();
                uon uonVar22 = new uon(zzbqvVar, str7);
                a = zzdcgVar22.a(context222);
                if (a != null) {
                }
            }
            zze.zza("HSDP service parameters missing.");
        }
        HashMap hashMap2 = new HashMap();
        if (z3) {
        }
        if (intent == null) {
        }
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
    }

    public /* synthetic */ g7h(zzaaq zzaaqVar, String str, int[] iArr, Point point) {
        this.a = 27;
        this.c = zzaaqVar;
        this.b = str;
        this.d = iArr;
        this.e = point;
    }

    public /* synthetic */ g7h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public g7h(zzate zzateVar, PriorityBlockingQueue priorityBlockingQueue, zzatj zzatjVar) {
        this.a = 28;
        this.b = new HashMap();
        this.e = zzatjVar;
        this.c = zzateVar;
        this.d = priorityBlockingQueue;
    }

    public g7h(zzbqv zzbqvVar, Map map, zza zzaVar, String str) {
        this.a = 29;
        this.c = map;
        this.d = zzaVar;
        this.b = str;
        this.e = zzbqvVar;
    }

    public g7h(Context context, boolean z, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics, AmericanFootballPlayerEventStatistics americanFootballPlayerEventStatistics2) {
        this.a = 3;
        context.getClass();
        this.b = context;
        this.c = americanFootballPlayerEventStatistics;
        this.d = americanFootballPlayerEventStatistics2;
        dpe dpeVar = new dpe(americanFootballPlayerEventStatistics2 != null, z);
        this.e = b.j(new hae(dpeVar), new aag(dpeVar), new wpf(dpeVar), new wu4(dpeVar), new xu4(dpeVar), new ms8(dpeVar), new xja(dpeVar), new zhf(dpeVar), new yja(dpeVar), new yhf(dpeVar));
    }

    public g7h(dad dadVar, c0l c0lVar) {
        this.a = 22;
        this.b = dadVar;
        this.c = c0lVar;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public g7h(ku3 ku3Var, kz3 kz3Var, xt3 xt3Var, ce4 ce4Var) {
        this.a = 20;
        ku3Var.getClass();
        this.b = ku3Var;
        this.c = ce4Var;
        this.d = ml4.g(Integer.MAX_VALUE, 6, null);
        this.e = new de0(10);
        yda ydaVar = (yda) ku3Var.getCoroutineContext().get(uic.g);
        if (ydaVar != null) {
            ydaVar.n(new vsc(17, kz3Var, this, xt3Var));
        }
    }

    public g7h(stk stkVar, qtk qtkVar, ly3 ly3Var) {
        this.a = 24;
        stkVar.getClass();
        qtkVar.getClass();
        ly3Var.getClass();
        this.b = stkVar;
        this.c = qtkVar;
        this.d = ly3Var;
        this.e = new w9f(3);
    }

    public g7h(Socket socket) {
        this.a = 8;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new ss4(this);
        this.e = new rs4(this);
    }

    public g7h(tze tzeVar) {
        this.a = 16;
        this.e = tzeVar;
        this.c = rze.a;
    }

    public g7h(r38 r38Var, l48 l48Var, ji3 ji3Var, di3 di3Var, Context context, String str, qi3 qi3Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = 7;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = new ni3(r38Var, l48Var, ji3Var, di3Var, context, str, linkedHashSet, qi3Var, scheduledExecutorService);
        this.d = context;
        this.e = scheduledExecutorService;
    }

    public g7h(File file) {
        this.a = 9;
        this.d = new fp4(7);
        this.c = file;
        this.b = new y3g(7);
    }

    public /* synthetic */ g7h(int i, boolean z) {
        this.a = i;
    }

    public g7h(dad dadVar) {
        this.a = 10;
        this.b = new eb9();
        this.c = new eb9();
        this.e = new v9f(3);
    }

    public g7h(f4a f4aVar, jrb jrbVar) {
        this.a = 5;
        this.e = f4aVar;
        this.b = jrbVar;
        hfb hfbVar = (hfb) f4aVar.b;
        String str = (String) f4aVar.c;
        gfb b = hfbVar.b(str);
        this.d = b;
        if (b != null) {
            this.c = b.b(jrbVar);
        } else {
            a70.r(lnb.o("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            throw null;
        }
    }

    public g7h(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new j9e();
                this.c = new j9e();
                this.d = new sfe(1);
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public g7h(Context context, ActionMode.Callback callback) {
        this.a = 21;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new fhh(0);
    }

    public g7h(List list, ArrayList arrayList) {
        this.a = 1;
        this.b = list;
        this.d = new SparseBooleanArray();
        this.c = new dh0(0);
        int size = list.size();
        int i = Integer.MIN_VALUE;
        i7e i7eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            i7e i7eVar2 = (i7e) list.get(i2);
            int i3 = i7eVar2.e;
            if (i3 > i) {
                i7eVar = i7eVar2;
                i = i3;
            }
        }
        this.e = i7eVar;
    }

    public g7h(hvk hvkVar, a9d a9dVar) {
        this.a = 25;
        this.e = hvkVar;
        this.b = new SparseIntArray(1);
        this.c = new SparseIntArray(1);
        this.d = a9dVar;
    }

    public g7h(vvf vvfVar, z2d z2dVar, z2d z2dVar2, z2d z2dVar3) {
        Object obj;
        this.a = 13;
        if (vvfVar != null) {
            obj = hv9.v(vvfVar);
        } else {
            av9 av9Var = hv9.b;
            obj = vvf.e;
        }
        this.b = obj;
        this.c = z2dVar;
        this.d = z2dVar2;
        this.e = z2dVar3;
    }

    public g7h(String str, String str2) {
        this.a = 11;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashSet();
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            } else {
                yhk.s("name must not be null");
                throw null;
            }
        }
        yhk.s("id must not be null");
        throw null;
    }

    public g7h(mac macVar) {
        this.a = 11;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new HashSet();
        this.b = new Bundle(macVar.a);
        this.c = macVar.c();
        this.d = macVar.b();
        this.e = macVar.a();
    }

    public g7h(AudioTrack audioTrack, hpo hpoVar) {
        this.a = 4;
        this.b = audioTrack;
        this.c = hpoVar;
        Handler q = nik.q(null);
        this.d = q;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: gp0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                g7h g7hVar = g7h.this;
                if (((gp0) g7hVar.e) == null) {
                    return;
                }
                dy0.u().execute(new r0(17, g7hVar, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, q);
    }

    public g7h(qsj qsjVar, boolean[] zArr) {
        this.a = 17;
        this.b = qsjVar;
        this.c = zArr;
        int i = qsjVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
