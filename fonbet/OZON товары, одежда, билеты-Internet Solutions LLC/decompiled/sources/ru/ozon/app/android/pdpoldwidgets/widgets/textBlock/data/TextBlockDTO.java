package ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/data/TextBlockDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "tabGroupId", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTabGroupId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextBlockDTO {
    private final String tabGroupId;

    @NotNull
    private final TextAtom text;

    public TextBlockDTO(@NotNull TextAtom text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.tabGroupId = str;
    }

    public static /* synthetic */ TextBlockDTO copy$default(TextBlockDTO textBlockDTO, TextAtom textAtom, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = textBlockDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = textBlockDTO.tabGroupId;
        }
        return textBlockDTO.copy(textAtom, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextBlockDTO copy(@NotNull TextAtom text, String tabGroupId) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextBlockDTO(text, tabGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockDTO)) {
            return false;
        }
        TextBlockDTO textBlockDTO = (TextBlockDTO) other;
        return Intrinsics.d(this.text, textBlockDTO.text) && Intrinsics.d(this.tabGroupId, textBlockDTO.tabGroupId);
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.tabGroupId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "TextBlockDTO(text=" + this.text + ", tabGroupId=" + this.tabGroupId + ")";
    }
}
