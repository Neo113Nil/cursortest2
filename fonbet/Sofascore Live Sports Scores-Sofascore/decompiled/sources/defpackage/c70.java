package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c70 {
    public final ArrayList a;
    public final kn4 b;

    public c70(ArrayList arrayList, kn4 kn4Var) {
        this.a = arrayList;
        this.b = kn4Var;
    }

    public static u60 a(ImageDecoder.Source source, int i, int i2, uvd uvdVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new nr4(i, i2, uvdVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new u60((AnimatedImageDrawable) decodeDrawable);
        }
        yhk.u(decodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }
}
