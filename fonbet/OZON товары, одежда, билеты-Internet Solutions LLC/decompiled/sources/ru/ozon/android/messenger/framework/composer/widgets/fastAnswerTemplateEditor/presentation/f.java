package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Q1.K;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
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
    final /* synthetic */ ButtonV3DTO f86888b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f86889c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ M f86890d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86891e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f86892f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<x, Unit> f86893g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86894h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f86895i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Context f86896j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ J f86897k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    f(ButtonV3DTO buttonV3DTO, u uVar, M m11, ru.ozon.android.messenger.framework.domain.repository.a aVar, View view, Function1<? super x, Unit> function1, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2, InterfaceC7851b interfaceC7851b, Context context, J j11) {
        super(1);
        this.f86888b = buttonV3DTO;
        this.f86889c = uVar;
        this.f86890d = m11;
        this.f86891e = aVar;
        this.f86892f = view;
        this.f86893g = function1;
        this.f86894h = aVar2;
        this.f86895i = interfaceC7851b;
        this.f86896j = context;
        this.f86897k = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Tg.b bVar) {
        Map map;
        K f7;
        CommonControlSettings common;
        Tg.b atomAction = bVar;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        ButtonV3DTO buttonV3DTO = this.f86888b;
        AtomActionDTO action = (buttonV3DTO == null || (common = buttonV3DTO.getCommon()) == null) ? null : common.getAction();
        if ((action != null ? action.getBehavior() : null) == AtomActionDTO.Behavior.CUSTOM) {
            Map<String, String> params = action.getParams();
            if (params != null) {
                y b11 = this.f86889c.getState().getValue().b();
                String f11 = (b11 == null || (f7 = b11.f()) == null) ? null : f7.f();
                if (f11 == null) {
                    f11 = "";
                }
                map = U.n(params, new Pair("text", f11));
            } else {
                map = null;
            }
            C10727i.c(this.f86890d, null, null, new e(action, this.f86891e, AtomActionDTO.copy$default(action, null, null, null, map, null, 23, null), this.f86892f, this.f86893g, this.f86894h, this.f86895i, this.f86896j, this.f86897k, null), 3);
        }
        return Boolean.TRUE;
    }
}
