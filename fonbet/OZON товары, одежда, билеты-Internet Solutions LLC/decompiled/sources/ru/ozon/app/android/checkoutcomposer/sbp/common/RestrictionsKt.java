package ru.ozon.app.android.checkoutcomposer.sbp.common;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/flashbar/model/Restriction;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lkotlin/Function0;", "", "onShow", "show", "(Lru/ozon/uni/android/flashbar/model/Restriction;La00/f;Lkotlin/jvm/functions/Function0;)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RestrictionsKt {
    public static final void show(@NotNull Restriction restriction, @NotNull C4911f container, @NotNull Function0<Unit> onShow) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(restriction, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(restriction), container.g(), null, null, onShow, null, null, 216, null);
    }
}
