package com.vk.attachpicker.screen;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.MediaPickerFragmentImpl;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.m;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.ClippingView;
import com.vk.attachpicker.widget.VkViewPager;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.aa6;
import xsna.b31;
import xsna.bd70;
import xsna.c6a0;
import xsna.cvk;
import xsna.dhr0;
import xsna.dm10;
import xsna.e43;
import xsna.ikv0;
import xsna.j0;
import xsna.j34;
import xsna.j3u0;
import xsna.js2;
import xsna.k3u0;
import xsna.k7;
import xsna.l5a0;
import xsna.mic;
import xsna.o4t;
import xsna.ou5;
import xsna.p870;
import xsna.pis0;
import xsna.pro0;
import xsna.pxo0;
import xsna.q3u0;
import xsna.r3u0;
import xsna.tvs0;
import xsna.ue9;
import xsna.uko;
import xsna.v16;
import xsna.w16;
import xsna.x16;
import xsna.y3i;
import xsna.yn3;
import xsna.zmw;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class p extends com.vk.attachpicker.screen.a implements j34 {

    @Nullable
    public final String A;

    @Nullable
    public final Integer B;
    public final int C;
    public final ArrayList<MediaStoreEntry> D;
    public final int E;
    public final c F;

    @Nullable
    public final com.vk.attachpicker.b G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final long M;
    public final long N;
    public final long O;
    public boolean P;
    public int Q;
    public int R;
    public final t S;

    @Nullable
    public j34 T;

    @Nullable
    public j34 U;
    public final k3u0 V;
    public ArrayList W;
    public aa6 X;
    public GalleryFragmentImpl.g Y;
    public d Z;
    public boolean a0;
    public boolean b0;
    public y3i c0;
    public boolean d0;
    public SpoilerConfiguration e0;
    public final c6a0 f0;
    public final boolean g0;

    @Nullable
    public io.reactivex.rxjava3.disposables.c h0;
    public final pxo0 y;
    public final com.vk.core.simplescreen.a z;

    /* compiled from: ViewerScreen.java */
    public interface c extends a.b {
        void zc(int i, int i2);
    }

    /* compiled from: ViewerScreen.java */
    public interface d {
    }

    /* compiled from: ViewerScreen.java */
    public interface e {
        void a(View view);
    }

    public p(ArrayList arrayList, int i, @Nullable com.vk.attachpicker.c cVar, c cVar2, boolean z, com.vk.core.simplescreen.a aVar, @Nullable j34 j34Var) {
        this(arrayList, i, cVar, cVar2, true, false, z, 0L, 0L, 0L, false, false, arrayList.size(), true, aVar, null, null, false, null, j34Var, null);
    }

    public static void N(ViewGroup viewGroup, e eVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            eVar.a(childAt);
            if (childAt instanceof ViewGroup) {
                N((ViewGroup) childAt, eVar);
            }
        }
    }

    @Override // com.vk.attachpicker.screen.a
    public final boolean A(MotionEvent motionEvent) {
        if (this.i == null) {
            return false;
        }
        return super.A(motionEvent);
    }

    @Override // com.vk.attachpicker.screen.a
    public final void E() {
        r rVar = new r(this, this.D);
        t tVar = this.S;
        tVar.D(rVar);
        tVar.L(this.C);
        this.n.post(new ou5(this, 16));
    }

    @Override // com.vk.attachpicker.screen.a
    public final void F() {
        this.R = -1;
    }

    @Override // com.vk.attachpicker.screen.a
    public final void H(int i) {
        super.H(i);
        this.S.setAlpha(i);
    }

    @Override // com.vk.attachpicker.screen.a
    public final void J(MediaStoreEntry mediaStoreEntry) {
        com.vk.attachpicker.b bVar = this.G;
        bVar.c(mediaStoreEntry);
        this.S.V(bVar.q(mediaStoreEntry));
        T(mediaStoreEntry);
    }

    public final void K() {
        if (this.s.get()) {
            return;
        }
        int i = this.C;
        P(i, false);
        t tVar = this.S;
        c cVar = this.F;
        if (cVar != null) {
            try {
                if (cVar.k9(i) != null) {
                    a.c k9 = cVar.k9(i);
                    if (k9.e > 0 && k9.f > 0) {
                        a.c k92 = cVar.k9(i);
                        this.i = cVar;
                        tVar.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        MediaStoreEntry mediaStoreEntry = k92.d;
                        MediaStoreEntry s = this.G.s(mediaStoreEntry);
                        if (s != null) {
                            mediaStoreEntry = s;
                        }
                        k92.d = mediaStoreEntry;
                        tVar.s(k92, k92.a);
                        B(tVar.P(), k92, false);
                        return;
                    }
                }
            } catch (Exception e2) {
                L.g("ImageViewer", e2);
                r();
                this.t.set(false);
                I(false);
                return;
            }
        }
        this.i = null;
        C();
        tVar.x(1.0f);
    }

    public final MediaStoreEntry L() {
        return this.D.get(this.S.T());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(MediaStoreEntry mediaStoreEntry, MediaUtils.f fVar) {
        long j = fVar == null ? 0L : fVar.f;
        boolean z = mediaStoreEntry instanceof MediaStoreVideoEntry;
        if (z) {
            long j2 = this.M;
            if (j2 > 0 && j > j2) {
                R(new ue9(5, this, mediaStoreEntry));
                return;
            }
        }
        if (z) {
            long j3 = this.N;
            if (j3 > 0 && j < j3) {
                cvk.w(d().getResources().getString(R.string.picker_trim_video_min_length_multi_seconds, Float.valueOf(j3 / 1000.0f)), false);
                return;
            }
        }
        c cVar = this.F;
        t tVar = this.S;
        if (z) {
            com.vk.attachpicker.b bVar = this.G;
            if (bVar == null || bVar.o(tVar.T(), mediaStoreEntry)) {
                l5a0 l5a0Var = l5a0.a;
                l5a0.b.put(((MediaStoreVideoEntry) mediaStoreEntry).k, new l5a0.b(true, true, tVar.T()));
                if (cVar != null) {
                    cVar.N7(mediaStoreEntry);
                }
                V2(b.a.b(mediaStoreEntry));
                return;
            }
            return;
        }
        q3u0 q3u0Var = q3u0.b.a;
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q3u0Var = ((r3u0) it.next()).a(mediaStoreEntry);
                if (q3u0Var instanceof q3u0.a) {
                    break;
                }
            }
        }
        if (q3u0Var instanceof q3u0.b) {
            l5a0 l5a0Var2 = l5a0.a;
            l5a0.b.put(mediaStoreEntry.f(), new l5a0.b(true, true, tVar.T()));
            if (cVar != null) {
                cVar.N7(mediaStoreEntry);
            }
            V2(b.a.b(mediaStoreEntry));
            return;
        }
        if (q3u0Var instanceof q3u0.a) {
            aa6 aa6Var = this.X;
            int i = ((q3u0.a) q3u0Var).a;
            o4t o4tVar = (o4t) aa6Var.c;
            Window window = o4tVar.d().getWindow();
            if (window != null) {
                Context context = o4tVar.d().getContext();
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(context.getString(i), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
                aVar.p(window);
            }
        }
    }

    public final boolean O() {
        return (this.H || this.K || !this.g0) ? false : true;
    }

    public final void P(int i, boolean z) {
        GalleryFragmentImpl.g gVar;
        ArrayList<MediaStoreEntry> arrayList = this.D;
        int i2 = i + 1;
        if (arrayList.size() == i2 && (gVar = this.Y) != null) {
            gVar.a.n(false);
        }
        c cVar = this.i;
        if (cVar != null) {
            cVar.zc(this.R, i);
        }
        String string = this.k.getString(R.string.picker_d_of_d, Integer.valueOf(i2), Integer.valueOf(this.E));
        t tVar = this.S;
        tVar.U(string);
        MediaStoreEntry mediaStoreEntry = arrayList.get(i);
        com.vk.attachpicker.b bVar = this.G;
        tVar.V(bVar.q(mediaStoreEntry));
        boolean z2 = mediaStoreEntry instanceof MediaStoreVideoEntry;
        tVar.v(z2);
        if (this.I) {
            tVar.Z(false, z);
        } else {
            tVar.Z(bVar.k() == 0 || (O() && !z2 && (bVar.b().size() < bVar.v() || bVar.q(mediaStoreEntry))) || this.J, z);
        }
        tVar.K(i);
        this.R = i;
    }

    public final void Q(MediaStoreEntry mediaStoreEntry) {
        c cVar = this.F;
        if (cVar != null) {
            cVar.Bi(this, mediaStoreEntry);
        } else {
            S(mediaStoreEntry);
        }
    }

    public final void R(Runnable runnable) {
        this.j.a(d());
        I(true);
        if (x() != null) {
            x().m.i(1.0f);
        }
        this.S.Q(new js2(6, this, runnable));
    }

    public final void S(MediaStoreEntry mediaStoreEntry) {
        com.vk.attachpicker.b bVar = this.G;
        if (bVar.b().size() < bVar.v()) {
            t tVar = this.S;
            bVar.f(tVar.T(), null, mediaStoreEntry);
            tVar.V(bVar.q(mediaStoreEntry));
            T(mediaStoreEntry);
            return;
        }
        int v = bVar.v();
        int i = v == 1 ? R.string.picker_attachments_limit_one : R.string.picker_attachments_limit;
        if (bVar.q(mediaStoreEntry)) {
            return;
        }
        cvk.w(d().getString(i, Integer.valueOf(v)), false);
    }

    public final void T(MediaStoreEntry mediaStoreEntry) {
        zmw x = x();
        MediaStoreEntry s = this.G.s(mediaStoreEntry);
        if (s != null) {
            mediaStoreEntry = s;
        }
        if (x != null && mediaStoreEntry != x.getEntry()) {
            x.T0(mediaStoreEntry);
        }
        ClippingView clippingView = this.m;
        if (clippingView == null || clippingView.getEntry() == mediaStoreEntry) {
            return;
        }
        clippingView.W0(mediaStoreEntry);
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        if (this.T != null && !this.a0) {
            boolean O = O();
            com.vk.core.simplescreen.a aVar = this.z;
            boolean z = true;
            if (O) {
                if (this.b0) {
                    if (BuildInfo.t() || BuildInfo.s()) {
                        Context context = e43.a;
                        z = Preference.g(context != null ? context : null).getBoolean("saveProcessedImage", true);
                    }
                    if (this.d0 || z) {
                        int i = GalleryFragmentImpl.R0;
                        GalleryFragmentImpl.b.a(d(), intent, new tvs0(this, 4));
                    }
                    aVar.a();
                    m();
                    this.b0 = false;
                } else {
                    this.T.V2(intent);
                }
            } else if (this.d0) {
                if (BuildInfo.t() || BuildInfo.s()) {
                    Context context2 = e43.a;
                    z = Preference.g(context2 != null ? context2 : null).getBoolean("saveProcessedImage", true);
                }
                if (this.b0 && z) {
                    int i2 = GalleryFragmentImpl.R0;
                    GalleryFragmentImpl.b.a(d(), intent, new pis0(this, 10));
                    aVar.a();
                    m();
                    this.b0 = false;
                } else {
                    this.T.V2(intent);
                }
            } else {
                this.T.V2(intent);
            }
        }
        d dVar = this.Z;
        if (dVar != null) {
            MediaPickerFragmentImpl mediaPickerFragmentImpl = (MediaPickerFragmentImpl) ((k7) dVar).c;
            mediaPickerFragmentImpl.T0.b(intent);
            mediaPickerFragmentImpl.oo();
            if (this.a0) {
                c();
            }
        }
    }

    @Override // xsna.em6
    public final View b(LayoutInflater layoutInflater) {
        Activity activity = this.k;
        t tVar = this.S;
        this.Q = tVar.z(activity);
        boolean z = true;
        p870.f().b(1, this.V);
        tVar.A(this.k).inflate(tVar.p(), this.l);
        this.m = (ClippingView) this.l.findViewById(R.id.cv_animating_view);
        a.C0386a c0386a = this.l;
        d();
        tVar.F(c0386a);
        tVar.G(this.C);
        com.vk.attachpicker.b bVar = this.G;
        if (bVar != null) {
            tVar.R(bVar.k());
        }
        String str = this.A;
        if (str != null) {
            tVar.W(str);
        }
        Integer num = this.B;
        if (num != null) {
            tVar.O(num.intValue());
        }
        tVar.X(this.z);
        tVar.y(new v16(this, 11));
        if (bVar != null) {
            if (this.K) {
                tVar.a0(null);
            } else {
                tVar.a0(new w16(this, 14));
            }
            boolean z2 = L() instanceof MediaStoreVideoEntry;
            if (bVar.k() != 0 && ((!O() || z2) && !this.J)) {
                z = false;
            }
            tVar.Z(z, false);
        } else {
            tVar.C();
            tVar.a0(null);
        }
        tVar.t(new a());
        if (this.I) {
            tVar.C();
        } else {
            tVar.S(new yn3(this, 18));
        }
        tVar.I(new x16(this, 20));
        return this.l;
    }

    @Override // xsna.em6
    public final void h() {
        io.reactivex.rxjava3.disposables.c cVar = this.h0;
        if (cVar != null && !cVar.h()) {
            this.h0.dispose();
        }
        this.c = true;
        p870.f().g(this.V);
    }

    @Override // xsna.em6
    public final void j() {
        this.d = true;
        int i = this.R;
        if (i >= 0) {
            ArrayList<MediaStoreEntry> arrayList = this.D;
            if (i >= arrayList.size() || com.vk.core.files.a.y(arrayList.get(this.R).f().toString())) {
                return;
            }
            q();
        }
    }

    @Override // xsna.em6
    public final void k(int i) {
        this.S.J(i);
    }

    @Override // com.vk.attachpicker.screen.a
    public final void m() {
        if (this.k == null || this.s.get()) {
            return;
        }
        try {
            c cVar = this.i;
            t tVar = this.S;
            if (cVar == null) {
                n();
                tVar.D(null);
                this.R = -1;
                return;
            }
            a.c k9 = cVar.k9(this.R);
            MediaStoreEntry mediaStoreEntry = k9.d;
            MediaStoreEntry s = this.G.s(mediaStoreEntry);
            if (s != null) {
                mediaStoreEntry = s;
            }
            k9.d = mediaStoreEntry;
            tVar.s(k9, k9.a);
            D(k9);
            tVar.D(null);
        } catch (Exception e2) {
            L.g("ImageViewer", e2);
            n();
        }
    }

    @Override // com.vk.attachpicker.screen.a
    public final void p() {
        AnimatorSet animatorSet = new AnimatorSet();
        ColorDrawable colorDrawable = this.h;
        if (colorDrawable == null) {
            colorDrawable = null;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(colorDrawable.getAlpha(), 255);
        int i = 2;
        ofInt.addUpdateListener(new b31(this, i));
        t tVar = this.S;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tVar.P(), (Property<VkViewPager, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tVar.P(), (Property<VkViewPager, Float>) View.SCALE_Y, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tVar.P(), (Property<VkViewPager, Float>) View.SCALE_X, 1.0f);
        ColorDrawable colorDrawable2 = this.g;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt, ObjectAnimator.ofInt(colorDrawable2 != null ? colorDrawable2 : null, uko.a, (colorDrawable2 != null ? colorDrawable2 : null).getAlpha(), 255));
        animatorSet.setDuration(250L);
        animatorSet.addListener(new mic(this, i));
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.a
    public final View s() {
        return this.S.P();
    }

    @Override // com.vk.attachpicker.screen.a
    public final float t() {
        return this.Q;
    }

    @Override // com.vk.attachpicker.screen.a
    public final float v() {
        zmw x = x();
        if (x != null) {
            return x.getScale();
        }
        return 1.0f;
    }

    @Override // com.vk.attachpicker.screen.a
    public final zmw x() {
        t tVar = this.S;
        if (tVar.P() == null) {
            return null;
        }
        zmw[] zmwVarArr = new zmw[1];
        N(tVar.P(), new j3u0(this, zmwVarArr));
        return zmwVarArr[0];
    }

    @Override // com.vk.attachpicker.screen.a
    public final List<ObjectAnimator> y() {
        return this.S.M();
    }

    @Override // com.vk.attachpicker.screen.a
    public final List<ObjectAnimator> z() {
        return this.S.E();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.k3u0] */
    public p(ArrayList arrayList, int i, final com.vk.attachpicker.b bVar, c cVar, boolean z, boolean z2, boolean z3, long j, long j2, long j3, boolean z4, boolean z5, int i2, boolean z6, com.vk.core.simplescreen.a aVar, @Nullable String str, @Nullable Integer num, boolean z7, @Nullable c6a0 c6a0Var, @Nullable j34 j34Var, @Nullable k kVar) {
        Context E;
        this.y = new pxo0(500L);
        boolean z8 = true;
        this.P = true;
        this.R = -1;
        this.e0 = new SpoilerConfiguration();
        if (!BuildInfo.t() && !BuildInfo.s()) {
            z8 = false;
        }
        this.g0 = z8;
        this.h0 = null;
        this.z = aVar;
        this.A = str;
        this.C = i;
        this.D = arrayList;
        this.E = i2;
        this.F = cVar;
        this.G = bVar;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = z4;
        this.L = z5;
        this.M = j;
        this.N = j2;
        this.O = j3;
        this.B = num;
        this.f0 = c6a0Var;
        this.T = j34Var;
        this.S = kVar;
        if (z7) {
            dhr0.a.getClass();
            E = dhr0.s();
        } else {
            dhr0.a.getClass();
            E = dhr0.E();
        }
        if (kVar == null) {
            this.S = new g();
        }
        this.S.Y(arrayList);
        this.h = new o(dm10.b(R.attr.vk_legacy_content_tint_background, -1, E));
        this.g = new ColorDrawable(dm10.b(R.attr.vk_legacy_content_tint_background, -1, E));
        this.V = new bd70() { // from class: xsna.k3u0
            @Override // xsna.bd70
            public final void x0(int i3, int i4, Object obj) {
                com.vk.attachpicker.b bVar2 = bVar;
                if (bVar2 != null) {
                    com.vk.attachpicker.screen.p.this.S.R(bVar2.k());
                }
            }
        };
        this.j.b = z6;
    }

    /* compiled from: ViewerScreen.java */
    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(final int i) {
            p pVar = p.this;
            MediaStoreEntry mediaStoreEntry = pVar.D.get(i);
            l5a0 l5a0Var = l5a0.a;
            l5a0.d.add(mediaStoreEntry.f());
            p870.f().c(5);
            p870.f().c(2);
            pVar.S.G(i);
            pVar.P(i, true);
            pVar.n.postDelayed(new Runnable() { // from class: xsna.l3u0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vk.attachpicker.screen.t tVar = com.vk.attachpicker.screen.p.this.S;
                    if (tVar.P() != null) {
                        VkViewPager P = tVar.P();
                        final int i2 = i;
                        com.vk.attachpicker.screen.p.N(P, new p.e() { // from class: xsna.i3u0
                            @Override // com.vk.attachpicker.screen.p.e
                            public final void a(View view) {
                                if (view instanceof zmw) {
                                    zmw zmwVar = (zmw) view;
                                    if (zmwVar.c0()) {
                                        int imageWidth = zmwVar.getImageWidth();
                                        int imageHeight = zmwVar.getImageHeight();
                                        h64 h64Var = zmwVar.m;
                                        h64Var.q = imageWidth;
                                        h64Var.p = imageHeight;
                                        if (imageWidth != -1 || imageHeight != -1) {
                                            h64Var.o.reset();
                                            h64Var.c();
                                            VKImageView g = h64Var.g();
                                            if (g != null) {
                                                g.invalidate();
                                            }
                                        }
                                    }
                                    zmwVar.setCurrentPositionInImageViewer(i2);
                                }
                            }
                        });
                    }
                }
            }, 350L);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* compiled from: ViewerScreen.java */
    public class b implements m.k {
        public b() {
        }

        @Override // com.vk.attachpicker.screen.m.k
        public final void b() {
            pro0.c(new j0(this, 18));
        }

        @Override // com.vk.attachpicker.screen.m.k
        public final void a(long j) {
        }
    }
}
