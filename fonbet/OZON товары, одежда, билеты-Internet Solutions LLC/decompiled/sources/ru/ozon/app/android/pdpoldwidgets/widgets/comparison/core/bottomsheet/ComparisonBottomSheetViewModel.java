package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import B90.C2607i;
import Mc.a;
import Nc.C3667a;
import android.annotation.SuppressLint;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import io.reactivex.InterfaceC7095c;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.ComparisonBottomSheetViewModel;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import vc.C10298c;
import xe.C10727i;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001cJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\u0004\b\u001f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R.\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f '*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010*\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\b0\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "comparisonRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;)V", "", "itemId", "", "isSelected", "", "setItemSelectionState", "(Ljava/lang/String;Z)V", SearchIntents.EXTRA_QUERY, "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "filterCharacteristics", "(Ljava/lang/String;)Ljava/util/List;", "characteristics", "submitInitialKeyCharacteristics", "(Ljava/util/List;)V", "onQueryTextChange", "(Ljava/lang/String;)V", "Lio/reactivex/p;", "observeCharacteristicsListChanges", "()Lio/reactivex/p;", "Lio/reactivex/b;", "clearSelectedCharacteristics", "()Lio/reactivex/b;", "setSelection", "submitSelectedCharacteristics", "observeSecondaryButtonsState", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "Ljava/util/LinkedList;", "keyCharacteristics", "Ljava/util/LinkedList;", "searchQuery", "Ljava/lang/String;", "LNc/a;", "kotlin.jvm.PlatformType", "characteristicsStateSubject", "LNc/a;", "secondaryButtonVisibilityStateSubject", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonBottomSheetViewModel extends w0 {

    @NotNull
    private final C3667a<List<CharacteristicsPickVO.CellData.CellDataValue>> characteristicsStateSubject;

    @NotNull
    private final ComparisonRepository comparisonRepository;

    @NotNull
    private final LinkedList<CharacteristicsPickVO.CellData.CellDataValue> keyCharacteristics;

    @NotNull
    private String searchQuery;

    @NotNull
    private final C3667a<Boolean> secondaryButtonVisibilityStateSubject;

    public ComparisonBottomSheetViewModel(@NotNull ComparisonRepository comparisonRepository) {
        Intrinsics.checkNotNullParameter(comparisonRepository, "comparisonRepository");
        this.comparisonRepository = comparisonRepository;
        this.keyCharacteristics = new LinkedList<>();
        this.searchQuery = "";
        C3667a<List<CharacteristicsPickVO.CellData.CellDataValue>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.characteristicsStateSubject = d11;
        C3667a<Boolean> d12 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.secondaryButtonVisibilityStateSubject = d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearSelectedCharacteristics$lambda$3(ComparisonBottomSheetViewModel comparisonBottomSheetViewModel) {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        LinkedList<CharacteristicsPickVO.CellData.CellDataValue> linkedList = comparisonBottomSheetViewModel.keyCharacteristics;
        ArrayList arrayList = new ArrayList(C7714v.z(linkedList, 10));
        for (CharacteristicsPickVO.CellData.CellDataValue cellDataValue : linkedList) {
            if (cellDataValue.getCell().isSelected()) {
                copy = r5.copy((r32 & 1) != 0 ? r5.isSelected : false, (r32 & 2) != 0 ? r5.isRadio : false, (r32 & 4) != 0 ? r5.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r5.title : null, (r32 & 16) != 0 ? r5.titleColor : null, (r32 & 32) != 0 ? r5.subtitle : null, (r32 & 64) != 0 ? r5.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r5.align : null, (r32 & 256) != 0 ? r5.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r5.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r5.hideSeparator : false, (r32 & 2048) != 0 ? r5.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r5.context : null, (r32 & 8192) != 0 ? r5.testInfo : null, (r32 & 16384) != 0 ? cellDataValue.getCell().trackingInfo : null);
                cellDataValue = CharacteristicsPickVO.CellData.CellDataValue.copy$default(cellDataValue, null, copy, null, null, 13, null);
            }
            arrayList.add(cellDataValue);
        }
        comparisonBottomSheetViewModel.searchQuery = "";
        comparisonBottomSheetViewModel.keyCharacteristics.clear();
        comparisonBottomSheetViewModel.keyCharacteristics.addAll(arrayList);
        comparisonBottomSheetViewModel.characteristicsStateSubject.onNext(comparisonBottomSheetViewModel.keyCharacteristics);
        comparisonBottomSheetViewModel.secondaryButtonVisibilityStateSubject.onNext(Boolean.FALSE);
        return Unit.f71690a;
    }

    @SuppressLint({"DefaultLocale"})
    private final List<CharacteristicsPickVO.CellData.CellDataValue> filterCharacteristics(String query) {
        LinkedList<CharacteristicsPickVO.CellData.CellDataValue> linkedList = this.keyCharacteristics;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            String obj2 = ((CharacteristicsPickVO.CellData.CellDataValue) obj).getCell().getTitle().toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
            if (h.t(h.w(obj2), h.w(query), false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void setItemSelectionState(String itemId, boolean isSelected) {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        Iterator<CharacteristicsPickVO.CellData.CellDataValue> it = this.keyCharacteristics.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(it.next().getId(), itemId)) {
                break;
            } else {
                i11++;
            }
        }
        CharacteristicsPickVO.CellData.CellDataValue remove = this.keyCharacteristics.remove(i11);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        CharacteristicsPickVO.CellData.CellDataValue cellDataValue = remove;
        copy = r5.copy((r32 & 1) != 0 ? r5.isSelected : isSelected, (r32 & 2) != 0 ? r5.isRadio : false, (r32 & 4) != 0 ? r5.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r5.title : null, (r32 & 16) != 0 ? r5.titleColor : null, (r32 & 32) != 0 ? r5.subtitle : null, (r32 & 64) != 0 ? r5.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r5.align : null, (r32 & 256) != 0 ? r5.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r5.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r5.hideSeparator : false, (r32 & 2048) != 0 ? r5.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r5.context : null, (r32 & 8192) != 0 ? r5.testInfo : null, (r32 & 16384) != 0 ? cellDataValue.getCell().trackingInfo : null);
        this.keyCharacteristics.add(i11, CharacteristicsPickVO.CellData.CellDataValue.copy$default(cellDataValue, null, copy, null, null, 13, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSelectedCharacteristics$lambda$5(ComparisonBottomSheetViewModel comparisonBottomSheetViewModel, InterfaceC7095c emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C10727i.c(x0.a(comparisonBottomSheetViewModel), null, null, new ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1(comparisonBottomSheetViewModel, emitter, null), 3);
    }

    @NotNull
    public final AbstractC7094b clearSelectedCharacteristics() {
        vc.h hVar = new vc.h(new Callable() { // from class: iF.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit clearSelectedCharacteristics$lambda$3;
                clearSelectedCharacteristics$lambda$3 = ComparisonBottomSheetViewModel.clearSelectedCharacteristics$lambda$3(ComparisonBottomSheetViewModel.this);
                return clearSelectedCharacteristics$lambda$3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(hVar, "fromCallable(...)");
        return hVar;
    }

    @NotNull
    public final p<List<CharacteristicsPickVO.CellData.CellDataValue>> observeCharacteristicsListChanges() {
        return this.characteristicsStateSubject;
    }

    @NotNull
    public final p<Boolean> observeSecondaryButtonsState() {
        p<Boolean> observeOn = this.secondaryButtonVisibilityStateSubject.distinctUntilChanged().subscribeOn(a.b()).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        return observeOn;
    }

    public final void onQueryTextChange(String query) {
        if (query == null || query.length() == 0) {
            this.characteristicsStateSubject.onNext(this.keyCharacteristics);
            return;
        }
        List<CharacteristicsPickVO.CellData.CellDataValue> filterCharacteristics = filterCharacteristics(query);
        this.searchQuery = query;
        this.characteristicsStateSubject.onNext(filterCharacteristics);
    }

    public final void setSelection(@NotNull String itemId, boolean isSelected) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        setItemSelectionState(itemId, isSelected);
        if (this.searchQuery.length() > 0) {
            this.characteristicsStateSubject.onNext(filterCharacteristics(this.searchQuery));
        } else {
            this.characteristicsStateSubject.onNext(this.keyCharacteristics);
        }
        LinkedList<CharacteristicsPickVO.CellData.CellDataValue> linkedList = this.keyCharacteristics;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((CharacteristicsPickVO.CellData.CellDataValue) obj).getCell().isSelected()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.secondaryButtonVisibilityStateSubject.onNext(Boolean.FALSE);
        } else {
            this.secondaryButtonVisibilityStateSubject.onNext(Boolean.TRUE);
        }
    }

    public final void submitInitialKeyCharacteristics(@NotNull List<CharacteristicsPickVO.CellData.CellDataValue> characteristics) {
        Object obj;
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        LinkedList<CharacteristicsPickVO.CellData.CellDataValue> linkedList = this.keyCharacteristics;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
        }
        linkedList.addAll(characteristics);
        this.characteristicsStateSubject.onNext(linkedList);
        Iterator<T> it = characteristics.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CharacteristicsPickVO.CellData.CellDataValue) obj).getCell().isSelected()) {
                    break;
                }
            }
        }
        if (obj != null) {
            this.secondaryButtonVisibilityStateSubject.onNext(Boolean.TRUE);
        }
    }

    @NotNull
    public final AbstractC7094b submitSelectedCharacteristics() {
        C10298c c10298c = new C10298c(new C2607i(this, 3));
        Intrinsics.checkNotNullExpressionValue(c10298c, "create(...)");
        return c10298c;
    }
}
