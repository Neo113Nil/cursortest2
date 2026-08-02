package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yee extends t7 implements wv9 {
    public final /* synthetic */ int b;
    public final uee c;

    public /* synthetic */ yee(uee ueeVar, int i) {
        this.b = i;
        this.c = ueeVar;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        uee ueeVar = this.c;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = ueeVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null) {
                        if (ueeVar.f.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ueeVar.f.containsKey(obj);
        }
    }

    @Override // defpackage.v2
    public final int getSize() {
        int i = this.b;
        uee ueeVar = this.c;
        switch (i) {
        }
        return ueeVar.f.d();
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        uee ueeVar = this.c;
        switch (i) {
            case 0:
                return new zee(ueeVar, 0);
            default:
                return new zee(ueeVar, 1);
        }
    }
}
