package w0;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w extends AbstractC10380G {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ L f103313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(L l11, int i11, int i12, v vVar, N n11) {
        super(l11, i11, i12, vVar, n11);
        this.f103313f = l11;
    }

    @Override // w0.AbstractC10380G
    @NotNull
    public final C10379F b(int i11, @NotNull C10378E[] c10378eArr, @NotNull List<C10387c> list, int i12) {
        return new C10379F(i11, c10378eArr, this.f103313f, list, i12);
    }
}
