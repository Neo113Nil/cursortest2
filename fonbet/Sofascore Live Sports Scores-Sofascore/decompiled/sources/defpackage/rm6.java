package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rm6 extends ps3 {
    public final zdc a;
    public final yia b;

    public rm6(zdc zdcVar, yia yiaVar) {
        this.a = zdcVar;
        this.b = yiaVar;
    }

    @Override // defpackage.ps3
    public final qs3 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ox9 ox9Var) {
        type.getClass();
        annotationArr2.getClass();
        yia yiaVar = this.b;
        return new l2a(19, this.a, rha.z(((yea) yiaVar.b).b, type), yiaVar);
    }

    @Override // defpackage.ps3
    public final qs3 b(Type type, Annotation[] annotationArr, ox9 ox9Var) {
        annotationArr.getClass();
        yia yiaVar = this.b;
        return new fp4(3, rha.z(((yea) yiaVar.b).b, type), yiaVar);
    }
}
