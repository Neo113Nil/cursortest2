package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import Lc.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/BonusVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "tintColor", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(ILru/ozon/uni/atoms/data/button/Icon;Ljava/lang/Integer;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/Integer;", "getTintColor", "()Ljava/lang/Integer;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getTitle", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BonusVO implements TravelRailwaySeatSelectFooterVO.FooterItem {
    public static final int $stable = LinkButtonVO.$stable | Icon.$stable;

    @NotNull
    private final Icon icon;
    private final int id;
    private final Integer tintColor;

    @NotNull
    private final LinkButtonVO title;

    public BonusVO(int i11, @NotNull Icon icon, Integer num, @NotNull LinkButtonVO title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i11;
        this.icon = icon;
        this.tintColor = num;
        this.title = title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusVO)) {
            return false;
        }
        BonusVO bonusVO = (BonusVO) other;
        return this.id == bonusVO.id && Intrinsics.d(this.icon, bonusVO.icon) && Intrinsics.d(this.tintColor, bonusVO.tintColor) && Intrinsics.d(this.title, bonusVO.title);
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO.FooterItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final LinkButtonVO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = a.a(this.icon, Integer.hashCode(this.id) * 31, 31);
        Integer num = this.tintColor;
        return this.title.hashCode() + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "BonusVO(id=" + this.id + ", icon=" + this.icon + ", tintColor=" + this.tintColor + ", title=" + this.title + ")";
    }
}
