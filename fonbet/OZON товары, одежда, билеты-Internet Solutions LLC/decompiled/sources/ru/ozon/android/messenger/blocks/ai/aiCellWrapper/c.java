package ru.ozon.android.messenger.blocks.ai.aiCellWrapper;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f83927b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f83928c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83929d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CellDTO f83930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(boolean z11, Map<String, MessengerTrackingInfo> map, ru.ozon.android.messenger.framework.core.d dVar, CellDTO cellDTO) {
        super(1);
        this.f83927b = z11;
        this.f83928c = map;
        this.f83929d = dVar;
        this.f83930e = cellDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f83927b) {
            ?? r02 = this.f83928c;
            ru.ozon.android.messenger.framework.core.d dVar = this.f83929d;
            if (r02 != 0) {
                dVar.c().m(r02);
            }
            ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
            CommonControlSettings common = this.f83930e.getCommon();
            c11.q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, common != null ? common.getAction() : null, 2));
        }
        return Unit.f71690a;
    }
}
