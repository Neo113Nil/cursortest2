package e5;

import androidx.work.o;
import androidx.work.p;
import d5.C6087b;
import g5.C6627B;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6299f extends AbstractC6296c<C6087b> {
    static {
        Intrinsics.checkNotNullExpressionValue(o.i("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // e5.AbstractC6296c
    public final boolean b(@NotNull C6627B workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f63808j.d() == p.NOT_ROAMING;
    }

    @Override // e5.AbstractC6296c
    public final boolean c(C6087b c6087b) {
        C6087b value = c6087b;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
