package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/data/TextAreaDTO;", "", "text", "", HammersV3BodyDTO.PLACEHOLDER, "notEmptyCaption", "maxLen", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getPlaceholder", "getNotEmptyCaption", "getMaxLen", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TextAreaDTO {
    public static final int $stable = 0;
    private final int maxLen;
    private final String notEmptyCaption;

    @NotNull
    private final String placeholder;
    private final String text;

    public TextAreaDTO(String str, @NotNull String placeholder, String str2, int i11) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.text = str;
        this.placeholder = placeholder;
        this.notEmptyCaption = str2;
        this.maxLen = i11;
    }

    public static /* synthetic */ TextAreaDTO copy$default(TextAreaDTO textAreaDTO, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = textAreaDTO.text;
        }
        if ((i12 & 2) != 0) {
            str2 = textAreaDTO.placeholder;
        }
        if ((i12 & 4) != 0) {
            str3 = textAreaDTO.notEmptyCaption;
        }
        if ((i12 & 8) != 0) {
            i11 = textAreaDTO.maxLen;
        }
        return textAreaDTO.copy(str, str2, str3, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNotEmptyCaption() {
        return this.notEmptyCaption;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxLen() {
        return this.maxLen;
    }

    @NotNull
    public final TextAreaDTO copy(String text, @NotNull String placeholder, String notEmptyCaption, int maxLen) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return new TextAreaDTO(text, placeholder, notEmptyCaption, maxLen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaDTO)) {
            return false;
        }
        TextAreaDTO textAreaDTO = (TextAreaDTO) other;
        return Intrinsics.d(this.text, textAreaDTO.text) && Intrinsics.d(this.placeholder, textAreaDTO.placeholder) && Intrinsics.d(this.notEmptyCaption, textAreaDTO.notEmptyCaption) && this.maxLen == textAreaDTO.maxLen;
    }

    public final int getMaxLen() {
        return this.maxLen;
    }

    public final String getNotEmptyCaption() {
        return this.notEmptyCaption;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.placeholder);
        String str2 = this.notEmptyCaption;
        return Integer.hashCode(this.maxLen) + ((a11 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.placeholder;
        String str3 = this.notEmptyCaption;
        int i11 = this.maxLen;
        StringBuilder d11 = C3660k.d("TextAreaDTO(text=", str, ", placeholder=", str2, ", notEmptyCaption=");
        d11.append(str3);
        d11.append(", maxLen=");
        d11.append(i11);
        d11.append(")");
        return d11.toString();
    }
}
