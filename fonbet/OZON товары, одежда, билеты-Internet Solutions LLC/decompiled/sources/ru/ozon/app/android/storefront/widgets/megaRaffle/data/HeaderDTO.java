package ru.ozon.app.android.storefront.widgets.megaRaffle.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderSubtitleDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderSubtitleDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderSubtitleDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HeaderDTO {
    public static final int $stable = TextAtom.$stable;
    private final HeaderSubtitleDTO subtitle;

    @NotNull
    private final TextAtom title;

    public HeaderDTO(@NotNull TextAtom title, HeaderSubtitleDTO headerSubtitleDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = headerSubtitleDTO;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextAtom textAtom, HeaderSubtitleDTO headerSubtitleDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = headerDTO.title;
        }
        if ((i11 & 2) != 0) {
            headerSubtitleDTO = headerDTO.subtitle;
        }
        return headerDTO.copy(textAtom, headerSubtitleDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderSubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull TextAtom title, HeaderSubtitleDTO subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderDTO(title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDTO)) {
            return false;
        }
        HeaderDTO headerDTO = (HeaderDTO) other;
        return Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle);
    }

    public final HeaderSubtitleDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        HeaderSubtitleDTO headerSubtitleDTO = this.subtitle;
        return hashCode + (headerSubtitleDTO == null ? 0 : headerSubtitleDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "HeaderDTO(title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }
}
