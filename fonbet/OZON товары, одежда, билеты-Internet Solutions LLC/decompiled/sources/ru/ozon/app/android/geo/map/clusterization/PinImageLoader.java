package ru.ozon.app.android.geo.map.clusterization;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/PinImageLoader;", "", "", "", "urls", "", "loadImages", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", ImagesContract.URL, "Landroid/graphics/Bitmap;", "getImage", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PinImageLoader {
    Bitmap getImage(@NotNull String url);

    Object loadImages(@NotNull List<String> list, @NotNull d<? super Unit> dVar);
}
