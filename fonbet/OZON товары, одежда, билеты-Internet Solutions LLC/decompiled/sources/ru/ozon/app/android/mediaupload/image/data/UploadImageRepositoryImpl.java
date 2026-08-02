package ru.ozon.app.android.mediaupload.image.data;

import He.b;
import Sc.s;
import Wc.a;
import We.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.image.data.response.ReturnUploadImageDTO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageRepository;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/UploadImageRepositoryImpl;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageRepository;", "Lru/ozon/app/android/mediaupload/image/data/UploadImageApi;", "uploadImageApi", "<init>", "(Lru/ozon/app/android/mediaupload/image/data/UploadImageApi;)V", "LWe/D$c;", "request", "", "", "params", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "parsingUploadedImageDTO", "(LWe/D$c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attach", "Lru/ozon/app/android/utils/Result;", "uploadImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/mediaupload/image/data/UploadImageApi;", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UploadImageRepositoryImpl implements UploadImageRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final UploadImageApi uploadImageApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/UploadImageRepositoryImpl$Companion;", "", "<init>", "()V", "ATTACH_BODY_PART", "", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentVO.AttachedImageVO.ImageType.values().length];
            try {
                iArr[AttachmentVO.AttachedImageVO.ImageType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentVO.AttachedImageVO.ImageType.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentVO.AttachedImageVO.ImageType.SOCIAL_POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentVO.AttachedImageVO.ImageType.RETURN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UploadImageRepositoryImpl(@NotNull UploadImageApi uploadImageApi) {
        Intrinsics.checkNotNullParameter(uploadImageApi, "uploadImageApi");
        this.uploadImageApi = uploadImageApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parsingUploadedImageDTO(D.c cVar, Map<String, String> map, d<? super UploadedImageDTO> dVar) {
        UploadImageRepositoryImpl$parsingUploadedImageDTO$1 uploadImageRepositoryImpl$parsingUploadedImageDTO$1;
        int i11;
        if (dVar instanceof UploadImageRepositoryImpl$parsingUploadedImageDTO$1) {
            uploadImageRepositoryImpl$parsingUploadedImageDTO$1 = (UploadImageRepositoryImpl$parsingUploadedImageDTO$1) dVar;
            int i12 = uploadImageRepositoryImpl$parsingUploadedImageDTO$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uploadImageRepositoryImpl$parsingUploadedImageDTO$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uploadImageRepositoryImpl$parsingUploadedImageDTO$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = uploadImageRepositoryImpl$parsingUploadedImageDTO$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    UploadImageApi uploadImageApi = this.uploadImageApi;
                    uploadImageRepositoryImpl$parsingUploadedImageDTO$1.label = 1;
                    obj = uploadImageApi.uploadReturnImage(cVar, map, uploadImageRepositoryImpl$parsingUploadedImageDTO$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                ReturnUploadImageDTO returnUploadImageDTO = (ReturnUploadImageDTO) obj;
                return new UploadedImageDTO(returnUploadImageDTO.getUploadFiles().get(0).getFileName(), returnUploadImageDTO.getUploadFiles().get(0).getLink(), null, null, returnUploadImageDTO.getUploadFiles().get(0).getBucket(), returnUploadImageDTO.getUploadFiles().get(0).getKey());
            }
        }
        uploadImageRepositoryImpl$parsingUploadedImageDTO$1 = new UploadImageRepositoryImpl$parsingUploadedImageDTO$1(this, dVar);
        Object obj2 = uploadImageRepositoryImpl$parsingUploadedImageDTO$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = uploadImageRepositoryImpl$parsingUploadedImageDTO$1.label;
        if (i11 != 0) {
        }
        ReturnUploadImageDTO returnUploadImageDTO2 = (ReturnUploadImageDTO) obj2;
        return new UploadedImageDTO(returnUploadImageDTO2.getUploadFiles().get(0).getFileName(), returnUploadImageDTO2.getUploadFiles().get(0).getLink(), null, null, returnUploadImageDTO2.getUploadFiles().get(0).getBucket(), returnUploadImageDTO2.getUploadFiles().get(0).getKey());
    }

    @Override // ru.ozon.app.android.mediaupload.image.domain.UploadImageRepository
    public Object uploadImage(@NotNull AttachmentVO.AttachedImageVO attachedImageVO, @NotNull d<? super Result<UploadedImageDTO>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new UploadImageRepositoryImpl$uploadImage$$inlined$runCatchingWithDispatchers$default$1(this, null, attachedImageVO), dVar);
    }
}
