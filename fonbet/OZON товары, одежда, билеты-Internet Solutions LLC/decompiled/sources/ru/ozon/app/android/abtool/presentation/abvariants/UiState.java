package ru.ozon.app.android.abtool.presentation.abvariants;

import B90.C2618u;
import K1.G;
import Kk.C3532b;
import Pk0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantItem;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/UiState;", "", "", "isClearVariantsEnabled", "", "variantsInput", "isValidVariantsInput", "isAddVariantsEnabled", "", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "items", "<init>", "(ZLjava/lang/String;ZZLjava/util/List;)V", "copy", "(ZLjava/lang/String;ZZLjava/util/List;)Lru/ozon/app/android/abtool/presentation/abvariants/UiState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getVariantsInput", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiState {
    private final boolean isAddVariantsEnabled;
    private final boolean isClearVariantsEnabled;
    private final boolean isValidVariantsInput;

    @NotNull
    private final List<VariantItem> items;
    private final String variantsInput;

    public UiState() {
        this(false, null, false, false, null, 31, null);
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, boolean z11, String str, boolean z12, boolean z13, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uiState.isClearVariantsEnabled;
        }
        if ((i11 & 2) != 0) {
            str = uiState.variantsInput;
        }
        if ((i11 & 4) != 0) {
            z12 = uiState.isValidVariantsInput;
        }
        if ((i11 & 8) != 0) {
            z13 = uiState.isAddVariantsEnabled;
        }
        if ((i11 & 16) != 0) {
            list = uiState.items;
        }
        List list2 = list;
        boolean z14 = z12;
        return uiState.copy(z11, str, z14, z13, list2);
    }

    @NotNull
    public final UiState copy(boolean isClearVariantsEnabled, String variantsInput, boolean isValidVariantsInput, boolean isAddVariantsEnabled, @NotNull List<VariantItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new UiState(isClearVariantsEnabled, variantsInput, isValidVariantsInput, isAddVariantsEnabled, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return this.isClearVariantsEnabled == uiState.isClearVariantsEnabled && Intrinsics.d(this.variantsInput, uiState.variantsInput) && this.isValidVariantsInput == uiState.isValidVariantsInput && this.isAddVariantsEnabled == uiState.isAddVariantsEnabled && Intrinsics.d(this.items, uiState.items);
    }

    @NotNull
    public final List<VariantItem> getItems() {
        return this.items;
    }

    public final String getVariantsInput() {
        return this.variantsInput;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isClearVariantsEnabled) * 31;
        String str = this.variantsInput;
        return this.items.hashCode() + C3532b.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isValidVariantsInput), 31, this.isAddVariantsEnabled);
    }

    /* renamed from: isAddVariantsEnabled, reason: from getter */
    public final boolean getIsAddVariantsEnabled() {
        return this.isAddVariantsEnabled;
    }

    /* renamed from: isClearVariantsEnabled, reason: from getter */
    public final boolean getIsClearVariantsEnabled() {
        return this.isClearVariantsEnabled;
    }

    /* renamed from: isValidVariantsInput, reason: from getter */
    public final boolean getIsValidVariantsInput() {
        return this.isValidVariantsInput;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isClearVariantsEnabled;
        String str = this.variantsInput;
        boolean z12 = this.isValidVariantsInput;
        boolean z13 = this.isAddVariantsEnabled;
        List<VariantItem> list = this.items;
        StringBuilder d11 = G.d("UiState(isClearVariantsEnabled=", ", variantsInput=", str, ", isValidVariantsInput=", z11);
        f.c(", isAddVariantsEnabled=", ", items=", d11, z12, z13);
        return C2618u.h(d11, list, ")");
    }

    public UiState(boolean z11, String str, boolean z12, boolean z13, @NotNull List<VariantItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.isClearVariantsEnabled = z11;
        this.variantsInput = str;
        this.isValidVariantsInput = z12;
        this.isAddVariantsEnabled = z13;
        this.items = items;
    }

    public UiState(boolean z11, String str, boolean z12, boolean z13, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? K.f71697a : list);
    }
}
