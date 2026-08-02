package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ll6 {
    boolean a(nl6 nl6Var);

    int b(nl6 nl6Var, b78 b78Var);

    default List d() {
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    void e(pl6 pl6Var);

    void release();

    void seek(long j, long j2);

    default ll6 c() {
        return this;
    }
}
