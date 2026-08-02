package h6;

import T7.Y;
import com.facebook.AccessToken;
import g6.C4331C;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4474a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0714a f47752c = new C0714a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final String f47753a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47754b;

    /* renamed from: h6.a$a, reason: collision with other inner class name */
    public static final class C0714a {
        public /* synthetic */ C0714a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0714a() {
        }
    }

    /* renamed from: h6.a$b */
    public static final class b implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final C0715a f47755c = new C0715a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a, reason: collision with root package name */
        public final String f47756a;

        /* renamed from: b, reason: collision with root package name */
        public final String f47757b;

        /* renamed from: h6.a$b$a, reason: collision with other inner class name */
        public static final class C0715a {
            public /* synthetic */ C0715a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0715a() {
            }
        }

        public b(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f47756a = str;
            this.f47757b = appId;
        }

        private final Object readResolve() {
            return new C4474a(this.f47756a, this.f47757b);
        }
    }

    public C4474a(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f47753a = applicationId;
        this.f47754b = Y.d0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(this.f47754b, this.f47753a);
    }

    public final String a() {
        return this.f47754b;
    }

    public final String b() {
        return this.f47753a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4474a)) {
            return false;
        }
        Y y10 = Y.f11042a;
        C4474a c4474a = (C4474a) obj;
        return Y.e(c4474a.f47754b, this.f47754b) && Y.e(c4474a.f47753a, this.f47753a);
    }

    public int hashCode() {
        String str = this.f47754b;
        return (str == null ? 0 : str.hashCode()) ^ this.f47753a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4474a(AccessToken accessToken) {
        this(accessToken.getToken(), C4331C.m());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
