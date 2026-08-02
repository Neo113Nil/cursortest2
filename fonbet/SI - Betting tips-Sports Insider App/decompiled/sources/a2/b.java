package a2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import y1.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends b0 implements y1.g {

    /* renamed from: g, reason: collision with root package name */
    public String f22g;

    @Override // y1.b0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof b) && super.equals(obj) && Intrinsics.areEqual(this.f22g, ((b) obj).f22g);
    }

    @Override // y1.b0
    public final void g(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.g(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, s.f63a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
        String className = obtainAttributes.getString(0);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f22g = className;
        }
        obtainAttributes.recycle();
    }

    @Override // y1.b0
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f22g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
