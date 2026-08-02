package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f36578a;

    /* renamed from: b, reason: collision with root package name */
    private y f36579b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f36579b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f36578a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f36578a;
        if (str != null && (yVar = this.f36579b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f36578a == null) {
            sb2.append(" token");
        }
        if (this.f36579b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
