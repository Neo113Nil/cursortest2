package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zrk {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bp3 b(View view, bp3 bp3Var) {
        ContentInfo b = bp3Var.a.b();
        Objects.requireNonNull(b);
        ContentInfo performReceiveContent = view.performReceiveContent(b);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == b ? bp3Var : new bp3(new xo3(performReceiveContent));
    }
}
