package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes8.dex */
public abstract class D1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f70525a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70526b;

    D1(String str, @NonNull String str2, int i11) {
        super(str);
        this.f70525a = str2;
        this.f70526b = i11;
    }

    public final Serializable a(@NonNull Mm0.e eVar) {
        Class<?> e11 = eVar.e();
        if (e11 == String.class) {
            return this.f70525a;
        }
        if (e11 == Integer.class) {
            return Integer.valueOf(this.f70526b);
        }
        if (e11 == Boolean.class) {
            return Boolean.FALSE;
        }
        if (e11 == Om0.c.class) {
            return new Om0.c();
        }
        if (e11 == Om0.a.class) {
            return new Om0.a();
        }
        throw new Mm0.a("Unsupported valueClass: " + e11.getCanonicalName());
    }

    D1(String str, Throwable th2) {
        super(str, th2);
        this.f70525a = "";
        this.f70526b = -1;
    }
}
