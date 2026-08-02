package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ytn {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view, cs8 cs8Var, String str) {
        ptn ptnVar;
        if (view == null) {
            a70.p("FriendlyObstruction is null");
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                a70.p("FriendlyObstruction has detailed reason over 50 characters in length");
                return;
            } else if (!b.matcher(str).matches()) {
                a70.p("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                return;
            }
        }
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                ptnVar = null;
                break;
            } else {
                ptnVar = (ptn) it.next();
                if (ptnVar.a.get() == view) {
                    break;
                }
            }
        }
        if (ptnVar == null) {
            arrayList.add(new ptn(view, cs8Var, str));
        }
    }
}
