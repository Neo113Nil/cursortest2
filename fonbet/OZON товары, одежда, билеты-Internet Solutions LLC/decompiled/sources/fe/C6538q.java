package fe;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9825P;
import td.InterfaceC9820K;
import td.InterfaceC9826Q;

/* renamed from: fe.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6538q implements InterfaceC6531j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9826Q f63253a;

    public C6538q(@NotNull InterfaceC9826Q packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f63253a = packageFragmentProvider;
    }

    @Override // fe.InterfaceC6531j
    public final C6530i a(@NotNull Sd.b classId) {
        C6530i a11;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Iterator it = C9825P.c(this.f63253a, classId.f()).iterator();
        while (it.hasNext()) {
            InterfaceC9820K interfaceC9820K = (InterfaceC9820K) it.next();
            if ((interfaceC9820K instanceof r) && (a11 = ((r) interfaceC9820K).C0().a(classId)) != null) {
                return a11;
            }
        }
        return null;
    }
}
