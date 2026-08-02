package ru.ozon.android.messenger.framework.navigation.controller;

import Ae.B0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;

/* loaded from: classes10.dex */
public interface a {
    void a(@NotNull d.c cVar);

    @NotNull
    B0<d> b();

    void c(@NotNull d.b bVar);

    void closeConnection();

    void d(@NotNull List<? extends Uri> list);

    void e(@NotNull ru.ozon.android.messenger.blocks.curtain.c cVar);

    void f(@NotNull Uri uri);

    void g(@NotNull Map<String, MessengerTrackingInfo> map);

    void h(String str);

    void i(@NotNull String str);

    void j(@NotNull z0 z0Var);

    void k(@NotNull ru.ozon.android.messenger.framework.analytics.d dVar);

    void l(@NotNull ru.ozon.android.messenger.framework.navigation.action.c cVar);

    void m(@NotNull Map<String, MessengerTrackingInfo> map);

    void n(@NotNull ArrayList arrayList);

    void o(Map<String, ? extends Object> map);

    void p(@NotNull Uri uri, String str, String str2);

    void q(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar);

    void r(Map<String, ? extends Object> map);

    void s(Map<String, MessengerTrackingInfo> map);

    void t(@NotNull String str);

    void u(@NotNull String str, @NotNull ContextMenuDTO contextMenuDTO);

    void v(@NotNull d.w.a aVar);
}
