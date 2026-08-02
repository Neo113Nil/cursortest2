package ru.ozon.app.android.mediaupload.image.data;

import Sc.o;
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
import kotlin.text.Charsets;
import kotlin.text.h;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.image.data.UploadImageRepositoryImpl;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedProductImageDTO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Return", "Lxe/M;", "Lru/ozon/app/android/utils/Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/utils/Result;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.image.data.UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1", f = "UploadImageRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 41, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 47, 50, 52}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1 extends j implements Function2<M, d<? super Result<UploadedImageDTO>>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attach$inlined;
    final /* synthetic */ Object $this_runCatchingWithDispatchers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1(Object obj, d dVar, AttachmentVO.AttachedImageVO attachedImageVO) {
        super(2, dVar);
        this.$this_runCatchingWithDispatchers = obj;
        this.$attach$inlined = attachedImageVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1(this.$this_runCatchingWithDispatchers, dVar, this.$attach$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r8 == r0) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UploadImageApi uploadImageApi;
        UploadImageApi uploadImageApi2;
        UploadImageApi uploadImageApi3;
        UploadImageApi uploadImageApi4;
        UploadImageApi uploadImageApi5;
        a aVar = a.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    s.b(obj);
                    UploadImageRepositoryImpl uploadImageRepositoryImpl = (UploadImageRepositoryImpl) this.$this_runCatchingWithDispatchers;
                    String encode = URLEncoder.encode(this.$attach$inlined.getFilename(), Charsets.UTF_8.name());
                    D.c.a aVar2 = D.c.f33553c;
                    K.Companion companion = K.INSTANCE;
                    String resizedFilePath = this.$attach$inlined.getResizedFilePath();
                    if (resizedFilePath == null) {
                        resizedFilePath = "";
                    }
                    File file = new File(resizedFilePath);
                    C mediaType = this.$attach$inlined.getMediaType();
                    companion.getClass();
                    H a11 = K.Companion.a(file, mediaType);
                    aVar2.getClass();
                    D.c b11 = D.c.a.b("file", encode, a11);
                    Map<String, String> uploadImageActionParams = this.$attach$inlined.getUploadImageActionParams();
                    if (uploadImageActionParams == null) {
                        uploadImageActionParams = U.c();
                    }
                    int i11 = UploadImageRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[this.$attach$inlined.getType().ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                uploadImageApi5 = uploadImageRepositoryImpl.uploadImageApi;
                                this.label = 5;
                                obj = uploadImageApi5.uploadSocialPostImage(b11, uploadImageActionParams, this);
                                if (obj == aVar) {
                                }
                                return new Result.Success(obj);
                            }
                            if (i11 != 4) {
                                throw new o();
                            }
                            this.label = 6;
                            obj = uploadImageRepositoryImpl.parsingUploadedImageDTO(b11, uploadImageActionParams, this);
                            if (obj == aVar) {
                            }
                            return new Result.Success(obj);
                        }
                        String uploadImageAction = this.$attach$inlined.getUploadImageAction();
                        if (uploadImageAction != null && !h.K(uploadImageAction)) {
                            uploadImageApi4 = uploadImageRepositoryImpl.uploadImageApi;
                            String uploadImageAction2 = this.$attach$inlined.getUploadImageAction();
                            this.label = 4;
                            obj = uploadImageApi4.uploadReviewImage(uploadImageAction2, b11, uploadImageActionParams, this);
                            if (obj == aVar) {
                            }
                            return new Result.Success(obj);
                        }
                        uploadImageApi3 = uploadImageRepositoryImpl.uploadImageApi;
                        this.label = 3;
                        obj = uploadImageApi3.uploadReviewImage(b11, uploadImageActionParams, this);
                        if (obj == aVar) {
                        }
                        return new Result.Success(obj);
                    }
                    String uploadImageAction3 = this.$attach$inlined.getUploadImageAction();
                    if (uploadImageAction3 != null && !h.K(uploadImageAction3)) {
                        uploadImageApi2 = uploadImageRepositoryImpl.uploadImageApi;
                        String uploadImageAction4 = this.$attach$inlined.getUploadImageAction();
                        this.label = 2;
                        obj = uploadImageApi2.uploadProductImage(uploadImageAction4, b11, uploadImageActionParams, this);
                        if (obj == aVar) {
                        }
                        obj = ((UploadedProductImageDTO) obj).toUploadedImageDTO();
                        return new Result.Success(obj);
                    }
                    uploadImageApi = uploadImageRepositoryImpl.uploadImageApi;
                    this.label = 1;
                    obj = uploadImageApi.uploadProductImage(b11, uploadImageActionParams, this);
                    return aVar;
                case 1:
                    s.b(obj);
                    obj = ((UploadedProductImageDTO) obj).toUploadedImageDTO();
                    return new Result.Success(obj);
                case 2:
                    s.b(obj);
                    obj = ((UploadedProductImageDTO) obj).toUploadedImageDTO();
                    return new Result.Success(obj);
                case 3:
                case 4:
                case 5:
                case 6:
                    s.b(obj);
                    return new Result.Success(obj);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Result<UploadedImageDTO>> dVar) {
        return ((UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
