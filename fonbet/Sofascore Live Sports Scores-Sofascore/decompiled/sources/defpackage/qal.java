package defpackage;

import android.view.View;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class qal {
    public static final x0d a;

    static {
        long[] jArr = qrg.a;
        a = new x0d();
    }

    public static final mg3 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof mg3) {
            return (mg3) tag;
        }
        return null;
    }
}
