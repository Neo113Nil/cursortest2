package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: MediaPickerButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.ui.component.MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1", f = "MediaPickerButton.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Uri> $it;
    final /* synthetic */ MediaPickerButtonCTAStyle $mediaPickerButtonCTAStyle;
    final /* synthetic */ ManagedActivityResultLauncher<IntercomPreviewArgs, List<Uri>> $previewLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(ManagedActivityResultLauncher<IntercomPreviewArgs, List<Uri>> managedActivityResultLauncher, List<? extends Uri> list, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Continuation<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1> continuation) {
        super(2, continuation);
        this.$previewLauncher = managedActivityResultLauncher;
        this.$it = list;
        this.$mediaPickerButtonCTAStyle = mediaPickerButtonCTAStyle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(this.$previewLauncher, this.$it, this.$mediaPickerButtonCTAStyle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ManagedActivityResultLauncher<IntercomPreviewArgs, List<Uri>> managedActivityResultLauncher = this.$previewLauncher;
        List<Uri> list = this.$it;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new IntercomPreviewFile.LocalFile((Uri) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle = this.$mediaPickerButtonCTAStyle;
        managedActivityResultLauncher.launch(new IntercomPreviewArgs(arrayList2, DeleteType.Remove.INSTANCE, mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TextButton ? ((MediaPickerButtonCTAStyle.TextButton) mediaPickerButtonCTAStyle).getCtaText() : null, this.$mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TopBarButton, null, 16, null));
        return Unit.INSTANCE;
    }
}
