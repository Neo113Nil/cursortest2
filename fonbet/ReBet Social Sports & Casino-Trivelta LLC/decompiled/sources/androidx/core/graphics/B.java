package androidx.core.graphics;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import v0.i;

/* loaded from: classes.dex */
public class B extends A {
    public static Typeface o(String str) {
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    @Override // androidx.core.graphics.A
    public Font m(i.b bVar) {
        Typeface o10;
        Font j10;
        String c10 = bVar.c();
        if (c10 == null || (o10 = o(c10)) == null || (j10 = v.j(o10)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return j10;
        }
        try {
            return new Font.Builder(j10).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
