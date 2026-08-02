package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import defpackage.a70;
import defpackage.hbo;
import defpackage.jdn;
import defpackage.tg0;
import defpackage.vp2;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzadp<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzaca<MessageType, BuilderType> {
    public final zzadu a;
    public zzadu b;

    public zzadp(zzadu zzaduVar) {
        this.a = zzaduVar;
        if (zzaduVar.k()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = zzaduVar.n();
    }

    @Override // com.google.android.gms.internal.measurement.zzafb
    public final zzadu a0() {
        boolean k = this.b.k();
        zzadu zzaduVar = this.b;
        if (!k) {
            return zzaduVar;
        }
        zzaduVar.o();
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final boolean c() {
        return zzadu.v(this.b, false);
    }

    public final void k() {
        if (this.b.k()) {
            return;
        }
        zzadu n = this.a.n();
        jdn.c.a(n.getClass()).a(n, this.b);
        this.b = n;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzadp i() {
        zzadp zzadpVar = (zzadp) this.a.x(5);
        boolean k = this.b.k();
        zzadu zzaduVar = this.b;
        if (k) {
            zzaduVar.o();
            zzaduVar = this.b;
        }
        zzadpVar.b = zzaduVar;
        return zzadpVar;
    }

    public final zzadu m() {
        boolean k = this.b.k();
        zzadu zzaduVar = this.b;
        if (k) {
            zzaduVar.o();
            zzaduVar = this.b;
        }
        zzaduVar.getClass();
        if (zzadu.v(zzaduVar, true)) {
            return zzaduVar;
        }
        throw new zzafy();
    }

    public final void n(zzadu zzaduVar) {
        zzadu zzaduVar2 = this.a;
        if (zzaduVar2.equals(zzaduVar)) {
            return;
        }
        if (!this.b.k()) {
            zzadu n = zzaduVar2.n();
            jdn.c.a(n.getClass()).a(n, this.b);
            this.b = n;
        }
        zzadu zzaduVar3 = this.b;
        jdn.c.a(zzaduVar3.getClass()).a(zzaduVar3, zzaduVar);
    }

    public final void o(byte[] bArr, int i, zzadf zzadfVar) {
        if (!this.b.k()) {
            zzadu n = this.a.n();
            jdn.c.a(n.getClass()).a(n, this.b);
            this.b = n;
        }
        try {
            jdn.c.a(this.b.getClass()).e(this.b, bArr, 0, i, new tg0(zzadfVar));
        } catch (zzaeh e) {
            throw e;
        } catch (IOException e2) {
            vp2.e("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
