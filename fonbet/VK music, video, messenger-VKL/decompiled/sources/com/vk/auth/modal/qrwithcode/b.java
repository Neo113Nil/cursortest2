package com.vk.auth.modal.qrwithcode;

import xsna.epx;
import xsna.ho8;

/* compiled from: QrWithCodeAuthUiState.kt */
/* loaded from: classes15.dex */
public abstract class b {

    /* compiled from: QrWithCodeAuthUiState.kt */
    public static final class a extends b {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CodeReady(code="), this.a, ')');
        }
    }

    /* compiled from: QrWithCodeAuthUiState.kt */
    /* renamed from: com.vk.auth.modal.qrwithcode.b$b, reason: collision with other inner class name */
    public static final class C0406b extends b {
        public static final C0406b a = new C0406b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0406b);
        }

        public final int hashCode() {
            return 395339024;
        }

        public final String toString() {
            return "DeviceInfo";
        }
    }

    /* compiled from: QrWithCodeAuthUiState.kt */
    public static final class c extends b {
        public final QrWithCodeAuthErrorType a;

        public c(QrWithCodeAuthErrorType qrWithCodeAuthErrorType) {
            this.a = qrWithCodeAuthErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.a + ')';
        }
    }

    /* compiled from: QrWithCodeAuthUiState.kt */
    public static final class d extends b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2109349936;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
