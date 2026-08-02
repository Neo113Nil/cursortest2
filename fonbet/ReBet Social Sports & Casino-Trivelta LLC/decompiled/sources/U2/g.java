package U2;

import Q2.AbstractC1508t;
import Q2.EnumC1509u;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends U2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12026c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f12027d;

    /* renamed from: b, reason: collision with root package name */
    public final int f12028b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        String i10 = AbstractC1508t.i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f12027d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(V2.h tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12028b = 7;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.f() == EnumC1509u.NOT_ROAMING;
    }

    @Override // U2.a
    public int e() {
        return this.f12028b;
    }

    @Override // U2.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(androidx.work.impl.constraints.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a() && value.c()) ? false : true;
    }
}
