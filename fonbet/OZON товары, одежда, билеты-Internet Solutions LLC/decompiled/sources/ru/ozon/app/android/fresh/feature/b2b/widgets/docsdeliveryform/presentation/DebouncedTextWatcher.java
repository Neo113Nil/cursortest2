package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import Nu.a;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J*\u0010\u0012\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DebouncedTextWatcher;", "Landroid/text/TextWatcher;", "delay", "", "callback", "Lkotlin/Function1;", "", "", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "handler", "Landroid/os/Handler;", "beforeTextChanged", "text", "start", "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebouncedTextWatcher implements TextWatcher {

    @NotNull
    private final Function1<CharSequence, Unit> callback;
    private final long delay;

    @NotNull
    private final Handler handler;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedTextWatcher(long j11, @NotNull Function1<? super CharSequence, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.delay = j11;
        this.callback = callback;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTextChanged$lambda$0(DebouncedTextWatcher debouncedTextWatcher, CharSequence charSequence) {
        debouncedTextWatcher.callback.invoke(charSequence);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable text) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence text, int start, int before, int count) {
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new a(0, this, text), this.delay);
    }

    public /* synthetic */ DebouncedTextWatcher(long j11, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 500L : j11, function1);
    }
}
