package qd;

import Sc.InterfaceC4008j;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BOOLEAN;
    public static final p BYTE;
    public static final p CHAR;

    @NotNull
    public static final a Companion;
    public static final p DOUBLE;
    public static final p FLOAT;
    public static final p INT;
    public static final p LONG;

    @NotNull
    public static final Set<p> NUMBER_TYPES;
    public static final p SHORT;

    @NotNull
    private final InterfaceC4008j arrayTypeFqName$delegate;

    @NotNull
    private final Sd.f arrayTypeName;

    @NotNull
    private final InterfaceC4008j typeFqName$delegate;

    @NotNull
    private final Sd.f typeName;

    public static final class a {
    }

    static {
        p pVar = new p("BOOLEAN", 0, "Boolean");
        BOOLEAN = pVar;
        p pVar2 = new p("CHAR", 1, "Char");
        CHAR = pVar2;
        p pVar3 = new p("BYTE", 2, "Byte");
        BYTE = pVar3;
        p pVar4 = new p("SHORT", 3, "Short");
        SHORT = pVar4;
        p pVar5 = new p("INT", 4, "Int");
        INT = pVar5;
        p pVar6 = new p("FLOAT", 5, "Float");
        FLOAT = pVar6;
        p pVar7 = new p("LONG", 6, "Long");
        LONG = pVar7;
        p pVar8 = new p("DOUBLE", 7, "Double");
        DOUBLE = pVar8;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8};
        $VALUES = pVarArr;
        $ENTRIES = Xc.b.a(pVarArr);
        Companion = new a();
        p[] elements = {pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8};
        Intrinsics.checkNotNullParameter(elements, "elements");
        NUMBER_TYPES = C7705l.j0(elements);
    }

    private p(String str, int i11, String str2) {
        Sd.f f7 = Sd.f.f(str2);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        this.typeName = f7;
        Sd.f f11 = Sd.f.f(str2.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        this.arrayTypeName = f11;
        Sc.n nVar = Sc.n.PUBLICATION;
        this.typeFqName$delegate = Sc.k.a(nVar, new n(this));
        this.arrayTypeFqName$delegate = Sc.k.a(nVar, new o(this));
    }

    static Sd.c a(p pVar) {
        Sd.c c11 = s.f81865l.c(pVar.typeName);
        Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
        return c11;
    }

    static Sd.c b(p pVar) {
        Sd.c c11 = s.f81865l.c(pVar.arrayTypeName);
        Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
        return c11;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    @NotNull
    public final Sd.c d() {
        return (Sd.c) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final Sd.f e() {
        return this.arrayTypeName;
    }

    @NotNull
    public final Sd.c f() {
        return (Sd.c) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final Sd.f g() {
        return this.typeName;
    }
}
