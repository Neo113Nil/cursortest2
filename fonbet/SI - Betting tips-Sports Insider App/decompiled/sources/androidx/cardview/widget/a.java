package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1039b;

    public a(b bVar) {
        this.f1039b = bVar;
    }

    public final void a(int i5, int i10, int i11, int i12) {
        b bVar = this.f1039b;
        bVar.mShadowBounds.set(i5, i10, i11, i12);
        Rect rect = bVar.mContentPadding;
        super/*android.widget.FrameLayout*/.setPadding(i5 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }
}
