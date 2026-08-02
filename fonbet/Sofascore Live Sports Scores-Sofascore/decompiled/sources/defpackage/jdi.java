package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.sofascore.results.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jdi implements vah {
    public final int a;
    public final xah b;
    public final int[][] c;
    public final xah[] d;
    public final idi e;
    public final idi f;
    public final idi g;
    public final idi h;

    public jdi(il9 il9Var) {
        this.a = il9Var.b;
        this.b = (xah) il9Var.c;
        this.c = (int[][]) il9Var.d;
        this.d = (xah[]) il9Var.e;
        this.e = (idi) il9Var.f;
        this.f = (idi) il9Var.g;
        this.g = (idi) il9Var.h;
        this.h = (idi) il9Var.i;
    }

    public static jdi g(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        il9 il9Var = new il9(1);
        il9Var.g();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            il9Var.g();
        }
        try {
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
                i(il9Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return il9Var.d();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void i(il9 il9Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = pjf.E;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                xah a = xah.g(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                il9Var.b(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    @Override // defpackage.vah
    public final xah a(float f) {
        return h().a(f);
    }

    @Override // defpackage.vah
    public final xah b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        xah[] xahVarArr = this.d;
        idi idiVar = this.h;
        idi idiVar2 = this.g;
        idi idiVar3 = this.f;
        idi idiVar4 = this.e;
        if (idiVar4 == null && idiVar3 == null && idiVar2 == null && idiVar == null) {
            return xahVarArr[i4];
        }
        wah m = xahVarArr[i4].m();
        if (idiVar4 != null) {
            m.e = idiVar4.c(iArr);
        }
        if (idiVar3 != null) {
            m.f = idiVar3.c(iArr);
        }
        if (idiVar2 != null) {
            m.h = idiVar2.c(iArr);
        }
        if (idiVar != null) {
            m.g = idiVar.c(iArr);
        }
        return m.a();
    }

    @Override // defpackage.vah
    public final xah[] c() {
        return this.d;
    }

    @Override // defpackage.vah
    public final xah d() {
        return h();
    }

    @Override // defpackage.vah
    public final xah e(lwf lwfVar) {
        return h().e(lwfVar);
    }

    @Override // defpackage.vah
    public final boolean f() {
        idi idiVar;
        idi idiVar2;
        idi idiVar3;
        idi idiVar4;
        return this.a > 1 || ((idiVar = this.e) != null && idiVar.a > 1) || (((idiVar2 = this.f) != null && idiVar2.a > 1) || (((idiVar3 = this.g) != null && idiVar3.a > 1) || ((idiVar4 = this.h) != null && idiVar4.a > 1)));
    }

    public final xah h() {
        xah xahVar = this.b;
        idi idiVar = this.h;
        idi idiVar2 = this.g;
        idi idiVar3 = this.f;
        idi idiVar4 = this.e;
        if (idiVar4 == null && idiVar3 == null && idiVar2 == null && idiVar == null) {
            return xahVar;
        }
        wah m = xahVar.m();
        if (idiVar4 != null) {
            m.e = idiVar4.b;
        }
        if (idiVar3 != null) {
            m.f = idiVar3.b;
        }
        if (idiVar2 != null) {
            m.h = idiVar2.b;
        }
        if (idiVar != null) {
            m.g = idiVar.b;
        }
        return m.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, xah[]] */
    public final il9 j() {
        il9 il9Var = new il9(1);
        int i = this.a;
        il9Var.b = i;
        il9Var.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        il9Var.d = r3;
        xah[] xahVarArr = this.d;
        il9Var.e = new xah[xahVarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(xahVarArr, 0, (xah[]) il9Var.e, 0, il9Var.b);
        il9Var.f = this.e;
        il9Var.g = this.f;
        il9Var.h = this.g;
        il9Var.i = this.h;
        return il9Var;
    }
}
