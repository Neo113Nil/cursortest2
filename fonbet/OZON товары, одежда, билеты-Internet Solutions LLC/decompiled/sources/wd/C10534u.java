package wd;

import Bd.InterfaceC2627a;
import ce.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ie.InterfaceC7059h;
import ie.InterfaceC7061j;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import je.AbstractC7394n;
import je.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9831W;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.i0;
import td.n0;
import ud.InterfaceC10030h;

/* renamed from: wd.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10534u extends AbstractC10529o {

    /* renamed from: g, reason: collision with root package name */
    private final je.r f104328g;

    /* renamed from: h, reason: collision with root package name */
    private final ce.l f104329h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC7061j<Set<Sd.f>> f104330i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC10030h f104331j;

    /* renamed from: wd.u$a */
    private class a extends ce.m {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC7059h<Sd.f, Collection<? extends td.c0>> f104332b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC7059h<Sd.f, Collection<? extends InterfaceC9831W>> f104333c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC7061j<Collection<InterfaceC9845k>> f104334d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C10534u f104335e;

        /* renamed from: wd.u$a$a, reason: collision with other inner class name */
        final class C2255a implements Function1<Sd.f, Collection<? extends td.c0>> {
            C2255a() {
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<? extends td.c0> invoke(Sd.f fVar) {
                return a.i(a.this, fVar);
            }
        }

        /* renamed from: wd.u$a$b */
        final class b implements Function1<Sd.f, Collection<? extends InterfaceC9831W>> {
            b() {
            }

            @Override // kotlin.jvm.functions.Function1
            public final Collection<? extends InterfaceC9831W> invoke(Sd.f fVar) {
                return a.j(a.this, fVar);
            }
        }

        /* renamed from: wd.u$a$c */
        final class c implements Function0<Collection<InterfaceC9845k>> {
            c() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<InterfaceC9845k> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (Sd.f fVar : (Set) aVar.f104335e.f104330i.invoke()) {
                    Bd.c cVar = Bd.c.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.g(fVar, cVar));
                    hashSet.addAll(aVar.b(fVar, cVar));
                }
                return hashSet;
            }
        }

        public a(@NotNull C10534u c10534u, ie.o oVar) {
            if (oVar == null) {
                h(0);
                throw null;
            }
            this.f104335e = c10534u;
            this.f104332b = oVar.d(new C2255a());
            this.f104333c = oVar.d(new b());
            this.f104334d = oVar.a(new c());
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void h(int i11) {
            String str;
            int i12;
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
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
                if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
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
                        case 4:
                        case 5:
                        case 8:
                        case 10:
                            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                            break;
                        case 2:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case 14:
                            objArr[0] = "nameFilter";
                            break;
                        case 20:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i11 != 3) {
                        objArr[1] = "getContributedVariables";
                    } else if (i11 == 7) {
                        objArr[1] = "getContributedFunctions";
                    } else if (i11 == 9) {
                        objArr[1] = "getSupertypeScope";
                    } else if (i11 != 12) {
                        switch (i11) {
                            case 15:
                                objArr[1] = "getContributedDescriptors";
                                break;
                            case 16:
                                objArr[1] = "computeAllDeclarations";
                                break;
                            case 17:
                                objArr[1] = "getFunctionNames";
                                break;
                            case 18:
                                objArr[1] = "getClassifierNames";
                                break;
                            case 19:
                                objArr[1] = "getVariableNames";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
                        objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i11) {
                        case 1:
                        case 2:
                            objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 4:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case 10:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case 20:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    String format = String.format(str, objArr);
                    if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
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
                if (i11 != 3) {
                }
                switch (i11) {
                }
                String format2 = String.format(str, objArr2);
                if (i11 != 3) {
                    switch (i11) {
                    }
                }
                throw new IllegalStateException(format2);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i11 != 3) {
                switch (i11) {
                }
                Object[] objArr22 = new Object[i12];
                switch (i11) {
                }
                if (i11 != 3) {
                }
                switch (i11) {
                }
                String format22 = String.format(str, objArr22);
                if (i11 != 3) {
                }
                throw new IllegalStateException(format22);
            }
            i12 = 2;
            Object[] objArr222 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 3) {
            }
            switch (i11) {
            }
            String format222 = String.format(str, objArr222);
            if (i11 != 3) {
            }
            throw new IllegalStateException(format222);
        }

        static LinkedHashSet i(a aVar, Sd.f fVar) {
            if (fVar != null) {
                return aVar.l(fVar, aVar.k().g(fVar, Bd.c.FOR_NON_TRACKED_SCOPE));
            }
            aVar.getClass();
            h(8);
            throw null;
        }

        static LinkedHashSet j(a aVar, Sd.f fVar) {
            if (fVar != null) {
                return aVar.l(fVar, aVar.k().b(fVar, Bd.c.FOR_NON_TRACKED_SCOPE));
            }
            aVar.getClass();
            h(4);
            throw null;
        }

        @NotNull
        private ce.l k() {
            ce.l p11 = ((AbstractC7394n) this.f104335e.k()).o().iterator().next().p();
            if (p11 != null) {
                return p11;
            }
            h(9);
            throw null;
        }

        @NotNull
        private LinkedHashSet l(@NotNull Sd.f fVar, @NotNull Collection collection) {
            if (fVar == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Vd.n.f28546e.j(fVar, collection, Collections.EMPTY_SET, this.f104335e, new C10535v(linkedHashSet));
            return linkedHashSet;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> a() {
            Set<Sd.f> set = (Set) this.f104335e.f104330i.invoke();
            if (set != null) {
                return set;
            }
            h(17);
            throw null;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Collection b(@NotNull Sd.f fVar, @NotNull Bd.c cVar) {
            if (fVar == null) {
                h(1);
                throw null;
            }
            if (cVar == null) {
                h(2);
                throw null;
            }
            Collection<? extends InterfaceC9831W> invoke = this.f104333c.invoke(fVar);
            if (invoke != null) {
                return invoke;
            }
            h(3);
            throw null;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> c() {
            Set<Sd.f> set = (Set) this.f104335e.f104330i.invoke();
            if (set != null) {
                return set;
            }
            h(19);
            throw null;
        }

        @Override // ce.m, ce.o
        @NotNull
        public final Collection<InterfaceC9845k> e(@NotNull ce.d dVar, @NotNull Function1<? super Sd.f, Boolean> function1) {
            if (dVar == null) {
                h(13);
                throw null;
            }
            Collection<InterfaceC9845k> invoke = this.f104334d.invoke();
            if (invoke != null) {
                return invoke;
            }
            h(15);
            throw null;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> f() {
            Set<Sd.f> set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Collection<? extends td.c0> g(@NotNull Sd.f fVar, @NotNull InterfaceC2627a interfaceC2627a) {
            if (fVar == null) {
                h(5);
                throw null;
            }
            if (interfaceC2627a == null) {
                h(6);
                throw null;
            }
            Collection<? extends td.c0> invoke = this.f104332b.invoke(fVar);
            if (invoke != null) {
                return invoke;
            }
            h(7);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10534u(@NotNull ie.o oVar, @NotNull AbstractC10516b abstractC10516b, @NotNull je.Y y11, @NotNull Sd.f fVar, @NotNull InterfaceC7061j interfaceC7061j, @NotNull InterfaceC10030h interfaceC10030h, @NotNull td.d0 d0Var) {
        super(oVar, abstractC10516b, fVar, d0Var);
        if (oVar == null) {
            n0(6);
            throw null;
        }
        if (abstractC10516b == null) {
            n0(7);
            throw null;
        }
        if (y11 == null) {
            n0(8);
            throw null;
        }
        if (fVar == null) {
            n0(9);
            throw null;
        }
        if (interfaceC7061j == null) {
            n0(10);
            throw null;
        }
        if (d0Var == null) {
            n0(12);
            throw null;
        }
        this.f104331j = interfaceC10030h;
        this.f104328g = new je.r(this, Collections.EMPTY_LIST, Collections.singleton(y11), oVar);
        this.f104329h = new a(this, oVar);
        this.f104330i = interfaceC7061j;
    }

    @NotNull
    public static C10534u G0(@NotNull ie.o oVar, @NotNull AbstractC10516b abstractC10516b, @NotNull Sd.f fVar, @NotNull InterfaceC7061j interfaceC7061j, @NotNull InterfaceC10030h interfaceC10030h, @NotNull td.d0 d0Var) {
        if (oVar == null) {
            n0(0);
            throw null;
        }
        if (abstractC10516b == null) {
            n0(1);
            throw null;
        }
        if (fVar == null) {
            n0(2);
            throw null;
        }
        if (interfaceC7061j == null) {
            n0(3);
            throw null;
        }
        if (d0Var != null) {
            return new C10534u(oVar, abstractC10516b, abstractC10516b.q(), fVar, interfaceC7061j, interfaceC10030h, d0Var);
        }
        n0(5);
        throw null;
    }

    private static /* synthetic */ void n0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return false;
    }

    @Override // wd.G
    @NotNull
    public final ce.l V(@NotNull ke.h hVar) {
        if (hVar == null) {
            n0(13);
            throw null;
        }
        ce.l lVar = this.f104329h;
        if (lVar != null) {
            return lVar;
        }
        n0(14);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final n0<je.Y> e0() {
        return null;
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return false;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        InterfaceC10030h interfaceC10030h = this.f104331j;
        if (interfaceC10030h != null) {
            return interfaceC10030h;
        }
        n0(21);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        EnumC9840f enumC9840f = EnumC9840f.ENUM_ENTRY;
        if (enumC9840f != null) {
            return enumC9840f;
        }
        n0(18);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = C9852r.f99403e;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        n0(20);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = EnumC9812C.FINAL;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        n0(19);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return false;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        je.r rVar = this.f104328g;
        if (rVar != null) {
            return rVar;
        }
        n0(17);
        throw null;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9838d> l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(16);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9839e> m() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(23);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l q0() {
        l.b bVar = l.b.f57046b;
        if (bVar != null) {
            return bVar;
        }
        n0(15);
        throw null;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        List<i0> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(22);
        throw null;
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9839e r0() {
        return null;
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return null;
    }
}
