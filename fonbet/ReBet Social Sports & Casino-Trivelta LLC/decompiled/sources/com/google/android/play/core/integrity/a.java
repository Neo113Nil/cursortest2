package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f36525a;

    /* renamed from: b, reason: collision with root package name */
    private y f36526b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f36526b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f36525a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f36525a;
        if (str != null && (yVar = this.f36526b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f36525a == null) {
            sb2.append(" token");
        }
        if (this.f36526b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
