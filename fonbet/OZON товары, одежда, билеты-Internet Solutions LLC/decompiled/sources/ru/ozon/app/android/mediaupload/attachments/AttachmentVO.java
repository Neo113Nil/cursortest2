package ru.ozon.app.android.mediaupload.attachments;

import B0.A0;
import B0.C2454a;
import B4.V;
import G.g;
import Pk0.c;
import Sc.o;
import We.C;
import Xc.a;
import Xc.b;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003/01B]\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0012\u0010.\u0082\u0001\u000223¨\u00064"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "", "", "id", "", "uuid", "filename", "originalFilePath", "Landroid/net/Uri;", "mediaUri", "LWe/C;", "mediaType", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "status", "Lio/reactivex/p;", "", "uploadingProgress", "", "isFallbackUploading", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Lio/reactivex/p;Z)V", "copyWith", "(Landroid/net/Uri;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Z)Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "J", "getId", "()J", "Ljava/lang/String;", "getUuid", "()Ljava/lang/String;", "getFilename", "getOriginalFilePath", "Landroid/net/Uri;", "getMediaUri", "()Landroid/net/Uri;", "setMediaUri", "(Landroid/net/Uri;)V", "LWe/C;", "getMediaType", "()LWe/C;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "getStatus", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "Lio/reactivex/p;", "getUploadingProgress", "()Lio/reactivex/p;", "Z", "()Z", "AttachedVideoVO", "AttachedImageVO", "Status", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AttachmentVO {

    @NotNull
    private final String filename;
    private final long id;
    private final boolean isFallbackUploading;
    private final C mediaType;

    @NotNull
    private Uri mediaUri;

    @NotNull
    private final String originalFilePath;

    @NotNull
    private final Status status;
    private final p<Integer> uploadingProgress;
    private final String uuid;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:\u0001PBÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJì\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b5\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b6\u0010#R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b=\u0010#R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b>\u0010#R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b?\u0010#R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\b\u001d\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "type", "", "resizedFilePath", ImagesContract.URL, "bucket", "key", "", "width", "height", "uploadImageAction", "", "uploadImageActionParams", "", "id", "uuid", "filename", "originalFilePath", "Landroid/net/Uri;", "mediaUri", "LWe/C;", "mediaType", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "status", "Lio/reactivex/p;", "uploadingProgress", "", "isFallbackUploading", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Lio/reactivex/p;Z)V", "copy", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Lio/reactivex/p;Z)Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "getType", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "Ljava/lang/String;", "getResizedFilePath", "getUrl", "getBucket", "getKey", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "getHeight", "getUploadImageAction", "Ljava/util/Map;", "getUploadImageActionParams", "()Ljava/util/Map;", "J", "getId", "()J", "getUuid", "getFilename", "getOriginalFilePath", "Landroid/net/Uri;", "getMediaUri", "()Landroid/net/Uri;", "setMediaUri", "(Landroid/net/Uri;)V", "LWe/C;", "getMediaType", "()LWe/C;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "getStatus", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "Lio/reactivex/p;", "getUploadingProgress", "()Lio/reactivex/p;", "Z", "()Z", "ImageType", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachedImageVO extends AttachmentVO {
        private final String bucket;

        @NotNull
        private final String filename;
        private final Integer height;
        private final long id;
        private final boolean isFallbackUploading;
        private final String key;
        private final C mediaType;

        @NotNull
        private Uri mediaUri;

        @NotNull
        private final String originalFilePath;
        private final String resizedFilePath;

        @NotNull
        private final Status status;

        @NotNull
        private final ImageType type;
        private final String uploadImageAction;
        private final Map<String, String> uploadImageActionParams;
        private final p<Integer> uploadingProgress;
        private final String url;
        private final String uuid;
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEW", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, "SOCIAL_POST", "RETURN", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ImageType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ImageType[] $VALUES;
            public static final ImageType REVIEW = new ImageType("REVIEW", 0);
            public static final ImageType PRODUCT = new ImageType(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, 1);
            public static final ImageType SOCIAL_POST = new ImageType("SOCIAL_POST", 2);
            public static final ImageType RETURN = new ImageType("RETURN", 3);

            private static final /* synthetic */ ImageType[] $values() {
                return new ImageType[]{REVIEW, PRODUCT, SOCIAL_POST, RETURN};
            }

            static {
                ImageType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ImageType(String str, int i11) {
            }

            public static ImageType valueOf(String str) {
                return (ImageType) Enum.valueOf(ImageType.class, str);
            }

            public static ImageType[] values() {
                return (ImageType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AttachedImageVO(ImageType imageType, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Map map, long j11, String str6, String str7, String str8, Uri uri, C c11, Status status, p pVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageType, str, str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : map, j11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str6, str7, str8, uri, c11, status, (i11 & 65536) != 0 ? null : pVar, z11);
        }

        public static /* synthetic */ AttachedImageVO copy$default(AttachedImageVO attachedImageVO, ImageType imageType, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Map map, long j11, String str6, String str7, String str8, Uri uri, C c11, Status status, p pVar, boolean z11, int i11, Object obj) {
            boolean z12;
            p pVar2;
            ImageType imageType2 = (i11 & 1) != 0 ? attachedImageVO.type : imageType;
            String str9 = (i11 & 2) != 0 ? attachedImageVO.resizedFilePath : str;
            String str10 = (i11 & 4) != 0 ? attachedImageVO.url : str2;
            String str11 = (i11 & 8) != 0 ? attachedImageVO.bucket : str3;
            String str12 = (i11 & 16) != 0 ? attachedImageVO.key : str4;
            Integer num3 = (i11 & 32) != 0 ? attachedImageVO.width : num;
            Integer num4 = (i11 & 64) != 0 ? attachedImageVO.height : num2;
            String str13 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? attachedImageVO.uploadImageAction : str5;
            Map map2 = (i11 & 256) != 0 ? attachedImageVO.uploadImageActionParams : map;
            long j12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? attachedImageVO.id : j11;
            String str14 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? attachedImageVO.uuid : str6;
            String str15 = (i11 & 2048) != 0 ? attachedImageVO.filename : str7;
            String str16 = (i11 & 4096) != 0 ? attachedImageVO.originalFilePath : str8;
            ImageType imageType3 = imageType2;
            Uri uri2 = (i11 & 8192) != 0 ? attachedImageVO.mediaUri : uri;
            C c12 = (i11 & 16384) != 0 ? attachedImageVO.mediaType : c11;
            Status status2 = (i11 & 32768) != 0 ? attachedImageVO.status : status;
            p pVar3 = (i11 & 65536) != 0 ? attachedImageVO.uploadingProgress : pVar;
            if ((i11 & 131072) != 0) {
                pVar2 = pVar3;
                z12 = attachedImageVO.isFallbackUploading;
            } else {
                z12 = z11;
                pVar2 = pVar3;
            }
            return attachedImageVO.copy(imageType3, str9, str10, str11, str12, num3, num4, str13, map2, j12, str14, str15, str16, uri2, c12, status2, pVar2, z12);
        }

        @NotNull
        public final AttachedImageVO copy(@NotNull ImageType type, String resizedFilePath, String url, String bucket, String key, Integer width, Integer height, String uploadImageAction, Map<String, String> uploadImageActionParams, long id2, String uuid, @NotNull String filename, @NotNull String originalFilePath, @NotNull Uri mediaUri, C mediaType, @NotNull Status status, p<Integer> uploadingProgress, boolean isFallbackUploading) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(originalFilePath, "originalFilePath");
            Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
            Intrinsics.checkNotNullParameter(status, "status");
            return new AttachedImageVO(type, resizedFilePath, url, bucket, key, width, height, uploadImageAction, uploadImageActionParams, id2, uuid, filename, originalFilePath, mediaUri, mediaType, status, uploadingProgress, isFallbackUploading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachedImageVO)) {
                return false;
            }
            AttachedImageVO attachedImageVO = (AttachedImageVO) other;
            return this.type == attachedImageVO.type && Intrinsics.d(this.resizedFilePath, attachedImageVO.resizedFilePath) && Intrinsics.d(this.url, attachedImageVO.url) && Intrinsics.d(this.bucket, attachedImageVO.bucket) && Intrinsics.d(this.key, attachedImageVO.key) && Intrinsics.d(this.width, attachedImageVO.width) && Intrinsics.d(this.height, attachedImageVO.height) && Intrinsics.d(this.uploadImageAction, attachedImageVO.uploadImageAction) && Intrinsics.d(this.uploadImageActionParams, attachedImageVO.uploadImageActionParams) && this.id == attachedImageVO.id && Intrinsics.d(this.uuid, attachedImageVO.uuid) && Intrinsics.d(this.filename, attachedImageVO.filename) && Intrinsics.d(this.originalFilePath, attachedImageVO.originalFilePath) && Intrinsics.d(this.mediaUri, attachedImageVO.mediaUri) && Intrinsics.d(this.mediaType, attachedImageVO.mediaType) && Intrinsics.d(this.status, attachedImageVO.status) && Intrinsics.d(this.uploadingProgress, attachedImageVO.uploadingProgress) && this.isFallbackUploading == attachedImageVO.isFallbackUploading;
        }

        public final String getBucket() {
            return this.bucket;
        }

        @NotNull
        public String getFilename() {
            return this.filename;
        }

        public final Integer getHeight() {
            return this.height;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        public long getId() {
            return this.id;
        }

        public final String getKey() {
            return this.key;
        }

        public C getMediaType() {
            return this.mediaType;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        @NotNull
        public Uri getMediaUri() {
            return this.mediaUri;
        }

        @NotNull
        public String getOriginalFilePath() {
            return this.originalFilePath;
        }

        public final String getResizedFilePath() {
            return this.resizedFilePath;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        @NotNull
        public Status getStatus() {
            return this.status;
        }

        @NotNull
        public final ImageType getType() {
            return this.type;
        }

        public final String getUploadImageAction() {
            return this.uploadImageAction;
        }

        public final Map<String, String> getUploadImageActionParams() {
            return this.uploadImageActionParams;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        public p<Integer> getUploadingProgress() {
            return this.uploadingProgress;
        }

        public final String getUrl() {
            return this.url;
        }

        public String getUuid() {
            return this.uuid;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.resizedFilePath;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.url;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bucket;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.key;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.width;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.height;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str5 = this.uploadImageAction;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, String> map = this.uploadImageActionParams;
            int a11 = c.a((hashCode8 + (map == null ? 0 : map.hashCode())) * 31, 31, this.id);
            String str6 = this.uuid;
            int hashCode9 = (this.mediaUri.hashCode() + g.a(g.a((a11 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.filename), 31, this.originalFilePath)) * 31;
            C c11 = this.mediaType;
            int hashCode10 = (this.status.hashCode() + ((hashCode9 + (c11 == null ? 0 : c11.hashCode())) * 31)) * 31;
            p<Integer> pVar = this.uploadingProgress;
            return Boolean.hashCode(this.isFallbackUploading) + ((hashCode10 + (pVar != null ? pVar.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        /* renamed from: isFallbackUploading, reason: from getter */
        public boolean getIsFallbackUploading() {
            return this.isFallbackUploading;
        }

        @NotNull
        public String toString() {
            ImageType imageType = this.type;
            String str = this.resizedFilePath;
            String str2 = this.url;
            String str3 = this.bucket;
            String str4 = this.key;
            Integer num = this.width;
            Integer num2 = this.height;
            String str5 = this.uploadImageAction;
            Map<String, String> map = this.uploadImageActionParams;
            long j11 = this.id;
            String str6 = this.uuid;
            String str7 = this.filename;
            String str8 = this.originalFilePath;
            Uri uri = this.mediaUri;
            C c11 = this.mediaType;
            Status status = this.status;
            p<Integer> pVar = this.uploadingProgress;
            boolean z11 = this.isFallbackUploading;
            StringBuilder sb2 = new StringBuilder("AttachedImageVO(type=");
            sb2.append(imageType);
            sb2.append(", resizedFilePath=");
            sb2.append(str);
            sb2.append(", url=");
            Nh.a.h(sb2, str2, ", bucket=", str3, ", key=");
            C2454a.f(num, str4, ", width=", ", height=", sb2);
            V.f(num2, ", uploadImageAction=", str5, ", uploadImageActionParams=", sb2);
            sb2.append(map);
            sb2.append(", id=");
            sb2.append(j11);
            Nh.a.h(sb2, ", uuid=", str6, ", filename=", str7);
            sb2.append(", originalFilePath=");
            sb2.append(str8);
            sb2.append(", mediaUri=");
            sb2.append(uri);
            sb2.append(", mediaType=");
            sb2.append(c11);
            sb2.append(", status=");
            sb2.append(status);
            sb2.append(", uploadingProgress=");
            sb2.append(pVar);
            sb2.append(", isFallbackUploading=");
            sb2.append(z11);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttachedImageVO(@NotNull ImageType type, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Map<String, String> map, long j11, String str6, @NotNull String filename, @NotNull String originalFilePath, @NotNull Uri mediaUri, C c11, @NotNull Status status, p<Integer> pVar, boolean z11) {
            super(j11, str6, filename, originalFilePath, mediaUri, c11, status, pVar, z11, null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(originalFilePath, "originalFilePath");
            Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
            Intrinsics.checkNotNullParameter(status, "status");
            this.type = type;
            this.resizedFilePath = str;
            this.url = str2;
            this.bucket = str3;
            this.key = str4;
            this.width = num;
            this.height = num2;
            this.uploadImageAction = str5;
            this.uploadImageActionParams = map;
            this.id = j11;
            this.uuid = str6;
            this.filename = filename;
            this.originalFilePath = originalFilePath;
            this.mediaUri = mediaUri;
            this.mediaType = c11;
            this.status = status;
            this.uploadingProgress = pVar;
            this.isFallbackUploading = z11;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J¦\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b/\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b0\u0010\u001dR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b\u0017\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "Landroid/graphics/Bitmap;", "thumbnail", "", "uploadId", "uploadAction", "uploadVideoType", "", "id", "uuid", "filename", "originalFilePath", "Landroid/net/Uri;", "mediaUri", "LWe/C;", "mediaType", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "status", "Lio/reactivex/p;", "", "uploadingProgress", "", "isFallbackUploading", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Lio/reactivex/p;Z)V", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;Lio/reactivex/p;Z)Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "getThumbnail", "()Landroid/graphics/Bitmap;", "Ljava/lang/String;", "getUploadId", "getUploadAction", "getUploadVideoType", "J", "getId", "()J", "getUuid", "getFilename", "getOriginalFilePath", "Landroid/net/Uri;", "getMediaUri", "()Landroid/net/Uri;", "setMediaUri", "(Landroid/net/Uri;)V", "LWe/C;", "getMediaType", "()LWe/C;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "getStatus", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "Lio/reactivex/p;", "getUploadingProgress", "()Lio/reactivex/p;", "Z", "()Z", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachedVideoVO extends AttachmentVO {

        @NotNull
        private final String filename;
        private final long id;
        private final boolean isFallbackUploading;
        private final C mediaType;

        @NotNull
        private Uri mediaUri;

        @NotNull
        private final String originalFilePath;

        @NotNull
        private final Status status;
        private final Bitmap thumbnail;
        private final String uploadAction;
        private final String uploadId;
        private final String uploadVideoType;
        private final p<Integer> uploadingProgress;
        private final String uuid;

        public /* synthetic */ AttachedVideoVO(Bitmap bitmap, String str, String str2, String str3, long j11, String str4, String str5, String str6, Uri uri, C c11, Status status, p pVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, j11, (i11 & 32) != 0 ? null : str4, str5, str6, uri, c11, status, (i11 & 2048) != 0 ? null : pVar, z11);
        }

        public static /* synthetic */ AttachedVideoVO copy$default(AttachedVideoVO attachedVideoVO, Bitmap bitmap, String str, String str2, String str3, long j11, String str4, String str5, String str6, Uri uri, C c11, Status status, p pVar, boolean z11, int i11, Object obj) {
            return attachedVideoVO.copy((i11 & 1) != 0 ? attachedVideoVO.thumbnail : bitmap, (i11 & 2) != 0 ? attachedVideoVO.uploadId : str, (i11 & 4) != 0 ? attachedVideoVO.uploadAction : str2, (i11 & 8) != 0 ? attachedVideoVO.uploadVideoType : str3, (i11 & 16) != 0 ? attachedVideoVO.id : j11, (i11 & 32) != 0 ? attachedVideoVO.uuid : str4, (i11 & 64) != 0 ? attachedVideoVO.filename : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? attachedVideoVO.originalFilePath : str6, (i11 & 256) != 0 ? attachedVideoVO.mediaUri : uri, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? attachedVideoVO.mediaType : c11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? attachedVideoVO.status : status, (i11 & 2048) != 0 ? attachedVideoVO.uploadingProgress : pVar, (i11 & 4096) != 0 ? attachedVideoVO.isFallbackUploading : z11);
        }

        @NotNull
        public final AttachedVideoVO copy(Bitmap thumbnail, String uploadId, String uploadAction, String uploadVideoType, long id2, String uuid, @NotNull String filename, @NotNull String originalFilePath, @NotNull Uri mediaUri, C mediaType, @NotNull Status status, p<Integer> uploadingProgress, boolean isFallbackUploading) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(originalFilePath, "originalFilePath");
            Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
            Intrinsics.checkNotNullParameter(status, "status");
            return new AttachedVideoVO(thumbnail, uploadId, uploadAction, uploadVideoType, id2, uuid, filename, originalFilePath, mediaUri, mediaType, status, uploadingProgress, isFallbackUploading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachedVideoVO)) {
                return false;
            }
            AttachedVideoVO attachedVideoVO = (AttachedVideoVO) other;
            return Intrinsics.d(this.thumbnail, attachedVideoVO.thumbnail) && Intrinsics.d(this.uploadId, attachedVideoVO.uploadId) && Intrinsics.d(this.uploadAction, attachedVideoVO.uploadAction) && Intrinsics.d(this.uploadVideoType, attachedVideoVO.uploadVideoType) && this.id == attachedVideoVO.id && Intrinsics.d(this.uuid, attachedVideoVO.uuid) && Intrinsics.d(this.filename, attachedVideoVO.filename) && Intrinsics.d(this.originalFilePath, attachedVideoVO.originalFilePath) && Intrinsics.d(this.mediaUri, attachedVideoVO.mediaUri) && Intrinsics.d(this.mediaType, attachedVideoVO.mediaType) && Intrinsics.d(this.status, attachedVideoVO.status) && Intrinsics.d(this.uploadingProgress, attachedVideoVO.uploadingProgress) && this.isFallbackUploading == attachedVideoVO.isFallbackUploading;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        public long getId() {
            return this.id;
        }

        public C getMediaType() {
            return this.mediaType;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        @NotNull
        public Uri getMediaUri() {
            return this.mediaUri;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        @NotNull
        public Status getStatus() {
            return this.status;
        }

        public final String getUploadAction() {
            return this.uploadAction;
        }

        public final String getUploadId() {
            return this.uploadId;
        }

        public final String getUploadVideoType() {
            return this.uploadVideoType;
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        public p<Integer> getUploadingProgress() {
            return this.uploadingProgress;
        }

        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            Bitmap bitmap = this.thumbnail;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            String str = this.uploadId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.uploadAction;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uploadVideoType;
            int a11 = c.a((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.id);
            String str4 = this.uuid;
            int hashCode4 = (this.mediaUri.hashCode() + g.a(g.a((a11 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.filename), 31, this.originalFilePath)) * 31;
            C c11 = this.mediaType;
            int hashCode5 = (this.status.hashCode() + ((hashCode4 + (c11 == null ? 0 : c11.hashCode())) * 31)) * 31;
            p<Integer> pVar = this.uploadingProgress;
            return Boolean.hashCode(this.isFallbackUploading) + ((hashCode5 + (pVar != null ? pVar.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO
        /* renamed from: isFallbackUploading, reason: from getter */
        public boolean getIsFallbackUploading() {
            return this.isFallbackUploading;
        }

        @NotNull
        public String toString() {
            Bitmap bitmap = this.thumbnail;
            String str = this.uploadId;
            String str2 = this.uploadAction;
            String str3 = this.uploadVideoType;
            long j11 = this.id;
            String str4 = this.uuid;
            String str5 = this.filename;
            String str6 = this.originalFilePath;
            Uri uri = this.mediaUri;
            C c11 = this.mediaType;
            Status status = this.status;
            p<Integer> pVar = this.uploadingProgress;
            boolean z11 = this.isFallbackUploading;
            StringBuilder sb2 = new StringBuilder("AttachedVideoVO(thumbnail=");
            sb2.append(bitmap);
            sb2.append(", uploadId=");
            sb2.append(str);
            sb2.append(", uploadAction=");
            Nh.a.h(sb2, str2, ", uploadVideoType=", str3, ", id=");
            sb2.append(j11);
            sb2.append(", uuid=");
            sb2.append(str4);
            Nh.a.h(sb2, ", filename=", str5, ", originalFilePath=", str6);
            sb2.append(", mediaUri=");
            sb2.append(uri);
            sb2.append(", mediaType=");
            sb2.append(c11);
            sb2.append(", status=");
            sb2.append(status);
            sb2.append(", uploadingProgress=");
            sb2.append(pVar);
            return Bi.b.f(sb2, ", isFallbackUploading=", z11, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttachedVideoVO(Bitmap bitmap, String str, String str2, String str3, long j11, String str4, @NotNull String filename, @NotNull String originalFilePath, @NotNull Uri mediaUri, C c11, @NotNull Status status, p<Integer> pVar, boolean z11) {
            super(j11, str4, filename, originalFilePath, mediaUri, c11, status, pVar, z11, null);
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(originalFilePath, "originalFilePath");
            Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
            Intrinsics.checkNotNullParameter(status, "status");
            this.thumbnail = bitmap;
            this.uploadId = str;
            this.uploadAction = str2;
            this.uploadVideoType = str3;
            this.id = j11;
            this.uuid = str4;
            this.filename = filename;
            this.originalFilePath = originalFilePath;
            this.mediaUri = mediaUri;
            this.mediaType = c11;
            this.status = status;
            this.uploadingProgress = pVar;
            this.isFallbackUploading = z11;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "", "", "isShowRemover", "()Z", "isShowLoader", "isShowRetry", "RESIZING", "UPLOADING", "UPLOADED", "RESIZING_ERROR", "UPLOADING_ERROR", "ONLY_SHOW", "VALIDATION_ERROR", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$ONLY_SHOW;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$RESIZING;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$RESIZING_ERROR;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADED;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADING;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADING_ERROR;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$VALIDATION_ERROR;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Status {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$ONLY_SHOW;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ONLY_SHOW implements Status {

            @NotNull
            public static final ONLY_SHOW INSTANCE = new ONLY_SHOW();
            private static final boolean isShowLoader = false;
            private static final boolean isShowRemover = false;
            private static final boolean isShowRetry = false;

            private ONLY_SHOW() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ONLY_SHOW);
            }

            public int hashCode() {
                return -801435494;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "ONLY_SHOW";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$RESIZING;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowOverlay", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RESIZING implements Status {
            private static final boolean isShowRemover = false;
            private static final boolean isShowRetry = false;

            @NotNull
            public static final RESIZING INSTANCE = new RESIZING();
            private static final boolean isShowOverlay = true;
            private static final boolean isShowLoader = true;

            private RESIZING() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RESIZING);
            }

            public int hashCode() {
                return -798370233;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "RESIZING";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$RESIZING_ERROR;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowOverlay", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RESIZING_ERROR implements Status {
            private static final boolean isShowLoader = false;
            private static final boolean isShowRemover = false;

            @NotNull
            public static final RESIZING_ERROR INSTANCE = new RESIZING_ERROR();
            private static final boolean isShowOverlay = true;
            private static final boolean isShowRetry = true;

            private RESIZING_ERROR() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RESIZING_ERROR);
            }

            public int hashCode() {
                return -451214864;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "RESIZING_ERROR";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADED;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UPLOADED implements Status {
            private static final boolean isShowLoader = false;
            private static final boolean isShowRetry = false;

            @NotNull
            public static final UPLOADED INSTANCE = new UPLOADED();
            private static final boolean isShowRemover = true;

            private UPLOADED() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UPLOADED);
            }

            public int hashCode() {
                return 1112086582;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "UPLOADED";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADING;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowOverlay", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UPLOADING implements Status {
            private static final boolean isShowRemover = false;
            private static final boolean isShowRetry = false;

            @NotNull
            public static final UPLOADING INSTANCE = new UPLOADING();
            private static final boolean isShowOverlay = true;
            private static final boolean isShowLoader = true;

            private UPLOADING() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UPLOADING);
            }

            public int hashCode() {
                return 114949899;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "UPLOADING";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$UPLOADING_ERROR;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isShowRemover", "Z", "()Z", "isShowOverlay", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UPLOADING_ERROR implements Status {
            private static final boolean isShowLoader = false;

            @NotNull
            public static final UPLOADING_ERROR INSTANCE = new UPLOADING_ERROR();
            private static final boolean isShowRemover = true;
            private static final boolean isShowOverlay = true;
            private static final boolean isShowRetry = true;

            private UPLOADING_ERROR() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UPLOADING_ERROR);
            }

            public int hashCode() {
                return 17991604;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader */
            public boolean getIsShowLoader() {
                return isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover */
            public boolean getIsShowRemover() {
                return isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry */
            public boolean getIsShowRetry() {
                return isShowRetry;
            }

            @NotNull
            public String toString() {
                return "UPLOADING_ERROR";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status$VALIDATION_ERROR;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "", "errorMsg", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMsg", "isShowRemover", "Z", "()Z", "isShowOverlay", "isShowLoader", "isShowRetry", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VALIDATION_ERROR implements Status {
            private final String errorMsg;
            private final boolean isShowLoader;
            private final boolean isShowRemover;
            private final boolean isShowOverlay = true;
            private final boolean isShowRetry = true;

            public VALIDATION_ERROR(String str) {
                this.errorMsg = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VALIDATION_ERROR) && Intrinsics.d(this.errorMsg, ((VALIDATION_ERROR) other).errorMsg);
            }

            public final String getErrorMsg() {
                return this.errorMsg;
            }

            public int hashCode() {
                String str = this.errorMsg;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowLoader, reason: from getter */
            public boolean getIsShowLoader() {
                return this.isShowLoader;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRemover, reason: from getter */
            public boolean getIsShowRemover() {
                return this.isShowRemover;
            }

            @Override // ru.ozon.app.android.mediaupload.attachments.AttachmentVO.Status
            /* renamed from: isShowRetry, reason: from getter */
            public boolean getIsShowRetry() {
                return this.isShowRetry;
            }

            @NotNull
            public String toString() {
                return A0.b("VALIDATION_ERROR(errorMsg=", this.errorMsg, ")");
            }
        }

        /* renamed from: isShowLoader */
        boolean getIsShowLoader();

        /* renamed from: isShowRemover */
        boolean getIsShowRemover();

        /* renamed from: isShowRetry */
        boolean getIsShowRetry();
    }

    public /* synthetic */ AttachmentVO(long j11, String str, String str2, String str3, Uri uri, C c11, Status status, p pVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, str3, uri, c11, status, pVar, z11);
    }

    @NotNull
    public final AttachmentVO copyWith(@NotNull Uri mediaUri, @NotNull Status status, boolean isFallbackUploading) {
        Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
        Intrinsics.checkNotNullParameter(status, "status");
        if (this instanceof AttachedVideoVO) {
            return AttachedVideoVO.copy$default((AttachedVideoVO) this, null, null, null, null, 0L, null, null, null, mediaUri, null, status, null, isFallbackUploading, 2815, null);
        }
        if (this instanceof AttachedImageVO) {
            return AttachedImageVO.copy$default((AttachedImageVO) this, null, null, null, null, null, null, null, null, null, 0L, null, null, null, mediaUri, null, status, null, isFallbackUploading, 90111, null);
        }
        throw new o();
    }

    public long getId() {
        return this.id;
    }

    @NotNull
    public Uri getMediaUri() {
        return this.mediaUri;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public p<Integer> getUploadingProgress() {
        return this.uploadingProgress;
    }

    /* renamed from: isFallbackUploading, reason: from getter */
    public boolean getIsFallbackUploading() {
        return this.isFallbackUploading;
    }

    private AttachmentVO(long j11, String str, String str2, String str3, Uri uri, C c11, Status status, p<Integer> pVar, boolean z11) {
        this.id = j11;
        this.uuid = str;
        this.filename = str2;
        this.originalFilePath = str3;
        this.mediaUri = uri;
        this.mediaType = c11;
        this.status = status;
        this.uploadingProgress = pVar;
        this.isFallbackUploading = z11;
    }
}
