package ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation;

import Ak.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "images", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ImagesVO {
    public static final int $stable = 8;
    private final CommonControlSettings common;

    @NotNull
    private final List<ImageVO> images;
    private final TextDTO title;

    public ImagesVO(@NotNull List<ImageVO> images, TextDTO textDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
        this.title = textDTO;
        this.common = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesVO)) {
            return false;
        }
        ImagesVO imagesVO = (ImagesVO) other;
        return Intrinsics.d(this.images, imagesVO.images) && Intrinsics.d(this.title, imagesVO.title) && Intrinsics.d(this.common, imagesVO.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final List<ImageVO> getImages() {
        return this.images;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ImageVO> list = this.images;
        TextDTO textDTO = this.title;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("ImagesVO(images=");
        sb2.append(list);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", common=");
        return b.g(sb2, commonControlSettings, ")");
    }

    public /* synthetic */ ImagesVO(List list, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, textDTO, (i11 & 4) != 0 ? null : commonControlSettings);
    }
}
