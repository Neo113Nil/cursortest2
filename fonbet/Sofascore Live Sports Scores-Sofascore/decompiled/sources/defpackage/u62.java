package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u62 extends ps3 {
    public final /* synthetic */ int a;

    public /* synthetic */ u62(int i) {
        this.a = i;
    }

    @Override // defpackage.ps3
    public qs3 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ox9 ox9Var) {
        switch (this.a) {
            case 0:
                if (yzf.class.isAssignableFrom(kik.y(type))) {
                    return hjg.b;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, ox9Var);
        }
    }

    @Override // defpackage.ps3
    public final qs3 b(Type type, Annotation[] annotationArr, ox9 ox9Var) {
        switch (this.a) {
            case 0:
                if (type == i2g.class) {
                    return kik.G(annotationArr, dhi.class) ? kpg.b : tnf.b;
                }
                if (type == Void.class) {
                    return k03.c;
                }
                if (kik.q && type == Unit.class) {
                    return dti.b;
                }
                return null;
            default:
                if (kik.y(type) != Optional.class) {
                    return null;
                }
                return new by9(ox9Var.o(kik.x(0, (ParameterizedType) type), annotationArr));
        }
    }
}
