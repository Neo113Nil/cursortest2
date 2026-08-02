package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9293a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f9294b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9295c = new Object();

    public static void a(i iVar, int i5, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9295c) {
            try {
                WeakHashMap weakHashMap = f9294b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i5, new h(colorStateList, iVar.f9291a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface b(Context context, int i5) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i5, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface c(Context context, int i5, TypedValue typedValue, int i10, j jVar, boolean z5, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i5) + "\" (" + Integer.toHexString(i5) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            s.l lVar = g0.g.f9684b;
            Typeface typeface2 = (Typeface) lVar.c(g0.g.b(resources, i5, charSequence2, i11, i10));
            if (typeface2 != null) {
                if (jVar != null) {
                    jVar.callbackSuccessAsync(typeface2, null);
                }
                typeface = typeface2;
            } else if (!z7) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d g10 = b.g(resources.getXml(i5), resources);
                        if (g10 == null) {
                            w0.d("ResourcesCompat", "Failed to find font-family tag");
                            if (jVar != null) {
                                jVar.callbackFailAsync(-3, null);
                            }
                        } else {
                            typeface = g0.g.a(context, g10, resources, i5, charSequence2, typedValue.assetCookie, i10, jVar, z5);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface o3 = g0.g.f9683a.o(context, resources, i5, charSequence2, i10);
                        if (o3 != null) {
                            lVar.d(g0.g.b(resources, i5, charSequence2, i12, i10), o3);
                        }
                        if (jVar != null) {
                            if (o3 != null) {
                                jVar.callbackSuccessAsync(o3, null);
                            } else {
                                jVar.callbackFailAsync(-3, null);
                            }
                        }
                        typeface = o3;
                    }
                } catch (IOException e7) {
                    w0.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e7);
                    if (jVar != null) {
                        jVar.callbackFailAsync(-3, null);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e9) {
                    w0.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e9);
                    if (jVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (jVar != null) {
            jVar.callbackFailAsync(-3, null);
        }
        if (typeface == null || jVar != null || z7) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i5) + " could not be retrieved.");
    }
}
