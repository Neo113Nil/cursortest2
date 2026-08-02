package ru.ozon.fintech.features.demo.ui.account;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/fintech/features/demo/ui/account/DemoAccountItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "selected", "", "deleteButton", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "onCardClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/fintech/ui/button/small/FinSmallButtonState;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getSelected", "()Z", "getDeleteButton", "()Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "getOnCardClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "demo_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DemoAccountItem implements RecyclerItem {

    @NotNull
    private final FinSmallButtonState deleteButton;

    @NotNull
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final Function1<String, Unit> onCardClick;
    private final boolean selected;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DemoAccountItem(@NotNull String id2, @NotNull String title, @NotNull String description, boolean z11, @NotNull FinSmallButtonState deleteButton, @NotNull Function1<? super String, Unit> onCardClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(deleteButton, "deleteButton");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        this.id = id2;
        this.title = title;
        this.description = description;
        this.selected = z11;
        this.deleteButton = deleteButton;
        this.onCardClick = onCardClick;
    }

    public static /* synthetic */ DemoAccountItem copy$default(DemoAccountItem demoAccountItem, String str, String str2, String str3, boolean z11, FinSmallButtonState finSmallButtonState, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = demoAccountItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = demoAccountItem.title;
        }
        if ((i11 & 4) != 0) {
            str3 = demoAccountItem.description;
        }
        if ((i11 & 8) != 0) {
            z11 = demoAccountItem.selected;
        }
        if ((i11 & 16) != 0) {
            finSmallButtonState = demoAccountItem.deleteButton;
        }
        if ((i11 & 32) != 0) {
            function1 = demoAccountItem.onCardClick;
        }
        FinSmallButtonState finSmallButtonState2 = finSmallButtonState;
        Function1 function12 = function1;
        return demoAccountItem.copy(str, str2, str3, z11, finSmallButtonState2, function12);
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

    /* renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final FinSmallButtonState getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    public final Function1<String, Unit> component6() {
        return this.onCardClick;
    }

    @NotNull
    public final DemoAccountItem copy(@NotNull String id2, @NotNull String title, @NotNull String description, boolean selected, @NotNull FinSmallButtonState deleteButton, @NotNull Function1<? super String, Unit> onCardClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(deleteButton, "deleteButton");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        return new DemoAccountItem(id2, title, description, selected, deleteButton, onCardClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DemoAccountItem)) {
            return false;
        }
        DemoAccountItem demoAccountItem = (DemoAccountItem) other;
        return Intrinsics.d(this.id, demoAccountItem.id) && Intrinsics.d(this.title, demoAccountItem.title) && Intrinsics.d(this.description, demoAccountItem.description) && this.selected == demoAccountItem.selected && Intrinsics.d(this.deleteButton, demoAccountItem.deleteButton) && Intrinsics.d(this.onCardClick, demoAccountItem.onCardClick);
    }

    @NotNull
    public final FinSmallButtonState getDeleteButton() {
        return this.deleteButton;
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

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.onCardClick.hashCode() + ((this.deleteButton.hashCode() + C3532b.a(g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.selected)) * 31);
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
        boolean z11 = this.selected;
        FinSmallButtonState finSmallButtonState = this.deleteButton;
        Function1<String, Unit> function1 = this.onCardClick;
        StringBuilder d11 = C3660k.d("DemoAccountItem(id=", str, ", title=", str2, ", description=");
        C2880a.c(str3, ", selected=", ", deleteButton=", d11, z11);
        d11.append(finSmallButtonState);
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
