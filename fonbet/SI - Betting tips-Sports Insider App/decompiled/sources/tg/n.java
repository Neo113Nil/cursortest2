package tg;

import androidx.appcompat.widget.c1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import sg.e1;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final sg.a0 f23953a;

    static {
        ci.c.X(StringCompanionObject.INSTANCE);
        f23953a = s0.a("kotlinx.serialization.json.JsonUnquotedLiteral", e1.f23623a);
    }

    public static final c0 a(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        c0 c0Var = mVar instanceof c0 ? (c0) mVar : null;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(mVar.getClass()) + " is not a JsonPrimitive");
    }

    public static final long b(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        String a7 = c0Var.a();
        ug.u uVar = new ug.u(a7);
        long h10 = uVar.h();
        if (uVar.e() == 10) {
            return h10;
        }
        int i5 = uVar.f24316a;
        int i10 = i5 - 1;
        ug.u.m(uVar, c1.n("Expected input to contain a single valid number, but got '", (i5 == a7.length() || i10 < 0) ? "EOF" : String.valueOf(a7.charAt(i10)), "' after it"), i10, null, 4);
        throw null;
    }
}
