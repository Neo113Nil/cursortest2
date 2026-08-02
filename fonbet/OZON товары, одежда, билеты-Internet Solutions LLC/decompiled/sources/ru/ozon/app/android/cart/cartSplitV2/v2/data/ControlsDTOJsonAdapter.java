package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.ControlsDTO;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProductMoleculeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "nullableQuantityControlAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "nullableRightIconButtonDTOAdapter", "nullableIconButtonV3DTOAdapter", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "nullableTooltipWithOnboardingActionDTOAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ControlsDTOJsonAdapter extends JsonAdapter<ControlsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<FavoriteProductMolecule> favoriteProductMoleculeAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ControlsDTO.QuantityControl> nullableQuantityControlAdapter;

    @NotNull
    private final JsonAdapter<RightIconButtonDTO> nullableRightIconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<TooltipWithOnboardingActionDTO> nullableTooltipWithOnboardingActionDTOAdapter;

    @NotNull
    private final n.a options;

    public ControlsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("favoriteProduct", "removeButton", "quantity", "buyInOneClick", "buyForStars", "moveButton", "moveButtonTooltipWithAction");
        M m11 = M.f71699a;
        this.favoriteProductMoleculeAdapter = moshi.f(FavoriteProductMolecule.class, m11, "favoriteProduct");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "removeButton");
        this.nullableQuantityControlAdapter = moshi.f(ControlsDTO.QuantityControl.class, m11, "quantity");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "buyInOneClick");
        this.nullableRightIconButtonDTOAdapter = moshi.f(RightIconButtonDTO.class, m11, "buyForStars");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "moveButton");
        this.nullableTooltipWithOnboardingActionDTOAdapter = moshi.f(TooltipWithOnboardingActionDTO.class, m11, "moveButtonTooltipWithAction");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(ControlsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ControlsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FavoriteProductMolecule favoriteProductMolecule = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        ControlsDTO.QuantityControl quantityControl = null;
        ButtonV3DTO buttonV3DTO = null;
        RightIconButtonDTO rightIconButtonDTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    favoriteProductMolecule = this.favoriteProductMoleculeAdapter.fromJson(reader);
                    if (favoriteProductMolecule == null) {
                        throw c.q("favoriteProduct", "favoriteProduct", reader);
                    }
                    break;
                case 1:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("removeButton", "removeButton", reader);
                    }
                    break;
                case 2:
                    quantityControl = this.nullableQuantityControlAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    rightIconButtonDTO = this.nullableRightIconButtonDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    iconButtonV3DTO2 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 6:
                    tooltipWithOnboardingActionDTO = this.nullableTooltipWithOnboardingActionDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (favoriteProductMolecule == null) {
            throw c.j("favoriteProduct", "favoriteProduct", reader);
        }
        if (iconButtonV3DTO != null) {
            return new ControlsDTO(favoriteProductMolecule, iconButtonV3DTO, quantityControl, buttonV3DTO, rightIconButtonDTO, iconButtonV3DTO2, tooltipWithOnboardingActionDTO);
        }
        throw c.j("removeButton", "removeButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ControlsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("favoriteProduct");
        this.favoriteProductMoleculeAdapter.mo44toJson(writer, (x) value.getFavoriteProduct());
        writer.w("removeButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRemoveButton());
        writer.w("quantity");
        this.nullableQuantityControlAdapter.mo44toJson(writer, (x) value.getQuantity());
        writer.w("buyInOneClick");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getBuyInOneClick());
        writer.w("buyForStars");
        this.nullableRightIconButtonDTOAdapter.mo44toJson(writer, (x) value.getBuyForStars());
        writer.w("moveButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getMoveButton());
        writer.w("moveButtonTooltipWithAction");
        this.nullableTooltipWithOnboardingActionDTOAdapter.mo44toJson(writer, (x) value.getMoveButtonTooltipWithAction());
        writer.p();
    }
}
