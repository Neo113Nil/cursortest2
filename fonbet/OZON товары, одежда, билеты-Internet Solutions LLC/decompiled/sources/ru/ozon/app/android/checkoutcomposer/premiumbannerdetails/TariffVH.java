package ru.ozon.app.android.checkoutcomposer.premiumbannerdetails;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.af.holders.BulletElementsAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.checkout.databinding.ItemPremiumBannerTariffBinding;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/TariffVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemPremiumBannerTariffBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemPremiumBannerTariffBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff;)V", "Lru/ozon/app/android/checkout/databinding/ItemPremiumBannerTariffBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "subtitlesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "benefitsAdapter", "buttonAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TariffVH extends RecyclerView.C {

    @NotNull
    private final AtomsAdapter benefitsAdapter;

    @NotNull
    private final ItemPremiumBannerTariffBinding binding;

    @NotNull
    private final AtomsAdapter buttonAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final AtomsAdapter subtitlesAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TariffVH(@NotNull ItemPremiumBannerTariffBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_M, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522223, null))), null, null, null, 14, null);
        this.subtitlesAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(BulletElements.class, null, 2, null), new BulletElementsAtom.Configuration(0, 0, 0, 0, 0, 0, R$drawable.bullet_blue, 16, BulletElements.BulletStyle.SMALL, null, null, 1599, null))), null, null, null, 14, null);
        this.benefitsAdapter = atomsAdapter2;
        AtomsAdapter atomsAdapter3 = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonAdapter = atomsAdapter3;
        binding.subtitlesVAL.setAdapter(atomsAdapter);
        binding.benefitsFAL.setAdapter(atomsAdapter2);
        binding.buttonFAL.setAdapter(atomsAdapter3);
        atomsAdapter.setOnAction(onAction);
        atomsAdapter2.setOnAction(onAction);
        atomsAdapter3.setOnAction(onAction);
    }

    public final void bind(@NotNull PremiumBannerDetailsVO.Tariff item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemPremiumBannerTariffBinding itemPremiumBannerTariffBinding = this.binding;
        Context context = itemPremiumBannerTariffBinding.getConstraintLayout().getContext();
        ImageView premiumLogoIv = itemPremiumBannerTariffBinding.premiumLogoIv;
        Intrinsics.checkNotNullExpressionValue(premiumLogoIv, "premiumLogoIv");
        ImageViewExtKt.loadOriginal$default(premiumLogoIv, item.getHeader().getImage(), null, null, null, false, null, 62, null);
        TextView badgeTv = itemPremiumBannerTariffBinding.badgeTv;
        Intrinsics.checkNotNullExpressionValue(badgeTv, "badgeTv");
        TextViewExtKt.setTextOrGone(badgeTv, item.getBadge());
        AtomsAdapter atomsAdapter = this.subtitlesAdapter;
        Intrinsics.f(context);
        atomsAdapter.bind(context, item.getHeader().getInfo());
        this.benefitsAdapter.bind(context, C7714v.a0(item.getBenefits()));
        this.buttonAdapter.bind(context, C7714v.a0(item.getButton()));
        PriceView totalPriceFAL = itemPremiumBannerTariffBinding.totalPriceFAL;
        Intrinsics.checkNotNullExpressionValue(totalPriceFAL, "totalPriceFAL");
        PriceHolderKt.bind(totalPriceFAL, item.getPrice().getTotalPrice(), this.onAction);
        PriceView recurrentPriceFAL = itemPremiumBannerTariffBinding.recurrentPriceFAL;
        Intrinsics.checkNotNullExpressionValue(recurrentPriceFAL, "recurrentPriceFAL");
        PriceHolderKt.bind(recurrentPriceFAL, item.getPrice().getRecurrentPrice(), this.onAction);
    }
}
