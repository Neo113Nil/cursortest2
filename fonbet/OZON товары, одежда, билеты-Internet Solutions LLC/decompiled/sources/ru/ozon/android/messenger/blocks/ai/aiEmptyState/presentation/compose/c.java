package ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a f83957b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f83958c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f83959d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f83960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar, e eVar, Function0 function0, Function1 function1, int i11) {
        super(2);
        this.f83957b = aVar;
        this.f83958c = eVar;
        this.f83959d = function0;
        this.f83960e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        d.a(this.f83957b, this.f83958c, this.f83959d, this.f83960e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
