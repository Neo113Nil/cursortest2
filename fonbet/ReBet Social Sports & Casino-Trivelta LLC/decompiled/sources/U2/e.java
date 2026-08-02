package U2;

import Q2.EnumC1509u;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(V2.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12022b = 7;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.f() == EnumC1509u.CONNECTED;
    }

    @Override // U2.a
    public int e() {
        return this.f12022b;
    }

    @Override // U2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(androidx.work.impl.constraints.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Build.VERSION.SDK_INT >= 26 ? (value.a() && value.d()) ? false : true : !value.a();
    }
}
