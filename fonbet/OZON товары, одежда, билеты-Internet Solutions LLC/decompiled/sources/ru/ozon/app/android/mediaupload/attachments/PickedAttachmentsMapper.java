package ru.ozon.app.android.mediaupload.attachments;

import Hi.l;
import Sc.o;
import We.C;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "imageType", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;)V", "", "path", "getNameFromFilePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "map", "(Ljava/lang/String;)Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "LHi/l;", "attachment", "(LHi/l;)Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO$ImageType;", "Companion", "ReviewAttachmentsMapper", "ProductAttachmentsMapper", "ReturnAttachmentsMapper", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ProductAttachmentsMapper;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReturnAttachmentsMapper;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReviewAttachmentsMapper;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PickedAttachmentsMapper {

    @NotNull
    private final AttachmentVO.AttachedImageVO.ImageType imageType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ProductAttachmentsMapper;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "<init>", "()V", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductAttachmentsMapper extends PickedAttachmentsMapper {
        public ProductAttachmentsMapper() {
            super(AttachmentVO.AttachedImageVO.ImageType.PRODUCT, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReturnAttachmentsMapper;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "<init>", "()V", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReturnAttachmentsMapper extends PickedAttachmentsMapper {
        public ReturnAttachmentsMapper() {
            super(AttachmentVO.AttachedImageVO.ImageType.RETURN, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReviewAttachmentsMapper;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "<init>", "()V", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReviewAttachmentsMapper extends PickedAttachmentsMapper {
        public ReviewAttachmentsMapper() {
            super(AttachmentVO.AttachedImageVO.ImageType.REVIEW, null);
        }
    }

    public /* synthetic */ PickedAttachmentsMapper(AttachmentVO.AttachedImageVO.ImageType imageType, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageType);
    }

    private final String getNameFromFilePath(String path) {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        if (!h.t(path, separator, false)) {
            return path;
        }
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        String substring = path.substring(h.f(path, separator, 0, 6) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final AttachmentVO map(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.j0('.', getNameFromFilePath(path), ""));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        long generateViewId = View.generateViewId();
        AttachmentVO.AttachedImageVO.ImageType imageType = this.imageType;
        Uri fromFile = Uri.fromFile(new File(path));
        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(...)");
        C.f33536g.getClass();
        return new AttachmentVO.AttachedImageVO(imageType, null, null, null, null, null, null, null, null, generateViewId, null, path, path, fromFile, C.a.b(mimeTypeFromExtension), AttachmentVO.Status.RESIZING.INSTANCE, null, false, 67064, null);
    }

    private PickedAttachmentsMapper(AttachmentVO.AttachedImageVO.ImageType imageType) {
        this.imageType = imageType;
    }

    @NotNull
    public final AttachmentVO map(@NotNull l attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        if (attachment instanceof l.b) {
            l.b bVar = (l.b) attachment;
            long id2 = bVar.getId();
            String a11 = bVar.a();
            return new AttachmentVO.AttachedVideoVO(null, null, null, null, id2, null, a11 == null ? "" : a11, "", bVar.getUri(), bVar.b(), AttachmentVO.Status.UPLOADING.INSTANCE, null, false, 2095, null);
        }
        if (attachment instanceof l.a) {
            l.a aVar = (l.a) attachment;
            long id3 = aVar.getId();
            AttachmentVO.AttachedImageVO.ImageType imageType = this.imageType;
            String a12 = aVar.a();
            return new AttachmentVO.AttachedImageVO(imageType, null, null, null, null, null, null, null, null, id3, null, a12 == null ? "" : a12, "", aVar.getUri(), aVar.b(), AttachmentVO.Status.RESIZING.INSTANCE, null, false, 67064, null);
        }
        throw new o();
    }
}
