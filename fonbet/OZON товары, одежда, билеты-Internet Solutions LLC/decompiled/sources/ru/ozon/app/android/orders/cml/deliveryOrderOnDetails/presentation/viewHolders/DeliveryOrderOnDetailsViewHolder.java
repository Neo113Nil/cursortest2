package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewHolders;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.orderdetails.molecule.images.presentation.ImagesDelegate;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewItems.DeliveryOrderOnDetailsVO;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.views.DeliveryOrderOnDetailsView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewHolders/DeliveryOrderOnDetailsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/DeliveryOrderOnDetailsView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultListDelegate", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/DeliveryOrderOnDetailsView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;LWZ/l;)V", "", "", "urlList", "", "openGallery", "(Ljava/util/List;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/views/DeliveryOrderOnDetailsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "imagesDelegate", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderOnDetailsViewHolder extends k<DeliveryOrderOnDetailsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final ImagesDelegate imagesDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final DeliveryOrderOnDetailsView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewHolders/DeliveryOrderOnDetailsViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_OPEN_GALLERY", "", "OPEN_GALLERY_PARAMS_ENCODED_MODEL", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderOnDetailsViewHolder(@NotNull DeliveryOrderOnDetailsView view, @NotNull ComposerReferences refs, @NotNull AdultListDelegate<ImageVO> adultListDelegate, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new DeliveryOrderOnDetailsViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.imagesDelegate = new ImagesDelegate(this, view.getImagesView(), adultListDelegate, (getContext().getResources().getDisplayMetrics().widthPixels - UiExtKt.toPx(32)) / ImagesDelegate.INSTANCE.getITEM_SIZE_WITH_OFFSET(), buildHandler);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.adapter = atomsAdapter;
        view.getTextAtomsVAL().setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openGallery(List<String> urlList) {
        if (urlList.isEmpty()) {
            return;
        }
        r i11 = this.refs.getContainer().i();
        ArrayList I11 = C7714v.I(urlList);
        ArrayList arrayList = new ArrayList(C7714v.z(I11, 10));
        Iterator it = I11.iterator();
        while (it.hasNext()) {
            arrayList.add(new GalleryRequest.GalleryItem.Image((String) it.next(), null, false, 6, null));
        }
        i11.startActivity(GalleryActivity.INSTANCE.newIntent(i11, new GalleryRequest(arrayList, 0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryOrderOnDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        this.imagesDelegate.bind(item.getImages());
        AtomsAdapter atomsAdapter = this.adapter;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getTextAtomList());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryOrderOnDetailsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((DeliveryOrderOnDetailsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
