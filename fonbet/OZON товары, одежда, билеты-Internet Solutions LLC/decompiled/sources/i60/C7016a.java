package i60;

import L3.m;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.g;
import androidx.fragment.app.r;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: i60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7016a implements U50.a {
    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "hide";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        r parentFragmentActivity;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (weakReference == null || (fintechWebView = weakReference.get()) == null || (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) == null || !(parentFragmentActivity instanceof g)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new m(parentFragmentActivity, 3));
    }
}
