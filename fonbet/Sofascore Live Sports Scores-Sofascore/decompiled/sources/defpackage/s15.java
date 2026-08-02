package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s15 extends s6d implements x88 {
    public String g;

    @Override // defpackage.s6d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof s15) && super.equals(obj) && Intrinsics.c(this.g, ((s15) obj).g);
    }

    @Override // defpackage.s6d
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.s6d
    public final void o(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
        super.o(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ijf.a);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.g = string;
        }
        obtainAttributes.recycle();
    }
}
