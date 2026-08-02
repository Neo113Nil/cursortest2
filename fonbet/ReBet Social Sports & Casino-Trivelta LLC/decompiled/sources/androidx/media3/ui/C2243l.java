package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.C2243l;
import androidx.media3.ui.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b1.AbstractC2332A;
import b1.AbstractC2346O;
import b1.InterfaceC2341J;
import b1.T;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.AbstractSurfaceHolderCallbackC6409n;

/* renamed from: androidx.media3.ui.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2243l extends FrameLayout {
    private static final float[] PLAYBACK_SPEEDS;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f22504A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f22505B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f22506C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f22507D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f22508E;

    /* renamed from: F, reason: collision with root package name */
    public final View f22509F;

    /* renamed from: G, reason: collision with root package name */
    public final View f22510G;

    /* renamed from: H, reason: collision with root package name */
    public final View f22511H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f22512I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f22513J;

    /* renamed from: K, reason: collision with root package name */
    public final l0 f22514K;

    /* renamed from: L, reason: collision with root package name */
    public final StringBuilder f22515L;

    /* renamed from: O, reason: collision with root package name */
    public final Formatter f22516O;

    /* renamed from: P, reason: collision with root package name */
    public final AbstractC2346O.b f22517P;

    /* renamed from: P4, reason: collision with root package name */
    public final Drawable f22518P4;

    /* renamed from: Q4, reason: collision with root package name */
    public final Drawable f22519Q4;

    /* renamed from: R, reason: collision with root package name */
    public final AbstractC2346O.c f22520R;

    /* renamed from: R4, reason: collision with root package name */
    public final String f22521R4;

    /* renamed from: S4, reason: collision with root package name */
    public final String f22522S4;

    /* renamed from: T, reason: collision with root package name */
    public final Runnable f22523T;

    /* renamed from: T1, reason: collision with root package name */
    public final String f22524T1;

    /* renamed from: T4, reason: collision with root package name */
    public final Drawable f22525T4;

    /* renamed from: U4, reason: collision with root package name */
    public final Drawable f22526U4;

    /* renamed from: V, reason: collision with root package name */
    public final Drawable f22527V;

    /* renamed from: V1, reason: collision with root package name */
    public final Drawable f22528V1;

    /* renamed from: V4, reason: collision with root package name */
    public final String f22529V4;

    /* renamed from: W, reason: collision with root package name */
    public final Drawable f22530W;

    /* renamed from: W4, reason: collision with root package name */
    public final String f22531W4;

    /* renamed from: X4, reason: collision with root package name */
    public InterfaceC2341J f22532X4;

    /* renamed from: Y4, reason: collision with root package name */
    public d f22533Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public boolean f22534Z4;

    /* renamed from: a, reason: collision with root package name */
    public final E f22535a;

    /* renamed from: a5, reason: collision with root package name */
    public boolean f22536a5;
    private long[] adGroupTimesMs;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f22537b;

    /* renamed from: b1, reason: collision with root package name */
    public final Drawable f22538b1;

    /* renamed from: b2, reason: collision with root package name */
    public final Drawable f22539b2;

    /* renamed from: b5, reason: collision with root package name */
    public boolean f22540b5;

    /* renamed from: c, reason: collision with root package name */
    public final c f22541c;

    /* renamed from: c5, reason: collision with root package name */
    public boolean f22542c5;

    /* renamed from: d, reason: collision with root package name */
    public final Class f22543d;

    /* renamed from: d5, reason: collision with root package name */
    public boolean f22544d5;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22545e;

    /* renamed from: e5, reason: collision with root package name */
    public boolean f22546e5;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    /* renamed from: f, reason: collision with root package name */
    public final Method f22547f;

    /* renamed from: f5, reason: collision with root package name */
    public int f22548f5;

    /* renamed from: g, reason: collision with root package name */
    public final Class f22549g;

    /* renamed from: g1, reason: collision with root package name */
    public final Drawable f22550g1;

    /* renamed from: g2, reason: collision with root package name */
    public final float f22551g2;

    /* renamed from: g5, reason: collision with root package name */
    public boolean f22552g5;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22553h;

    /* renamed from: h5, reason: collision with root package name */
    public int f22554h5;

    /* renamed from: i, reason: collision with root package name */
    public final Method f22555i;

    /* renamed from: i5, reason: collision with root package name */
    public int f22556i5;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f22557j;

    /* renamed from: j5, reason: collision with root package name */
    public long f22558j5;

    /* renamed from: k, reason: collision with root package name */
    public final RecyclerView f22559k;

    /* renamed from: k5, reason: collision with root package name */
    public boolean f22560k5;

    /* renamed from: l, reason: collision with root package name */
    public final h f22561l;

    /* renamed from: m, reason: collision with root package name */
    public final e f22562m;

    /* renamed from: n, reason: collision with root package name */
    public final j f22563n;

    /* renamed from: o, reason: collision with root package name */
    public final b f22564o;

    /* renamed from: p, reason: collision with root package name */
    public final m0 f22565p;

    /* renamed from: p1, reason: collision with root package name */
    public final Drawable f22566p1;

    /* renamed from: p2, reason: collision with root package name */
    public final float f22567p2;
    private boolean[] playedAdGroups;

    /* renamed from: q, reason: collision with root package name */
    public final PopupWindow f22568q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22569r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f22570s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f22571t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f22572u;

    /* renamed from: v, reason: collision with root package name */
    public final View f22573v;

    /* renamed from: w, reason: collision with root package name */
    public final View f22574w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f22575x;

    /* renamed from: x1, reason: collision with root package name */
    public final String f22576x1;

    /* renamed from: x2, reason: collision with root package name */
    public final String f22577x2;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f22578y;

    /* renamed from: y1, reason: collision with root package name */
    public final String f22579y1;

    /* renamed from: y2, reason: collision with root package name */
    public final String f22580y2;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f22581z;

    /* renamed from: androidx.media3.ui.l$b */
    public final class b extends AbstractC0394l {
        public b() {
            super();
        }

        public static /* synthetic */ void i(b bVar, View view) {
            if (C2243l.this.f22532X4 == null || !C2243l.this.f22532X4.E(29)) {
                return;
            }
            ((InterfaceC2341J) e1.Z.i(C2243l.this.f22532X4)).j0(C2243l.this.f22532X4.K().a().H(1).U(1, false).G());
            C2243l.this.f22561l.f(1, C2243l.this.getResources().getString(b0.f22387w));
            C2243l.this.f22568q.dismiss();
        }

        @Override // androidx.media3.ui.C2243l.AbstractC0394l
        public void f(i iVar) {
            iVar.f22591a.setText(b0.f22387w);
            iVar.f22592b.setVisibility(j(((InterfaceC2341J) AbstractC4134a.e(C2243l.this.f22532X4)).K()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2243l.b.i(C2243l.b.this, view);
                }
            });
        }

        @Override // androidx.media3.ui.C2243l.AbstractC0394l
        public void h(String str) {
            C2243l.this.f22561l.f(1, str);
        }

        public final boolean j(b1.S s10) {
            for (int i10 = 0; i10 < this.f22597a.size(); i10++) {
                if (s10.f24442D.containsKey(((k) this.f22597a.get(i10)).f22594a.a())) {
                    return true;
                }
            }
            return false;
        }

        public void k(List list) {
            this.f22597a = list;
            b1.S K10 = ((InterfaceC2341J) AbstractC4134a.e(C2243l.this.f22532X4)).K();
            if (list.isEmpty()) {
                C2243l.this.f22561l.f(1, C2243l.this.getResources().getString(b0.f22388x));
                return;
            }
            if (!j(K10)) {
                C2243l.this.f22561l.f(1, C2243l.this.getResources().getString(b0.f22387w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = (k) list.get(i10);
                if (kVar.a()) {
                    C2243l.this.f22561l.f(1, kVar.f22596c);
                    return;
                }
            }
        }
    }

    /* renamed from: androidx.media3.ui.l$c */
    public final class c implements InterfaceC2341J.d, l0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // androidx.media3.ui.l0.a
        public void G(l0 l0Var, long j10) {
            if (C2243l.this.f22513J != null) {
                C2243l.this.f22513J.setText(e1.Z.u0(C2243l.this.f22515L, C2243l.this.f22516O, j10));
            }
            C2243l c2243l = C2243l.this;
            if (c2243l.m0(c2243l.f22532X4)) {
                C2243l c2243l2 = C2243l.this;
                c2243l2.u0(c2243l2.f22532X4, j10);
            }
        }

        @Override // androidx.media3.ui.l0.a
        public void O(l0 l0Var, long j10, boolean z10) {
            C2243l.this.f22546e5 = false;
            if (C2243l.this.f22532X4 != null) {
                if (!z10) {
                    C2243l c2243l = C2243l.this;
                    c2243l.u0(c2243l.f22532X4, j10);
                }
                C2243l c2243l2 = C2243l.this;
                if (c2243l2.j0(c2243l2.f22532X4)) {
                    try {
                        ((Method) AbstractC4134a.e(C2243l.this.f22545e)).invoke(C2243l.this.f22532X4, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    C2243l c2243l3 = C2243l.this;
                    if (c2243l3.i0(c2243l3.f22532X4)) {
                        try {
                            ((Method) AbstractC4134a.e(C2243l.this.f22553h)).invoke(C2243l.this.f22532X4, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            throw new RuntimeException(e11);
                        }
                    }
                }
            }
            C2243l.this.f22535a.S();
        }

        @Override // androidx.media3.ui.l0.a
        public void m(l0 l0Var, long j10) {
            C2243l.this.f22546e5 = true;
            if (C2243l.this.f22513J != null) {
                C2243l.this.f22513J.setText(e1.Z.u0(C2243l.this.f22515L, C2243l.this.f22516O, j10));
            }
            C2243l.this.f22535a.R();
            if (C2243l.this.f22532X4 == null || !C2243l.this.f22552g5) {
                return;
            }
            C2243l c2243l = C2243l.this;
            if (c2243l.j0(c2243l.f22532X4)) {
                try {
                    ((Method) AbstractC4134a.e(C2243l.this.f22545e)).invoke(C2243l.this.f22532X4, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
            C2243l c2243l2 = C2243l.this;
            if (c2243l2.i0(c2243l2.f22532X4)) {
                try {
                    ((Method) AbstractC4134a.e(C2243l.this.f22553h)).invoke(C2243l.this.f22532X4, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                AbstractC4156x.i("PlayerControlView", "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((InterfaceC2341J) AbstractC4134a.e(C2243l.this.f22532X4)).getClass());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2341J interfaceC2341J = C2243l.this.f22532X4;
            if (interfaceC2341J == null) {
                return;
            }
            C2243l.this.f22535a.S();
            if (C2243l.this.f22571t == view) {
                if (interfaceC2341J.E(9)) {
                    interfaceC2341J.L();
                    return;
                }
                return;
            }
            if (C2243l.this.f22570s == view) {
                if (interfaceC2341J.E(7)) {
                    interfaceC2341J.u();
                    return;
                }
                return;
            }
            if (C2243l.this.f22573v == view) {
                if (interfaceC2341J.g0() == 4 || !interfaceC2341J.E(12)) {
                    return;
                }
                interfaceC2341J.o0();
                return;
            }
            if (C2243l.this.f22574w == view) {
                if (interfaceC2341J.E(11)) {
                    interfaceC2341J.p0();
                    return;
                }
                return;
            }
            if (C2243l.this.f22572u == view) {
                e1.Z.E0(interfaceC2341J, C2243l.this.f22542c5);
                return;
            }
            if (C2243l.this.f22581z == view) {
                if (interfaceC2341J.E(15)) {
                    interfaceC2341J.i0(e1.K.a(interfaceC2341J.l0(), C2243l.this.f22556i5));
                    return;
                }
                return;
            }
            if (C2243l.this.f22504A == view) {
                if (interfaceC2341J.E(14)) {
                    interfaceC2341J.T(!interfaceC2341J.m0());
                    return;
                }
                return;
            }
            if (C2243l.this.f22509F == view) {
                C2243l.this.f22535a.R();
                C2243l c2243l = C2243l.this;
                c2243l.b0(c2243l.f22561l, C2243l.this.f22509F);
                return;
            }
            if (C2243l.this.f22510G == view) {
                C2243l.this.f22535a.R();
                C2243l c2243l2 = C2243l.this;
                c2243l2.b0(c2243l2.f22562m, C2243l.this.f22510G);
            } else if (C2243l.this.f22511H == view) {
                C2243l.this.f22535a.R();
                C2243l c2243l3 = C2243l.this;
                c2243l3.b0(c2243l3.f22564o, C2243l.this.f22511H);
            } else if (C2243l.this.f22506C == view) {
                C2243l.this.f22535a.R();
                C2243l c2243l4 = C2243l.this;
                c2243l4.b0(c2243l4.f22563n, C2243l.this.f22506C);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (C2243l.this.f22560k5) {
                C2243l.this.f22535a.S();
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void r0(InterfaceC2341J interfaceC2341J, InterfaceC2341J.c cVar) {
            if (cVar.b(4, 5, 13)) {
                C2243l.this.D0();
            }
            if (cVar.b(4, 5, 7, 13)) {
                C2243l.this.F0();
            }
            if (cVar.b(8, 13)) {
                C2243l.this.G0();
            }
            if (cVar.b(9, 13)) {
                C2243l.this.K0();
            }
            if (cVar.b(8, 9, 11, 0, 16, 17, 13)) {
                C2243l.this.C0();
            }
            if (cVar.b(11, 0, 13)) {
                C2243l.this.L0();
            }
            if (cVar.b(12, 13)) {
                C2243l.this.E0();
            }
            if (cVar.b(2, 13)) {
                C2243l.this.M0();
            }
        }
    }

    /* renamed from: androidx.media3.ui.l$d */
    public interface d {
        void G(boolean z10);
    }

    /* renamed from: androidx.media3.ui.l$e */
    public final class e extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public int f22584a;
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;

        public e(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public static /* synthetic */ void c(e eVar, int i10, View view) {
            if (i10 != eVar.f22584a) {
                C2243l.this.setPlaybackSpeed(eVar.playbackSpeeds[i10]);
            }
            C2243l.this.f22568q.dismiss();
        }

        public String d() {
            return this.playbackSpeedTexts[this.f22584a];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.playbackSpeedTexts;
            if (i10 < strArr.length) {
                iVar.f22591a.setText(strArr[i10]);
            }
            if (i10 == this.f22584a) {
                iVar.itemView.setSelected(true);
                iVar.f22592b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f22592b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2243l.e.c(C2243l.e.this, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2243l.this.getContext()).inflate(Z.f22344f, viewGroup, false));
        }

        public void g(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i10 >= fArr.length) {
                    this.f22584a = i11;
                    return;
                }
                float abs = Math.abs(f10 - fArr[i10]);
                if (abs < f11) {
                    i11 = i10;
                    f11 = abs;
                }
                i10++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }
    }

    /* renamed from: androidx.media3.ui.l$f */
    public interface f {
    }

    /* renamed from: androidx.media3.ui.l$g */
    public final class g extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f22586a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f22587b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f22588c;

        public g(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f22586a = (TextView) view.findViewById(X.f22332v);
            this.f22587b = (TextView) view.findViewById(X.f22305O);
            this.f22588c = (ImageView) view.findViewById(X.f22330t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2243l.this.r0(C2243l.g.this.getBindingAdapterPosition());
                }
            });
        }
    }

    /* renamed from: androidx.media3.ui.l$h */
    public class h extends RecyclerView.h {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        public boolean c() {
            return g(1) || g(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (g(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            gVar.f22586a.setText(this.mainTexts[i10]);
            if (this.subTexts[i10] == null) {
                gVar.f22587b.setVisibility(8);
            } else {
                gVar.f22587b.setText(this.subTexts[i10]);
            }
            if (this.iconIds[i10] == null) {
                gVar.f22588c.setVisibility(8);
            } else {
                gVar.f22588c.setImageDrawable(this.iconIds[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return C2243l.this.new g(LayoutInflater.from(C2243l.this.getContext()).inflate(Z.f22343e, viewGroup, false));
        }

        public void f(int i10, String str) {
            this.subTexts[i10] = str;
        }

        public final boolean g(int i10) {
            if (C2243l.this.f22532X4 == null) {
                return false;
            }
            if (i10 == 0) {
                return C2243l.this.f22532X4.E(13);
            }
            if (i10 != 1) {
                return true;
            }
            return C2243l.this.f22532X4.E(30) && C2243l.this.f22532X4.E(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }
    }

    /* renamed from: androidx.media3.ui.l$i */
    public static class i extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f22591a;

        /* renamed from: b, reason: collision with root package name */
        public final View f22592b;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f22591a = (TextView) view.findViewById(X.f22308R);
            this.f22592b = view.findViewById(X.f22318h);
        }
    }

    /* renamed from: androidx.media3.ui.l$j */
    public final class j extends AbstractC0394l {
        public j() {
            super();
        }

        public static /* synthetic */ void i(j jVar, View view) {
            if (C2243l.this.f22532X4 == null || !C2243l.this.f22532X4.E(29)) {
                return;
            }
            C2243l.this.f22532X4.j0(C2243l.this.f22532X4.K().a().H(3).O(-3).R(null).T(0).G());
            C2243l.this.f22568q.dismiss();
        }

        @Override // androidx.media3.ui.C2243l.AbstractC0394l, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f22592b.setVisibility(((k) this.f22597a.get(i10 + (-1))).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.C2243l.AbstractC0394l
        public void f(i iVar) {
            boolean z10;
            iVar.f22591a.setText(b0.f22388x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f22597a.size()) {
                    z10 = true;
                    break;
                } else {
                    if (((k) this.f22597a.get(i10)).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f22592b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2243l.j.i(C2243l.j.this, view);
                }
            });
        }

        @Override // androidx.media3.ui.C2243l.AbstractC0394l
        public void h(String str) {
        }

        public void j(List list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((k) list.get(i10)).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (C2243l.this.f22506C != null) {
                ImageView imageView = C2243l.this.f22506C;
                C2243l c2243l = C2243l.this;
                imageView.setImageDrawable(z10 ? c2243l.f22518P4 : c2243l.f22519Q4);
                C2243l.this.f22506C.setContentDescription(z10 ? C2243l.this.f22521R4 : C2243l.this.f22522S4);
            }
            this.f22597a = list;
        }
    }

    /* renamed from: androidx.media3.ui.l$k */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final T.a f22594a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22595b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22596c;

        public k(b1.T t10, int i10, int i11, String str) {
            this.f22594a = (T.a) t10.a().get(i10);
            this.f22595b = i11;
            this.f22596c = str;
        }

        public boolean a() {
            return this.f22594a.h(this.f22595b);
        }
    }

    /* renamed from: androidx.media3.ui.l$l, reason: collision with other inner class name */
    public abstract class AbstractC0394l extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public List f22597a = new ArrayList();

        public AbstractC0394l() {
        }

        public static /* synthetic */ void c(AbstractC0394l abstractC0394l, InterfaceC2341J interfaceC2341J, b1.P p10, k kVar, View view) {
            abstractC0394l.getClass();
            if (interfaceC2341J.E(29)) {
                interfaceC2341J.j0(interfaceC2341J.K().a().Q(new b1.Q(p10, AbstractC3445z.u(Integer.valueOf(kVar.f22595b)))).U(kVar.f22594a.d(), false).G());
                abstractC0394l.h(kVar.f22596c);
                C2243l.this.f22568q.dismiss();
            }
        }

        public void d() {
            this.f22597a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e */
        public void onBindViewHolder(i iVar, int i10) {
            final InterfaceC2341J interfaceC2341J = C2243l.this.f22532X4;
            if (interfaceC2341J == null) {
                return;
            }
            if (i10 == 0) {
                f(iVar);
                return;
            }
            final k kVar = (k) this.f22597a.get(i10 - 1);
            final b1.P a10 = kVar.f22594a.a();
            boolean z10 = interfaceC2341J.K().f24442D.get(a10) != null && kVar.a();
            iVar.f22591a.setText(kVar.f22596c);
            iVar.f22592b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2243l.AbstractC0394l.c(C2243l.AbstractC0394l.this, interfaceC2341J, a10, kVar, view);
                }
            });
        }

        public abstract void f(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2243l.this.getContext()).inflate(Z.f22344f, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f22597a.isEmpty()) {
                return 0;
            }
            return this.f22597a.size() + 1;
        }

        public abstract void h(String str);
    }

    /* renamed from: androidx.media3.ui.l$m */
    public interface m {
        void m(int i10);
    }

    static {
        AbstractC2332A.a("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fb  */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.media3.ui.l0] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView, androidx.media3.ui.l$a] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.LayoutInflater] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2243l(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        final C2243l c2243l;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i18;
        boolean z14;
        boolean z15;
        boolean z16;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z17;
        String str;
        String str2;
        Method method;
        int i26;
        Method method2;
        Method method3;
        Method method4;
        Class<AbstractSurfaceHolderCallbackC6409n> cls;
        Method method5;
        ImageView imageView;
        View findViewById;
        View findViewById2;
        View findViewById3;
        l0 l0Var;
        int i27;
        int i28;
        int i29;
        ImageView imageView2;
        int i30;
        int i31;
        int i32;
        int i33;
        final C2243l c2243l2;
        int i34;
        int i35;
        int i36;
        Context context2;
        ?? r10;
        l0 l0Var2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        View view;
        ImageView imageView7;
        View view2;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        Class[] clsArr;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int resourceId6;
        int resourceId7;
        int resourceId8;
        int resourceId9;
        int resourceId10;
        int resourceId11;
        int resourceId12;
        int resourceId13;
        int resourceId14;
        int resourceId15;
        Class cls2 = Boolean.TYPE;
        int i37 = Z.f22340b;
        int i38 = V.f22277i;
        int i39 = V.f22276h;
        int i40 = V.f22275g;
        int i41 = V.f22284p;
        int i42 = V.f22278j;
        int i43 = V.f22285q;
        int i44 = V.f22274f;
        int i45 = V.f22273e;
        int i46 = V.f22280l;
        int i47 = V.f22281m;
        int i48 = V.f22279k;
        int i49 = V.f22283o;
        int i50 = V.f22282n;
        int i51 = V.f22288t;
        int i52 = V.f22287s;
        int i53 = V.f22289u;
        this.f22542c5 = true;
        this.f22548f5 = 5000;
        this.f22556i5 = 0;
        this.f22554h5 = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, d0.PlayerControlView, i10, 0);
            try {
                resourceId = obtainStyledAttributes.getResourceId(d0.f22442q, i37);
                resourceId2 = obtainStyledAttributes.getResourceId(d0.f22448w, i38);
                resourceId3 = obtainStyledAttributes.getResourceId(d0.f22447v, i39);
                resourceId4 = obtainStyledAttributes.getResourceId(d0.f22446u, i40);
                resourceId5 = obtainStyledAttributes.getResourceId(d0.f22443r, i41);
                resourceId6 = obtainStyledAttributes.getResourceId(d0.f22449x, i42);
                i43 = obtainStyledAttributes.getResourceId(d0.f22395C, i43);
                resourceId7 = obtainStyledAttributes.getResourceId(d0.f22445t, i44);
                resourceId8 = obtainStyledAttributes.getResourceId(d0.f22444s, i45);
                resourceId9 = obtainStyledAttributes.getResourceId(d0.f22451z, i46);
                resourceId10 = obtainStyledAttributes.getResourceId(d0.f22393A, i47);
                resourceId11 = obtainStyledAttributes.getResourceId(d0.f22450y, i48);
                resourceId12 = obtainStyledAttributes.getResourceId(d0.f22405M, i49);
                resourceId13 = obtainStyledAttributes.getResourceId(d0.f22404L, i50);
                resourceId14 = obtainStyledAttributes.getResourceId(d0.f22407O, i51);
                i52 = obtainStyledAttributes.getResourceId(d0.f22406N, i52);
                resourceId15 = obtainStyledAttributes.getResourceId(d0.f22410R, i53);
                c2243l = this;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                c2243l.f22548f5 = obtainStyledAttributes.getInt(d0.f22402J, c2243l.f22548f5);
                c2243l.f22556i5 = d0(obtainStyledAttributes, c2243l.f22556i5);
                boolean z18 = obtainStyledAttributes.getBoolean(d0.f22399G, true);
                boolean z19 = obtainStyledAttributes.getBoolean(d0.f22396D, true);
                z11 = obtainStyledAttributes.getBoolean(d0.f22398F, true);
                boolean z20 = obtainStyledAttributes.getBoolean(d0.f22397E, true);
                boolean z21 = obtainStyledAttributes.getBoolean(d0.f22400H, false);
                boolean z22 = obtainStyledAttributes.getBoolean(d0.f22401I, false);
                boolean z23 = obtainStyledAttributes.getBoolean(d0.f22403K, false);
                c2243l.f22552g5 = obtainStyledAttributes.getBoolean(d0.f22409Q, false);
                c2243l.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(d0.f22408P, c2243l.f22554h5));
                boolean z24 = obtainStyledAttributes.getBoolean(d0.f22441p, true);
                obtainStyledAttributes.recycle();
                i12 = resourceId5;
                i13 = resourceId7;
                i14 = resourceId6;
                i15 = resourceId8;
                z12 = z18;
                z16 = z21;
                z13 = z19;
                z10 = z20;
                z17 = z24;
                i20 = resourceId9;
                i21 = resourceId4;
                i22 = resourceId10;
                i23 = resourceId3;
                i24 = resourceId2;
                i25 = resourceId;
                z14 = z23;
                i18 = resourceId11;
                i16 = resourceId14;
                i11 = resourceId13;
                i19 = resourceId15;
                z15 = z22;
                i17 = resourceId12;
            } catch (Throwable th3) {
                th = th3;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            c2243l = this;
            i11 = i50;
            i12 = i41;
            i13 = i44;
            i14 = i42;
            i15 = i45;
            i16 = i51;
            i17 = i49;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i18 = i48;
            z14 = false;
            z15 = false;
            z16 = false;
            i19 = i53;
            i20 = i46;
            i21 = i40;
            i22 = i47;
            i23 = i39;
            i24 = i38;
            i25 = i37;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(i25, c2243l);
        c2243l.setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        c2243l.f22541c = new c();
        c2243l.f22557j = new CopyOnWriteArrayList();
        c2243l.f22517P = new AbstractC2346O.b();
        c2243l.f22520R = new AbstractC2346O.c();
        StringBuilder sb2 = new StringBuilder();
        c2243l.f22515L = sb2;
        int i54 = i19;
        c2243l.f22516O = new Formatter(sb2, Locale.getDefault());
        c2243l.adGroupTimesMs = new long[0];
        c2243l.playedAdGroups = new boolean[0];
        c2243l.extraAdGroupTimesMs = new long[0];
        c2243l.extraPlayedAdGroups = new boolean[0];
        c2243l.f22523T = new Runnable() { // from class: androidx.media3.ui.i
            @Override // java.lang.Runnable
            public final void run() {
                C2243l.this.F0();
            }
        };
        try {
            clsArr = new Class[]{cls2};
            str2 = "setScrubbingModeEnabled";
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            str = "isScrubbingModeEnabled";
            str2 = "setScrubbingModeEnabled";
        }
        try {
            method = ExoPlayer.class.getMethod(str2, clsArr);
            str = "isScrubbingModeEnabled";
            try {
                i26 = i24;
                method2 = ExoPlayer.class.getMethod(str, null);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                i26 = i24;
                method2 = null;
                Method method6 = method;
                c2243l.f22543d = ExoPlayer.class;
                c2243l.f22545e = method6;
                c2243l.f22547f = method2;
                cls = AbstractSurfaceHolderCallbackC6409n.class;
                InterfaceC2341J.b bVar = AbstractSurfaceHolderCallbackC6409n.f65455b;
                try {
                    method4 = cls.getMethod(str2, cls2);
                    method3 = null;
                    try {
                        method5 = cls.getMethod(str, null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method5 = method3;
                        c2243l.f22549g = cls;
                        c2243l.f22553h = method4;
                        c2243l.f22555i = method5;
                        c2243l.f22512I = (TextView) c2243l.findViewById(X.f22323m);
                        c2243l.f22513J = (TextView) c2243l.findViewById(X.f22295E);
                        imageView = (ImageView) c2243l.findViewById(X.f22306P);
                        c2243l.f22506C = imageView;
                        if (imageView != null) {
                        }
                        ImageView imageView11 = (ImageView) c2243l.findViewById(X.f22329s);
                        c2243l.f22507D = imageView11;
                        h0(imageView11, new View.OnClickListener() { // from class: androidx.media3.ui.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C2243l.this.p0(view3);
                            }
                        });
                        ImageView imageView12 = (ImageView) c2243l.findViewById(X.f22334x);
                        c2243l.f22508E = imageView12;
                        h0(imageView12, new View.OnClickListener() { // from class: androidx.media3.ui.j
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C2243l.this.p0(view3);
                            }
                        });
                        findViewById = c2243l.findViewById(X.f22302L);
                        c2243l.f22509F = findViewById;
                        if (findViewById != null) {
                        }
                        findViewById2 = c2243l.findViewById(X.f22294D);
                        c2243l.f22510G = findViewById2;
                        if (findViewById2 != null) {
                        }
                        findViewById3 = c2243l.findViewById(X.f22313c);
                        c2243l.f22511H = findViewById3;
                        if (findViewById3 != null) {
                        }
                        l0Var = (l0) c2243l.findViewById(X.f22297G);
                        View findViewById4 = c2243l.findViewById(X.f22298H);
                        if (l0Var == null) {
                        }
                        l0Var2 = c2243l2.f22514K;
                        if (l0Var2 != null) {
                        }
                        Resources resources = context2.getResources();
                        c2243l2.f22537b = resources;
                        imageView3 = (ImageView) c2243l2.findViewById(X.f22293C);
                        c2243l2.f22572u = imageView3;
                        if (imageView3 != null) {
                        }
                        imageView4 = (ImageView) c2243l2.findViewById(X.f22296F);
                        c2243l2.f22570s = imageView4;
                        if (imageView4 != null) {
                        }
                        imageView5 = (ImageView) c2243l2.findViewById(X.f22335y);
                        c2243l2.f22571t = imageView5;
                        if (imageView5 != null) {
                        }
                        Typeface h10 = androidx.core.content.res.k.h(context2, W.f22290a);
                        imageView6 = (ImageView) c2243l2.findViewById(X.f22300J);
                        TextView textView = (TextView) c2243l2.findViewById(X.f22301K);
                        if (imageView6 == null) {
                        }
                        view = c2243l2.f22574w;
                        if (view != null) {
                        }
                        imageView7 = (ImageView) c2243l2.findViewById(X.f22327q);
                        TextView textView2 = (TextView) c2243l2.findViewById(X.f22328r);
                        if (imageView7 == null) {
                        }
                        view2 = c2243l2.f22573v;
                        if (view2 != null) {
                        }
                        imageView8 = (ImageView) c2243l2.findViewById(X.f22299I);
                        c2243l2.f22581z = imageView8;
                        if (imageView8 != null) {
                        }
                        imageView9 = (ImageView) c2243l2.findViewById(X.f22303M);
                        c2243l2.f22504A = imageView9;
                        if (imageView9 != null) {
                        }
                        c2243l2.f22551g2 = resources.getInteger(Y.f22338b) / 100.0f;
                        c2243l2.f22567p2 = resources.getInteger(Y.f22337a) / 100.0f;
                        imageView10 = (ImageView) c2243l2.findViewById(X.f22310T);
                        c2243l2.f22505B = imageView10;
                        if (imageView10 == null) {
                        }
                        E e10 = new E(c2243l2);
                        c2243l2.f22535a = e10;
                        e10.T(z17);
                        h hVar = c2243l2.new h(new String[]{resources.getString(b0.f22372h), resources.getString(b0.f22389y)}, new Drawable[]{e1.Z.d0(context2, resources, V.f22286r), e1.Z.d0(context2, resources, V.f22272d)});
                        c2243l2.f22561l = hVar;
                        c2243l2.f22569r = resources.getDimensionPixelSize(U.f22265a);
                        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(Z.f22342d, r10);
                        c2243l2.f22559k = recyclerView;
                        recyclerView.setAdapter(hVar);
                        recyclerView.setLayoutManager(new LinearLayoutManager(c2243l2.getContext()));
                        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                        c2243l2.f22568q = popupWindow;
                        popupWindow.setOnDismissListener(c2243l2.f22541c);
                        c2243l2.f22560k5 = true;
                        c2243l2.f22565p = new C2237f(c2243l2.getResources());
                        c2243l2.f22518P4 = e1.Z.d0(context2, resources, i36);
                        c2243l2.f22519Q4 = e1.Z.d0(context2, resources, i28);
                        c2243l2.f22521R4 = resources.getString(b0.f22366b);
                        c2243l2.f22522S4 = resources.getString(b0.f22365a);
                        c2243l2.f22563n = new j();
                        c2243l2.f22564o = new b();
                        c2243l2.f22562m = c2243l2.new e(resources.getStringArray(S.f22237a), PLAYBACK_SPEEDS);
                        c2243l2.f22527V = e1.Z.d0(context2, resources, i31);
                        c2243l2.f22530W = e1.Z.d0(context2, resources, i27);
                        c2243l2.f22525T4 = e1.Z.d0(context2, resources, i34);
                        c2243l2.f22526U4 = e1.Z.d0(context2, resources, i35);
                        c2243l2.f22538b1 = e1.Z.d0(context2, resources, i29);
                        c2243l2.f22550g1 = e1.Z.d0(context2, resources, i30);
                        c2243l2.f22566p1 = e1.Z.d0(context2, resources, i18);
                        c2243l2.f22528V1 = e1.Z.d0(context2, resources, i17);
                        c2243l2.f22539b2 = e1.Z.d0(context2, resources, i32);
                        c2243l2.f22529V4 = resources.getString(b0.f22368d);
                        c2243l2.f22531W4 = resources.getString(b0.f22367c);
                        c2243l2.f22576x1 = resources.getString(b0.f22374j);
                        c2243l2.f22579y1 = resources.getString(b0.f22375k);
                        c2243l2.f22524T1 = resources.getString(b0.f22373i);
                        c2243l2.f22577x2 = resources.getString(b0.f22378n);
                        c2243l2.f22580y2 = resources.getString(b0.f22377m);
                        e10.U((ViewGroup) c2243l2.findViewById(X.f22315e), true);
                        e10.U(c2243l2.f22573v, z13);
                        e10.U(c2243l2.f22574w, z12);
                        e10.U(imageView4, z11);
                        e10.U(imageView5, z10);
                        e10.U(imageView9, z16);
                        e10.U(imageView2, z15);
                        e10.U(imageView10, z14);
                        e10.U(imageView8, c2243l2.f22556i5 == 0);
                        c2243l2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.k
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view3, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62) {
                                C2243l.this.q0(view3, i55, i56, i57, i58, i59, i60, i61, i62);
                            }
                        });
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method3 = null;
                    method4 = null;
                }
                c2243l.f22549g = cls;
                c2243l.f22553h = method4;
                c2243l.f22555i = method5;
                c2243l.f22512I = (TextView) c2243l.findViewById(X.f22323m);
                c2243l.f22513J = (TextView) c2243l.findViewById(X.f22295E);
                imageView = (ImageView) c2243l.findViewById(X.f22306P);
                c2243l.f22506C = imageView;
                if (imageView != null) {
                }
                ImageView imageView112 = (ImageView) c2243l.findViewById(X.f22329s);
                c2243l.f22507D = imageView112;
                h0(imageView112, new View.OnClickListener() { // from class: androidx.media3.ui.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C2243l.this.p0(view3);
                    }
                });
                ImageView imageView122 = (ImageView) c2243l.findViewById(X.f22334x);
                c2243l.f22508E = imageView122;
                h0(imageView122, new View.OnClickListener() { // from class: androidx.media3.ui.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C2243l.this.p0(view3);
                    }
                });
                findViewById = c2243l.findViewById(X.f22302L);
                c2243l.f22509F = findViewById;
                if (findViewById != null) {
                }
                findViewById2 = c2243l.findViewById(X.f22294D);
                c2243l.f22510G = findViewById2;
                if (findViewById2 != null) {
                }
                findViewById3 = c2243l.findViewById(X.f22313c);
                c2243l.f22511H = findViewById3;
                if (findViewById3 != null) {
                }
                l0Var = (l0) c2243l.findViewById(X.f22297G);
                View findViewById42 = c2243l.findViewById(X.f22298H);
                if (l0Var == null) {
                }
                l0Var2 = c2243l2.f22514K;
                if (l0Var2 != null) {
                }
                Resources resources2 = context2.getResources();
                c2243l2.f22537b = resources2;
                imageView3 = (ImageView) c2243l2.findViewById(X.f22293C);
                c2243l2.f22572u = imageView3;
                if (imageView3 != null) {
                }
                imageView4 = (ImageView) c2243l2.findViewById(X.f22296F);
                c2243l2.f22570s = imageView4;
                if (imageView4 != null) {
                }
                imageView5 = (ImageView) c2243l2.findViewById(X.f22335y);
                c2243l2.f22571t = imageView5;
                if (imageView5 != null) {
                }
                Typeface h102 = androidx.core.content.res.k.h(context2, W.f22290a);
                imageView6 = (ImageView) c2243l2.findViewById(X.f22300J);
                TextView textView3 = (TextView) c2243l2.findViewById(X.f22301K);
                if (imageView6 == null) {
                }
                view = c2243l2.f22574w;
                if (view != null) {
                }
                imageView7 = (ImageView) c2243l2.findViewById(X.f22327q);
                TextView textView22 = (TextView) c2243l2.findViewById(X.f22328r);
                if (imageView7 == null) {
                }
                view2 = c2243l2.f22573v;
                if (view2 != null) {
                }
                imageView8 = (ImageView) c2243l2.findViewById(X.f22299I);
                c2243l2.f22581z = imageView8;
                if (imageView8 != null) {
                }
                imageView9 = (ImageView) c2243l2.findViewById(X.f22303M);
                c2243l2.f22504A = imageView9;
                if (imageView9 != null) {
                }
                c2243l2.f22551g2 = resources2.getInteger(Y.f22338b) / 100.0f;
                c2243l2.f22567p2 = resources2.getInteger(Y.f22337a) / 100.0f;
                imageView10 = (ImageView) c2243l2.findViewById(X.f22310T);
                c2243l2.f22505B = imageView10;
                if (imageView10 == null) {
                }
                E e102 = new E(c2243l2);
                c2243l2.f22535a = e102;
                e102.T(z17);
                h hVar2 = c2243l2.new h(new String[]{resources2.getString(b0.f22372h), resources2.getString(b0.f22389y)}, new Drawable[]{e1.Z.d0(context2, resources2, V.f22286r), e1.Z.d0(context2, resources2, V.f22272d)});
                c2243l2.f22561l = hVar2;
                c2243l2.f22569r = resources2.getDimensionPixelSize(U.f22265a);
                RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context2).inflate(Z.f22342d, r10);
                c2243l2.f22559k = recyclerView2;
                recyclerView2.setAdapter(hVar2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(c2243l2.getContext()));
                PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                c2243l2.f22568q = popupWindow2;
                popupWindow2.setOnDismissListener(c2243l2.f22541c);
                c2243l2.f22560k5 = true;
                c2243l2.f22565p = new C2237f(c2243l2.getResources());
                c2243l2.f22518P4 = e1.Z.d0(context2, resources2, i36);
                c2243l2.f22519Q4 = e1.Z.d0(context2, resources2, i28);
                c2243l2.f22521R4 = resources2.getString(b0.f22366b);
                c2243l2.f22522S4 = resources2.getString(b0.f22365a);
                c2243l2.f22563n = new j();
                c2243l2.f22564o = new b();
                c2243l2.f22562m = c2243l2.new e(resources2.getStringArray(S.f22237a), PLAYBACK_SPEEDS);
                c2243l2.f22527V = e1.Z.d0(context2, resources2, i31);
                c2243l2.f22530W = e1.Z.d0(context2, resources2, i27);
                c2243l2.f22525T4 = e1.Z.d0(context2, resources2, i34);
                c2243l2.f22526U4 = e1.Z.d0(context2, resources2, i35);
                c2243l2.f22538b1 = e1.Z.d0(context2, resources2, i29);
                c2243l2.f22550g1 = e1.Z.d0(context2, resources2, i30);
                c2243l2.f22566p1 = e1.Z.d0(context2, resources2, i18);
                c2243l2.f22528V1 = e1.Z.d0(context2, resources2, i17);
                c2243l2.f22539b2 = e1.Z.d0(context2, resources2, i32);
                c2243l2.f22529V4 = resources2.getString(b0.f22368d);
                c2243l2.f22531W4 = resources2.getString(b0.f22367c);
                c2243l2.f22576x1 = resources2.getString(b0.f22374j);
                c2243l2.f22579y1 = resources2.getString(b0.f22375k);
                c2243l2.f22524T1 = resources2.getString(b0.f22373i);
                c2243l2.f22577x2 = resources2.getString(b0.f22378n);
                c2243l2.f22580y2 = resources2.getString(b0.f22377m);
                e102.U((ViewGroup) c2243l2.findViewById(X.f22315e), true);
                e102.U(c2243l2.f22573v, z13);
                e102.U(c2243l2.f22574w, z12);
                e102.U(imageView4, z11);
                e102.U(imageView5, z10);
                e102.U(imageView9, z16);
                e102.U(imageView2, z15);
                e102.U(imageView10, z14);
                e102.U(imageView8, c2243l2.f22556i5 == 0);
                c2243l2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.k
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view3, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62) {
                        C2243l.this.q0(view3, i55, i56, i57, i58, i59, i60, i61, i62);
                    }
                });
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            str = "isScrubbingModeEnabled";
            method = null;
            i26 = i24;
            method2 = null;
            Method method62 = method;
            c2243l.f22543d = ExoPlayer.class;
            c2243l.f22545e = method62;
            c2243l.f22547f = method2;
            cls = AbstractSurfaceHolderCallbackC6409n.class;
            InterfaceC2341J.b bVar2 = AbstractSurfaceHolderCallbackC6409n.f65455b;
            method4 = cls.getMethod(str2, cls2);
            method3 = null;
            method5 = cls.getMethod(str, null);
            c2243l.f22549g = cls;
            c2243l.f22553h = method4;
            c2243l.f22555i = method5;
            c2243l.f22512I = (TextView) c2243l.findViewById(X.f22323m);
            c2243l.f22513J = (TextView) c2243l.findViewById(X.f22295E);
            imageView = (ImageView) c2243l.findViewById(X.f22306P);
            c2243l.f22506C = imageView;
            if (imageView != null) {
            }
            ImageView imageView1122 = (ImageView) c2243l.findViewById(X.f22329s);
            c2243l.f22507D = imageView1122;
            h0(imageView1122, new View.OnClickListener() { // from class: androidx.media3.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C2243l.this.p0(view3);
                }
            });
            ImageView imageView1222 = (ImageView) c2243l.findViewById(X.f22334x);
            c2243l.f22508E = imageView1222;
            h0(imageView1222, new View.OnClickListener() { // from class: androidx.media3.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C2243l.this.p0(view3);
                }
            });
            findViewById = c2243l.findViewById(X.f22302L);
            c2243l.f22509F = findViewById;
            if (findViewById != null) {
            }
            findViewById2 = c2243l.findViewById(X.f22294D);
            c2243l.f22510G = findViewById2;
            if (findViewById2 != null) {
            }
            findViewById3 = c2243l.findViewById(X.f22313c);
            c2243l.f22511H = findViewById3;
            if (findViewById3 != null) {
            }
            l0Var = (l0) c2243l.findViewById(X.f22297G);
            View findViewById422 = c2243l.findViewById(X.f22298H);
            if (l0Var == null) {
            }
            l0Var2 = c2243l2.f22514K;
            if (l0Var2 != null) {
            }
            Resources resources22 = context2.getResources();
            c2243l2.f22537b = resources22;
            imageView3 = (ImageView) c2243l2.findViewById(X.f22293C);
            c2243l2.f22572u = imageView3;
            if (imageView3 != null) {
            }
            imageView4 = (ImageView) c2243l2.findViewById(X.f22296F);
            c2243l2.f22570s = imageView4;
            if (imageView4 != null) {
            }
            imageView5 = (ImageView) c2243l2.findViewById(X.f22335y);
            c2243l2.f22571t = imageView5;
            if (imageView5 != null) {
            }
            Typeface h1022 = androidx.core.content.res.k.h(context2, W.f22290a);
            imageView6 = (ImageView) c2243l2.findViewById(X.f22300J);
            TextView textView32 = (TextView) c2243l2.findViewById(X.f22301K);
            if (imageView6 == null) {
            }
            view = c2243l2.f22574w;
            if (view != null) {
            }
            imageView7 = (ImageView) c2243l2.findViewById(X.f22327q);
            TextView textView222 = (TextView) c2243l2.findViewById(X.f22328r);
            if (imageView7 == null) {
            }
            view2 = c2243l2.f22573v;
            if (view2 != null) {
            }
            imageView8 = (ImageView) c2243l2.findViewById(X.f22299I);
            c2243l2.f22581z = imageView8;
            if (imageView8 != null) {
            }
            imageView9 = (ImageView) c2243l2.findViewById(X.f22303M);
            c2243l2.f22504A = imageView9;
            if (imageView9 != null) {
            }
            c2243l2.f22551g2 = resources22.getInteger(Y.f22338b) / 100.0f;
            c2243l2.f22567p2 = resources22.getInteger(Y.f22337a) / 100.0f;
            imageView10 = (ImageView) c2243l2.findViewById(X.f22310T);
            c2243l2.f22505B = imageView10;
            if (imageView10 == null) {
            }
            E e1022 = new E(c2243l2);
            c2243l2.f22535a = e1022;
            e1022.T(z17);
            h hVar22 = c2243l2.new h(new String[]{resources22.getString(b0.f22372h), resources22.getString(b0.f22389y)}, new Drawable[]{e1.Z.d0(context2, resources22, V.f22286r), e1.Z.d0(context2, resources22, V.f22272d)});
            c2243l2.f22561l = hVar22;
            c2243l2.f22569r = resources22.getDimensionPixelSize(U.f22265a);
            RecyclerView recyclerView22 = (RecyclerView) LayoutInflater.from(context2).inflate(Z.f22342d, r10);
            c2243l2.f22559k = recyclerView22;
            recyclerView22.setAdapter(hVar22);
            recyclerView22.setLayoutManager(new LinearLayoutManager(c2243l2.getContext()));
            PopupWindow popupWindow22 = new PopupWindow((View) recyclerView22, -2, -2, true);
            c2243l2.f22568q = popupWindow22;
            popupWindow22.setOnDismissListener(c2243l2.f22541c);
            c2243l2.f22560k5 = true;
            c2243l2.f22565p = new C2237f(c2243l2.getResources());
            c2243l2.f22518P4 = e1.Z.d0(context2, resources22, i36);
            c2243l2.f22519Q4 = e1.Z.d0(context2, resources22, i28);
            c2243l2.f22521R4 = resources22.getString(b0.f22366b);
            c2243l2.f22522S4 = resources22.getString(b0.f22365a);
            c2243l2.f22563n = new j();
            c2243l2.f22564o = new b();
            c2243l2.f22562m = c2243l2.new e(resources22.getStringArray(S.f22237a), PLAYBACK_SPEEDS);
            c2243l2.f22527V = e1.Z.d0(context2, resources22, i31);
            c2243l2.f22530W = e1.Z.d0(context2, resources22, i27);
            c2243l2.f22525T4 = e1.Z.d0(context2, resources22, i34);
            c2243l2.f22526U4 = e1.Z.d0(context2, resources22, i35);
            c2243l2.f22538b1 = e1.Z.d0(context2, resources22, i29);
            c2243l2.f22550g1 = e1.Z.d0(context2, resources22, i30);
            c2243l2.f22566p1 = e1.Z.d0(context2, resources22, i18);
            c2243l2.f22528V1 = e1.Z.d0(context2, resources22, i17);
            c2243l2.f22539b2 = e1.Z.d0(context2, resources22, i32);
            c2243l2.f22529V4 = resources22.getString(b0.f22368d);
            c2243l2.f22531W4 = resources22.getString(b0.f22367c);
            c2243l2.f22576x1 = resources22.getString(b0.f22374j);
            c2243l2.f22579y1 = resources22.getString(b0.f22375k);
            c2243l2.f22524T1 = resources22.getString(b0.f22373i);
            c2243l2.f22577x2 = resources22.getString(b0.f22378n);
            c2243l2.f22580y2 = resources22.getString(b0.f22377m);
            e1022.U((ViewGroup) c2243l2.findViewById(X.f22315e), true);
            e1022.U(c2243l2.f22573v, z13);
            e1022.U(c2243l2.f22574w, z12);
            e1022.U(imageView4, z11);
            e1022.U(imageView5, z10);
            e1022.U(imageView9, z16);
            e1022.U(imageView2, z15);
            e1022.U(imageView10, z14);
            e1022.U(imageView8, c2243l2.f22556i5 == 0);
            c2243l2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62) {
                    C2243l.this.q0(view3, i55, i56, i57, i58, i59, i60, i61, i62);
                }
            });
        }
        Method method622 = method;
        c2243l.f22543d = ExoPlayer.class;
        c2243l.f22545e = method622;
        c2243l.f22547f = method2;
        try {
            cls = AbstractSurfaceHolderCallbackC6409n.class;
            InterfaceC2341J.b bVar22 = AbstractSurfaceHolderCallbackC6409n.f65455b;
            method4 = cls.getMethod(str2, cls2);
            method3 = null;
            method5 = cls.getMethod(str, null);
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            method3 = null;
            method4 = null;
            cls = null;
        }
        c2243l.f22549g = cls;
        c2243l.f22553h = method4;
        c2243l.f22555i = method5;
        c2243l.f22512I = (TextView) c2243l.findViewById(X.f22323m);
        c2243l.f22513J = (TextView) c2243l.findViewById(X.f22295E);
        imageView = (ImageView) c2243l.findViewById(X.f22306P);
        c2243l.f22506C = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(c2243l.f22541c);
        }
        ImageView imageView11222 = (ImageView) c2243l.findViewById(X.f22329s);
        c2243l.f22507D = imageView11222;
        h0(imageView11222, new View.OnClickListener() { // from class: androidx.media3.ui.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C2243l.this.p0(view3);
            }
        });
        ImageView imageView12222 = (ImageView) c2243l.findViewById(X.f22334x);
        c2243l.f22508E = imageView12222;
        h0(imageView12222, new View.OnClickListener() { // from class: androidx.media3.ui.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C2243l.this.p0(view3);
            }
        });
        findViewById = c2243l.findViewById(X.f22302L);
        c2243l.f22509F = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(c2243l.f22541c);
        }
        findViewById2 = c2243l.findViewById(X.f22294D);
        c2243l.f22510G = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(c2243l.f22541c);
        }
        findViewById3 = c2243l.findViewById(X.f22313c);
        c2243l.f22511H = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(c2243l.f22541c);
        }
        l0Var = (l0) c2243l.findViewById(X.f22297G);
        View findViewById4222 = c2243l.findViewById(X.f22298H);
        if (l0Var == null) {
            c2243l.f22514K = l0Var;
            int i55 = i52;
            i27 = i23;
            i28 = i55;
            i29 = i20;
            imageView2 = imageView;
            i30 = i22;
            i31 = i26;
            i32 = i11;
            i33 = i54;
            c2243l2 = c2243l;
            i34 = i13;
            i35 = i15;
            i36 = i16;
            r10 = method3;
            context2 = context;
        } else if (findViewById4222 != null) {
            int i56 = i52;
            i27 = i23;
            i28 = i56;
            i30 = i22;
            imageView2 = imageView;
            i31 = i26;
            i32 = i11;
            c2243l2 = this;
            i29 = i20;
            i34 = i13;
            i35 = i15;
            i33 = i54;
            i36 = i16;
            r10 = method3;
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, c0.f22391a);
            defaultTimeBar.setId(X.f22297G);
            defaultTimeBar.setLayoutParams(findViewById4222.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4222.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4222);
            viewGroup.removeView(findViewById4222);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            c2243l2.f22514K = defaultTimeBar;
        } else {
            int i57 = i52;
            i27 = i23;
            i28 = i57;
            i29 = i20;
            imageView2 = imageView;
            i30 = i22;
            i31 = i26;
            i32 = i11;
            i33 = i54;
            c2243l2 = c2243l;
            i34 = i13;
            i35 = i15;
            i36 = i16;
            ?? r102 = method3;
            context2 = context;
            c2243l2.f22514K = r102;
            r10 = r102;
        }
        l0Var2 = c2243l2.f22514K;
        if (l0Var2 != null) {
            l0Var2.a(c2243l2.f22541c);
        }
        Resources resources222 = context2.getResources();
        c2243l2.f22537b = resources222;
        imageView3 = (ImageView) c2243l2.findViewById(X.f22293C);
        c2243l2.f22572u = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(c2243l2.f22541c);
        }
        imageView4 = (ImageView) c2243l2.findViewById(X.f22296F);
        c2243l2.f22570s = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(e1.Z.d0(context2, resources222, i14));
            imageView4.setOnClickListener(c2243l2.f22541c);
        }
        imageView5 = (ImageView) c2243l2.findViewById(X.f22335y);
        c2243l2.f22571t = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(e1.Z.d0(context2, resources222, i21));
            imageView5.setOnClickListener(c2243l2.f22541c);
        }
        Typeface h10222 = androidx.core.content.res.k.h(context2, W.f22290a);
        imageView6 = (ImageView) c2243l2.findViewById(X.f22300J);
        TextView textView322 = (TextView) c2243l2.findViewById(X.f22301K);
        if (imageView6 == null) {
            imageView6.setImageDrawable(e1.Z.d0(context2, resources222, i43));
            c2243l2.f22574w = imageView6;
            c2243l2.f22578y = r10;
        } else if (textView322 != null) {
            textView322.setTypeface(h10222);
            c2243l2.f22578y = textView322;
            c2243l2.f22574w = textView322;
        } else {
            c2243l2.f22578y = r10;
            c2243l2.f22574w = r10;
        }
        view = c2243l2.f22574w;
        if (view != null) {
            view.setOnClickListener(c2243l2.f22541c);
        }
        imageView7 = (ImageView) c2243l2.findViewById(X.f22327q);
        TextView textView2222 = (TextView) c2243l2.findViewById(X.f22328r);
        if (imageView7 == null) {
            imageView7.setImageDrawable(e1.Z.d0(context2, resources222, i12));
            c2243l2.f22573v = imageView7;
            c2243l2.f22575x = r10;
        } else if (textView2222 != null) {
            textView2222.setTypeface(h10222);
            c2243l2.f22575x = textView2222;
            c2243l2.f22573v = textView2222;
        } else {
            c2243l2.f22575x = r10;
            c2243l2.f22573v = r10;
        }
        view2 = c2243l2.f22573v;
        if (view2 != null) {
            view2.setOnClickListener(c2243l2.f22541c);
        }
        imageView8 = (ImageView) c2243l2.findViewById(X.f22299I);
        c2243l2.f22581z = imageView8;
        if (imageView8 != null) {
            imageView8.setOnClickListener(c2243l2.f22541c);
        }
        imageView9 = (ImageView) c2243l2.findViewById(X.f22303M);
        c2243l2.f22504A = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(c2243l2.f22541c);
        }
        c2243l2.f22551g2 = resources222.getInteger(Y.f22338b) / 100.0f;
        c2243l2.f22567p2 = resources222.getInteger(Y.f22337a) / 100.0f;
        imageView10 = (ImageView) c2243l2.findViewById(X.f22310T);
        c2243l2.f22505B = imageView10;
        if (imageView10 == null) {
            imageView10.setImageDrawable(e1.Z.d0(context2, resources222, i33));
            c2243l2.x0(false, imageView10);
        }
        E e10222 = new E(c2243l2);
        c2243l2.f22535a = e10222;
        e10222.T(z17);
        h hVar222 = c2243l2.new h(new String[]{resources222.getString(b0.f22372h), resources222.getString(b0.f22389y)}, new Drawable[]{e1.Z.d0(context2, resources222, V.f22286r), e1.Z.d0(context2, resources222, V.f22272d)});
        c2243l2.f22561l = hVar222;
        c2243l2.f22569r = resources222.getDimensionPixelSize(U.f22265a);
        RecyclerView recyclerView222 = (RecyclerView) LayoutInflater.from(context2).inflate(Z.f22342d, r10);
        c2243l2.f22559k = recyclerView222;
        recyclerView222.setAdapter(hVar222);
        recyclerView222.setLayoutManager(new LinearLayoutManager(c2243l2.getContext()));
        PopupWindow popupWindow222 = new PopupWindow((View) recyclerView222, -2, -2, true);
        c2243l2.f22568q = popupWindow222;
        popupWindow222.setOnDismissListener(c2243l2.f22541c);
        c2243l2.f22560k5 = true;
        c2243l2.f22565p = new C2237f(c2243l2.getResources());
        c2243l2.f22518P4 = e1.Z.d0(context2, resources222, i36);
        c2243l2.f22519Q4 = e1.Z.d0(context2, resources222, i28);
        c2243l2.f22521R4 = resources222.getString(b0.f22366b);
        c2243l2.f22522S4 = resources222.getString(b0.f22365a);
        c2243l2.f22563n = new j();
        c2243l2.f22564o = new b();
        c2243l2.f22562m = c2243l2.new e(resources222.getStringArray(S.f22237a), PLAYBACK_SPEEDS);
        c2243l2.f22527V = e1.Z.d0(context2, resources222, i31);
        c2243l2.f22530W = e1.Z.d0(context2, resources222, i27);
        c2243l2.f22525T4 = e1.Z.d0(context2, resources222, i34);
        c2243l2.f22526U4 = e1.Z.d0(context2, resources222, i35);
        c2243l2.f22538b1 = e1.Z.d0(context2, resources222, i29);
        c2243l2.f22550g1 = e1.Z.d0(context2, resources222, i30);
        c2243l2.f22566p1 = e1.Z.d0(context2, resources222, i18);
        c2243l2.f22528V1 = e1.Z.d0(context2, resources222, i17);
        c2243l2.f22539b2 = e1.Z.d0(context2, resources222, i32);
        c2243l2.f22529V4 = resources222.getString(b0.f22368d);
        c2243l2.f22531W4 = resources222.getString(b0.f22367c);
        c2243l2.f22576x1 = resources222.getString(b0.f22374j);
        c2243l2.f22579y1 = resources222.getString(b0.f22375k);
        c2243l2.f22524T1 = resources222.getString(b0.f22373i);
        c2243l2.f22577x2 = resources222.getString(b0.f22378n);
        c2243l2.f22580y2 = resources222.getString(b0.f22377m);
        e10222.U((ViewGroup) c2243l2.findViewById(X.f22315e), true);
        e10222.U(c2243l2.f22573v, z13);
        e10222.U(c2243l2.f22574w, z12);
        e10222.U(imageView4, z11);
        e10222.U(imageView5, z10);
        e10222.U(imageView9, z16);
        e10222.U(imageView2, z15);
        e10222.U(imageView10, z14);
        e10222.U(imageView8, c2243l2.f22556i5 == 0);
        c2243l2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.k
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i552, int i562, int i572, int i58, int i59, int i60, int i61, int i62) {
                C2243l.this.q0(view3, i552, i562, i572, i58, i59, i60, i61, i62);
            }
        });
    }

    public static void A0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static boolean Z(InterfaceC2341J interfaceC2341J, AbstractC2346O.c cVar) {
        AbstractC2346O I10;
        int p10;
        if (!interfaceC2341J.E(17) || (p10 = (I10 = interfaceC2341J.I()).p()) <= 1 || p10 > 100) {
            return false;
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if (I10.n(i10, cVar).f24389m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int d0(TypedArray typedArray, int i10) {
        return typedArray.getInt(d0.f22394B, i10);
    }

    public static void h0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    public static boolean l0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J == null || !interfaceC2341J.E(13)) {
            return;
        }
        InterfaceC2341J interfaceC2341J2 = this.f22532X4;
        interfaceC2341J2.e(interfaceC2341J2.d().b(f10));
    }

    public void B0(boolean z10) {
        if (this.f22534Z4 == z10) {
            return;
        }
        this.f22534Z4 = z10;
        z0(this.f22507D, z10);
        z0(this.f22508E, z10);
        d dVar = this.f22533Y4;
        if (dVar != null) {
            dVar.G(z10);
        }
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (n0() && this.f22536a5) {
            InterfaceC2341J interfaceC2341J = this.f22532X4;
            if (interfaceC2341J != null) {
                z10 = (this.f22540b5 && Z(interfaceC2341J, this.f22520R)) ? interfaceC2341J.E(10) : interfaceC2341J.E(5);
                z12 = interfaceC2341J.E(7);
                z13 = interfaceC2341J.E(11);
                z14 = interfaceC2341J.E(12);
                z11 = interfaceC2341J.E(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (z13) {
                H0();
            }
            if (z14) {
                y0();
            }
            x0(z12, this.f22570s);
            x0(z13, this.f22574w);
            x0(z14, this.f22573v);
            x0(z11, this.f22571t);
            l0 l0Var = this.f22514K;
            if (l0Var != null) {
                l0Var.setEnabled(z10);
            }
        }
    }

    public final void D0() {
        if (n0() && this.f22536a5 && this.f22572u != null) {
            boolean x12 = e1.Z.x1(this.f22532X4, this.f22542c5);
            Drawable drawable = x12 ? this.f22527V : this.f22530W;
            int i10 = x12 ? b0.f22371g : b0.f22370f;
            this.f22572u.setImageDrawable(drawable);
            this.f22572u.setContentDescription(this.f22537b.getString(i10));
            x0(e1.Z.w1(this.f22532X4), this.f22572u);
        }
    }

    public final void E0() {
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J == null) {
            return;
        }
        this.f22562m.g(interfaceC2341J.d().f24315a);
        this.f22561l.f(0, this.f22562m.d());
        I0();
    }

    public final void F0() {
        long j10;
        long j11;
        if (n0() && this.f22536a5) {
            InterfaceC2341J interfaceC2341J = this.f22532X4;
            if (interfaceC2341J == null || !interfaceC2341J.E(16)) {
                j10 = 0;
                j11 = 0;
            } else {
                j10 = this.f22558j5 + interfaceC2341J.d0();
                j11 = this.f22558j5 + interfaceC2341J.n0();
            }
            TextView textView = this.f22513J;
            if (textView != null && !this.f22546e5) {
                textView.setText(e1.Z.u0(this.f22515L, this.f22516O, j10));
            }
            l0 l0Var = this.f22514K;
            if (l0Var != null) {
                l0Var.setPosition(j10);
                l0 l0Var2 = this.f22514K;
                if (m0(interfaceC2341J)) {
                    j11 = j10;
                }
                l0Var2.setBufferedPosition(j11);
            }
            removeCallbacks(this.f22523T);
            int g02 = interfaceC2341J == null ? 1 : interfaceC2341J.g0();
            if (interfaceC2341J == null || !interfaceC2341J.isPlaying()) {
                if (g02 == 4 || g02 == 1) {
                    return;
                }
                postDelayed(this.f22523T, 1000L);
                return;
            }
            l0 l0Var3 = this.f22514K;
            long min = Math.min(l0Var3 != null ? l0Var3.getPreferredUpdateDelay() : 1000L, 1000 - (j10 % 1000));
            float f10 = interfaceC2341J.d().f24315a;
            postDelayed(this.f22523T, e1.Z.p(f10 > 0.0f ? (long) (min / f10) : 1000L, this.f22554h5, 1000L));
        }
    }

    public final void G0() {
        ImageView imageView;
        if (n0() && this.f22536a5 && (imageView = this.f22581z) != null) {
            if (this.f22556i5 == 0) {
                x0(false, imageView);
                return;
            }
            InterfaceC2341J interfaceC2341J = this.f22532X4;
            if (interfaceC2341J == null || !interfaceC2341J.E(15)) {
                x0(false, this.f22581z);
                this.f22581z.setImageDrawable(this.f22538b1);
                this.f22581z.setContentDescription(this.f22576x1);
                return;
            }
            x0(true, this.f22581z);
            int l02 = interfaceC2341J.l0();
            if (l02 == 0) {
                this.f22581z.setImageDrawable(this.f22538b1);
                this.f22581z.setContentDescription(this.f22576x1);
            } else if (l02 == 1) {
                this.f22581z.setImageDrawable(this.f22550g1);
                this.f22581z.setContentDescription(this.f22579y1);
            } else {
                if (l02 != 2) {
                    return;
                }
                this.f22581z.setImageDrawable(this.f22566p1);
                this.f22581z.setContentDescription(this.f22524T1);
            }
        }
    }

    public final void H0() {
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        int r02 = (int) ((interfaceC2341J != null ? interfaceC2341J.r0() : 5000L) / 1000);
        TextView textView = this.f22578y;
        if (textView != null) {
            textView.setText(String.valueOf(r02));
        }
        View view = this.f22574w;
        if (view != null) {
            view.setContentDescription(this.f22537b.getQuantityString(a0.f22352b, r02, Integer.valueOf(r02)));
        }
    }

    public final void I0() {
        x0(this.f22561l.c(), this.f22509F);
    }

    public final void J0() {
        this.f22559k.measure(0, 0);
        this.f22568q.setWidth(Math.min(this.f22559k.getMeasuredWidth(), getWidth() - (this.f22569r * 2)));
        this.f22568q.setHeight(Math.min(getHeight() - (this.f22569r * 2), this.f22559k.getMeasuredHeight()));
    }

    public final void K0() {
        ImageView imageView;
        if (n0() && this.f22536a5 && (imageView = this.f22504A) != null) {
            InterfaceC2341J interfaceC2341J = this.f22532X4;
            if (!this.f22535a.A(imageView)) {
                x0(false, this.f22504A);
                return;
            }
            if (interfaceC2341J == null || !interfaceC2341J.E(14)) {
                x0(false, this.f22504A);
                this.f22504A.setImageDrawable(this.f22539b2);
                this.f22504A.setContentDescription(this.f22580y2);
            } else {
                x0(true, this.f22504A);
                this.f22504A.setImageDrawable(interfaceC2341J.m0() ? this.f22528V1 : this.f22539b2);
                this.f22504A.setContentDescription(interfaceC2341J.m0() ? this.f22577x2 : this.f22580y2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void L0() {
        int i10;
        long j10;
        AbstractC2346O.c cVar;
        long j11;
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J == null) {
            return;
        }
        boolean z10 = true;
        this.f22544d5 = this.f22540b5 && Z(interfaceC2341J, this.f22520R);
        long j12 = 0;
        this.f22558j5 = 0L;
        AbstractC2346O I10 = interfaceC2341J.E(17) ? interfaceC2341J.I() : AbstractC2346O.f24345a;
        long j13 = -9223372036854775807L;
        if (I10.q()) {
            if (interfaceC2341J.E(16)) {
                long W10 = interfaceC2341J.W();
                if (W10 != -9223372036854775807L) {
                    j10 = e1.Z.a1(W10);
                    i10 = 0;
                }
            }
            i10 = 0;
            j10 = 0;
        } else {
            int h02 = interfaceC2341J.h0();
            boolean z11 = this.f22544d5;
            int i11 = z11 ? 0 : h02;
            int p10 = z11 ? I10.p() - 1 : h02;
            i10 = 0;
            long j14 = 0;
            while (true) {
                if (i11 > p10) {
                    break;
                }
                if (i11 == h02) {
                    this.f22558j5 = e1.Z.J1(j14);
                }
                I10.n(i11, this.f22520R);
                AbstractC2346O.c cVar2 = this.f22520R;
                boolean z12 = z10;
                long j15 = j12;
                if (cVar2.f24389m == j13) {
                    AbstractC4134a.g(this.f22544d5 ^ z12);
                    break;
                }
                int i12 = cVar2.f24390n;
                while (true) {
                    cVar = this.f22520R;
                    if (i12 <= cVar.f24391o) {
                        I10.f(i12, this.f22517P);
                        int p11 = this.f22517P.p();
                        int c10 = this.f22517P.c();
                        while (p11 < c10) {
                            long f10 = this.f22517P.f(p11);
                            if (f10 == Long.MIN_VALUE) {
                                j11 = j13;
                                long j16 = this.f22517P.f24357d;
                                if (j16 == j11) {
                                    p11++;
                                    j13 = j11;
                                } else {
                                    f10 = j16;
                                }
                            } else {
                                j11 = j13;
                            }
                            long o10 = f10 + this.f22517P.o();
                            if (o10 >= j15) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i10 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z12 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, (int) length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, (int) length);
                                }
                                this.adGroupTimesMs[i10] = e1.Z.J1(j14 + o10);
                                this.playedAdGroups[i10] = this.f22517P.q(p11);
                                i10++;
                            }
                            p11++;
                            j13 = j11;
                        }
                        i12++;
                    }
                }
                j14 += cVar.f24389m;
                i11++;
                z10 = z12;
                j12 = j15;
            }
            j10 = j14;
        }
        long J12 = e1.Z.J1(j10);
        TextView textView = this.f22512I;
        if (textView != null) {
            textView.setText(e1.Z.u0(this.f22515L, this.f22516O, J12));
        }
        l0 l0Var = this.f22514K;
        if (l0Var != null) {
            l0Var.setDuration(J12);
            int length2 = this.extraAdGroupTimesMs.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i13 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i13);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i13);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i10, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i10, length2);
            this.f22514K.b(this.adGroupTimesMs, this.playedAdGroups, i13);
        }
        F0();
    }

    public final void M0() {
        g0();
        x0(this.f22563n.getItemCount() > 0, this.f22506C);
        I0();
    }

    public void Y(m mVar) {
        AbstractC4134a.e(mVar);
        this.f22557j.add(mVar);
    }

    public boolean a0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J == null || !l0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC2341J.g0() == 4 || !interfaceC2341J.E(12)) {
                return true;
            }
            interfaceC2341J.o0();
            return true;
        }
        if (keyCode == 89 && interfaceC2341J.E(11)) {
            interfaceC2341J.p0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            e1.Z.E0(interfaceC2341J, this.f22542c5);
            return true;
        }
        if (keyCode == 87) {
            if (!interfaceC2341J.E(9)) {
                return true;
            }
            interfaceC2341J.L();
            return true;
        }
        if (keyCode == 88) {
            if (!interfaceC2341J.E(7)) {
                return true;
            }
            interfaceC2341J.u();
            return true;
        }
        if (keyCode == 126) {
            e1.Z.D0(interfaceC2341J);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        e1.Z.C0(interfaceC2341J);
        return true;
    }

    public final void b0(RecyclerView.h hVar, View view) {
        this.f22559k.setAdapter(hVar);
        J0();
        this.f22560k5 = false;
        this.f22568q.dismiss();
        this.f22560k5 = true;
        this.f22568q.showAsDropDown(view, (getWidth() - this.f22568q.getWidth()) - this.f22569r, (-this.f22568q.getHeight()) - this.f22569r);
    }

    public final AbstractC3445z c0(b1.T t10, int i10) {
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        AbstractC3445z a10 = t10.a();
        for (int i11 = 0; i11 < a10.size(); i11++) {
            T.a aVar2 = (T.a) a10.get(i11);
            if (aVar2.d() == i10) {
                for (int i12 = 0; i12 < aVar2.f24518a; i12++) {
                    if (aVar2.i(i12)) {
                        androidx.media3.common.a b10 = aVar2.b(i12);
                        if ((b10.f20533e & 2) == 0) {
                            aVar.a(new k(t10, i11, i12, this.f22565p.a(b10)));
                        }
                    }
                }
            }
        }
        return aVar.m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.f22535a.C();
    }

    public void f0() {
        this.f22535a.F();
    }

    public final void g0() {
        this.f22563n.d();
        this.f22564o.d();
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J != null && interfaceC2341J.E(30) && this.f22532X4.E(29)) {
            b1.T z10 = this.f22532X4.z();
            this.f22564o.k(c0(z10, 1));
            if (this.f22535a.A(this.f22506C)) {
                this.f22563n.j(c0(z10, 3));
            } else {
                this.f22563n.j(AbstractC3445z.t());
            }
        }
    }

    public InterfaceC2341J getPlayer() {
        return this.f22532X4;
    }

    public int getRepeatToggleModes() {
        return this.f22556i5;
    }

    public boolean getShowShuffleButton() {
        return this.f22535a.A(this.f22504A);
    }

    public boolean getShowSubtitleButton() {
        return this.f22535a.A(this.f22506C);
    }

    public int getShowTimeoutMs() {
        return this.f22548f5;
    }

    public boolean getShowVrButton() {
        return this.f22535a.A(this.f22505B);
    }

    public final boolean i0(InterfaceC2341J interfaceC2341J) {
        Class cls;
        return (interfaceC2341J == null || (cls = this.f22549g) == null || !cls.isAssignableFrom(interfaceC2341J.getClass())) ? false : true;
    }

    public final boolean j0(InterfaceC2341J interfaceC2341J) {
        Class cls;
        return (interfaceC2341J == null || (cls = this.f22543d) == null || !cls.isAssignableFrom(interfaceC2341J.getClass())) ? false : true;
    }

    public boolean k0() {
        return this.f22535a.I();
    }

    public final boolean m0(InterfaceC2341J interfaceC2341J) {
        try {
            if (j0(interfaceC2341J) && ((Boolean) AbstractC4134a.e(((Method) AbstractC4134a.e(this.f22547f)).invoke(interfaceC2341J, null))).booleanValue()) {
                return true;
            }
            if (i0(interfaceC2341J)) {
                return ((Boolean) AbstractC4134a.e(((Method) AbstractC4134a.e(this.f22555i)).invoke(interfaceC2341J, null))).booleanValue();
            }
            return false;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    public boolean n0() {
        return getVisibility() == 0;
    }

    public void o0() {
        Iterator it = this.f22557j.iterator();
        while (it.hasNext()) {
            ((m) it.next()).m(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22535a.K();
        this.f22536a5 = true;
        if (k0()) {
            this.f22535a.S();
        }
        w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22535a.L();
        this.f22536a5 = false;
        removeCallbacks(this.f22523T);
        this.f22535a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22535a.M(z10, i10, i11, i12, i13);
    }

    public final void p0(View view) {
        B0(!this.f22534Z4);
    }

    public final void q0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f22568q.isShowing()) {
            J0();
            this.f22568q.update(view, (getWidth() - this.f22568q.getWidth()) - this.f22569r, (-this.f22568q.getHeight()) - this.f22569r, -1, -1);
        }
    }

    public final void r0(int i10) {
        if (i10 == 0) {
            b0(this.f22562m, (View) AbstractC4134a.e(this.f22509F));
        } else if (i10 == 1) {
            b0(this.f22564o, (View) AbstractC4134a.e(this.f22509F));
        } else {
            this.f22568q.dismiss();
        }
    }

    public void s0(m mVar) {
        this.f22557j.remove(mVar);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22535a.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f22533Y4 = dVar;
        A0(this.f22507D, dVar != null);
        A0(this.f22508E, dVar != null);
    }

    public void setPlayer(InterfaceC2341J interfaceC2341J) {
        AbstractC4134a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC4134a.a(interfaceC2341J == null || interfaceC2341J.J() == Looper.getMainLooper());
        InterfaceC2341J interfaceC2341J2 = this.f22532X4;
        if (interfaceC2341J2 == interfaceC2341J) {
            return;
        }
        if (interfaceC2341J2 != null) {
            interfaceC2341J2.v(this.f22541c);
        }
        this.f22532X4 = interfaceC2341J;
        if (interfaceC2341J != null) {
            interfaceC2341J.p(this.f22541c);
        }
        w0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f22556i5 = i10;
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        if (interfaceC2341J != null && interfaceC2341J.E(15)) {
            int l02 = this.f22532X4.l0();
            if (i10 == 0 && l02 != 0) {
                this.f22532X4.i0(0);
            } else if (i10 == 1 && l02 == 2) {
                this.f22532X4.i0(1);
            } else if (i10 == 2 && l02 == 1) {
                this.f22532X4.i0(2);
            }
        }
        this.f22535a.U(this.f22581z, i10 != 0);
        G0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f22535a.U(this.f22573v, z10);
        C0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f22540b5 = z10;
        L0();
    }

    public void setShowNextButton(boolean z10) {
        this.f22535a.U(this.f22571t, z10);
        C0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f22542c5 = z10;
        D0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f22535a.U(this.f22570s, z10);
        C0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f22535a.U(this.f22574w, z10);
        C0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f22535a.U(this.f22504A, z10);
        K0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f22535a.U(this.f22506C, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f22548f5 = i10;
        if (k0()) {
            this.f22535a.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f22535a.U(this.f22505B, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f22554h5 = e1.Z.o(i10, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        this.f22552g5 = z10;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f22505B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            x0(onClickListener != null, this.f22505B);
        }
    }

    public void t0() {
        ImageView imageView = this.f22572u;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public final void u0(InterfaceC2341J interfaceC2341J, long j10) {
        if (this.f22544d5) {
            if (interfaceC2341J.E(17) && interfaceC2341J.E(10)) {
                AbstractC2346O I10 = interfaceC2341J.I();
                int p10 = I10.p();
                int i10 = 0;
                while (true) {
                    long d10 = I10.n(i10, this.f22520R).d();
                    if (j10 < d10) {
                        break;
                    }
                    if (i10 == p10 - 1) {
                        j10 = d10;
                        break;
                    } else {
                        j10 -= d10;
                        i10++;
                    }
                }
                interfaceC2341J.Q(i10, j10);
            }
        } else if (interfaceC2341J.E(5)) {
            interfaceC2341J.seekTo(j10);
        }
        F0();
    }

    public void v0() {
        this.f22535a.X();
    }

    public void w0() {
        D0();
        C0();
        G0();
        K0();
        M0();
        E0();
        L0();
    }

    public final void x0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f22551g2 : this.f22567p2);
    }

    public final void y0() {
        InterfaceC2341J interfaceC2341J = this.f22532X4;
        int c02 = (int) ((interfaceC2341J != null ? interfaceC2341J.c0() : 15000L) / 1000);
        TextView textView = this.f22575x;
        if (textView != null) {
            textView.setText(String.valueOf(c02));
        }
        View view = this.f22573v;
        if (view != null) {
            view.setContentDescription(this.f22537b.getQuantityString(a0.f22351a, c02, Integer.valueOf(c02)));
        }
    }

    public final void z0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f22525T4);
            imageView.setContentDescription(this.f22529V4);
        } else {
            imageView.setImageDrawable(this.f22526U4);
            imageView.setContentDescription(this.f22531W4);
        }
    }
}
