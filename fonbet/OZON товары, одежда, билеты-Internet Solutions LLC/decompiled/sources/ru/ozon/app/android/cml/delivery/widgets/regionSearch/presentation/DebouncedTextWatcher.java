package ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation;

import Ao.b;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/DebouncedTextWatcher;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "Lkotlin/Function1;", "", "", "onNewText", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "text", "", "start", "before", "count", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "clear", "()V", "Lkotlin/jvm/functions/Function1;", "", "debounceMillis", "J", "getDebounceMillis", "()J", "setDebounceMillis", "(J)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebouncedTextWatcher extends OzonTextWatcher {
    private long debounceMillis;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Function1<CharSequence, Unit> onNewText;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedTextWatcher(@NotNull Function1<? super CharSequence, Unit> onNewText) {
        Intrinsics.checkNotNullParameter(onNewText, "onNewText");
        this.onNewText = onNewText;
        this.debounceMillis = 500L;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void afterTextChanged$lambda$0(DebouncedTextWatcher debouncedTextWatcher, Editable editable) {
        debouncedTextWatcher.onNewText.invoke(editable);
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable text) {
        this.handler.postDelayed(new b(2, this, text), this.debounceMillis);
    }

    public final void clear() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void onTextChanged(CharSequence text, int start, int before, int count) {
        clear();
    }

    public final void setDebounceMillis(long j11) {
        this.debounceMillis = j11;
    }
}
