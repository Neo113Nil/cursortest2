package I0;

import Ph.P;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1345j f5104a = new C1345j();

    public final InterfaceC1344i a(E storage, J0.b bVar, List migrations, P scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC1340e interfaceC1340e = bVar;
        if (bVar == null) {
            interfaceC1340e = new J0.a();
        }
        return new C1346k(storage, CollectionsKt.listOf(AbstractC1343h.f5086a.b(migrations)), interfaceC1340e, scope);
    }
}
