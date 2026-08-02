package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.B0;
import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.M0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatlist.f;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9506s extends f.b {
    @NotNull
    Function0<Unit> E();

    @NotNull
    M0<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a> M();

    @NotNull
    C9508u P();

    @NotNull
    Function0<Unit> U();

    @NotNull
    ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c();

    @NotNull
    B0<NotificationDTO> d();

    @NotNull
    ru.ozon.android.messenger.framework.navigation.controller.a getController();

    @NotNull
    M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> getUiState();

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatlist.popup.f> j();

    @NotNull
    M0<ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b> s();

    @NotNull
    C0 v();
}
