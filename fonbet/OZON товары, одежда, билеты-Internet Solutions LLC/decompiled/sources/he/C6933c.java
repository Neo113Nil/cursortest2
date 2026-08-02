package he;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.d0;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;
import wd.C10528n;

/* renamed from: he.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6933c extends C10528n implements InterfaceC6932b {

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final Nd.c f65417F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final Pd.c f65418G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final Pd.g f65419H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final Pd.h f65420I;

    /* renamed from: J, reason: collision with root package name */
    private final v f65421J;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C6933c(@org.jetbrains.annotations.NotNull td.InterfaceC9839e r12, td.InterfaceC9844j r13, @org.jetbrains.annotations.NotNull ud.InterfaceC10030h r14, boolean r15, @org.jetbrains.annotations.NotNull td.InterfaceC9836b.a r16, @org.jetbrains.annotations.NotNull Nd.c r17, @org.jetbrains.annotations.NotNull Pd.c r18, @org.jetbrains.annotations.NotNull Pd.g r19, @org.jetbrains.annotations.NotNull Pd.h r20, he.v r21, td.d0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r22 != 0) goto L38
            td.d0 r0 = td.d0.f99392a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f65417F = r7
            r11.f65418G = r8
            r11.f65419H = r9
            r11.f65420I = r10
            r1 = r21
            r11.f65421J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: he.C6933c.<init>(td.e, td.j, ud.h, boolean, td.b$a, Nd.c, Pd.c, Pd.g, Pd.h, he.v, td.d0):void");
    }

    @Override // he.w
    @NotNull
    public final Pd.g A() {
        return this.f65419H;
    }

    @Override // wd.C10528n, wd.AbstractC10539z
    public final /* bridge */ /* synthetic */ AbstractC10539z G0(Sd.f fVar, InterfaceC9836b.a aVar, InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, d0 d0Var, InterfaceC10030h interfaceC10030h) {
        return f1(interfaceC9845k, interfaceC9857w, aVar, interfaceC10030h, d0Var);
    }

    @Override // he.w
    public final Td.p L() {
        return this.f65417F;
    }

    @Override // he.w
    @NotNull
    public final Pd.c a0() {
        return this.f65418G;
    }

    @Override // he.w
    public final v b0() {
        return this.f65421J;
    }

    @Override // wd.C10528n
    /* renamed from: b1 */
    public final /* bridge */ /* synthetic */ C10528n G0(Sd.f fVar, InterfaceC9836b.a aVar, InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, d0 d0Var, InterfaceC10030h interfaceC10030h) {
        return f1(interfaceC9845k, interfaceC9857w, aVar, interfaceC10030h, d0Var);
    }

    @NotNull
    protected final C6933c f1(@NotNull InterfaceC9845k newOwner, InterfaceC9857w interfaceC9857w, @NotNull InterfaceC9836b.a kind, @NotNull InterfaceC10030h annotations, @NotNull d0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        C6933c c6933c = new C6933c((InterfaceC9839e) newOwner, (InterfaceC9844j) interfaceC9857w, annotations, this.f104314E, kind, this.f65417F, this.f65418G, this.f65419H, this.f65420I, this.f65421J, source);
        c6933c.R0(K0());
        return c6933c;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9811B
    public final boolean isExternal() {
        return false;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    public final boolean isInline() {
        return false;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    public final boolean isSuspend() {
        return false;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9857w
    public final boolean y() {
        return false;
    }
}
