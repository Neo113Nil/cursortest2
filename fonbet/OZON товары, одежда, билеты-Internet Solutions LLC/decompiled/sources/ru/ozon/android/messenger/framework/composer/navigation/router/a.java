package ru.ozon.android.messenger.framework.composer.navigation.router;

import Sc.InterfaceC4008j;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
public final class a implements Tg.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f86729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> f86730b;

    public a(@NotNull c screenRouter, @NotNull Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> deeplinkHandlers) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        Intrinsics.checkNotNullParameter(deeplinkHandlers, "deeplinkHandlers");
        this.f86729a = screenRouter;
        this.f86730b = deeplinkHandlers;
    }

    public final void a(String str, @NotNull Map<String, String> bodyParams) {
        Object obj;
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        if (str == null) {
            return;
        }
        Iterator<T> it = this.f86730b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a) obj).b(str)) {
                    break;
                }
            }
        }
        ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a aVar = (ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a) obj;
        if (aVar != null) {
            this.f86729a.b(aVar.a(str, bodyParams));
        }
    }

    @Override // Tg.a
    public final void dismiss() {
        this.f86729a.b(new ru.ozon.android.messenger.framework.composer.navigation.a());
    }

    @Override // Tg.a
    public final QZ.a<? extends C7854a> getComposer() {
        ComponentCallbacksC5392m currentFragment = this.f86729a.getCurrentFragment();
        if (currentFragment instanceof ru.ozon.android.messenger.framework.composer.screen.bottomsheet.a) {
            currentFragment = ((ru.ozon.android.messenger.framework.composer.screen.bottomsheet.a) currentFragment).getChildFragmentManager().f0(R$id.m_fragmentContainer);
        }
        ru.ozon.android.messenger.framework.composer.viewmodel.b bVar = currentFragment != null ? (ru.ozon.android.messenger.framework.composer.viewmodel.b) new z0(currentFragment, new ru.ozon.android.messenger.framework.composer.viewmodel.a()).a(ru.ozon.android.messenger.framework.composer.viewmodel.b.class) : null;
        if (bVar != null) {
            return bVar.d0();
        }
        return null;
    }

    @Override // Tg.a
    @NotNull
    /* renamed from: getScrollPositionConverter */
    public final Wg.d get$converter() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = Wg.d.f33848d;
        return (Wg.d) interfaceC4008j.getValue();
    }

    @Override // Tg.a
    public final void navigateTo(String str) {
        Object obj;
        if (str == null) {
            return;
        }
        Iterator<T> it = this.f86730b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a) obj).b(str)) {
                    break;
                }
            }
        }
        ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a aVar = (ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a) obj;
        if (aVar != null) {
            this.f86729a.b(aVar.a(str, U.c()));
        }
    }
}
