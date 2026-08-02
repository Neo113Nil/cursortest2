package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.billingclient.api.DeveloperProvidedBillingListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.facebook.login.m;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzgvf;
import com.google.android.gms.internal.play_billing.zzcf;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u53 implements j, zzdom {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;

    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195 A[EDGE_INSN: B:80:0x0195->B:66:0x0195 BREAK  A[LOOP:2: B:53:0x0141->B:69:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0137 A[EDGE_INSN: B:89:0x0137->B:52:0x0137 BREAK  A[LOOP:3: B:82:0x0120->B:88:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u53(hcd hcdVar, olk olkVar, ku3 ku3Var) {
        List list;
        av4 av4Var;
        Iterator it;
        Iterator it2;
        h5a rkkVar;
        Object rkkVar2;
        String str;
        flk flkVar;
        alk alkVar;
        hcdVar.getClass();
        this.b = hcdVar;
        this.c = olkVar;
        this.d = ku3Var;
        this.e = ypa.b(mz.M);
        tkk tkkVar = olkVar.b;
        if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
            list = km5.a;
        } else {
            ArrayList arrayList = alkVar.a;
            list = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ykk ykkVar = ((zkk) it3.next()).b;
                o13.v(ykkVar != null ? ykkVar.a : km5.a, list);
            }
        }
        int g = ((hcd) this.b).g();
        int c = ((hcd) this.b).c();
        List list2 = x53.a;
        list.getClass();
        float f = g / c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (x53.a((xkk) obj) != 5) {
                arrayList2.add(obj);
            }
        }
        List H0 = CollectionsKt.H0(arrayList2, new cp(new w53(f, g, c), 3));
        this.f = H0;
        xkk xkkVar = (xkk) this.i;
        boolean z = true;
        z = true;
        Object obj2 = null;
        boolean z2 = false;
        if (xkkVar != null) {
            String str2 = xkkVar.f;
            String str3 = xkkVar.g;
            klk klkVar = xkkVar.e;
            String str4 = klkVar != null ? klkVar.a : null;
            if (str4 == null || str4.length() == 0) {
                rkkVar2 = (str3 == null || str3.length() == 0) ? (str2 == null || str2.length() == 0) ? null : new rkk(str2) : new qkk(str3);
            } else {
                klkVar.getClass();
                rkkVar2 = new skk(klkVar.a, klkVar.b);
            }
            skk skkVar = rkkVar2 instanceof skk ? (skk) rkkVar2 : null;
            if (skkVar != null) {
                List list3 = x53.a;
                String b = x53.b(skkVar);
                if (b != null) {
                    str = b.toLowerCase(Locale.ROOT);
                    str.getClass();
                } else {
                    str = null;
                }
                if (CollectionsKt.R(list3, str)) {
                    ku3 ku3Var2 = (ku3) this.d;
                    hs4 hs4Var = z45.a;
                    av4Var = xw3.t(ku3Var2, hq4.c, new k50((Object) this, (Object) skkVar, (rq3) (z2 ? 1 : 0), z ? 1 : 0), 2);
                    this.g = av4Var;
                    if (H0 != null || !H0.isEmpty()) {
                        it = H0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!Intrinsics.c(((xkk) it.next()).a, "nimbus-injected")) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    this.a = z;
                    it2 = ((List) this.f).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        xkk xkkVar2 = (xkk) next;
                        klk klkVar2 = xkkVar2.e;
                        String str5 = xkkVar2.f;
                        String str6 = xkkVar2.g;
                        String str7 = klkVar2 != null ? klkVar2.a : null;
                        if (str7 == null || str7.length() == 0) {
                            rkkVar = (str6 == null || str6.length() == 0) ? (str5 == null || str5.length() == 0) ? null : new rkk(str5) : new qkk(str6);
                        } else {
                            klkVar2.getClass();
                            rkkVar = new skk(klkVar2.a, klkVar2.b);
                        }
                        if (rkkVar instanceof skk) {
                            obj2 = next;
                            break;
                        }
                    }
                    this.i = (xkk) obj2;
                }
            }
        }
        av4Var = null;
        this.g = av4Var;
        if (H0 != null) {
        }
        it = H0.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        this.a = z;
        it2 = ((List) this.f).iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        this.i = (xkk) obj2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public Object a(rq3 rq3Var) {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var == null) {
            return Unit.a;
        }
        if (ug6Var.o() == 3) {
            return Unit.a;
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        int i = 0;
        b bVar = new b(ug6Var, lj2Var, i);
        ug6Var.l.e(bVar);
        if (ug6Var.o() == 3) {
            ug6Var.A(bVar);
            if (lj2Var.r() instanceof oed) {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(Unit.a);
            }
        }
        lj2Var.v(new a(ug6Var, bVar, i));
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean r21, android.content.Context r22, com.google.android.gms.internal.ads.zzdec r23) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u53.b(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdec):void");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public View c() {
        return (TextureView) this.b;
    }

    public void d(lcd lcdVar, pkk pkkVar) {
        String str = ((xkk) CollectionsKt.Y((List) this.f)).c;
        Intent intent = new Intent("android.intent.action.VIEW", str != null ? Uri.parse(str) : null);
        intent.addFlags(268435456);
        if (intent.resolveActivity(lcdVar.getContext().getPackageManager()) == null) {
            intent = null;
        }
        if (intent != null) {
            lcdVar.getContext().startActivity(intent);
            pkkVar.q();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var != null) {
            ug6Var.A((c) this.i);
            ug6Var.z();
        }
        this.d = null;
    }

    public void e(lcd lcdVar, pkk pkkVar) {
        View inflate = LayoutInflater.from(lcdVar.getContext()).inflate(R.layout.nimbus_endcard, (ViewGroup) lcdVar, false);
        inflate.findViewById(R.id.nimbus_learn_more).setOnClickListener(new q53(this, lcdVar, pkkVar, 0));
        lcdVar.addView(inflate, 1, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public ddi f() {
        return (fdi) this.h;
    }

    public void g(Runnable runnable) {
        ((Handler) ((zzgvc) this.b).mo792zza()).post(new nkn(this, runnable, false, 26));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public ddi isPlaying() {
        return (fdi) this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public ddi p() {
        return (fdi) this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public void pause() {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var != null) {
            ug6Var.J(false);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public void play() {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var != null) {
            ug6Var.J(true);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public void seekTo(long j) {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var != null) {
            int g = ug6Var.g();
            ug6Var.T();
            ug6Var.C(j, g, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public void a(String str) {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var == null || str == null) {
            return;
        }
        try {
            if (this.a) {
                a51 a = new gr4(new m(1, str, this)).a(f6c.a(str));
                ug6Var.T();
                List singletonList = Collections.singletonList(a);
                ug6Var.T();
                ug6Var.H(singletonList);
            } else {
                ug6Var.G(f6c.a(str));
            }
            ug6Var.y();
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BlurBackgroundVideoPlayer", "Failed to set background media item", e, false, 8, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public void b(boolean z) {
        ug6 ug6Var = (ug6) this.d;
        if (ug6Var != null) {
            ug6Var.O(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    public u53(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, lyn lynVar) {
        int i = zzcf.c;
        this.i = com.google.android.gms.internal.play_billing.b.j;
        this.b = context;
        this.c = purchasesUpdatedListener;
        this.d = userChoiceBillingListener;
        this.e = developerProvidedBillingListener;
        this.f = lynVar;
        this.g = new pko(this, true);
        this.h = new pko(this, false);
    }

    public u53(Context context, zzgtj zzgtjVar, Intent intent) {
        this.e = new ArrayList();
        this.c = context;
        this.d = zzgtjVar;
        this.f = intent;
        this.b = zzgvf.a(new pff((byte) 0, 18));
        this.g = new fnn(this, 1);
    }

    public u53(TextureView textureView, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, com.moloco.sdk.internal.publisher.nativead.parser.b bVar) {
        this.b = textureView;
        this.a = z;
        this.c = jVar;
        fdi a = gdi.a(new d(false, true, true));
        this.e = a;
        this.f = a;
        this.g = gdi.a(l.a);
        this.h = gdi.a(null);
        c cVar = new c(this);
        this.i = cVar;
        ug6 ug6Var = (ug6) bVar.invoke();
        ug6Var.N(textureView);
        ug6Var.O(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ug6Var.l.e(cVar);
        this.d = ug6Var;
    }

    public u53(VersionInfoParcel versionInfoParcel, zzcgo zzcgoVar, zzfld zzfldVar, zzclm zzclmVar, zzflw zzflwVar, boolean z, zzbqk zzbqkVar, zzelp zzelpVar, zzeaj zzeajVar) {
        this.b = versionInfoParcel;
        this.c = zzcgoVar;
        this.d = zzfldVar;
        this.e = zzclmVar;
        this.f = zzflwVar;
        this.a = z;
        this.g = zzbqkVar;
        this.h = zzelpVar;
        this.i = zzeajVar;
    }
}
