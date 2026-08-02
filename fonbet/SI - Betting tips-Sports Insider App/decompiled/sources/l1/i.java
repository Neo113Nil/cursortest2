package l1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends j1.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19331a;

    public i(EditText editText) {
        this.f19331a = new WeakReference(editText);
    }

    @Override // j1.h
    public final void b() {
        j.a((EditText) this.f19331a.get(), 1);
    }
}
