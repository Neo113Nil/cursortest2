package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ab5 implements bwj {
    @Override // defpackage.bwj
    public final e1g a(Context context, e1g e1gVar, int i, int i2) {
        dx1 dx1Var = a.a(context).a;
        Drawable drawable = (Drawable) e1gVar.get();
        ex1 N = ml4.N(dx1Var, drawable, i, i2);
        if (N != null) {
            N.c();
            return e1gVar;
        }
        sw9.o(drawable, " to a Bitmap", "Unable to convert ");
        return null;
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        return obj instanceof ab5;
    }

    @Override // defpackage.pia
    public final int hashCode() {
        return abk.b.hashCode();
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
    }
}
