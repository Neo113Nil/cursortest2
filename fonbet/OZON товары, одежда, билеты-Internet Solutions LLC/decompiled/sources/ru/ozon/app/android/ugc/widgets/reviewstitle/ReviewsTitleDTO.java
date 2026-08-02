package ru.ozon.app.android.ugc.widgets.reviewstitle;

import B4.V;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "count", "", "deeplink", "label", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "linkButton", "Lru/ozon/uni/atoms/data/deprecated/Button;", "writeReviewButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/Label;Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeeplink", "getLabel", "()Lru/ozon/app/android/atoms/data/deprecated/Label;", "getLinkButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getWriteReviewButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/Label;Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/data/deprecated/Button;)Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleDTO;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsTitleDTO {
    public static final int $stable = 8;
    private final Integer count;
    private final String deeplink;
    private final Label label;
    private final Button linkButton;
    private final String subtitle;
    private final String title;
    private final Button writeReviewButton;

    public ReviewsTitleDTO(String str, String str2, Integer num, String str3, Label label, Button button, Button button2) {
        this.title = str;
        this.subtitle = str2;
        this.count = num;
        this.deeplink = str3;
        this.label = label;
        this.linkButton = button;
        this.writeReviewButton = button2;
    }

    public static /* synthetic */ ReviewsTitleDTO copy$default(ReviewsTitleDTO reviewsTitleDTO, String str, String str2, Integer num, String str3, Label label, Button button, Button button2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewsTitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = reviewsTitleDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            num = reviewsTitleDTO.count;
        }
        if ((i11 & 8) != 0) {
            str3 = reviewsTitleDTO.deeplink;
        }
        if ((i11 & 16) != 0) {
            label = reviewsTitleDTO.label;
        }
        if ((i11 & 32) != 0) {
            button = reviewsTitleDTO.linkButton;
        }
        if ((i11 & 64) != 0) {
            button2 = reviewsTitleDTO.writeReviewButton;
        }
        Button button3 = button;
        Button button4 = button2;
        Label label2 = label;
        Integer num2 = num;
        return reviewsTitleDTO.copy(str, str2, num2, str3, label2, button3, button4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* renamed from: component6, reason: from getter */
    public final Button getLinkButton() {
        return this.linkButton;
    }

    /* renamed from: component7, reason: from getter */
    public final Button getWriteReviewButton() {
        return this.writeReviewButton;
    }

    @NotNull
    public final ReviewsTitleDTO copy(String title, String subtitle, Integer count, String deeplink, Label label, Button linkButton, Button writeReviewButton) {
        return new ReviewsTitleDTO(title, subtitle, count, deeplink, label, linkButton, writeReviewButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsTitleDTO)) {
            return false;
        }
        ReviewsTitleDTO reviewsTitleDTO = (ReviewsTitleDTO) other;
        return Intrinsics.d(this.title, reviewsTitleDTO.title) && Intrinsics.d(this.subtitle, reviewsTitleDTO.subtitle) && Intrinsics.d(this.count, reviewsTitleDTO.count) && Intrinsics.d(this.deeplink, reviewsTitleDTO.deeplink) && Intrinsics.d(this.label, reviewsTitleDTO.label) && Intrinsics.d(this.linkButton, reviewsTitleDTO.linkButton) && Intrinsics.d(this.writeReviewButton, reviewsTitleDTO.writeReviewButton);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Label getLabel() {
        return this.label;
    }

    public final Button getLinkButton() {
        return this.linkButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Button getWriteReviewButton() {
        return this.writeReviewButton;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.deeplink;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Label label = this.label;
        int hashCode5 = (hashCode4 + (label == null ? 0 : label.hashCode())) * 31;
        Button button = this.linkButton;
        int hashCode6 = (hashCode5 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.writeReviewButton;
        return hashCode6 + (button2 != null ? button2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.count;
        String str3 = this.deeplink;
        Label label = this.label;
        Button button = this.linkButton;
        Button button2 = this.writeReviewButton;
        StringBuilder d11 = C3660k.d("ReviewsTitleDTO(title=", str, ", subtitle=", str2, ", count=");
        V.f(num, ", deeplink=", str3, ", label=", d11);
        d11.append(label);
        d11.append(", linkButton=");
        d11.append(button);
        d11.append(", writeReviewButton=");
        d11.append(button2);
        d11.append(")");
        return d11.toString();
    }
}
