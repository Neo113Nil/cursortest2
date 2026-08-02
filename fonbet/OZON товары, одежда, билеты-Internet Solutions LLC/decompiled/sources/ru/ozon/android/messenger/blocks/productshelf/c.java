package ru.ozon.android.messenger.blocks.productshelf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f86056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f86057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, IconButtonV3DTO iconButtonV3DTO) {
        super(1);
        this.f86056b = bVar;
        this.f86057c = iconButtonV3DTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        ru.ozon.android.messenger.framework.core.d dVar;
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        dVar = this.f86056b.f86053a;
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
        CommonControlSettings common = this.f86057c.getCommon();
        c11.s(ru.ozon.android.messenger.framework.analytics.h.a(common != null ? common.getTrackingInfo() : null));
        return Unit.f71690a;
    }
}
