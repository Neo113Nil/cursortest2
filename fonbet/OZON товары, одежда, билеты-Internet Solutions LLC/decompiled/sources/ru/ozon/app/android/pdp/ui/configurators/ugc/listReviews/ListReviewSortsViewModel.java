package ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews;

import WZ.t;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewsSortsVO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;", "actionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO$Sort;", "items", "", "initSortItems", "(Ljava/util/List;)V", "", "pos", "invokeSort", "(I)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "sortItems", "Ljava/util/List;", "Action", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListReviewSortsViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData = new SingleLiveEvent<>();

    @NotNull
    private final List<ListReviewsSortsVO.Sort> sortItems = new ArrayList();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;", "", "LWZ/t;", "event", "<init>", "(LWZ/t;)V", "LWZ/t;", "getEvent", "()LWZ/t;", "SortAction", "SortDeeplink", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action$SortAction;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action$SortDeeplink;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {
        private final t event;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action$SortAction;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "event", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SortAction extends Action {

            @NotNull
            private final AtomAction action;
            private final t event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SortAction(@NotNull AtomAction action, t tVar) {
                super(tVar, null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SortAction)) {
                    return false;
                }
                SortAction sortAction = (SortAction) other;
                return Intrinsics.d(this.action, sortAction.action) && Intrinsics.d(this.event, sortAction.event);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel.Action
            public t getEvent() {
                return this.event;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                t tVar = this.event;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                return "SortAction(action=" + this.action + ", event=" + this.event + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action$SortDeeplink;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;", "", "deeplink", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "LWZ/t;", "getEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SortDeeplink extends Action {

            @NotNull
            private final String deeplink;
            private final t event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SortDeeplink(@NotNull String deeplink, t tVar) {
                super(tVar, null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SortDeeplink)) {
                    return false;
                }
                SortDeeplink sortDeeplink = (SortDeeplink) other;
                return Intrinsics.d(this.deeplink, sortDeeplink.deeplink) && Intrinsics.d(this.event, sortDeeplink.event);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel.Action
            public t getEvent() {
                return this.event;
            }

            public int hashCode() {
                int hashCode = this.deeplink.hashCode() * 31;
                t tVar = this.event;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                return "SortDeeplink(deeplink=" + this.deeplink + ", event=" + this.event + ")";
            }
        }

        public /* synthetic */ Action(t tVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar);
        }

        public t getEvent() {
            return this.event;
        }

        private Action(t tVar) {
            this.event = tVar;
        }
    }

    @NotNull
    public final SingleLiveEvent<Action> actionLiveData() {
        return this.actionLiveData;
    }

    public final void initSortItems(List<ListReviewsSortsVO.Sort> items) {
        if (items == null) {
            return;
        }
        this.sortItems.clear();
        this.sortItems.addAll(items);
    }

    public final void invokeSort(int pos) {
        ListReviewsSortsVO.Sort sort = (ListReviewsSortsVO.Sort) C7714v.Q(pos, this.sortItems);
        if (sort == null) {
            return;
        }
        if (sort.getSelectAction() == null) {
            this.actionLiveData.setValue(new Action.SortDeeplink(sort.getDeeplink(), sort.getTokenizedEvent()));
        } else {
            this.actionLiveData.setValue(new Action.SortAction(sort.getSelectAction(), sort.getTokenizedEvent()));
        }
    }
}
