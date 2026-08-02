package ru.ozon.app.android.initializers.atoms.navigator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.common.navigation.AtomNavigator;
import ru.ozon.app.android.atoms.v3.molecules.list.models.OpenGalleryParams;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u000f0\rH\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/initializers/atoms/navigator/GalleryNavigator;", "Lru/ozon/app/android/atoms/common/navigation/AtomNavigator;", "<init>", "()V", "canNavigate", "", "params", "", "", "", "navigate", "", "toGalleryItems", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/OpenGalleryParams$GalleryImage;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GalleryNavigator implements AtomNavigator {
    private final List<GalleryRequest.GalleryItem> toGalleryItems(List<OpenGalleryParams.GalleryImage> list) {
        List<OpenGalleryParams.GalleryImage> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new GalleryRequest.GalleryItem.Image(((OpenGalleryParams.GalleryImage) it.next()).getUrl(), null, false, 6, null));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.atoms.common.navigation.AtomNavigator
    public boolean canNavigate(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return params.get("ru.ozon.app.android.GalleryNavigator.OpenGalleryParams") instanceof OpenGalleryParams;
    }

    @Override // ru.ozon.app.android.atoms.common.navigation.AtomNavigator
    public void navigate(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params.get("ru.ozon.app.android.GalleryNavigator.OpenGalleryParams");
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.atoms.v3.molecules.list.models.OpenGalleryParams");
        OpenGalleryParams openGalleryParams = (OpenGalleryParams) obj;
        openGalleryParams.getContext().startActivity(GalleryActivity.INSTANCE.newIntent(openGalleryParams.getContext(), new GalleryRequest(toGalleryItems(openGalleryParams.getImageItems()), openGalleryParams.getCurrentPosition())));
    }
}
