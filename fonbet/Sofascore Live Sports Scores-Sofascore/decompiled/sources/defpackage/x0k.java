package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x0k extends w0k {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0k(int i) {
        super(0);
        this.e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.d;
                this.d = i + 2;
                Object[] objArr = this.b;
                return new qtb(1, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.d;
                this.d = i2 + 2;
                return this.b[i2];
            default:
                int i3 = this.d;
                this.d = i3 + 2;
                return this.b[i3 + 1];
        }
    }
}
