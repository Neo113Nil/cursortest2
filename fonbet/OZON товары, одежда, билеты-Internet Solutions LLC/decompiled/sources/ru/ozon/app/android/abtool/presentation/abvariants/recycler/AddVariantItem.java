package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/AddVariantItem;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;", "", "id", "variantsInput", "", "isValidVariantsInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getVariantsInput", "Z", "()Z", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddVariantItem extends ListItem {

    @NotNull
    private final String id;
    private final boolean isValidVariantsInput;
    private final String variantsInput;

    public AddVariantItem() {
        this(null, null, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddVariantItem)) {
            return false;
        }
        AddVariantItem addVariantItem = (AddVariantItem) other;
        return Intrinsics.d(this.id, addVariantItem.id) && Intrinsics.d(this.variantsInput, addVariantItem.variantsInput) && this.isValidVariantsInput == addVariantItem.isValidVariantsInput;
    }

    @Override // ru.ozon.app.android.abtool.presentation.abvariants.recycler.ListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getVariantsInput() {
        return this.variantsInput;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.variantsInput;
        return Boolean.hashCode(this.isValidVariantsInput) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* renamed from: isValidVariantsInput, reason: from getter */
    public final boolean getIsValidVariantsInput() {
        return this.isValidVariantsInput;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.variantsInput;
        return Pk0.a.a(")", C3660k.d("AddVariantItem(id=", str, ", variantsInput=", str2, ", isValidVariantsInput="), this.isValidVariantsInput);
    }

    public /* synthetic */ AddVariantItem(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "addVariantItem" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddVariantItem(@NotNull String id2, String str, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.variantsInput = str;
        this.isValidVariantsInput = z11;
    }
}
