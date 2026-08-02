package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public int f35880a;

    /* renamed from: b, reason: collision with root package name */
    public d f35881b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f35882c = new int[10][];

    @NonNull
    d[] cornerSizes = new d[10];

    public static r b(Context context, TypedArray typedArray, int i10, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return c(n.m(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return c(n.m(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                r rVar = new r();
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
                    rVar.i(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return rVar;
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
            return c(dVar);
        }
    }

    public static r c(d dVar) {
        r rVar = new r();
        rVar.a(StateSet.WILD_CARD, dVar);
        return rVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i10 = this.f35880a;
        if (i10 == 0 || iArr.length == 0) {
            this.f35881b = dVar;
        }
        if (i10 >= this.f35882c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f35882c;
        int i11 = this.f35880a;
        iArr2[i11] = iArr;
        this.cornerSizes[i11] = dVar;
        this.f35880a = i11 + 1;
    }

    public d d(int[] iArr) {
        int g10 = g(iArr);
        if (g10 < 0) {
            g10 = g(StateSet.WILD_CARD);
        }
        return g10 < 0 ? this.f35881b : this.cornerSizes[g10];
    }

    public d e() {
        return this.f35881b;
    }

    public final void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f35882c, 0, iArr, 0, i10);
        this.f35882c = iArr;
        d[] dVarArr = new d[i11];
        System.arraycopy(this.cornerSizes, 0, dVarArr, 0, i10);
        this.cornerSizes = dVarArr;
    }

    public final int g(int[] iArr) {
        int[][] iArr2 = this.f35882c;
        for (int i10 = 0; i10 < this.f35880a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean h() {
        return this.f35880a > 1;
    }

    public final void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ia.m.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, ia.m.ShapeAppearance, 0, 0);
                d m10 = n.m(obtainAttributes, ia.m.f48594A5, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != ia.c.f48264v) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), m10);
            }
        }
    }
}
