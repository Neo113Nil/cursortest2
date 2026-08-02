package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0011J\u001b\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015¢\u0006\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0011R$\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'R$\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010'R$\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R$\u0010.\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010'R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010'R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/ReviewFormModalViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "index", "Lru/ozon/composer/ui/widget/l;", "item", "", "isHidden", "(ILru/ozon/composer/ui/widget/l;)Z", "viewItem", "applyExpandState", "(Lru/ozon/composer/ui/widget/l;)Lru/ozon/composer/ui/widget/l;", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "setExpanded", "(Z)V", "visible", "setHidableVisible", "setMediaPickerVisible", "", "currentItems", "filterItems", "(Ljava/util/List;)Z", "updateItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "media", "syncMediaPickerItems", "", "_originalItems", "Ljava/util/List;", "", "hidableIndices", "Ljava/util/Set;", "hasRevealed", "Z", "getHasRevealed", "()Z", "setHasRevealed", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isFiltered", "isExpanded", "areHidableVisible", "getAreHidableVisible", "isMediaPickerVisible", "getHasHidable", "hasHidable", "getOriginalItems", "()Ljava/util/List;", "originalItems", "getDisplayedItems", "displayedItems", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormModalViewModel extends w0 {
    private boolean areHidableVisible;
    private boolean hasRevealed;
    private boolean isExpanded;
    private boolean isFiltered;

    @NotNull
    private final List<l> _originalItems = new ArrayList();

    @NotNull
    private final Set<Integer> hidableIndices = new LinkedHashSet();
    private boolean isMediaPickerVisible = true;

    private final l applyExpandState(l viewItem) {
        MediaPickerVO copy;
        c d11 = viewItem.d();
        MediaPickerVO mediaPickerVO = d11 instanceof MediaPickerVO ? (MediaPickerVO) d11 : null;
        if (mediaPickerVO == null || mediaPickerVO.getIsExpanded() == this.areHidableVisible) {
            return viewItem;
        }
        b i11 = viewItem.i();
        copy = mediaPickerVO.copy((r35 & 1) != 0 ? mediaPickerVO.id : 0L, (r35 & 2) != 0 ? mediaPickerVO.items : null, (r35 & 4) != 0 ? mediaPickerVO.pickerItem : null, (r35 & 8) != 0 ? mediaPickerVO.removeIcon : null, (r35 & 16) != 0 ? mediaPickerVO.playIcon : null, (r35 & 32) != 0 ? mediaPickerVO.emptyItem : null, (r35 & 64) != 0 ? mediaPickerVO.maxItemsCount : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? mediaPickerVO.photoConfig : null, (r35 & 256) != 0 ? mediaPickerVO.videoConfig : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? mediaPickerVO.uploadEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? mediaPickerVO.uploadErrorEvent : null, (r35 & 2048) != 0 ? mediaPickerVO.hidePickerBadgeCondition : null, (r35 & 4096) != 0 ? mediaPickerVO.onBoardingConfigVO : null, (r35 & 8192) != 0 ? mediaPickerVO.isExpanded : this.areHidableVisible, (r35 & 16384) != 0 ? mediaPickerVO.isModal : false);
        return (l) viewItem.b(b.a(i11, copy, null, null, 253));
    }

    private final boolean isHidden(int index, l item) {
        if (this.areHidableVisible) {
            return false;
        }
        return item.d() instanceof MediaPickerVO ? !this.isMediaPickerVisible : this.hidableIndices.contains(Integer.valueOf(index));
    }

    public final boolean filterItems(@NotNull List<l> currentItems) {
        Intrinsics.checkNotNullParameter(currentItems, "currentItems");
        if (this.isFiltered) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            for (l lVar : currentItems) {
                if (lVar.d() instanceof HidableIndicatorVO) {
                    break;
                }
                if (z12) {
                    this.hidableIndices.add(Integer.valueOf(this._originalItems.size()));
                    z12 = false;
                }
                this._originalItems.add(lVar);
            }
            this.isFiltered = true;
            return z11;
            z11 = true;
        }
    }

    public final boolean getAreHidableVisible() {
        return this.areHidableVisible;
    }

    @NotNull
    public final List<l> getDisplayedItems() {
        List<l> list = this._originalItems;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (!isHidden(i11, (l) obj)) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(applyExpandState((l) it.next()));
        }
        return arrayList2;
    }

    public final boolean getHasHidable() {
        return !this.hidableIndices.isEmpty();
    }

    public final boolean getHasRevealed() {
        return this.hasRevealed;
    }

    @NotNull
    public final List<l> getOriginalItems() {
        return this._originalItems;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isFiltered, reason: from getter */
    public final boolean getIsFiltered() {
        return this.isFiltered;
    }

    /* renamed from: isMediaPickerVisible, reason: from getter */
    public final boolean getIsMediaPickerVisible() {
        return this.isMediaPickerVisible;
    }

    public final void setExpanded(boolean expanded) {
        this.isExpanded = expanded;
    }

    public final void setHasRevealed(boolean z11) {
        this.hasRevealed = z11;
    }

    public final void setHidableVisible(boolean visible) {
        this.areHidableVisible = visible;
    }

    public final void setMediaPickerVisible(boolean visible) {
        this.isMediaPickerVisible = visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncMediaPickerItems(@NotNull List<? extends MediaPickerVO.MediaVO> media) {
        int i11;
        MediaPickerVO copy;
        Intrinsics.checkNotNullParameter(media, "media");
        Iterator<l> it = this._originalItems.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else {
                if (it.next().d() instanceof MediaPickerVO) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 == -1) {
            return;
        }
        l lVar = this._originalItems.get(i11);
        c d11 = lVar.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO");
        MediaPickerVO mediaPickerVO = (MediaPickerVO) d11;
        if (Intrinsics.d(mediaPickerVO.getItems(), media)) {
            return;
        }
        List<l> list = this._originalItems;
        b i13 = lVar.i();
        int i14 = i11;
        copy = mediaPickerVO.copy((r35 & 1) != 0 ? mediaPickerVO.id : 0L, (r35 & 2) != 0 ? mediaPickerVO.items : media, (r35 & 4) != 0 ? mediaPickerVO.pickerItem : null, (r35 & 8) != 0 ? mediaPickerVO.removeIcon : null, (r35 & 16) != 0 ? mediaPickerVO.playIcon : null, (r35 & 32) != 0 ? mediaPickerVO.emptyItem : null, (r35 & 64) != 0 ? mediaPickerVO.maxItemsCount : 0, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? mediaPickerVO.photoConfig : null, (r35 & 256) != 0 ? mediaPickerVO.videoConfig : null, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? mediaPickerVO.uploadEvent : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? mediaPickerVO.uploadErrorEvent : null, (r35 & 2048) != 0 ? mediaPickerVO.hidePickerBadgeCondition : null, (r35 & 4096) != 0 ? mediaPickerVO.onBoardingConfigVO : null, (r35 & 8192) != 0 ? mediaPickerVO.isExpanded : false, (r35 & 16384) != 0 ? mediaPickerVO.isModal : false);
        list.set(i14, lVar.b(b.a(i13, copy, null, null, 253)));
    }

    public final void updateItems(@NotNull List<l> currentItems) {
        Intrinsics.checkNotNullParameter(currentItems, "currentItems");
        if (this._originalItems.isEmpty() || currentItems.isEmpty()) {
            return;
        }
        Iterator<T> it = this._originalItems.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = i11 + 1;
            if (isHidden(i11, (l) it.next())) {
                i11 = i13;
            } else {
                int i14 = i12 + 1;
                l lVar = (l) C7714v.Q(i12, currentItems);
                if (lVar != null) {
                    this._originalItems.set(i11, lVar);
                }
                i11 = i13;
                i12 = i14;
            }
        }
    }
}
