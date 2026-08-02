package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public int f35897a;

    /* renamed from: b, reason: collision with root package name */
    public a f35898b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f35899c = new int[10][];

    @NonNull
    a[] sizeChanges = new a[10];

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public b f35900a;

        public a(b bVar) {
            this.f35900a = bVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public c f35901a;

        /* renamed from: b, reason: collision with root package name */
        public float f35902b;

        public b(c cVar, float f10) {
            this.f35901a = cVar;
            this.f35902b = f10;
        }

        public int a(int i10) {
            c cVar = this.f35901a;
            if (cVar == c.PERCENT) {
                return (int) (this.f35902b * i10);
            }
            if (cVar == c.PIXELS) {
                return (int) this.f35902b;
            }
            return 0;
        }
    }

    public enum c {
        PERCENT,
        PIXELS
    }

    public static t b(Context context, TypedArray typedArray, int i10) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                t tVar = new t();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    tVar.h(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return tVar;
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public final void a(int[] iArr, a aVar) {
        int i10 = this.f35897a;
        if (i10 == 0 || iArr.length == 0) {
            this.f35898b = aVar;
        }
        if (i10 >= this.f35899c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f35899c;
        int i11 = this.f35897a;
        iArr2[i11] = iArr;
        this.sizeChanges[i11] = aVar;
        this.f35897a = i11 + 1;
    }

    public int c(int i10) {
        float max;
        int i11 = -i10;
        for (int i12 = 0; i12 < this.f35897a; i12++) {
            b bVar = this.sizeChanges[i12].f35900a;
            c cVar = bVar.f35901a;
            if (cVar == c.PIXELS) {
                max = Math.max(i11, bVar.f35902b);
            } else if (cVar == c.PERCENT) {
                max = Math.max(i11, i10 * bVar.f35902b);
            }
            i11 = (int) max;
        }
        return i11;
    }

    public final b d(TypedArray typedArray, int i10, b bVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            int i11 = peekValue.type;
            if (i11 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new b(c.PERCENT, peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    public a e(int[] iArr) {
        int g10 = g(iArr);
        if (g10 < 0) {
            g10 = g(StateSet.WILD_CARD);
        }
        return g10 < 0 ? this.f35898b : this.sizeChanges[g10];
    }

    public final void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f35899c, 0, iArr, 0, i10);
        this.f35899c = iArr;
        a[] aVarArr = new a[i11];
        System.arraycopy(this.sizeChanges, 0, aVarArr, 0, i10);
        this.sizeChanges = aVarArr;
    }

    public final int g(int[] iArr) {
        int[][] iArr2 = this.f35899c;
        for (int i10 = 0; i10 < this.f35897a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public final void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ia.m.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, ia.m.StateListSizeChange, 0, 0);
                b d10 = d(obtainAttributes, ia.m.f48675I6, null);
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != ia.c.f48273z0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), new a(d10));
            }
        }
    }
}
