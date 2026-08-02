package zd;

import ed.C6345a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11108j {
    public static final C11105g a(@NotNull Annotation[] annotationArr, @NotNull Sd.c fqName) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        int length = annotationArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i11];
            if (Intrinsics.d(C11104f.a(C6345a.b(C6345a.a(annotation))).a(), fqName)) {
                break;
            }
            i11++;
        }
        if (annotation != null) {
            return new C11105g(annotation);
        }
        return null;
    }

    @NotNull
    public static final ArrayList b(@NotNull Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C11105g(annotation));
        }
        return arrayList;
    }
}
