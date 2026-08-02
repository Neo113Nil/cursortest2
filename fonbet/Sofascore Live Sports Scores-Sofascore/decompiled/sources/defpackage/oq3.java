package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oq3 extends pq3 {
    public final Function1 a;

    public oq3(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.pq3
    public final KSerializer a(List list) {
        list.getClass();
        return (KSerializer) this.a.invoke(list);
    }
}
