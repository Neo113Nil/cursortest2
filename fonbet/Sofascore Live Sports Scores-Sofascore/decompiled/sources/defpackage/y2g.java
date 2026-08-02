package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface y2g {
    static void d(Context context, x2g x2gVar, GraphicLarge graphicLarge, List list, Function1 function1) {
        int i;
        int i2;
        context.getClass();
        x2gVar.getClass();
        list.getClass();
        if (!(x2gVar instanceof t2g)) {
            if (!(x2gVar instanceof v2g)) {
                zzl.b();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tgj.E((View) it.next(), 150L, null, 14);
            }
            tgj.G(graphicLarge, 150L, 2);
            function1.invoke(((v2g) x2gVar).a);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            tgj.G((View) it2.next(), 150L, 2);
        }
        if (((t2g) x2gVar) instanceof s2g) {
            i = R.string.error_server_issues;
            i2 = R.string.error_server_issues_description;
        } else {
            i = R.string.no_internet_info_title;
            i2 = R.string.error_no_internet_connection_description;
        }
        tgj.E(graphicLarge, 150L, null, 14);
        String string = context.getString(i);
        string.getClass();
        graphicLarge.setTitleResource(string);
        String string2 = context.getString(i2);
        string2.getClass();
        graphicLarge.setSubtitleResource(string2);
    }
}
