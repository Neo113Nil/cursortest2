package ru.ozon.app.android.fresh.chat.viewModels;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "newText", "", "onTextChanged", "(Ljava/lang/String;)V", "clearText", "", "isLoading", "", "delayMillis", "setLoading", "(ZLjava/lang/Long;)V", "LAe/x0;", "_loadingStateFlow", "LAe/x0;", "_textStateFlow", "LAe/M0;", "loadingStateFlow", "LAe/M0;", "getLoadingStateFlow", "()LAe/M0;", "currentTextStateFlow", "getCurrentTextStateFlow", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshAISharedViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _loadingStateFlow;

    @NotNull
    private final x0<String> _textStateFlow;

    @NotNull
    private final M0<String> currentTextStateFlow;

    @NotNull
    private final M0<Boolean> loadingStateFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel$Companion;", "", "<init>", "()V", "EMPTY_STRING", "", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FreshAISharedViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._loadingStateFlow = a11;
        x0<String> a12 = O0.a("");
        this._textStateFlow = a12;
        this.loadingStateFlow = C2399j.b(a11);
        this.currentTextStateFlow = C2399j.b(a12);
    }

    public static /* synthetic */ void setLoading$default(FreshAISharedViewModel freshAISharedViewModel, boolean z11, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        freshAISharedViewModel.setLoading(z11, l11);
    }

    public final void clearText() {
        this._textStateFlow.setValue("");
    }

    @NotNull
    public final M0<String> getCurrentTextStateFlow() {
        return this.currentTextStateFlow;
    }

    @NotNull
    public final M0<Boolean> getLoadingStateFlow() {
        return this.loadingStateFlow;
    }

    public final void onTextChanged(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this._textStateFlow.setValue(newText);
    }

    public final void setLoading(boolean isLoading, Long delayMillis) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new FreshAISharedViewModel$setLoading$1(delayMillis, this, isLoading, null), 3);
    }
}
