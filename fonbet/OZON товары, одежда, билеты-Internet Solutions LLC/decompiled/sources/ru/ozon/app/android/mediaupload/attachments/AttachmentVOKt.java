package ru.ozon.app.android.mediaupload.attachments;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "videos", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "images", "mediaupload_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AttachmentVOKt {
    @NotNull
    public static final List<AttachmentVO.AttachedImageVO> images(@NotNull List<? extends AttachmentVO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AttachmentVO.AttachedImageVO) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<AttachmentVO.AttachedVideoVO> videos(@NotNull List<? extends AttachmentVO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AttachmentVO.AttachedVideoVO) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
