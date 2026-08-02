package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1296a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1297b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f1297b = contentInfo;
    }

    @Override // androidx.core.view.g
    public ClipData a() {
        return ((ContentInfo) this.f1297b).getClip();
    }

    @Override // androidx.core.view.e
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f1297b).setLinkUri(uri);
    }

    @Override // androidx.core.view.e
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.f1297b).build()));
    }

    @Override // androidx.core.view.e
    public void c(int i5) {
        ((ContentInfo.Builder) this.f1297b).setFlags(i5);
    }

    @Override // androidx.core.view.g
    public int d() {
        return ((ContentInfo) this.f1297b).getFlags();
    }

    @Override // androidx.core.view.g
    public ContentInfo e() {
        return (ContentInfo) this.f1297b;
    }

    @Override // androidx.core.view.g
    public int getSource() {
        return ((ContentInfo) this.f1297b).getSource();
    }

    @Override // androidx.core.view.e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1297b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f1296a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1297b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i5) {
        this.f1297b = c.b(clipData, i5);
    }
}
