package j5;

import B0.C2454a;
import androidx.work.o;
import g.C6594f;
import g5.C6627B;
import g5.C6637j;
import g5.InterfaceC6638k;
import g5.S;
import g5.U;
import g5.r;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7284b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f69453a;

    static {
        String i11 = o.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(i11, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f69453a = i11;
    }

    public static final String b(r rVar, U u11, InterfaceC6638k interfaceC6638k, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6627B c6627b = (C6627B) it.next();
            C6637j a11 = interfaceC6638k.a(S.a(c6627b));
            Integer valueOf = a11 != null ? Integer.valueOf(a11.f63859c) : null;
            String str = c6627b.f63799a;
            String V11 = C7714v.V(rVar.b(str), ",", null, null, null, 62);
            String V12 = C7714v.V(u11.c(str), ",", null, null, null, 62);
            StringBuilder b11 = C6594f.b("\n", str, "\t ");
            C2454a.f(valueOf, c6627b.f63801c, "\t ", "\t ", b11);
            b11.append(c6627b.f63800b.name());
            b11.append("\t ");
            b11.append(V11);
            b11.append("\t ");
            b11.append(V12);
            b11.append('\t');
            sb2.append(b11.toString());
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
