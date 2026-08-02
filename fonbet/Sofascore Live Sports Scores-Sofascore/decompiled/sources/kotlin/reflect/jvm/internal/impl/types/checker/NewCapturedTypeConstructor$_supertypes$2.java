package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NewCapturedTypeConstructor$_supertypes$2 extends xka implements Function0<List<? extends UnwrappedType>> {
    final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final List<UnwrappedType> invoke() {
        Function0 function0;
        function0 = this.this$0.supertypesComputation;
        if (function0 != null) {
            return (List) function0.invoke();
        }
        return null;
    }
}
