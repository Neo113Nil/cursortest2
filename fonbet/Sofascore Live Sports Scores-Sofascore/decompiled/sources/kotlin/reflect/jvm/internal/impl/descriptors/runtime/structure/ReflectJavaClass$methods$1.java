package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.xka;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaClass$methods$1 extends xka implements Function1<Method, Boolean> {
    final /* synthetic */ ReflectJavaClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(ReflectJavaClass reflectJavaClass) {
        super(1);
        this.this$0 = reflectJavaClass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3 == false) goto L9;
     */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Method method) {
        boolean isEnumValuesOrValueOf;
        boolean z = false;
        if (!method.isSynthetic()) {
            if (this.this$0.isEnum()) {
                isEnumValuesOrValueOf = this.this$0.isEnumValuesOrValueOf(method);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
