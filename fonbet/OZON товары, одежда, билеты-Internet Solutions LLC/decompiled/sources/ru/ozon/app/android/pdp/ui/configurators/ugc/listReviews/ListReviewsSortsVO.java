package ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews;

import D40.a;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Tl.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO$Sort;", "sorts", "", "selectedSortName", "", "bottomPaddingEnabled", "<init>", "(JLjava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSorts", "()Ljava/util/List;", "Ljava/lang/String;", "getSelectedSortName", "Z", "getBottomPaddingEnabled", "()Z", "Sort", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ListReviewsSortsVO implements c {
    private final boolean bottomPaddingEnabled;
    private final long id;
    private final String selectedSortName;
    private final List<Sort> sorts;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewsSortsVO$Sort;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "deeplink", "", "isSelected", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;ZLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDeeplink", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sort {

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String name;
        private final AtomAction selectAction;
        private final t tokenizedEvent;

        public Sort(@NotNull String name, AtomAction atomAction, @NotNull String deeplink, boolean z11, t tVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.name = name;
            this.selectAction = atomAction;
            this.deeplink = deeplink;
            this.isSelected = z11;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sort)) {
                return false;
            }
            Sort sort = (Sort) other;
            return Intrinsics.d(this.name, sort.name) && Intrinsics.d(this.selectAction, sort.selectAction) && Intrinsics.d(this.deeplink, sort.deeplink) && this.isSelected == sort.isSelected && Intrinsics.d(this.tokenizedEvent, sort.tokenizedEvent);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final AtomAction getSelectAction() {
            return this.selectAction;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            AtomAction atomAction = this.selectAction;
            int a11 = C3532b.a(g.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.deeplink), 31, this.isSelected);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.name;
            AtomAction atomAction = this.selectAction;
            String str2 = this.deeplink;
            boolean z11 = this.isSelected;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("Sort(name=");
            sb2.append(str);
            sb2.append(", selectAction=");
            sb2.append(atomAction);
            sb2.append(", deeplink=");
            C2880a.c(str2, ", isSelected=", ", tokenizedEvent=", sb2, z11);
            return b.d(sb2, tVar, ")");
        }
    }

    public ListReviewsSortsVO(long j11, List<Sort> list, String str, boolean z11) {
        this.id = j11;
        this.sorts = list;
        this.selectedSortName = str;
        this.bottomPaddingEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListReviewsSortsVO)) {
            return false;
        }
        ListReviewsSortsVO listReviewsSortsVO = (ListReviewsSortsVO) other;
        return this.id == listReviewsSortsVO.id && Intrinsics.d(this.sorts, listReviewsSortsVO.sorts) && Intrinsics.d(this.selectedSortName, listReviewsSortsVO.selectedSortName) && this.bottomPaddingEnabled == listReviewsSortsVO.bottomPaddingEnabled;
    }

    public final boolean getBottomPaddingEnabled() {
        return this.bottomPaddingEnabled;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSelectedSortName() {
        return this.selectedSortName;
    }

    public final List<Sort> getSorts() {
        return this.sorts;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<Sort> list = this.sorts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.selectedSortName;
        return Boolean.hashCode(this.bottomPaddingEnabled) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Sort> list = this.sorts;
        String str = this.selectedSortName;
        boolean z11 = this.bottomPaddingEnabled;
        StringBuilder b11 = Lh.b.b(j11, "ListReviewsSortsVO(id=", ", sorts=", list);
        a.g(", selectedSortName=", str, ", bottomPaddingEnabled=", b11, z11);
        b11.append(")");
        return b11.toString();
    }
}
