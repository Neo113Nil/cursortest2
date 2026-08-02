package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gq8 {
    public static final lq8 a = new lq8();
    public static final mq8 b;

    static {
        mq8 mq8Var = null;
        try {
            mq8Var = (mq8) rq8.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = mq8Var;
    }

    public static final void a(ArrayList arrayList, int i) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
