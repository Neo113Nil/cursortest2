package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class if0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final boolean i() {
        return ((lf0) this.instance).k();
    }

    public final void j(Map map) {
        copyOnWrite();
        ((lf0) this.instance).m().putAll(map);
    }

    public final void k(ox oxVar) {
        copyOnWrite();
        ((lf0) this.instance).o((qx) oxVar.build());
    }

    public final void l(String str) {
        copyOnWrite();
        ((lf0) this.instance).p(str);
    }

    public final void m(of0 of0Var) {
        copyOnWrite();
        ((lf0) this.instance).q(of0Var);
    }

    public final void n(String str) {
        copyOnWrite();
        ((lf0) this.instance).r(str);
    }
}
