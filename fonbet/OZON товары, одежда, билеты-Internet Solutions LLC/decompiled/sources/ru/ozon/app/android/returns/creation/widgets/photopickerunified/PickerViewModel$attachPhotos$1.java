package ru.ozon.app.android.returns.creation.widgets.photopickerunified;

import Hi.l;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
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
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel$attachPhotos$1", f = "PickerViewModel.kt", l = {43, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PickerViewModel$attachPhotos$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ List<l> $medias;
    int label;
    final /* synthetic */ PickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PickerViewModel$attachPhotos$1(PickerViewModel pickerViewModel, List<? extends l> list, String str, d<? super PickerViewModel$attachPhotos$1> dVar) {
        super(2, dVar);
        this.this$0 = pickerViewModel;
        this.$medias = list;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PickerViewModel$attachPhotos$1(this.this$0, this.$medias, this.$actionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r9.onPhotoUpdated(r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r9.uploadMediaFiles(r1, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r9.addMediaFiles(r6, r8) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository;
        MediaFile mapToMedia;
        ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository2;
        ReturnCreationEventManager returnCreationEventManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            returnCreationPhotoPickerRepository = this.this$0.repository;
            List<l> list = this.$medias;
            PickerViewModel pickerViewModel = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mapToMedia = pickerViewModel.mapToMedia((l) it.next());
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
            returnCreationEventManager = this.this$0.eventManager;
            this.label = 3;
        }
        returnCreationPhotoPickerRepository2 = this.this$0.repository;
        String str = this.$actionName;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PickerViewModel$attachPhotos$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
