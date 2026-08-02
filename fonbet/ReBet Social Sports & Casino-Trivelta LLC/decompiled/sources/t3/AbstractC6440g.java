package t3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6440g {

    /* renamed from: t3.g$a */
    public static final class a extends AbstractC6440g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f65668a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: t3.g$b */
    public static final class b extends AbstractC6440g {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f65669a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f65669a = error;
        }

        public final Throwable a() {
            return this.f65669a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f65669a, ((b) obj).f65669a);
        }

        public int hashCode() {
            return this.f65669a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f65669a + ")";
        }
    }

    /* renamed from: t3.g$c */
    public static final class c extends AbstractC6440g {

        /* renamed from: a, reason: collision with root package name */
        public final String f65670a;

        /* renamed from: b, reason: collision with root package name */
        public final String f65671b;

        /* renamed from: c, reason: collision with root package name */
        public final String f65672c;

        /* renamed from: d, reason: collision with root package name */
        public final String f65673d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String code, String id_token, String state, String user) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(id_token, "id_token");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f65670a = code;
            this.f65671b = id_token;
            this.f65672c = state;
            this.f65673d = user;
        }

        public final String a() {
            return this.f65670a;
        }

        public final String b() {
            return this.f65671b;
        }

        public final String c() {
            return this.f65672c;
        }

        public final String d() {
            return this.f65673d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f65670a, cVar.f65670a) && Intrinsics.areEqual(this.f65671b, cVar.f65671b) && Intrinsics.areEqual(this.f65672c, cVar.f65672c) && Intrinsics.areEqual(this.f65673d, cVar.f65673d);
        }

        public int hashCode() {
            return (((((this.f65670a.hashCode() * 31) + this.f65671b.hashCode()) * 31) + this.f65672c.hashCode()) * 31) + this.f65673d.hashCode();
        }

        public String toString() {
            return "Success(code=" + this.f65670a + ", id_token=" + this.f65671b + ", state=" + this.f65672c + ", user=" + this.f65673d + ")";
        }
    }

    public /* synthetic */ AbstractC6440g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC6440g() {
    }
}
