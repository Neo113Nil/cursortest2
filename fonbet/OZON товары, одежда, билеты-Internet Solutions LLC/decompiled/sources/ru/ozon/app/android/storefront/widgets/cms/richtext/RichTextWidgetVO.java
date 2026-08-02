package ru.ozon.app.android.storefront.widgets.cms.richtext;

import T7.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tools.MarkupType;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/tools/MarkupType;", "markupType", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "textFull", "", "textColor", "backgroundColor", "<init>", "(JLru/ozon/app/android/tools/MarkupType;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/tools/MarkupType;", "getMarkupType", "()Lru/ozon/app/android/tools/MarkupType;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextFull", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "getBackgroundColor", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RichTextWidgetVO implements c {
    public static final int $stable = OzonSpannableString.$stable;
    private final Integer backgroundColor;
    private final long id;

    @NotNull
    private final MarkupType markupType;

    @NotNull
    private final OzonSpannableString text;
    private final Integer textColor;
    private final OzonSpannableString textFull;

    public RichTextWidgetVO(long j11, @NotNull MarkupType markupType, @NotNull OzonSpannableString text, OzonSpannableString ozonSpannableString, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.markupType = markupType;
        this.text = text;
        this.textFull = ozonSpannableString;
        this.textColor = num;
        this.backgroundColor = num2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichTextWidgetVO)) {
            return false;
        }
        RichTextWidgetVO richTextWidgetVO = (RichTextWidgetVO) other;
        return this.id == richTextWidgetVO.id && this.markupType == richTextWidgetVO.markupType && Intrinsics.d(this.text, richTextWidgetVO.text) && Intrinsics.d(this.textFull, richTextWidgetVO.textFull) && Intrinsics.d(this.textColor, richTextWidgetVO.textColor) && Intrinsics.d(this.backgroundColor, richTextWidgetVO.backgroundColor);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final OzonSpannableString getTextFull() {
        return this.textFull;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = P.c(this.text, (this.markupType.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        OzonSpannableString ozonSpannableString = this.textFull;
        int hashCode = (c11 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        Integer num = this.textColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backgroundColor;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        MarkupType markupType = this.markupType;
        OzonSpannableString ozonSpannableString = this.text;
        OzonSpannableString ozonSpannableString2 = this.textFull;
        return "RichTextWidgetVO(id=" + j11 + ", markupType=" + markupType + ", text=" + ((Object) ozonSpannableString) + ", textFull=" + ((Object) ozonSpannableString2) + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
