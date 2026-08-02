package ru.ozon.fintech.features.demo.ui.income;

import B0.C2454a;
import C.o0;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e¨\u0006)"}, d2 = {"Lru/ozon/fintech/features/demo/ui/income/DemoIncomeItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "", "index", "Lru/ozon/fintech/network/models/a;", "plusLoadState", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "plusButton", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;ILru/ozon/fintech/network/models/a;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;Ljava/lang/String;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Lru/ozon/fintech/network/models/a;", "component4", "()Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "component5", "copy", "(Ljava/lang/String;ILru/ozon/fintech/network/models/a;Lru/ozon/fintech/ui/button/small/FinSmallButtonState;Ljava/lang/String;)Lru/ozon/fintech/features/demo/ui/income/DemoIncomeItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getIndex", "Lru/ozon/fintech/network/models/a;", "getPlusLoadState", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "getPlusButton", "getTitle", "demo_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DemoIncomeItem implements RecyclerItem {

    @NotNull
    private final String id;
    private final int index;

    @NotNull
    private final FinSmallButtonState plusButton;

    @NotNull
    private final a plusLoadState;

    @NotNull
    private final String title;

    public DemoIncomeItem(@NotNull String id2, int i11, @NotNull a plusLoadState, @NotNull FinSmallButtonState plusButton, @NotNull String title) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(plusLoadState, "plusLoadState");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id2;
        this.index = i11;
        this.plusLoadState = plusLoadState;
        this.plusButton = plusButton;
        this.title = title;
    }

    public static /* synthetic */ DemoIncomeItem copy$default(DemoIncomeItem demoIncomeItem, String str, int i11, a aVar, FinSmallButtonState finSmallButtonState, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = demoIncomeItem.id;
        }
        if ((i12 & 2) != 0) {
            i11 = demoIncomeItem.index;
        }
        if ((i12 & 4) != 0) {
            aVar = demoIncomeItem.plusLoadState;
        }
        if ((i12 & 8) != 0) {
            finSmallButtonState = demoIncomeItem.plusButton;
        }
        if ((i12 & 16) != 0) {
            str2 = demoIncomeItem.title;
        }
        String str3 = str2;
        a aVar2 = aVar;
        return demoIncomeItem.copy(str, i11, aVar2, finSmallButtonState, str3);
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

    /* renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final a getPlusLoadState() {
        return this.plusLoadState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FinSmallButtonState getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final DemoIncomeItem copy(@NotNull String id2, int index, @NotNull a plusLoadState, @NotNull FinSmallButtonState plusButton, @NotNull String title) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(plusLoadState, "plusLoadState");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DemoIncomeItem(id2, index, plusLoadState, plusButton, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DemoIncomeItem)) {
            return false;
        }
        DemoIncomeItem demoIncomeItem = (DemoIncomeItem) other;
        return Intrinsics.d(this.id, demoIncomeItem.id) && this.index == demoIncomeItem.index && Intrinsics.d(this.plusLoadState, demoIncomeItem.plusLoadState) && Intrinsics.d(this.plusButton, demoIncomeItem.plusButton) && Intrinsics.d(this.title, demoIncomeItem.title);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final FinSmallButtonState getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    public final a getPlusLoadState() {
        return this.plusLoadState;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + ((this.plusButton.hashCode() + ((this.plusLoadState.hashCode() + C2454a.a(this.index, this.id.hashCode() * 31, 31)) * 31)) * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i11 = this.index;
        a aVar = this.plusLoadState;
        FinSmallButtonState finSmallButtonState = this.plusButton;
        String str2 = this.title;
        StringBuilder c11 = C3660k.c(i11, "DemoIncomeItem(id=", str, ", index=", ", plusLoadState=");
        c11.append(aVar);
        c11.append(", plusButton=");
        c11.append(finSmallButtonState);
        c11.append(", title=");
        return o0.c(c11, str2, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
