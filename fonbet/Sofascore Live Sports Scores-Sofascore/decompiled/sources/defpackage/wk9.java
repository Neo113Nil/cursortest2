package defpackage;

import com.ironsource.C4094gc;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class wk9 {
    public final u84 a;
    public final yg2 b;
    public final qs3 c;

    public wk9(u84 u84Var, yg2 yg2Var, qs3 qs3Var) {
        this.a = u84Var;
        this.b = yg2Var;
        this.c = qs3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wk9 b(ox9 ox9Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        yaa yaaVar;
        int i;
        int i2;
        yaa[] yaaVarArr;
        int i3;
        int i4;
        String str;
        yaa yaaVar2;
        yaa o8eVar;
        j8e j8eVar;
        j8e j8eVar2;
        String str2;
        k0g k0gVar = new k0g(ox9Var, cls, method);
        Annotation[] annotationArr = k0gVar.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            boolean z4 = true;
            yaa yaaVar3 = null;
            if (i6 >= length) {
                if (k0gVar.o == null) {
                    throw kik.J(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!k0gVar.p) {
                    if (k0gVar.r) {
                        throw kik.J(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (k0gVar.q) {
                        throw kik.J(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = k0gVar.e;
                int length2 = annotationArr2.length;
                k0gVar.w = new yaa[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    yaa[] yaaVarArr2 = k0gVar.w;
                    Type type = k0gVar.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        yaaVar = yaaVar3;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof kek) {
                                k0gVar.c(i8, type);
                                if (k0gVar.n) {
                                    throw kik.M(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (k0gVar.j) {
                                    throw kik.M(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (k0gVar.k) {
                                    throw kik.M(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (k0gVar.l) {
                                    throw kik.M(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (k0gVar.m) {
                                    throw kik.M(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (k0gVar.s != null) {
                                    throw kik.M(method, i8, "@Url cannot be used with @%s URL", k0gVar.o);
                                }
                                k0gVar.n = true;
                                if (type != jl9.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw kik.M(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                yaaVar2 = new n8e(method, i8, 1);
                                str = str3;
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof vae;
                                ox9 ox9Var2 = k0gVar.a;
                                if (z5) {
                                    k0gVar.c(i8, type);
                                    if (k0gVar.k) {
                                        throw kik.M(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (k0gVar.l) {
                                        throw kik.M(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (k0gVar.m) {
                                        throw kik.M(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (k0gVar.n) {
                                        throw kik.M(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (k0gVar.s == null) {
                                        throw kik.M(method, i8, "@Path can only be used with relative url on @%s", k0gVar.o);
                                    }
                                    k0gVar.j = true;
                                    vae vaeVar = (vae) annotation;
                                    String value = vaeVar.value();
                                    if (!k0g.z.matcher(value).matches()) {
                                        throw kik.M(method, i8, "@Path parameter name must match %s. Found: %s", k0g.y.pattern(), value);
                                    }
                                    if (!k0gVar.v.contains(value)) {
                                        throw kik.M(method, i8, "URL \"%s\" does not contain \"{%s}\".", k0gVar.s, value);
                                    }
                                    ox9Var2.r(type, annotationArr3);
                                    yaaVar2 = new p8e(k0gVar.c, i8, value, vaeVar.encoded());
                                    str = str3;
                                } else {
                                    i2 = i10;
                                    yaaVarArr = yaaVarArr2;
                                    if (annotation instanceof qif) {
                                        k0gVar.c(i8, type);
                                        qif qifVar = (qif) annotation;
                                        String value2 = qifVar.value();
                                        boolean encoded = qifVar.encoded();
                                        i3 = i9;
                                        Class y = kik.y(type);
                                        i4 = length3;
                                        k0gVar.k = true;
                                        if (Iterable.class.isAssignableFrom(y)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw kik.M(method, i8, y.getSimpleName() + " must include generic type (e.g., " + y.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            ox9Var2.r(kik.x(0, (ParameterizedType) type), annotationArr3);
                                            j8eVar2 = new j8e(new l8e(2, value2, encoded), 0);
                                        } else if (y.isArray()) {
                                            ox9Var2.r(k0g.a(y.getComponentType()), annotationArr3);
                                            j8eVar2 = new j8e(new l8e(2, value2, encoded), 1);
                                        } else {
                                            ox9Var2.r(type, annotationArr3);
                                            yaaVar2 = new l8e(2, value2, encoded);
                                            str = str3;
                                        }
                                        yaaVar2 = j8eVar2;
                                        str = str3;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof sif) {
                                            k0gVar.c(i8, type);
                                            boolean encoded2 = ((sif) annotation).encoded();
                                            Class y2 = kik.y(type);
                                            k0gVar.l = true;
                                            if (Iterable.class.isAssignableFrom(y2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw kik.M(method, i8, y2.getSimpleName() + " must include generic type (e.g., " + y2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                ox9Var2.r(kik.x(0, (ParameterizedType) type), annotationArr3);
                                                j8eVar2 = new j8e(new q8e(encoded2), 0);
                                            } else if (y2.isArray()) {
                                                ox9Var2.r(k0g.a(y2.getComponentType()), annotationArr3);
                                                j8eVar2 = new j8e(new q8e(encoded2), 1);
                                            } else {
                                                ox9Var2.r(type, annotationArr3);
                                                yaaVar2 = new q8e(encoded2);
                                            }
                                            yaaVar2 = j8eVar2;
                                        } else if (annotation instanceof rif) {
                                            k0gVar.c(i8, type);
                                            Class y3 = kik.y(type);
                                            k0gVar.m = true;
                                            if (!Map.class.isAssignableFrom(y3)) {
                                                throw kik.M(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type A = kik.A(type, y3);
                                            if (!(A instanceof ParameterizedType)) {
                                                throw kik.M(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) A;
                                            Type x = kik.x(0, parameterizedType);
                                            if (String.class != x) {
                                                throw kik.M(method, i8, "@QueryMap keys must be of type String: " + x, new Object[0]);
                                            }
                                            ox9Var2.r(kik.x(1, parameterizedType), annotationArr3);
                                            yaaVar2 = new m8e(method, i8, ((rif) annotation).encoded(), 2);
                                        } else {
                                            str = str3;
                                            if (annotation instanceof w79) {
                                                k0gVar.c(i8, type);
                                                w79 w79Var = (w79) annotation;
                                                String value3 = w79Var.value();
                                                Class y4 = kik.y(type);
                                                if (Iterable.class.isAssignableFrom(y4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw kik.M(method, i8, y4.getSimpleName() + " must include generic type (e.g., " + y4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    ox9Var2.r(kik.x(0, (ParameterizedType) type), annotationArr3);
                                                    o8eVar = new j8e(new l8e(1, value3, w79Var.allowUnsafeNonAsciiValues()), 0);
                                                } else if (y4.isArray()) {
                                                    ox9Var2.r(k0g.a(y4.getComponentType()), annotationArr3);
                                                    o8eVar = new j8e(new l8e(1, value3, w79Var.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    ox9Var2.r(type, annotationArr3);
                                                    yaaVar2 = new l8e(1, value3, w79Var.allowUnsafeNonAsciiValues());
                                                }
                                                yaaVar2 = o8eVar;
                                            } else if (annotation instanceof b89) {
                                                if (type == q89.class) {
                                                    yaaVar2 = new n8e(method, i8, 0);
                                                } else {
                                                    k0gVar.c(i8, type);
                                                    Class y5 = kik.y(type);
                                                    if (!Map.class.isAssignableFrom(y5)) {
                                                        throw kik.M(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type A2 = kik.A(type, y5);
                                                    if (!(A2 instanceof ParameterizedType)) {
                                                        throw kik.M(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) A2;
                                                    Type x2 = kik.x(0, parameterizedType2);
                                                    if (String.class != x2) {
                                                        throw kik.M(method, i8, "@HeaderMap keys must be of type String: " + x2, new Object[0]);
                                                    }
                                                    ox9Var2.r(kik.x(1, parameterizedType2), annotationArr3);
                                                    yaaVar2 = new m8e(method, i8, ((b89) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof lz7) {
                                                k0gVar.c(i8, type);
                                                if (!k0gVar.q) {
                                                    throw kik.M(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                lz7 lz7Var = (lz7) annotation;
                                                String value4 = lz7Var.value();
                                                boolean encoded3 = lz7Var.encoded();
                                                k0gVar.g = true;
                                                Class y6 = kik.y(type);
                                                if (Iterable.class.isAssignableFrom(y6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw kik.M(method, i8, y6.getSimpleName() + " must include generic type (e.g., " + y6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    ox9Var2.r(kik.x(0, (ParameterizedType) type), annotationArr3);
                                                    o8eVar = new j8e(new l8e(0, value4, encoded3), 0);
                                                } else if (y6.isArray()) {
                                                    ox9Var2.r(k0g.a(y6.getComponentType()), annotationArr3);
                                                    o8eVar = new j8e(new l8e(0, value4, encoded3), 1);
                                                } else {
                                                    ox9Var2.r(type, annotationArr3);
                                                    yaaVar2 = new l8e(0, value4, encoded3);
                                                }
                                                yaaVar2 = o8eVar;
                                            } else if (annotation instanceof qz7) {
                                                k0gVar.c(i8, type);
                                                if (!k0gVar.q) {
                                                    throw kik.M(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class y7 = kik.y(type);
                                                if (!Map.class.isAssignableFrom(y7)) {
                                                    throw kik.M(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type A3 = kik.A(type, y7);
                                                if (!(A3 instanceof ParameterizedType)) {
                                                    throw kik.M(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) A3;
                                                int i12 = 0;
                                                Type x3 = kik.x(0, parameterizedType3);
                                                if (String.class != x3) {
                                                    throw kik.M(method, i8, "@FieldMap keys must be of type String: " + x3, new Object[0]);
                                                }
                                                ox9Var2.r(kik.x(1, parameterizedType3), annotationArr3);
                                                k0gVar.g = true;
                                                yaaVar2 = new m8e(method, i8, ((qz7) annotation).encoded(), i12);
                                            } else if (annotation instanceof y9e) {
                                                k0gVar.c(i8, type);
                                                if (!k0gVar.r) {
                                                    throw kik.M(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                y9e y9eVar = (y9e) annotation;
                                                k0gVar.h = true;
                                                String value5 = y9eVar.value();
                                                Class y8 = kik.y(type);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(y8);
                                                    r8e r8eVar = r8e.h;
                                                    if (isAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw kik.M(method, i8, y8.getSimpleName() + " must include generic type (e.g., " + y8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!dzc.class.isAssignableFrom(kik.y(kik.x(0, (ParameterizedType) type)))) {
                                                            throw kik.M(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        yaaVar2 = new j8e(r8eVar, 0);
                                                    } else if (y8.isArray()) {
                                                        if (!dzc.class.isAssignableFrom(y8.getComponentType())) {
                                                            throw kik.M(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        yaaVar2 = new j8e(r8eVar, 1);
                                                    } else {
                                                        if (!dzc.class.isAssignableFrom(y8)) {
                                                            throw kik.M(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        yaaVar2 = r8eVar;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", lnb.o("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", y9eVar.encoding()};
                                                    q89 q89Var = q89.b;
                                                    q89 F = ktm.F(strArr);
                                                    if (Iterable.class.isAssignableFrom(y8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw kik.M(method, i8, y8.getSimpleName() + " must include generic type (e.g., " + y8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type x4 = kik.x(0, (ParameterizedType) type);
                                                        if (dzc.class.isAssignableFrom(kik.y(x4))) {
                                                            throw kik.M(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        j8eVar = new j8e(new o8e(method, i8, F, ox9Var2.n(x4, annotationArr3, annotationArr)), 0);
                                                    } else if (y8.isArray()) {
                                                        Class a = k0g.a(y8.getComponentType());
                                                        if (dzc.class.isAssignableFrom(a)) {
                                                            throw kik.M(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        j8eVar = new j8e(new o8e(method, i8, F, ox9Var2.n(a, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (dzc.class.isAssignableFrom(y8)) {
                                                            throw kik.M(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        o8eVar = new o8e(method, i8, F, ox9Var2.n(type, annotationArr3, annotationArr));
                                                        yaaVar2 = o8eVar;
                                                    }
                                                    yaaVar2 = j8eVar;
                                                }
                                            } else if (annotation instanceof z9e) {
                                                k0gVar.c(i8, type);
                                                if (!k0gVar.r) {
                                                    throw kik.M(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                k0gVar.h = true;
                                                Class y9 = kik.y(type);
                                                if (!Map.class.isAssignableFrom(y9)) {
                                                    throw kik.M(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type A4 = kik.A(type, y9);
                                                if (!(A4 instanceof ParameterizedType)) {
                                                    throw kik.M(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) A4;
                                                Type x5 = kik.x(0, parameterizedType4);
                                                if (String.class != x5) {
                                                    throw kik.M(method, i8, "@PartMap keys must be of type String: " + x5, new Object[0]);
                                                }
                                                Type x6 = kik.x(1, parameterizedType4);
                                                if (dzc.class.isAssignableFrom(kik.y(x6))) {
                                                    throw kik.M(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                yaaVar2 = new o8e(method, i8, ox9Var2.n(x6, annotationArr3, annotationArr), ((z9e) annotation).encoding());
                                            } else if (annotation instanceof yy1) {
                                                k0gVar.c(i8, type);
                                                if (k0gVar.q || k0gVar.r) {
                                                    throw kik.M(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (k0gVar.i) {
                                                    throw kik.M(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    qs3 n = ox9Var2.n(type, annotationArr3, annotationArr);
                                                    k0gVar.i = true;
                                                    yaaVar2 = new k8e(method, i8, n);
                                                } catch (RuntimeException e) {
                                                    throw kik.N(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof cti) {
                                                k0gVar.c(i8, type);
                                                Class a2 = k0g.a(kik.y(type));
                                                for (int i13 = i8 - 1; i13 >= 0; i13--) {
                                                    yaa yaaVar4 = k0gVar.w[i13];
                                                    if ((yaaVar4 instanceof s8e) && ((s8e) yaaVar4).h.equals(a2)) {
                                                        throw kik.M(method, i8, "@Tag type " + a2.getName() + " is duplicate of " + hie.b.c(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                yaaVar2 = new s8e(a2);
                                            } else {
                                                yaaVar2 = null;
                                            }
                                        }
                                        str = str3;
                                    }
                                    if (yaaVar2 != null) {
                                        if (yaaVar != null) {
                                            throw kik.M(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        yaaVar = yaaVar2;
                                    }
                                    i10 = i2 + 1;
                                    annotationArr2 = annotationArr4;
                                    i7 = i;
                                    length2 = i11;
                                    i9 = i3;
                                    str3 = str;
                                    yaaVarArr2 = yaaVarArr;
                                    length3 = i4;
                                }
                            }
                            i2 = i10;
                            yaaVarArr = yaaVarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (yaaVar2 != null) {
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str3 = str;
                            yaaVarArr2 = yaaVarArr;
                            length3 = i4;
                        }
                    } else {
                        yaaVar = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str4 = str3;
                    int i15 = i7;
                    yaa[] yaaVarArr3 = yaaVarArr2;
                    int i16 = i9;
                    if (yaaVar == null) {
                        if (i16 != 0) {
                            try {
                                if (kik.y(type) == rq3.class) {
                                    k0gVar.x = true;
                                    yaaVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw kik.M(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    yaaVarArr3[i8] = yaaVar;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i15;
                    length2 = i14;
                    str3 = str4;
                    i5 = 0;
                    yaaVar3 = null;
                }
                String str5 = str3;
                if (k0gVar.s == null && !k0gVar.n) {
                    throw kik.J(method, null, "Missing either @%s URL or @Url parameter.", k0gVar.o);
                }
                boolean z6 = k0gVar.q;
                if (!z6 && !k0gVar.r && !k0gVar.p && k0gVar.i) {
                    throw kik.J(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !k0gVar.g) {
                    throw kik.J(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (k0gVar.r && !k0gVar.h) {
                    throw kik.J(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                u84 u84Var = new u84(k0gVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (kik.C(genericReturnType2)) {
                    throw kik.J(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw kik.J(method, null, "Service methods cannot return void.", new Object[0]);
                }
                boolean z7 = u84Var.d;
                Annotation[] annotations = method.getAnnotations();
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type2 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (kik.y(type2) == c2g.class && (type2 instanceof ParameterizedType)) {
                        type2 = kik.x(0, (ParameterizedType) type2);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (kik.y(type2) == zg2.class) {
                            throw kik.J(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", kik.x(0, (ParameterizedType) type2));
                        }
                        z3 = kik.q && type2 == Unit.class;
                        z2 = false;
                    }
                    genericReturnType = new pik(null, zg2.class, type2);
                    if (!kik.G(annotations, xkh.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = ykh.d;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    ch2 d = ox9Var.d(genericReturnType, annotations);
                    Type c = d.c();
                    if (c == d2g.class) {
                        throw kik.J(method, null, "'" + kik.y(c).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (c == c2g.class) {
                        throw kik.J(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (((String) u84Var.h).equals(str5) && !Void.class.equals(c) && (!kik.q || c != Unit.class)) {
                        throw kik.J(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        qs3 o = ox9Var.o(c, method.getAnnotations());
                        yg2 yg2Var = (yg2) ox9Var.c;
                        return !z7 ? new uk9(u84Var, yg2Var, o, d, 0) : z2 ? new uk9(u84Var, yg2Var, o, d, 1) : new vk9(u84Var, yg2Var, o, d, z);
                    } catch (RuntimeException e2) {
                        throw kik.J(method, e2, "Unable to create converter for %s", c);
                    }
                } catch (RuntimeException e3) {
                    throw kik.J(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof kb4) {
                k0gVar.b("DELETE", ((kb4) annotation2).value(), false);
            } else if (annotation2 instanceof iu8) {
                k0gVar.b(C4094gc.a, ((iu8) annotation2).value(), false);
            } else if (annotation2 instanceof s59) {
                k0gVar.b("HEAD", ((s59) annotation2).value(), false);
            } else if (annotation2 instanceof czd) {
                k0gVar.b("PATCH", ((czd) annotation2).value(), true);
            } else if (annotation2 instanceof i0e) {
                k0gVar.b(C4094gc.b, ((i0e) annotation2).value(), true);
            } else if (annotation2 instanceof h3e) {
                k0gVar.b("PUT", ((h3e) annotation2).value(), true);
            } else if (annotation2 instanceof ojd) {
                k0gVar.b("OPTIONS", ((ojd) annotation2).value(), false);
            } else if (annotation2 instanceof t59) {
                t59 t59Var = (t59) annotation2;
                k0gVar.b(t59Var.method(), t59Var.path(), t59Var.hasBody());
            } else if (annotation2 instanceof r89) {
                r89 r89Var = (r89) annotation2;
                String[] value6 = r89Var.value();
                if (value6.length == 0) {
                    throw kik.J(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean allowUnsafeNonAsciiValues = r89Var.allowUnsafeNonAsciiValues();
                ef0 ef0Var = new ef0(1);
                int length4 = value6.length;
                int i17 = 0;
                while (i17 < length4) {
                    str2 = value6[i17];
                    int indexOf = str2.indexOf(58);
                    boolean z8 = z4;
                    if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                        break loop0;
                    }
                    String substring = str2.substring(0, indexOf);
                    String trim = str2.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            Regex regex = zdc.e;
                            k0gVar.u = bea.v(trim);
                        } catch (IllegalArgumentException e4) {
                            throw kik.J(method, e4, "Malformed content type: %s", trim);
                        }
                    } else if (allowUnsafeNonAsciiValues) {
                        ef0Var.d(substring, trim);
                    } else {
                        ef0Var.b(substring, trim);
                    }
                    i17++;
                    z4 = z8;
                }
                k0gVar.t = vha.i(ef0Var);
            } else if (annotation2 instanceof czc) {
                if (k0gVar.q) {
                    throw kik.J(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                k0gVar.r = true;
            } else if (!(annotation2 instanceof nm8)) {
                continue;
            } else {
                if (k0gVar.r) {
                    throw kik.J(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                k0gVar.q = true;
            }
            i6++;
        }
        throw kik.J(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object a(dod dodVar, Object[] objArr);
}
