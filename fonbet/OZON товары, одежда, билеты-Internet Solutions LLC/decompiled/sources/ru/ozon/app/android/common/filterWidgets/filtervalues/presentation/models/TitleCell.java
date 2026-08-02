package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import G.g;
import Kk.C3532b;
import Pk0.b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u001a\u0010#\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006%"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "", "id", "", "isSelect", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "topCornersRadius", "isSelectFilterValues", "isSelectCurrencyValues", "<init>", "(Ljava/lang/String;ZLjava/lang/String;FZZ)V", "copy", "(Ljava/lang/String;ZLjava/lang/String;FZZ)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "getTitle", "F", "getTopCornersRadius", "()F", "viewType$1", "I", "getViewType", "viewType", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TitleCell extends FilterValuesCell {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.filter_values_section_item;

    @NotNull
    private final String id;
    private final boolean isSelect;
    private final boolean isSelectCurrencyValues;
    private final boolean isSelectFilterValues;

    @NotNull
    private final String title;
    private final float topCornersRadius;

    /* renamed from: viewType$1, reason: from kotlin metadata */
    private final int viewType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/TitleCell$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return TitleCell.viewType;
        }

        private Companion() {
        }
    }

    public TitleCell(@NotNull String id2, boolean z11, @NotNull String title, float f7, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.isSelect = z11;
        this.title = title;
        this.topCornersRadius = f7;
        this.isSelectFilterValues = z12;
        this.isSelectCurrencyValues = z13;
        this.viewType = viewType;
    }

    public static /* synthetic */ TitleCell copy$default(TitleCell titleCell, String str, boolean z11, String str2, float f7, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = titleCell.id;
        }
        if ((i11 & 2) != 0) {
            z11 = titleCell.isSelect;
        }
        if ((i11 & 4) != 0) {
            str2 = titleCell.title;
        }
        if ((i11 & 8) != 0) {
            f7 = titleCell.topCornersRadius;
        }
        if ((i11 & 16) != 0) {
            z12 = titleCell.isSelectFilterValues;
        }
        if ((i11 & 32) != 0) {
            z13 = titleCell.isSelectCurrencyValues;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return titleCell.copy(str, z11, str2, f7, z14, z15);
    }

    @NotNull
    public final TitleCell copy(@NotNull String id2, boolean isSelect, @NotNull String title, float topCornersRadius, boolean isSelectFilterValues, boolean isSelectCurrencyValues) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TitleCell(id2, isSelect, title, topCornersRadius, isSelectFilterValues, isSelectCurrencyValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleCell)) {
            return false;
        }
        TitleCell titleCell = (TitleCell) other;
        return Intrinsics.d(this.id, titleCell.id) && this.isSelect == titleCell.isSelect && Intrinsics.d(this.title, titleCell.title) && Float.compare(this.topCornersRadius, titleCell.topCornersRadius) == 0 && this.isSelectFilterValues == titleCell.isSelectFilterValues && this.isSelectCurrencyValues == titleCell.isSelectCurrencyValues;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final float getTopCornersRadius() {
        return this.topCornersRadius;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelectCurrencyValues) + C3532b.a(b.a(this.topCornersRadius, g.a(C3532b.a(this.id.hashCode() * 31, 31, this.isSelect), 31, this.title), 31), 31, this.isSelectFilterValues);
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    /* renamed from: isSelect, reason: from getter */
    public boolean getIsSelect() {
        return this.isSelect;
    }

    /* renamed from: isSelectCurrencyValues, reason: from getter */
    public final boolean getIsSelectCurrencyValues() {
        return this.isSelectCurrencyValues;
    }

    /* renamed from: isSelectFilterValues, reason: from getter */
    public final boolean getIsSelectFilterValues() {
        return this.isSelectFilterValues;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isSelect;
        String str2 = this.title;
        float f7 = this.topCornersRadius;
        boolean z12 = this.isSelectFilterValues;
        boolean z13 = this.isSelectCurrencyValues;
        StringBuilder b11 = C4636t5.b("TitleCell(id=", str, ", isSelect=", ", title=", z11);
        b11.append(str2);
        b11.append(", topCornersRadius=");
        b11.append(f7);
        b11.append(", isSelectFilterValues=");
        b11.append(z12);
        b11.append(", isSelectCurrencyValues=");
        b11.append(z13);
        b11.append(")");
        return b11.toString();
    }
}
