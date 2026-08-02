package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters.HotelsRoomsDetailsFullImagesViewPagerAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/adapters/HotelsRoomsDetailsFullImagesViewPagerAdapter;", "Landroidx/viewpager/widget/a;", "<init>", "()V", "", "position", "", "getItem", "(I)Ljava/lang/String;", "getCount", "()I", "Landroid/view/View;", "view", "", "obj", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsDetailsFullImagesViewPagerAdapter extends a {

    @NotNull
    private List<String> items = K.f71697a;

    private final String getItem(int position) {
        if (this.items.isEmpty() || position < 0 || position >= this.items.size()) {
            return null;
        }
        return this.items.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void instantiateItem$lambda$3$lambda$2(ViewGroup viewGroup, HotelsRoomsDetailsFullImagesViewPagerAdapter hotelsRoomsDetailsFullImagesViewPagerAdapter, int i11, View view) {
        Context context = viewGroup.getContext();
        List<String> list = hotelsRoomsDetailsFullImagesViewPagerAdapter.items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GalleryRequest.GalleryItem.Image((String) it.next(), null, false, 6, null));
        }
        GalleryRequest galleryRequest = new GalleryRequest(arrayList, i11);
        GalleryActivity.Companion companion = GalleryActivity.INSTANCE;
        Intrinsics.f(context);
        context.startActivity(companion.newIntent(context, galleryRequest));
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        container.removeView((View) view);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.items.size();
    }

    @Override // androidx.viewpager.widget.a
    @NotNull
    public Object instantiateItem(@NotNull final ViewGroup container, final int position) {
        Intrinsics.checkNotNullParameter(container, "container");
        View inflate = ViewGroupExtKt.inflate(container, R$layout.item_hotels_rooms_details_full_image);
        ShapeableImageView shapeableImageView = (ShapeableImageView) inflate.findViewById(R$id.hotelsRoomsDetailsItemSiv);
        String item = getItem(position);
        Intrinsics.f(shapeableImageView);
        ImageViewExtKt.load$default(shapeableImageView, item, null, null, null, null, false, null, 126, null);
        shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: wS.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelsRoomsDetailsFullImagesViewPagerAdapter.instantiateItem$lambda$3$lambda$2(container, this, position, view);
            }
        });
        container.addView(inflate, 0);
        return inflate;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Intrinsics.d(view, obj);
    }

    public final void setItems(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }
}
