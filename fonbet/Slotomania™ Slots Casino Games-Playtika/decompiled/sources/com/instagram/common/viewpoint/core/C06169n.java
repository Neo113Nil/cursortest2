package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06169n extends AbstractC2110nv implements DI {
    public long A00;
    public InterfaceC05265t A01;
    public InterfaceC1936ku<InterfaceExecutorC0749Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2244q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C06169n(C2244q7 c2244q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC1936ku<InterfaceExecutorC0749Fb> interfaceC1936ku) {
        this.A07 = (AnonymousClass32) AbstractC04793y.A01(c2244q7.A03);
        this.A08 = c2244q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = C.TIME_UNSET;
        this.A02 = interfaceC1936ku;
    }

    private void A00() {
        final Timeline c06159m = new C06159m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c06159m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2222pl A0I(int i, C2222pl c2222pl, boolean z) {
                    super.A0I(i, c2222pl, z);
                    c2222pl.A05 = true;
                    return c2222pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2220pj A0L(int i, C2220pj c2220pj, long j) {
                    super.A0L(i, c2220pj, j);
                    c2220pj.A0F = true;
                    return c2220pj;
                }
            };
            c06159m = timeline;
        }
        A05(c06159m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2110nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2110nv
    public final void A0A(InterfaceC05265t interfaceC05265t) {
        this.A01 = interfaceC05265t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC04793y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0693Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2104np A5W(C2103no c2103no, F0 f0, long j) {
        InterfaceExecutorC0749Fb interfaceExecutorC0749Fb;
        InterfaceC2191pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 A01 = A01(c2103no);
        FF ff = this.A0C;
        D8 A02 = A02(c2103no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0749Fb = this.A02.get();
        } else {
            interfaceExecutorC0749Fb = null;
        }
        return new C06189p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC0749Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0693Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC0693Cx
    public final void AHk(InterfaceC2104np interfaceC2104np) {
        ((C06189p) interfaceC2104np).A0a();
    }
}
