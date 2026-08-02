package ru.ozon.app.android.abtool;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAe/h;", "", "invoke", "()LAe/h;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AbToolImpl$abVariantsUpdatedFlow$2 extends AbstractC7737t implements Function0<InterfaceC2395h<? extends Unit>> {
    final /* synthetic */ AbToolImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolImpl$abVariantsUpdatedFlow$2(AbToolImpl abToolImpl) {
        super(0);
        this.this$0 = abToolImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2395h<? extends Unit> invoke() {
        AbToolManager abToolManager;
        abToolManager = this.this$0.getAbToolManager();
        return abToolManager.getAbVariantsUpdatedFlow();
    }
}
