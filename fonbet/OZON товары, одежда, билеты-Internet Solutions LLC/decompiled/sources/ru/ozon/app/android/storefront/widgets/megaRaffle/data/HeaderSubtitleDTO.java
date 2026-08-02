package ru.ozon.app.android.storefront.widgets.megaRaffle.data;

import Co.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderSubtitleDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "counterText", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCounterText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HeaderSubtitleDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextAtom counterText;

    @NotNull
    private final TextAtom text;

    public HeaderSubtitleDTO(@NotNull TextAtom text, @NotNull TextAtom counterText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(counterText, "counterText");
        this.text = text;
        this.counterText = counterText;
    }

    public static /* synthetic */ HeaderSubtitleDTO copy$default(HeaderSubtitleDTO headerSubtitleDTO, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = headerSubtitleDTO.text;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = headerSubtitleDTO.counterText;
        }
        return headerSubtitleDTO.copy(textAtom, textAtom2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getCounterText() {
        return this.counterText;
    }

    @NotNull
    public final HeaderSubtitleDTO copy(@NotNull TextAtom text, @NotNull TextAtom counterText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(counterText, "counterText");
        return new HeaderSubtitleDTO(text, counterText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderSubtitleDTO)) {
            return false;
        }
        HeaderSubtitleDTO headerSubtitleDTO = (HeaderSubtitleDTO) other;
        return Intrinsics.d(this.text, headerSubtitleDTO.text) && Intrinsics.d(this.counterText, headerSubtitleDTO.counterText);
    }

    @NotNull
    public final TextAtom getCounterText() {
        return this.counterText;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        return this.counterText.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.a("HeaderSubtitleDTO(text=", this.text, ", counterText=", this.counterText, ")");
    }
}
