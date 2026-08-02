package cf;

import We.y;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class h extends AbstractC7737t implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f57125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar) {
        super(0);
        this.f57125b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        y yVar;
        yVar = this.f57125b.f57129d;
        Intrinsics.f(yVar);
        List<Certificate> c11 = yVar.c();
        ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
        for (Certificate certificate : c11) {
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
