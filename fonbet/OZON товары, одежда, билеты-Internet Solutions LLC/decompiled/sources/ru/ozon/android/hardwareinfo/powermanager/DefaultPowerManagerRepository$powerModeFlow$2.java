package ru.ozon.android.hardwareinfo.powermanager;

import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAe/x0;", "", "invoke", "()LAe/x0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class DefaultPowerManagerRepository$powerModeFlow$2 extends AbstractC7737t implements Function0<x0<Boolean>> {
    final /* synthetic */ DefaultPowerManagerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPowerManagerRepository$powerModeFlow$2(DefaultPowerManagerRepository defaultPowerManagerRepository) {
        super(0);
        this.this$0 = defaultPowerManagerRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final x0<Boolean> invoke() {
        return O0.a(Boolean.valueOf(this.this$0.readPowerSaveMode()));
    }
}
