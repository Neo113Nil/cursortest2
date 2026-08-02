package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface btl {
    static w0m create$default(btl btlVar, Context context, vwl vwlVar, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i & 2) != 0) {
            vwlVar = vwl.SURFACE_VIEW;
        }
        ((cbm) btlVar).getClass();
        context.getClass();
        vwlVar.getClass();
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        return new qdm(from, vwlVar, null);
    }
}
