package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import A00.a;
import Fj.c;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellVO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/UpdateCountSelectors;", "LA00/a$J$a;", "", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "updatedCells", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "ageSelectors", "", "isChildrenAgeAnnotationVisible", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getUpdatedCells", "()Ljava/util/List;", "getAgeSelectors", "Z", "()Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateCountSelectors implements a.J.InterfaceC0007a {

    @NotNull
    private final List<TouristCountSelectorVO.AgeSelectorVO> ageSelectors;
    private final boolean isChildrenAgeAnnotationVisible;

    @NotNull
    private final List<QuantityCellVO> updatedCells;

    public UpdateCountSelectors(@NotNull List<QuantityCellVO> updatedCells, @NotNull List<TouristCountSelectorVO.AgeSelectorVO> ageSelectors, boolean z11) {
        Intrinsics.checkNotNullParameter(updatedCells, "updatedCells");
        Intrinsics.checkNotNullParameter(ageSelectors, "ageSelectors");
        this.updatedCells = updatedCells;
        this.ageSelectors = ageSelectors;
        this.isChildrenAgeAnnotationVisible = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCountSelectors)) {
            return false;
        }
        UpdateCountSelectors updateCountSelectors = (UpdateCountSelectors) other;
        return Intrinsics.d(this.updatedCells, updateCountSelectors.updatedCells) && Intrinsics.d(this.ageSelectors, updateCountSelectors.ageSelectors) && this.isChildrenAgeAnnotationVisible == updateCountSelectors.isChildrenAgeAnnotationVisible;
    }

    @NotNull
    public final List<TouristCountSelectorVO.AgeSelectorVO> getAgeSelectors() {
        return this.ageSelectors;
    }

    @NotNull
    public final List<QuantityCellVO> getUpdatedCells() {
        return this.updatedCells;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChildrenAgeAnnotationVisible) + g.b(this.updatedCells.hashCode() * 31, 31, this.ageSelectors);
    }

    /* renamed from: isChildrenAgeAnnotationVisible, reason: from getter */
    public final boolean getIsChildrenAgeAnnotationVisible() {
        return this.isChildrenAgeAnnotationVisible;
    }

    @NotNull
    public String toString() {
        List<QuantityCellVO> list = this.updatedCells;
        List<TouristCountSelectorVO.AgeSelectorVO> list2 = this.ageSelectors;
        return Pk0.a.a(")", c.d("UpdateCountSelectors(updatedCells=", list, ", ageSelectors=", ", isChildrenAgeAnnotationVisible=", list2), this.isChildrenAgeAnnotationVisible);
    }
}
