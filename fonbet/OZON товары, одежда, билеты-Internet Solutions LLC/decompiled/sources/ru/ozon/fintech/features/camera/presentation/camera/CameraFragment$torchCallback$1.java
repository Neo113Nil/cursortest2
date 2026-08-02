package ru.ozon.fintech.features.camera.presentation.camera;

import C.I;
import android.widget.ImageView;
import androidx.lifecycle.K;
import com.google.common.util.concurrent.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.camera.databinding.CameraFragmentBinding;
import ru.ozon.fintech.features.camera.databinding.CameraViewLayoutBinding;
import ru.ozon.fintech.features.camera.domain.CameraActions;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/ozon/fintech/features/camera/presentation/camera/CameraFragment$torchCallback$1", "Lcom/google/common/util/concurrent/g;", "Ljava/lang/Void;", "", "updateFlashState", "()V", "result", "onSuccess", "(Ljava/lang/Void;)V", "", "t", "onFailure", "(Ljava/lang/Throwable;)V", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraFragment$torchCallback$1 implements g<Void> {
    final /* synthetic */ CameraFragment this$0;

    CameraFragment$torchCallback$1(CameraFragment cameraFragment) {
        this.this$0 = cameraFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFlashState() {
        CameraViewModel viewModel;
        CameraFragmentBinding cameraFragmentBinding;
        I i11;
        CameraViewModel viewModel2;
        CameraViewLayoutBinding cameraViewLayoutBinding;
        ImageView imageView;
        viewModel = this.this$0.getViewModel();
        CameraActions.Flash.FlashViewType flashViewType = viewModel.getFlashViewType();
        CameraActions.Flash.FlashViewType flashViewType2 = CameraActions.Flash.FlashViewType.FLASH_OFF;
        int i12 = flashViewType == flashViewType2 ? R.drawable.ic_m_lantern_off_filled : R.drawable.ic_m_lantern_on_filled;
        cameraFragmentBinding = this.this$0.binding;
        if (cameraFragmentBinding != null && (cameraViewLayoutBinding = cameraFragmentBinding.cameraLayout) != null && (imageView = cameraViewLayoutBinding.ivFlash) != null) {
            imageView.setImageResource(i12);
        }
        i11 = this.this$0.imageCapture;
        if (i11 != null) {
            viewModel2 = this.this$0.getViewModel();
            i11.c0(viewModel2.getFlashViewType() == flashViewType2 ? 2 : 1);
        }
    }

    @Override // com.google.common.util.concurrent.g
    public void onFailure(Throwable t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        C10727i.c(K.a(this.this$0), null, null, new CameraFragment$torchCallback$1$onFailure$1(this.this$0, this, null), 3);
    }

    @Override // com.google.common.util.concurrent.g
    public void onSuccess(Void result) {
        C10727i.c(K.a(this.this$0), null, null, new CameraFragment$torchCallback$1$onSuccess$1(this, null), 3);
    }
}
