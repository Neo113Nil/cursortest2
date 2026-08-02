package he;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;
import td.d0;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;
import wd.V;

/* renamed from: he.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6926H extends V implements InterfaceC6932b {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Nd.h f65397E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final Pd.c f65398F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final Pd.g f65399G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final Pd.h f65400H;

    /* renamed from: I, reason: collision with root package name */
    private final v f65401I;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C6926H(@org.jetbrains.annotations.NotNull td.InterfaceC9845k r12, td.c0 r13, @org.jetbrains.annotations.NotNull ud.InterfaceC10030h r14, @org.jetbrains.annotations.NotNull Sd.f r15, @org.jetbrains.annotations.NotNull td.InterfaceC9836b.a r16, @org.jetbrains.annotations.NotNull Nd.h r17, @org.jetbrains.annotations.NotNull Pd.c r18, @org.jetbrains.annotations.NotNull Pd.g r19, @org.jetbrains.annotations.NotNull Pd.h r20, he.v r21, td.d0 r22) {
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
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
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
            if (r22 != 0) goto L3d
            td.d0 r0 = td.d0.f99392a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f65397E = r7
            r11.f65398F = r8
            r11.f65399G = r9
            r11.f65400H = r10
            r1 = r21
            r11.f65401I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: he.C6926H.<init>(td.k, td.c0, ud.h, Sd.f, td.b$a, Nd.h, Pd.c, Pd.g, Pd.h, he.v, td.d0):void");
    }

    @Override // he.w
    @NotNull
    public final Pd.g A() {
        return this.f65399G;
    }

    @Override // wd.V, wd.AbstractC10539z
    @NotNull
    protected final AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a kind, @NotNull InterfaceC9845k newOwner, InterfaceC9857w interfaceC9857w, @NotNull d0 source, @NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        c0 c0Var = (c0) interfaceC9857w;
        if (fVar == null) {
            fVar = getName();
            Intrinsics.checkNotNullExpressionValue(fVar, "getName(...)");
        }
        C6926H c6926h = new C6926H(newOwner, c0Var, annotations, fVar, kind, this.f65397E, this.f65398F, this.f65399G, this.f65400H, this.f65401I, source);
        c6926h.R0(K0());
        return c6926h;
    }

    @Override // he.w
    public final Td.p L() {
        return this.f65397E;
    }

    @Override // he.w
    @NotNull
    public final Pd.c a0() {
        return this.f65398F;
    }

    @Override // he.w
    public final v b0() {
        return this.f65401I;
    }
}
