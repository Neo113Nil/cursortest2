package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface nlg extends AutoCloseable {
    String F0(int i);

    void L(int i, String str);

    boolean U0();

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void q(int i, long j);

    void r(int i, byte[] bArr);

    void reset();

    void s(int i);

    default boolean v0() {
        return getLong(0) != 0;
    }

    void z();
}
