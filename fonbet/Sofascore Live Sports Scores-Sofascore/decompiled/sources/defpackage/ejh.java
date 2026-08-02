package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ejh extends Closeable, Flushable {
    void W(x52 x52Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    pij timeout();
}
