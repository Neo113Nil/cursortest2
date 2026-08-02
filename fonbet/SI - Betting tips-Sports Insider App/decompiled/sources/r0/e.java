package r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f22196a;

    public e(Object obj) {
        this.f22196a = (InputContentInfo) obj;
    }

    @Override // r0.f
    public final Uri c() {
        return this.f22196a.getContentUri();
    }

    @Override // r0.f
    public final void d() {
        this.f22196a.requestPermission();
    }

    @Override // r0.f
    public final Uri e() {
        return this.f22196a.getLinkUri();
    }

    @Override // r0.f
    public final Object g() {
        return this.f22196a;
    }

    @Override // r0.f
    public final ClipDescription getDescription() {
        return this.f22196a.getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f22196a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
