package org.chromium.net;

import java.nio.ByteBuffer;
import org.chromium.net.impl.b0;

/* loaded from: classes6.dex */
public abstract class C {

    public static abstract class a {
        public abstract b0 a(String str, String str2);

        public abstract b0 b();

        public abstract b0 c(String str);

        public abstract b0 d(A a11, Va.a aVar);
    }

    public static abstract class b {
        public abstract void a(C c11, D d11);

        public abstract void b(C c11, D d11, f fVar);

        public abstract void c(C c11, D d11, ByteBuffer byteBuffer) throws Exception;

        public abstract void d(C c11, D d11, String str) throws Exception;

        public abstract void e(C c11, D d11) throws Exception;

        public abstract void f(C c11, D d11);
    }

    /* loaded from: classes10.dex */
    public static abstract class c {
    }

    public abstract void a();

    public abstract void b();

    public abstract boolean c();

    public abstract void d(ByteBuffer byteBuffer);

    public abstract void e();
}
