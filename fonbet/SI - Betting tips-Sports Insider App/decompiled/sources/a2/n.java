package a2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y1.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: g, reason: collision with root package name */
    public String f55g;

    @Override // y1.b0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof n) && super.equals(obj) && Intrinsics.areEqual(this.f55g, ((n) obj).f55g);
    }

    @Override // y1.b0
    public final void g(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.g(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, s.f64b);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f55g = className;
        }
        Unit unit = Unit.f19194a;
        obtainAttributes.recycle();
    }

    @Override // y1.b0
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f55g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y1.b0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.f55g;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
