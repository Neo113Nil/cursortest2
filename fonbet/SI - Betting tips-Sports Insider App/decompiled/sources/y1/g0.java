package y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f25547c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f25548a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f25549b;

    public g0(Context context, u0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f25548a = context;
        this.f25549b = navigatorProvider;
    }

    public static k c(TypedArray typedArray, Resources resources, int i5) {
        q0 type;
        Object obj;
        q0 q0Var;
        boolean z5 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f25547c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i5);
            if (string.startsWith("java")) {
                try {
                    type = k0.a("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e7) {
                    if (!(e7.getCause() instanceof ClassNotFoundException)) {
                        throw e7;
                    }
                }
            }
            type = k0.a(string, resourcePackageName);
        } else {
            type = null;
        }
        boolean z7 = true;
        boolean value = typedArray.getValue(1, typedValue);
        f fVar = q0.f25613f;
        f fVar2 = q0.f25618l;
        f fVar3 = q0.f25621o;
        f fVar4 = q0.f25609b;
        f fVar5 = q0.f25616i;
        if (value) {
            f fVar6 = q0.f25610c;
            if (type == fVar6) {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    obj = Integer.valueOf(i10);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". Must be a reference to a resource.");
                    }
                    obj = 0;
                }
            } else {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    if (type != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i11);
                    type = fVar6;
                } else if (type == fVar3) {
                    obj = typedArray.getString(1);
                } else {
                    int i12 = typedValue.type;
                    if (i12 == 3) {
                        String value2 = typedValue.string.toString();
                        if (type == null) {
                            Intrinsics.checkNotNullParameter(value2, "value");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            fVar4.d(value2);
                                            Intrinsics.checkNotNull(fVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                                            type = fVar4;
                                        } catch (IllegalArgumentException unused) {
                                            fVar2.d(value2);
                                            Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                                            type = fVar2;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        fVar.d(value2);
                                        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                                        type = fVar;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    Intrinsics.checkNotNull(fVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                                    type = fVar3;
                                }
                            } catch (IllegalArgumentException unused4) {
                                fVar5.d(value2);
                                Intrinsics.checkNotNull(fVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                                type = fVar5;
                            }
                        }
                        obj = type.d(value2);
                    } else if (i12 == 4) {
                        type = a.a.f(typedValue, type, fVar5, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i12 == 5) {
                        type = a.a.f(typedValue, type, fVar4, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i12 == 18) {
                        type = a.a.f(typedValue, type, fVar2, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i12 < 16 || i12 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (type == fVar5) {
                            type = a.a.f(typedValue, type, fVar5, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            type = a.a.f(typedValue, type, fVar4, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            z7 = false;
            obj = null;
        }
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
        } else {
            type = null;
        }
        if (type == null) {
            if (obj instanceof Integer) {
                Intrinsics.checkNotNull(fVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                q0Var = fVar4;
            } else if (obj instanceof int[]) {
                q0Var = q0.f25611d;
                Intrinsics.checkNotNull(q0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Long) {
                Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                q0Var = fVar;
            } else if (obj instanceof long[]) {
                q0Var = q0.f25614g;
                Intrinsics.checkNotNull(q0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Float) {
                Intrinsics.checkNotNull(fVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                q0Var = fVar5;
            } else if (obj instanceof float[]) {
                q0Var = q0.j;
                Intrinsics.checkNotNull(q0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Boolean) {
                Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                q0Var = fVar2;
            } else if (obj instanceof boolean[]) {
                q0Var = q0.f25619m;
                Intrinsics.checkNotNull(q0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if ((obj instanceof String) || obj == null) {
                Intrinsics.checkNotNull(fVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                q0Var = fVar3;
            } else {
                q0Var = null;
            }
            if (q0Var != null) {
                type = q0Var;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                type = q0.f25622p;
                Intrinsics.checkNotNull(type, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else {
                Intrinsics.checkNotNull(obj);
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        type = new m0(componentType2);
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        type = new o0(componentType4);
                    }
                }
                if (obj instanceof Parcelable) {
                    type = new n0(obj.getClass());
                } else if (obj instanceof Enum) {
                    type = new l0(obj.getClass());
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    type = new p0(obj.getClass());
                }
            }
            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        }
        return new k(type, z5, obj, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x016d, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x02f9, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i5) {
        int depth;
        String uriPattern;
        String action;
        String mimeType;
        g0 g0Var;
        int i10;
        Object obj;
        g0 g0Var2 = this;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        b0 a7 = g0Var2.f25549b.b(name).a();
        Context context = g0Var2.f25548a;
        a7.g(context, attributeSet);
        b2.m mVar = a7.f25534b;
        int i11 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i11 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean areEqual = Intrinsics.areEqual("argument", name2);
                int[] iArr = z1.a.f25879b;
                if (areEqual) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(...)");
                    String argumentName = obtainAttributes.getString(0);
                    if (argumentName == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    k argument = c(obtainAttributes, resources, i5);
                    Intrinsics.checkNotNullParameter(argumentName, "argumentName");
                    Intrinsics.checkNotNullParameter(argument, "argument");
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(argumentName, "argumentName");
                    Intrinsics.checkNotNullParameter(argument, "argument");
                    mVar.f3016d.put(argumentName, argument);
                    Unit unit = Unit.f19194a;
                    obtainAttributes.recycle();
                } else if (Intrinsics.areEqual("deepLink", name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, z1.a.f25880c);
                    Intrinsics.checkNotNullExpressionValue(obtainAttributes2, "obtainAttributes(...)");
                    String string = obtainAttributes2.getString(3);
                    String string2 = obtainAttributes2.getString(1);
                    String string3 = obtainAttributes2.getString(2);
                    if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
                        break;
                    }
                    if (string != null) {
                        String packageName = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        uriPattern = kotlin.text.z.m(string, "${applicationId}", packageName);
                        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                    } else {
                        uriPattern = null;
                    }
                    if (string2 == null || string2.length() == 0) {
                        action = null;
                    } else {
                        String packageName2 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                        action = kotlin.text.z.m(string2, "${applicationId}", packageName2);
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (action.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string3 != null) {
                        String packageName3 = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName3, "getPackageName(...)");
                        mimeType = kotlin.text.z.m(string3, "${applicationId}", packageName3);
                        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                    } else {
                        mimeType = null;
                    }
                    x navDeepLink = new x(uriPattern, action, mimeType);
                    Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
                    ArrayList C = rh.g.C(mVar.f3016d, new b2.k(navDeepLink, 0));
                    if (!C.isEmpty()) {
                        StringBuilder p10 = d9.e.p("Deep link ", uriPattern, " can't be used to open destination ");
                        p10.append(mVar.f3013a);
                        p10.append(".\nFollowing required arguments are missing: ");
                        p10.append(C);
                        throw new IllegalArgumentException(p10.toString().toString());
                    }
                    mVar.f3015c.add(navDeepLink);
                    Unit unit2 = Unit.f19194a;
                    obtainAttributes2.recycle();
                } else if (Intrinsics.areEqual("action", name2)) {
                    int[] NavAction = z1.a.f25878a;
                    Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    Context context2 = context;
                    b2.m mVar2 = mVar;
                    h action2 = new h(obtainStyledAttributes.getResourceId(1, 0));
                    action2.f25551b = new i0(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                    kotlin.collections.n0.c().getClass();
                    Bundle bundle = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(bundle, "source");
                    int i12 = depth2;
                    int i13 = 1;
                    int depth3 = xmlResourceParser.getDepth() + 1;
                    while (true) {
                        int next2 = xmlResourceParser.next();
                        if (next2 == i13) {
                            i10 = resourceId;
                            break;
                        }
                        int depth4 = xmlResourceParser.getDepth();
                        i10 = resourceId;
                        if (depth4 < depth3 && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth4 <= depth3 && Intrinsics.areEqual("argument", xmlResourceParser.getName())) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                            Intrinsics.checkNotNullExpressionValue(obtainAttributes3, "obtainAttributes(...)");
                            String name3 = obtainAttributes3.getString(0);
                            if (name3 == null) {
                                throw new XmlPullParserException("Arguments must have a name");
                            }
                            k c2 = c(obtainAttributes3, resources, i5);
                            boolean z5 = c2.f25580c;
                            if (z5) {
                                Intrinsics.checkNotNullParameter(name3, "name");
                                Intrinsics.checkNotNullParameter(bundle, "bundle");
                                if (z5 && (obj = c2.f25581d) != null) {
                                    c2.f25578a.e(bundle, name3, obj);
                                }
                            }
                            Unit unit3 = Unit.f19194a;
                            obtainAttributes3.recycle();
                        }
                        resourceId = i10;
                        i13 = 1;
                    }
                    Intrinsics.checkNotNullParameter(bundle, "source");
                    if (!bundle.isEmpty()) {
                        action2.f25552c = bundle;
                    }
                    Intrinsics.checkNotNullParameter(action2, "action");
                    if (a7 instanceof b) {
                        throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + a7 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("Cannot have an action with actionId 0");
                    }
                    a7.f25537e.f(i10, action2);
                    obtainStyledAttributes.recycle();
                    i11 = 1;
                    g0Var2 = this;
                    context = context2;
                    mVar = mVar2;
                    depth2 = i12;
                } else {
                    Context context3 = context;
                    b2.m mVar3 = mVar;
                    int i14 = depth2;
                    if (Intrinsics.areEqual("include", name2) && (a7 instanceof d0)) {
                        TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, w0.f25647c);
                        Intrinsics.checkNotNullExpressionValue(obtainAttributes4, "obtainAttributes(...)");
                        g0Var = this;
                        ((d0) a7).h(g0Var.b(obtainAttributes4.getResourceId(0, 0)));
                        Unit unit4 = Unit.f19194a;
                        obtainAttributes4.recycle();
                    } else {
                        g0Var = this;
                        if (a7 instanceof d0) {
                            ((d0) a7).h(a(resources, xmlResourceParser, attributeSet, i5));
                        }
                    }
                    g0Var2 = g0Var;
                    context = context3;
                    mVar = mVar3;
                    depth2 = i14;
                }
                i11 = 1;
            }
        }
    }

    public final d0 b(int i5) {
        int next;
        Resources resources = this.f25548a.getResources();
        XmlResourceParser xml = resources.getXml(i5);
        Intrinsics.checkNotNullExpressionValue(xml, "getXml(...)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e7) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i5) + " line " + xml.getLineNumber(), e7);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNull(resources);
        Intrinsics.checkNotNull(asAttributeSet);
        b0 a7 = a(resources, xml, asAttributeSet, i5);
        if (a7 instanceof d0) {
            return (d0) a7;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
