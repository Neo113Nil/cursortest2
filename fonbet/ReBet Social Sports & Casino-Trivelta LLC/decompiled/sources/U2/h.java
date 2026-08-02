package U2;

import Q2.EnumC1509u;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(V2.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12029b = 7;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        EnumC1509u f10 = workSpec.constraints.f();
        if (f10 != EnumC1509u.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && f10 == EnumC1509u.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // U2.a
    public int e() {
        return this.f12029b;
    }

    @Override // U2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(androidx.work.impl.constraints.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a() || value.b();
    }
}
