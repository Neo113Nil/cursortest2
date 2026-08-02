package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ClearVariantsItem;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ClearVariantsItem extends ListItem {

    @NotNull
    private final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearVariantsItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearVariantsItem) && Intrinsics.d(this.id, ((ClearVariantsItem) other).id);
    }

    @Override // ru.ozon.app.android.abtool.presentation.abvariants.recycler.ListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("ClearVariantsItem(id=", this.id, ")");
    }

    public /* synthetic */ ClearVariantsItem(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "clearAllVariantsItem" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearVariantsItem(@NotNull String id2) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }
}
