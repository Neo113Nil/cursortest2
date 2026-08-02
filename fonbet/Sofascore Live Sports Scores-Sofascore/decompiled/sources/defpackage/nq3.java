package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class nq3 extends pq3 {
    public final KSerializer a;

    public nq3(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.pq3
    public final KSerializer a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nq3) && ((nq3) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
