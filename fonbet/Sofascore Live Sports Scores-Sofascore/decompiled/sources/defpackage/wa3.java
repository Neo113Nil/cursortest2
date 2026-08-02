package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wa3 extends bh2 {
    @Override // defpackage.bh2
    public final ch2 a(Type type, Annotation[] annotationArr) {
        if (kik.y(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            a70.r("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type x = kik.x(0, (ParameterizedType) type);
        if (kik.y(x) != c2g.class) {
            return new ta3(x);
        }
        if (x instanceof ParameterizedType) {
            return new va3(kik.x(0, (ParameterizedType) x));
        }
        a70.r("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
