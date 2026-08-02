package je;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* renamed from: je.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7370b extends AbstractC7394n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7370b(@NotNull ie.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            k(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void k(int i11) {
        String format;
        String str = (i11 == 1 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 != 1) {
            if (i11 == 2) {
                objArr[0] = "classifier";
            } else if (i11 != 3 && i11 != 4) {
                objArr[0] = "storageManager";
            }
            if (i11 != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 3 || i11 == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i11 != 3 && i11 != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i11 == 1 && i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i11 != 1) {
        }
        if (i11 != 1) {
        }
        format = String.format(str, objArr);
        if (i11 == 1) {
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(((td.InterfaceC9820K) r0).c(), ((td.InterfaceC9820K) r6).c()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077 A[RETURN] */
    @Override // je.AbstractC7398s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean b(@NotNull InterfaceC9842h second) {
        boolean z11;
        if (second instanceof InterfaceC9839e) {
            InterfaceC9839e first = p();
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (Intrinsics.d(first.getName(), second.getName())) {
                InterfaceC9845k d11 = first.d();
                InterfaceC9845k d12 = second.d();
                while (true) {
                    if (d11 != null && d12 != null) {
                        if (!(d11 instanceof InterfaceC9815F)) {
                            if (!(d12 instanceof InterfaceC9815F)) {
                                if (!(d11 instanceof InterfaceC9820K)) {
                                    if ((d12 instanceof InterfaceC9820K) || !Intrinsics.d(d11.getName(), d12.getName())) {
                                        break;
                                    }
                                    d11 = d11.d();
                                    d12 = d12.d();
                                } else if (d12 instanceof InterfaceC9820K) {
                                }
                            } else {
                                break;
                            }
                        } else {
                            z11 = d12 instanceof InterfaceC9815F;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z11 = true;
                if (!z11) {
                    return true;
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        return false;
    }

    @Override // je.AbstractC7394n
    protected final N e() {
        if (qd.m.h0(p())) {
            return null;
        }
        return n().i();
    }

    @Override // je.AbstractC7394n
    @NotNull
    protected final Collection<N> f(boolean z11) {
        InterfaceC9845k d11 = p().d();
        if (!(d11 instanceof InterfaceC9839e)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            k(3);
            throw null;
        }
        te.h hVar = new te.h();
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) d11;
        hVar.add(interfaceC9839e.q());
        InterfaceC9839e r02 = interfaceC9839e.r0();
        if (z11 && r02 != null) {
            hVar.add(r02.q());
        }
        return hVar;
    }

    @Override // je.s0
    @NotNull
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC9839e p();

    @Override // je.s0
    @NotNull
    public final qd.m n() {
        qd.m e11 = Zd.e.e(p());
        if (e11 != null) {
            return e11;
        }
        k(1);
        throw null;
    }
}
