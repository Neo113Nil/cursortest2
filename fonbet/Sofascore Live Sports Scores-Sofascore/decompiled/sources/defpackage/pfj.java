package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pfj extends sw8 {
    public final TextView b;
    public final ua5 c;
    public final Integer d;

    public pfj(TextView textView, ua5 ua5Var, Integer num) {
        this.b = textView;
        this.c = ua5Var;
        this.d = num;
    }

    @Override // defpackage.sw8
    public final void a(Drawable drawable) {
        if (drawable != null) {
            drawable.getBounds().isEmpty();
            Integer num = this.d;
            drawable.setBounds(0, 0, num.intValue(), num.intValue());
        }
        haa.K(this.b, drawable, this.c, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pfj) {
            return this.b.equals(((pfj) obj).b);
        }
        return false;
    }

    @Override // defpackage.sw8, defpackage.kxj
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.sw8, defpackage.kxj
    public final Drawable n() {
        return this.b.getCompoundDrawablesRelative()[this.c.ordinal()];
    }
}
