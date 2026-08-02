package f9;

import f9.AbstractC6467a;

/* loaded from: classes9.dex */
final class d extends AbstractC6467a.AbstractC1006a {

    /* renamed from: a, reason: collision with root package name */
    private String f62995a;

    /* renamed from: b, reason: collision with root package name */
    private String f62996b;

    /* renamed from: c, reason: collision with root package name */
    private String f62997c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62998d;

    /* renamed from: e, reason: collision with root package name */
    private byte f62999e;

    @Override // f9.AbstractC6467a.AbstractC1006a
    public final AbstractC6467a a() {
        String str;
        String str2;
        String str3;
        if (this.f62999e == 1 && (str = this.f62995a) != null && (str2 = this.f62996b) != null && (str3 = this.f62997c) != null) {
            return new e(str, str2, str3, this.f62998d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f62995a == null) {
            sb2.append(" configLabel");
        }
        if (this.f62996b == null) {
            sb2.append(" modelDir");
        }
        if (this.f62997c == null) {
            sb2.append(" languageHint");
        }
        if (this.f62999e == 0) {
            sb2.append(" enableLowLatencyInBackground");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // f9.AbstractC6467a.AbstractC1006a
    public final AbstractC6467a.AbstractC1006a b(boolean z11) {
        this.f62998d = z11;
        this.f62999e = (byte) 1;
        return this;
    }

    final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null configLabel");
        }
        this.f62995a = str;
    }

    public final AbstractC6467a.AbstractC1006a d(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageHint");
        }
        this.f62997c = str;
        return this;
    }

    public final AbstractC6467a.AbstractC1006a e(String str) {
        this.f62996b = str;
        return this;
    }
}
