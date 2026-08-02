package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.transition.n0;
import io.sentry.android.core.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f9269a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f9270b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f9271c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f9272d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9273e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f9274f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f9275g;

    public static n0 a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i5) {
        n0 n0Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i5, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new n0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                n0Var = n0.b(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme);
            } catch (Exception e7) {
                w0.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
                n0Var = null;
            }
            if (n0Var != null) {
                return n0Var;
            }
        }
        return new n0((Shader) null, (ColorStateList) null, 0);
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5) {
        if (c(xmlPullParser, str)) {
            return typedArray.getString(i5);
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f10 = (f6 + 16.0f) / 116.0f;
        float f11 = f6 > 8.0f ? f10 * f10 * f10 : f6 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z5 = f12 > 0.008856452f;
        float f13 = z5 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z5) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f9271c;
        return g0.c.a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float e(int i5) {
        float f6 = i5 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static d g(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i5;
        int i10;
        ?? r32;
        Throwable th2;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i5 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            j(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.f2947b);
        int i11 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.f2948c);
                        int i13 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z5 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = obtainAttributes2.getInt(i14, 0);
                        int i16 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i16, 0);
                        String string7 = obtainAttributes2.getString(i16);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            j(xmlResourceParser);
                        }
                        arrayList.add(new f(i13, i15, resourceId2, string7, string6, z5));
                    } else {
                        j(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List h10 = h(resourceId, resources);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i5) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.f2949d);
                    try {
                        String string8 = obtainAttributes3.getString(i11);
                        String string9 = obtainAttributes3.getString(1);
                        i10 = integer;
                        String string10 = obtainAttributes3.getString(i5);
                        if (string8 == null) {
                            r32 = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i12) {
                            try {
                                j(xmlResourceParser);
                            } catch (Throwable th3) {
                                th2 = th3;
                                typedArray = obtainAttributes3;
                            }
                        }
                        r32 = obtainAttributes3;
                        try {
                            m0.d dVar = new m0.d(string, string2, string8, h10, string9, string10);
                            if (r32 instanceof AutoCloseable) {
                                ((AutoCloseable) r32).close();
                            } else if (r32 instanceof ExecutorService) {
                                com.appsflyer.internal.h.h((ExecutorService) r32);
                            } else {
                                r32.recycle();
                            }
                            arrayList2.add(dVar);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th4;
                    } catch (Throwable th5) {
                        th = th5;
                        r32 = obtainAttributes3;
                    }
                    th2 = th;
                    typedArray = r32;
                    if (typedArray == null) {
                        throw th2;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                        } else if (typedArray instanceof ExecutorService) {
                            com.appsflyer.internal.h.h((ExecutorService) typedArray);
                        } else {
                            typedArray.recycle();
                        }
                        throw th2;
                    } catch (Throwable th6) {
                        th2.addSuppressed(th6);
                        throw th2;
                    }
                }
                i10 = integer;
                j(xmlResourceParser);
                integer = i10;
                i5 = 2;
                i11 = 0;
                i12 = 3;
            }
        }
        int i17 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(i17, integer2, string5, arrayList2);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new m0.d(string, string2, string3, h10, null, null));
        if (string4 != null) {
            arrayList2.add(new m0.d(string, string2, string4, h10, null, null));
        }
        return new g(i17, integer2, string5, arrayList2);
    }

    public static List h(int i5, Resources resources) {
        if (i5 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i5);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i5);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void i(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(theme);
            return;
        }
        synchronized (f9273e) {
            if (!f9275g) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f9274f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e7) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                }
                f9275g = true;
            }
            Method method = f9274f;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException e9) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                    f9274f = null;
                }
            }
        }
    }

    public static void j(XmlPullParser xmlPullParser) {
        int i5 = 1;
        while (i5 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i5++;
            } else if (next == 3) {
                i5--;
            }
        }
    }

    public static float k() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
