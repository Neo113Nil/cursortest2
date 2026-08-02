package t50;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import s40.InterfaceC9592a;
import s50.InterfaceC9600a;

/* renamed from: t50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9765a implements Y30.a<InterfaceC9600a> {
    @Override // Y30.a
    public final InterfaceC9600a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return new d((InterfaceC9592a) componentStorage.a(InterfaceC9592a.class), (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class), (M80.a) componentStorage.a(M80.a.class));
    }
}
