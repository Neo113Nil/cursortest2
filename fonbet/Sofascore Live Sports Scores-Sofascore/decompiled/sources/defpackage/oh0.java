package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oh0 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return hz8.P((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new j8b(this);
            case 3:
                return b5h.a((Function2) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new d5h(obj);
            case 6:
                ArrayList r = i5h.r((lwj) obj);
                n13.t(r);
                return r.iterator();
            default:
                return new i8b((CharSequence) obj);
        }
    }
}
