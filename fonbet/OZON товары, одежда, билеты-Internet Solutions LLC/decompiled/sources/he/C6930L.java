package he;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10025c;

/* renamed from: he.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6930L extends C6931a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6930L(@NotNull ie.o storageManager, @NotNull Function0<? extends List<? extends InterfaceC10025c>> compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // he.C6931a, ud.InterfaceC10030h
    public final boolean isEmpty() {
        return false;
    }
}
