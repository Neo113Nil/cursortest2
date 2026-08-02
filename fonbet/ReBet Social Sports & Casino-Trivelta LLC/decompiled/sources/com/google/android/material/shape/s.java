package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import com.google.android.material.shape.n;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f35883a;

    /* renamed from: b, reason: collision with root package name */
    public final n f35884b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f35885c;

    /* renamed from: d, reason: collision with root package name */
    public final r f35886d;

    /* renamed from: e, reason: collision with root package name */
    public final r f35887e;

    /* renamed from: f, reason: collision with root package name */
    public final r f35888f;

    /* renamed from: g, reason: collision with root package name */
    public final r f35889g;

    @NonNull
    final n[] shapeAppearanceModels;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f35890a;

        /* renamed from: b, reason: collision with root package name */
        public n f35891b;

        /* renamed from: c, reason: collision with root package name */
        public int[][] f35892c;

        /* renamed from: d, reason: collision with root package name */
        public r f35893d;

        /* renamed from: e, reason: collision with root package name */
        public r f35894e;

        /* renamed from: f, reason: collision with root package name */
        public r f35895f;

        /* renamed from: g, reason: collision with root package name */
        public r f35896g;

        @NonNull
        private n[] shapeAppearanceModels;

        public b i(int[] iArr, n nVar) {
            int i10 = this.f35890a;
            if (i10 == 0 || iArr.length == 0) {
                this.f35891b = nVar;
            }
            if (i10 >= this.f35892c.length) {
                l(i10, i10 + 10);
            }
            int[][] iArr2 = this.f35892c;
            int i11 = this.f35890a;
            iArr2[i11] = iArr;
            this.shapeAppearanceModels[i11] = nVar;
            this.f35890a = i11 + 1;
            return this;
        }

        public s j() {
            if (this.f35890a == 0) {
                return null;
            }
            return new s(this);
        }

        public final boolean k(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        public final void l(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f35892c, 0, iArr, 0, i10);
            this.f35892c = iArr;
            n[] nVarArr = new n[i11];
            System.arraycopy(this.shapeAppearanceModels, 0, nVarArr, 0, i10);
            this.shapeAppearanceModels = nVarArr;
        }

        public final void m() {
            this.f35891b = new n();
            this.f35892c = new int[10][];
            this.shapeAppearanceModels = new n[10];
        }

        public b n(r rVar, int i10) {
            if (k(i10, 1)) {
                this.f35893d = rVar;
            }
            if (k(i10, 2)) {
                this.f35894e = rVar;
            }
            if (k(i10, 4)) {
                this.f35895f = rVar;
            }
            if (k(i10, 8)) {
                this.f35896g = rVar;
            }
            return this;
        }

        public b(s sVar) {
            int i10 = sVar.f35883a;
            this.f35890a = i10;
            this.f35891b = sVar.f35884b;
            int[][] iArr = sVar.f35885c;
            int[][] iArr2 = new int[iArr.length][];
            this.f35892c = iArr2;
            this.shapeAppearanceModels = new n[sVar.shapeAppearanceModels.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(sVar.shapeAppearanceModels, 0, this.shapeAppearanceModels, 0, this.f35890a);
            this.f35893d = sVar.f35886d;
            this.f35894e = sVar.f35887e;
            this.f35895f = sVar.f35888f;
            this.f35896g = sVar.f35889g;
        }

        public b(n nVar) {
            m();
            i(StateSet.WILD_CARD, nVar);
        }

        public b(Context context, int i10) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            s.g(this, context, xml, asAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m();
            }
        }
    }

    public static s b(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ia.m.MaterialShape) : theme.obtainStyledAttributes(attributeSet, ia.m.MaterialShape, 0, 0);
                n m10 = n.b(context, obtainAttributes.getResourceId(ia.m.f48975n4, 0), obtainAttributes.getResourceId(ia.m.f48985o4, 0)).m();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != ia.c.f48237h0 && attributeNameResource != ia.c.f48239i0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), m10);
            }
        }
    }

    public static int h(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public n c(boolean z10) {
        if (!z10 || (this.f35886d == null && this.f35887e == null && this.f35888f == null && this.f35889g == null)) {
            return this.f35884b;
        }
        n.b w10 = this.f35884b.w();
        r rVar = this.f35886d;
        if (rVar != null) {
            w10.F(rVar.e());
        }
        r rVar2 = this.f35887e;
        if (rVar2 != null) {
            w10.K(rVar2.e());
        }
        r rVar3 = this.f35888f;
        if (rVar3 != null) {
            w10.w(rVar3.e());
        }
        r rVar4 = this.f35889g;
        if (rVar4 != null) {
            w10.A(rVar4.e());
        }
        return w10.m();
    }

    public n d(int[] iArr) {
        int e10 = e(iArr);
        if (e10 < 0) {
            e10 = e(StateSet.WILD_CARD);
        }
        if (this.f35886d == null && this.f35887e == null && this.f35888f == null && this.f35889g == null) {
            return this.shapeAppearanceModels[e10];
        }
        n.b w10 = this.shapeAppearanceModels[e10].w();
        r rVar = this.f35886d;
        if (rVar != null) {
            w10.F(rVar.d(iArr));
        }
        r rVar2 = this.f35887e;
        if (rVar2 != null) {
            w10.K(rVar2.d(iArr));
        }
        r rVar3 = this.f35888f;
        if (rVar3 != null) {
            w10.w(rVar3.d(iArr));
        }
        r rVar4 = this.f35889g;
        if (rVar4 != null) {
            w10.A(rVar4.d(iArr));
        }
        return w10.m();
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f35885c;
        for (int i10 = 0; i10 < this.f35883a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean f() {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        return this.f35883a > 1 || ((rVar = this.f35886d) != null && rVar.h()) || (((rVar2 = this.f35887e) != null && rVar2.h()) || (((rVar3 = this.f35888f) != null && rVar3.h()) || ((rVar4 = this.f35889g) != null && rVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    public s(b bVar) {
        this.f35883a = bVar.f35890a;
        this.f35884b = bVar.f35891b;
        this.f35885c = bVar.f35892c;
        this.shapeAppearanceModels = bVar.shapeAppearanceModels;
        this.f35886d = bVar.f35893d;
        this.f35887e = bVar.f35894e;
        this.f35888f = bVar.f35895f;
        this.f35889g = bVar.f35896g;
    }
}
