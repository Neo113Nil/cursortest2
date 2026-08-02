package com.vk.voip.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.log.L;
import com.vk.voip.ui.VoipViewBehaviour;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.asp;
import xsna.bwt0;
import xsna.c3k0;
import xsna.gb9;
import xsna.gzs;
import xsna.i1f;
import xsna.j5g;
import xsna.qj80;
import xsna.s3q0;
import xsna.smk0;
import xsna.u7v0;
import xsna.woo;
import xsna.zrp;

/* compiled from: VoipViewBehaviour.kt */
/* loaded from: classes7.dex */
public final class VoipViewBehaviour {
    public final FrameLayout a;
    public final View b;
    public final View c;
    public final boolean d;
    public final gb9 e;
    public final a f;
    public float g;
    public final float h;
    public float i;
    public final float j;
    public u7v0 k;
    public gzs<s3q0> l;
    public gzs<s3q0> m;
    public gzs<s3q0> n;
    public gzs<s3q0> o;
    public final ArrayList p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipViewBehaviour.kt */
    public static final class Attractor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Attractor[] $VALUES;
        public static final Attractor BottomLeft;
        public static final Attractor BottomRight;
        public static final Attractor TopLeft;
        public static final Attractor TopRight;

        static {
            Attractor attractor = new Attractor("TopLeft", 0);
            TopLeft = attractor;
            Attractor attractor2 = new Attractor("TopRight", 1);
            TopRight = attractor2;
            Attractor attractor3 = new Attractor("BottomLeft", 2);
            BottomLeft = attractor3;
            Attractor attractor4 = new Attractor("BottomRight", 3);
            BottomRight = attractor4;
            Attractor[] attractorArr = {attractor, attractor2, attractor3, attractor4};
            $VALUES = attractorArr;
            $ENTRIES = new asp(attractorArr);
        }

        public Attractor() {
            throw null;
        }

        public static Attractor valueOf(String str) {
            return (Attractor) Enum.valueOf(Attractor.class, str);
        }

        public static Attractor[] values() {
            return (Attractor[]) $VALUES.clone();
        }
    }

    /* compiled from: VoipViewBehaviour.kt */
    public static final class a {
        public boolean a;
        public Attractor b;
    }

    /* compiled from: VoipViewBehaviour.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attractor.values().length];
            try {
                iArr[Attractor.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Attractor.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Attractor.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Attractor.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: View.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ VoipViewBehaviour b;

        public c(FrameLayout frameLayout, VoipViewBehaviour voipViewBehaviour) {
            this.b = voipViewBehaviour;
        }

        @Override // java.lang.Runnable
        public final void run() {
            VoipViewBehaviour voipViewBehaviour = this.b;
            a aVar = voipViewBehaviour.f;
            if (aVar.a) {
                return;
            }
            aVar.a = true;
            voipViewBehaviour.a();
            gzs<s3q0> gzsVar = voipViewBehaviour.l;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public VoipViewBehaviour(FrameLayout frameLayout, View view, float f, View view2, boolean z, gb9 gb9Var) {
        this.a = frameLayout;
        this.b = view;
        this.c = view2;
        this.d = z;
        this.e = gb9Var;
        a aVar = new a();
        aVar.b = Attractor.TopRight;
        this.f = aVar;
        this.j = f;
        this.i = f;
        this.h = f;
        this.g = f;
        view.setOnClickListener(new i1f(this, 14));
        view.setOnTouchListener(new com.vk.voip.ui.b(this));
        this.p = new ArrayList();
    }

    public static float d(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public final void a() {
        a aVar = this.f;
        if (aVar.a) {
            Pair<Float, Float> b2 = b(aVar.b);
            Float i = b2.i();
            Float j = b2.j();
            float g = g();
            c();
            FrameLayout frameLayout = this.a;
            if (i != null) {
                smk0 smk0Var = new smk0(frameLayout, woo.m, i.floatValue());
                smk0Var.u.b(200.0f);
                smk0Var.u.a(0.75f);
                j(smk0Var);
                smk0Var.h();
            }
            if (j != null) {
                smk0 smk0Var2 = new smk0(frameLayout, woo.n, j.floatValue());
                smk0Var2.u.b(200.0f);
                smk0Var2.u.a(0.75f);
                j(smk0Var2);
                smk0Var2.h();
            }
            smk0 smk0Var3 = new smk0(frameLayout, woo.o, g);
            smk0Var3.u.b(200.0f);
            smk0Var3.u.a(0.75f);
            j(smk0Var3);
            smk0Var3.h();
            smk0 smk0Var4 = new smk0(frameLayout, woo.p, g);
            smk0Var4.u.b(200.0f);
            smk0Var4.u.a(0.75f);
            j(smk0Var4);
            smk0Var4.h();
        }
    }

    public final Pair<Float, Float> b(Attractor attractor) {
        View view = this.c;
        float height = view.getHeight();
        float width = view.getWidth();
        int i = b.$EnumSwitchMapping$0[attractor.ordinal()];
        float f = this.j;
        if (i == 1) {
            this.f.getClass();
            Float valueOf = Float.valueOf((((g() * f()) - width) * 0.5f) + f);
            this.f.getClass();
            return new Pair<>(valueOf, Float.valueOf((((g() * e()) - height) * 0.5f) + this.g));
        }
        float f2 = this.h;
        if (i == 2) {
            this.f.getClass();
            Float valueOf2 = Float.valueOf(((width - (g() * f())) * 0.5f) - f2);
            this.f.getClass();
            return new Pair<>(valueOf2, Float.valueOf((((g() * e()) - height) * 0.5f) + this.g));
        }
        if (i == 3) {
            this.f.getClass();
            Float valueOf3 = Float.valueOf((((g() * f()) - width) * 0.5f) + f);
            this.f.getClass();
            return new Pair<>(valueOf3, Float.valueOf(((height - (g() * e())) * 0.5f) - this.i));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.f.getClass();
        Float valueOf4 = Float.valueOf(((width - (g() * f())) * 0.5f) - f2);
        this.f.getClass();
        return new Pair<>(valueOf4, Float.valueOf(((height - (g() * e())) * 0.5f) - this.i));
    }

    public final void c() {
        ArrayList arrayList = this.p;
        List O0 = j5g.O0(arrayList);
        arrayList.clear();
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            ((smk0) it.next()).d();
        }
    }

    public final float e() {
        return this.a.getHeight();
    }

    public final float f() {
        return this.a.getWidth();
    }

    public final float g() {
        return f() / e() > 1.0f ? 0.333f : 0.25f;
    }

    public final void h() {
        c();
        boolean z = this.d;
        FrameLayout frameLayout = this.a;
        if (z) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
            frameLayout.requestLayout();
        }
        gzs<s3q0> gzsVar = this.m;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        bwt0.T(frameLayout, new c3k0(this, 24));
    }

    public final void i() {
        c();
        boolean z = this.d;
        FrameLayout frameLayout = this.a;
        if (z) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            frameLayout.requestLayout();
        }
        u7v0 u7v0Var = this.k;
        if (u7v0Var != null) {
            u7v0Var.invoke();
        }
        L.A("VoipViewBehaviour", "minimizeView, isMinimized=" + this.f.a + " current maximizedWidth=" + f() + ", maximizedHeight=" + e());
        qj80.a(frameLayout, new c(frameLayout, this));
    }

    public final void j(smk0 smk0Var) {
        this.p.add(smk0Var);
        smk0Var.b(new woo.k() { // from class: xsna.q3x0
            @Override // xsna.woo.k
            public final void a(woo wooVar, boolean z, float f, float f2) {
                ttp0.a(VoipViewBehaviour.this.p).remove(wooVar);
            }
        });
    }
}
