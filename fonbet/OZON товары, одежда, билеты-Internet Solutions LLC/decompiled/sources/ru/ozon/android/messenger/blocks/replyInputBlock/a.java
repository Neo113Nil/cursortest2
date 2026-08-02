package ru.ozon.android.messenger.blocks.replyInputBlock;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function1<Tg.b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f86338b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(e eVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f86338b = eVar;
        this.f86339c = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Tg.b bVar) {
        CommonControlSettings common;
        AtomActionDTO action;
        Tg.b it = bVar;
        Intrinsics.checkNotNullParameter(it, "it");
        IconButtonV3DTO closeIconButton = this.f86338b.a().getCloseIconButton();
        if (closeIconButton != null && (common = closeIconButton.getCommon()) != null && (action = common.getAction()) != null) {
            this.f86339c.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(action));
        }
        return Unit.f71690a;
    }
}
