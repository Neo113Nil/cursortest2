package ru.ozon.app.android.cart.scroll;

import A00.a;
import M10.d;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"refreshWithScroll", "", "Lru/ozon/app/android/composer/ComposerReferences;", ImagesContract.URL, "", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollUtilsKt {
    public static final void refreshWithScroll(@NotNull ComposerReferences composerReferences, @NotNull String url) {
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(composerReferences, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        a.C.d a11 = (c11 == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) ? null : d.a(composerRecyclerViewOrNull);
        if (a11 != null) {
            InterfaceC7851b.a.a(composerReferences.getController(), url, null, null, new h.b(a11, null, 2), 6);
        } else {
            InterfaceC7851b.a.a(composerReferences.getController(), url, null, null, null, 14);
        }
    }
}
