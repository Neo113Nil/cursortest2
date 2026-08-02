package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo e7 = hVar.f1324a.e();
        Objects.requireNonNull(e7);
        ContentInfo performReceiveContent = view.performReceiveContent(e7);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == e7 ? hVar : new h(new d(performReceiveContent));
    }
}
