package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c6k extends b6k {
    @Override // defpackage.b6k
    public final Font Z(yg8 yg8Var) {
        Font d;
        Uri uri = yg8Var.a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = yg8Var.e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = x5k.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
