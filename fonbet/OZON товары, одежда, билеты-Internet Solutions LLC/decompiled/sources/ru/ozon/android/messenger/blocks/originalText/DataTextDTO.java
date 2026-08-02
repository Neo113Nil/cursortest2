package ru.ozon.android.messenger.blocks.originalText;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/blocks/originalText/DataTextDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DataTextDTO {
    public static final int $stable = 0;
    private final TextDTO text;

    public DataTextDTO(TextDTO textDTO) {
        this.text = textDTO;
    }

    public static /* synthetic */ DataTextDTO copy$default(DataTextDTO dataTextDTO, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = dataTextDTO.text;
        }
        return dataTextDTO.copy(textDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final DataTextDTO copy(TextDTO text) {
        return new DataTextDTO(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DataTextDTO) && Intrinsics.d(this.text, ((DataTextDTO) other).text);
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        TextDTO textDTO = this.text;
        if (textDTO == null) {
            return 0;
        }
        return textDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return "DataTextDTO(text=" + this.text + ")";
    }
}
