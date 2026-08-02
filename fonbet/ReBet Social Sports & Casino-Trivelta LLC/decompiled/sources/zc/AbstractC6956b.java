package zc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6956b {

    /* renamed from: zc.b$a */
    public static final class a extends AbstractC6956b {

        /* renamed from: a, reason: collision with root package name */
        public final String f68663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f68663a = message;
        }

        public final String a() {
            return this.f68663a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f68663a, ((a) obj).f68663a);
        }

        public int hashCode() {
            return this.f68663a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f68663a + ')';
        }
    }

    /* renamed from: zc.b$b, reason: collision with other inner class name */
    public static final class C0983b extends AbstractC6956b {

        /* renamed from: a, reason: collision with root package name */
        public final String f68664a;

        /* renamed from: b, reason: collision with root package name */
        public final long f68665b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f68666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0983b(String token, long j10, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            this.f68664a = token;
            this.f68665b = j10;
            this.f68666c = z10;
        }

        public final boolean a() {
            return this.f68666c;
        }

        public final String b() {
            return this.f68664a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0983b)) {
                return false;
            }
            C0983b c0983b = (C0983b) obj;
            return Intrinsics.areEqual(this.f68664a, c0983b.f68664a) && this.f68665b == c0983b.f68665b && this.f68666c == c0983b.f68666c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (Long.hashCode(this.f68665b) + (this.f68664a.hashCode() * 31)) * 31;
            boolean z10 = this.f68666c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "Success(token=" + this.f68664a + ", timestamp=" + this.f68665b + ", cached=" + this.f68666c + ')';
        }
    }

    /* renamed from: zc.b$c */
    public static final class c extends AbstractC6956b {

        /* renamed from: a, reason: collision with root package name */
        public final String f68667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f68667a = reason;
        }

        public final String a() {
            return this.f68667a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f68667a, ((c) obj).f68667a);
        }

        public int hashCode() {
            return this.f68667a.hashCode();
        }

        public String toString() {
            return "Unavailable(reason=" + this.f68667a + ')';
        }
    }

    public AbstractC6956b() {
    }

    public /* synthetic */ AbstractC6956b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
