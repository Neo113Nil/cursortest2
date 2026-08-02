package ru.ozon.app.android.storefront.widgets.cms.richtext;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.data.markdown.MarkWonToTextTypeExtKt;
import ru.ozon.app.android.tools.MarkupType;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richtext/TextBlockDTO;", "", "backgroundColor", "", "textColor", "markupType", "text", "more", "textFull", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "getMarkupType", "getText", "getMore", "getTextFull", "textType", "Lru/ozon/app/android/tools/MarkupType;", "getTextType", "()Lru/ozon/app/android/tools/MarkupType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextBlockDTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String markupType;
    private final String more;

    @NotNull
    private final String text;
    private final String textColor;
    private final String textFull;

    @NotNull
    private final MarkupType textType;

    public TextBlockDTO(String str, String str2, String str3, @NotNull String text, String str4, String str5) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.backgroundColor = str;
        this.textColor = str2;
        this.markupType = str3;
        this.text = text;
        this.more = str4;
        this.textFull = str5;
        this.textType = MarkWonToTextTypeExtKt.toTextType(str3);
    }

    public static /* synthetic */ TextBlockDTO copy$default(TextBlockDTO textBlockDTO, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textBlockDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = textBlockDTO.textColor;
        }
        if ((i11 & 4) != 0) {
            str3 = textBlockDTO.markupType;
        }
        if ((i11 & 8) != 0) {
            str4 = textBlockDTO.text;
        }
        if ((i11 & 16) != 0) {
            str5 = textBlockDTO.more;
        }
        if ((i11 & 32) != 0) {
            str6 = textBlockDTO.textFull;
        }
        String str7 = str5;
        String str8 = str6;
        return textBlockDTO.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMarkupType() {
        return this.markupType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMore() {
        return this.more;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTextFull() {
        return this.textFull;
    }

    @NotNull
    public final TextBlockDTO copy(String backgroundColor, String textColor, String markupType, @NotNull String text, String more, String textFull) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextBlockDTO(backgroundColor, textColor, markupType, text, more, textFull);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockDTO)) {
            return false;
        }
        TextBlockDTO textBlockDTO = (TextBlockDTO) other;
        return Intrinsics.d(this.backgroundColor, textBlockDTO.backgroundColor) && Intrinsics.d(this.textColor, textBlockDTO.textColor) && Intrinsics.d(this.markupType, textBlockDTO.markupType) && Intrinsics.d(this.text, textBlockDTO.text) && Intrinsics.d(this.more, textBlockDTO.more) && Intrinsics.d(this.textFull, textBlockDTO.textFull);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getMarkupType() {
        return this.markupType;
    }

    public final String getMore() {
        return this.more;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextFull() {
        return this.textFull;
    }

    @NotNull
    public final MarkupType getTextType() {
        return this.textType;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.markupType;
        int a11 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.text);
        String str4 = this.more;
        int hashCode3 = (a11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textFull;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.textColor;
        String str3 = this.markupType;
        String str4 = this.text;
        String str5 = this.more;
        String str6 = this.textFull;
        StringBuilder d11 = C3660k.d("TextBlockDTO(backgroundColor=", str, ", textColor=", str2, ", markupType=");
        a.h(d11, str3, ", text=", str4, ", more=");
        return C3173b.c(d11, str5, ", textFull=", str6, ")");
    }
}
