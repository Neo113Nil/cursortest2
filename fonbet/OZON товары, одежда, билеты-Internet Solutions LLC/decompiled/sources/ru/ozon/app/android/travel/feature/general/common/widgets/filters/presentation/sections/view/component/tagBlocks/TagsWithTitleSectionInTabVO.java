package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks;

import B90.C2618u;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tags", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagsWithTitleSectionInTabVO {
    private final int id;

    @NotNull
    private final List<TagButtonDTO> tags;
    private final TextDTO title;

    public TagsWithTitleSectionInTabVO(int i11, TextDTO textDTO, @NotNull List<TagButtonDTO> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = i11;
        this.title = textDTO;
        this.tags = tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagsWithTitleSectionInTabVO)) {
            return false;
        }
        TagsWithTitleSectionInTabVO tagsWithTitleSectionInTabVO = (TagsWithTitleSectionInTabVO) other;
        return this.id == tagsWithTitleSectionInTabVO.id && Intrinsics.d(this.title, tagsWithTitleSectionInTabVO.title) && Intrinsics.d(this.tags, tagsWithTitleSectionInTabVO.tags);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<TagButtonDTO> getTags() {
        return this.tags;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        return this.tags.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextDTO textDTO = this.title;
        return C2618u.h(C4055a.b(textDTO, "TagsWithTitleSectionInTabVO(id=", ", title=", ", tags=", i11), this.tags, ")");
    }
}
