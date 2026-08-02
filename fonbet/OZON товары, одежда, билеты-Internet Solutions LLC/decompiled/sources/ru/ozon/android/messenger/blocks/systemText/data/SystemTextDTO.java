package ru.ozon.android.messenger.blocks.systemText.data;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/systemText/data/SystemTextDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "hasTopSeparator", "", "hasBottomSeparator", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHasTopSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasBottomSeparator", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/android/messenger/blocks/systemText/data/SystemTextDTO;", "equals", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SystemTextDTO {
    public static final int $stable = 0;
    private final Boolean hasBottomSeparator;
    private final Boolean hasTopSeparator;
    private final TextDTO text;

    public SystemTextDTO(TextDTO textDTO, Boolean bool, Boolean bool2) {
        this.text = textDTO;
        this.hasTopSeparator = bool;
        this.hasBottomSeparator = bool2;
    }

    public static /* synthetic */ SystemTextDTO copy$default(SystemTextDTO systemTextDTO, TextDTO textDTO, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = systemTextDTO.text;
        }
        if ((i11 & 2) != 0) {
            bool = systemTextDTO.hasTopSeparator;
        }
        if ((i11 & 4) != 0) {
            bool2 = systemTextDTO.hasBottomSeparator;
        }
        return systemTextDTO.copy(textDTO, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasTopSeparator() {
        return this.hasTopSeparator;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasBottomSeparator() {
        return this.hasBottomSeparator;
    }

    @NotNull
    public final SystemTextDTO copy(TextDTO text, Boolean hasTopSeparator, Boolean hasBottomSeparator) {
        return new SystemTextDTO(text, hasTopSeparator, hasBottomSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemTextDTO)) {
            return false;
        }
        SystemTextDTO systemTextDTO = (SystemTextDTO) other;
        return Intrinsics.d(this.text, systemTextDTO.text) && Intrinsics.d(this.hasTopSeparator, systemTextDTO.hasTopSeparator) && Intrinsics.d(this.hasBottomSeparator, systemTextDTO.hasBottomSeparator);
    }

    public final Boolean getHasBottomSeparator() {
        return this.hasBottomSeparator;
    }

    public final Boolean getHasTopSeparator() {
        return this.hasTopSeparator;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        TextDTO textDTO = this.text;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        Boolean bool = this.hasTopSeparator;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasBottomSeparator;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        Boolean bool = this.hasTopSeparator;
        Boolean bool2 = this.hasBottomSeparator;
        StringBuilder sb2 = new StringBuilder("SystemTextDTO(text=");
        sb2.append(textDTO);
        sb2.append(", hasTopSeparator=");
        sb2.append(bool);
        sb2.append(", hasBottomSeparator=");
        return g.d(sb2, bool2, ")");
    }
}
