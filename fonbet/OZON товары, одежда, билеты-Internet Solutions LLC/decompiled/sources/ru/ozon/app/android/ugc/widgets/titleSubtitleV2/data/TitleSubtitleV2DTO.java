package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.data;

import D3.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "alignment", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAlignment", "()Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Alignment", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TitleSubtitleV2DTO {
    public static final int $stable = 0;

    @NotNull
    private final Alignment alignment;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "START", "INVALID", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment CENTER = new Alignment("CENTER", 0);
        public static final Alignment START = new Alignment("START", 1);
        public static final Alignment INVALID = new Alignment("INVALID", 2);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{CENTER, START, INVALID};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public TitleSubtitleV2DTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.title = title;
        this.subtitle = textDTO;
        this.alignment = alignment;
    }

    public static /* synthetic */ TitleSubtitleV2DTO copy$default(TitleSubtitleV2DTO titleSubtitleV2DTO, TextDTO textDTO, TextDTO textDTO2, Alignment alignment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = titleSubtitleV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = titleSubtitleV2DTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            alignment = titleSubtitleV2DTO.alignment;
        }
        return titleSubtitleV2DTO.copy(textDTO, textDTO2, alignment);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TitleSubtitleV2DTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new TitleSubtitleV2DTO(title, subtitle, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleSubtitleV2DTO)) {
            return false;
        }
        TitleSubtitleV2DTO titleSubtitleV2DTO = (TitleSubtitleV2DTO) other;
        return Intrinsics.d(this.title, titleSubtitleV2DTO.title) && Intrinsics.d(this.subtitle, titleSubtitleV2DTO.subtitle) && this.alignment == titleSubtitleV2DTO.alignment;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        return this.alignment.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Alignment alignment = this.alignment;
        StringBuilder g10 = g.g("TitleSubtitleV2DTO(title=", textDTO, ", subtitle=", textDTO2, ", alignment=");
        g10.append(alignment);
        g10.append(")");
        return g10.toString();
    }
}
