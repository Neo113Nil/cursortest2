package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class nh0 implements Iterable, eia {
    public final /* synthetic */ int a;
    public final Object b;

    public nh0() {
        this.a = 1;
        this.b = new CopyOnWriteArrayList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return hz8.P((Object[]) obj);
            case 1:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                it.getClass();
                return it;
            case 2:
                return new sc5((Iterator) ((Function0) obj).invoke());
            case 3:
                return ((Sequence) obj).iterator();
            default:
                return new r4((ip5) obj);
        }
    }

    public /* synthetic */ nh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
