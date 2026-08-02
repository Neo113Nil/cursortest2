package kotlin.reflect.jvm.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.joa;
import defpackage.xka;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallableImpl$_absentArguments$1 extends xka implements Function0<Object[]> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_absentArguments$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object[] invoke() {
        joa joaVar;
        int size;
        Object defaultEmptyArray;
        int parameterTypeSize;
        int size2 = (this.this$0.isSuspend() ? 1 : 0) + this.this$0.getParameters().size();
        joaVar = ((KCallableImpl) this.this$0).parametersNeedMFVCFlattening;
        boolean booleanValue = ((Boolean) joaVar.getValue()).booleanValue();
        KCallableImpl<R> kCallableImpl = this.this$0;
        if (booleanValue) {
            List<KParameter> parameters = kCallableImpl.getParameters();
            KCallableImpl<R> kCallableImpl2 = this.this$0;
            Iterator<T> it = parameters.iterator();
            size = 0;
            while (it.hasNext()) {
                parameterTypeSize = kCallableImpl2.getParameterTypeSize((KParameter) it.next());
                size += parameterTypeSize;
            }
        } else {
            size = kCallableImpl.getParameters().size();
        }
        int i = (size + 31) / 32;
        Object[] objArr = new Object[size2 + i + 1];
        List<KParameter> parameters2 = this.this$0.getParameters();
        KCallableImpl<R> kCallableImpl3 = this.this$0;
        for (KParameter kParameter : parameters2) {
            if (kParameter.isOptional() && !UtilKt.isInlineClassType(kParameter.getType())) {
                objArr[kParameter.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter.getType()));
            } else if (kParameter.isVararg()) {
                int index = kParameter.getIndex();
                defaultEmptyArray = kCallableImpl3.defaultEmptyArray(kParameter.getType());
                objArr[index] = defaultEmptyArray;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[size2 + i2] = 0;
        }
        return objArr;
    }
}
