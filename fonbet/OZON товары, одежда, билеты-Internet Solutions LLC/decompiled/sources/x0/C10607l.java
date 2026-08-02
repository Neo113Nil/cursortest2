package x0;

import B1.C2545n;
import B1.InterfaceC2544m;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import x0.C10606k;

/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10607l implements C1.j<InterfaceC2544m>, InterfaceC2544m {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f104775e = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10609n f104776a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10606k f104777b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z1.s f104778c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f104779d;

    /* renamed from: x0.l$a */
    public static final class a implements InterfaceC2544m.a {
        @Override // B1.InterfaceC2544m.a
        public final boolean a() {
            return false;
        }
    }

    /* renamed from: x0.l$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104780a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f104780a = iArr;
        }
    }

    /* renamed from: x0.l$c */
    /* loaded from: classes8.dex */
    public static final class c implements InterfaceC2544m.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<C10606k.a> f104782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f104783c;

        c(kotlin.jvm.internal.M<C10606k.a> m11, int i11) {
            this.f104782b = m11;
            this.f104783c = i11;
        }

        @Override // B1.InterfaceC2544m.a
        public final boolean a() {
            return C10607l.this.c(this.f104782b.f71787a, this.f104783c);
        }
    }

    public C10607l(@NotNull InterfaceC10609n interfaceC10609n, @NotNull C10606k c10606k, @NotNull Z1.s sVar, @NotNull EnumC9142v enumC9142v) {
        this.f104776a = interfaceC10609n;
        this.f104777b = c10606k;
        this.f104778c = sVar;
        this.f104779d = enumC9142v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r3 == r0.EnumC9142v.Vertical) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3 == r0.EnumC9142v.Horizontal) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(C10606k.a aVar, int i11) {
        boolean z11;
        boolean a11 = InterfaceC2544m.b.a(i11, 5) ? true : InterfaceC2544m.b.a(i11, 6);
        EnumC9142v enumC9142v = this.f104779d;
        if (!a11) {
            if (!(InterfaceC2544m.b.a(i11, 3) ? true : InterfaceC2544m.b.a(i11, 4))) {
                if (!(InterfaceC2544m.b.a(i11, 1) ? true : InterfaceC2544m.b.a(i11, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            }
            z11 = false;
        }
        return !z11 && (!d(i11) ? aVar.b() <= 0 : aVar.a() >= this.f104776a.getItemCount() - 1);
    }

    private final boolean d(int i11) {
        if (InterfaceC2544m.b.a(i11, 1)) {
            return false;
        }
        if (!InterfaceC2544m.b.a(i11, 2)) {
            if (!InterfaceC2544m.b.a(i11, 5)) {
                if (!InterfaceC2544m.b.a(i11, 6)) {
                    boolean a11 = InterfaceC2544m.b.a(i11, 3);
                    Z1.s sVar = this.f104778c;
                    if (a11) {
                        int i12 = b.f104780a[sVar.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new Sc.o();
                            }
                        }
                    } else {
                        if (!InterfaceC2544m.b.a(i11, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int i13 = b.f104780a[sVar.ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                throw new Sc.o();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // B1.InterfaceC2544m
    public final <T> T a(int i11, @NotNull Function1<? super InterfaceC2544m.a, ? extends T> function1) {
        InterfaceC10609n interfaceC10609n = this.f104776a;
        if (interfaceC10609n.getItemCount() <= 0 || !interfaceC10609n.c()) {
            return function1.invoke(f104775e);
        }
        int d11 = d(i11) ? interfaceC10609n.d() : interfaceC10609n.b();
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        C10606k c10606k = this.f104777b;
        m11.f71787a = (T) c10606k.a(d11, d11);
        T t2 = null;
        while (t2 == null && c((C10606k.a) m11.f71787a, i11)) {
            C10606k.a aVar = (C10606k.a) m11.f71787a;
            int b11 = aVar.b();
            int a11 = aVar.a();
            if (d(i11)) {
                a11++;
            } else {
                b11--;
            }
            T t11 = (T) c10606k.a(b11, a11);
            c10606k.e((C10606k.a) m11.f71787a);
            m11.f71787a = t11;
            interfaceC10609n.a();
            t2 = function1.invoke(new c(m11, i11));
        }
        c10606k.e((C10606k.a) m11.f71787a);
        interfaceC10609n.a();
        return t2;
    }

    @Override // C1.j
    @NotNull
    public final C1.m<InterfaceC2544m> getKey() {
        return C2545n.a();
    }

    @Override // C1.j
    public final InterfaceC2544m getValue() {
        return this;
    }
}
