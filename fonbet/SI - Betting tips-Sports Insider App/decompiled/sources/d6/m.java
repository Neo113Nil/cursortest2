package d6;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final Feature f8260a;

    public m(Feature feature) {
        this.f8260a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f8260a));
    }
}
