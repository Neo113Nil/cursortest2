package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.inmobi.media.C3797u4;
import com.inmobi.media.Sh;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ph4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ ph4(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        boolean z = true;
        Set set = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                contains = set.contains(num);
                break;
            case 1:
                Intent intent = (Intent) obj;
                intent.getClass();
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (((gd) it.next()).b(intent)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                Activity activity = (Activity) obj;
                activity.getClass();
                Set set3 = set;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        if (((gd) it2.next()).a(activity)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                npe npeVar = (npe) obj;
                yzd yzdVar = fqe.B;
                npeVar.getClass();
                contains = set.contains(npeVar.a);
                break;
            default:
                contains = Sh.a(set, (C3797u4) obj);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
