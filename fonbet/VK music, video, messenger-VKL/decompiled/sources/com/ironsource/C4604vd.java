package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.e43;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4604vd implements InterfaceC4622wd {
    private final LevelPlay.AdFormat a;
    private final InterfaceC4586ud b;
    private final A7 c;
    private a d;
    private List<InterfaceC4550sd> e;
    private final int f;

    /* renamed from: com.ironsource.vd$a */
    public enum a {
        None,
        Idle,
        Loading
    }

    /* renamed from: com.ironsource.vd$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.vd$c */
    public static final class c extends Lambda implements izs<Boolean, s3q0> {
        final /* synthetic */ InterfaceC4550sd a;
        final /* synthetic */ C4604vd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4550sd interfaceC4550sd, C4604vd c4604vd) {
            super(1);
            this.a = interfaceC4550sd;
            this.b = c4604vd;
        }

        public final void a(boolean z) {
            if (!z) {
                IronLog.INTERNAL.verbose("adunit \"" + this.a.b() + "\" failed to load, removing");
                this.b.e.remove(this.a);
            }
            this.b.d();
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return s3q0.a;
        }
    }

    public C4604vd(LevelPlay.AdFormat adFormat, InterfaceC4586ud interfaceC4586ud, A7 a7) {
        this.a = adFormat;
        this.b = interfaceC4586ud;
        this.c = a7;
        this.d = a.None;
        this.e = new ArrayList();
        this.f = b();
    }

    private final int c() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.K();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC4550sd e = e();
        if (e == null) {
            this.d = a.Idle;
        } else {
            this.d = a.Loading;
            e.a(new c(e, this));
        }
    }

    private final InterfaceC4550sd e() {
        Object obj;
        if (!a()) {
            IronLog.INTERNAL.verbose(this.a + " - reached capacity");
            return null;
        }
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC4550sd) obj).a()) {
                break;
            }
        }
        InterfaceC4550sd interfaceC4550sd = (InterfaceC4550sd) obj;
        if (interfaceC4550sd != null) {
            return interfaceC4550sd;
        }
        IronLog.INTERNAL.verbose(this.a + " - preload done");
        return null;
    }

    private final int b() {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return this.c.i();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.x();
    }

    @Override // com.ironsource.InterfaceC4622wd
    public void a(Va va) {
        if (!this.c.w()) {
            IronLog.INTERNAL.warning(this.a + " - preload is disabled");
            return;
        }
        if (this.d != a.None) {
            IronLog.INTERNAL.warning(this.a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 >= 1) {
            IronLog.INTERNAL.verbose(String.valueOf(this.a));
            this.d = a.Idle;
            this.e = new ArrayList(this.b.a(va.c(this.a), c2, va));
            d();
            return;
        }
        IronLog.INTERNAL.warning(this.a + " - invalid maxParallelLoad: " + c2);
    }

    private final InterfaceC4550sd b(String str) {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((InterfaceC4550sd) obj).b(), str)) {
                break;
            }
        }
        return (InterfaceC4550sd) obj;
    }

    public /* synthetic */ C4604vd(LevelPlay.AdFormat adFormat, InterfaceC4586ud interfaceC4586ud, A7 a7, int i, zcl zclVar) {
        this(adFormat, (i & 2) != 0 ? new C4568td(adFormat) : interfaceC4586ud, (i & 4) != 0 ? Kb.u.d().h() : a7);
    }

    private final boolean a() {
        int i;
        List<InterfaceC4550sd> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((InterfaceC4550sd) it.next()).a() && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC4622wd
    public C4382j6 a(String str) {
        IronLog.INTERNAL.verbose(this.a + " - adunit: \"" + str + "\"");
        InterfaceC4550sd b2 = b(str);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4622wd
    public void a(String str, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.a + " - adunit: \"" + str + "\", didUseInstance: " + z);
        InterfaceC4550sd b2 = b(str);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + str + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == a.Idle) {
            d();
        }
    }
}
