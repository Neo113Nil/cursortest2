package kotlin.reflect.jvm.internal;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KTypeParameterImpl$upperBounds$2 extends xka implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ KTypeParameterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.this$0 = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KTypeImpl> invoke() {
        List<KotlinType> upperBounds = this.this$0.getDescriptor().getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(k13.r(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeImpl((KotlinType) it.next(), null, 2, null));
        }
        return arrayList;
    }
}
