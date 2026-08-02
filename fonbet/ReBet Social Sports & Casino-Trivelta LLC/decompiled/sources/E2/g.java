package E2;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    boolean F1();

    boolean N1();

    k R0(String str);

    Cursor S(j jVar);

    void a0();

    void b0(String str, Object[] objArr);

    void c0();

    int i1(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    boolean isOpen();

    String l();

    void l0();

    Cursor p1(String str);

    Cursor t0(j jVar, CancellationSignal cancellationSignal);

    void v();

    List x();

    void z(String str);
}
