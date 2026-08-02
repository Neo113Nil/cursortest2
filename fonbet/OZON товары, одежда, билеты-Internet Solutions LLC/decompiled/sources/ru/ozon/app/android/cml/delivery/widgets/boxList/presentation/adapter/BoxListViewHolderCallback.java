package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListViewHolderCallback;", "", "selectedIndex", "", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "onItemChanged", "", "lastSelectedIndex", "payload", "getCardItem", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "position", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoxListViewHolderCallback {
    BoxCardVO getCardItem(int position);

    int getSelectedIndex();

    void onItemChanged(int lastSelectedIndex, @NotNull Object payload);

    void setSelectedIndex(int i11);
}
