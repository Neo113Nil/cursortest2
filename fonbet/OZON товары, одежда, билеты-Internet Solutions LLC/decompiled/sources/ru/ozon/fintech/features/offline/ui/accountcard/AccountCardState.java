package ru.ozon.fintech.features.offline.ui.accountcard;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, d2 = {"Lru/ozon/fintech/features/offline/ui/accountcard/AccountCardState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "amountText", "updatedAtText", "rightIcon", "infoIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getAmountText", "getUpdatedAtText", "getRightIcon", "getInfoIcon", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountCardState implements RecyclerItem {

    @NotNull
    private final String amountText;

    @NotNull
    private final String id;

    @NotNull
    private final String infoIcon;

    @NotNull
    private final String rightIcon;

    @NotNull
    private final String title;

    @NotNull
    private final String updatedAtText;

    public AccountCardState(@NotNull String id2, @NotNull String title, @NotNull String amountText, @NotNull String updatedAtText, @NotNull String rightIcon, @NotNull String infoIcon) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(updatedAtText, "updatedAtText");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        this.id = id2;
        this.title = title;
        this.amountText = amountText;
        this.updatedAtText = updatedAtText;
        this.rightIcon = rightIcon;
        this.infoIcon = infoIcon;
    }

    public static /* synthetic */ AccountCardState copy$default(AccountCardState accountCardState, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountCardState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = accountCardState.title;
        }
        if ((i11 & 4) != 0) {
            str3 = accountCardState.amountText;
        }
        if ((i11 & 8) != 0) {
            str4 = accountCardState.updatedAtText;
        }
        if ((i11 & 16) != 0) {
            str5 = accountCardState.rightIcon;
        }
        if ((i11 & 32) != 0) {
            str6 = accountCardState.infoIcon;
        }
        String str7 = str5;
        String str8 = str6;
        return accountCardState.copy(str, str2, str3, str4, str7, str8);
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
    public final String getAmountText() {
        return this.amountText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUpdatedAtText() {
        return this.updatedAtText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getInfoIcon() {
        return this.infoIcon;
    }

    @NotNull
    public final AccountCardState copy(@NotNull String id2, @NotNull String title, @NotNull String amountText, @NotNull String updatedAtText, @NotNull String rightIcon, @NotNull String infoIcon) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(updatedAtText, "updatedAtText");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        return new AccountCardState(id2, title, amountText, updatedAtText, rightIcon, infoIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCardState)) {
            return false;
        }
        AccountCardState accountCardState = (AccountCardState) other;
        return Intrinsics.d(this.id, accountCardState.id) && Intrinsics.d(this.title, accountCardState.title) && Intrinsics.d(this.amountText, accountCardState.amountText) && Intrinsics.d(this.updatedAtText, accountCardState.updatedAtText) && Intrinsics.d(this.rightIcon, accountCardState.rightIcon) && Intrinsics.d(this.infoIcon, accountCardState.infoIcon);
    }

    @NotNull
    public final String getAmountText() {
        return this.amountText;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInfoIcon() {
        return this.infoIcon;
    }

    @NotNull
    public final String getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUpdatedAtText() {
        return this.updatedAtText;
    }

    public int hashCode() {
        return this.infoIcon.hashCode() + g.a(g.a(g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.amountText), 31, this.updatedAtText), 31, this.rightIcon);
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
        String str3 = this.amountText;
        String str4 = this.updatedAtText;
        String str5 = this.rightIcon;
        String str6 = this.infoIcon;
        StringBuilder d11 = C3660k.d("AccountCardState(id=", str, ", title=", str2, ", amountText=");
        a.h(d11, str3, ", updatedAtText=", str4, ", rightIcon=");
        return C3173b.c(d11, str5, ", infoIcon=", str6, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
