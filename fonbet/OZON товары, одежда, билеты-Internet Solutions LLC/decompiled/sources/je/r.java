package je;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.g0;

/* loaded from: classes.dex */
public final class r extends AbstractC7370b {

    /* renamed from: c, reason: collision with root package name */
    private final wd.G f69912c;

    /* renamed from: d, reason: collision with root package name */
    private final List<td.i0> f69913d;

    /* renamed from: e, reason: collision with root package name */
    private final Collection<N> f69914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull wd.G g10, @NotNull List list, @NotNull Collection collection, @NotNull ie.o oVar) {
        super(oVar);
        if (list == null) {
            k(1);
            throw null;
        }
        if (collection == null) {
            k(2);
            throw null;
        }
        if (oVar == null) {
            k(3);
            throw null;
        }
        this.f69912c = g10;
        this.f69913d = Collections.unmodifiableList(new ArrayList(list));
        this.f69914e = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void k(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getParameters";
        } else if (i11 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i11 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i11 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // je.AbstractC7394n
    @NotNull
    protected final Collection<N> d() {
        Collection<N> collection = this.f69914e;
        if (collection != null) {
            return collection;
        }
        k(6);
        throw null;
    }

    @Override // je.AbstractC7394n
    @NotNull
    protected final td.g0 g() {
        return g0.a.f99394a;
    }

    @Override // je.s0
    @NotNull
    public final List<td.i0> getParameters() {
        List<td.i0> list = this.f69913d;
        if (list != null) {
            return list;
        }
        k(4);
        throw null;
    }

    @Override // je.AbstractC7370b
    @NotNull
    /* renamed from: l */
    public final InterfaceC9839e p() {
        wd.G g10 = this.f69912c;
        if (g10 != null) {
            return g10;
        }
        k(5);
        throw null;
    }

    @Override // je.s0
    public final boolean q() {
        return true;
    }

    public final String toString() {
        return Vd.i.k(this.f69912c).b();
    }
}
