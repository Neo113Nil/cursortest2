package oi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f21297x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f21298y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f21299a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f21300b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f21301c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f21302d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f21303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21304f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21305g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21306h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21307i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21308k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21309l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21310m;

    /* renamed from: n, reason: collision with root package name */
    public String f21311n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21312o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21313p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public String f21314r;

    /* renamed from: s, reason: collision with root package name */
    public Headers f21315s;

    /* renamed from: t, reason: collision with root package name */
    public gh.b0 f21316t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashSet f21317u;

    /* renamed from: v, reason: collision with root package name */
    public z0[] f21318v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21319w;

    public q0(androidx.appcompat.widget.a0 a0Var, Method method) {
        this.f21299a = a0Var;
        this.f21300b = method;
        this.f21301c = method.getAnnotations();
        this.f21303e = method.getGenericParameterTypes();
        this.f21302d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z5) {
        String str3 = this.f21311n;
        Method method = this.f21300b;
        if (str3 != null) {
            throw z0.l(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f21311n = str;
        this.f21312o = z5;
        if (str2.isEmpty()) {
            return;
        }
        int indexOf = str2.indexOf(63);
        Pattern pattern = f21297x;
        if (indexOf != -1 && indexOf < str2.length() - 1) {
            String substring = str2.substring(indexOf + 1);
            if (pattern.matcher(substring).find()) {
                throw z0.l(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
            }
        }
        this.f21314r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f21317u = linkedHashSet;
    }

    public final void c(int i5, Type type) {
        if (z0.j(type)) {
            throw z0.m(this.f21300b, i5, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
