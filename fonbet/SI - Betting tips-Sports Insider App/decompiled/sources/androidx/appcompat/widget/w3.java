package androidx.appcompat.widget;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w3 extends j1.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f993a;

    public w3(x3 x3Var) {
        this.f993a = new WeakReference(x3Var);
    }

    @Override // j1.h
    public final void a() {
        x3 x3Var = (x3) this.f993a.get();
        if (x3Var != null) {
            x3Var.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // j1.h
    public final void b() {
        x3 x3Var = (x3) this.f993a.get();
        if (x3Var != null) {
            x3Var.onEmojiCompatInitializedForSwitchText();
        }
    }
}
