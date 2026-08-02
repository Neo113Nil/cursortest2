package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel;

import Hi.g;
import Hi.l;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel$handleGalleryResult$1", f = "ButtonsViewModel.kt", l = {76, 77, 78}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ButtonsViewModel$handleGalleryResult$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ g $galleryLaunchResult;
    int label;
    final /* synthetic */ ButtonsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonsViewModel$handleGalleryResult$1(ButtonsViewModel buttonsViewModel, g gVar, d<? super ButtonsViewModel$handleGalleryResult$1> dVar) {
        super(2, dVar);
        this.this$0 = buttonsViewModel;
        this.$galleryLaunchResult = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ButtonsViewModel$handleGalleryResult$1(this.this$0, this.$galleryLaunchResult, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r9.onPhotoUpdated(r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r1.uploadMediaFiles(r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r9.addMediaFiles(r6, r8) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MediaFile mapToMedia;
        ReturnCreationEventManager returnCreationEventManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository = this.this$0.repository;
            List<l> a11 = this.$galleryLaunchResult.a();
            ButtonsViewModel buttonsViewModel = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                mapToMedia = buttonsViewModel.mapToMedia((l) it.next());
                if (mapToMedia != null) {
                    arrayList.add(mapToMedia);
                }
            }
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            returnCreationEventManager = this.this$0.returnCreationEventManager;
            this.label = 3;
        }
        String actionName = this.this$0.getActionName();
        if (actionName != null) {
            ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository2 = this.this$0.repository;
            this.label = 2;
        }
        returnCreationEventManager = this.this$0.returnCreationEventManager;
        this.label = 3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ButtonsViewModel$handleGalleryResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
