package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;
import defpackage.ba4;
import defpackage.duf;
import defpackage.fuf;
import defpackage.xw3;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3436g5 extends AbstractC3379e0 implements Bj {
    public final C3665p1 h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3436g5(C3665p1 c3665p1, Uc uc, Nc nc) {
        super(c3665p1);
        c3665p1.getClass();
        uc.getClass();
        nc.getClass();
        this.h = c3665p1;
        this.i = uc;
        this.j = nc;
    }

    public final void a(byte[] bArr) {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, Charsets.UTF_8) : null));
        }
        C3328c0 c3328c0 = this.f;
        c3328c0.getClass();
        c3328c0.a = SystemClock.elapsedRealtime();
        C3586m0 c3586m0 = this.g;
        xw3.L(c3586m0.a, null, null, new C3405f0(c3586m0, null), 3);
        if (b()) {
            C3906y9 c3906y92 = this.e;
            if (c3906y92 != null) {
                c3906y92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3665p1 c3665p1 = this.h;
        Nc nc = this.j;
        c3665p1.getClass();
        nc.getClass();
        C3649ob c3649ob = new C3649ob(c3665p1, nc);
        C3444gd c3444gd = (C3444gd) this;
        C3906y9 c3906y93 = c3444gd.e;
        if (c3906y93 != null) {
            c3906y93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        c3444gd.m.a(new Ad(bArr, c3444gd.k, c3649ob, c3444gd.l, c3444gd.m), c3444gd);
    }

    public final boolean b() {
        try {
            fuf fufVar = duf.a;
            fufVar.getOrCreateKotlinClass(Picasso.class).getSimpleName();
            try {
                fufVar.getOrCreateKotlinClass(ba4.class).getSimpleName();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.j.a(new C3701qb((short) 2007, inMobiAdRequestStatus, this.h, this.i, this.j), this);
    }
}
