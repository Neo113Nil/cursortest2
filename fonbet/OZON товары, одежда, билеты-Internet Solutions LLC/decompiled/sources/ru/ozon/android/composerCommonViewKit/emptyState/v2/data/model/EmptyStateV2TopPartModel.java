package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model;

import B0.C2454a;
import D3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2TopPartModel;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "imageTopMargin", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "size", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;ILru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "I", "getImageTopMargin", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "getSize", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "Ljava/lang/String;", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2TopPartModel {
    private final String backgroundColor;
    private final ImageDTO image;
    private final int imageTopMargin;
    private final TextDTO message;
    private final EmptyStateV2DTO.EmptyStateSize size;
    private final TextDTO title;

    public EmptyStateV2TopPartModel(TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, int i11, EmptyStateV2DTO.EmptyStateSize emptyStateSize, String str) {
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
        if (!(other instanceof EmptyStateV2TopPartModel)) {
            return false;
        }
        EmptyStateV2TopPartModel emptyStateV2TopPartModel = (EmptyStateV2TopPartModel) other;
        return Intrinsics.d(this.message, emptyStateV2TopPartModel.message) && Intrinsics.d(this.title, emptyStateV2TopPartModel.title) && Intrinsics.d(this.image, emptyStateV2TopPartModel.image) && this.imageTopMargin == emptyStateV2TopPartModel.imageTopMargin && this.size == emptyStateV2TopPartModel.size && Intrinsics.d(this.backgroundColor, emptyStateV2TopPartModel.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
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

    public final EmptyStateV2DTO.EmptyStateSize getSize() {
        return this.size;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.message;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.title;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = C2454a.a(this.imageTopMargin, (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = this.size;
        int hashCode3 = (a11 + (emptyStateSize == null ? 0 : emptyStateSize.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.message;
        TextDTO textDTO2 = this.title;
        ImageDTO imageDTO = this.image;
        int i11 = this.imageTopMargin;
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = this.size;
        String str = this.backgroundColor;
        StringBuilder g10 = g.g("EmptyStateV2TopPartModel(message=", textDTO, ", title=", textDTO2, ", image=");
        g10.append(imageDTO);
        g10.append(", imageTopMargin=");
        g10.append(i11);
        g10.append(", size=");
        g10.append(emptyStateSize);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(")");
        return g10.toString();
    }
}
