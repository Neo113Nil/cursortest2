package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mub extends p5 {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ pub b;

    public mub(Map.Entry entry, pub pubVar) {
        this.a = entry;
        this.b = pubVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.f(entry.getKey(), entry.getValue());
    }
}
