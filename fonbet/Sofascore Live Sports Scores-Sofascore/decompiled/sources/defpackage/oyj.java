package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.sofascore.model.DateSection;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oyj extends cs7 implements vqf {
    public final d92 u;
    public final boolean v;
    public final int w;
    public final ArrayList x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyj(Context context, d92 d92Var) {
        super(context);
        context.getClass();
        d92Var.getClass();
        this.u = d92Var;
        this.v = true;
        int i = this.c;
        this.c = i + 1;
        this.w = i;
        this.x = new ArrayList();
    }

    @Override // defpackage.qzh
    public final boolean S() {
        return this.v;
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        Object obj;
        ArrayList arrayList = this.i;
        Object a0 = CollectionsKt.a0(i, arrayList);
        Object a02 = CollectionsKt.a0(i - 1, arrayList);
        if (!(a0 instanceof d92) && (!(a02 instanceof d92) || !(a0 instanceof AdBannerView))) {
            ArrayList arrayList2 = this.x;
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Number) obj).intValue() <= i) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                Object a03 = CollectionsKt.a0(num.intValue(), arrayList);
                if (a03 instanceof DateSection) {
                    return (DateSection) a03;
                }
            }
        }
        return null;
    }

    @Override // defpackage.cs7, defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        return obj instanceof d92 ? this.w : super.v(obj);
    }

    @Override // defpackage.cs7, defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return i == this.w ? new r71(this.u) : super.z(viewGroup, i);
    }
}
