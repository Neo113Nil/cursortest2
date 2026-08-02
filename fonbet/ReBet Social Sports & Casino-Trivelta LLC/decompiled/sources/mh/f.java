package mh;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface f extends Closeable {

    public static final class a {
        public static void a(f fVar) {
            fVar.dispose();
        }
    }

    void O1(Object obj);

    Object V0();

    void dispose();
}
