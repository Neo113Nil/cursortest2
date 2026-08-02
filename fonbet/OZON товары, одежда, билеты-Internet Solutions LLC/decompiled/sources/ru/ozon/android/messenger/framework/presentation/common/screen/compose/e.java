package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f91070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CellDTO f91071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, CellDTO cellDTO) {
        super(0);
        this.f91070b = dVar;
        this.f91071c = cellDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ru.ozon.android.messenger.framework.navigation.controller.a w11 = this.f91070b.w();
        CommonControlSettings common = this.f91071c.getCommon();
        w11.q(ru.ozon.android.messenger.framework.navigation.action.b.c(common != null ? common.getAction() : null));
        return Unit.f71690a;
    }
}
