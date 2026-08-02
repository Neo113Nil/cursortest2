package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zx8 implements bwj {
    @Override // defpackage.bwj
    public final e1g a(Context context, e1g e1gVar, int i, int i2) {
        xx8 xx8Var = (xx8) e1gVar.get();
        dx1 dx1Var = a.a(context).a;
        Bitmap bitmap = ((dy8) xx8Var.a.b).m;
        w1a.m(bitmap, "Bitmap must not be null");
        w1a.m(dx1Var, "BitmapPool must not be null");
        ((dy8) xx8Var.a.b).c(bitmap);
        return e1gVar;
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        return obj instanceof zx8;
    }

    @Override // defpackage.pia
    public final int hashCode() {
        return abk.b.hashCode();
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
    }
}
