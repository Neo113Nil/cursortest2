package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import Ae.w0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel$onMediaPickerEvent$1", f = "SelectionFormViewModel.kt", l = {78, 82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$onMediaPickerEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MediaPickerEvent $event;
    int label;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$onMediaPickerEvent$1(MediaPickerEvent mediaPickerEvent, SelectionFormViewModel selectionFormViewModel, d<? super SelectionFormViewModel$onMediaPickerEvent$1> dVar) {
        super(2, dVar);
        this.$event = mediaPickerEvent;
        this.this$0 = selectionFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SelectionFormViewModel$onMediaPickerEvent$1(this.$event, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List mapToSelectionMedia;
        List list;
        w0 w0Var;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            MediaPickerEvent mediaPickerEvent = this.$event;
            if (mediaPickerEvent instanceof MediaPickerEvent.UploadingStateUpdated) {
                w0Var2 = this.this$0._singleEvent;
                SingleEvent.SubmitButtonAvailability submitButtonAvailability = new SingleEvent.SubmitButtonAvailability(!((MediaPickerEvent.UploadingStateUpdated) this.$event).getIsUploading());
                this.label = 1;
            } else if (mediaPickerEvent instanceof MediaPickerEvent.UploadFailed) {
                w0Var = this.this$0._singleEvent;
                SingleEvent.ShowError showError = new SingleEvent.ShowError(((MediaPickerEvent.UploadFailed) this.$event).getNotification());
                this.label = 2;
            } else {
                if (!(mediaPickerEvent instanceof MediaPickerEvent.AttachmentsUpdated)) {
                    throw new o();
                }
                mapToSelectionMedia = this.this$0.mapToSelectionMedia(((MediaPickerEvent.AttachmentsUpdated) mediaPickerEvent).getAttachments());
                this.this$0.media = mapToSelectionMedia;
                list = this.this$0.initialMedia;
                if (list == null) {
                    this.this$0.initialMedia = mapToSelectionMedia;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SelectionFormViewModel$onMediaPickerEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
