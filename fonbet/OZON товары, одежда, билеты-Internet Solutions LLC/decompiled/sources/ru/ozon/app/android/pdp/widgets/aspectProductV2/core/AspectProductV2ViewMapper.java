package ru.ozon.app.android.pdp.widgets.aspectProductV2.core;

import c20.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.data.AspectProductV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.di.AspectProductComponent;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation.AspectProductV2VO;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation.AspectProductV2ViewHolder;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectProductV2/core/AspectProductV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/di/AspectProductComponent;", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/data/AspectProductV2DTO;", "Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/pdp/widgets/aspectProductV2/data/AspectProductV2DTO;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/aspectProductV2/presentation/AspectProductV2VO;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component;", "", "isPriceTextNotEmpty", "(Ljava/util/List;)Z", "state", "Ll20/d;", "info", "map", "(Lru/ozon/app/android/pdp/widgets/aspectProductV2/data/AspectProductV2DTO;Ll20/d;)Ljava/util/List;", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectProductV2ViewMapper extends OverlayWidgetScreenViewItemMapper2<AspectProductComponent, AspectProductV2DTO, AspectProductV2VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final boolean isPriceTextNotEmpty(List<PriceDTO.Component> list) {
        List<PriceDTO.Component> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String text = ((PriceDTO.Component) it.next()).getText();
            if (text != null && text.length() > 0) {
                return true;
            }
        }
        return false;
    }

    private final AspectProductV2VO toVO(AspectProductV2DTO aspectProductV2DTO, String str) {
        PriceDTO copy;
        boolean d11 = Intrinsics.d(aspectProductV2DTO.getStatus(), "AVAILABLE");
        long hashCode = str.hashCode();
        String image = aspectProductV2DTO.getImage();
        String deeplink = aspectProductV2DTO.getDeeplink();
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(aspectProductV2DTO.getTitle(), null, null, null, null, null, null, null, null, d11 ? aspectProductV2DTO.getTitle().getTextColor() : UniColors.TEXT_SECONDARY.getToken(), 2, null, false, 3327, null);
        copy = r10.copy((r29 & 1) != 0 ? r10.price : null, (r29 & 2) != 0 ? r10.discount : null, (r29 & 4) != 0 ? r10.backgroundCapacity : null, (r29 & 8) != 0 ? r10.priceStyle : d11 ? aspectProductV2DTO.getPrice().getPriceStyle() : PriceDTO.PriceStyle.copy$default(aspectProductV2DTO.getPrice().getPriceStyle(), PriceDTO.PriceStyle.StyleType.UNAVAILABLE, null, null, 6, null), (r29 & 16) != 0 ? r10.preset : null, (r29 & 32) != 0 ? r10.paddingLeft : null, (r29 & 64) != 0 ? r10.paddingRight : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r10.paddingTop : null, (r29 & 256) != 0 ? r10.paddingBottom : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r10.context : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r10.testInfo : null, (r29 & 2048) != 0 ? r10.trackingInfo : null, (r29 & 4096) != 0 ? r10.discountColor : null, (r29 & 8192) != 0 ? aspectProductV2DTO.getPrice().isStrikethroughLineHidden : false);
        return new AspectProductV2VO(hashCode, image, deeplink, copy, dsTextAtom$default, d11, d11 ? 1.0f : 0.5f);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof AspectProductV2DTO)) {
            return false;
        }
        AspectProductV2DTO aspectProductV2DTO = (AspectProductV2DTO) state;
        return !Intrinsics.d(aspectProductV2DTO.getStatus(), "INVALID") && aspectProductV2DTO.getImage().length() > 0 && aspectProductV2DTO.getTitle().getText().length() > 0 && !aspectProductV2DTO.getPrice().getPrice().isEmpty() && isPriceTextNotEmpty(aspectProductV2DTO.getPrice().getPrice());
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AspectProductV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new AspectProductV2ViewHolder(container, component().getComposerNavigator());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AspectProductComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AspectProductComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AspectProductV2VO> map(@NotNull AspectProductV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }
}
