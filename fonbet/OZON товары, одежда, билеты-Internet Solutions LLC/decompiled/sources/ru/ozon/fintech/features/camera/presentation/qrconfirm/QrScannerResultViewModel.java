package ru.ozon.fintech.features.camera.presentation.qrconfirm;

import Ae.O0;
import Ae.x0;
import E30.d;
import S80.b;
import d40.InterfaceC6083a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.camera.domain.QrBottomSheetViewState;
import ru.ozon.fintech.features.camera.domain.exchangerdata.QrBottomSheetResult;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultViewModel;", "LE30/d;", "Ld40/a;", "exchanger", "LS80/b;", "fintechNavigation", "<init>", "(Ld40/a;LS80/b;)V", "", "result", "needPop", "", "pushResult", "(ZZ)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "positiveText", "negativeText", "onCreate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "positiveButtonClicked", "()V", "negativeButtonClicked", "closed", "Ld40/a;", "LS80/b;", "isPushed", "Z", "LAe/x0;", "Lru/ozon/fintech/features/camera/domain/QrBottomSheetViewState;", "viewElementsState", "LAe/x0;", "getViewElementsState", "()LAe/x0;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrScannerResultViewModel extends d {

    @NotNull
    private final InterfaceC6083a exchanger;

    @NotNull
    private final b fintechNavigation;
    private boolean isPushed;

    @NotNull
    private final x0<QrBottomSheetViewState> viewElementsState;

    public QrScannerResultViewModel(@NotNull InterfaceC6083a exchanger, @NotNull b fintechNavigation) {
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.exchanger = exchanger;
        this.fintechNavigation = fintechNavigation;
        this.viewElementsState = O0.a(null);
    }

    private final void pushResult(boolean result, boolean needPop) {
        if (this.isPushed) {
            return;
        }
        this.isPushed = true;
        this.exchanger.push(new QrBottomSheetResult(result));
        if (needPop) {
            this.fintechNavigation.pop();
        }
    }

    static /* synthetic */ void pushResult$default(QrScannerResultViewModel qrScannerResultViewModel, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        qrScannerResultViewModel.pushResult(z11, z12);
    }

    public final void closed() {
        pushResult(false, false);
    }

    @NotNull
    public final x0<QrBottomSheetViewState> getViewElementsState() {
        return this.viewElementsState;
    }

    public final void negativeButtonClicked() {
        pushResult$default(this, false, false, 2, null);
    }

    public final void onCreate(@NotNull String title, @NotNull String positiveText, @NotNull String negativeText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        this.viewElementsState.setValue(new QrBottomSheetViewState(title, negativeText, positiveText));
    }

    public final void positiveButtonClicked() {
        pushResult$default(this, true, false, 2, null);
    }
}
