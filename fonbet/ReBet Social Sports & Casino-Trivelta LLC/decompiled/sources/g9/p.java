package g9;

import d9.C4040c;
import d9.InterfaceC4044g;
import d9.InterfaceC4045h;
import d9.InterfaceC4046i;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p implements InterfaceC4046i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f47208a;

    /* renamed from: b, reason: collision with root package name */
    public final o f47209b;

    /* renamed from: c, reason: collision with root package name */
    public final s f47210c;

    public p(Set set, o oVar, s sVar) {
        this.f47208a = set;
        this.f47209b = oVar;
        this.f47210c = sVar;
    }

    @Override // d9.InterfaceC4046i
    public InterfaceC4045h a(String str, Class cls, C4040c c4040c, InterfaceC4044g interfaceC4044g) {
        if (this.f47208a.contains(c4040c)) {
            return new r(this.f47209b, str, c4040c, interfaceC4044g, this.f47210c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c4040c, this.f47208a));
    }
}
