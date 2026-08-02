package defpackage;

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
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class b6k extends h5a {
    public static Font X(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int a0 = a0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int a02 = a0(fontStyle, font2.getStyle());
            if (a02 < a0) {
                font = font2;
                a0 = a02;
            }
        }
        return font;
    }

    public static int a0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.h5a
    public final Typeface G(Context context, lg8 lg8Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (mg8 mg8Var : lg8Var.a) {
                try {
                    Font build = new Font.Builder(resources, mg8Var.f).setWeight(mg8Var.b).setSlant(mg8Var.c ? 1 : 0).setTtcIndex(mg8Var.e).setFontVariationSettings(mg8Var.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(X(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.h5a
    public final Typeface H(Context context, yg8[] yg8VarArr, int i) {
        try {
            FontFamily Y = Y(yg8VarArr, context.getContentResolver());
            if (Y == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(Y).setStyle(X(Y, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.h5a
    public final Typeface I(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily Y = Y((yg8[]) list.get(0), contentResolver);
            if (Y == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(Y);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily Y2 = Y((yg8[]) list.get(i2), contentResolver);
                if (Y2 != null) {
                    customFallbackBuilder.addCustomFallback(Y2);
                }
            }
            return customFallbackBuilder.setStyle(X(Y, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.h5a
    public final Typeface J(Context context, Resources resources, int i, String str) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily Y(yg8[] yg8VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (yg8 yg8Var : yg8VarArr) {
            if (Objects.equals(yg8Var.a.getScheme(), "systemfont")) {
                font = Z(yg8Var);
            } else {
                try {
                    Uri uri = yg8Var.a;
                    str = yg8Var.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(yg8Var.c).setSlant(yg8Var.d ? 1 : 0).setTtcIndex(yg8Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
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

    public Font Z(yg8 yg8Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
