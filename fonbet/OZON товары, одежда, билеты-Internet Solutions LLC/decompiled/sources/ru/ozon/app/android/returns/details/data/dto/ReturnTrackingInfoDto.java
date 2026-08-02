package ru.ozon.app.android.returns.details.data.dto;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.returns.details.data.dto.ReturnDetailsDto;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnTrackingInfoDto;", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "info", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "photos", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/gallery/Gallery;)V", "getInfo", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getPhotos", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTrackingInfoDto implements ReturnDetailsDto.Component {
    public static final int $stable = 8;
    private final DisclaimerAtom info;

    @NotNull
    private final Gallery photos;

    public ReturnTrackingInfoDto(@i(name = "info") DisclaimerAtom disclaimerAtom, @i(name = "photos") @NotNull Gallery photos) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        this.info = disclaimerAtom;
        this.photos = photos;
    }

    public final DisclaimerAtom getInfo() {
        return this.info;
    }

    @NotNull
    public final Gallery getPhotos() {
        return this.photos;
    }
}
