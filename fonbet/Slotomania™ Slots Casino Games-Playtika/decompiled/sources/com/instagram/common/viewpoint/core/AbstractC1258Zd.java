package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1258Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC0987Oi A02;
    public C0988Oj A03;
    public C0989Ok A04;
    public InterfaceC1257Zc A05;
    public final C0985Og A06;
    public final C1695gi A07;
    public final VA A08;
    public final InterfaceC1236Yh A09;
    public final InterfaceC1237Yi A0A;
    public final String A0B;
    public final C0965Nm A0C;
    public final InterfaceC1260Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C0989Ok c0989Ok, EnumC0987Oi enumC0987Oi);

    public abstract boolean A0S();

    public AbstractC1258Zd(C1695gi c1695gi, VA va, String str) {
        this(c1695gi, va, str, null, null, null);
    }

    public AbstractC1258Zd(C1695gi c1695gi, VA va, String str, C0965Nm c0965Nm, InterfaceC1237Yi interfaceC1237Yi, InterfaceC1236Yh interfaceC1236Yh) {
        super(c1695gi);
        this.A00 = 0;
        this.A02 = EnumC0987Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c1695gi;
        this.A08 = va;
        this.A0A = interfaceC1237Yi;
        this.A09 = interfaceC1236Yh;
        this.A0B = str;
        this.A0C = c0965Nm;
        this.A06 = AbstractC0986Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC1258Zd abstractC1258Zd) {
        int i = abstractC1258Zd.A00;
        abstractC1258Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC1258Zd abstractC1258Zd) {
        int i = abstractC1258Zd.A00;
        abstractC1258Zd.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C0989Ok c0989Ok) {
        this.A03.A08(this.A02);
        A0Q(c0989Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C0989Ok c0989Ok) {
        this.A04 = c0989Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c0989Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C0988Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC1237Yi interfaceC1237Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1237Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C0989Ok c0989Ok, EnumC0987Oi enumC0987Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC1257Zc interfaceC1257Zc) {
        this.A05 = interfaceC1257Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
