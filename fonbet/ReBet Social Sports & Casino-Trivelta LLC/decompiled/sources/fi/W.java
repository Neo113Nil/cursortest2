package fi;

import ai.AbstractC2028a;
import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f46743a = SetsKt.setOf((Object[]) new bi.f[]{AbstractC2028a.v(UInt.INSTANCE).getDescriptor(), AbstractC2028a.w(ULong.INSTANCE).getDescriptor(), AbstractC2028a.u(UByte.INSTANCE).getDescriptor(), AbstractC2028a.x(UShort.INSTANCE).getDescriptor()});

    public static final boolean a(bi.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && Intrinsics.areEqual(fVar, ei.j.n());
    }

    public static final boolean b(bi.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && f46743a.contains(fVar);
    }
}
