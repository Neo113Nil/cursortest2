package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface dni extends Closeable {
    void A();

    Cursor A0(String str);

    Cursor B(hni hniVar);

    void D();

    long D0(String str, int i, ContentValues contentValues);

    void E(String str);

    boolean N();

    boolean N0();

    void O();

    void P(String str, Object[] objArr);

    void Q();

    void U();

    boolean isOpen();

    mni o0(String str);

    void s0();

    Cursor w0(hni hniVar, CancellationSignal cancellationSignal);

    int x0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    boolean y();
}
