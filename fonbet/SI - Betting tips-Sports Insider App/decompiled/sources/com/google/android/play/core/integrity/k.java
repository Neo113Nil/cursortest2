package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f6047a;

    public k(String str) {
        this.f6047a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f6047a;
    }
}
