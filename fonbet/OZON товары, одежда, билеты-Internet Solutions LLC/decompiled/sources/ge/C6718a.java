package ge;

import Nd.a;
import Nd.k;
import Nd.m;
import Nd.p;
import Nd.r;
import Nd.t;
import Td.f;
import Td.h;
import ee.C6349a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ge.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6718a extends C6349a {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final C6718a f64290m;

    static {
        f c11 = f.c();
        Od.b.a(c11);
        Intrinsics.checkNotNullExpressionValue(c11, "apply(...)");
        h.f<k, Integer> packageFqName = Od.b.f20215a;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        h.f<Nd.c, List<Nd.a>> constructorAnnotation = Od.b.f20217c;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        h.f<Nd.b, List<Nd.a>> classAnnotation = Od.b.f20216b;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        h.f<Nd.h, List<Nd.a>> functionAnnotation = Od.b.f20218d;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        h.f<m, List<Nd.a>> propertyAnnotation = Od.b.f20219e;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        h.f<m, List<Nd.a>> propertyGetterAnnotation = Od.b.f20220f;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        h.f<m, List<Nd.a>> propertySetterAnnotation = Od.b.f20221g;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        h.f<Nd.f, List<Nd.a>> enumEntryAnnotation = Od.b.f20223i;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        h.f<m, a.b.c> compileTimeValue = Od.b.f20222h;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        h.f<t, List<Nd.a>> parameterAnnotation = Od.b.f20224j;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        h.f<p, List<Nd.a>> typeAnnotation = Od.b.f20225k;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        h.f<r, List<Nd.a>> typeParameterAnnotation = Od.b.f20226l;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
        f64290m = new C6718a(c11, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    @NotNull
    public static String m(@NotNull Sd.c fqName) {
        String b11;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b12 = fqName.b();
        Intrinsics.checkNotNullExpressionValue(b12, "asString(...)");
        sb2.append(kotlin.text.h.Y(b12, '.', '/'));
        sb2.append('/');
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb3 = new StringBuilder();
        if (fqName.d()) {
            b11 = "default-package";
        } else {
            b11 = fqName.g().b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        }
        sb3.append(b11);
        sb3.append(".kotlin_builtins");
        sb2.append(sb3.toString());
        return sb2.toString();
    }
}
