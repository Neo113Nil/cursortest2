package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class m23 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        pvd.r("No start tag found");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c;
        int[] iArr;
        int i2;
        int E;
        float f2;
        int i3;
        float cbrt;
        float f3;
        float f4;
        int i4;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = xjf.a;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i5, i5);
                int resourceId = obtainAttributes.getResourceId(i5, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    int i7 = typedValue.type;
                    if (i7 < 28 || i7 > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i5, -65281);
                        }
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c2 = z;
                        float f5 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i5;
                        int i8 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i9 = i8 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i8] = attributeNameResource;
                                i8 = i9;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i8);
                        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        c = (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f5 > 100.0f) ? (char) 0 : c2;
                        if (f == 1.0f || c != 0) {
                            int t = s6a.t((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                            if (c == 0) {
                                bi2 a2 = bi2.a(color);
                                float f7 = a2.a;
                                float f8 = a2.b;
                                svk svkVar = svk.k;
                                if (f8 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                    E = wkn.E(f5);
                                } else {
                                    float min = f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Math.min(360.0f, f7);
                                    float f9 = f8;
                                    char c3 = c2;
                                    bi2 bi2Var = null;
                                    while (true) {
                                        if (Math.abs(f6 - f8) >= 0.4f) {
                                            float f10 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f11 = 0.0f;
                                            float f12 = 100.0f;
                                            float f13 = 1000.0f;
                                            bi2 bi2Var2 = null;
                                            while (true) {
                                                if (Math.abs(f11 - f12) <= 0.01f) {
                                                    i2 = depth2;
                                                    f2 = f5;
                                                    break;
                                                }
                                                float e = wt3.e(f12, f11, 2.0f, f11);
                                                float f14 = f12;
                                                int c4 = bi2.b(e, f9, min).c(svk.k);
                                                float G = wkn.G(Color.red(c4));
                                                float G2 = wkn.G(Color.green(c4));
                                                float G3 = wkn.G(Color.blue(c4));
                                                float[] fArr = wkn.e[c2];
                                                float f15 = ((G3 * fArr[2]) + ((G2 * fArr[c2]) + (G * fArr[0]))) / 100.0f;
                                                if (f15 <= 0.008856452f) {
                                                    cbrt = f15 * 903.2963f;
                                                    i3 = c4;
                                                } else {
                                                    i3 = c4;
                                                    cbrt = (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f5 - cbrt);
                                                if (abs < 0.2f) {
                                                    bi2 a3 = bi2.a(i3);
                                                    f3 = cbrt;
                                                    f4 = e;
                                                    bi2 b = bi2.b(a3.c, a3.b, min);
                                                    float f16 = a3.d - b.d;
                                                    float f17 = a3.e - b.e;
                                                    float f18 = a3.f - b.f;
                                                    i2 = depth2;
                                                    f2 = f5;
                                                    float pow = (float) (Math.pow(Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        bi2Var2 = a3;
                                                        f13 = pow;
                                                        f10 = abs;
                                                    }
                                                } else {
                                                    f3 = cbrt;
                                                    f4 = e;
                                                    i2 = depth2;
                                                    f2 = f5;
                                                }
                                                if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    break;
                                                }
                                                if (f3 < f2) {
                                                    f12 = f14;
                                                    f11 = f4;
                                                } else {
                                                    f12 = f4;
                                                }
                                                depth2 = i2;
                                                f5 = f2;
                                            }
                                            bi2 bi2Var3 = bi2Var2;
                                            if (c3 == 0) {
                                                if (bi2Var3 == null) {
                                                    f8 = f9;
                                                } else {
                                                    bi2Var = bi2Var3;
                                                    f6 = f9;
                                                }
                                                f9 = wt3.e(f8, f6, 2.0f, f6);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = f2;
                                            } else {
                                                if (bi2Var3 != null) {
                                                    E = bi2Var3.c(svkVar);
                                                    break;
                                                }
                                                f9 = wt3.e(f8, f6, 2.0f, f6);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = f2;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            E = bi2Var == null ? wkn.E(f5) : bi2Var.c(svkVar);
                                        }
                                    }
                                }
                                color = E;
                            } else {
                                iArr = trimStateSet;
                                i2 = depth2;
                            }
                            color = (16777215 & color) | (t << 24);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                        }
                        i4 = i6 + 1;
                        if (i4 > iArr3.length) {
                            int[] iArr6 = new int[i6 <= 4 ? 8 : i6 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i6);
                            iArr3 = iArr6;
                        }
                        iArr3[i6] = color;
                        if (i4 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i6 > 4 ? i6 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i6);
                            iArr2 = r1;
                        }
                        iArr2[i6] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i6 = i4;
                        z = c2;
                        depth2 = i2;
                        i5 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i5, -65281);
                if (!obtainAttributes.hasValue(z)) {
                }
                char c22 = z;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i5;
                int i82 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i82);
                float f62 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (f == 1.0f) {
                }
                int t2 = s6a.t((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                if (c == 0) {
                }
                color = (16777215 & color) | (t2 << 24);
                i4 = i6 + 1;
                if (i4 > iArr3.length) {
                }
                iArr3[i6] = color;
                if (i4 > iArr2.length) {
                }
                iArr2[i6] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i6 = i4;
                z = c22;
                depth2 = i2;
                i5 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z;
                depth2 = depth2;
                i5 = 0;
            }
        }
        int[] iArr7 = new int[i6];
        int[][] iArr8 = new int[i6][];
        System.arraycopy(iArr3, 0, iArr7, 0, i6);
        System.arraycopy(iArr2, 0, iArr8, 0, i6);
        return new ColorStateList(iArr8, iArr7);
    }
}
