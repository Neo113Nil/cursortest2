package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/PassengersDirectoryV3ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "newText", "", "isInputTextChange", "(Ljava/lang/String;)Z", "", "setInputText", "(Ljava/lang/String;)V", "isSilentRefresh", "setIsSilentRefresh", "(Z)V", "getIsSilentRefresh", "()Z", "isScrollToTop", "setIsScrollToTop", "getIsScrollToTop", "getInputText", "()Ljava/lang/String;", "getIsClearButtonVisible", "inputText", "Ljava/lang/String;", "Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3ViewModel extends w0 {

    @NotNull
    private String inputText = "";
    private boolean isScrollToTop;
    private boolean isSilentRefresh;

    @NotNull
    public final String getInputText() {
        return this.inputText;
    }

    public final boolean getIsClearButtonVisible() {
        return this.inputText.length() > 0;
    }

    public final boolean getIsScrollToTop() {
        return this.isScrollToTop;
    }

    public final boolean getIsSilentRefresh() {
        return this.isSilentRefresh;
    }

    public final boolean isInputTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return !Intrinsics.d(newText, this.inputText);
    }

    public final void setInputText(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.inputText = newText;
    }

    public final void setIsScrollToTop(boolean isScrollToTop) {
        this.isScrollToTop = isScrollToTop;
    }

    public final void setIsSilentRefresh(boolean isSilentRefresh) {
        this.isSilentRefresh = isSilentRefresh;
    }
}
