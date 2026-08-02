package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import Pk0.a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "", "", "", "ids", "", "invertedMode", "isSingle", "<init>", "(Ljava/util/Set;Ljava/lang/Boolean;Z)V", "copy", "(Ljava/util/Set;Ljava/lang/Boolean;Z)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getIds", "()Ljava/util/Set;", "Ljava/lang/Boolean;", "getInvertedMode", "()Ljava/lang/Boolean;", "Z", "()Z", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Set<String> ids;
    private final Boolean invertedMode;
    private final boolean isSingle;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState$Companion;", "", "<init>", "()V", "createState", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "state", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "createState$filter_widgets_prodGoogleAllVendorsRelease", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FilterState createState$filter_widgets_prodGoogleAllVendorsRelease(@NotNull FilterValuesDTO.FilterInfo state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<String> activeValues = state.getActiveValues();
            LinkedHashSet X02 = activeValues != null ? C7714v.X0(activeValues) : new LinkedHashSet();
            Boolean isInverted = state.isInverted();
            Boolean valueOf = Boolean.valueOf(isInverted != null ? isInverted.booleanValue() : false);
            Boolean isSingle = state.isSingle();
            return new FilterState(X02, valueOf, isSingle != null ? isSingle.booleanValue() : false);
        }

        private Companion() {
        }
    }

    public FilterState(@NotNull Set<String> ids, Boolean bool, boolean z11) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.ids = ids;
        this.invertedMode = bool;
        this.isSingle = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterState copy$default(FilterState filterState, Set set, Boolean bool, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = filterState.ids;
        }
        if ((i11 & 2) != 0) {
            bool = filterState.invertedMode;
        }
        if ((i11 & 4) != 0) {
            z11 = filterState.isSingle;
        }
        return filterState.copy(set, bool, z11);
    }

    @NotNull
    public final FilterState copy(@NotNull Set<String> ids, Boolean invertedMode, boolean isSingle) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new FilterState(ids, invertedMode, isSingle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterState)) {
            return false;
        }
        FilterState filterState = (FilterState) other;
        return Intrinsics.d(this.ids, filterState.ids) && Intrinsics.d(this.invertedMode, filterState.invertedMode) && this.isSingle == filterState.isSingle;
    }

    @NotNull
    public final Set<String> getIds() {
        return this.ids;
    }

    public int hashCode() {
        int hashCode = this.ids.hashCode() * 31;
        Boolean bool = this.invertedMode;
        return Boolean.hashCode(this.isSingle) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    /* renamed from: isSingle, reason: from getter */
    public final boolean getIsSingle() {
        return this.isSingle;
    }

    @NotNull
    public String toString() {
        Set<String> set = this.ids;
        Boolean bool = this.invertedMode;
        boolean z11 = this.isSingle;
        StringBuilder sb2 = new StringBuilder("FilterState(ids=");
        sb2.append(set);
        sb2.append(", invertedMode=");
        sb2.append(bool);
        sb2.append(", isSingle=");
        return a.a(")", sb2, z11);
    }
}
