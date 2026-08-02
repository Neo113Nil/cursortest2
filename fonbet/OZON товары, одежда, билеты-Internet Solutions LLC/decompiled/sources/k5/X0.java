package k5;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.HashSet;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

/* loaded from: classes8.dex */
public final class X0 extends D0<Om0.a> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final HashSet f70671e;

    X0(@NonNull HashSet hashSet) {
        super(Mm0.e.BuildData);
        this.f70671e = hashSet;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        Om0.a aVar = new Om0.a();
        Mm0.e eVar = Mm0.e.BOARD;
        HashSet hashSet = this.f70671e;
        if (hashSet.contains(eVar)) {
            aVar.put("BOARD", Build.BOARD);
        }
        if (hashSet.contains(Mm0.e.BOOTLOADER)) {
            aVar.put("BOOTLOADER", Build.BOOTLOADER);
        }
        if (hashSet.contains(Mm0.e.BRAND)) {
            aVar.put("BRAND", Build.BRAND);
        }
        if (hashSet.contains(Mm0.e.DEVICE)) {
            aVar.put("DEVICE", Build.DEVICE);
        }
        if (hashSet.contains(Mm0.e.DISPLAY)) {
            aVar.put("DISPLAY", Build.DISPLAY);
        }
        if (hashSet.contains(Mm0.e.FINGERPRINT)) {
            aVar.put("FINGERPRINT", Build.FINGERPRINT);
        }
        if (hashSet.contains(Mm0.e.HARDWARE)) {
            aVar.put("HARDWARE", Build.HARDWARE);
        }
        if (hashSet.contains(Mm0.e.ID)) {
            aVar.put("ID", Build.ID);
        }
        if (hashSet.contains(Mm0.e.MANUFACTURER)) {
            aVar.put("MANUFACTURER", Build.MANUFACTURER);
        }
        if (hashSet.contains(Mm0.e.PRODUCT)) {
            aVar.put(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_NAME, Build.PRODUCT);
        }
        if (hashSet.contains(Mm0.e.RADIO)) {
            aVar.put("RADIO", Build.RADIO);
        }
        return aVar;
    }
}
