package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import B0.C2454a;
import TY.a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u0012¨\u0006+"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "imageTopMargin", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "size", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;ILru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "I", "getImageTopMargin", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "getSize", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "Ljava/lang/String;", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2TopPartVO implements c {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final long id;
    private final ImageDTO image;
    private final int imageTopMargin;
    private final TextDTO message;
    private final EmptyStateV2DTO.EmptyStateSize size;
    private final TextDTO title;

    public EmptyStateV2TopPartVO(long j11, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, int i11, EmptyStateV2DTO.EmptyStateSize emptyStateSize, String str) {
        this.id = j11;
        this.message = textDTO;
        this.title = textDTO2;
        this.image = imageDTO;
        this.imageTopMargin = i11;
        this.size = emptyStateSize;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2TopPartVO)) {
            return false;
        }
        EmptyStateV2TopPartVO emptyStateV2TopPartVO = (EmptyStateV2TopPartVO) other;
        return this.id == emptyStateV2TopPartVO.id && Intrinsics.d(this.message, emptyStateV2TopPartVO.message) && Intrinsics.d(this.title, emptyStateV2TopPartVO.title) && Intrinsics.d(this.image, emptyStateV2TopPartVO.image) && this.imageTopMargin == emptyStateV2TopPartVO.imageTopMargin && this.size == emptyStateV2TopPartVO.size && Intrinsics.d(this.backgroundColor, emptyStateV2TopPartVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final int getImageTopMargin() {
        return this.imageTopMargin;
    }

    public final TextDTO getMessage() {
        return this.message;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.message;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.title;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = C2454a.a(this.imageTopMargin, (hashCode3 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = this.size;
        int hashCode4 = (a11 + (emptyStateSize == null ? 0 : emptyStateSize.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.message;
        TextDTO textDTO2 = this.title;
        ImageDTO imageDTO = this.image;
        int i11 = this.imageTopMargin;
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = this.size;
        String str = this.backgroundColor;
        StringBuilder b11 = a.b("EmptyStateV2TopPartVO(id=", j11, ", message=", textDTO);
        b11.append(", title=");
        b11.append(textDTO2);
        b11.append(", image=");
        b11.append(imageDTO);
        b11.append(", imageTopMargin=");
        b11.append(i11);
        b11.append(", size=");
        b11.append(emptyStateSize);
        return C6594f.a(", backgroundColor=", str, ")", b11);
    }
}
