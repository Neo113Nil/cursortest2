package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qd extends s6d {
    public Intent g;
    public String h;

    public static String r(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return c.r(str, "${applicationId}", packageName, false);
    }

    @Override // defpackage.s6d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qd) && super.equals(obj)) {
            Intent intent = this.g;
            if ((intent != null ? intent.filterEquals(((qd) obj).g) : ((qd) obj).g == null) && Intrinsics.c(this.h, ((qd) obj).h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s6d
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.g;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.h;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.s6d
    public final void o(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
        super.o(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, bkf.a);
        obtainAttributes.getClass();
        String r = r(context, obtainAttributes.getString(4));
        Intent intent = this.g;
        if (intent == null) {
            intent = new Intent();
            this.g = intent;
        }
        intent.setPackage(r);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            Intent intent2 = this.g;
            if (intent2 == null) {
                intent2 = new Intent();
                this.g = intent2;
            }
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        Intent intent3 = this.g;
        if (intent3 == null) {
            intent3 = new Intent();
            this.g = intent3;
        }
        intent3.setAction(string2);
        String r2 = r(context, obtainAttributes.getString(2));
        if (r2 != null) {
            Uri parse = Uri.parse(r2);
            Intent intent4 = this.g;
            if (intent4 == null) {
                intent4 = new Intent();
                this.g = intent4;
            }
            intent4.setData(parse);
        }
        this.h = r(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // defpackage.s6d
    public final String toString() {
        Intent intent = this.g;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.g;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
