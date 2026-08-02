package ru.ozon.fintech.features.offline.ui.bank;

import B4.V;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/fintech/features/offline/ui/bank/OfflineBankState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "image", "imageRes", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getImage", "getImageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lru/ozon/fintech/features/offline/ui/bank/OfflineBankState;", "equals", "", "other", "", "hashCode", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfflineBankState implements RecyclerItem {

    @NotNull
    private final String id;
    private final String image;
    private final Integer imageRes;

    @NotNull
    private final Function1<String, Unit> onClick;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineBankState(@NotNull String id2, String str, Integer num, String str2, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.image = str;
        this.imageRes = num;
        this.title = str2;
        this.onClick = onClick;
    }

    public static /* synthetic */ OfflineBankState copy$default(OfflineBankState offlineBankState, String str, String str2, Integer num, String str3, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlineBankState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = offlineBankState.image;
        }
        if ((i11 & 4) != 0) {
            num = offlineBankState.imageRes;
        }
        if ((i11 & 8) != 0) {
            str3 = offlineBankState.title;
        }
        if ((i11 & 16) != 0) {
            function1 = offlineBankState.onClick;
        }
        Function1 function12 = function1;
        Integer num2 = num;
        return offlineBankState.copy(str, str2, num2, str3, function12);
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
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getImageRes() {
        return this.imageRes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Function1<String, Unit> component5() {
        return this.onClick;
    }

    @NotNull
    public final OfflineBankState copy(@NotNull String id2, String image, Integer imageRes, String title, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new OfflineBankState(id2, image, imageRes, title, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineBankState)) {
            return false;
        }
        OfflineBankState offlineBankState = (OfflineBankState) other;
        return Intrinsics.d(this.id, offlineBankState.id) && Intrinsics.d(this.image, offlineBankState.image) && Intrinsics.d(this.imageRes, offlineBankState.imageRes) && Intrinsics.d(this.title, offlineBankState.title) && Intrinsics.d(this.onClick, offlineBankState.onClick);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Integer getImageRes() {
        return this.imageRes;
    }

    @NotNull
    public final Function1<String, Unit> getOnClick() {
        return this.onClick;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.imageRes;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        return this.onClick.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.image;
        Integer num = this.imageRes;
        String str3 = this.title;
        Function1<String, Unit> function1 = this.onClick;
        StringBuilder d11 = C3660k.d("OfflineBankState(id=", str, ", image=", str2, ", imageRes=");
        V.f(num, ", title=", str3, ", onClick=", d11);
        d11.append(function1);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
