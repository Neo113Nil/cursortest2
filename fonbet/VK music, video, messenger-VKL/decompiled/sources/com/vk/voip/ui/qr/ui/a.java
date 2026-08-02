package com.vk.voip.ui.qr.ui;

import xsna.ao50;
import xsna.aww0;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: VoipQrCodeScannerViewState.kt */
/* loaded from: classes7.dex */
public final class a implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;

    /* compiled from: VoipQrCodeScannerViewState.kt */
    /* renamed from: com.vk.voip.ui.qr.ui.a$a, reason: collision with other inner class name */
    public static final class C2071a implements fm50<aww0.a> {
        public static final C2071a a = new C2071a();
    }

    /* compiled from: VoipQrCodeScannerViewState.kt */
    public static final class b implements fm50<aww0.b> {
        public final yzt0<Throwable> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Failed(error="), this.a, ')');
        }
    }

    /* compiled from: VoipQrCodeScannerViewState.kt */
    public static final class c implements fm50<aww0.c> {
        public static final c a = new c();
    }

    /* compiled from: VoipQrCodeScannerViewState.kt */
    public static final class d implements fm50<aww0.d> {
        public final yzt0<Throwable> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("NotOperable(error="), this.a, ')');
        }
    }

    /* compiled from: VoipQrCodeScannerViewState.kt */
    public static final class e implements fm50<aww0.e> {
        public static final e a = new e();
    }

    /* compiled from: VoipQrCodeScannerViewState.kt */
    public static final class f implements fm50<aww0.f> {
        public static final f a = new f();
    }

    public a(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
    }
}
