package ru.ozon.app.android.common.filterWidgets.filtervalues.data.buttonstate;

import Nc.C3667a;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterState;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ1\u0010\u0010\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\r0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/buttonstate/ButtonEnabledStore;", "", "<init>", "()V", "", "compareStates", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "state", "", "id", "toggleSingle", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;Ljava/lang/String;)V", "toggleMulti", "Lio/reactivex/p;", "", "kotlin.jvm.PlatformType", "observe", "()Lio/reactivex/p;", "putInitial", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;)V", "toggle", "(Ljava/lang/String;)V", "toggleSingleItem", "selectAll", "unSelectAll", "initialFilterState", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterState;", "currentState", "LNc/a;", "filterState", "LNc/a;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonEnabledStore {
    private FilterState currentState;

    @NotNull
    private final C3667a<Boolean> filterState;
    private FilterState initialFilterState;

    public ButtonEnabledStore() {
        C3667a<Boolean> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.filterState = d11;
    }

    private final void compareStates() {
        this.filterState.onNext(Boolean.valueOf(!Intrinsics.d(this.currentState, this.initialFilterState)));
    }

    private final void toggleMulti(FilterState state, String id2) {
        if (state.getIds().contains(id2)) {
            state.getIds().remove(id2);
        } else {
            state.getIds().add(id2);
        }
    }

    private final void toggleSingle(FilterState state, String id2) {
        boolean contains = state.getIds().contains(id2);
        state.getIds().clear();
        if (contains) {
            return;
        }
        state.getIds().add(id2);
    }

    public final p<Boolean> observe() {
        return this.filterState.hide();
    }

    public final void putInitial(@NotNull FilterState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.initialFilterState = state;
        Set<String> ids = state.getIds();
        ArrayList arrayList = new ArrayList(C7714v.z(ids, 10));
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        this.currentState = FilterState.copy$default(state, C7714v.X0(arrayList), null, false, 6, null);
        this.filterState.onNext(Boolean.FALSE);
    }

    public final void selectAll() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Boolean bool = Boolean.TRUE;
        FilterState filterState = this.initialFilterState;
        this.currentState = new FilterState(linkedHashSet, bool, filterState != null ? filterState.getIsSingle() : false);
        compareStates();
    }

    public final void toggle(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        FilterState filterState = this.currentState;
        if (filterState == null) {
            return;
        }
        toggleMulti(filterState, id2);
        compareStates();
    }

    public final void toggleSingleItem(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        FilterState filterState = this.currentState;
        if (filterState == null) {
            return;
        }
        toggleSingle(filterState, id2);
        compareStates();
    }

    public final void unSelectAll() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Boolean bool = Boolean.FALSE;
        FilterState filterState = this.initialFilterState;
        this.currentState = new FilterState(linkedHashSet, bool, filterState != null ? filterState.getIsSingle() : false);
        compareStates();
    }
}
