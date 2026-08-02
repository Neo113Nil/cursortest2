package defpackage;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class swl implements v4k {
    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        u5kVar.getClass();
        u4k delegateAdapter = gson.getDelegateAdapter(this, u5kVar);
        Annotation[] declaredAnnotations = u5kVar.a.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            if (Intrinsics.c(sha.v(annotation).getQualifiedName(), "kotlin.Metadata")) {
                return new ysl(delegateAdapter, u5kVar);
            }
        }
        return null;
    }
}
