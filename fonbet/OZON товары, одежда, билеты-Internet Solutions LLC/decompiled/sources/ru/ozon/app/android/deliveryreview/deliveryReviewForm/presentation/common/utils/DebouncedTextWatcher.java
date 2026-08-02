package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.utils;

import Dx.b;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/utils/DebouncedTextWatcher;", "Landroid/text/TextWatcher;", "delay", "", "callback", "Lkotlin/Function1;", "", "", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "handler", "Landroid/os/Handler;", "afterTextChanged", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebouncedTextWatcher implements TextWatcher {

    @NotNull
    private final Function1<String, Unit> callback;
    private final long delay;

    @NotNull
    private final Handler handler;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedTextWatcher(long j11, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.delay = j11;
        this.callback = callback;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void afterTextChanged$lambda$0(DebouncedTextWatcher debouncedTextWatcher, Editable editable) {
        debouncedTextWatcher.callback.invoke(editable.toString());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        this.handler.postDelayed(new b(3, this, s11), this.delay);
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
