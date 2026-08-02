package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import Ae.C2406m0;
import Ae.C2408n0;
import Ci.C2779a;
import Ci.b;
import Ci.g;
import Hi.h;
import Ve.C4598rp;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter.ParcelPhotoAddAdapter;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view.ParcelPhotoAddView;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;LWZ/l;)V", "", "initObservers", "()V", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "attachments", "updateAttaches", "(Ljava/util/List;)V", "newPhotos", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "computeUpdatedList", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;Ljava/util/List;)Ljava/util/List;", "", "itemsCountLeft", "openMediaPicker", "(I)V", "", "message", "showError", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddAdapter;", "pickerAdapter", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/adapter/ParcelPhotoAddAdapter;", "vo", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddWidgetViewHolder extends k<ParcelPhotoAddVO> {

    @NotNull
    private final ParcelPhotoAddAdapter pickerAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ParcelPhotoAddView view;

    @NotNull
    private final ParcelPhotoAddViewModel viewModel;
    private ParcelPhotoAddVO vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelPhotoAddWidgetViewHolder(@NotNull ParcelPhotoAddView view, @NotNull ComposerReferences refs, @NotNull ParcelPhotoAddViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.refs = refs;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ParcelPhotoAddAdapter parcelPhotoAddAdapter = new ParcelPhotoAddAdapter(tokenizedAnalytics, refs.getContainer().g());
        parcelPhotoAddAdapter.setOnAddClick(new ParcelPhotoAddWidgetViewHolder$pickerAdapter$1$1(viewModel));
        parcelPhotoAddAdapter.setOnCancelClick(new ParcelPhotoAddWidgetViewHolder$pickerAdapter$1$2(viewModel));
        parcelPhotoAddAdapter.setOnRetryClick(new ParcelPhotoAddWidgetViewHolder$pickerAdapter$1$3(viewModel));
        parcelPhotoAddAdapter.setOnDeleteClick(new ParcelPhotoAddWidgetViewHolder$pickerAdapter$1$4(viewModel));
        this.pickerAdapter = parcelPhotoAddAdapter;
        view.setAdapter(parcelPhotoAddAdapter);
    }

    private final List<ParcelPhotoAddVO.PickerItemVO> computeUpdatedList(ParcelPhotoAddVO parcelPhotoAddVO, List<AttachedPhoto> list) {
        ImageDTO copy;
        ParcelPhotoAddVO.PhotoVO photoVO;
        List<ParcelPhotoAddVO.PhotoVO> photos = parcelPhotoAddVO.getPhotos();
        int h11 = U.h(C7714v.z(photos, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : photos) {
            linkedHashMap.put(((ParcelPhotoAddVO.PhotoVO) obj).getPhoto().getPhotoKey(), obj);
        }
        List<AttachedPhoto> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (AttachedPhoto attachedPhoto : list2) {
            ParcelPhotoAddVO.PhotoVO photoVO2 = (ParcelPhotoAddVO.PhotoVO) linkedHashMap.get(attachedPhoto.getPhotoKey());
            if (photoVO2 == null || (photoVO = ParcelPhotoAddVO.PhotoVO.copy$default(photoVO2, null, null, null, attachedPhoto, null, 23, null)) == null) {
                copy = r9.copy((r34 & 1) != 0 ? r9.image : attachedPhoto.getMediaUri().toString(), (r34 & 2) != 0 ? r9.backgroundColor : null, (r34 & 4) != 0 ? r9.aspectRatio : null, (r34 & 8) != 0 ? r9.hasParanja : true, (r34 & 16) != 0 ? r9.layoutPaddingLeft : null, (r34 & 32) != 0 ? r9.layoutPaddingRight : null, (r34 & 64) != 0 ? r9.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.layoutPaddingBottom : null, (r34 & 256) != 0 ? r9.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.testInfo : null, (r34 & 2048) != 0 ? r9.trackingInfo : null, (r34 & 4096) != 0 ? r9.imageWidth : null, (r34 & 8192) != 0 ? r9.imageType : null, (r34 & 16384) != 0 ? r9.fitType : null, (r34 & 32768) != 0 ? parcelPhotoAddVO.getEmptyItem().getImage().customRatio : null);
                photoVO = new ParcelPhotoAddVO.PhotoVO(copy, parcelPhotoAddVO.getRemoveIcon(), attachedPhoto.getCdnUrl(), attachedPhoto, parcelPhotoAddVO.getDeleteErrorEvent());
            }
            arrayList.add(photoVO);
        }
        ArrayList arrayList2 = new ArrayList();
        if (list.size() > parcelPhotoAddVO.getMaxItemsCount()) {
            arrayList2.addAll(C7714v.K0(arrayList, parcelPhotoAddVO.getMaxItemsCount()));
            return arrayList2;
        }
        arrayList2.add(parcelPhotoAddVO.getPickerItem());
        arrayList2.addAll(arrayList);
        int maxItemsCount = parcelPhotoAddVO.getMaxItemsCount() - arrayList.size();
        if (maxItemsCount > 0) {
            for (int i11 = 0; i11 < maxItemsCount; i11++) {
                arrayList2.add(parcelPhotoAddVO.getEmptyItem());
            }
        }
        return arrayList2;
    }

    private final void initObservers() {
        C4598rp.f(this.refs, new C2408n0(new C2406m0(this.viewModel.getAttached()), new ParcelPhotoAddWidgetViewHolder$initObservers$1(this, null)));
        C4598rp.f(this.refs, new C2408n0(this.viewModel.getOpenPickScreen(), new ParcelPhotoAddWidgetViewHolder$initObservers$2(this, null)));
        C4598rp.f(this.refs, new C2408n0(this.viewModel.getErrors(), new ParcelPhotoAddWidgetViewHolder$initObservers$3(this, null)));
        C4598rp.f(this.refs, new C2408n0(this.viewModel.getAnalyticsEvents(), new ParcelPhotoAddWidgetViewHolder$initObservers$4(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openMediaPicker(int itemsCountLeft) {
        Ci.k b11 = C2779a.b();
        Ci.k b12 = Ci.k.b(b11, 0, h.d.f11018a, b.a(b11.d(), g.a(b11.d().f(), null, null, itemsCountLeft == 1 ? Ci.l.RESULT_API_ONLY : b11.d().f().g(), 31), null, itemsCountLeft, 1918), C2779a.a(), 243);
        Bi.k galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(this.refs.getComposerWidgetComponentStorage());
        if (galleryLauncher != null) {
            galleryLauncher.b(b12, new ParcelPhotoAddWidgetViewHolder$openMediaPicker$1(this.viewModel));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().a());
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(message, null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null), this.refs.getContainer().g(), null, 8, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAttaches(List<AttachedPhoto> attachments) {
        if (attachments.isEmpty()) {
            this.view.scrollToPosition(0);
        }
        ParcelPhotoAddVO boundData = getBoundData();
        if (boundData != null) {
            this.pickerAdapter.submitList(computeUpdatedList(boundData, attachments));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        initObservers();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ParcelPhotoAddVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.vo = item;
        this.viewModel.bindData(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ParcelPhotoAddVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ParcelPhotoAddWidgetViewHolder) item, trackingData, viewedPond);
        t widgetEvent = item.getWidgetEvent();
        if (widgetEvent != null) {
            m.c(this.tokenizedAnalytics, widgetEvent, null);
        }
    }
}
