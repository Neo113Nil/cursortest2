package qg;

import android.content.Context;
import java.security.KeyPair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rg.AbstractC6282c;
import sg.c;
import sg.d;
import tg.C6464a;

/* renamed from: qg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6170a extends AbstractC6171b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0880a f63628c = new C0880a(null);

    /* renamed from: d, reason: collision with root package name */
    public static C6170a f63629d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f63630e;

    /* renamed from: qg.a$a, reason: collision with other inner class name */
    public static final class C0880a {
        public /* synthetic */ C0880a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized C6170a a(Context appContext) {
            C6170a b10;
            try {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                if (b() == null) {
                    d(new C6170a());
                    c(appContext);
                }
                b10 = b();
                Intrinsics.checkNotNull(b10);
            } catch (Throwable th2) {
                throw th2;
            }
            return b10;
        }

        public final C6170a b() {
            return C6170a.f63629d;
        }

        public final void c(Context context) {
            C6170a.f63630e = context;
        }

        public final void d(C6170a c6170a) {
            C6170a.f63629d = c6170a;
        }

        public C0880a() {
        }
    }

    @Override // qg.AbstractC6171b
    public String c(String cipherText, String privateKey, String str) {
        Intrinsics.checkNotNullParameter(cipherText, "cipherText");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        return new c().a(new d(cipherText), str, C6464a.f65824a.a(privateKey));
    }

    @Override // qg.AbstractC6171b
    public KeyPair e() {
        KeyPair b10 = AbstractC6282c.b();
        Intrinsics.checkNotNullExpressionValue(b10, "generateKeyPair(...)");
        return b10;
    }
}
