package ru.ozon.app.android.ugc.widgets.reviewstitle;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b%\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewstitle/ReviewsTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/m;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "count", "deeplink", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "label", "Lru/ozon/uni/atoms/data/deprecated/Button;", "linkButton", "writeReviewButton", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/Label;Lru/ozon/uni/atoms/data/deprecated/Button;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getCount", "()Ljava/lang/Integer;", "getDeeplink", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "getLabel", "()Lru/ozon/app/android/atoms/data/deprecated/Label;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getLinkButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getWriteReviewButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsTitleVO implements c, m {
    private final Integer count;
    private final String deeplink;
    private final long id;
    private final Label label;
    private final Button linkButton;
    private final String subtitle;
    private final String title;
    private final Button writeReviewButton;

    public ReviewsTitleVO(long j11, String str, String str2, Integer num, String str3, Label label, Button button, Button button2) {
        this.id = j11;
        this.title = str;
        this.subtitle = str2;
        this.count = num;
        this.deeplink = str3;
        this.label = label;
        this.linkButton = button;
        this.writeReviewButton = button2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsTitleVO)) {
            return false;
        }
        ReviewsTitleVO reviewsTitleVO = (ReviewsTitleVO) other;
        return this.id == reviewsTitleVO.id && Intrinsics.d(this.title, reviewsTitleVO.title) && Intrinsics.d(this.subtitle, reviewsTitleVO.subtitle) && Intrinsics.d(this.count, reviewsTitleVO.count) && Intrinsics.d(this.deeplink, reviewsTitleVO.deeplink) && Intrinsics.d(this.label, reviewsTitleVO.label) && Intrinsics.d(this.linkButton, reviewsTitleVO.linkButton) && Intrinsics.d(this.writeReviewButton, reviewsTitleVO.writeReviewButton);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Label getLabel() {
        return this.label;
    }

    public final Button getLinkButton() {
        return this.linkButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final Button getWriteReviewButton() {
        return this.writeReviewButton;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.count;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.deeplink;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Label label = this.label;
        int hashCode6 = (hashCode5 + (label == null ? 0 : label.hashCode())) * 31;
        Button button = this.linkButton;
        int hashCode7 = (hashCode6 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.writeReviewButton;
        return hashCode7 + (button2 != null ? button2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        Integer num = this.count;
        String str3 = this.deeplink;
        Label label = this.label;
        Button button = this.linkButton;
        Button button2 = this.writeReviewButton;
        StringBuilder c11 = C2436a.c(j11, "ReviewsTitleVO(id=", ", title=", str);
        c11.append(", subtitle=");
        c11.append(str2);
        c11.append(", count=");
        c11.append(num);
        c11.append(", deeplink=");
        c11.append(str3);
        c11.append(", label=");
        c11.append(label);
        c11.append(", linkButton=");
        c11.append(button);
        c11.append(", writeReviewButton=");
        c11.append(button2);
        c11.append(")");
        return c11.toString();
    }
}
