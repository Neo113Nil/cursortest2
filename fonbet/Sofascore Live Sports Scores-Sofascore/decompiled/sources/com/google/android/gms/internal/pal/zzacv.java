package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzacv;
import com.google.android.gms.internal.pal.zzacz;
import defpackage.acn;
import defpackage.d7n;
import defpackage.kcn;
import defpackage.vp2;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzacv<MessageType extends zzacz<MessageType, BuilderType>, BuilderType extends zzacv<MessageType, BuilderType>> extends zzabh<MessageType, BuilderType> {
    public final zzacz a;
    public zzacz b;
    public boolean c = false;

    public zzacv(zzacz zzaczVar) {
        this.a = zzaczVar;
        this.b = (zzacz) zzaczVar.i(4);
    }

    public static final void c(zzacz zzaczVar, zzacz zzaczVar2) {
        acn.c.a(zzaczVar.getClass()).d(zzaczVar, zzaczVar2);
    }

    @Override // com.google.android.gms.internal.pal.zzabh
    /* renamed from: b */
    public final zzacv clone() {
        zzacv zzacvVar = (zzacv) this.a.i(5);
        zzacvVar.d(i());
        return zzacvVar;
    }

    @Override // com.google.android.gms.internal.pal.zzabh
    public final Object clone() {
        zzacv zzacvVar = (zzacv) this.a.i(5);
        zzacvVar.d(i());
        return zzacvVar;
    }

    public final void d(zzacz zzaczVar) {
        if (this.c) {
            j();
            this.c = false;
        }
        c(this.b, zzaczVar);
    }

    public final void e(byte[] bArr, int i, zzacm zzacmVar) {
        if (this.c) {
            j();
            this.c = false;
        }
        try {
            kcn a = acn.c.a(this.b.getClass());
            zzacz zzaczVar = this.b;
            d7n d7nVar = new d7n();
            zzacmVar.getClass();
            d7nVar.d = zzacmVar;
            a.c(zzaczVar, bArr, 0, i, d7nVar);
        } catch (zzadi e) {
            throw e;
        } catch (IOException e2) {
            vp2.e("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzadi.j();
        }
    }

    public final zzacz f() {
        zzacz i = i();
        boolean z = true;
        byte byteValue = ((Byte) i.i(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = acn.c.a(i.getClass()).b(i);
                i.i(2);
            }
        }
        if (z) {
            return i;
        }
        throw new zzafh("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzacz i() {
        boolean z = this.c;
        zzacz zzaczVar = this.b;
        if (z) {
            return zzaczVar;
        }
        acn.c.a(zzaczVar.getClass()).a(zzaczVar);
        this.c = true;
        return this.b;
    }

    public final void j() {
        zzacz zzaczVar = (zzacz) this.b.i(4);
        c(zzaczVar, this.b);
        this.b = zzaczVar;
    }

    @Override // com.google.android.gms.internal.pal.zzaeg
    public final /* synthetic */ zzaef n() {
        throw null;
    }
}
