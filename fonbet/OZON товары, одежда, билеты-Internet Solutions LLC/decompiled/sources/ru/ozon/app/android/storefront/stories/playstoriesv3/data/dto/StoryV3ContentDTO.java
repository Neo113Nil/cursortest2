package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3ContentDTO;", "", "align", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getAlign", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3ContentDTO {
    public static final int $stable = 0;

    @NotNull
    private final Alignment align;
    private final BadgeDTO badge;
    private final TextDTO subtitle;
    private final TextDTO title;

    public StoryV3ContentDTO(@NotNull Alignment align, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(align, "align");
        this.align = align;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ StoryV3ContentDTO copy$default(StoryV3ContentDTO storyV3ContentDTO, Alignment alignment, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alignment = storyV3ContentDTO.align;
        }
        if ((i11 & 2) != 0) {
            textDTO = storyV3ContentDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = storyV3ContentDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = storyV3ContentDTO.badge;
        }
        return storyV3ContentDTO.copy(alignment, textDTO, textDTO2, badgeDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Alignment getAlign() {
        return this.align;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final StoryV3ContentDTO copy(@NotNull Alignment align, TextDTO title, TextDTO subtitle, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(align, "align");
        return new StoryV3ContentDTO(align, title, subtitle, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3ContentDTO)) {
            return false;
        }
        StoryV3ContentDTO storyV3ContentDTO = (StoryV3ContentDTO) other;
        return this.align == storyV3ContentDTO.align && Intrinsics.d(this.title, storyV3ContentDTO.title) && Intrinsics.d(this.subtitle, storyV3ContentDTO.subtitle) && Intrinsics.d(this.badge, storyV3ContentDTO.badge);
    }

    @NotNull
    public final Alignment getAlign() {
        return this.align;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.align.hashCode() * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoryV3ContentDTO(align=" + this.align + ", title=" + this.title + ", subtitle=" + this.subtitle + ", badge=" + this.badge + ")";
    }
}
