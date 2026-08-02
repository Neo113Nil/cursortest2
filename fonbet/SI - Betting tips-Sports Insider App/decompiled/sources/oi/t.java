package oi;

import androidx.appcompat.widget.c1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f21337a;

    /* renamed from: b, reason: collision with root package name */
    public final gh.d f21338b;

    /* renamed from: c, reason: collision with root package name */
    public final m f21339c;

    public t(r0 r0Var, gh.d dVar, m mVar) {
        this.f21337a = r0Var;
        this.f21338b = dVar;
        this.f21339c = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0900 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t b(androidx.appcompat.widget.a0 a0Var, Method method) {
        Type genericReturnType;
        boolean z5;
        boolean z7;
        boolean z10;
        z0 z0Var;
        int i5;
        int i10;
        z0[] z0VarArr;
        int i11;
        int i12;
        String str;
        z0 z0Var2;
        z0 g0Var;
        b0 b0Var;
        b0 b0Var2;
        String str2;
        q0 q0Var = new q0(a0Var, method);
        Annotation[] annotationArr = q0Var.f21301c;
        int length = annotationArr.length;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            int i15 = 1;
            if (i14 >= length) {
                if (q0Var.f21311n == null) {
                    throw z0.l(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!q0Var.f21312o) {
                    if (q0Var.q) {
                        throw z0.l(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (q0Var.f21313p) {
                        throw z0.l(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = q0Var.f21302d;
                int length2 = annotationArr2.length;
                q0Var.f21318v = new z0[length2];
                int i16 = length2 - 1;
                int i17 = 0;
                while (i17 < length2) {
                    z0[] z0VarArr2 = q0Var.f21318v;
                    Type type = q0Var.f21303e[i17];
                    Annotation[] annotationArr3 = annotationArr2[i17];
                    int i18 = i17 == i16 ? i15 : i13;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        z0Var = null;
                        while (i13 < length3) {
                            Annotation annotation = annotationArr3[i13];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i19 = i13;
                            if (annotation instanceof qi.y) {
                                q0Var.c(i17, type);
                                if (q0Var.f21310m) {
                                    throw z0.m(method, i17, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (q0Var.f21307i) {
                                    throw z0.m(method, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (q0Var.j) {
                                    throw z0.m(method, i17, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (q0Var.f21308k) {
                                    throw z0.m(method, i17, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (q0Var.f21309l) {
                                    throw z0.m(method, i17, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (q0Var.f21314r != null) {
                                    throw z0.m(method, i17, "@Url cannot be used with @%s URL", q0Var.f21311n);
                                }
                                q0Var.f21310m = true;
                                if (type != gh.y.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw z0.m(method, i17, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                z0Var2 = new f0(method, i17, 1);
                                i5 = length2;
                            } else {
                                i5 = length2;
                                boolean z11 = annotation instanceof qi.s;
                                androidx.appcompat.widget.a0 a0Var2 = q0Var.f21299a;
                                if (z11) {
                                    q0Var.c(i17, type);
                                    if (q0Var.j) {
                                        throw z0.m(method, i17, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (q0Var.f21308k) {
                                        throw z0.m(method, i17, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (q0Var.f21309l) {
                                        throw z0.m(method, i17, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (q0Var.f21310m) {
                                        throw z0.m(method, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (q0Var.f21314r == null) {
                                        throw z0.m(method, i17, "@Path can only be used with relative url on @%s", q0Var.f21311n);
                                    }
                                    q0Var.f21307i = true;
                                    qi.s sVar = (qi.s) annotation;
                                    String value = sVar.value();
                                    if (!q0.f21298y.matcher(value).matches()) {
                                        throw z0.m(method, i17, "@Path parameter name must match %s. Found: %s", q0.f21297x.pattern(), value);
                                    }
                                    if (!q0Var.f21317u.contains(value)) {
                                        throw z0.m(method, i17, "URL \"%s\" does not contain \"{%s}\".", q0Var.f21314r, value);
                                    }
                                    a0Var2.F(type, annotationArr3);
                                    z0Var2 = new h0(q0Var.f21300b, i17, value, sVar.encoded());
                                } else {
                                    i10 = i16;
                                    z0VarArr = z0VarArr2;
                                    if (annotation instanceof qi.t) {
                                        q0Var.c(i17, type);
                                        qi.t tVar = (qi.t) annotation;
                                        String value2 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        i11 = i18;
                                        Class h10 = z0.h(type);
                                        i12 = length3;
                                        q0Var.j = true;
                                        if (Iterable.class.isAssignableFrom(h10)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw z0.m(method, i17, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            a0Var2.F(z0.g(0, (ParameterizedType) type), annotationArr3);
                                            b0Var2 = new b0(new d0(value2, 2, encoded), 0);
                                        } else if (h10.isArray()) {
                                            a0Var2.F(q0.a(h10.getComponentType()), annotationArr3);
                                            b0Var2 = new b0(new d0(value2, 2, encoded), 1);
                                        } else {
                                            a0Var2.F(type, annotationArr3);
                                            z0Var2 = new d0(value2, 2, encoded);
                                            str = str3;
                                        }
                                        z0Var2 = b0Var2;
                                        str = str3;
                                    } else {
                                        i11 = i18;
                                        i12 = length3;
                                        if (annotation instanceof qi.v) {
                                            q0Var.c(i17, type);
                                            boolean encoded2 = ((qi.v) annotation).encoded();
                                            Class h11 = z0.h(type);
                                            q0Var.f21308k = true;
                                            if (Iterable.class.isAssignableFrom(h11)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw z0.m(method, i17, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                a0Var2.F(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                b0Var2 = new b0(new i0(encoded2), 0);
                                            } else if (h11.isArray()) {
                                                a0Var2.F(q0.a(h11.getComponentType()), annotationArr3);
                                                b0Var2 = new b0(new i0(encoded2), 1);
                                            } else {
                                                a0Var2.F(type, annotationArr3);
                                                z0Var2 = new i0(encoded2);
                                            }
                                            z0Var2 = b0Var2;
                                        } else if (annotation instanceof qi.u) {
                                            q0Var.c(i17, type);
                                            Class h12 = z0.h(type);
                                            q0Var.f21309l = true;
                                            if (!Map.class.isAssignableFrom(h12)) {
                                                throw z0.m(method, i17, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type i20 = z0.i(type, h12);
                                            if (!(i20 instanceof ParameterizedType)) {
                                                throw z0.m(method, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) i20;
                                            Type g10 = z0.g(0, parameterizedType);
                                            if (String.class != g10) {
                                                throw z0.m(method, i17, "@QueryMap keys must be of type String: " + g10, new Object[0]);
                                            }
                                            a0Var2.F(z0.g(1, parameterizedType), annotationArr3);
                                            z0Var2 = new e0(method, i17, ((qi.u) annotation).encoded(), 2);
                                        } else {
                                            str = str3;
                                            if (annotation instanceof qi.i) {
                                                q0Var.c(i17, type);
                                                qi.i iVar = (qi.i) annotation;
                                                String value3 = iVar.value();
                                                Class h13 = z0.h(type);
                                                if (Iterable.class.isAssignableFrom(h13)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw z0.m(method, i17, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    a0Var2.F(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                    g0Var = new b0(new d0(value3, 1, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (h13.isArray()) {
                                                    a0Var2.F(q0.a(h13.getComponentType()), annotationArr3);
                                                    g0Var = new b0(new d0(value3, 1, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    a0Var2.F(type, annotationArr3);
                                                    z0Var2 = new d0(value3, 1, iVar.allowUnsafeNonAsciiValues());
                                                }
                                                z0Var2 = g0Var;
                                            } else if (annotation instanceof qi.j) {
                                                if (type == Headers.class) {
                                                    z0Var2 = new f0(method, i17, 0);
                                                } else {
                                                    q0Var.c(i17, type);
                                                    Class h14 = z0.h(type);
                                                    if (!Map.class.isAssignableFrom(h14)) {
                                                        throw z0.m(method, i17, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type i21 = z0.i(type, h14);
                                                    if (!(i21 instanceof ParameterizedType)) {
                                                        throw z0.m(method, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) i21;
                                                    Type g11 = z0.g(0, parameterizedType2);
                                                    if (String.class != g11) {
                                                        throw z0.m(method, i17, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
                                                    }
                                                    a0Var2.F(z0.g(1, parameterizedType2), annotationArr3);
                                                    z0Var2 = new e0(method, i17, ((qi.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof qi.c) {
                                                q0Var.c(i17, type);
                                                if (!q0Var.f21313p) {
                                                    throw z0.m(method, i17, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                qi.c cVar = (qi.c) annotation;
                                                String value4 = cVar.value();
                                                boolean encoded3 = cVar.encoded();
                                                q0Var.f21304f = true;
                                                Class h15 = z0.h(type);
                                                if (Iterable.class.isAssignableFrom(h15)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw z0.m(method, i17, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    a0Var2.F(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                    g0Var = new b0(new d0(value4, 0, encoded3), 0);
                                                } else if (h15.isArray()) {
                                                    a0Var2.F(q0.a(h15.getComponentType()), annotationArr3);
                                                    g0Var = new b0(new d0(value4, 0, encoded3), 1);
                                                } else {
                                                    a0Var2.F(type, annotationArr3);
                                                    z0Var2 = new d0(value4, 0, encoded3);
                                                }
                                                z0Var2 = g0Var;
                                            } else if (annotation instanceof qi.d) {
                                                q0Var.c(i17, type);
                                                if (!q0Var.f21313p) {
                                                    throw z0.m(method, i17, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class h16 = z0.h(type);
                                                if (!Map.class.isAssignableFrom(h16)) {
                                                    throw z0.m(method, i17, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i22 = z0.i(type, h16);
                                                if (!(i22 instanceof ParameterizedType)) {
                                                    throw z0.m(method, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) i22;
                                                Type g12 = z0.g(0, parameterizedType3);
                                                if (String.class != g12) {
                                                    throw z0.m(method, i17, "@FieldMap keys must be of type String: " + g12, new Object[0]);
                                                }
                                                a0Var2.F(z0.g(1, parameterizedType3), annotationArr3);
                                                q0Var.f21304f = true;
                                                z0Var2 = new e0(method, i17, ((qi.d) annotation).encoded(), 0);
                                            } else if (annotation instanceof qi.q) {
                                                q0Var.c(i17, type);
                                                if (!q0Var.q) {
                                                    throw z0.m(method, i17, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                qi.q qVar = (qi.q) annotation;
                                                q0Var.f21305g = true;
                                                String value5 = qVar.value();
                                                Class h17 = z0.h(type);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(h17);
                                                    j0 j0Var = j0.f21274c;
                                                    if (isAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw z0.m(method, i17, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!gh.d0.class.isAssignableFrom(z0.h(z0.g(0, (ParameterizedType) type)))) {
                                                            throw z0.m(method, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z0Var2 = new b0(j0Var, 0);
                                                    } else if (h17.isArray()) {
                                                        if (!gh.d0.class.isAssignableFrom(h17.getComponentType())) {
                                                            throw z0.m(method, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z0Var2 = new b0(j0Var, 1);
                                                    } else {
                                                        if (!gh.d0.class.isAssignableFrom(h17)) {
                                                            throw z0.m(method, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        z0Var2 = j0Var;
                                                    }
                                                } else {
                                                    Headers of2 = Headers.of("Content-Disposition", c1.n("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(h17)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw z0.m(method, i17, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type g13 = z0.g(0, (ParameterizedType) type);
                                                        if (gh.d0.class.isAssignableFrom(z0.h(g13))) {
                                                            throw z0.m(method, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        b0Var = new b0(new g0(method, i17, of2, a0Var2.z(g13, annotationArr3, annotationArr)), 0);
                                                    } else if (h17.isArray()) {
                                                        Class a7 = q0.a(h17.getComponentType());
                                                        if (gh.d0.class.isAssignableFrom(a7)) {
                                                            throw z0.m(method, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        b0Var = new b0(new g0(method, i17, of2, a0Var2.z(a7, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (gh.d0.class.isAssignableFrom(h17)) {
                                                            throw z0.m(method, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        g0Var = new g0(method, i17, of2, a0Var2.z(type, annotationArr3, annotationArr));
                                                        z0Var2 = g0Var;
                                                    }
                                                    z0Var2 = b0Var;
                                                }
                                            } else if (annotation instanceof qi.r) {
                                                q0Var.c(i17, type);
                                                if (!q0Var.q) {
                                                    throw z0.m(method, i17, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                q0Var.f21305g = true;
                                                Class h18 = z0.h(type);
                                                if (!Map.class.isAssignableFrom(h18)) {
                                                    throw z0.m(method, i17, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i23 = z0.i(type, h18);
                                                if (!(i23 instanceof ParameterizedType)) {
                                                    throw z0.m(method, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) i23;
                                                Type g14 = z0.g(0, parameterizedType4);
                                                if (String.class != g14) {
                                                    throw z0.m(method, i17, "@PartMap keys must be of type String: " + g14, new Object[0]);
                                                }
                                                Type g15 = z0.g(1, parameterizedType4);
                                                if (gh.d0.class.isAssignableFrom(z0.h(g15))) {
                                                    throw z0.m(method, i17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                z0Var2 = new g0(method, i17, a0Var2.z(g15, annotationArr3, annotationArr), ((qi.r) annotation).encoding());
                                            } else if (annotation instanceof qi.a) {
                                                q0Var.c(i17, type);
                                                if (q0Var.f21313p || q0Var.q) {
                                                    throw z0.m(method, i17, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (q0Var.f21306h) {
                                                    throw z0.m(method, i17, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    m z12 = a0Var2.z(type, annotationArr3, annotationArr);
                                                    q0Var.f21306h = true;
                                                    z0Var2 = new c0(method, i17, z12);
                                                } catch (RuntimeException e7) {
                                                    throw z0.n(method, e7, i17, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof qi.x) {
                                                q0Var.c(i17, type);
                                                Class a10 = q0.a(z0.h(type));
                                                for (int i24 = i17 - 1; i24 >= 0; i24--) {
                                                    z0 z0Var3 = q0Var.f21318v[i24];
                                                    if ((z0Var3 instanceof k0) && ((k0) z0Var3).f21275c.equals(a10)) {
                                                        throw z0.m(method, i17, "@Tag type " + a10.getName() + " is duplicate of " + l0.f21277b.c(i24, method) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                z0Var2 = new k0(a10);
                                            } else {
                                                z0Var2 = null;
                                            }
                                        }
                                        str = str3;
                                    }
                                    if (z0Var2 != null) {
                                        if (z0Var != null) {
                                            throw z0.m(method, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        z0Var = z0Var2;
                                    }
                                    i13 = i19 + 1;
                                    annotationArr2 = annotationArr4;
                                    length2 = i5;
                                    i18 = i11;
                                    str3 = str;
                                    i16 = i10;
                                    z0VarArr2 = z0VarArr;
                                    length3 = i12;
                                }
                            }
                            str = str3;
                            i10 = i16;
                            z0VarArr = z0VarArr2;
                            i11 = i18;
                            i12 = length3;
                            if (z0Var2 != null) {
                            }
                            i13 = i19 + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i5;
                            i18 = i11;
                            str3 = str;
                            i16 = i10;
                            z0VarArr2 = z0VarArr;
                            length3 = i12;
                        }
                    } else {
                        z0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i25 = length2;
                    String str4 = str3;
                    int i26 = i16;
                    z0[] z0VarArr3 = z0VarArr2;
                    int i27 = i18;
                    if (z0Var == null) {
                        if (i27 != 0) {
                            try {
                                if (z0.h(type) == Continuation.class) {
                                    q0Var.f21319w = true;
                                    z0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw z0.m(method, i17, "No Retrofit annotation found.", new Object[0]);
                    }
                    z0VarArr3[i17] = z0Var;
                    i17++;
                    annotationArr2 = annotationArr5;
                    length2 = i25;
                    str3 = str4;
                    i16 = i26;
                    i13 = 0;
                    i15 = 1;
                }
                String str5 = str3;
                if (q0Var.f21314r == null && !q0Var.f21310m) {
                    throw z0.l(method, null, "Missing either @%s URL or @Url parameter.", q0Var.f21311n);
                }
                boolean z13 = q0Var.f21313p;
                if (!z13 && !q0Var.q && !q0Var.f21312o && q0Var.f21306h) {
                    throw z0.l(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z13 && !q0Var.f21304f) {
                    throw z0.l(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (q0Var.q && !q0Var.f21305g) {
                    throw z0.l(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                r0 r0Var = new r0(q0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (z0.j(genericReturnType2)) {
                    throw z0.l(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw z0.l(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z14 = r0Var.f21331k;
                if (z14) {
                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r6.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (z0.h(type2) == s0.class && (type2 instanceof ParameterizedType)) {
                        type2 = z0.g(0, (ParameterizedType) type2);
                        z7 = true;
                        z10 = false;
                    } else {
                        if (z0.h(type2) == d.class) {
                            throw z0.l(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", z0.g(0, (ParameterizedType) type2));
                        }
                        z10 = z0.f21364b && type2 == Unit.class;
                        z7 = false;
                    }
                    genericReturnType = new x0(null, d.class, type2);
                    if (!z0.k(annotations, u0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = v0.f21347a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z5 = z10;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z5 = false;
                    z7 = false;
                }
                try {
                    f q = a0Var.q(genericReturnType, annotations);
                    Type a11 = q.a();
                    if (a11 == gh.o0.class) {
                        throw z0.l(method, null, "'" + z0.h(a11).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (a11 == s0.class) {
                        throw z0.l(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (r0Var.f21324c.equals(str5) && !Void.class.equals(a11) && (!z0.f21364b || a11 != Unit.class)) {
                        throw z0.l(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        m A = a0Var.A(a11, method.getAnnotations());
                        gh.d dVar = (gh.d) a0Var.f681c;
                        return !z14 ? new r(r0Var, dVar, A, q, 0) : z7 ? new r(r0Var, dVar, A, q, 1) : new s(r0Var, dVar, A, q, z5);
                    } catch (RuntimeException e9) {
                        throw z0.l(method, e9, "Unable to create converter for %s", a11);
                    }
                } catch (RuntimeException e10) {
                    throw z0.l(method, e10, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i14];
            if (annotation2 instanceof qi.b) {
                q0Var.b("DELETE", ((qi.b) annotation2).value(), false);
            } else if (annotation2 instanceof qi.f) {
                q0Var.b("GET", ((qi.f) annotation2).value(), false);
            } else if (annotation2 instanceof qi.g) {
                q0Var.b("HEAD", ((qi.g) annotation2).value(), false);
            } else if (annotation2 instanceof qi.n) {
                q0Var.b("PATCH", ((qi.n) annotation2).value(), true);
            } else if (annotation2 instanceof qi.o) {
                q0Var.b("POST", ((qi.o) annotation2).value(), true);
            } else if (annotation2 instanceof qi.p) {
                q0Var.b("PUT", ((qi.p) annotation2).value(), true);
            } else if (annotation2 instanceof qi.m) {
                q0Var.b("OPTIONS", ((qi.m) annotation2).value(), false);
            } else if (annotation2 instanceof qi.h) {
                qi.h hVar = (qi.h) annotation2;
                q0Var.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof qi.k) {
                qi.k kVar = (qi.k) annotation2;
                String[] value6 = kVar.value();
                if (value6.length == 0) {
                    throw z0.l(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean allowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                gh.v vVar = new gh.v();
                int length4 = value6.length;
                for (int i28 = 0; i28 < length4; i28++) {
                    str2 = value6[i28];
                    int indexOf = str2.indexOf(58);
                    if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                        break loop0;
                    }
                    String substring = str2.substring(0, indexOf);
                    String trim = str2.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            Regex regex = gh.b0.f10117d;
                            q0Var.f21316t = gh.a0.a(trim);
                        } catch (IllegalArgumentException e11) {
                            throw z0.l(method, e11, "Malformed content type: %s", trim);
                        }
                    } else if (allowUnsafeNonAsciiValues) {
                        vVar.c(substring, trim);
                    } else {
                        vVar.a(substring, trim);
                    }
                }
                q0Var.f21315s = vVar.d();
            } else if (annotation2 instanceof qi.l) {
                if (q0Var.f21313p) {
                    throw z0.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                q0Var.q = true;
            } else if (!(annotation2 instanceof qi.e)) {
                continue;
            } else {
                if (q0Var.q) {
                    throw z0.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                q0Var.f21313p = true;
            }
            i14++;
        }
        throw z0.l(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object a(a0 a0Var, Object[] objArr);
}
