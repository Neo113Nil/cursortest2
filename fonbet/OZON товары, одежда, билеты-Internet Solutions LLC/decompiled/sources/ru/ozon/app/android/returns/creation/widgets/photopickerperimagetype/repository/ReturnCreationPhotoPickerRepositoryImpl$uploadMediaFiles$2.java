package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository;

import Sc.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2", f = "ReturnCreationPhotoPickerRepositoryImpl.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2 extends j implements Function2<M, d<? super List<? extends Unit>>, Object> {
    final /* synthetic */ String $actionName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReturnCreationPhotoPickerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2(ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl, String str, d<? super ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2> dVar) {
        super(2, dVar);
        this.this$0 = returnCreationPhotoPickerRepositoryImpl;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2 returnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2 = new ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2(this.this$0, this.$actionName, dVar);
        returnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2.L$0 = obj;
        return returnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Unit>> dVar) {
        return invoke2(m11, (d<? super List<Unit>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        Set<MediaFile> value = this.this$0.getMedia().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : value) {
            if (Intrinsics.d(((MediaFile) obj2).getUploadingState(), UploadingState.Pending.INSTANCE)) {
                arrayList.add(obj2);
            }
        }
        map = this.this$0.mutableDeferred;
        ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl = this.this$0;
        String str = this.$actionName;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaFile mediaFile = (MediaFile) it.next();
            Pair pair = new Pair(new Long(mediaFile.getId()), C10727i.a(m11, null, null, new ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2$2$1(returnCreationPhotoPickerRepositoryImpl, mediaFile, str, null), 3));
            map.put(pair.e(), pair.f());
        }
        Collection values = map.values();
        this.label = 1;
        Object a11 = C10721f.a(values, this);
        return a11 == aVar ? aVar : a11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Unit>> dVar) {
        return ((ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
