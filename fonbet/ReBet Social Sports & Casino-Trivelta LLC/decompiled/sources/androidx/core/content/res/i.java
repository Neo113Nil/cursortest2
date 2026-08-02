package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class i {
    public static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray i10 = n.i(resources, theme, attributeSet, k0.d.GradientColor);
        float f10 = n.f(i10, xmlPullParser, "startX", k0.d.f54065I, 0.0f);
        float f11 = n.f(i10, xmlPullParser, "startY", k0.d.f54066J, 0.0f);
        float f12 = n.f(i10, xmlPullParser, "endX", k0.d.f54067K, 0.0f);
        float f13 = n.f(i10, xmlPullParser, "endY", k0.d.f54068L, 0.0f);
        float f14 = n.f(i10, xmlPullParser, "centerX", k0.d.f54060D, 0.0f);
        float f15 = n.f(i10, xmlPullParser, "centerY", k0.d.f54061E, 0.0f);
        int g10 = n.g(i10, xmlPullParser, "type", k0.d.f54059C, 0);
        int b10 = n.b(i10, xmlPullParser, "startColor", k0.d.f54057A, 0);
        boolean h10 = n.h(xmlPullParser, "centerColor");
        int b11 = n.b(i10, xmlPullParser, "centerColor", k0.d.f54064H, 0);
        int b12 = n.b(i10, xmlPullParser, "endColor", k0.d.f54058B, 0);
        int g11 = n.g(i10, xmlPullParser, "tileMode", k0.d.f54063G, 0);
        float f16 = n.f(i10, xmlPullParser, "gradientRadius", k0.d.f54062F, 0.0f);
        i10.recycle();
        a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, h10, b11);
        if (g10 != 1) {
            return g10 != 2 ? new LinearGradient(f10, f11, f12, f13, a10.mColors, a10.mOffsets, d(g11)) : new SweepGradient(f14, f15, a10.mColors, a10.mOffsets);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, a10.mColors, a10.mOffsets, d(g11));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray i10 = n.i(resources, theme, attributeSet, k0.d.GradientColorItem);
                boolean hasValue = i10.hasValue(k0.d.f54069M);
                boolean hasValue2 = i10.hasValue(k0.d.f54070N);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = i10.getColor(k0.d.f54069M, 0);
                float f10 = i10.getFloat(k0.d.f54070N, 0.0f);
                i10.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {
        final int[] mColors;
        final float[] mOffsets;

        public a(List list, List list2) {
            int size = list.size();
            this.mColors = new int[size];
            this.mOffsets = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.mColors[i10] = ((Integer) list.get(i10)).intValue();
                this.mOffsets[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.mColors = new int[]{i10, i11};
            this.mOffsets = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.mColors = new int[]{i10, i11, i12};
            this.mOffsets = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
