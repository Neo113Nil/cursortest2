package wd;

import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import je.F0;
import le.C7938a;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9857w;
import ud.InterfaceC10030h;

/* renamed from: wd.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10528n extends AbstractC10539z implements InterfaceC9838d {

    /* renamed from: E, reason: collision with root package name */
    protected final boolean f104314E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C10528n(@NotNull InterfaceC9839e interfaceC9839e, InterfaceC9844j interfaceC9844j, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull InterfaceC9836b.a aVar, @NotNull td.d0 d0Var) {
        super(Sd.h.f26148e, aVar, interfaceC9839e, interfaceC9844j, d0Var, interfaceC10030h);
        if (interfaceC9839e == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (aVar == null) {
            N(2);
            throw null;
        }
        if (d0Var == null) {
            N(3);
            throw null;
        }
        this.f104314E = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        if (i11 != 21 && i11 != 27) {
            switch (i11) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i11 != 21 && i11 != 27) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i12 = 3;
                        break;
                }
                Object[] objArr = new Object[i12];
                switch (i11) {
                    case 1:
                    case 5:
                    case 8:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i11 != 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i11 != 27) {
                    switch (i11) {
                        case 15:
                        case 16:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case 17:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i11) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 21 && i11 != 27) {
                    switch (i11) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            Object[] objArr2 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 21) {
            }
            switch (i11) {
            }
            String format2 = String.format(str, objArr2);
            if (i11 != 21) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 21) {
            switch (i11) {
            }
            Object[] objArr22 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 21) {
            }
            switch (i11) {
            }
            String format22 = String.format(str, objArr22);
            if (i11 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        Object[] objArr222 = new Object[i12];
        switch (i11) {
        }
        if (i11 != 21) {
        }
        switch (i11) {
        }
        String format222 = String.format(str, objArr222);
        if (i11 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @NotNull
    public static C10528n a1(@NotNull C7938a c7938a, @NotNull InterfaceC10030h.a.C2208a c2208a) {
        return new C10528n(c7938a, null, c2208a, true, InterfaceC9836b.a.DECLARATION, td.d0.f99392a);
    }

    @Override // wd.AbstractC10539z
    @NotNull
    /* renamed from: F0 */
    public final InterfaceC9857w u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        return (InterfaceC9838d) super.u(interfaceC9839e, enumC9812C, abstractC9850p, aVar);
    }

    @Override // td.InterfaceC9844j
    @NotNull
    public final InterfaceC9839e K() {
        InterfaceC9839e d11 = d();
        if (d11 != null) {
            return d11;
        }
        N(18);
        throw null;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9836b
    public final void S(@NotNull Collection<? extends InterfaceC9836b> collection) {
        if (collection != null) {
            return;
        }
        N(22);
        throw null;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.b(this, d11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wd.AbstractC10539z
    @NotNull
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C10528n G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull td.d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        if (interfaceC9845k == null) {
            N(23);
            throw null;
        }
        if (aVar == null) {
            N(24);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(25);
            throw null;
        }
        InterfaceC9836b.a aVar2 = InterfaceC9836b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC9836b.a.SYNTHESIZED) {
            return new C10528n((InterfaceC9839e) interfaceC9845k, this, interfaceC10030h, this.f104314E, aVar2, d0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC9845k + "\nkind: " + aVar);
    }

    @Override // wd.AbstractC10532s, td.InterfaceC9845k
    @NotNull
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9839e d() {
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) super.d();
        if (interfaceC9839e != null) {
            return interfaceC9839e;
        }
        N(17);
        throw null;
    }

    public final void d1(@NotNull List list, @NotNull AbstractC9853s abstractC9853s) {
        if (list == null) {
            N(13);
            throw null;
        }
        if (abstractC9853s != null) {
            e1(list, abstractC9853s, d().r());
        } else {
            N(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(@NotNull List list, @NotNull AbstractC9853s abstractC9853s, @NotNull List list2) {
        InterfaceC9834Z interfaceC9834Z;
        InterfaceC9839e d11;
        List<InterfaceC9834Z> list3;
        if (list == null) {
            N(10);
            throw null;
        }
        if (abstractC9853s == null) {
            N(11);
            throw null;
        }
        if (list2 == null) {
            N(12);
            throw null;
        }
        InterfaceC9839e d12 = d();
        if (d12.g()) {
            InterfaceC9845k d13 = d12.d();
            if (d13 instanceof InterfaceC9839e) {
                interfaceC9834Z = ((InterfaceC9839e) d13).W();
                d11 = d();
                if (d11.h0().isEmpty()) {
                    list3 = d11.h0();
                    if (list3 == null) {
                        N(15);
                        throw null;
                    }
                } else {
                    list3 = Collections.EMPTY_LIST;
                    if (list3 == null) {
                        N(16);
                        throw null;
                    }
                }
                L0(null, interfaceC9834Z, list3, list2, list, null, EnumC9812C.FINAL, abstractC9853s);
            }
        }
        interfaceC9834Z = null;
        d11 = d();
        if (d11.h0().isEmpty()) {
        }
        L0(null, interfaceC9834Z, list3, list2, list, null, EnumC9812C.FINAL, abstractC9853s);
    }

    @Override // td.InterfaceC9844j
    public final boolean k0() {
        return this.f104314E;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9836b, td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9857w> o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        N(21);
        throw null;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        return (InterfaceC9838d) super.u(interfaceC9839e, enumC9812C, abstractC9850p, aVar);
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w, td.f0
    /* renamed from: b */
    public final InterfaceC9838d b2(@NotNull F0 f02) {
        if (f02 != null) {
            return (InterfaceC9838d) super.b2(f02);
        }
        N(20);
        throw null;
    }

    @Override // wd.AbstractC10539z, wd.AbstractC10532s
    @NotNull
    /* renamed from: a */
    public final InterfaceC9838d n0() {
        InterfaceC9838d interfaceC9838d = (InterfaceC9838d) super.n0();
        if (interfaceC9838d != null) {
            return interfaceC9838d;
        }
        N(19);
        throw null;
    }
}
