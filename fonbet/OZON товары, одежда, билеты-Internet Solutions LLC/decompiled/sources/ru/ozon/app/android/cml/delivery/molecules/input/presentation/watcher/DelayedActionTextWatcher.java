package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import Sc.InterfaceC4008j;
import Sc.k;
import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0003R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!¨\u00064"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DelayedActionTextWatcher;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "<init>", "()V", "", "sequence", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "input", "afterTextChanged", "(Landroid/text/Editable;)V", "onDetach", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Lxe/B0;", "typingJob", "Lxe/B0;", "", "skipChange", "Z", "getSkipChange", "()Z", "setSkipChange", "(Z)V", "", "debounce", "J", "getDebounce", "()J", "setDebounce", "(J)V", "Lkotlin/Function1;", "", "delayedAction", "Lkotlin/jvm/functions/Function1;", "getDelayedAction", "()Lkotlin/jvm/functions/Function1;", "setDelayedAction", "(Lkotlin/jvm/functions/Function1;)V", "executingAction", "getExecutingAction", "setExecutingAction", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DelayedActionTextWatcher extends OzonTextWatcher {

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutineScope = k.b(new DelayedActionTextWatcher$coroutineScope$2(this));
    private long debounce;
    private Function1<? super String, Unit> delayedAction;
    private boolean executingAction;
    private boolean skipChange;
    private B0 typingJob;

    private final M getCoroutineScope() {
        return (M) this.coroutineScope.getValue();
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable input) {
        Function1<? super String, Unit> function1;
        if (this.skipChange || input == null || (function1 = this.delayedAction) == null) {
            return;
        }
        if (!this.executingAction) {
            this.typingJob = C10727i.c(getCoroutineScope(), null, null, new DelayedActionTextWatcher$afterTextChanged$2(this, function1, input, null), 3);
            return;
        }
        String z11 = h.z(input.toString());
        setSkipChange(true);
        input.replace(0, input.length(), z11);
        setSkipChange(false);
    }

    public final long getDebounce() {
        return this.debounce;
    }

    public final boolean getExecutingAction() {
        return this.executingAction;
    }

    public final boolean getSkipChange() {
        return this.skipChange;
    }

    public final void onDetach() {
        N.c(getCoroutineScope(), null);
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void onTextChanged(CharSequence sequence, int start, int before, int count) {
        B0 b02 = this.typingJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    public final void setDebounce(long j11) {
        this.debounce = j11;
    }

    public final void setDelayedAction(Function1<? super String, Unit> function1) {
        this.delayedAction = function1;
    }

    public final void setExecutingAction(boolean z11) {
        this.executingAction = z11;
    }

    public final void setSkipChange(boolean z11) {
        this.skipChange = z11;
    }
}
