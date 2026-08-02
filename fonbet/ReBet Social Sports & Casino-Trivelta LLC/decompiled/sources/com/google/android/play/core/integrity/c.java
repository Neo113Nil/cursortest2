package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f36626a;

    /* renamed from: b, reason: collision with root package name */
    private byte f36627b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f36627b = (byte) (this.f36627b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f36627b == 3) {
            return new e(this.f36626a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f36627b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f36627b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f36626a = j10;
        this.f36627b = (byte) (this.f36627b | 1);
        return this;
    }
}
