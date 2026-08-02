package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f87012b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
        super(1);
        this.f87012b = eVar;
        this.f87013c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomActionDTO action;
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar;
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        CommonControlSettings common = this.f87012b.d().getCommon();
        if (common != null && (action = common.getAction()) != null && (aVar = this.f87013c) != null) {
            String link = action.getLink();
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            aVar.a(link, params);
        }
        return Unit.f71690a;
    }
}
