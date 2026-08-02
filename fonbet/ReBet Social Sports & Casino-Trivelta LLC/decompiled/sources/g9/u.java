package g9;

import android.content.Context;
import java.io.Closeable;
import o9.InterfaceC5842d;

/* loaded from: classes2.dex */
public abstract class u implements Closeable {

    public interface a {
        a a(Context context);

        u build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    public abstract InterfaceC5842d d();

    public abstract t k();
}
