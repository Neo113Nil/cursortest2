package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a0f extends e7 {
    public final KClass a;
    public final List b;
    public final joa c;

    public a0f(KClass kClass) {
        kClass.getClass();
        this.a = kClass;
        this.b = km5.a;
        this.c = ypa.a(ysa.b, new ate(this, 5));
    }

    @Override // defpackage.e7
    public final KClass c() {
        return this.a;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0f(KClass kClass, Annotation[] annotationArr) {
        this(kClass);
        kClass.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.b = asList;
    }
}
