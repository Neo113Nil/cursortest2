package ru.ozon.fintech.features.onboarding.ui;

import B0.C2454a;
import G.g;
import J0.P;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/onboarding/ui/DisclosureItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "", "iconBgColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getTitle", "getIcon", "()I", "getIconBgColor", "provideId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisclosureItem implements RecyclerItem {
    private final int icon;
    private final int iconBgColor;

    @NotNull
    private final String id;

    @NotNull
    private final String title;

    public DisclosureItem(@NotNull String id2, @NotNull String title, int i11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.title = title;
        this.icon = i11;
        this.iconBgColor = i12;
    }

    public static /* synthetic */ DisclosureItem copy$default(DisclosureItem disclosureItem, String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = disclosureItem.id;
        }
        if ((i13 & 2) != 0) {
            str2 = disclosureItem.title;
        }
        if ((i13 & 4) != 0) {
            i11 = disclosureItem.icon;
        }
        if ((i13 & 8) != 0) {
            i12 = disclosureItem.iconBgColor;
        }
        return disclosureItem.copy(str, str2, i11, i12);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIconBgColor() {
        return this.iconBgColor;
    }

    @NotNull
    public final DisclosureItem copy(@NotNull String id2, @NotNull String title, int icon, int iconBgColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureItem(id2, title, icon, iconBgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureItem)) {
            return false;
        }
        DisclosureItem disclosureItem = (DisclosureItem) other;
        return Intrinsics.d(this.id, disclosureItem.id) && Intrinsics.d(this.title, disclosureItem.title) && this.icon == disclosureItem.icon && this.iconBgColor == disclosureItem.iconBgColor;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconBgColor() {
        return this.iconBgColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.iconBgColor) + C2454a.a(this.icon, g.a(this.id.hashCode() * 31, 31, this.title), 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return P.a(this.icon, this.iconBgColor, ", iconBgColor=", ")", C3660k.d("DisclosureItem(id=", this.id, ", title=", this.title, ", icon="));
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
