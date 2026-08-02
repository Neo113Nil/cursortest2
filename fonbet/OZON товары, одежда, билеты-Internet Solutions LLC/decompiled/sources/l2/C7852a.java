package l2;

import android.util.Size;
import java.util.Comparator;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C7852a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72543a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f72543a) {
            case 0:
                return Integer.parseInt(((String) obj).split(ProductContainerDTO.RATIO_DELIMITER)[0]) - Integer.parseInt(((String) obj2).split(ProductContainerDTO.RATIO_DELIMITER)[0]);
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }
}
