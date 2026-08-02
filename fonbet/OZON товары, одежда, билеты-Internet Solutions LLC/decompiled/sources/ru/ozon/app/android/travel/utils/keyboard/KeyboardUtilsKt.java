package ru.ozon.app.android.travel.utils.keyboard;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/app/Activity;", "LAe/h;", "", "keyboardVisibilityFlow", "(Landroid/app/Activity;)LAe/h;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardUtilsKt {
    @NotNull
    public static final InterfaceC2395h<Boolean> keyboardVisibilityFlow(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return C2399j.e(new KeyboardUtilsKt$keyboardVisibilityFlow$1(activity, null));
    }
}
