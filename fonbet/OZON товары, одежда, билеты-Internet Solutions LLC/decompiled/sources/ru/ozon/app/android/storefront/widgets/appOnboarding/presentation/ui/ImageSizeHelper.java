package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import S0.C3956f1;
import S0.InterfaceC3972m0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR+\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/ui/ImageSizeHelper;", "", "", "listSize", "<init>", "(I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "addSize", "I", "<set-?>", "_imageSizeState$delegate", "LS0/m0;", "get_imageSizeState", "()I", "set_imageSizeState", "_imageSizeState", "", "imageSizes", "Ljava/util/List;", "getImageSizeState", "imageSizeState", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageSizeHelper {

    /* renamed from: _imageSizeState$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3972m0 _imageSizeState = C3956f1.a(0);

    @NotNull
    private final List<Integer> imageSizes = new ArrayList();
    private final int listSize;

    public ImageSizeHelper(int i11) {
        this.listSize = i11;
    }

    private final int get_imageSizeState() {
        return this._imageSizeState.getIntValue();
    }

    private final void set_imageSizeState(int i11) {
        this._imageSizeState.d(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addSize(int value) {
        this.imageSizes.add(Integer.valueOf(value));
        if (this.imageSizes.size() == this.listSize) {
            List<Integer> list = this.imageSizes;
            Intrinsics.checkNotNullParameter(list, "<this>");
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
            set_imageSizeState(((Number) comparable).intValue());
        }
    }

    public final int getImageSizeState() {
        return get_imageSizeState();
    }
}
