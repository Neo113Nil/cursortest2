package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Category;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class xl2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xl2(Comparator comparator, Object obj, int i) {
        this.a = i;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                Category category = (Category) obj;
                Category category2 = (Category) obj2;
                category.getClass();
                category2.getClass();
                return ((Collator) comparator).compare(tba.q(category, context), tba.q(category2, context));
            default:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
        }
    }
}
