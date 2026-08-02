package ru.ozon.android.messenger.blocks.input.viewdelegates;

import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.pickerlauncher.e;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f85596a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<ComponentCallbacksC5392m> f85597b;

    public n(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull ru.ozon.android.messenger.framework.navigation.d router) {
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f85596a = messengerController;
    }

    public final void a(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f85597b = new WeakReference<>(fragment);
    }

    public final void b(@NotNull Function0<Unit> afterPresent) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        Intrinsics.checkNotNullParameter(afterPresent, "afterPresent");
        WeakReference<ComponentCallbacksC5392m> weakReference = this.f85597b;
        if (weakReference == null || (componentCallbacksC5392m = weakReference.get()) == null) {
            return;
        }
        String string = androidx.core.content.a.getString(componentCallbacksC5392m.requireContext(), R$string.messenger_message_sending_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ru.ozon.android.messenger.framework.navigation.d.f(componentCallbacksC5392m, new NotificationDTO(string, androidx.core.content.a.getString(componentCallbacksC5392m.requireContext(), R$string.messenger_reload_or_delete_attachments), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null));
        ((d) afterPresent).invoke();
    }

    public final void c() {
        this.f85596a.t("input_issues_alert_block_id");
    }

    public final void d(@NotNull Map lexemes, @NotNull Set issues) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        String str;
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(lexemes, "lexemes");
        WeakReference<ComponentCallbacksC5392m> weakReference = this.f85597b;
        if (weakReference == null || (componentCallbacksC5392m = weakReference.get()) == null || issues.isEmpty()) {
            return;
        }
        Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> set = issues;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        for (ru.ozon.android.messenger.blocks.input.pickerlauncher.e eVar : set) {
            String str2 = "";
            if (eVar instanceof e.b) {
                str = (String) lexemes.get("maxFilesCountExceededMsg");
                if (str == null) {
                    arrayList.add(str2);
                }
                str2 = str;
                arrayList.add(str2);
            } else if (eVar instanceof e.a) {
                str = (String) lexemes.get("maxFileSizeMsg");
                if (str == null) {
                    arrayList.add(str2);
                }
                str2 = str;
                arrayList.add(str2);
            } else {
                if (eVar instanceof e.d) {
                    str = (String) lexemes.get("minFileSizeMsg");
                    if (str == null) {
                    }
                    str2 = str;
                }
                arrayList.add(str2);
            }
        }
        Context requireContext = componentCallbacksC5392m.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f85596a.a(new d.c(G.g.c(ru.ozon.android.messenger.utils.c.d(R$string.messenger_attachment_errors, requireContext), " ", C7714v.V(arrayList, ", ", null, null, null, 62))));
    }

    public final void e() {
        this.f85597b = null;
    }
}
