package kotlin.reflect.jvm.internal.impl.load.java;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NullabilityAnnotationStatesImpl$cache$1<T> extends xka implements Function1<FqName, T> {
    final /* synthetic */ NullabilityAnnotationStatesImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullabilityAnnotationStatesImpl$cache$1(NullabilityAnnotationStatesImpl<T> nullabilityAnnotationStatesImpl) {
        super(1);
        this.this$0 = nullabilityAnnotationStatesImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final T invoke(FqName fqName) {
        fqName.getClass();
        return (T) FqNamesUtilKt.findValueForMostSpecificFqname(fqName, this.this$0.getStates());
    }
}
