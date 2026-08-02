package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NewCapturedTypeConstructor$refine$1$1 extends xka implements Function0<List<? extends UnwrappedType>> {
    final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
    final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
        this.$kotlinTypeRefiner = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<UnwrappedType> invoke() {
        List<UnwrappedType> mo894getSupertypes = this.this$0.mo894getSupertypes();
        KotlinTypeRefiner kotlinTypeRefiner = this.$kotlinTypeRefiner;
        ArrayList arrayList = new ArrayList(k13.r(mo894getSupertypes, 10));
        Iterator<T> it = mo894getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).refine(kotlinTypeRefiner));
        }
        return arrayList;
    }
}
