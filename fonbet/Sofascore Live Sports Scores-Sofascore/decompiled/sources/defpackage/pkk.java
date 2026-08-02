package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.media3.exoplayer.ExoPlayer;
import com.iab.omid.library.adsbynimbus.Omid;
import com.iab.omid.library.adsbynimbus.adsession.CreativeType;
import com.iab.omid.library.adsbynimbus.adsession.VerificationScriptResource;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.R;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pkk extends of {
    public final rlk f;
    public final olk g;
    public final boolean h;
    public boolean i;
    public final ImageView j;
    public final lcd k;
    public final ProgressBar l;
    public final ImageButton m;
    public final mqi n;
    public final u53 o;
    public boolean p;
    public final gh0 q;

    public pkk(hcd hcdVar, lcd lcdVar, rlk rlkVar, olk olkVar, boolean z) {
        ad2 k = s9a.k();
        hcdVar.getClass();
        this.f = rlkVar;
        this.g = olkVar;
        this.h = z;
        ImageView imageView = (ImageView) lcdVar.findViewById(R.id.nimbus_logo);
        final int i = 0;
        final int i2 = 1;
        if (imageView == null) {
            imageView = new ImageView(lcdVar.getContext());
            imageView.setImageResource(R.drawable.ic_nimbus_logo);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(lcdVar.a(16), 0, 0, lcdVar.a(8));
            imageView.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lcdVar.a(54), lcdVar.a(16), 8388691);
            layoutParams.setMarginStart(lcdVar.a(32));
            layoutParams.bottomMargin = lcdVar.a(20);
            Unit unit = Unit.a;
            lcdVar.addView(imageView, layoutParams);
        }
        this.j = imageView;
        this.k = lcdVar;
        rlkVar.f.add(this);
        rlkVar.b.setOnClickListener(new View.OnClickListener(this) { // from class: okk
            public final /* synthetic */ pkk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:43:0x007d A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:8:0x0025, B:10:0x002b, B:12:0x002f, B:14:0x0033, B:15:0x003e, B:17:0x0044, B:20:0x0051, B:23:0x0058, B:31:0x005e, B:32:0x0062, B:34:0x0069, B:36:0x0073, B:38:0x0077, B:43:0x007d, B:44:0x0099, B:51:0x005c), top: B:7:0x0025 }] */
            /* JADX WARN: Type inference failed for: r3v0, types: [km5] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                ?? r3;
                String str;
                nlk nlkVar;
                flk flkVar;
                alk alkVar;
                int i3 = i;
                pkk pkkVar = this.b;
                switch (i3) {
                    case 0:
                        olk olkVar2 = pkkVar.g;
                        try {
                            p2g p2gVar = w2g.b;
                            tkk tkkVar = olkVar2.b;
                            if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
                                r3 = km5.a;
                            } else {
                                ArrayList arrayList = alkVar.a;
                                r3 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    List a = ((zkk) next).a();
                                    if (a != null && !a.isEmpty()) {
                                        r3.add(next);
                                    }
                                }
                            }
                            Iterator it2 = r3.iterator();
                            do {
                                str = null;
                                if (it2.hasNext()) {
                                    hlk hlkVar = ((zkk) it2.next()).a;
                                    if (hlkVar != null && (nlkVar = hlkVar.c) != null) {
                                        str = nlkVar.a;
                                    }
                                }
                                if (str != null) {
                                    Context context = pkkVar.k.getContext();
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                                    intent.setFlags(268435456);
                                    context.startActivity(intent);
                                    g7a.u(olkVar2, pkkVar.o());
                                }
                                pkkVar.b(zf.c);
                                Unit unit2 = Unit.a;
                                break;
                            } while (str == null);
                            if (str != null) {
                            }
                            pkkVar.b(zf.c);
                            Unit unit22 = Unit.a;
                        } catch (Throwable unused) {
                            p2g p2gVar2 = w2g.b;
                            return;
                        }
                        break;
                    default:
                        Context context2 = pkkVar.k.getContext();
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.adsbynimbus.com/privacy-policy"));
                        intent2.setFlags(268435456);
                        context2.startActivity(intent2);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: okk
            public final /* synthetic */ pkk b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:43:0x007d A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:8:0x0025, B:10:0x002b, B:12:0x002f, B:14:0x0033, B:15:0x003e, B:17:0x0044, B:20:0x0051, B:23:0x0058, B:31:0x005e, B:32:0x0062, B:34:0x0069, B:36:0x0073, B:38:0x0077, B:43:0x007d, B:44:0x0099, B:51:0x005c), top: B:7:0x0025 }] */
            /* JADX WARN: Type inference failed for: r3v0, types: [km5] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                ?? r3;
                String str;
                nlk nlkVar;
                flk flkVar;
                alk alkVar;
                int i3 = i2;
                pkk pkkVar = this.b;
                switch (i3) {
                    case 0:
                        olk olkVar2 = pkkVar.g;
                        try {
                            p2g p2gVar = w2g.b;
                            tkk tkkVar = olkVar2.b;
                            if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
                                r3 = km5.a;
                            } else {
                                ArrayList arrayList = alkVar.a;
                                r3 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    List a = ((zkk) next).a();
                                    if (a != null && !a.isEmpty()) {
                                        r3.add(next);
                                    }
                                }
                            }
                            Iterator it2 = r3.iterator();
                            do {
                                str = null;
                                if (it2.hasNext()) {
                                    hlk hlkVar = ((zkk) it2.next()).a;
                                    if (hlkVar != null && (nlkVar = hlkVar.c) != null) {
                                        str = nlkVar.a;
                                    }
                                }
                                if (str != null) {
                                    Context context = pkkVar.k.getContext();
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                                    intent.setFlags(268435456);
                                    context.startActivity(intent);
                                    g7a.u(olkVar2, pkkVar.o());
                                }
                                pkkVar.b(zf.c);
                                Unit unit22 = Unit.a;
                                break;
                            } while (str == null);
                            if (str != null) {
                            }
                            pkkVar.b(zf.c);
                            Unit unit222 = Unit.a;
                        } catch (Throwable unused) {
                            p2g p2gVar2 = w2g.b;
                            return;
                        }
                        break;
                    default:
                        Context context2 = pkkVar.k.getContext();
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.adsbynimbus.com/privacy-policy"));
                        intent2.setFlags(268435456);
                        context2.startActivity(intent2);
                        break;
                }
            }
        });
        ProgressBar progressBar = (ProgressBar) lcdVar.findViewById(R.id.nimbus_progress);
        if (progressBar == null) {
            progressBar = new ProgressBar(lcdVar.getContext(), null, android.R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setIndeterminate(false);
            progressBar.setVisibility(8);
            progressBar.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#039C9E")));
            lcdVar.addView(progressBar, new FrameLayout.LayoutParams(-1, lcdVar.a(3), 80));
        }
        this.l = progressBar;
        ImageButton muteButton = lcdVar.getMuteButton();
        ViewGroup.LayoutParams layoutParams2 = muteButton.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.gravity = 8388659;
        }
        muteButton.setLayoutParams(layoutParams2);
        this.m = muteButton;
        this.n = ypa.b(ptj.q);
        this.o = new u53(hcdVar, olkVar, k);
        this.q = new gh0(0);
    }

    @Override // defpackage.of
    public final void a() {
        if (this.a != 5) {
            if (!this.p && this.h) {
                Map o = o();
                olk olkVar = this.g;
                g7a.v(olkVar, 8, o);
                g7a.v(olkVar, 9, o());
            }
            b(zf.j);
            this.f.f.remove(this);
            u53 u53Var = this.o;
            of ofVar = (of) u53Var.h;
            if (ofVar != null) {
                ofVar.a();
            }
            u53Var.h = null;
            lcd lcdVar = this.k;
            lcdVar.removeAllViews();
            ViewParent parent = lcdVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = lcdVar.e == null ? viewGroup : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(lcdVar);
                }
            }
        }
    }

    @Override // defpackage.of
    public final float e() {
        return this.f.r;
    }

    @Override // defpackage.of
    public final View f() {
        return this.k;
    }

    @Override // defpackage.of
    public final int g() {
        return this.f.t;
    }

    @Override // defpackage.of
    public final void i(int i, Rect rect) {
        rect.getClass();
        boolean z = this.b && i > 25 && !this.i;
        rlk rlkVar = this.f;
        rlkVar.n = z;
        ExoPlayer exoPlayer = rlkVar.k;
        if (exoPlayer == null) {
            return;
        }
        ((vg6) exoPlayer).setPlayWhenReady(z);
    }

    @Override // defpackage.of
    public final void j(boolean z) {
        if (z) {
            t();
            return;
        }
        rlk rlkVar = this.f;
        ExoPlayer exoPlayer = rlkVar.k;
        if (exoPlayer != null) {
            vg6 vg6Var = (vg6) exoPlayer;
            vg6Var.setPlayWhenReady(false);
            vg6Var.z(rlkVar);
            rlkVar.k = null;
            rlkVar.c.getClass();
            if (l98.m0(plk.d, exoPlayer) instanceof fo2) {
                vg6Var.release();
            }
        }
    }

    @Override // defpackage.of
    public final void k(int i) {
        rlk rlkVar = this.f;
        int i2 = rlkVar.t;
        if (i == i2) {
            return;
        }
        int c = llf.c(i, 0, 100);
        rlkVar.t = c;
        ExoPlayer exoPlayer = rlkVar.k;
        if (exoPlayer != null) {
            ((vg6) exoPlayer).setVolume(c * 0.01f);
        }
        this.m.setImageLevel(i);
        olk olkVar = this.g;
        if (i2 > 0 && i == 0) {
            g7a.v(olkVar, 10, o());
        } else if (i2 == 0 && i > 0) {
            g7a.v(olkVar, 11, o());
        }
        b(zf.k);
    }

    @Override // defpackage.of
    public final void l() {
        if (this.b || this.a == 5) {
            return;
        }
        this.b = true;
        lcd lcdVar = this.k;
        i(lcdVar.getExposure(), lcdVar.getVisibleRect());
    }

    @Override // defpackage.of
    public final void m() {
        int i;
        Object obj;
        if (!this.b || (i = this.a) == 5) {
            return;
        }
        this.b = false;
        if (i != 3 || (obj = this.f.k) == null) {
            return;
        }
        ((g51) obj).setPlayWhenReady(false);
    }

    public final void n(zf zfVar) {
        gh0 gh0Var = this.q;
        if (gh0Var.contains(zfVar)) {
            return;
        }
        gh0Var.add(zfVar);
        int ordinal = zfVar.ordinal();
        olk olkVar = this.g;
        if (ordinal == 1) {
            g7a.v(olkVar, 2, o());
        } else if (ordinal == 5) {
            g7a.v(olkVar, 3, o());
        } else if (ordinal == 6) {
            g7a.v(olkVar, 4, o());
        } else if (ordinal == 7) {
            g7a.v(olkVar, 5, o());
        } else if (ordinal == 8) {
            g7a.v(olkVar, 6, o());
            this.p = true;
        }
        b(zfVar);
    }

    public final Map o() {
        Pair pair = new Pair(znb.transactionId, (String) this.n.getValue());
        rlk rlkVar = this.f;
        ExoPlayer exoPlayer = rlkVar.k;
        long currentPosition = exoPlayer != null ? ((vg6) exoPlayer).getCurrentPosition() : 0L;
        long j = currentPosition / 1000;
        Pair pair2 = new Pair(znb.adPlayhead, String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j / 3600), Long.valueOf((j / 60) % 60), Long.valueOf(j % 60), Long.valueOf(currentPosition % 1000)}, 4)));
        String str = rlkVar.u;
        if (str == null) {
            str = "";
        }
        return tub.h(pair, pair2, new Pair(znb.assetURI, str));
    }

    public final void p() {
        Unit unit;
        rlk rlkVar = this.f;
        rlkVar.getClass();
        this.g.getClass();
        ilk ilkVar = (ilk) CollectionsKt.firstOrNull((List) rlkVar.i.getValue());
        rq3 rq3Var = null;
        if (ilkVar != null) {
            String str = ilkVar.a;
            cjb.a("loading vast " + str);
            rlkVar.u = str;
            rlkVar.m = true;
            ad2 ad2Var = rlkVar.h;
            hs4 hs4Var = z45.a;
            rlkVar.o = xw3.L(ad2Var, hq4.c, null, new ccj(rlkVar, str, rq3Var, 2), 2);
            rlkVar.b.addOnLayoutChangeListener(new r8(rlkVar, 12));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            cjb.a("trying to play video with no valid url");
            for (pkk pkkVar : rlkVar.f) {
                pkkVar.getClass();
                if (pkkVar.a != 5) {
                    pkkVar.c(new qcd(5, "Error during video playback", null));
                }
            }
        }
        if (this.k.b) {
            t();
        }
    }

    public final void q() {
        List list;
        flk flkVar;
        alk alkVar;
        tkk tkkVar = this.g.b;
        if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
            list = km5.a;
        } else {
            ArrayList arrayList = alkVar.a;
            list = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ykk ykkVar = ((zkk) it.next()).b;
                o13.v(ykkVar != null ? ykkVar.a : km5.a, list);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            o13.v(((xkk) it2.next()).d, arrayList2);
        }
        g7a.w(o(), arrayList2, "Companion click");
        b(zf.c);
    }

    public final void r(qcd qcdVar) {
        if (this.a == 5) {
            return;
        }
        c(qcdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(olk olkVar) {
        wkk wkkVar;
        flk flkVar;
        dlk dlkVar;
        Object obj;
        String str;
        Object u2gVar;
        VerificationScriptResource verificationScriptResource;
        Object valueOf;
        Object u2gVar2;
        flk flkVar2;
        olkVar.getClass();
        olk olkVar2 = this.g;
        tkk tkkVar = olkVar2.b;
        if (tkkVar == null || (flkVar2 = tkkVar.a) == null || (wkkVar = flkVar2.e) == null) {
            if (tkkVar != null && (flkVar = tkkVar.a) != null && (dlkVar = flkVar.g) != null) {
                Iterator it = dlkVar.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.c(((clk) obj).a, "AdVerifications")) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                clk clkVar = (clk) obj;
                if (clkVar != null) {
                    wkkVar = clkVar.b;
                }
            }
            wkkVar = null;
        }
        Collection<vkk> collection = wkkVar != null ? wkkVar.a : km5.a;
        if (!collection.isEmpty()) {
            for (vkk vkkVar : collection) {
                ArrayList arrayList = vkkVar.a;
                boolean isEmpty = arrayList.isEmpty();
                znb znbVar = znb.reason;
                if (!isEmpty) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(((glk) it2.next()).a, CampaignEx.KEY_OMID)) {
                            ArrayList arrayList2 = vkkVar.a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (Intrinsics.c(((glk) next).a, CampaignEx.KEY_OMID)) {
                                    arrayList3.add(next);
                                }
                            }
                            Iterator it4 = arrayList3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    str = ((glk) it4.next()).c;
                                    if (str != null) {
                                        break;
                                    }
                                } else {
                                    str = null;
                                    break;
                                }
                            }
                            String str2 = vkkVar.d;
                            String str3 = vkkVar.c;
                            try {
                                p2g p2gVar = w2g.b;
                            } catch (Throwable th) {
                                p2g p2gVar2 = w2g.b;
                                u2gVar = new u2g(th);
                            }
                            if (str != null && str.length() != 0) {
                                if (str3 != null && str3.length() != 0 && str2 != null && str2.length() != 0) {
                                    u2gVar = VerificationScriptResource.createVerificationScriptResourceWithParameters(str3, new URL(str), str2);
                                    if (u2gVar instanceof u2g) {
                                        u2gVar = null;
                                    }
                                    verificationScriptResource = (VerificationScriptResource) u2gVar;
                                    if (verificationScriptResource != null) {
                                        njd njdVar = this.c;
                                        if (njdVar == null) {
                                            mqi mqiVar = njd.i;
                                            if (!Omid.isActive()) {
                                                String str4 = gcd.a;
                                                Omid.activate(oie.a());
                                                Unit unit = Unit.a;
                                                if (!Omid.isActive()) {
                                                    cjb.a("OMSession was not initialized");
                                                    valueOf = Unit.a;
                                                }
                                            }
                                            try {
                                                CopyOnWriteArraySet copyOnWriteArraySet = this.d;
                                                njd njdVar2 = new njd(CreativeType.VIDEO, b.l(verificationScriptResource), this);
                                                this.c = njdVar2;
                                                u2gVar2 = Boolean.valueOf(copyOnWriteArraySet.add(njdVar2));
                                            } catch (Throwable th2) {
                                                p2g p2gVar3 = w2g.b;
                                                u2gVar2 = new u2g(th2);
                                            }
                                            Throwable a = w2g.a(u2gVar2);
                                            if (a != null) {
                                                cjb.a("error initializing OM session: " + a.getMessage());
                                            }
                                            valueOf = new w2g(u2gVar2);
                                        } else {
                                            valueOf = Boolean.valueOf(njdVar.a.add(verificationScriptResource));
                                        }
                                        if (valueOf == null) {
                                        }
                                    }
                                    q5a.D(vkkVar, tub.l(o(), new Pair(znbVar, "3")));
                                }
                                u2gVar = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(str));
                                if (u2gVar instanceof u2g) {
                                }
                                verificationScriptResource = (VerificationScriptResource) u2gVar;
                                if (verificationScriptResource != null) {
                                }
                                q5a.D(vkkVar, tub.l(o(), new Pair(znbVar, "3")));
                            }
                            u2gVar = null;
                            if (u2gVar instanceof u2g) {
                            }
                            verificationScriptResource = (VerificationScriptResource) u2gVar;
                            if (verificationScriptResource != null) {
                            }
                            q5a.D(vkkVar, tub.l(o(), new Pair(znbVar, "3")));
                        }
                    }
                }
                q5a.D(vkkVar, tub.l(o(), new Pair(znbVar, "2")));
            }
        }
        g7a.v(olkVar2, 1, o());
        b(zf.a);
        lcd lcdVar = this.k;
        i(lcdVar.getExposure(), lcdVar.getVisibleRect());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        g9i g9iVar;
        rlk rlkVar = this.f;
        TextureView textureView = rlkVar.b;
        mqi mqiVar = rlkVar.j;
        this.g.getClass();
        if (rlkVar.m && (g9iVar = rlkVar.o) != null) {
            g9iVar.e(null);
        }
        textureView.setVisibility(0);
        plk plkVar = rlkVar.c;
        Context context = textureView.getContext();
        context.getClass();
        plkVar.getClass();
        Object o = plk.d.o();
        if (o instanceof fo2) {
            o = (ExoPlayer) plk.e.invoke(context, (hr4) plk.c.getValue());
        }
        ExoPlayer exoPlayer = (ExoPlayer) o;
        ((vg6) exoPlayer).m.a(rlkVar);
        vg6 vg6Var = (vg6) exoPlayer;
        vg6Var.setVolume(rlkVar.t * 0.01f);
        g51 g51Var = (g51) exoPlayer;
        if (!Intrinsics.c(g51Var.e(), (h6c) mqiVar.getValue())) {
            vg6Var.setVideoTextureView(textureView);
            g51Var.l((h6c) mqiVar.getValue());
            vg6Var.setRepeatMode(0);
            long j = rlkVar.s;
            if (j > 0) {
                g51Var.M(5, j);
            }
            vg6Var.setPlayWhenReady(rlkVar.n);
            vg6Var.a();
        }
        rlkVar.k = exoPlayer;
    }
}
