package ph;

import rh.AbstractC6294l;
import rh.AbstractC6298p;
import rh.InterfaceC6292j;
import rh.InterfaceC6297o;
import rh.InterfaceC6299q;

/* renamed from: ph.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6073d implements InterfaceC6292j {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6292j f63212a = i(AbstractC6298p.b(), AbstractC6294l.b(), InterfaceC6297o.getDefault(), InterfaceC6299q.getDefault(), false, false);

    public static InterfaceC6292j h(String str, String str2, InterfaceC6297o interfaceC6297o, InterfaceC6299q interfaceC6299q, boolean z10, boolean z11) {
        return (z11 || (AbstractC6294l.isValid(str2) && AbstractC6298p.isValid(str))) ? i(str, str2, interfaceC6297o, interfaceC6299q, z10, true) : i(AbstractC6298p.b(), AbstractC6294l.b(), interfaceC6297o, interfaceC6299q, z10, false);
    }

    public static C6071b i(String str, String str2, InterfaceC6297o interfaceC6297o, InterfaceC6299q interfaceC6299q, boolean z10, boolean z11) {
        return new C6071b(str, str2, interfaceC6297o, interfaceC6299q, z10, z11);
    }

    @Override // rh.InterfaceC6292j
    public abstract boolean isValid();
}
