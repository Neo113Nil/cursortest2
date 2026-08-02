package kotlin.reflect.jvm.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallableImpl$_typeParameters$1 extends xka implements Function0<List<? extends KTypeParameterImpl>> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_typeParameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KTypeParameterImpl> invoke() {
        List<TypeParameterDescriptor> typeParameters = this.this$0.getDescriptor().getTypeParameters();
        typeParameters.getClass();
        KTypeParameterOwnerImpl kTypeParameterOwnerImpl = this.this$0;
        ArrayList arrayList = new ArrayList(k13.r(typeParameters, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : typeParameters) {
            typeParameterDescriptor.getClass();
            arrayList.add(new KTypeParameterImpl(kTypeParameterOwnerImpl, typeParameterDescriptor));
        }
        return arrayList;
    }
}
