package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import android.view.View;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function1<Tg.b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f87086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f87087c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ M f87088d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87089e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87090f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f87091g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87092h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ View f87093i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ J f87094j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ButtonV3DTO buttonV3DTO, p pVar, M m11, ru.ozon.android.messenger.framework.domain.repository.a aVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.navigation.controller.a aVar3, View view, J j11) {
        super(1);
        this.f87086b = buttonV3DTO;
        this.f87087c = pVar;
        this.f87088d = m11;
        this.f87089e = aVar;
        this.f87090f = aVar2;
        this.f87091g = interfaceC7851b;
        this.f87092h = aVar3;
        this.f87093i = view;
        this.f87094j = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Tg.b bVar) {
        AtomActionDTO action;
        Tg.b atomAction = bVar;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        CommonControlSettings common = this.f87086b.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return Boolean.TRUE;
        }
        if (action.getBehavior() != AtomActionDTO.Behavior.CUSTOM) {
            return Boolean.FALSE;
        }
        p pVar = this.f87087c;
        n value = pVar.getState().getValue();
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        C10727i.c(this.f87088d, null, null, new e(this.f87089e, AtomActionDTO.copy$default(action, null, null, null, U.n(U.n(params, new Pair("reason", value.e())), new Pair("description", value.c())), null, 23, null), pVar, this.f87090f, this.f87091g, this.f87092h, this.f87093i, this.f87086b, this.f87094j, null), 3);
        return Boolean.TRUE;
    }
}
