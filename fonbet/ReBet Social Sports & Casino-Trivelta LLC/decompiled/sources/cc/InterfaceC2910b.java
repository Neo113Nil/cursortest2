package cc;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2910b {

    /* renamed from: cc.b$a */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f27702a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f27703b;

        public a(Object obj, Object obj2) {
            this.f27702a = obj;
            this.f27703b = obj2;
        }

        public final Object a() {
            return this.f27703b;
        }

        public final Object b() {
            return this.f27702a;
        }
    }

    Set a();

    void b(ec.c cVar, String str, byte[] bArr, byte[] bArr2, com.oblador.keychain.e eVar);

    int c();

    int d();

    boolean e();

    void f(String str);

    com.oblador.keychain.e g();

    String h();

    void i(ec.c cVar, String str, String str2, String str3, com.oblador.keychain.e eVar);

    /* renamed from: cc.b$b, reason: collision with other inner class name */
    public static final class C0446b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final com.oblador.keychain.e f27704c;

        public /* synthetic */ C0446b(String str, String str2, com.oblador.keychain.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? com.oblador.keychain.e.f39123a : eVar);
        }

        public final com.oblador.keychain.e c() {
            return this.f27704c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0446b(String username, String password, com.oblador.keychain.e securityLevel) {
            super(username, password);
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(securityLevel, "securityLevel");
            this.f27704c = securityLevel;
        }
    }

    /* renamed from: cc.b$c */
    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f27705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] username, byte[] password, String cipherName) {
            super(username, password);
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(cipherName, "cipherName");
            this.f27705c = cipherName;
        }

        public final String c() {
            return this.f27705c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(byte[] username, byte[] password, InterfaceC2910b cipherStorage) {
            this(username, password, cipherStorage.h());
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(password, "password");
            Intrinsics.checkNotNullParameter(cipherStorage, "cipherStorage");
        }
    }
}
