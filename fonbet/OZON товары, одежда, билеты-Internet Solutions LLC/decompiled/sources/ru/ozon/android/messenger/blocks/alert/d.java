package ru.ozon.android.messenger.blocks.alert;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84382b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f84383c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f84384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.core.d dVar, g gVar, e eVar) {
        super(1);
        this.f84382b = dVar;
        this.f84383c = gVar;
        this.f84384d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomAction action2 = atomAction;
        Intrinsics.checkNotNullParameter(action2, "action");
        boolean z11 = action2 instanceof AtomAction.SendAnalytics;
        ru.ozon.android.messenger.framework.core.d dVar = this.f84382b;
        if (z11 && (trackingInfo = ((AtomAction.SendAnalytics) action2).getTrackingInfo()) != null) {
            dVar.c().m(h.a(trackingInfo));
        }
        g gVar = this.f84383c;
        DisclaimerDTO.MainButton mainButton = gVar.a().getMainButton();
        AtomActionDTO atomActionDTO = null;
        if (mainButton != null && (common = mainButton.getCommon()) != null && (action = common.getAction()) != null && (action2 instanceof AtomAction.ComposerAction)) {
            atomActionDTO = action;
        }
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
        Map params = e.n(this.f84384d, gVar);
        Intrinsics.checkNotNullParameter(action2, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        c11.q(new ru.ozon.android.messenger.framework.navigation.action.a(atomActionDTO, action2, params));
        return Unit.f71690a;
    }
}
