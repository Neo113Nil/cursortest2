package ru.ozon.android.messenger.framework.navigation;

import Bi.k;
import Ci.C2779a;
import Ci.g;
import Di.C2872a;
import Hi.h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.router.a f89207a;

    public d(@NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a composerScreenRouter) {
        Intrinsics.checkNotNullParameter(composerScreenRouter, "composerScreenRouter");
        this.f89207a = composerScreenRouter;
    }

    public static void b(@NotNull ComponentCallbacksC5392m currentFragment, int i11) {
        k galleryLauncher;
        Intrinsics.checkNotNullParameter(currentFragment, "currentFragment");
        Context context = currentFragment.getContext();
        if (context != null) {
            ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar = currentFragment instanceof ru.ozon.android.messenger.framework.presentation.chatdetail.d ? (ru.ozon.android.messenger.framework.presentation.chatdetail.d) currentFragment : null;
            if (dVar == null || (galleryLauncher = dVar.getGalleryLauncher()) == null) {
                return;
            }
            Ci.k d11 = C2779a.d();
            ((Ti.a) galleryLauncher).a(Ci.k.a(d11, h.b(context) ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, h.d.f11018a, Ci.b.a(d11.d(), new g(a.f89158b, b.f89174b, null, 10), U.i(new Pair(1, new C2872a(2.0d))), i11, 1844), null, c.f89175b, 48));
            Unit unit = Unit.f71690a;
        }
    }

    public static void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (n.e(context).a()) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }

    public static void e(@NotNull ComponentCallbacksC5392m fragment, @NotNull ru.ozon.android.messenger.blocks.curtain.c curtainVO) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(curtainVO, "modalVO");
        Intrinsics.checkNotNullParameter(curtainVO, "curtainVO");
        ru.ozon.android.messenger.blocks.curtain.a aVar = new ru.ozon.android.messenger.blocks.curtain.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PRODUCT_SHELF_MODAL_ARG_KEY", curtainVO);
        aVar.setArguments(bundle);
        aVar.show(fragment.getChildFragmentManager(), ru.ozon.android.messenger.blocks.curtain.a.class.getSimpleName());
    }

    public static void f(@NotNull ComponentCallbacksC5392m fragment, @NotNull NotificationDTO model) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(model, "model");
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        View view = fragment.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, model, fragment, null, 8, null).show();
    }

    public final void a(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f89207a.a("ozon://messenger/sx/fastAnswerTemplateList", U.i(new Pair("chat_id", chatId)));
    }

    public final void d(@NotNull String link, @NotNull Map<String, String> bodyParams) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        this.f89207a.a(link, bodyParams);
    }
}
