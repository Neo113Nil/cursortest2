package defpackage;

import java.util.List;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kdd extends UnsupportedOperationException {
    public final String a;

    public kdd(aq4 aq4Var, KClass kClass, KClass kClass2) {
        kClass.getClass();
        kClass2.getClass();
        StringBuilder sb = new StringBuilder("\n        Expected response body of the type '");
        sb.append(kClass2);
        sb.append("' but was '");
        sb.append(kClass);
        sb.append("'\n        In response from `");
        sb.append(aq4Var.b().c().getUrl());
        sb.append("`\n        Response status `");
        sb.append(aq4Var.d());
        sb.append("`\n        Response header `ContentType: ");
        o89 a = aq4Var.a();
        List list = zi9.a;
        sb.append(a.get("Content-Type"));
        sb.append("` \n        Request header `Accept: ");
        sb.append(aq4Var.b().c().a().get("Accept"));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.a = dii.c(sb.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
