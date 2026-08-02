package ru.ozon.app.android.checkoutcomposer.sbp.search.presentation;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "", SearchIntents.EXTRA_QUERY, "filter", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "isMatchQuery", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;Ljava/lang/String;)Z", "", "onSearchQueryChanged", "(Ljava/lang/String;)V", "bankCells", "onBanksChanged", "(Ljava/util/List;)V", "LAe/x0;", "_queryFlow", "LAe/x0;", "bankCellsFlow", "LAe/M0;", "queryFlow", "LAe/M0;", "getQueryFlow", "()LAe/M0;", "LAe/h;", "filteredBankCellsFlow", "LAe/h;", "getFilteredBankCellsFlow", "()LAe/h;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBankListViewModel extends w0 {

    @NotNull
    private final x0<String> _queryFlow;

    @NotNull
    private final x0<List<CellAtom.CellAtomWithSubtitle>> bankCellsFlow;

    @NotNull
    private final InterfaceC2395h<List<CellAtom.CellAtomWithSubtitle>> filteredBankCellsFlow;

    @NotNull
    private final M0<String> queryFlow;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewModel$Companion;", "", "<init>", "()V", "FILTER_DEBOUNCE_TIMEOUT_MILLIS", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchBankListViewModel() {
        x0<String> a11 = O0.a("");
        this._queryFlow = a11;
        x0<List<CellAtom.CellAtomWithSubtitle>> a12 = O0.a(K.f71697a);
        this.bankCellsFlow = a12;
        this.queryFlow = C2399j.b(a11);
        this.filteredBankCellsFlow = new C2417s0(C2399j.l(a11, 300L), a12, new SearchBankListViewModel$filteredBankCellsFlow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CellAtom.CellAtomWithSubtitle> filter(List<? extends CellAtom.CellAtomWithSubtitle> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (isMatchQuery((CellAtom.CellAtomWithSubtitle) obj, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean isMatchQuery(CellAtom.CellAtomWithSubtitle cellAtomWithSubtitle, String str) {
        OzonSpannableString subtitle;
        return h.t(cellAtomWithSubtitle.getTitle(), str, true) || ((subtitle = cellAtomWithSubtitle.getSubtitle()) != null && h.t(subtitle, str, true));
    }

    @NotNull
    public final InterfaceC2395h<List<CellAtom.CellAtomWithSubtitle>> getFilteredBankCellsFlow() {
        return this.filteredBankCellsFlow;
    }

    @NotNull
    public final M0<String> getQueryFlow() {
        return this.queryFlow;
    }

    public final void onBanksChanged(@NotNull List<? extends CellAtom.CellAtomWithSubtitle> bankCells) {
        Intrinsics.checkNotNullParameter(bankCells, "bankCells");
        this.bankCellsFlow.setValue(bankCells);
    }

    public final void onSearchQueryChanged(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._queryFlow.setValue(query);
    }
}
