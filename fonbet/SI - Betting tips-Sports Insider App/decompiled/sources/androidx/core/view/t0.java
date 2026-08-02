package androidx.core.view;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i5) {
        view.setImportantForAutofill(i5);
    }
}
