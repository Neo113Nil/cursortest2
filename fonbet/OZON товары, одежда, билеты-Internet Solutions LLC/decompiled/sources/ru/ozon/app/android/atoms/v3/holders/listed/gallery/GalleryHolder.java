package ru.ozon.app.android.atoms.v3.holders.listed.gallery;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/listed/gallery/GalleryHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryHolder extends AtomV3<Gallery, GalleryView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryHolder(@NotNull GalleryView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryHolder(@NotNull Context context, String str) {
        this(new GalleryView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Gallery item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((GalleryHolder) item);
        GalleryView containerView = getContainerView();
        containerView.setImageLoader(AtomConfig.INSTANCE.getImageLoader());
        containerView.submitGalleryData(GalleryDataMapperKt.toGalleryModel(item));
        containerView.setTitle(item.getTitle());
    }
}
