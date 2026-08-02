package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import defpackage.a9n;
import defpackage.m9n;
import defpackage.odn;
import defpackage.q9n;
import defpackage.vp2;
import defpackage.wt3;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzacb<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafc {
    protected transient int zza = 0;

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void d(OutputStream outputStream) {
        zzadu zzaduVar = (zzadu) this;
        int e = zzaduVar.e();
        boolean z = zzada.b;
        if (e > 4096) {
            e = 4096;
        }
        q9n q9nVar = new q9n(outputStream, e);
        zzaduVar.f(q9nVar);
        if (q9nVar.e > 0) {
            q9nVar.G();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzacr g() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int e = zzaduVar.e();
            a9n a9nVar = zzacr.b;
            byte[] bArr = new byte[e];
            boolean z = zzada.b;
            m9n m9nVar = new m9n(bArr, e);
            zzaduVar.f(m9nVar);
            m9nVar.e();
            return new a9n(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a ByteString threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public final byte[] h() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int e = zzaduVar.e();
            byte[] bArr = new byte[e];
            boolean z = zzada.b;
            m9n m9nVar = new m9n(bArr, e);
            zzaduVar.f(m9nVar);
            m9nVar.e();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public int i(odn odnVar) {
        throw null;
    }
}
