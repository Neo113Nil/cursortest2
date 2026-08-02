package m0;

import android.net.Uri;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f20130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20132c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20133d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20135f;

    public i(Uri uri, int i5, int i10, boolean z5, int i11) {
        uri.getClass();
        this.f20130a = uri;
        this.f20131b = i5;
        this.f20132c = i10;
        this.f20133d = z5;
        this.f20134e = null;
        this.f20135f = i11;
    }

    public i(String str, String str2) {
        this.f20130a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f20131b = 0;
        this.f20132c = 400;
        this.f20133d = false;
        this.f20134e = str2;
        this.f20135f = 0;
    }
}
