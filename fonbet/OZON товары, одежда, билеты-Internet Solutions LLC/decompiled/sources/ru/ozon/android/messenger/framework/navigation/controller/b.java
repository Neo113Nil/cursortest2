package ru.ozon.android.messenger.framework.navigation.controller;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ze.EnumC11113a;

/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f89176a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B0<d> f89177b;

    public b() {
        C0 b11 = E0.b(0, 8, EnumC11113a.DROP_OLDEST, 1);
        this.f89176a = b11;
        this.f89177b = C2399j.a(b11);
    }

    private final void x(d dVar) {
        this.f89176a.tryEmit(dVar);
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void a(@NotNull d.c alertEvent) {
        Intrinsics.checkNotNullParameter(alertEvent, "alertEvent");
        x(alertEvent);
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    @NotNull
    public final B0<d> b() {
        return this.f89177b;
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void c(@NotNull d.b alertEvent) {
        Intrinsics.checkNotNullParameter(alertEvent, "alertEvent");
        x(alertEvent);
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void closeConnection() {
        x(d.C1642d.f89182a);
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void d(@NotNull List<? extends Uri> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        x(new d.k(data));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void e(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtainModalVO) {
        Intrinsics.checkNotNullParameter(curtainModalVO, "curtainModalVO");
        x(new d.v(curtainModalVO));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void f(@NotNull Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        x(new d.m(data));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void g(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        x(new d.i(trackingInfo));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void h(String str) {
        if (str != null) {
            x(new d.s(str));
        }
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void i(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        x(new d.e(chatId));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void j(@NotNull z0 messageTypeUI) {
        Intrinsics.checkNotNullParameter(messageTypeUI, "messageTypeUI");
        x(new d.t(messageTypeUI));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void k(@NotNull ru.ozon.android.messenger.framework.analytics.d customEvent) {
        Intrinsics.checkNotNullParameter(customEvent, "customEvent");
        x(new d.j(customEvent));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void l(@NotNull ru.ozon.android.messenger.framework.navigation.action.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        x(new d.h(action));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void m(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        x(new d.g(trackingInfo));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void n(@NotNull ArrayList data) {
        Intrinsics.checkNotNullParameter(data, "data");
        x(new d.l(data));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void o(Map<String, ? extends Object> map) {
        x(new d.q(map, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void p(@NotNull Uri deeplink, String str, String str2) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        x(new d.o(deeplink, str, str2));
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        String B11 = N.b(d.o.class).B();
        x(new d.f(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(behavior, deeplink.toString(), B11, null, 8, null), null, 0 == true ? 1 : 0, 6)));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void q(@NotNull ru.ozon.android.messenger.framework.navigation.action.a actionWrapper) {
        Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
        x(new d.f(actionWrapper));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void r(Map<String, ? extends Object> map) {
        x(new d.q(map, 6));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void s(Map<String, MessengerTrackingInfo> map) {
        if (map != null) {
            x(new d.n(map));
        }
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void t(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        x(new d.r(id2));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void u(@NotNull String itemId, @NotNull ContextMenuDTO contextMenu) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(contextMenu, "contextMenu");
        x(new d.u(itemId, contextMenu));
    }

    @Override // ru.ozon.android.messenger.framework.navigation.controller.a
    public final void v(@NotNull d.w.a updateKey) {
        Intrinsics.checkNotNullParameter(updateKey, "updateKey");
        x(new d.w(updateKey));
    }

    public final void w(Map<String, String> map) {
        x(new d.a(map));
    }
}
