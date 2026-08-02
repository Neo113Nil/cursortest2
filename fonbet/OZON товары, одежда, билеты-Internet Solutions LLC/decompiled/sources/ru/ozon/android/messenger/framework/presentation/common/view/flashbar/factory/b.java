package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.factory;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b f91167a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static a f91168b = new a();

    public static final class a implements DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b bVar = b.f91167a;
            if (bVar != null) {
                bVar.a(ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.a.EXIT);
            }
            b.f91167a = null;
        }
    }

    public static ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b c(ViewGroup rootView, OzonSpannableString message, Integer num, String str, J dismissOnExitOwner, int i11) {
        if ((i11 & 32) != 0) {
            str = null;
        }
        Long l11 = (i11 & 64) != 0 ? null : 3000L;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dismissOnExitOwner, "dismissOnExitOwner");
        AbstractC5434v lifecycle = dismissOnExitOwner.getLifecycle();
        a aVar = f91168b;
        lifecycle.e(aVar);
        dismissOnExitOwner.getLifecycle().a(aVar);
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b bVar = f91167a;
        boolean z11 = false;
        boolean z12 = bVar != null;
        if ((bVar != null && bVar.c()) || (bVar != null && bVar.b())) {
            z11 = true;
        }
        if (!z12 || !z11) {
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.a aVar2 = new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.a(rootView);
            aVar2.b();
            aVar2.k(message);
            if (l11 != null && l11.longValue() != -1) {
                aVar2.a(l11.longValue());
            }
            if (num != null) {
                aVar2.i(num.intValue());
            }
            aVar2.j(str);
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b bVar2 = new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b(aVar2);
            f91167a = bVar2;
            bVar = bVar2;
        } else if (bVar != null) {
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main.b.d(bVar, message, num, str, l11);
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
