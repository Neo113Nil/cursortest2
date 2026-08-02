package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class csj extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void d(List list) {
        copyOnWrite();
        ((fsj) this.instance).h(list);
    }

    public final void h(ArrayList arrayList) {
        copyOnWrite();
        ((fsj) this.instance).i(arrayList);
    }

    public final void i(sde sdeVar) {
        copyOnWrite();
        ((fsj) this.instance).j(sdeVar);
    }

    public final void j(fsj fsjVar) {
        copyOnWrite();
        ((fsj) this.instance).k(fsjVar);
    }

    public final void k(HashMap hashMap) {
        copyOnWrite();
        ((fsj) this.instance).u().putAll(hashMap);
    }

    public final void l(Map map) {
        copyOnWrite();
        ((fsj) this.instance).v().putAll(map);
    }

    public final void m(long j, String str) {
        str.getClass();
        copyOnWrite();
        ((fsj) this.instance).u().put(str, Long.valueOf(j));
    }

    public final void n(String str) {
        copyOnWrite();
        ((fsj) this.instance).v().put("systemDeterminedForeground", str);
    }

    public final void o(long j) {
        copyOnWrite();
        ((fsj) this.instance).x(j);
    }

    public final void p(long j) {
        copyOnWrite();
        ((fsj) this.instance).y(j);
    }

    public final void q(String str) {
        copyOnWrite();
        ((fsj) this.instance).setName(str);
    }
}
