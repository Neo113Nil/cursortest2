package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class z1g {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, t6a t6aVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            zmb zmbVar = x5k.b;
            Typeface typeface2 = (Typeface) zmbVar.c(x5k.b(resources, i, charSequence2, i3, i2));
            int i4 = 27;
            if (typeface2 != null) {
                if (t6aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new gjc(i4, t6aVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        kg8 D = qx9.D(resources.getXml(i), resources);
                        if (D != null) {
                            typeface = x5k.a(context, D, resources, i, charSequence2, typedValue.assetCookie, i2, t6aVar, z);
                        } else if (t6aVar != null) {
                            t6aVar.p(-3);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface J = x5k.a.J(context, resources, i, charSequence2);
                        if (J != null) {
                            zmbVar.d(x5k.b(resources, i, charSequence2, i5, i2), J);
                        }
                        if (t6aVar != null) {
                            if (J != null) {
                                new Handler(Looper.getMainLooper()).post(new gjc(i4, t6aVar, J));
                            } else {
                                t6aVar.p(-3);
                            }
                        }
                        typeface = J;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (t6aVar != null) {
                        t6aVar.p(-3);
                    }
                }
            }
        } else if (t6aVar != null) {
            t6aVar.p(-3);
        }
        if (typeface != null || t6aVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
