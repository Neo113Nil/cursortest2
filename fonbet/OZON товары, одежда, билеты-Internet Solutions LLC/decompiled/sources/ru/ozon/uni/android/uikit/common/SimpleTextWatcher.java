package ru.ozon.uni.android.uikit.common;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0002\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "()V", "Lkotlin/Function1;", "", "", "afterTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/text/Editable;", "s", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SimpleTextWatcher implements TextWatcher {
    private final Function1<String, Unit> afterTextChanged;

    public SimpleTextWatcher() {
        this.afterTextChanged = null;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        Function1<String, Unit> function1 = this.afterTextChanged;
        if (function1 != null) {
            function1.invoke(s11.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s11, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(s11, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s11, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(s11, "s");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTextWatcher(@NotNull Function1<? super String, Unit> afterTextChanged) {
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        this.afterTextChanged = afterTextChanged;
    }
}
