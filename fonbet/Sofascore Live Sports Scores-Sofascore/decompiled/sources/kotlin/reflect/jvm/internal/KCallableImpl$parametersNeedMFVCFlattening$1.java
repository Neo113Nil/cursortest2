package kotlin.reflect.jvm.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.xka;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallableImpl$parametersNeedMFVCFlattening$1 extends xka implements Function0<Boolean> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$parametersNeedMFVCFlattening$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        List<KParameter> parameters = this.this$0.getParameters();
        boolean z = false;
        if (parameters == null || !parameters.isEmpty()) {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (UtilKt.getNeedsMultiFieldValueClassFlattening(((KParameter) it.next()).getType())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
