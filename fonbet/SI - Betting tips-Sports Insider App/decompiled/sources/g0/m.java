package g0;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends l {
    @Override // g0.l
    public final Font J(m0.i iVar) {
        Font d10;
        Uri uri = iVar.f20130a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = iVar.f20134e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d10 = g.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d10;
                }
                try {
                    return new Font.Builder(d10).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    w0.d("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
