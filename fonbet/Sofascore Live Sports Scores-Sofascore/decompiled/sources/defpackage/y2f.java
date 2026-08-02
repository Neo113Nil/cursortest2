package defpackage;

import java.text.Collator;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y2f implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public y2f(Comparator comparator) {
        this.a = 1;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                return comparator.compare(((huj) obj).b, ((huj) obj2).b);
            case 1:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return wma.T.compare(((s3h) obj).c, ((s3h) obj2).c);
            default:
                return comparator.compare(((huj) obj).b, ((huj) obj2).b);
        }
    }

    public /* synthetic */ y2f(Collator collator, int i) {
        this.a = i;
        this.b = collator;
    }
}
