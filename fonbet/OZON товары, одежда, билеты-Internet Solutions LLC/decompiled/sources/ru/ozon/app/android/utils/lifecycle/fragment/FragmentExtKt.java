package ru.ozon.app.android.utils.lifecycle.fragment;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/m;", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "argsBuilder", "sendResultWithArgs", "(Landroidx/fragment/app/m;Lkotlin/jvm/functions/Function1;)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentExtKt {
    public static final void sendResultWithArgs(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Function1<? super Intent, Unit> argsBuilder) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(argsBuilder, "argsBuilder");
        ComponentCallbacksC5392m targetFragment = componentCallbacksC5392m.getTargetFragment();
        Intrinsics.f(targetFragment);
        int targetRequestCode = componentCallbacksC5392m.getTargetRequestCode();
        Intent intent = new Intent();
        argsBuilder.invoke(intent);
        targetFragment.onActivityResult(targetRequestCode, -1, intent);
    }
}
