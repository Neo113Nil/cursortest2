package qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.InterfaceC9035f;

/* renamed from: qe.D, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9029D implements InterfaceC9035f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f81940a;

    /* renamed from: qe.D$a */
    public static final class a extends AbstractC9029D {

        /* renamed from: b, reason: collision with root package name */
        private final int f81941b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i11) {
            super(r0.toString());
            StringBuilder f7 = P4.f.f(i11, "must have at least ", " value parameter");
            f7.append(i11 > 1 ? "s" : "");
            this.f81941b = i11;
        }

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.f().size() >= this.f81941b;
        }
    }

    /* renamed from: qe.D$b */
    public static final class b extends AbstractC9029D {

        /* renamed from: b, reason: collision with root package name */
        private final int f81942b;

        public b() {
            super("must have exactly 2 value parameters");
            this.f81942b = 2;
        }

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.f().size() == this.f81942b;
        }
    }

    /* renamed from: qe.D$c */
    public static final class c extends AbstractC9029D {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f81943b = new c("must have no value parameters");

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.f().isEmpty();
        }
    }

    /* renamed from: qe.D$d */
    public static final class d extends AbstractC9029D {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f81944b = new d("must have a single value parameter");

        @Override // qe.InterfaceC9035f
        public final boolean a(@NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.f().size() == 1;
        }
    }

    public AbstractC9029D(String str) {
        this.f81940a = str;
    }

    @Override // qe.InterfaceC9035f
    public final String b(@NotNull Ed.e eVar) {
        return InterfaceC9035f.a.a(this, eVar);
    }

    @Override // qe.InterfaceC9035f
    @NotNull
    public final String getDescription() {
        return this.f81940a;
    }
}
