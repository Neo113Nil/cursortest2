package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Tc.b;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressMiniWidgetState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.coupon.data.HighlightsMiniWidgetState;
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsDTO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.data.HighlightProductsMiniWidgetState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "Lj20/a;", "", "", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "dto", "populateDTO", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;)Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightsWrapperParser implements InterfaceC7243a<List<? extends Object>> {

    @NotNull
    private final JsonParser deserializer;

    public HighlightsWrapperParser(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    public final HighlightsWrapperDTO populateDTO(HighlightsWrapperDTO dto) {
        CouponDTO coupon;
        ActionProgressDTO actionProgress;
        ActionProgressDTO actionProgress2;
        HighlightProductsDTO highlightProducts;
        HighlightProductsDTO highlightProducts2;
        if (dto != null && (highlightProducts2 = dto.getHighlightProducts()) != null) {
            highlightProducts2.setCurrentMiniWidget(dto.getCurrentMiniWidget());
        }
        if (dto != null && (highlightProducts = dto.getHighlightProducts()) != null) {
            highlightProducts.setMiniProgressText(dto.getProgressText());
        }
        if (dto != null && (actionProgress2 = dto.getActionProgress()) != null) {
            actionProgress2.setCurrentMiniWidget(dto.getCurrentMiniWidget());
        }
        if (dto != null && (actionProgress = dto.getActionProgress()) != null) {
            actionProgress.setMiniProgressText(dto.getProgressText());
        }
        if (dto != null && (coupon = dto.getCoupon()) != null) {
            coupon.setCurrentMiniWidget(dto.getCurrentMiniWidget());
        }
        return dto;
    }

    @Override // j20.InterfaceC7243a
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HighlightsWrapperDTO highlightsWrapperDTO = (HighlightsWrapperDTO) this.deserializer.fromJson(state.b(), HighlightsWrapperDTO.class);
        populateDTO(highlightsWrapperDTO);
        b builder = C7714v.B();
        CouponDTO coupon = highlightsWrapperDTO.getCoupon();
        if (coupon != null) {
            builder.add(new HighlightsMiniWidgetState(coupon, highlightsWrapperDTO.getCurrentMiniWidget()));
            builder.add(coupon);
        }
        ActionProgressDTO actionProgress = highlightsWrapperDTO.getActionProgress();
        if (actionProgress != null) {
            builder.add(new ActionProgressMiniWidgetState(actionProgress, highlightsWrapperDTO.getCurrentMiniWidget()));
            builder.add(actionProgress);
        }
        HighlightProductsDTO highlightProducts = highlightsWrapperDTO.getHighlightProducts();
        if (highlightProducts != null) {
            builder.add(new HighlightProductsMiniWidgetState(highlightProducts, highlightsWrapperDTO.getCurrentMiniWidget()));
            builder.add(highlightProducts);
        }
        builder.add(new CartButtonDTO(highlightsWrapperDTO.getCartButton()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
