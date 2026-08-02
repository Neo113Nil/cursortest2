package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.sports.insider.R;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9276a = new ThreadLocal();

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
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f6;
        int attributeCount;
        int i5;
        char c2;
        int[] iArr;
        int i10;
        int d10;
        float f10;
        int i11;
        float cbrt;
        int i12;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z5 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z5 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = b0.a.f2946a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i13, i13);
                int resourceId = obtainAttributes.getResourceId(i13, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f9276a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z5);
                    int i15 = typedValue.type;
                    if (i15 < 28 || i15 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i13, -65281);
                        }
                        f6 = !obtainAttributes.hasValue(z5) ? obtainAttributes.getFloat(z5, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c8 = z5;
                        float f11 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i5 = i13;
                        int i16 = i5;
                        while (i5 < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i5);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i17 = i16 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i5, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i16] = attributeNameResource;
                                i16 = i17;
                            }
                            i5++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i16);
                        float f12 = 100.0f;
                        c2 = (f11 >= 0.0f || f11 > 100.0f) ? (char) 0 : c8;
                        if (f6 == 1.0f || c2 != 0) {
                            int f13 = com.google.android.play.core.appupdate.b.f((int) ((Color.alpha(color) * f6) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                            if (c2 == 0) {
                                a a7 = a.a(color);
                                float f14 = a7.f9263a;
                                float f15 = a7.f9264b;
                                m mVar = m.f9296k;
                                if (f15 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i10 = depth2;
                                    d10 = b.d(f11);
                                } else {
                                    float min = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                                    float f16 = 0.0f;
                                    float f17 = f15;
                                    char c10 = c8;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f16 - f15) >= 0.4f) {
                                            float f18 = 1000.0f;
                                            float f19 = f12;
                                            float f20 = 0.0f;
                                            float f21 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f20 - f19) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    i10 = depth2;
                                                    f10 = f12;
                                                    break;
                                                }
                                                f10 = f12;
                                                float f22 = ((f19 - f20) / 2.0f) + f20;
                                                iArr = trimStateSet;
                                                int c11 = a.b(f22, f17, min).c(m.f9296k);
                                                float e7 = b.e(Color.red(c11));
                                                float e9 = b.e(Color.green(c11));
                                                float e10 = b.e(Color.blue(c11));
                                                float[] fArr = b.f9272d[c8];
                                                float f23 = ((e10 * fArr[2]) + ((e9 * fArr[c8]) + (e7 * fArr[0]))) / f10;
                                                if (f23 <= 0.008856452f) {
                                                    cbrt = f23 * 903.2963f;
                                                    i11 = c11;
                                                } else {
                                                    i11 = c11;
                                                    cbrt = (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f11 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(i11);
                                                    a b10 = a.b(a10.f9265c, a10.f9264b, min);
                                                    float f24 = a10.f9266d - b10.f9266d;
                                                    float f25 = a10.f9267e - b10.f9267e;
                                                    float f26 = a10.f9268f - b10.f9268f;
                                                    i10 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f26 * f26) + (f25 * f25) + (f24 * f24)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f21 = pow;
                                                        f18 = abs;
                                                        aVar2 = a10;
                                                    }
                                                } else {
                                                    i10 = depth2;
                                                }
                                                if (f18 == 0.0f && f21 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f11) {
                                                    f20 = f22;
                                                } else {
                                                    f19 = f22;
                                                }
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i10;
                                            }
                                            a aVar3 = aVar2;
                                            if (c10 == 0) {
                                                if (aVar3 == null) {
                                                    f15 = f17;
                                                } else {
                                                    aVar = aVar3;
                                                    f16 = f17;
                                                }
                                                f17 = ((f15 - f16) / 2.0f) + f16;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i10;
                                            } else {
                                                if (aVar3 != null) {
                                                    d10 = aVar3.c(mVar);
                                                    break;
                                                }
                                                f17 = ((f15 - f16) / 2.0f) + f16;
                                                f12 = f10;
                                                trimStateSet = iArr;
                                                depth2 = i10;
                                                c10 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i10 = depth2;
                                            d10 = aVar == null ? b.d(f11) : aVar.c(mVar);
                                        }
                                    }
                                }
                                color = d10;
                            } else {
                                iArr = trimStateSet;
                                i10 = depth2;
                            }
                            color = (16777215 & color) | (f13 << 24);
                        } else {
                            iArr = trimStateSet;
                            i10 = depth2;
                        }
                        i12 = i14 + 1;
                        if (i12 > iArr3.length) {
                            int[] iArr6 = new int[i14 <= 4 ? 8 : i14 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i14);
                            iArr3 = iArr6;
                        }
                        iArr3[i14] = color;
                        if (i12 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i14 > 4 ? i14 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i14);
                            iArr2 = r12;
                        }
                        iArr2[i14] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i14 = i12;
                        z5 = c8;
                        depth2 = i10;
                        i13 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i13, -65281);
                if (!obtainAttributes.hasValue(z5)) {
                }
                char c82 = z5;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i5 = i13;
                int i162 = i5;
                while (i5 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i162);
                float f122 = 100.0f;
                if (f11 >= 0.0f) {
                }
                if (f6 == 1.0f) {
                }
                int f132 = com.google.android.play.core.appupdate.b.f((int) ((Color.alpha(color) * f6) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                if (c2 == 0) {
                }
                color = (16777215 & color) | (f132 << 24);
                i12 = i14 + 1;
                if (i12 > iArr3.length) {
                }
                iArr3[i14] = color;
                if (i12 > iArr2.length) {
                }
                iArr2[i14] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i14 = i12;
                z5 = c82;
                depth2 = i10;
                i13 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z5 = z5;
                depth2 = depth2;
                i13 = 0;
            }
        }
        int[] iArr7 = new int[i14];
        int[][] iArr8 = new int[i14][];
        System.arraycopy(iArr3, 0, iArr7, 0, i14);
        System.arraycopy(iArr2, 0, iArr8, 0, i14);
        return new ColorStateList(iArr8, iArr7);
    }
}
