package ru.ozon.fintech.features.offline.ui.my;

import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/features/offline/ui/my/OfflineMyContactState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "number", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getName", "getNumber", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfflineMyContactState implements RecyclerItem {

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final String number;

    @NotNull
    private final Function1<String, Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineMyContactState(@NotNull String id2, @NotNull String name, @NotNull String number, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.name = name;
        this.number = number;
        this.onClick = onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflineMyContactState copy$default(OfflineMyContactState offlineMyContactState, String str, String str2, String str3, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlineMyContactState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = offlineMyContactState.name;
        }
        if ((i11 & 4) != 0) {
            str3 = offlineMyContactState.number;
        }
        if ((i11 & 8) != 0) {
            function1 = offlineMyContactState.onClick;
        }
        return offlineMyContactState.copy(str, str2, str3, function1);
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
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final Function1<String, Unit> component4() {
        return this.onClick;
    }

    @NotNull
    public final OfflineMyContactState copy(@NotNull String id2, @NotNull String name, @NotNull String number, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new OfflineMyContactState(id2, name, number, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineMyContactState)) {
            return false;
        }
        OfflineMyContactState offlineMyContactState = (OfflineMyContactState) other;
        return Intrinsics.d(this.id, offlineMyContactState.id) && Intrinsics.d(this.name, offlineMyContactState.name) && Intrinsics.d(this.number, offlineMyContactState.number) && Intrinsics.d(this.onClick, offlineMyContactState.onClick);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final Function1<String, Unit> getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        return this.onClick.hashCode() + g.a(g.a(this.id.hashCode() * 31, 31, this.name), 31, this.number);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.number;
        Function1<String, Unit> function1 = this.onClick;
        StringBuilder d11 = C3660k.d("OfflineMyContactState(id=", str, ", name=", str2, ", number=");
        d11.append(str3);
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
