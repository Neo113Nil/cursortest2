package C1;

import e2.AbstractC4168j;
import e2.InterfaceC4169k;
import e2.s;

/* loaded from: classes.dex */
public final class b extends AbstractC4168j {

    /* renamed from: n, reason: collision with root package name */
    public final s f1066n;

    public b(String str, s sVar) {
        super(str);
        this.f1066n = sVar;
    }

    @Override // e2.AbstractC4168j
    public InterfaceC4169k B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f1066n.reset();
        }
        return this.f1066n.b(bArr, 0, i10);
    }
}
