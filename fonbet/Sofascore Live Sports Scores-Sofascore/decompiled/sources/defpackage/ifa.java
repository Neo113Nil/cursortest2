package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ifa implements sjd {
    public final /* synthetic */ int a;

    public /* synthetic */ ifa(int i) {
        this.a = i;
    }

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new mn5("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                tjd tjdVar = (tjd) obj2;
                tjdVar.a(nff.f, entry.getKey());
                tjdVar.a(nff.g, entry.getValue());
                return;
            default:
                throw new mn5("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
