package ru.ozon.app.android.account.orders.cancel;

import Hm.a;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/DebouncedTextWatcher;", "Landroid/text/TextWatcher;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "handler", "Landroid/os/Handler;", "afterTextChanged", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebouncedTextWatcher implements TextWatcher {

    @NotNull
    private final Handler handler = new Handler();
    private final Function1<String, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedTextWatcher(Function1<? super String, Unit> function1) {
        this.listener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void afterTextChanged$lambda$0(DebouncedTextWatcher debouncedTextWatcher, Editable editable) {
        Function1<String, Unit> function1 = debouncedTextWatcher.listener;
        if (function1 != null) {
            function1.invoke(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.handler.postDelayed(new a(3, this, s11), 500L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s11, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(s11, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s11, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.handler.removeCallbacksAndMessages(null);
    }
}
