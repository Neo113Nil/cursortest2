package ru.ozon.app.android.returns.actionModal.viewMapper.update;

import A00.a;
import An.C2439a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/actionModal/viewMapper/update/PhotoUrlsUpdated;", "", "", "key", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "newAttachment", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Ljava/util/List;", "getNewAttachment", "()Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotoUrlsUpdated implements a.J.InterfaceC0007a {

    @NotNull
    private final String key;
    private final List<AttachmentVO.AttachedImageVO> newAttachment;

    public PhotoUrlsUpdated(@NotNull String key, List<AttachmentVO.AttachedImageVO> list) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.newAttachment = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoUrlsUpdated)) {
            return false;
        }
        PhotoUrlsUpdated photoUrlsUpdated = (PhotoUrlsUpdated) other;
        return Intrinsics.d(this.key, photoUrlsUpdated.key) && Intrinsics.d(this.newAttachment, photoUrlsUpdated.newAttachment);
    }

    public final List<AttachmentVO.AttachedImageVO> getNewAttachment() {
        return this.newAttachment;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        List<AttachmentVO.AttachedImageVO> list = this.newAttachment;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2439a.a("PhotoUrlsUpdated(key=", this.key, ", newAttachment=", ")", this.newAttachment);
    }
}
