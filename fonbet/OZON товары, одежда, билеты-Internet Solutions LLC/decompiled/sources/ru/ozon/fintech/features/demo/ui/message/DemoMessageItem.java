package ru.ozon.fintech.features.demo.ui.message;

import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/features/demo/ui/message/DemoMessageItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "onCardClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getOnCardClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "demo_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DemoMessageItem implements RecyclerItem {

    @NotNull
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final Function1<String, Unit> onCardClick;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DemoMessageItem(@NotNull String id2, @NotNull String title, @NotNull String description, @NotNull Function1<? super String, Unit> onCardClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        this.id = id2;
        this.title = title;
        this.description = description;
        this.onCardClick = onCardClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DemoMessageItem copy$default(DemoMessageItem demoMessageItem, String str, String str2, String str3, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = demoMessageItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = demoMessageItem.title;
        }
        if ((i11 & 4) != 0) {
            str3 = demoMessageItem.description;
        }
        if ((i11 & 8) != 0) {
            function1 = demoMessageItem.onCardClick;
        }
        return demoMessageItem.copy(str, str2, str3, function1);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Function1<String, Unit> component4() {
        return this.onCardClick;
    }

    @NotNull
    public final DemoMessageItem copy(@NotNull String id2, @NotNull String title, @NotNull String description, @NotNull Function1<? super String, Unit> onCardClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        return new DemoMessageItem(id2, title, description, onCardClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DemoMessageItem)) {
            return false;
        }
        DemoMessageItem demoMessageItem = (DemoMessageItem) other;
        return Intrinsics.d(this.id, demoMessageItem.id) && Intrinsics.d(this.title, demoMessageItem.title) && Intrinsics.d(this.description, demoMessageItem.description) && Intrinsics.d(this.onCardClick, demoMessageItem.onCardClick);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Function1<String, Unit> getOnCardClick() {
        return this.onCardClick;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.onCardClick.hashCode() + g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.description);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        Function1<String, Unit> function1 = this.onCardClick;
        StringBuilder d11 = C3660k.d("DemoMessageItem(id=", str, ", title=", str2, ", description=");
        d11.append(str3);
        d11.append(", onCardClick=");
        d11.append(function1);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
