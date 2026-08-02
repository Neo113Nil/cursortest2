package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollItemDTO;
import ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR$\u0010&\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001aR\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001aR\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "", "nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;", "tileImageDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;", "nullableMultiButtonDTOAdapter", "nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "nullableBooleanAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;", "nullableOnboardingAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;", "nullableBrandLogoAdapter", "nullableListOfStringAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;", "nullableKebabDTOAdapter", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "nullableUgcRatingMoleculeAdapter", "Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "nullableCountButtonDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ItemDTOJsonAdapter extends JsonAdapter<TileGrid2ItemDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TileGrid2ItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<TileGrid2ItemDTO.BrandLogo> nullableBrandLogoAdapter;

    @NotNull
    private final JsonAdapter<CountButtonDTO> nullableCountButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<TileGrid2ItemDTO.KebabDTO> nullableKebabDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Object>> nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<List<Object>> nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MultiButtonDTO> nullableMultiButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<TileGrid2ItemDTO.Onboarding> nullableOnboardingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<UgcRatingMolecule> nullableUgcRatingMoleculeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TileImageDTO> tileImageDTOAdapter;

    public TileGrid2ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("mainState", "trackingInfo", "tileImage", "action", "isPagerIndicatorHidden", "multiButton", "topRightButtons", "compactFavoriteIcon", "onboarding", "brandLogo", "aspects", "islandBackgroundColor", "sku", "kebab", "rating", "isTextTagSupported", "countButton", "id", "topRightButtonsAnimationEnabled");
        b e11 = D.e(List.class, Object.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(LabelListAtom.class);
        final String str2 = "labelList";
        final String str3 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(PriceDTO.class);
        final String str4 = DynamicElementDTO.PRICE_V2;
        ProtoOneOfSignature protoOneOfSignature2 = new ProtoOneOfSignature(str4, str3, b12) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str4;
                this.fieldName = str3;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b13 = N.b(TextDTO.class);
        final String str5 = SkuThinScrollItemDTO.TEXT_V2;
        ProtoOneOfSignature protoOneOfSignature3 = new ProtoOneOfSignature(str5, str3, b13) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str5, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b13, "type");
                this.name = str5;
                this.fieldName = str3;
                this.type = C6345a.b(b13);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b14 = N.b(TextAtom.class);
        final String str6 = "textAtom";
        ProtoOneOfSignature protoOneOfSignature4 = new ProtoOneOfSignature(str6, str3, b14) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str6, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b14, "type");
                this.name = str6;
                this.fieldName = str3;
                this.type = C6345a.b(b14);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b15 = N.b(LabelListDTO.class);
        final String str7 = "labelListV2";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, protoOneOfSignature2, protoOneOfSignature3, protoOneOfSignature4, new ProtoOneOfSignature(str7, str3, b15) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str7, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b15, "type");
                this.name = str7;
                this.fieldName = str3;
                this.type = C6345a.b(b15);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "mainState");
        b e12 = D.e(Map.class, String.class, TokenizedTrackingInfo.class);
        M m11 = M.f71699a;
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(e12, m11, "trackingInfo");
        this.tileImageDTOAdapter = moshi.f(TileImageDTO.class, m11, "tileImage");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isPagerIndicatorHidden");
        this.nullableMultiButtonDTOAdapter = moshi.f(MultiButtonDTO.class, m11, "multiButton");
        b e13 = D.e(List.class, Object.class);
        ProtoOneOf protoOneOf2 = new ProtoOneOf(str) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b16 = N.b(TopRightButtonCheckBox.class);
        final String str8 = "checkbox";
        ProtoOneOfSignature protoOneOfSignature5 = new ProtoOneOfSignature(str8, str3, b16) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str8, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b16, "type");
                this.name = str8;
                this.fieldName = str3;
                this.type = C6345a.b(b16);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b17 = N.b(FavoriteProductMoleculeV2.class);
        final String str9 = "favoriteProductMoleculeV2";
        ProtoOneOfSignature protoOneOfSignature6 = new ProtoOneOfSignature(str9, str3, b17) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str9, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b17, "type");
                this.name = str9;
                this.fieldName = str3;
                this.type = C6345a.b(b17);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b18 = N.b(ButtonV3Atom.SmallIconButton.class);
        final String str10 = "smallIconButton";
        ProtoOneOfSignature protoOneOfSignature7 = new ProtoOneOfSignature(str10, str3, b18) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str10, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b18, "type");
                this.name = str10;
                this.fieldName = str3;
                this.type = C6345a.b(b18);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b19 = N.b(IconButtonV3DTO.class);
        final String str11 = "iconButton";
        ProtoOneOfSignature protoOneOfSignature8 = new ProtoOneOfSignature(str11, str3, b19) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str11, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b19, "type");
                this.name = str11;
                this.fieldName = str3;
                this.type = C6345a.b(b19);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b21 = N.b(FavoriteToggleProductButtonMolecule.class);
        final String str12 = "favoriteToggleProductMolecule";
        ProtoOneOfSignature protoOneOfSignature9 = new ProtoOneOfSignature(str12, str3, b21) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str12, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b21, "type");
                this.name = str12;
                this.fieldName = str3;
                this.type = C6345a.b(b21);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b22 = N.b(CheckBoxDTO.class);
        final String str13 = "checkboxDS";
        Annotation[] elements2 = {protoOneOf2, protoOneOfSignature5, protoOneOfSignature6, protoOneOfSignature7, protoOneOfSignature8, protoOneOfSignature9, new ProtoOneOfSignature(str13, str3, b22) { // from class: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str13, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b22, "type");
                this.name = str13;
                this.fieldName = str3;
                this.type = C6345a.b(b22);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e13, C7705l.j0(elements2), "topRightButtons");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "compactFavoriteIcon");
        this.nullableOnboardingAdapter = moshi.f(TileGrid2ItemDTO.Onboarding.class, m11, "onboarding");
        this.nullableBrandLogoAdapter = moshi.f(TileGrid2ItemDTO.BrandLogo.class, m11, "brandLogo");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "aspects");
        this.nullableStringAdapter = moshi.f(String.class, m11, "islandBackgroundColor");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "sku");
        this.nullableKebabDTOAdapter = moshi.f(TileGrid2ItemDTO.KebabDTO.class, m11, "kebab");
        this.nullableUgcRatingMoleculeAdapter = moshi.f(UgcRatingMolecule.class, m11, "rating");
        this.nullableCountButtonDTOAdapter = moshi.f(CountButtonDTO.class, m11, "countButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(TileGrid2ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileGrid2ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        List<Object> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TileImageDTO tileImageDTO = null;
        AtomActionDTO atomActionDTO = null;
        List<String> list2 = null;
        MultiButtonDTO multiButtonDTO = null;
        List<Object> list3 = null;
        Boolean bool3 = null;
        TileGrid2ItemDTO.Onboarding onboarding = null;
        TileGrid2ItemDTO.BrandLogo brandLogo = null;
        CountButtonDTO countButtonDTO = null;
        String str = null;
        Long l11 = null;
        TileGrid2ItemDTO.KebabDTO kebabDTO = null;
        UgcRatingMolecule ugcRatingMolecule = null;
        Boolean bool4 = null;
        String str2 = null;
        Boolean bool5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 1:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 2:
                    tileImageDTO = this.tileImageDTOAdapter.fromJson(reader);
                    if (tileImageDTO == null) {
                        throw Y9.c.q("tileImage", "tileImage", reader);
                    }
                    break;
                case 3:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("isPagerIndicatorHidden", "isPagerIndicatorHidden", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    multiButtonDTO = this.nullableMultiButtonDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    list3 = this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 7:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    onboarding = this.nullableOnboardingAdapter.fromJson(reader);
                    break;
                case 9:
                    brandLogo = this.nullableBrandLogoAdapter.fromJson(reader);
                    break;
                case 10:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    kebabDTO = this.nullableKebabDTOAdapter.fromJson(reader);
                    break;
                case 14:
                    ugcRatingMolecule = this.nullableUgcRatingMoleculeAdapter.fromJson(reader);
                    break;
                case 15:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    countButtonDTO = this.nullableCountButtonDTOAdapter.fromJson(reader);
                    break;
                case 17:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -131073;
                    break;
                case 18:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -135313) {
            if (tileImageDTO == null) {
                throw Y9.c.j("tileImage", "tileImage", reader);
            }
            return new TileGrid2ItemDTO(list, map, tileImageDTO, atomActionDTO, bool2.booleanValue(), multiButtonDTO, list3, bool3, onboarding, brandLogo, list2, str, l11, kebabDTO, ugcRatingMolecule, bool4, countButtonDTO, str2, bool5);
        }
        CountButtonDTO countButtonDTO2 = countButtonDTO;
        List<String> list4 = list2;
        Constructor<TileGrid2ItemDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileGrid2ItemDTO.class.getDeclaredConstructor(List.class, Map.class, TileImageDTO.class, AtomActionDTO.class, Boolean.TYPE, MultiButtonDTO.class, List.class, Boolean.class, TileGrid2ItemDTO.Onboarding.class, TileGrid2ItemDTO.BrandLogo.class, List.class, String.class, Long.class, TileGrid2ItemDTO.KebabDTO.class, UgcRatingMolecule.class, Boolean.class, CountButtonDTO.class, String.class, Boolean.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (tileImageDTO == null) {
            throw Y9.c.j("tileImage", "tileImage", reader);
        }
        TileGrid2ItemDTO newInstance = constructor.newInstance(list, map, tileImageDTO, atomActionDTO, bool2, multiButtonDTO, list3, bool3, onboarding, brandLogo, list4, str, l11, kebabDTO, ugcRatingMolecule, bool4, countButtonDTO2, str2, bool5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileGrid2ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("mainState");
        this.nullableListOfAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getMainState());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("tileImage");
        this.tileImageDTOAdapter.mo44toJson(writer, (x) value.getTileImage());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("isPagerIndicatorHidden");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isPagerIndicatorHidden()));
        writer.w("multiButton");
        this.nullableMultiButtonDTOAdapter.mo44toJson(writer, (x) value.getMultiButton());
        writer.w("topRightButtons");
        this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getTopRightButtons());
        writer.w("compactFavoriteIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getCompactFavoriteIcon());
        writer.w("onboarding");
        this.nullableOnboardingAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("brandLogo");
        this.nullableBrandLogoAdapter.mo44toJson(writer, (x) value.getBrandLogo());
        writer.w("aspects");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getAspects());
        writer.w("islandBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIslandBackgroundColor());
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("kebab");
        this.nullableKebabDTOAdapter.mo44toJson(writer, (x) value.getKebab());
        writer.w("rating");
        this.nullableUgcRatingMoleculeAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("isTextTagSupported");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isTextTagSupported());
        writer.w("countButton");
        this.nullableCountButtonDTOAdapter.mo44toJson(writer, (x) value.getCountButton());
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("topRightButtonsAnimationEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getTopRightButtonsAnimationEnabled());
        writer.p();
    }
}
