package i50;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s40.InterfaceC9592a;

/* renamed from: i50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7011b implements Y30.a<X30.a> {
    @Override // Y30.a
    @NotNull
    public final X30.a create(@NotNull Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        InterfaceC9592a interfaceC9592a = (InterfaceC9592a) componentStorage.a(InterfaceC9592a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        M80.a aVar = (M80.a) componentStorage.a(M80.a.class);
        Y20.a aVar2 = (Y20.a) componentStorage.a(Y20.a.class);
        return new g(aVar, aVar2, interfaceC6422b, interfaceC9592a);
    }
}
