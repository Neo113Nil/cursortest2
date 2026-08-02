package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84222b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f84223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    c(Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2, IconButtonV3DTO iconButtonV3DTO) {
        super(1);
        this.f84222b = function2;
        this.f84223c = iconButtonV3DTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        IconButtonV3DTO iconButtonV3DTO = this.f84223c;
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        Map<String, MessengerTrackingInfo> a11 = ru.ozon.android.messenger.framework.analytics.h.a(common != null ? common.getTrackingInfo() : null);
        CommonControlSettings common2 = iconButtonV3DTO.getCommon();
        this.f84222b.invoke(a11, ru.ozon.android.messenger.framework.navigation.action.b.c(common2 != null ? common2.getAction() : null));
        return Unit.f71690a;
    }
}
