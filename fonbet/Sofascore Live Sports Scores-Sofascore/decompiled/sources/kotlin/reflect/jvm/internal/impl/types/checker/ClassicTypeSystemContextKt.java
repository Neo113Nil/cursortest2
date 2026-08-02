package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ClassicTypeSystemContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UnwrappedType makeDefinitelyNotNullOrNotNullInternal(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, null);
    }
}
