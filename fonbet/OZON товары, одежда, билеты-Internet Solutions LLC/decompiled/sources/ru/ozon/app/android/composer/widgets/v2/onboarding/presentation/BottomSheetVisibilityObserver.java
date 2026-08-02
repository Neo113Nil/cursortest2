package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Wc.a;
import android.app.Dialog;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import com.google.android.material.bottomsheet.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BottomSheetVisibilityObserver;", "", "Lkotlin/Function0;", "Landroidx/fragment/app/G;", "fragmentManagerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "LAe/h;", "", "bottomSheetVisibilityFlow", "()LAe/h;", "isBottomSheetVisible", "()Z", "Landroidx/fragment/app/m;", "isBottomSheet", "(Landroidx/fragment/app/m;)Z", "", "awaitBottomSheetHidden", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "fragment", "isCurrentFragmentBottomSheet", "Lkotlin/jvm/functions/Function0;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetVisibilityObserver {

    @NotNull
    private final Function0<G> fragmentManagerProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetVisibilityObserver(@NotNull Function0<? extends G> fragmentManagerProvider) {
        Intrinsics.checkNotNullParameter(fragmentManagerProvider, "fragmentManagerProvider");
        this.fragmentManagerProvider = fragmentManagerProvider;
    }

    private final InterfaceC2395h<Boolean> bottomSheetVisibilityFlow() {
        return C2399j.o(C2399j.e(new BottomSheetVisibilityObserver$bottomSheetVisibilityFlow$1(this, null)));
    }

    private final boolean isBottomSheet(ComponentCallbacksC5392m componentCallbacksC5392m) {
        Dialog dialog;
        return ((componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() != null) || ((componentCallbacksC5392m instanceof b) && (dialog = ((b) componentCallbacksC5392m).getDialog()) != null && dialog.isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBottomSheetVisible() {
        G invoke = this.fragmentManagerProvider.invoke();
        if (invoke == null) {
            return false;
        }
        List<ComponentCallbacksC5392m> r02 = invoke.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        List<ComponentCallbacksC5392m> list = r02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (isBottomSheet((ComponentCallbacksC5392m) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final Object awaitBottomSheetHidden(@NotNull d<? super Unit> dVar) {
        Object v11 = C2399j.v(bottomSheetVisibilityFlow(), new BottomSheetVisibilityObserver$awaitBottomSheetHidden$2(null), dVar);
        return v11 == a.COROUTINE_SUSPENDED ? v11 : Unit.f71690a;
    }

    public final boolean isCurrentFragmentBottomSheet(ComponentCallbacksC5392m fragment) {
        if (isBottomSheetVisible()) {
            return isBottomSheet(fragment);
        }
        return false;
    }
}
