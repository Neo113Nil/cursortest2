package g0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import io.sentry.android.core.w0;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l extends a.a {
    public static Font H(FontFamily fontFamily, int i5) {
        FontStyle fontStyle = new FontStyle((i5 & 1) != 0 ? 700 : 400, (i5 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int K = K(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int K2 = K(fontStyle, font2.getStyle());
            if (K2 < K) {
                font = font2;
                K = K2;
            }
        }
        return font;
    }

    public static int K(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily I(m0.i[] iVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (m0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f20130a.getScheme(), "systemfont")) {
                font = J(iVar);
            } else {
                try {
                    Uri uri = iVar.f20130a;
                    str = iVar.f20134e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e7) {
                    w0.n("TypefaceCompatApi29Impl", "Font load failed", e7);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(iVar.f20132c).setSlant(iVar.f20133d ? 1 : 0).setTtcIndex(iVar.f20131b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font J(m0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // a.a
    public final Typeface k(Context context, f0.e eVar, Resources resources, int i5) {
        try {
            FontFamily.Builder builder = null;
            for (f0.f fVar : eVar.f9277a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f9283f).setWeight(fVar.f9279b).setSlant(fVar.f9280c ? 1 : 0).setTtcIndex(fVar.f9282e).setFontVariationSettings(fVar.f9281d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(H(build2, i5).getStyle()).build();
        } catch (Exception e7) {
            w0.n("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // a.a
    public final Typeface l(Context context, m0.i[] iVarArr, int i5) {
        try {
            FontFamily I = I(iVarArr, context.getContentResolver());
            if (I == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(I).setStyle(H(I, i5).getStyle()).build();
        } catch (Exception e7) {
            w0.n("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // a.a
    public final Typeface m(Context context, List list, int i5) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily I = I((m0.i[]) list.get(0), contentResolver);
            if (I == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(I);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily I2 = I((m0.i[]) list.get(i10), contentResolver);
                if (I2 != null) {
                    customFallbackBuilder.addCustomFallback(I2);
                }
            }
            return customFallbackBuilder.setStyle(H(I, i5).getStyle()).build();
        } catch (Exception e7) {
            w0.n("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // a.a
    public final Typeface n(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.a
    public final Typeface o(Context context, Resources resources, int i5, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i5).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e7) {
            w0.n("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // a.a
    public final m0.i q(m0.i[] iVarArr, int i5) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
