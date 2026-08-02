package defpackage;

import com.sofascore.model.mvvm.model.Category;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yl2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ yl2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                return (z ? Integer.valueOf(((Category) obj2).getPriority()) : 0).compareTo(z ? Integer.valueOf(((Category) obj).getPriority()) : 0);
            default:
                return (z ? Integer.valueOf(((Category) obj2).getPriority()) : 0).compareTo(z ? Integer.valueOf(((Category) obj).getPriority()) : 0);
        }
    }
}
