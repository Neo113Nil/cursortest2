package ru.ozon.app.android.cabinet.sectionheader;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getTitle", "()Ljava/lang/String;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SectionHeaderDTO {
    private final Badge badge;

    @NotNull
    private final String title;

    public SectionHeaderDTO(@NotNull String title, Badge badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.badge = badge;
    }

    public static /* synthetic */ SectionHeaderDTO copy$default(SectionHeaderDTO sectionHeaderDTO, String str, Badge badge, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sectionHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            badge = sectionHeaderDTO.badge;
        }
        return sectionHeaderDTO.copy(str, badge);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final SectionHeaderDTO copy(@NotNull String title, Badge badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SectionHeaderDTO(title, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionHeaderDTO)) {
            return false;
        }
        SectionHeaderDTO sectionHeaderDTO = (SectionHeaderDTO) other;
        return Intrinsics.d(this.title, sectionHeaderDTO.title) && Intrinsics.d(this.badge, sectionHeaderDTO.badge);
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Badge badge = this.badge;
        return hashCode + (badge == null ? 0 : badge.hashCode());
    }

    @NotNull
    public String toString() {
        return "SectionHeaderDTO(title=" + this.title + ", badge=" + this.badge + ")";
    }
}
