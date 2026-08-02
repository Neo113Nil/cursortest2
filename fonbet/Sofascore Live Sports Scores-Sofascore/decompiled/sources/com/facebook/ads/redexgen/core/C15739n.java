package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15739n extends AbstractC3067nv implements DI {
    public long A00;
    public InterfaceC14835t A01;
    public InterfaceC2893ku<InterfaceExecutorC1706Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C3201q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C15739n(C3201q7 c3201q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC2893ku<InterfaceExecutorC1706Fb> interfaceC2893ku) {
        this.A07 = (AnonymousClass32) AbstractC14363y.A01(c3201q7.A03);
        this.A08 = c3201q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC2893ku;
    }

    private void A00() {
        final Timeline c15729m = new C15729m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c15729m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3179pl A0I(int i, C3179pl c3179pl, boolean z) {
                    super.A0I(i, c3179pl, z);
                    c3179pl.A05 = true;
                    return c3179pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C3177pj A0L(int i, C3177pj c3177pj, long j) {
                    super.A0L(i, c3177pj, j);
                    c3177pj.A0F = true;
                    return c3177pj;
                }
            };
            c15729m = timeline;
        }
        A05(c15729m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3067nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3067nv
    public final void A0A(InterfaceC14835t interfaceC14835t) {
        this.A01 = interfaceC14835t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC14363y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1650Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3061np A5W(C3060no c3060no, F0 f0, long j) {
        InterfaceExecutorC1706Fb interfaceExecutorC1706Fb;
        InterfaceC3148pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 A01 = A01(c3060no);
        FF ff = this.A0C;
        D8 A02 = A02(c3060no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1706Fb = this.A02.get();
        } else {
            interfaceExecutorC1706Fb = null;
        }
        return new C15759p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC1706Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1650Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j, boolean z, boolean z2) {
        if (j == C.TIME_UNSET) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1650Cx
    public final void AHk(InterfaceC3061np interfaceC3061np) {
        ((C15759p) interfaceC3061np).A0a();
    }
}
