package com.vk.im.ui.components.dialog_header;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewStub;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.afm;
import xsna.asp;
import xsna.awt0;
import xsna.dfm;
import xsna.epx;
import xsna.f9w;
import xsna.gfm;
import xsna.imv;
import xsna.jbs;
import xsna.kkm;
import xsna.ltk0;
import xsna.mem;
import xsna.ms;
import xsna.mxv;
import xsna.o25;
import xsna.s2n0;
import xsna.sdm;
import xsna.u90;
import xsna.uem;
import xsna.vtt0;
import xsna.xey;
import xsna.z8m;
import xsna.zrp;
import xsna.zsk0;

/* compiled from: DialogHeaderController.kt */
/* loaded from: classes2.dex */
public final class DialogHeaderController implements xey.a {
    public final ChatFragment.g b;
    public final boolean c;
    public final a d;
    public final Context e;
    public final afm f;
    public final sdm g;
    public final mem h;
    public final uem i;
    public Screen j;
    public gfm k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogHeaderController.kt */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen ACTIONS;
        public static final Screen EDIT;
        public static final Screen INFO;

        static {
            Screen screen = new Screen("INFO", 0);
            INFO = screen;
            Screen screen2 = new Screen("ACTIONS", 1);
            ACTIONS = screen2;
            Screen screen3 = new Screen("EDIT", 2);
            EDIT = screen3;
            Screen[] screenArr = {screen, screen2, screen3};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        public Screen() {
            throw null;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* compiled from: DialogHeaderController.kt */
    public static final class a {
        public final a1w a;
        public final mxv b;
        public final u90 c;
        public final kkm d;
        public final com.vk.im.chat.onlines.api.a e;
        public final s2n0 f;
        public final MaxRedirectHandler g;

        public a(a1w a1wVar, mxv mxvVar, jbs jbsVar, kkm kkmVar, com.vk.im.chat.onlines.api.a aVar, s2n0 s2n0Var, MaxRedirectHandler maxRedirectHandler) {
            this.a = a1wVar;
            this.b = mxvVar;
            this.c = jbsVar;
            this.d = kkmVar;
            this.e = aVar;
            this.f = s2n0Var;
            this.g = maxRedirectHandler;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DialogHeaderControllerDependencies(engine=" + this.a + ", imBridge=" + this.b + ", launcher=" + this.c + ", themeBinder=" + this.d + ", chatOnlineMembersLoader=" + this.e + ", successRateReporter=" + this.f + ", maxRedirectHandler=" + this.g + ')';
        }
    }

    /* compiled from: DialogHeaderController.kt */
    public final class b {
        public b() {
        }

        public final void a() {
            DialogHeaderController.this.m(EmptyList.b);
        }
    }

    /* compiled from: DialogHeaderController.kt */
    public final class c {
        public c() {
        }
    }

    /* compiled from: DialogHeaderController.kt */
    public final class d {
        public d() {
        }
    }

    /* compiled from: DialogHeaderController.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.values().length];
            try {
                iArr[Screen.ACTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DialogHeaderController(DialogExt dialogExt, ChatFragment.g gVar, boolean z, int i, a aVar) {
        long j = dialogExt.e;
        this.b = gVar;
        this.c = z;
        this.d = aVar;
        Context B = aVar.c.B();
        this.e = B;
        a1w a1wVar = aVar.a;
        afm afmVar = new afm(a1wVar, aVar.b, aVar.c, aVar.d, z, i, aVar.e, aVar.f, a1wVar.r().O.x(), aVar.g);
        this.f = afmVar;
        sdm sdmVar = new sdm();
        this.g = sdmVar;
        mem memVar = new mem(B, a1wVar, aVar.d, sdmVar);
        this.h = memVar;
        uem uemVar = new uem();
        this.i = uemVar;
        this.j = Screen.INFO;
        ms i2 = o25.a().i();
        afmVar.E = new d();
        boolean z2 = false;
        boolean z3 = i2.J && i != 2;
        zsk0 zsk0Var = afmVar.D;
        if (zsk0Var.n != z3) {
            zsk0Var.n = z3;
            afmVar.a1();
        }
        if (i2.K && !dialogExt.j) {
            z2 = true;
        }
        if (zsk0Var.o != z2) {
            zsk0Var.o = z2;
            dfm dfmVar = afmVar.z;
            if (dfmVar != null) {
                dfmVar.r(z2);
            }
        }
        if (zsk0Var.a) {
            afmVar.g1();
        }
        afmVar.f1(j, dialogExt);
        memVar.t = new b();
        if (memVar.r.a) {
            memVar.n.e();
            memVar.r = new ltk0();
            memVar.b1();
        }
        memVar.Z0(j);
        uemVar.i = new c();
    }

    public final void a(DisableableRelativeLayout disableableRelativeLayout) {
        this.k = new gfm(this.f, this.h, this.g, this.i, disableableRelativeLayout);
        p(false);
    }

    public final void b() {
        afm afmVar = this.f;
        afmVar.E = null;
        afmVar.G0();
        mem memVar = this.h;
        memVar.t = null;
        memVar.G0();
        this.g.G0();
        uem uemVar = this.i;
        uemVar.i = null;
        uemVar.G0();
    }

    @Override // xsna.xey.a
    public final void c() {
        gfm gfmVar = this.k;
        if (gfmVar != null) {
            gfmVar.a().setElevation(2.0f);
        }
    }

    @Override // xsna.xey.a
    public final void d() {
        gfm gfmVar = this.k;
        if (gfmVar != null) {
            gfmVar.a().setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void f() {
        gfm gfmVar = this.k;
        if (gfmVar != null) {
            gfmVar.a.H0();
            gfmVar.b.H0();
            gfmVar.c.H0();
            gfmVar.d.H0();
        }
        this.k = null;
    }

    public final boolean g() {
        int i = e.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            m(EmptyList.b);
            return true;
        }
        if (i != 2) {
            return false;
        }
        r();
        return true;
    }

    public final void h(Configuration configuration) {
        this.f.K0(configuration);
        this.h.c1();
        this.i.getClass();
    }

    public final void i(long j) {
        f9w f9wVar = afm.F;
        afm afmVar = this.f;
        if (afmVar.D.a) {
            afmVar.g1();
        }
        afmVar.f1(j, null);
        mem memVar = this.h;
        if (memVar.r.a) {
            memVar.n.e();
            memVar.r = new ltk0();
            memVar.b1();
        }
        memVar.Z0(j);
    }

    public final void j(boolean z) {
        afm afmVar = this.f;
        afmVar.D.k = z;
        afmVar.d1();
    }

    public final void k(z8m z8mVar) {
        afm afmVar = this.f;
        afmVar.D.l = z8mVar;
        afmVar.d1();
    }

    public final void l(boolean z) {
        mem memVar = this.h;
        memVar.r.j = z;
        memVar.b1();
    }

    public final void m(List<? extends Msg> list) {
        if (!list.isEmpty()) {
            mem memVar = this.h;
            memVar.r.f = list;
            memVar.b1();
            Screen screen = this.j;
            Screen screen2 = Screen.ACTIONS;
            if (screen != screen2) {
                this.j = screen2;
                p(true);
                return;
            }
            return;
        }
        com.vk.im.ui.components.msg_list.a aVar = ChatFragment.this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.i1();
        Screen screen3 = this.j;
        Screen screen4 = Screen.INFO;
        if (screen3 != screen4) {
            this.j = screen4;
            p(true);
        }
    }

    public final void n(boolean z) {
        afm afmVar = this.f;
        zsk0 zsk0Var = afmVar.D;
        if (zsk0Var.j != z) {
            zsk0Var.j = z;
            dfm dfmVar = afmVar.z;
            if (dfmVar != null) {
                dfmVar.i(z);
            }
        }
    }

    public final void o() {
        Screen screen = this.j;
        Screen screen2 = Screen.EDIT;
        if (screen != screen2) {
            this.j = screen2;
            p(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void p(boolean z) {
        Screen screen = this.j;
        ChatFragment chatFragment = ChatFragment.this;
        imv imvVar = chatFragment.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.o(screen != Screen.ACTIONS);
        if (chatFragment.qo()) {
            int i = ChatFragment.g.a.$EnumSwitchMapping$0[screen.ordinal()];
            if (i == 1) {
                DisableableRelativeLayout disableableRelativeLayout = chatFragment.T0;
                if (disableableRelativeLayout == null) {
                    disableableRelativeLayout = null;
                }
                awt0.u(disableableRelativeLayout.findViewById(R.id.write_area), false);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                DisableableRelativeLayout disableableRelativeLayout2 = chatFragment.T0;
                if (disableableRelativeLayout2 == null) {
                    disableableRelativeLayout2 = null;
                }
                awt0.u(disableableRelativeLayout2.findViewById(R.id.write_area), true);
            }
        }
        int i2 = e.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i2 == 1) {
            gfm gfmVar = this.k;
            if (gfmVar != null) {
                if (gfmVar.a.d) {
                    ((vtt0) gfmVar.j.getValue()).d(z);
                }
                sdm sdmVar = gfmVar.c;
                ViewStub viewStub = (ViewStub) gfmVar.h.getValue();
                if (!sdmVar.d) {
                    sdmVar.D0(gfmVar.a().getContext(), gfmVar.a(), viewStub, null);
                    sdmVar.V0();
                }
                vtt0.g((vtt0) gfmVar.l.getValue(), z);
                mem memVar = gfmVar.b;
                ViewStub viewStub2 = (ViewStub) gfmVar.g.getValue();
                if (!memVar.d) {
                    memVar.D0(gfmVar.a().getContext(), gfmVar.a(), viewStub2, null);
                    memVar.V0();
                }
                vtt0.g((vtt0) gfmVar.k.getValue(), z);
                if (gfmVar.d.d) {
                    ((vtt0) gfmVar.m.getValue()).d(z);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 2) {
            gfm gfmVar2 = this.k;
            if (gfmVar2 != null) {
                if (gfmVar2.a.d) {
                    ((vtt0) gfmVar2.j.getValue()).d(z);
                }
                if (gfmVar2.b.d) {
                    ((vtt0) gfmVar2.k.getValue()).d(z);
                }
                if (gfmVar2.c.d) {
                    ((vtt0) gfmVar2.l.getValue()).d(z);
                }
                uem uemVar = gfmVar2.d;
                ViewStub viewStub3 = (ViewStub) gfmVar2.i.getValue();
                if (!uemVar.d) {
                    uemVar.D0(gfmVar2.a().getContext(), gfmVar2.a(), viewStub3, null);
                    uemVar.V0();
                }
                vtt0.g((vtt0) gfmVar2.m.getValue(), z);
                return;
            }
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        gfm gfmVar3 = this.k;
        if (gfmVar3 != null) {
            afm afmVar = gfmVar3.a;
            ViewStub viewStub4 = (ViewStub) gfmVar3.f.getValue();
            if (!afmVar.d) {
                afmVar.D0(gfmVar3.a().getContext(), gfmVar3.a(), viewStub4, null);
                afmVar.V0();
            }
            vtt0.g((vtt0) gfmVar3.j.getValue(), z);
            if (gfmVar3.b.d) {
                ((vtt0) gfmVar3.k.getValue()).d(z);
            }
            if (gfmVar3.c.d) {
                ((vtt0) gfmVar3.l.getValue()).d(z);
            }
            if (gfmVar3.d.d) {
                ((vtt0) gfmVar3.m.getValue()).d(z);
            }
        }
    }

    public final void q() {
        gfm gfmVar = this.k;
        if (gfmVar != null) {
            gfmVar.a.V0();
            gfmVar.b.V0();
            gfmVar.c.V0();
            gfmVar.d.V0();
        }
    }

    public final void r() {
        ChatFragment chatFragment = ChatFragment.this;
        com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.O0.k(null);
        aVar.T.d();
        imv imvVar = chatFragment.J0;
        (imvVar != null ? imvVar : null).D();
        Screen screen = this.j;
        Screen screen2 = Screen.INFO;
        if (screen != screen2) {
            this.j = screen2;
            p(true);
        }
    }

    public final void s() {
        gfm gfmVar = this.k;
        if (gfmVar != null) {
            gfmVar.a.W0();
            gfmVar.b.W0();
            gfmVar.c.W0();
            gfmVar.d.W0();
        }
    }

    @Override // xsna.xey.a
    public final void e() {
    }
}
