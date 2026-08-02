package ru.ozon.android.messenger.blocks.ratemessenger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/ratemessenger/MessageDTO;", "", HammersV3BodyDTO.PLACEHOLDER, "", "maxCharacters", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getPlaceholder", "()Ljava/lang/String;", "getMaxCharacters", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/ratemessenger/MessageDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MessageDTO {
    public static final int $stable = 0;
    private final Integer maxCharacters;
    private final String placeholder;

    public MessageDTO(String str, Integer num) {
        this.placeholder = str;
        this.maxCharacters = num;
    }

    public static /* synthetic */ MessageDTO copy$default(MessageDTO messageDTO, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageDTO.placeholder;
        }
        if ((i11 & 2) != 0) {
            num = messageDTO.maxCharacters;
        }
        return messageDTO.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxCharacters() {
        return this.maxCharacters;
    }

    @NotNull
    public final MessageDTO copy(String placeholder, Integer maxCharacters) {
        return new MessageDTO(placeholder, maxCharacters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDTO)) {
            return false;
        }
        MessageDTO messageDTO = (MessageDTO) other;
        return Intrinsics.d(this.placeholder, messageDTO.placeholder) && Intrinsics.d(this.maxCharacters, messageDTO.maxCharacters);
    }

    public final Integer getMaxCharacters() {
        return this.maxCharacters;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        String str = this.placeholder;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxCharacters;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageDTO(placeholder=" + this.placeholder + ", maxCharacters=" + this.maxCharacters + ")";
    }
}
