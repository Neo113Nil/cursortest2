package ru.ozon.app.android.fresh.common.widgets;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0000*\u00020\u0006*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "LSc/j;", "unsafeLazy", "(Lkotlin/jvm/functions/Function0;)LSc/j;", "Landroid/graphics/drawable/Drawable;", "Landroid/view/View;", "Lkotlin/Function1;", "", "change", "updateDrawableBackground", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    @NotNull
    public static final <T> InterfaceC4008j<T> unsafeLazy(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return k.a(n.NONE, initializer);
    }

    public static final <T extends Drawable> void updateDrawableBackground(@NotNull View view, @NotNull Function1<? super T, Unit> change) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(change, "change");
        Drawable background = view.getBackground();
        if (background == null) {
            background = null;
        }
        if (background != null) {
            change.invoke(background);
            view.setBackground(background);
        }
    }
}
