package ru.ozon.fintech.ui.header;

import G.g;
import K00.b;
import N3.C3660k;
import android.R;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/header/HeaderItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "background", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getTitle", "getBackground", "()I", "provideId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderItem implements RecyclerItem {
    private final int background;

    @NotNull
    private final String id;

    @NotNull
    private final String title;

    public HeaderItem(@NotNull String id2, @NotNull String title, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.title = title;
        this.background = i11;
    }

    public static /* synthetic */ HeaderItem copy$default(HeaderItem headerItem, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = headerItem.id;
        }
        if ((i12 & 2) != 0) {
            str2 = headerItem.title;
        }
        if ((i12 & 4) != 0) {
            i11 = headerItem.background;
        }
        return headerItem.copy(str, str2, i11);
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
    public final int getBackground() {
        return this.background;
    }

    @NotNull
    public final HeaderItem copy(@NotNull String id2, @NotNull String title, int background) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderItem(id2, title, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) other;
        return Intrinsics.d(this.id, headerItem.id) && Intrinsics.d(this.title, headerItem.title) && this.background == headerItem.background;
    }

    public final int getBackground() {
        return this.background;
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
        return Integer.hashCode(this.background) + g.a(this.id.hashCode() * 31, 31, this.title);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return b.e(this.background, ")", C3660k.d("HeaderItem(id=", this.id, ", title=", this.title, ", background="));
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ HeaderItem(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? R.color.transparent : i11);
    }
}
