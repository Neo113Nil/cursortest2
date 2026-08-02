package y50;

import f40.InterfaceC6422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s40.InterfaceC9592a;

/* loaded from: classes3.dex */
public final class h implements Y30.a<X30.a> {
    @Override // Y30.a
    @NotNull
    public final X30.a create(@NotNull Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return new n((P30.b) componentStorage.a(P30.b.class), (InterfaceC9592a) componentStorage.a(InterfaceC9592a.class), (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class), (M80.a) componentStorage.a(M80.a.class), (Y20.a) componentStorage.a(Y20.a.class), (O90.a) componentStorage.a(O90.a.class));
    }
}
