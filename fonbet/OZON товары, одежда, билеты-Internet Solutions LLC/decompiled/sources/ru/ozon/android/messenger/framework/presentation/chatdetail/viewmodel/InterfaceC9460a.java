package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2395h;
import Ae.M0;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9460a {

    /* renamed from: l0, reason: collision with root package name */
    @NotNull
    public static final C1664a f90044l0 = C1664a.f90045a;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.a$a, reason: collision with other inner class name */
    public static final class C1664a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1664a f90045a = new C1664a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final LinkedHashMap f90046b = new LinkedHashMap();

        @NotNull
        public static LinkedHashMap a() {
            return f90046b;
        }
    }

    Parcelable B(String str);

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.w> C();

    @NotNull
    Ae.x0 J();

    void R(@NotNull Uri uri);

    void T(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> list);

    void W(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar);

    @NotNull
    InterfaceC2395h<Unit> b0();

    @NotNull
    ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c();

    @NotNull
    Ae.B0<NotificationDTO> d();

    @NotNull
    M0<String> e();

    void f();

    @NotNull
    InterfaceC2395h<Integer> g();

    @NotNull
    ru.ozon.android.messenger.framework.navigation.controller.a getController();

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> getEvents();

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> getLoader();

    @NotNull
    M0<C0> h();

    @NotNull
    C9472j i();

    void l(Parcelable parcelable, String str);

    @NotNull
    M0<ru.ozon.android.messenger.framework.domain.g> o();

    @NotNull
    p0 p();

    void q(@NotNull List<? extends Uri> list);

    void r(@NotNull ArrayList arrayList);

    @NotNull
    Ae.B0<ru.ozon.android.messenger.blocks.messagetext.m> t();
}
