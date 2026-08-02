package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.s;
import Wc.a;
import We.C;
import We.D;
import We.H;
import We.K;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.io.File;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.CmlUploadPhotoApi;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Return", "Lxe/M;", "Lru/ozon/app/android/utils/Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/utils/Result;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1", f = "CmlPhotoRepository.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1 extends j implements Function2<M, d<? super Result<AttachedPhotoDTO>>, Object> {
    final /* synthetic */ String $deliveryNumber$inlined;
    final /* synthetic */ AttachedPhoto $photo$inlined;
    final /* synthetic */ String $postingNumber$inlined;
    final /* synthetic */ Object $this_runCatchingWithDispatchers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1(Object obj, d dVar, AttachedPhoto attachedPhoto, String str, String str2) {
        super(2, dVar);
        this.$this_runCatchingWithDispatchers = obj;
        this.$photo$inlined = attachedPhoto;
        this.$deliveryNumber$inlined = str;
        this.$postingNumber$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1(this.$this_runCatchingWithDispatchers, dVar, this.$photo$inlined, this.$deliveryNumber$inlined, this.$postingNumber$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CmlUploadPhotoApi cmlUploadPhotoApi;
        Object m597uploadParcelPhoto2VdDDuI;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CmlPhotoRepositoryImpl cmlPhotoRepositoryImpl = (CmlPhotoRepositoryImpl) this.$this_runCatchingWithDispatchers;
                if (this.$photo$inlined.getUploadPhotoAction() == null || (this.$deliveryNumber$inlined == null && this.$postingNumber$inlined == null)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String encode = URLEncoder.encode(this.$photo$inlined.getPhotoKey(), Charsets.UTF_8.name());
                D.c.a aVar2 = D.c.f33553c;
                K.Companion companion = K.INSTANCE;
                String resizedFilePath = this.$photo$inlined.getResizedFilePath();
                if (resizedFilePath == null) {
                    resizedFilePath = "";
                }
                File file = new File(resizedFilePath);
                C mediaType = this.$photo$inlined.getMediaType();
                companion.getClass();
                H a11 = K.Companion.a(file, mediaType);
                aVar2.getClass();
                D.c b11 = D.c.a.b("file", encode, a11);
                Tc.d builder = new Tc.d();
                Map<String, String> params = this.$photo$inlined.getUploadPhotoAction().getParams();
                if (params == null) {
                    params = U.c();
                }
                builder.putAll(params);
                builder.putIfAbsent("photo_key", this.$photo$inlined.getPhotoKey());
                String str = this.$deliveryNumber$inlined;
                if (str != null) {
                    builder.putIfAbsent("delivery_number", str);
                }
                String str2 = this.$postingNumber$inlined;
                if (str2 != null) {
                    builder.putIfAbsent("posting_number", str2);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                Tc.d u11 = builder.u();
                String actionName = this.$photo$inlined.getUploadPhotoAction().getActionName();
                cmlUploadPhotoApi = cmlPhotoRepositoryImpl.cmlUploadPhotoApi;
                this.label = 1;
                m597uploadParcelPhoto2VdDDuI = cmlUploadPhotoApi.m597uploadParcelPhoto2VdDDuI(actionName, b11, u11, this);
                if (m597uploadParcelPhoto2VdDDuI == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                m597uploadParcelPhoto2VdDDuI = ((AttachedPhotoDTO) obj).m585unboximpl();
            }
            return new Result.Success(AttachedPhotoDTO.m579boximpl((AttachedPhotoDTO.Data) m597uploadParcelPhoto2VdDDuI));
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Result<AttachedPhotoDTO>> dVar) {
        return ((CmlPhotoRepositoryImpl$uploadPhoto$$inlined$runCatchingWithDispatchers$default$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
