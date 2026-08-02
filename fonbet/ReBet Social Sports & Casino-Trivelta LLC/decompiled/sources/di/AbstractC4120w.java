package di;

import Zh.InterfaceC1901b;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4120w extends AbstractC4077a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1901b f45431a;

    public /* synthetic */ AbstractC4120w(InterfaceC1901b interfaceC1901b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1901b);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public abstract bi.f getDescriptor();

    @Override // di.AbstractC4077a
    public final void h(ci.c decoder, Object obj, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            i(decoder, i10 + i12, obj, false);
        }
    }

    @Override // di.AbstractC4077a
    public void i(ci.c decoder, int i10, Object obj, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        o(obj, i10, ci.c.u(decoder, getDescriptor(), i10, this.f45431a, null, 8, null));
    }

    public abstract void o(Object obj, int i10, Object obj2);

    @Override // Zh.p
    public void serialize(ci.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int f10 = f(obj);
        bi.f descriptor = getDescriptor();
        ci.d j10 = encoder.j(descriptor, f10);
        Iterator e10 = e(obj);
        for (int i10 = 0; i10 < f10; i10++) {
            j10.B(getDescriptor(), i10, this.f45431a, e10.next());
        }
        j10.b(descriptor);
    }

    public AbstractC4120w(InterfaceC1901b interfaceC1901b) {
        super(null);
        this.f45431a = interfaceC1901b;
    }
}
