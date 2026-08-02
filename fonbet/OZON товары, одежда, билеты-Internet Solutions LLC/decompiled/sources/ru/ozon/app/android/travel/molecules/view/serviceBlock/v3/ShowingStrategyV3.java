package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3Adapter;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3CopyAdapter;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewServiceBlockV3Binding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3;", "", "<init>", "()V", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "onClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "WithNextServiceBenefits", "WithoutNextServiceBenefits", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3$WithNextServiceBenefits;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3$WithoutNextServiceBenefits;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ShowingStrategyV3 {

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3$WithNextServiceBenefits;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3;", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "viewBinding", "<init>", "(Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;)V", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "bind", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithNextServiceBenefits extends ShowingStrategyV3 {

        @NotNull
        private final ViewServiceBlockV3Binding viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithNextServiceBenefits(@NotNull ViewServiceBlockV3Binding viewBinding) {
            super(null);
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            this.viewBinding = viewBinding;
        }

        @Override // ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.ShowingStrategyV3
        public void bind(@NotNull ServiceBlockV3DTO item, Function1<? super AtomAction, Unit> onClick, ComposerReferences refs) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextAtomView travelServiceBlockV3TitleTextView = this.viewBinding.travelServiceBlockV3TitleTextView;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3TitleTextView, "travelServiceBlockV3TitleTextView");
            TextAtomHolderKt.bind$default(travelServiceBlockV3TitleTextView, item.getTitle(), null, 2, null);
            SmallButtonView travelServiceBlockV3ChangeServiceButton = this.viewBinding.travelServiceBlockV3ChangeServiceButton;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3ChangeServiceButton, "travelServiceBlockV3ChangeServiceButton");
            WrappedButtonHolderKt.bindOrGone(travelServiceBlockV3ChangeServiceButton, item.getChangeServiceButton(), onClick);
            Group travelServiceBlockV3PriceGroup = this.viewBinding.travelServiceBlockV3PriceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3PriceGroup, "travelServiceBlockV3PriceGroup");
            ServiceBlockV3DTO.Price price = item.getPrice();
            travelServiceBlockV3PriceGroup.setVisibility((price != null ? price.getPrice() : null) != null ? 0 : 8);
            ServiceBlockV3DTO.Price price2 = item.getPrice();
            if (price2 != null) {
                PriceView travelServiceBlockV3PriceView = this.viewBinding.travelServiceBlockV3PriceView;
                Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3PriceView, "travelServiceBlockV3PriceView");
                PriceHolderKt.bindOrGone$default(travelServiceBlockV3PriceView, price2.getPrice(), null, 2, null);
                this.viewBinding.travelServiceBlockV3PriceSuffixTextView.setText(price2.getTitle());
            }
            boolean z11 = (item.getMoreAction() == null || onClick == null) ? false : true;
            LinkButtonView moreActionTAV = this.viewBinding.moreActionTAV;
            Intrinsics.checkNotNullExpressionValue(moreActionTAV, "moreActionTAV");
            moreActionTAV.setVisibility(z11 ? 0 : 8);
            if (z11) {
                if (onClick == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (item.getMoreAction() == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LinkButtonView linkButtonView = this.viewBinding.moreActionTAV;
                LinkButtonDTO moreAction = item.getMoreAction();
                linkButtonView.bindOrGone(moreAction != null ? MapperExtKt.toVO(moreAction) : null, onClick);
            }
            boolean z12 = (item.getAdditionalInfoList() == null && item.getCopyBlockList() == null) ? false : true;
            RecyclerView additionalInfoListRV = this.viewBinding.additionalInfoListRV;
            Intrinsics.checkNotNullExpressionValue(additionalInfoListRV, "additionalInfoListRV");
            additionalInfoListRV.setVisibility(z12 ? 0 : 8);
            if (item.getAdditionalInfoList() != null) {
                ServiceBlockV3Adapter serviceBlockV3Adapter = new ServiceBlockV3Adapter();
                this.viewBinding.additionalInfoListRV.setAdapter(serviceBlockV3Adapter);
                serviceBlockV3Adapter.setItems(item.getAdditionalInfoList());
            } else if (item.getCopyBlockList() != null) {
                if (refs == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ServiceBlockV3CopyAdapter serviceBlockV3CopyAdapter = new ServiceBlockV3CopyAdapter(refs);
                this.viewBinding.additionalInfoListRV.setAdapter(serviceBlockV3CopyAdapter);
                serviceBlockV3CopyAdapter.setItems(item.getCopyBlockList());
            }
            TextAtomView travelServiceBlockV3DescriptionTextView = this.viewBinding.travelServiceBlockV3DescriptionTextView;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3DescriptionTextView, "travelServiceBlockV3DescriptionTextView");
            TextAtomHolderKt.bind$default(travelServiceBlockV3DescriptionTextView, item.getContent(), null, 2, null);
            Group travelServiceBlockV3NextServiceGroup = this.viewBinding.travelServiceBlockV3NextServiceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextServiceGroup, "travelServiceBlockV3NextServiceGroup");
            travelServiceBlockV3NextServiceGroup.setVisibility(item.getNextOptionBenefitDescription() != null ? 0 : 8);
            TextAtomView travelServiceBlockV3NextServiceBenefitsTextView = this.viewBinding.travelServiceBlockV3NextServiceBenefitsTextView;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextServiceBenefitsTextView, "travelServiceBlockV3NextServiceBenefitsTextView");
            TextAtomHolderKt.bindOrGone$default(travelServiceBlockV3NextServiceBenefitsTextView, item.getNextOptionBenefitDescription(), null, 2, null);
            Group travelServiceBlockV3NextPriceGroup = this.viewBinding.travelServiceBlockV3NextPriceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextPriceGroup, "travelServiceBlockV3NextPriceGroup");
            ServiceBlockV3DTO.Price nextOptionPrice = item.getNextOptionPrice();
            travelServiceBlockV3NextPriceGroup.setVisibility((nextOptionPrice != null ? nextOptionPrice.getPrice() : null) != null ? 0 : 8);
            ServiceBlockV3DTO.Price nextOptionPrice2 = item.getNextOptionPrice();
            if (nextOptionPrice2 != null) {
                PriceView travelServiceBlockV3NextServicePriceView = this.viewBinding.travelServiceBlockV3NextServicePriceView;
                Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextServicePriceView, "travelServiceBlockV3NextServicePriceView");
                PriceHolderKt.bindOrGone$default(travelServiceBlockV3NextServicePriceView, nextOptionPrice2.getPrice(), null, 2, null);
                this.viewBinding.travelServiceBlockV3NextServicePriceSuffixTextView.setText(nextOptionPrice2.getTitle());
            }
            this.viewBinding.travelServiceBlockV3BadgeListView.bindOrGone(item.getTravelBadgesList());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithNextServiceBenefits) && Intrinsics.d(this.viewBinding, ((WithNextServiceBenefits) other).viewBinding);
        }

        public int hashCode() {
            return this.viewBinding.hashCode();
        }

        @NotNull
        public String toString() {
            return "WithNextServiceBenefits(viewBinding=" + this.viewBinding + ")";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3$WithoutNextServiceBenefits;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v3/ShowingStrategyV3;", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "viewBinding", "<init>", "(Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;)V", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "bind", "(Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewServiceBlockV3Binding;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithoutNextServiceBenefits extends ShowingStrategyV3 {

        @NotNull
        private final ViewServiceBlockV3Binding viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithoutNextServiceBenefits(@NotNull ViewServiceBlockV3Binding viewBinding) {
            super(null);
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            this.viewBinding = viewBinding;
        }

        @Override // ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.ShowingStrategyV3
        public void bind(@NotNull ServiceBlockV3DTO item, Function1<? super AtomAction, Unit> onClick, ComposerReferences refs) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextAtomView travelServiceBlockV3TitleTextView = this.viewBinding.travelServiceBlockV3TitleTextView;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3TitleTextView, "travelServiceBlockV3TitleTextView");
            TextAtomHolderKt.bind$default(travelServiceBlockV3TitleTextView, item.getTitle(), null, 2, null);
            SmallButtonView travelServiceBlockV3ChangeServiceButton = this.viewBinding.travelServiceBlockV3ChangeServiceButton;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3ChangeServiceButton, "travelServiceBlockV3ChangeServiceButton");
            WrappedButtonHolderKt.bindOrGone(travelServiceBlockV3ChangeServiceButton, item.getChangeServiceButton(), onClick);
            Group travelServiceBlockV3PriceGroup = this.viewBinding.travelServiceBlockV3PriceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3PriceGroup, "travelServiceBlockV3PriceGroup");
            travelServiceBlockV3PriceGroup.setVisibility(8);
            TextAtomView travelServiceBlockV3DescriptionTextView = this.viewBinding.travelServiceBlockV3DescriptionTextView;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3DescriptionTextView, "travelServiceBlockV3DescriptionTextView");
            TextAtomHolderKt.bind$default(travelServiceBlockV3DescriptionTextView, item.getContent(), null, 2, null);
            Group travelServiceBlockV3NextServiceGroup = this.viewBinding.travelServiceBlockV3NextServiceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextServiceGroup, "travelServiceBlockV3NextServiceGroup");
            travelServiceBlockV3NextServiceGroup.setVisibility(8);
            boolean z11 = (item.getMoreAction() == null || onClick == null) ? false : true;
            LinkButtonView moreActionTAV = this.viewBinding.moreActionTAV;
            Intrinsics.checkNotNullExpressionValue(moreActionTAV, "moreActionTAV");
            moreActionTAV.setVisibility(z11 ? 0 : 8);
            if (z11) {
                if (onClick == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (item.getMoreAction() == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LinkButtonView linkButtonView = this.viewBinding.moreActionTAV;
                LinkButtonDTO moreAction = item.getMoreAction();
                linkButtonView.bindOrGone(moreAction != null ? MapperExtKt.toVO(moreAction) : null, onClick);
            }
            boolean z12 = (item.getAdditionalInfoList() == null && item.getCopyBlockList() == null) ? false : true;
            RecyclerView additionalInfoListRV = this.viewBinding.additionalInfoListRV;
            Intrinsics.checkNotNullExpressionValue(additionalInfoListRV, "additionalInfoListRV");
            additionalInfoListRV.setVisibility(z12 ? 0 : 8);
            if (item.getAdditionalInfoList() != null) {
                ServiceBlockV3Adapter serviceBlockV3Adapter = new ServiceBlockV3Adapter();
                this.viewBinding.additionalInfoListRV.setAdapter(serviceBlockV3Adapter);
                serviceBlockV3Adapter.setItems(item.getAdditionalInfoList());
            } else if (item.getCopyBlockList() != null) {
                if (refs == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ServiceBlockV3CopyAdapter serviceBlockV3CopyAdapter = new ServiceBlockV3CopyAdapter(refs);
                this.viewBinding.additionalInfoListRV.setAdapter(serviceBlockV3CopyAdapter);
                serviceBlockV3CopyAdapter.setItems(item.getCopyBlockList());
            }
            Group travelServiceBlockV3NextPriceGroup = this.viewBinding.travelServiceBlockV3NextPriceGroup;
            Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextPriceGroup, "travelServiceBlockV3NextPriceGroup");
            ServiceBlockV3DTO.Price price = item.getPrice();
            travelServiceBlockV3NextPriceGroup.setVisibility((price != null ? price.getPrice() : null) != null ? 0 : 8);
            ServiceBlockV3DTO.Price price2 = item.getPrice();
            if (price2 != null) {
                PriceView travelServiceBlockV3NextServicePriceView = this.viewBinding.travelServiceBlockV3NextServicePriceView;
                Intrinsics.checkNotNullExpressionValue(travelServiceBlockV3NextServicePriceView, "travelServiceBlockV3NextServicePriceView");
                PriceHolderKt.bindOrGone$default(travelServiceBlockV3NextServicePriceView, price2.getPrice(), null, 2, null);
                this.viewBinding.travelServiceBlockV3NextServicePriceSuffixTextView.setText(price2.getTitle());
            }
            this.viewBinding.travelServiceBlockV3BadgeListView.bindOrGone(item.getTravelBadgesList());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithoutNextServiceBenefits) && Intrinsics.d(this.viewBinding, ((WithoutNextServiceBenefits) other).viewBinding);
        }

        public int hashCode() {
            return this.viewBinding.hashCode();
        }

        @NotNull
        public String toString() {
            return "WithoutNextServiceBenefits(viewBinding=" + this.viewBinding + ")";
        }
    }

    public /* synthetic */ ShowingStrategyV3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void bind(@NotNull ServiceBlockV3DTO item, Function1<? super AtomAction, Unit> onClick, ComposerReferences refs);

    private ShowingStrategyV3() {
    }
}
