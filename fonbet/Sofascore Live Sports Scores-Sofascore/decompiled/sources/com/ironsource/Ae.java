package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.ll;
import defpackage.ml;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ae implements Cc {

    @NotNull
    public static final Ae a = new Ae();

    @NotNull
    private static final De b = new De();

    private Ae() {
    }

    private final void a(Context context, C4328te c4328te, InterfaceC4292re interfaceC4292re, boolean z) {
        String f = c4328te.f();
        if (f == null || f.length() <= 0) {
            c4328te = new C4328te(c4328te.d(), com.ironsource.mediationsdk.p.g().i(), CollectionsKt.U0(c4328te.e()));
        } else {
            com.ironsource.mediationsdk.p.g().j(c4328te.f());
        }
        com.ironsource.mediationsdk.p g = com.ironsource.mediationsdk.p.g();
        String d = c4328te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4328te.e().toArray(new IronSource.a[0]);
        IronSourceError a2 = g.a(context, d, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 == null || a2.getErrorCode() == 2020) {
            C4436ze.l.a().a(context, c4328te, new a(interfaceC4292re));
            return;
        }
        if (a2.getErrorCode() == 2040) {
            Te d2 = com.ironsource.mediationsdk.p.g().d();
            if (d2 != null) {
                a(new C4185le(new C4346ue(d2), null, null, 6, null), interfaceC4292re);
                return;
            }
        } else if (a2.getErrorCode() == 2030) {
            C4436ze.l.a().d();
            return;
        }
        b.b(new defpackage.r0(5, interfaceC4292re, a2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4328te c4328te, InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        interfaceC4292re.getClass();
        new T9().a(EnumC4310se.LEVEL_PLAY_INIT);
        a.a(context, c4328te, interfaceC4292re, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4328te c4328te, InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        interfaceC4292re.getClass();
        com.ironsource.mediationsdk.p g = com.ironsource.mediationsdk.p.g();
        String d = c4328te.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4328te.e().toArray(new IronSource.a[0]);
        List<IronSource.a> a2 = g.a(context, d, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        a2.getClass();
        c4328te.a(a2);
        new T9().a(EnumC4310se.EXTERNAL_MEDIATION_INIT);
        a.a(context, c4328te, interfaceC4292re, true);
    }

    public final void c(@NotNull Context context, @NotNull C4328te c4328te, @NotNull InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        interfaceC4292re.getClass();
        b.c(new ll(context, c4328te, interfaceC4292re, 1));
    }

    @Override // com.ironsource.Cc
    public void onInitFailed(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        b.c(new defpackage.y2(ironSourceError, 8));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InterfaceC4292re {
        final /* synthetic */ InterfaceC4292re a;

        public a(InterfaceC4292re interfaceC4292re) {
            this.a = interfaceC4292re;
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            Ae.b.b(new defpackage.p3(2, this.a, c4221ne, c4037d9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4185le c4185le, InterfaceC4292re interfaceC4292re) {
            c4185le.getClass();
            interfaceC4292re.getClass();
            Ae.a.a(c4185le, interfaceC4292re);
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4185le c4185le) {
            c4185le.getClass();
            Ae.b.c(new ml(c4185le, this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4292re interfaceC4292re, C4221ne c4221ne, C4037d9 c4037d9) {
            interfaceC4292re.getClass();
            c4221ne.getClass();
            interfaceC4292re.a(c4221ne, c4037d9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Te te) {
        te.getClass();
        C4436ze.l.a().a(new C4346ue(te));
    }

    public final void a(@NotNull Context context, @NotNull C4328te c4328te, @NotNull InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        interfaceC4292re.getClass();
        b.c(new ll(context, c4328te, interfaceC4292re, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4292re interfaceC4292re, IronSourceError ironSourceError) {
        interfaceC4292re.getClass();
        ironSourceError.getClass();
        InterfaceC4292re.a(interfaceC4292re, new C4221ne(ironSourceError), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4185le c4185le, InterfaceC4292re interfaceC4292re) {
        int i = 0;
        if (!com.ironsource.mediationsdk.p.g().a(false, c4185le.d())) {
            b.b(new defpackage.y2(interfaceC4292re, 7));
        } else {
            b.b(new ml(interfaceC4292re, c4185le, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4292re interfaceC4292re) {
        interfaceC4292re.getClass();
        InterfaceC4292re.a(interfaceC4292re, new C4221ne(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4292re interfaceC4292re, C4185le c4185le) {
        interfaceC4292re.getClass();
        c4185le.getClass();
        interfaceC4292re.a(c4185le);
    }

    @Override // com.ironsource.Cc
    public void a(@NotNull Te te) {
        te.getClass();
        b.c(new defpackage.y2(te, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError) {
        ironSourceError.getClass();
        C4436ze.l.a().a(new C4221ne(ironSourceError));
    }
}
