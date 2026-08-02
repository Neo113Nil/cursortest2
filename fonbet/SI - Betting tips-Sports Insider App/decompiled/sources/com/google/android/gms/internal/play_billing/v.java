package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public static final v f5602b = new v(0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f5603c = new v(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5604a;

    public /* synthetic */ v(int i5) {
        this.f5604a = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.w
    public final int a(w wVar) {
        switch (this.f5604a) {
            case 0:
                return wVar == this ? 0 : 1;
            default:
                return wVar == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w
    public final void b(StringBuilder sb2) {
        switch (this.f5604a) {
            case 0:
                throw new AssertionError();
            default:
                sb2.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w
    public final void c(StringBuilder sb2) {
        switch (this.f5604a) {
            case 0:
                sb2.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f5604a) {
            case 0:
                return ((w) obj) == this ? 0 : 1;
            default:
                return ((w) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w
    public final int hashCode() {
        switch (this.f5604a) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f5604a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
