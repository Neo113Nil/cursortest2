package defpackage;

import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gxm {
    public static final String a(List list, BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType) {
        Object obj;
        Object obj2;
        List list2;
        atm atmVar;
        List list3;
        atm atmVar2;
        String str;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((xvm) obj2).b == blazeThumbnailType) {
                break;
            }
        }
        xvm xvmVar = (xvm) obj2;
        if (xvmVar != null && (list3 = xvmVar.a) != null && (atmVar2 = (atm) CollectionsKt.firstOrNull(list3)) != null && (str = atmVar2.a) != null) {
            return str;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((xvm) next).b == BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE) {
                obj = next;
                break;
            }
        }
        xvm xvmVar2 = (xvm) obj;
        return (xvmVar2 == null || (list2 = xvmVar2.a) == null || (atmVar = (atm) CollectionsKt.firstOrNull(list2)) == null) ? "" : atmVar.a;
    }
}
