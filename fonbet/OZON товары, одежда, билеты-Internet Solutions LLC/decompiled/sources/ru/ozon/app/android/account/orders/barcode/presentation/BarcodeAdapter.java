package ru.ozon.app.android.account.orders.barcode.presentation;

import Ve.C4636t5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeVO;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache;
import ru.ozon.app.android.cs_orders.databinding.ItemBarcodeBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemExpandedBarcodeBinding;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\"#$%&B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R*\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "barcodeDrawableCache", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "Z", "getExpanded", "()Z", "setExpanded", "(Z)V", "Companion", "DiffCallback", "BaseShipmentVH", "ShipmentVH", "ExpandedShipmentVH", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeAdapter extends t<BarcodeVO.Shipment, BaseShipmentVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BarcodeDrawableCache barcodeDrawableCache;
    private boolean expanded;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "barcodeDrawableCache", "<init>", "(Landroid/view/View;Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;)V", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "item", "", "bind", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;)V", "Landroid/widget/ImageView;", "", "code", "setBarcode", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BaseShipmentVH extends j {

        @NotNull
        private final BarcodeDrawableCache barcodeDrawableCache;

        @NotNull
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final int DARK_THEME_VERTICAL_PADDING = UiExtKt.toPx(16);
        private static final int DARK_THEME_HORIZONTAL_MARGIN = UiExtKt.toPx(16);

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH$Companion;", "", "<init>", "()V", "DARK_THEME_VERTICAL_PADDING", "", "getDARK_THEME_VERTICAL_PADDING", "()I", "DARK_THEME_HORIZONTAL_MARGIN", "getDARK_THEME_HORIZONTAL_MARGIN", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getDARK_THEME_HORIZONTAL_MARGIN() {
                return BaseShipmentVH.DARK_THEME_HORIZONTAL_MARGIN;
            }

            public final int getDARK_THEME_VERTICAL_PADDING() {
                return BaseShipmentVH.DARK_THEME_VERTICAL_PADDING;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseShipmentVH(@NotNull View view, @NotNull BarcodeDrawableCache barcodeDrawableCache) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(barcodeDrawableCache, "barcodeDrawableCache");
            this.barcodeDrawableCache = barcodeDrawableCache;
        }

        public abstract void bind(@NotNull BarcodeVO.Shipment item);

        protected final void setBarcode(@NotNull ImageView view, @NotNull String code) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(code, "code");
            C10727i.c(K.a(this), null, null, new BarcodeAdapter$BaseShipmentVH$setBarcode$1(view, this, code, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$Companion;", "", "<init>", "()V", TakePhotoRequest.BARCODE_SCANNER_TYPE, "", "EXPANDED_BARCODE", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;)Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffCallback extends i.d<BarcodeVO.Shipment> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        @NotNull
        public Object getChangePayload(@NotNull BarcodeVO.Shipment oldItem, @NotNull BarcodeVO.Shipment newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return newItem;
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull BarcodeVO.Shipment oldItem, @NotNull BarcodeVO.Shipment newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull BarcodeVO.Shipment oldItem, @NotNull BarcodeVO.Shipment newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getCode(), newItem.getCode());
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$ExpandedShipmentVH;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;", "binding", "Lru/ozon/app/android/cs_orders/databinding/ItemExpandedBarcodeBinding;", "barcodeDrawableCache", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "<init>", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter;Lru/ozon/app/android/cs_orders/databinding/ItemExpandedBarcodeBinding;Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;)V", "multipleBarcodeWidth", "", "darkThemeBarcodePadding", "lightThemeBarcodePadding", "bind", "", "item", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "updateBarcodePadding", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ExpandedShipmentVH extends BaseShipmentVH {

        @NotNull
        private final ItemExpandedBarcodeBinding binding;
        private final int darkThemeBarcodePadding;
        private final int lightThemeBarcodePadding;
        private final int multipleBarcodeWidth;
        final /* synthetic */ BarcodeAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ExpandedShipmentVH(@NotNull BarcodeAdapter barcodeAdapter, @NotNull ItemExpandedBarcodeBinding binding, BarcodeDrawableCache barcodeDrawableCache) {
            super(r2, barcodeDrawableCache);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(barcodeDrawableCache, "barcodeDrawableCache");
            this.this$0 = barcodeAdapter;
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.multipleBarcodeWidth = (int) (binding.getConstraintLayout().getContext().getResources().getDisplayMetrics().widthPixels * 0.85f);
            this.darkThemeBarcodePadding = UiExtKt.toPx(40);
            this.lightThemeBarcodePadding = UiExtKt.toPx(30);
        }

        private final void updateBarcodePadding() {
            AppCompatImageView appCompatImageView = this.binding.barcodeIv;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (ThemeExtKt.isDarkThemeActive(context)) {
                int i11 = this.darkThemeBarcodePadding;
                ViewExtKt.updatePadding$default(appCompatImageView, i11, 0, i11, 0, 10, null);
            } else {
                int i12 = this.lightThemeBarcodePadding;
                ViewExtKt.updatePadding$default(appCompatImageView, i12, 0, i12, 0, 10, null);
            }
        }

        @Override // ru.ozon.app.android.account.orders.barcode.presentation.BarcodeAdapter.BaseShipmentVH
        public void bind(@NotNull BarcodeVO.Shipment item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemExpandedBarcodeBinding itemExpandedBarcodeBinding = this.binding;
            BarcodeAdapter barcodeAdapter = this.this$0;
            ConstraintLayout constraintLayout = itemExpandedBarcodeBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = item.getIsSingle() ? -1 : this.multipleBarcodeWidth;
            constraintLayout.setLayoutParams(layoutParams);
            itemExpandedBarcodeBinding.packageTv.setText(item.getPackageTitle());
            AppCompatTextView hintTv = itemExpandedBarcodeBinding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
            TextViewExtKt.setTextOrGone(hintTv, item.getHint());
            TextAtomView infoTav = itemExpandedBarcodeBinding.infoTav;
            Intrinsics.checkNotNullExpressionValue(infoTav, "infoTav");
            TextAtomHolderKt.bindOrGone(infoTav, item.getInfo(), barcodeAdapter.actionHandler);
            TextAtomView descriptionTav = itemExpandedBarcodeBinding.descriptionTav;
            Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
            TextAtomHolderKt.bindOrGone$default(descriptionTav, item.getDescription(), null, 2, null);
            AppCompatImageView barcodeIv = itemExpandedBarcodeBinding.barcodeIv;
            Intrinsics.checkNotNullExpressionValue(barcodeIv, "barcodeIv");
            setBarcode(barcodeIv, item.getCode());
            updateBarcodePadding();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$ShipmentVH;", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter$BaseShipmentVH;", "binding", "Lru/ozon/app/android/cs_orders/databinding/ItemBarcodeBinding;", "barcodeDrawableCache", "Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;", "<init>", "(Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeAdapter;Lru/ozon/app/android/cs_orders/databinding/ItemBarcodeBinding;Lru/ozon/app/android/barcodecache/drawable/BarcodeDrawableCache;)V", "bind", "", "item", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO$Shipment;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ShipmentVH extends BaseShipmentVH {

        @NotNull
        private final ItemBarcodeBinding binding;
        final /* synthetic */ BarcodeAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ShipmentVH(@NotNull BarcodeAdapter barcodeAdapter, @NotNull ItemBarcodeBinding binding, BarcodeDrawableCache barcodeDrawableCache) {
            super(r2, barcodeDrawableCache);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(barcodeDrawableCache, "barcodeDrawableCache");
            this.this$0 = barcodeAdapter;
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        @Override // ru.ozon.app.android.account.orders.barcode.presentation.BarcodeAdapter.BaseShipmentVH
        public void bind(@NotNull BarcodeVO.Shipment item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemBarcodeBinding itemBarcodeBinding = this.binding;
            BarcodeAdapter barcodeAdapter = this.this$0;
            itemBarcodeBinding.packageTv.setText(item.getPackageTitle());
            String hint = item.getHint();
            if (hint != null) {
                itemBarcodeBinding.hintTv.setText(hint);
            }
            AppCompatTextView hintTv = itemBarcodeBinding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
            String hint2 = item.getHint();
            ViewExtKt.showOrGone(hintTv, Boolean.valueOf(!(hint2 == null || hint2.length() == 0)));
            TextAtomView descriptionTav = itemBarcodeBinding.descriptionTav;
            Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
            TextAtomHolderKt.bindOrGone$default(descriptionTav, item.getDescription(), null, 2, null);
            AppCompatImageView barcodeIv = itemBarcodeBinding.barcodeIv;
            Intrinsics.checkNotNullExpressionValue(barcodeIv, "barcodeIv");
            setBarcode(barcodeIv, item.getCode());
            TextAtomView infoTav = itemBarcodeBinding.infoTav;
            Intrinsics.checkNotNullExpressionValue(infoTav, "infoTav");
            TextAtomHolderKt.bindOrGone(infoTav, item.getInfo(), barcodeAdapter.actionHandler);
            DisclaimerContainer annotationDc = itemBarcodeBinding.annotationDc;
            Intrinsics.checkNotNullExpressionValue(annotationDc, "annotationDc");
            DisclaimerHolderKt.bindOrGone(annotationDc, item.getAnnotation(), barcodeAdapter.actionHandler);
            IconButtonV3View shareBtn = itemBarcodeBinding.shareBtn;
            Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
            IconButtonV3HolderKt.bindOrGone(shareBtn, item.getShareButton(), barcodeAdapter.actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull BarcodeDrawableCache barcodeDrawableCache) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(barcodeDrawableCache, "barcodeDrawableCache");
        this.actionHandler = actionHandler;
        this.barcodeDrawableCache = barcodeDrawableCache;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.expanded ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseShipmentVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 0) {
            ItemBarcodeBinding inflate = ItemBarcodeBinding.inflate(a11, parent, false);
            Intrinsics.f(inflate);
            return new ShipmentVH(this, inflate, this.barcodeDrawableCache);
        }
        if (viewType != 1) {
            throw new IllegalStateException("unknown view holder");
        }
        ItemExpandedBarcodeBinding inflate2 = ItemExpandedBarcodeBinding.inflate(a11, parent, false);
        Intrinsics.f(inflate2);
        return new ExpandedShipmentVH(this, inflate2, this.barcodeDrawableCache);
    }

    public final void setExpanded(boolean z11) {
        this.expanded = z11;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseShipmentVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BarcodeVO.Shipment item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
