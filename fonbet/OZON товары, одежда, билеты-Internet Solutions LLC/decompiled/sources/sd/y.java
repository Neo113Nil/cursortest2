package sd;

import be.C5655a;
import fe.AbstractC6524c;
import fe.C6527f;
import fe.C6535n;
import fe.C6538q;
import fe.InterfaceC6534m;
import fe.InterfaceC6536o;
import fe.InterfaceC6543w;
import ge.C6718a;
import ge.C6721d;
import ie.C7056e;
import java.io.InputStream;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd.C9247a;
import td.C9819J;
import wd.L;

/* loaded from: classes.dex */
public final class y extends AbstractC6524c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull C7056e storageManager, @NotNull yd.g finder, @NotNull L moduleDescriptor, @NotNull C9819J notFoundClasses, @NotNull u additionalClassPartsProvider, @NotNull u platformDependentDeclarationFilter, @NotNull ke.r kotlinTypeChecker, @NotNull C5655a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        InterfaceC6536o.a deserializationConfiguration = InterfaceC6536o.a.f63243a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        C6538q c6538q = new C6538q(this);
        C6718a c6718a = C6718a.f64290m;
        C6527f c6527f = new C6527f(moduleDescriptor, notFoundClasses, c6718a);
        InterfaceC6543w DO_NOTHING = InterfaceC6543w.f63262a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        h(new C6535n(storageManager, moduleDescriptor, c6538q, c6527f, this, C7714v.b0(new C9247a(storageManager, moduleDescriptor), new C9665g(storageManager, moduleDescriptor)), notFoundClasses, InterfaceC6534m.a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c6718a.e(), kotlinTypeChecker, samConversionResolver, 262144));
    }

    @Override // fe.AbstractC6524c
    protected final C6721d d(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InputStream b11 = e().b(fqName);
        if (b11 != null) {
            return C6721d.a.a(fqName, g(), f(), b11);
        }
        return null;
    }
}
