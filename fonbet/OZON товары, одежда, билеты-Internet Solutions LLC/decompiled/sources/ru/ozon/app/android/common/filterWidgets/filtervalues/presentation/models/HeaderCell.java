package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Pk0.a;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\fJB\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010#\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "", "id", "", "isSelect", SelectionItemFormDTO.TITLE_FIELD_NAME, "isExpanded", "showSeparator", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZZ)V", "setExpandedState", "(Z)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "toggleExpandedState", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "copy", "(Ljava/lang/String;ZLjava/lang/String;ZZ)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "getTitle", "getShowSeparator", "viewType$1", "I", "getViewType", "viewType", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HeaderCell extends FilterValuesCell {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.filter_values_header_item;

    @NotNull
    private final String id;
    private final boolean isExpanded;
    private final boolean isSelect;
    private final boolean showSeparator;

    @NotNull
    private final String title;

    /* renamed from: viewType$1, reason: from kotlin metadata */
    private final int viewType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/HeaderCell$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return HeaderCell.viewType;
        }

        private Companion() {
        }
    }

    public HeaderCell(@NotNull String id2, boolean z11, @NotNull String title, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.isSelect = z11;
        this.title = title;
        this.isExpanded = z12;
        this.showSeparator = z13;
        this.viewType = viewType;
    }

    public static /* synthetic */ HeaderCell copy$default(HeaderCell headerCell, String str, boolean z11, String str2, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = headerCell.id;
        }
        if ((i11 & 2) != 0) {
            z11 = headerCell.isSelect;
        }
        if ((i11 & 4) != 0) {
            str2 = headerCell.title;
        }
        if ((i11 & 8) != 0) {
            z12 = headerCell.isExpanded;
        }
        if ((i11 & 16) != 0) {
            z13 = headerCell.showSeparator;
        }
        boolean z14 = z13;
        String str3 = str2;
        return headerCell.copy(str, z11, str3, z12, z14);
    }

    @NotNull
    public final HeaderCell copy(@NotNull String id2, boolean isSelect, @NotNull String title, boolean isExpanded, boolean showSeparator) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderCell(id2, isSelect, title, isExpanded, showSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderCell)) {
            return false;
        }
        HeaderCell headerCell = (HeaderCell) other;
        return Intrinsics.d(this.id, headerCell.id) && this.isSelect == headerCell.isSelect && Intrinsics.d(this.title, headerCell.title) && this.isExpanded == headerCell.isExpanded && this.showSeparator == headerCell.showSeparator;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    @NotNull
    public String getId() {
        return this.id;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showSeparator) + C3532b.a(g.a(C3532b.a(this.id.hashCode() * 31, 31, this.isSelect), 31, this.title), 31, this.isExpanded);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell
    /* renamed from: isSelect, reason: from getter */
    public boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final HeaderCell setExpandedState(boolean isExpanded) {
        return copy$default(this, null, false, null, isExpanded, false, 23, null);
    }

    @NotNull
    public final HeaderCell showSeparator(boolean showSeparator) {
        return copy$default(this, null, false, null, false, showSeparator, 15, null);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isSelect;
        String str2 = this.title;
        boolean z12 = this.isExpanded;
        boolean z13 = this.showSeparator;
        StringBuilder b11 = C4636t5.b("HeaderCell(id=", str, ", isSelect=", ", title=", z11);
        C2880a.c(str2, ", isExpanded=", ", showSeparator=", b11, z12);
        return a.a(")", b11, z13);
    }

    @NotNull
    public final HeaderCell toggleExpandedState() {
        return setExpandedState(!this.isExpanded);
    }
}
