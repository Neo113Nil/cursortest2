package j3;

import android.os.Build;
import e3.x;
import e3.y;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18253c;

    /* renamed from: b, reason: collision with root package name */
    public final int f18254b;

    static {
        String g10 = x.g("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f18253c = g10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k3.f tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18254b = 7;
    }

    @Override // j3.d
    public final boolean b(o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.f8506a == y.f8576e;
    }

    @Override // j3.b
    public final int d() {
        return this.f18254b;
    }

    @Override // j3.b
    public final boolean e(Object obj) {
        i3.f value = (i3.f) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.f10908a && value.f10910c) ? false : true;
        }
        x.e().a(f18253c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.f10908a;
    }
}
