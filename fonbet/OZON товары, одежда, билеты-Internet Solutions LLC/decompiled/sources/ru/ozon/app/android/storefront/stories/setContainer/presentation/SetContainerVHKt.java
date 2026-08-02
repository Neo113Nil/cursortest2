package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "", "selectedSet", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;", "extractSet", "(Ljava/util/List;I)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetContainerVHKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SetSwitch> extractSet(List<? extends CommonVoSet> list, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new SetSwitch((CommonVoSet) obj, i11 == i12, false, 4, null));
            i12 = i13;
        }
        return arrayList;
    }
}
