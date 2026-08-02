package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"setAutomatizationIdIfNotNull", "", "Landroid/view/View;", "automatizationId", "", "fallbackId", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtKt {
    public static final Unit setAutomatizationIdIfNotNull(@NotNull View view, String str, String str2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (str != null) {
            view.setContentDescription(str);
        } else {
            if (str2 == null) {
                return null;
            }
            view.setContentDescription(str2);
        }
        return Unit.f71690a;
    }

    public static /* synthetic */ Unit setAutomatizationIdIfNotNull$default(View view, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return setAutomatizationIdIfNotNull(view, str, str2);
    }
}
