package ge;

import be.C5655a;
import fe.C6527f;
import fe.C6535n;
import fe.C6538q;
import fe.InterfaceC6534m;
import fe.InterfaceC6543w;
import ge.C6721d;
import ie.C7056e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.InterfaceC9024b;
import qd.s;
import td.C9819J;
import td.C9824O;
import td.InterfaceC9815F;
import vd.InterfaceC10304a;
import vd.InterfaceC10306c;

/* renamed from: ge.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6720c implements InterfaceC9024b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6722e f64291b = new C6722e();

    @Override // qd.InterfaceC9024b
    @NotNull
    public final C9824O a(@NotNull C7056e storageManager, @NotNull InterfaceC9815F module, @NotNull Iterable classDescriptorFactories, @NotNull InterfaceC10306c platformDependentDeclarationFilter, @NotNull InterfaceC10304a additionalClassPartsProvider, boolean z11) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<Sd.c> packageFqNames = s.f81870q;
        C6719b loadResource = new C6719b(1, this.f64291b);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        Set<Sd.c> set = packageFqNames;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        for (Sd.c cVar : set) {
            C6718a.f64290m.getClass();
            String m11 = C6718a.m(cVar);
            InputStream inputStream = (InputStream) loadResource.invoke(m11);
            if (inputStream == null) {
                throw new IllegalStateException(Nk.a.b("Resource not found in classpath: ", m11));
            }
            arrayList.add(C6721d.a.a(cVar, storageManager, module, inputStream));
        }
        C9824O c9824o = new C9824O(arrayList);
        C9819J c9819j = new C9819J(storageManager, module);
        C6538q c6538q = new C6538q(c9824o);
        C6718a c6718a = C6718a.f64290m;
        C6527f c6527f = new C6527f(module, c9819j, c6718a);
        InterfaceC6543w DO_NOTHING = InterfaceC6543w.f63262a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        C6535n c6535n = new C6535n(storageManager, module, c6538q, c6527f, c9824o, classDescriptorFactories, c9819j, InterfaceC6534m.a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6718a.e(), null, new C5655a(storageManager, K.f71697a), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6721d) it.next()).G0(c6535n);
        }
        return c9824o;
    }
}
