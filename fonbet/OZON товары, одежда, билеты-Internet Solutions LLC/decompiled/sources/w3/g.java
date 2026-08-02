package w3;

import java.io.IOException;
import java.util.UUID;
import s3.InterfaceC9588b;
import w3.i;

/* loaded from: classes.dex */
public interface g {

    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f103472a;

        public a(int i11, Throwable th2) {
            super(th2);
            this.f103472a = i11;
        }
    }

    void a(i.a aVar);

    default boolean b() {
        return false;
    }

    InterfaceC9588b c();

    UUID d();

    void e(i.a aVar);

    boolean f(String str);

    a getError();

    int getState();
}
