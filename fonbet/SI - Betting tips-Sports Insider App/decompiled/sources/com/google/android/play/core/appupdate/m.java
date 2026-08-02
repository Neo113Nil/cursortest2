package com.google.android.play.core.appupdate;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f6016a;

    /* renamed from: b, reason: collision with root package name */
    public byte f6017b;

    public final n a() {
        if (this.f6017b == 3) {
            return new n(this.f6016a);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6017b & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f6017b & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
