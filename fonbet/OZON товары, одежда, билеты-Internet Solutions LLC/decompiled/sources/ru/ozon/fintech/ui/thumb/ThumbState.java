package ru.ozon.fintech.ui.thumb;

import B0.C2454a;
import Kk.C3532b;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJh\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0019R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001b¨\u0006/"}, d2 = {"Lru/ozon/fintech/ui/thumb/ThumbState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", ImagesContract.URL, "base64Key", "base64", "", "selected", "", "index", "Lkotlin/Function1;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/functions/Function1;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Z", "component6", "()I", "component7", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/functions/Function1;)Lru/ozon/fintech/ui/thumb/ThumbState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUrl", "getBase64Key", "getBase64", "Z", "getSelected", "I", "getIndex", "Lkotlin/jvm/functions/Function1;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ThumbState implements RecyclerItem {
    private final String base64;
    private final String base64Key;

    @NotNull
    private final String id;
    private final int index;

    @NotNull
    private final Function1<Integer, Unit> onClick;
    private final boolean selected;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbState(@NotNull String id2, String str, String str2, String str3, boolean z11, int i11, @NotNull Function1<? super Integer, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.url = str;
        this.base64Key = str2;
        this.base64 = str3;
        this.selected = z11;
        this.index = i11;
        this.onClick = onClick;
    }

    public static /* synthetic */ ThumbState copy$default(ThumbState thumbState, String str, String str2, String str3, String str4, boolean z11, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = thumbState.id;
        }
        if ((i12 & 2) != 0) {
            str2 = thumbState.url;
        }
        if ((i12 & 4) != 0) {
            str3 = thumbState.base64Key;
        }
        if ((i12 & 8) != 0) {
            str4 = thumbState.base64;
        }
        if ((i12 & 16) != 0) {
            z11 = thumbState.selected;
        }
        if ((i12 & 32) != 0) {
            i11 = thumbState.index;
        }
        if ((i12 & 64) != 0) {
            function1 = thumbState.onClick;
        }
        int i13 = i11;
        Function1 function12 = function1;
        boolean z12 = z11;
        String str5 = str3;
        return thumbState.copy(str, str2, str5, str4, z12, i13, function12);
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
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBase64Key() {
        return this.base64Key;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Function1<Integer, Unit> component7() {
        return this.onClick;
    }

    @NotNull
    public final ThumbState copy(@NotNull String id2, String url, String base64Key, String base64, boolean selected, int index, @NotNull Function1<? super Integer, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new ThumbState(id2, url, base64Key, base64, selected, index, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbState)) {
            return false;
        }
        ThumbState thumbState = (ThumbState) other;
        return Intrinsics.d(this.id, thumbState.id) && Intrinsics.d(this.url, thumbState.url) && Intrinsics.d(this.base64Key, thumbState.base64Key) && Intrinsics.d(this.base64, thumbState.base64) && this.selected == thumbState.selected && this.index == thumbState.index && Intrinsics.d(this.onClick, thumbState.onClick);
    }

    public final String getBase64() {
        return this.base64;
    }

    public final String getBase64Key() {
        return this.base64Key;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnClick() {
        return this.onClick;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.base64Key;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.base64;
        return this.onClick.hashCode() + C2454a.a(this.index, C3532b.a((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.selected), 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.url;
        String str3 = this.base64Key;
        String str4 = this.base64;
        boolean z11 = this.selected;
        int i11 = this.index;
        Function1<Integer, Unit> function1 = this.onClick;
        StringBuilder d11 = C3660k.d("ThumbState(id=", str, ", url=", str2, ", base64Key=");
        Nh.a.h(d11, str3, ", base64=", str4, ", selected=");
        d11.append(z11);
        d11.append(", index=");
        d11.append(i11);
        d11.append(", onClick=");
        d11.append(function1);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
