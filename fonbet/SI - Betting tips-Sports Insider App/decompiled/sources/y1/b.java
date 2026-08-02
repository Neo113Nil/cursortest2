package y1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: g, reason: collision with root package name */
    public Intent f25530g;

    /* renamed from: h, reason: collision with root package name */
    public String f25531h;

    public static String h(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return kotlin.text.z.m(str, "${applicationId}", packageName);
    }

    @Override // y1.b0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b) && super.equals(obj)) {
            Intent intent = this.f25530g;
            if ((intent != null ? intent.filterEquals(((b) obj).f25530g) : ((b) obj).f25530g == null) && Intrinsics.areEqual(this.f25531h, ((b) obj).f25531h)) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.b0
    public final void g(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.g(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, w0.f25645a);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
        String h10 = h(context, obtainAttributes.getString(4));
        if (this.f25530g == null) {
            this.f25530g = new Intent();
        }
        Intent intent = this.f25530g;
        Intrinsics.checkNotNull(intent);
        intent.setPackage(h10);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f25530g == null) {
                this.f25530g = new Intent();
            }
            Intent intent2 = this.f25530g;
            Intrinsics.checkNotNull(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.f25530g == null) {
            this.f25530g = new Intent();
        }
        Intent intent3 = this.f25530g;
        Intrinsics.checkNotNull(intent3);
        intent3.setAction(string2);
        String h11 = h(context, obtainAttributes.getString(2));
        if (h11 != null) {
            Uri parse = Uri.parse(h11);
            if (this.f25530g == null) {
                this.f25530g = new Intent();
            }
            Intent intent4 = this.f25530g;
            Intrinsics.checkNotNull(intent4);
            intent4.setData(parse);
        }
        this.f25531h = h(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // y1.b0
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f25530g;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f25531h;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y1.b0
    public final String toString() {
        Intent intent = this.f25530g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (component != null) {
            sb2.append(" class=");
            sb2.append(component.getClassName());
        } else {
            Intent intent2 = this.f25530g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb2.append(" action=");
                sb2.append(action);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
