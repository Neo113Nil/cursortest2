package defpackage;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q49 extends ps3 {
    public final Gson a;

    public q49(Gson gson) {
        this.a = gson;
    }

    @Override // defpackage.ps3
    public final qs3 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ox9 ox9Var) {
        u5k u5kVar = new u5k(type);
        Gson gson = this.a;
        return new r49(gson, gson.getAdapter(u5kVar));
    }

    @Override // defpackage.ps3
    public final qs3 b(Type type, Annotation[] annotationArr, ox9 ox9Var) {
        u5k u5kVar = new u5k(type);
        Gson gson = this.a;
        return new fp4(28, gson, gson.getAdapter(u5kVar));
    }
}
