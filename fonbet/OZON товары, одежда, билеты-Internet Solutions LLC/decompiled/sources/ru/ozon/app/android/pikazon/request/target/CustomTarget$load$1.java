package ru.ozon.app.android.pikazon.request.target;

import c6.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pikazon.request.PikazonRequest;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc6/n;", "invoke", "()Lc6/n;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CustomTarget$load$1 extends AbstractC7737t implements Function0<n> {
    final /* synthetic */ PikazonRequest<Resource> $this_load;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomTarget$load$1(PikazonRequest<Resource> pikazonRequest) {
        super(0);
        this.$this_load = pikazonRequest;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final n invoke() {
        return this.$this_load.getBuilder$lib_release().getDownsampleStrategy();
    }
}
