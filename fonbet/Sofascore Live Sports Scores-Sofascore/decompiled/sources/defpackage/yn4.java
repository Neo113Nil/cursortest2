package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yn4 extends bh2 {
    public final Executor a;

    public yn4(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.bh2
    public final ch2 a(Type type, Annotation[] annotationArr) {
        if (kik.y(type) != zg2.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new z41(24, kik.x(0, (ParameterizedType) type), kik.G(annotationArr, xkh.class) ? null : this.a);
        }
        a70.p("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
