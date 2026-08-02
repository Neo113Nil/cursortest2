package ru.ozon.fintech.features.camera.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.databinding.ScannerErrorResultViewBinding;
import ru.ozon.fintech.ui.bottom.FintechBottomSheetView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/features/camera/ui/ScannerErrorResultView;", "Lru/ozon/fintech/ui/bottom/FintechBottomSheetView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/features/camera/databinding/ScannerErrorResultViewBinding;", "onBottomSheetClosed", "", "isBottomSheetDraggerVisible", "", "getButtonState", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScannerErrorResultView extends FintechBottomSheetView {
    private ScannerErrorResultViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerErrorResultView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final FinLargeButtonState getButtonState() {
        String string = getResources().getString(R.string.fintech_camera_scanner_error_btn_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new FinLargeButtonState("", string, new ScannerErrorResultView$getButtonState$1(this), null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 488, null);
    }

    @Override // ru.ozon.fintech.ui.bottom.FintechBottomSheetView
    public boolean isBottomSheetDraggerVisible() {
        return false;
    }

    @Override // ru.ozon.fintech.ui.bottom.FintechBottomSheetView
    public void onBottomSheetClosed() {
        setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerErrorResultView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScannerErrorResultView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerErrorResultView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        FinLargeButtonView finLargeButtonView;
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        FrameLayout bottomSheetContainer = getBottomSheetContainer();
        if (bottomSheetContainer != null) {
            ScannerErrorResultViewBinding inflate = ScannerErrorResultViewBinding.inflate(from, bottomSheetContainer, true);
            this.binding = inflate;
            if (inflate != null && (finLargeButtonView = inflate.btnReply) != null) {
                finLargeButtonView.bindState(getButtonState());
            }
        }
        setClickable(true);
        setFocusable(true);
        ScannerErrorResultViewBinding scannerErrorResultViewBinding = this.binding;
        if (scannerErrorResultViewBinding != null) {
            scannerErrorResultViewBinding.btnReply.setOnClickListener(new CX.a(this, 10));
            scannerErrorResultViewBinding.ivClose.setOnClickListener(new BQ.b(this, 7));
        }
    }
}
