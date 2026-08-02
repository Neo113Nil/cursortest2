package ru.ozon.app.android.storefront.widgets.navigationSlider.data;

import B90.C2618u;
import G.g;
import Kk.C3532b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "showAsSlider", "", "items", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationItemDTO;", "isTwoLinesTitle", "options", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/Option;", "<init>", "(Ljava/lang/String;ZLjava/util/List;ZLjava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getShowAsSlider", "()Z", "getItems", "()Ljava/util/List;", "getOptions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationSliderDTO {
    public static final int $stable = 8;
    private final boolean isTwoLinesTitle;

    @NotNull
    private final List<NavigationItemDTO> items;

    @NotNull
    private final List<Option> options;
    private final boolean showAsSlider;
    private final String title;

    public NavigationSliderDTO(String str, boolean z11, @NotNull List<NavigationItemDTO> items, boolean z12, @NotNull List<Option> options) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(options, "options");
        this.title = str;
        this.showAsSlider = z11;
        this.items = items;
        this.isTwoLinesTitle = z12;
        this.options = options;
    }

    public static /* synthetic */ NavigationSliderDTO copy$default(NavigationSliderDTO navigationSliderDTO, String str, boolean z11, List list, boolean z12, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationSliderDTO.title;
        }
        if ((i11 & 2) != 0) {
            z11 = navigationSliderDTO.showAsSlider;
        }
        if ((i11 & 4) != 0) {
            list = navigationSliderDTO.items;
        }
        if ((i11 & 8) != 0) {
            z12 = navigationSliderDTO.isTwoLinesTitle;
        }
        if ((i11 & 16) != 0) {
            list2 = navigationSliderDTO.options;
        }
        List list3 = list2;
        List list4 = list;
        return navigationSliderDTO.copy(str, z11, list4, z12, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAsSlider() {
        return this.showAsSlider;
    }

    @NotNull
    public final List<NavigationItemDTO> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTwoLinesTitle() {
        return this.isTwoLinesTitle;
    }

    @NotNull
    public final List<Option> component5() {
        return this.options;
    }

    @NotNull
    public final NavigationSliderDTO copy(String title, boolean showAsSlider, @NotNull List<NavigationItemDTO> items, boolean isTwoLinesTitle, @NotNull List<Option> options) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(options, "options");
        return new NavigationSliderDTO(title, showAsSlider, items, isTwoLinesTitle, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderDTO)) {
            return false;
        }
        NavigationSliderDTO navigationSliderDTO = (NavigationSliderDTO) other;
        return Intrinsics.d(this.title, navigationSliderDTO.title) && this.showAsSlider == navigationSliderDTO.showAsSlider && Intrinsics.d(this.items, navigationSliderDTO.items) && this.isTwoLinesTitle == navigationSliderDTO.isTwoLinesTitle && Intrinsics.d(this.options, navigationSliderDTO.options);
    }

    @NotNull
    public final List<NavigationItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final List<Option> getOptions() {
        return this.options;
    }

    public final boolean getShowAsSlider() {
        return this.showAsSlider;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.options.hashCode() + C3532b.a(g.b(C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.showAsSlider), 31, this.items), 31, this.isTwoLinesTitle);
    }

    public final boolean isTwoLinesTitle() {
        return this.isTwoLinesTitle;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.showAsSlider;
        List<NavigationItemDTO> list = this.items;
        boolean z12 = this.isTwoLinesTitle;
        List<Option> list2 = this.options;
        StringBuilder b11 = C4636t5.b("NavigationSliderDTO(title=", str, ", showAsSlider=", ", items=", z11);
        b11.append(list);
        b11.append(", isTwoLinesTitle=");
        b11.append(z12);
        b11.append(", options=");
        return C2618u.h(b11, list2, ")");
    }
}
