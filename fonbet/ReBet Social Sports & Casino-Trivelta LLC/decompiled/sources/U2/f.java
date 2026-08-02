package U2;

import Q2.AbstractC1508t;
import Q2.EnumC1509u;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends U2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12023c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f12024d;

    /* renamed from: b, reason: collision with root package name */
    public final int f12025b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        String i10 = AbstractC1508t.i("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f12024d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(V2.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12025b = 7;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.f() == EnumC1509u.METERED;
    }

    @Override // U2.a
    public int e() {
        return this.f12025b;
    }

    @Override // U2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(androidx.work.impl.constraints.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.a() && value.b()) ? false : true;
        }
        AbstractC1508t.e().a(f12024d, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.a();
    }
}
