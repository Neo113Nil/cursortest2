package ru.ozon.fintech.features.offline.ui.permisson;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/fintech/features/offline/ui/permisson/OfflinePermissionContactState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "iconRes", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getId", "()Ljava/lang/String;", "getIconRes", "()I", "getTitle", "getSubTitle", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "provideId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfflinePermissionContactState implements RecyclerItem {
    private final int iconRes;

    @NotNull
    private final String id;

    @NotNull
    private final Function0<Unit> onClick;

    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    public OfflinePermissionContactState(@NotNull String id2, int i11, @NotNull String title, @NotNull String subTitle, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.iconRes = i11;
        this.title = title;
        this.subTitle = subTitle;
        this.onClick = onClick;
    }

    public static /* synthetic */ OfflinePermissionContactState copy$default(OfflinePermissionContactState offlinePermissionContactState, String str, int i11, String str2, String str3, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = offlinePermissionContactState.id;
        }
        if ((i12 & 2) != 0) {
            i11 = offlinePermissionContactState.iconRes;
        }
        if ((i12 & 4) != 0) {
            str2 = offlinePermissionContactState.title;
        }
        if ((i12 & 8) != 0) {
            str3 = offlinePermissionContactState.subTitle;
        }
        if ((i12 & 16) != 0) {
            function0 = offlinePermissionContactState.onClick;
        }
        Function0 function02 = function0;
        String str4 = str2;
        return offlinePermissionContactState.copy(str, i11, str4, str3, function02);
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
    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.onClick;
    }

    @NotNull
    public final OfflinePermissionContactState copy(@NotNull String id2, int iconRes, @NotNull String title, @NotNull String subTitle, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new OfflinePermissionContactState(id2, iconRes, title, subTitle, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflinePermissionContactState)) {
            return false;
        }
        OfflinePermissionContactState offlinePermissionContactState = (OfflinePermissionContactState) other;
        return Intrinsics.d(this.id, offlinePermissionContactState.id) && this.iconRes == offlinePermissionContactState.iconRes && Intrinsics.d(this.title, offlinePermissionContactState.title) && Intrinsics.d(this.subTitle, offlinePermissionContactState.subTitle) && Intrinsics.d(this.onClick, offlinePermissionContactState.onClick);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.onClick.hashCode() + g.a(g.a(C2454a.a(this.iconRes, this.id.hashCode() * 31, 31), 31, this.title), 31, this.subTitle);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i11 = this.iconRes;
        String str2 = this.title;
        String str3 = this.subTitle;
        Function0<Unit> function0 = this.onClick;
        StringBuilder c11 = C3660k.c(i11, "OfflinePermissionContactState(id=", str, ", iconRes=", ", title=");
        a.h(c11, str2, ", subTitle=", str3, ", onClick=");
        c11.append(function0);
        c11.append(")");
        return c11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
