package qg;

import android.content.Context;
import java.security.KeyPair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qg.C6170a;

/* renamed from: qg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6171b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f63631a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static C6170a f63632b;

    /* renamed from: qg.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized AbstractC6171b a(Context context) {
            C6170a c6170a;
            try {
                if (AbstractC6171b.f63632b == null) {
                    C6170a.C0880a c0880a = C6170a.f63628c;
                    Intrinsics.checkNotNull(context);
                    AbstractC6171b.f63632b = c0880a.a(context);
                }
                c6170a = AbstractC6171b.f63632b;
                Intrinsics.checkNotNull(c6170a);
            } catch (Throwable th2) {
                throw th2;
            }
            return c6170a;
        }

        public a() {
        }
    }

    public static final synchronized AbstractC6171b d(Context context) {
        AbstractC6171b a10;
        synchronized (AbstractC6171b.class) {
            a10 = f63631a.a(context);
        }
        return a10;
    }

    public abstract String c(String str, String str2, String str3);

    public abstract KeyPair e();
}
