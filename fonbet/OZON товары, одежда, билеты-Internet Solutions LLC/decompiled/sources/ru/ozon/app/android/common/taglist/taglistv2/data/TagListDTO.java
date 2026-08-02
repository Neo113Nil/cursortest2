package ru.ozon.app.android.common.taglist.taglistv2.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.TagListViewType;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "", "tags", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "view", "Lru/ozon/app/android/common/taglist/TagListViewType;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/common/taglist/TagListViewType;)V", "getTags", "()Ljava/util/List;", "getView", "()Lru/ozon/app/android/common/taglist/TagListViewType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TagListDTO {

    @NotNull
    private final List<TagV3Atom.TagAtom> tags;
    private final TagListViewType view;

    public TagListDTO(@NotNull List<TagV3Atom.TagAtom> tags, TagListViewType tagListViewType) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.tags = tags;
        this.view = tagListViewType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagListDTO copy$default(TagListDTO tagListDTO, List list, TagListViewType tagListViewType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tagListDTO.tags;
        }
        if ((i11 & 2) != 0) {
            tagListViewType = tagListDTO.view;
        }
        return tagListDTO.copy(list, tagListViewType);
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> component1() {
        return this.tags;
    }

    /* renamed from: component2, reason: from getter */
    public final TagListViewType getView() {
        return this.view;
    }

    @NotNull
    public final TagListDTO copy(@NotNull List<TagV3Atom.TagAtom> tags, TagListViewType view) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new TagListDTO(tags, view);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagListDTO)) {
            return false;
        }
        TagListDTO tagListDTO = (TagListDTO) other;
        return Intrinsics.d(this.tags, tagListDTO.tags) && this.view == tagListDTO.view;
    }

    @NotNull
    public final List<TagV3Atom.TagAtom> getTags() {
        return this.tags;
    }

    public final TagListViewType getView() {
        return this.view;
    }

    public int hashCode() {
        int hashCode = this.tags.hashCode() * 31;
        TagListViewType tagListViewType = this.view;
        return hashCode + (tagListViewType == null ? 0 : tagListViewType.hashCode());
    }

    @NotNull
    public String toString() {
        return "TagListDTO(tags=" + this.tags + ", view=" + this.view + ")";
    }

    public /* synthetic */ TagListDTO(List list, TagListViewType tagListViewType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? TagListViewType.VIEW_TYPE_SCROLL : tagListViewType);
    }
}
