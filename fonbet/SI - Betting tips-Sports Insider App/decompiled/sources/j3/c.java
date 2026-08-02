package j3;

import android.os.Build;
import e3.y;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k3.a tracker) {
        super(tracker);
        this.f18251b = 0;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18252c = 6;
    }

    @Override // j3.d
    public final boolean b(o workSpec) {
        switch (this.f18251b) {
            case 0:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f8508c;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f8510e;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f8506a == y.f8573b;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                y yVar = workSpec.j.f8506a;
                return yVar == y.f8574c || (Build.VERSION.SDK_INT >= 30 && yVar == y.f8577f);
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f8511f;
        }
    }

    @Override // j3.b
    public final int d() {
        switch (this.f18251b) {
        }
        return this.f18252c;
    }

    @Override // j3.b
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.f18251b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                i3.f value = (i3.f) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return Build.VERSION.SDK_INT < 26 ? !value.f10908a : !(value.f10908a && value.f10909b);
            case 3:
                i3.f value2 = (i3.f) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return !value2.f10908a || value2.f10910c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k3.a tracker, byte b10) {
        super(tracker);
        this.f18251b = 1;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18252c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k3.a tracker, char c2) {
        super(tracker);
        this.f18251b = 4;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18252c = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k3.f tracker, int i5) {
        super(tracker);
        this.f18251b = i5;
        switch (i5) {
            case 3:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                super(tracker);
                this.f18252c = 7;
                break;
            default:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                this.f18252c = 7;
                break;
        }
    }
}
