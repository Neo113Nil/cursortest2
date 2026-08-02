package com.inmobi.media;

import defpackage.hs4;
import defpackage.ku3;
import defpackage.mz1;
import defpackage.rob;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tz9;
import defpackage.yda;
import defpackage.z45;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3683pj {
    public final long a;
    public final InterfaceC3880x9 b;
    public final Function1 c;
    public final ku3 d;
    public long e;
    public boolean f;
    public EnumC3631nj g;
    public boolean h;
    public yda i;

    public C3683pj(long j, InterfaceC3880x9 interfaceC3880x9, Function1 function1) {
        function1.getClass();
        this.a = j;
        this.b = interfaceC3880x9;
        this.c = function1;
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.d = s9a.c(kotlin.coroutines.e.d(o, rob.a.f));
        this.g = EnumC3631nj.IDLE;
    }

    public final void a(String str, String str2) {
        boolean z = this.f;
        if (z) {
            return;
        }
        long j = this.a;
        if (j <= 0) {
            return;
        }
        if (!z && j > 0) {
            this.f = true;
            this.g = EnumC3631nj.DONE;
            a();
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            long j2 = this.e;
            StringBuilder sb = new StringBuilder("onLoadingCompleted sessionId=");
            sb.append(j2);
            sb.append(" reason=");
            sb.append(str);
            ((C3906y9) interfaceC3880x9).a("SessionTracker", mz1.o(sb, " url=", str2));
        }
        this.c.invoke(str);
    }

    public final void a() {
        try {
            yda ydaVar = this.i;
            if (ydaVar != null && !ydaVar.isActive()) {
                throw ydaVar.k();
            }
            yda ydaVar2 = this.i;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
        } catch (Exception unused) {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("SessionTracker", "No pending commit completion job to cancel.");
            }
        }
        this.i = null;
    }
}
