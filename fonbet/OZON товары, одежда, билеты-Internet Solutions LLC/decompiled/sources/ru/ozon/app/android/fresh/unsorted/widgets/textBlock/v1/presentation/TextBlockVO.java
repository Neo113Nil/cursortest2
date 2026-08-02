package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation;

import B90.C2619v;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.data.TextBlockDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockVO;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartVO;", "", "id", "", "scrollWidgetKey", "", "catalogueTabsConnectionTag", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "body", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "alignment", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getCatalogueTabsConnectionTag", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBody", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "getAlignment", "()Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/data/TextBlockDTO$AlignmentPosition;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TextBlockVO implements CatalogTabsPartVO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextBlockDTO.AlignmentPosition alignment;

    @NotNull
    private final TextAtom body;
    private final String catalogueTabsConnectionTag;
    private final long id;
    private final Integer scrollWidgetKey;

    public TextBlockVO(long j11, Integer num, String str, @NotNull TextAtom body, @NotNull TextBlockDTO.AlignmentPosition alignment) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.catalogueTabsConnectionTag = str;
        this.body = body;
        this.alignment = alignment;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockVO)) {
            return false;
        }
        TextBlockVO textBlockVO = (TextBlockVO) other;
        return this.id == textBlockVO.id && Intrinsics.d(this.scrollWidgetKey, textBlockVO.scrollWidgetKey) && Intrinsics.d(this.catalogueTabsConnectionTag, textBlockVO.catalogueTabsConnectionTag) && Intrinsics.d(this.body, textBlockVO.body) && this.alignment == textBlockVO.alignment;
    }

    @NotNull
    public final TextBlockDTO.AlignmentPosition getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TextAtom getBody() {
        return this.body;
    }

    @Override // ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO
    public String getCatalogueTabsConnectionTag() {
        return this.catalogueTabsConnectionTag;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return CatalogTabsPartVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.catalogueTabsConnectionTag;
        return this.alignment.hashCode() + C2619v.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.body);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        String str = this.catalogueTabsConnectionTag;
        TextAtom textAtom = this.body;
        TextBlockDTO.AlignmentPosition alignmentPosition = this.alignment;
        StringBuilder c11 = a.c("TextBlockVO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", catalogueTabsConnectionTag=");
        c11.append(str);
        c11.append(", body=");
        c11.append(textAtom);
        c11.append(", alignment=");
        c11.append(alignmentPosition);
        c11.append(")");
        return c11.toString();
    }
}
