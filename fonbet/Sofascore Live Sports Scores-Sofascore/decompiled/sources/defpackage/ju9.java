package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ju9 extends sw8 {
    public final ImageView b;

    public ju9(ImageView imageView) {
        this.b = imageView;
    }

    @Override // defpackage.sw8
    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju9) && Intrinsics.c(this.b, ((ju9) obj).b);
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
        return this.b.getDrawable();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.b + ")";
    }
}
