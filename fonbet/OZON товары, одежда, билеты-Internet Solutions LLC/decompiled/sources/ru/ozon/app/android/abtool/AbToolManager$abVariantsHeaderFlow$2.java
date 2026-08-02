package ru.ozon.app.android.abtool;

import Ae.InterfaceC2395h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/h;", "", "", "invoke", "()LAe/h;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AbToolManager$abVariantsHeaderFlow$2 extends AbstractC7737t implements Function0<InterfaceC2395h<? extends Set<? extends String>>> {
    final /* synthetic */ AbToolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolManager$abVariantsHeaderFlow$2(AbToolManager abToolManager) {
        super(0);
        this.this$0 = abToolManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2395h<? extends Set<? extends String>> invoke() {
        AbToolInteractor abToolInteractor;
        abToolInteractor = this.this$0.abToolHostInteractor;
        return abToolInteractor.getAbVariantDataStoreRepository().getVariants();
    }
}
