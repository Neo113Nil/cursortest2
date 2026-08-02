package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q7d {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final z8d b;

    public q7d(Context context, z8d z8dVar) {
        context.getClass();
        z8dVar.getClass();
        this.a = context;
        this.b = z8dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a6d c(TypedArray typedArray, Resources resources, int i) {
        b8d b8dVar;
        int i2;
        z5d z5dVar = new z5d();
        z5dVar.b = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object obj = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    b8dVar = s6a.w("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                }
            }
            b8dVar = s6a.w(string, resourcePackageName);
        } else {
            b8dVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            cz1 cz1Var = b8d.c;
            if (b8dVar == cz1Var) {
                if (i3 != 0) {
                    i2 = Integer.valueOf(i3);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String b = b8dVar.b();
                        sb.append("' for ");
                        sb.append(b);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    i2 = 0;
                }
                obj = i2;
            } else if (i3 == 0) {
                cz1 cz1Var2 = b8d.o;
                if (b8dVar == cz1Var2) {
                    obj = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    cz1 cz1Var3 = b8d.l;
                    cz1 cz1Var4 = b8d.b;
                    cz1 cz1Var5 = b8d.i;
                    if (i4 == 3) {
                        String obj2 = typedValue.string.toString();
                        if (b8dVar == null) {
                            obj2.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            cz1Var4.d(obj2);
                                        } catch (IllegalArgumentException unused) {
                                            cz1Var3.d(obj2);
                                            cz1Var2 = cz1Var3;
                                            cz1Var4 = cz1Var2;
                                            b8dVar = cz1Var4;
                                            obj = b8dVar.d(obj2);
                                            if (obj != null) {
                                            }
                                            if (b8dVar != null) {
                                            }
                                            return z5dVar.a();
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        cz1Var5.d(obj2);
                                        cz1Var2 = cz1Var5;
                                        cz1Var4 = cz1Var2;
                                        b8dVar = cz1Var4;
                                        obj = b8dVar.d(obj2);
                                        if (obj != null) {
                                        }
                                        if (b8dVar != null) {
                                        }
                                        return z5dVar.a();
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    cz1Var4 = cz1Var2;
                                    b8dVar = cz1Var4;
                                    obj = b8dVar.d(obj2);
                                    if (obj != null) {
                                    }
                                    if (b8dVar != null) {
                                    }
                                    return z5dVar.a();
                                }
                            } catch (IllegalArgumentException unused4) {
                                cz1 cz1Var6 = b8d.f;
                                cz1Var6.d(obj2);
                                cz1Var2 = cz1Var6;
                                cz1Var4 = cz1Var2;
                                b8dVar = cz1Var4;
                                obj = b8dVar.d(obj2);
                                if (obj != null) {
                                }
                                if (b8dVar != null) {
                                }
                                return z5dVar.a();
                            }
                            b8dVar = cz1Var4;
                        }
                        obj = b8dVar.d(obj2);
                    } else if (i4 == 4) {
                        b8dVar = f6a.i(typedValue, b8dVar, cz1Var5, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        b8dVar = f6a.i(typedValue, b8dVar, cz1Var4, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        b8dVar = f6a.i(typedValue, b8dVar, cz1Var3, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (b8dVar == cz1Var5) {
                            b8dVar = f6a.i(typedValue, b8dVar, cz1Var5, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            b8dVar = f6a.i(typedValue, b8dVar, cz1Var4, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (b8dVar != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String b2 = b8dVar.b();
                    sb2.append("' for ");
                    sb2.append(b2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                obj = Integer.valueOf(i3);
                b8dVar = cz1Var;
            }
        }
        if (obj != null) {
            z5dVar.c = obj;
            z5dVar.d = true;
        }
        if (b8dVar != null) {
            z5dVar.a = b8dVar;
        }
        return z5dVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fd, code lost:
    
        defpackage.pvd.r("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0102, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0224, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s6d a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        String str;
        String str2;
        String str3;
        Context context;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        s6d a = this.b.b(name).a();
        Context context2 = this.a;
        a.o(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = ckf.b;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    obtainAttributes.getClass();
                    String string = obtainAttributes.getString(0);
                    if (string == null) {
                        pvd.r("Arguments must have a name");
                        return null;
                    }
                    a6d c2 = c(obtainAttributes, resources, i3);
                    i3d i3dVar = a.b;
                    i3dVar.getClass();
                    ((LinkedHashMap) i3dVar.f).put(string, c2);
                    Unit unit = Unit.a;
                    obtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, ckf.c);
                    obtainAttributes2.getClass();
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i4);
                    String string4 = obtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        str = c.r(string2, "${applicationId}", packageName, false);
                    } else {
                        str = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        str2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        str2 = c.r(string3, "${applicationId}", packageName2, false);
                        if (str2.length() <= 0) {
                            a70.p("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        str3 = c.r(string4, "${applicationId}", packageName3, false);
                    } else {
                        str3 = null;
                    }
                    a.a(new p6d(str, str2, str3));
                    Unit unit2 = Unit.a;
                    obtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ckf.a, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        y5d y5dVar = new y5d(obtainStyledAttributes.getResourceId(i4, 0));
                        y5dVar.b = new u7d(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        lm5.a.getClass();
                        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            context = context2;
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    obtainAttributes3.getClass();
                                    String string5 = obtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        pvd.r("Arguments must have a name");
                                        return null;
                                    }
                                    a6d c3 = c(obtainAttributes3, resources, i3);
                                    boolean z = c3.c;
                                    if (z && z && (obj = c3.e) != null) {
                                        c3.a.e(E, string5, obj);
                                    }
                                    Unit unit3 = Unit.a;
                                    obtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            context2 = context;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!E.isEmpty()) {
                            y5dVar.c = E;
                        }
                        a.p(resourceId, y5dVar);
                        obtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name2) && (a instanceof g7d)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, bkf.c);
                            obtainAttributes4.getClass();
                            ((g7d) a).g.d(b(obtainAttributes4.getResourceId(0, 0)));
                            Unit unit4 = Unit.a;
                            obtainAttributes4.recycle();
                        } else if (a instanceof g7d) {
                            ((g7d) a).g.d(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
    }

    public final g7d b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        asAttributeSet.getClass();
        s6d a = a(resources, xml, asAttributeSet, i);
        if (a instanceof g7d) {
            return (g7d) a;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
