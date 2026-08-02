package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.c1;
import com.applovin.impl.r7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class b2 extends c2 {
    private final r7 o0;
    private final Set p0;

    class a implements c1.b {
        a() {
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b2.this.f0 - (b2.this.Q.getDuration() - b2.this.Q.getCurrentPosition()));
            int C = b2.this.C();
            HashSet hashSet = new HashSet();
            for (b8 b8Var : new HashSet(b2.this.p0)) {
                if (b8Var.a(seconds, C)) {
                    hashSet.add(b8Var);
                    b2.this.p0.remove(b8Var);
                }
            }
            b2.this.a(hashSet);
            if (C >= 25 && C < 50) {
                b2.this.o0.getAdEventTracker().x();
                return;
            }
            if (C >= 50 && C < 75) {
                b2.this.o0.getAdEventTracker().y();
            } else if (C >= 75) {
                b2.this.o0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !b2.this.i0;
        }
    }

    public b2(final com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.p0 = hashSet;
        r7 r7Var = (r7) bVar;
        this.o0 = r7Var;
        if (r7Var.r1()) {
            ImageView a2 = x7.a(r7Var.l1().e(), activity, lVar);
            this.X = a2;
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b2.this.a(bVar, lVar, activity, view);
                }
            });
        }
        r7.d dVar = r7.d.VIDEO;
        hashSet.addAll(r7Var.a(dVar, c8.a));
        a(r7.d.IMPRESSION);
        a(dVar, "creativeView");
        r7Var.getAdEventTracker().g();
    }

    private boolean U() {
        return this.X != null && this.o0.r1();
    }

    private void V() {
        if (!G() || this.p0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.p0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.p0);
    }

    @Override // com.applovin.impl.c2
    public void D() {
        a(r7.d.VIDEO, "skip");
        this.o0.getAdEventTracker().B();
        super.D();
    }

    @Override // com.applovin.impl.c2
    protected void E() {
        super.E();
        r7 r7Var = this.o0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.c2
    protected void N() {
        long R;
        int s;
        long j = 0;
        if (this.o0.Q() >= 0 || this.o0.R() >= 0) {
            if (this.o0.Q() >= 0) {
                R = this.o0.Q();
            } else {
                r7 r7Var = this.o0;
                e8 p1 = r7Var.p1();
                if (p1 == null || p1.d() <= 0) {
                    long j2 = this.f0;
                    if (j2 > 0) {
                        j = j2;
                    }
                } else {
                    j = TimeUnit.SECONDS.toMillis(p1.d());
                }
                if (r7Var.W0() && (s = (int) r7Var.s()) > 0) {
                    j += TimeUnit.SECONDS.toMillis(s);
                }
                R = (long) (j * (this.o0.R() / 100.0d));
            }
            c(R);
        }
    }

    @Override // com.applovin.impl.c2
    protected void Q() {
        super.Q();
        r7 r7Var = this.o0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.c2
    public void R() {
        V();
        if (!d8.a(this.o0)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.i0) {
                return;
            }
            a(r7.d.COMPANION, "creativeView");
            this.o0.getAdEventTracker().w();
            super.R();
        }
    }

    @Override // com.applovin.impl.c2
    public void T() {
        super.T();
        a(r7.d.VIDEO, this.e0 ? "mute" : "unmute");
        this.o0.getAdEventTracker().b(this.e0);
    }

    @Override // com.applovin.impl.c2
    protected void d(long j) {
        super.d(j);
        this.o0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j), q7.e(this.b));
    }

    @Override // com.applovin.impl.c2
    public void g(String str) {
        a(r7.d.ERROR, w7.MEDIA_FILE_ERROR);
        this.o0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.y1
    public void s() {
        super.s();
        a(this.i0 ? r7.d.COMPANION : r7.d.VIDEO, "pause");
        this.o0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.y1
    public void t() {
        super.t();
        a(this.i0 ? r7.d.COMPANION : r7.d.VIDEO, "resume");
        this.o0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void v() {
        this.b0.c();
        super.v();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, Activity activity, View view) {
        Uri c = this.o0.l1().c();
        if (c != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + c);
            }
            a(r7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                lVar.A().a(c, b().getController(), activity);
            } else {
                n7.b(c, bVar, activity, lVar);
            }
        }
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(String str) {
        if (this.o0 != null) {
            a(r7.d.VIDEO, "close");
            a(r7.d.COMPANION, "close");
        }
        super.a(str);
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (U()) {
            a(r7.d.INDUSTRY_ICON_IMPRESSION);
            this.X.setVisibility(0);
        }
        this.b0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            arrayList.add(new j4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.S;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        k0 k0Var = this.T;
        if (k0Var != null) {
            arrayList.add(new j4(k0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.V;
        if (progressBar != null) {
            arrayList.add(new j4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.U;
        if (imageView != null) {
            arrayList.add(new j4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.o0.getAdEventTracker().b(this.Q, arrayList);
    }

    @Override // com.applovin.impl.c2
    public void a(MotionEvent motionEvent) {
        a(r7.d.VIDEO_CLICK);
        this.o0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar) {
        a(dVar, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, String str) {
        a(dVar, str, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, w7 w7Var) {
        a(dVar, "", w7Var);
    }

    private void a(r7.d dVar, String str, w7 w7Var) {
        a(this.o0.a(dVar, str), w7Var);
    }

    private void a(Set set, w7 w7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.Q.getCurrentPosition());
        f8 q1 = this.o0.q1();
        Uri d = q1 != null ? q1.d() : null;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        d8.a(set, seconds, d, w7Var, this.b);
    }
}
