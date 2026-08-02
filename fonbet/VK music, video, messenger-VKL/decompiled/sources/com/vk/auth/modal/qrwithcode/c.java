package com.vk.auth.modal.qrwithcode;

/* compiled from: QrWithCodeAuthValidationResult.kt */
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: QrWithCodeAuthValidationResult.kt */
    public static final class a implements c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 180010747;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: QrWithCodeAuthValidationResult.kt */
    public static final class b implements c {
        public final QrWithCodeAuthErrorType a;

        public b(QrWithCodeAuthErrorType qrWithCodeAuthErrorType) {
            this.a = qrWithCodeAuthErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.a + ')';
        }
    }

    /* compiled from: QrWithCodeAuthValidationResult.kt */
    /* renamed from: com.vk.auth.modal.qrwithcode.c$c, reason: collision with other inner class name */
    public static final class C0407c implements c {
        public static final C0407c a = new C0407c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0407c);
        }

        public final int hashCode() {
            return -1101986798;
        }

        public final String toString() {
            return "Wait";
        }
    }
}
