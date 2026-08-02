package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.nu4;
import xsna.qd0;
import xsna.qo2;
import xsna.sla;
import xsna.tv6;
import xsna.vy4;
import xsna.wv6;

/* loaded from: classes13.dex */
public final class Ce implements Dc {
    public static final Ce a = new Ce();
    private static final Fe b = new Fe();

    public static final class a implements InterfaceC4569te {
        final /* synthetic */ InterfaceC4569te a;

        public a(InterfaceC4569te interfaceC4569te) {
            this.a = interfaceC4569te;
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4462ne c4462ne) {
            Ce.b.c(new qo2(2, c4462ne, this.a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4462ne c4462ne, InterfaceC4569te interfaceC4569te) {
            Ce.a.a(c4462ne, interfaceC4569te);
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4498pe c4498pe, C4278d9 c4278d9) {
            Ce.b.b(new wv6(this.a, c4498pe, c4278d9, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC4569te interfaceC4569te, C4498pe c4498pe, C4278d9 c4278d9) {
            interfaceC4569te.a(c4498pe, c4278d9);
        }
    }

    private Ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te) {
        new U9().a(EnumC4587ue.LEVEL_PLAY_INIT);
        a.a(context, c4605ve, interfaceC4569te, false);
    }

    @Override // com.ironsource.Dc
    public void onInitFailed(IronSourceError ironSourceError) {
        b.c(new nu4(ironSourceError, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te) {
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = c4605ve.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4605ve.e().toArray(new IronSource.a[0]);
        c4605ve.a(h.a(context, d, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length)));
        new U9().a(EnumC4587ue.EXTERNAL_MEDIATION_INIT);
        a.a(context, c4605ve, interfaceC4569te, true);
    }

    public final void c(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te) {
        b.c(new vy4(context, c4605ve, interfaceC4569te, 2));
    }

    public final void a(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te) {
        b.c(new sla(context, c4605ve, interfaceC4569te, 0));
    }

    private final void a(Context context, C4605ve c4605ve, InterfaceC4569te interfaceC4569te, boolean z) {
        String f = c4605ve.f();
        if (f != null && f.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c4605ve.f());
        } else {
            c4605ve = new C4605ve(c4605ve.d(), com.ironsource.mediationsdk.p.h().j(), new ArrayList(c4605ve.e()));
        }
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        String d = c4605ve.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c4605ve.e().toArray(new IronSource.a[0]);
        IronSourceError a2 = h.a(context, d, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 != null && a2.getErrorCode() != 2020) {
            if (a2.getErrorCode() == 2040) {
                Ve e = com.ironsource.mediationsdk.p.h().e();
                if (e != null) {
                    a(new C4462ne(new C4623we(e), null, null, 6, null), interfaceC4569te);
                    return;
                }
            } else if (a2.getErrorCode() == 2030) {
                Be.l.a().d();
                return;
            }
            b.b(new xsna.k0(2, interfaceC4569te, a2));
            return;
        }
        Be.l.a().a(context, c4605ve, new a(interfaceC4569te));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ve ve) {
        Be.l.a().a(new C4623we(ve));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4569te interfaceC4569te, IronSourceError ironSourceError) {
        InterfaceC4569te.a(interfaceC4569te, new C4498pe(ironSourceError), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4462ne c4462ne, InterfaceC4569te interfaceC4569te) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c4462ne.d())) {
            b.b(new xsna.vb(interfaceC4569te, 4));
        } else {
            b.b(new tv6(interfaceC4569te, c4462ne, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4569te interfaceC4569te) {
        InterfaceC4569te.a(interfaceC4569te, new C4498pe(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4569te interfaceC4569te, C4462ne c4462ne) {
        interfaceC4569te.a(c4462ne);
    }

    @Override // com.ironsource.Dc
    public void a(Ve ve) {
        b.c(new qd0(ve, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError) {
        Be.l.a().a(new C4498pe(ironSourceError));
    }
}
