package v1;

import java.util.List;

/* renamed from: v1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6600E {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6600E f66903a = new InterfaceC6600E() { // from class: v1.C
        @Override // v1.InterfaceC6600E
        public final List b(String str, boolean z10, boolean z11) {
            return AbstractC6610O.l(str, z10, z11);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC6600E f66904b = new InterfaceC6600E() { // from class: v1.D
        @Override // v1.InterfaceC6600E
        public final List b(String str, boolean z10, boolean z11) {
            List q10;
            q10 = AbstractC6610O.q(InterfaceC6600E.f66903a.b(str, z10, z11));
            return q10;
        }
    };

    List b(String str, boolean z10, boolean z11);
}
