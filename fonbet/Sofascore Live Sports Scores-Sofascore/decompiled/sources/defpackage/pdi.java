package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pdi extends n4 implements Iterator, eia {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdi(koh kohVar, Iterator it, int i) {
        super(kohVar, it);
        this.g = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                a();
                if (((Map.Entry) this.c) == null) {
                    zzl.s();
                    break;
                } else {
                    break;
                }
            case 1:
                Map.Entry entry = (Map.Entry) this.f;
                if (entry == null) {
                    zzl.s();
                    break;
                } else {
                    a();
                    break;
                }
            default:
                Map.Entry entry2 = (Map.Entry) this.f;
                if (entry2 == null) {
                    zzl.s();
                    break;
                } else {
                    a();
                    break;
                }
        }
        return null;
    }
}
