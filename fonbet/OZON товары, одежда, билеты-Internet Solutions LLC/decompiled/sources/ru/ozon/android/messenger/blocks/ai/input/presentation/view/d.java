package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84224b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f84225c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f84226d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84227e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f84228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(androidx.compose.ui.e eVar, boolean z11, IconButtonV3DTO iconButtonV3DTO, Function2 function2, int i11) {
        super(2);
        this.f84224b = eVar;
        this.f84225c = z11;
        this.f84226d = iconButtonV3DTO;
        this.f84227e = function2;
        this.f84228f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        e.a(this.f84224b, this.f84225c, this.f84226d, this.f84227e, interfaceC3967k, C2652m.e(this.f84228f | 1));
        return Unit.f71690a;
    }
}
