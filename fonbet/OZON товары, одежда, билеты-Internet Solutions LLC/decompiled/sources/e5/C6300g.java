package e5;

import android.os.Build;
import androidx.work.p;
import d5.C6087b;
import g5.C6627B;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6300g extends AbstractC6296c<C6087b> {
    @Override // e5.AbstractC6296c
    public final boolean b(@NotNull C6627B workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        p d11 = workSpec.f63808j.d();
        if (d11 != p.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && d11 == p.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // e5.AbstractC6296c
    public final boolean c(C6087b c6087b) {
        C6087b value = c6087b;
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a() || value.b();
    }
}
