package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.AtomComponentDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.MultiButtonDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileImageComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R$\u0010#\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO_GridItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;", "nullableOnboardingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/AtomComponentDTO;", "listOfAtomComponentDTOAdapter", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "tileImageComponentAdapter", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;", "nullableMultiButtonDTOAdapter", "", "nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchResultsGridDTO_GridItemDTOJsonAdapter extends JsonAdapter<SearchResultsGridDTO.GridItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SearchResultsGridDTO.GridItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<AtomComponentDTO>> listOfAtomComponentDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<Object>> nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MultiButtonDTO> nullableMultiButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<SearchResultsGridDTO.GridItemDTO.Onboarding> nullableOnboardingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TileImageComponent> tileImageComponentAdapter;

    public SearchResultsGridDTO_GridItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("onboarding", "backgroundImage", "backgroundColor", "mainState", "tileImage", "multiButton", "topRightButtons", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "action", "trackingInfo", "compactFavoriteIcon");
        M m11 = M.f71699a;
        this.nullableOnboardingAdapter = moshi.f(SearchResultsGridDTO.GridItemDTO.Onboarding.class, m11, "onboarding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundImage");
        this.listOfAtomComponentDTOAdapter = moshi.f(D.e(List.class, AtomComponentDTO.class), m11, "mainState");
        this.tileImageComponentAdapter = moshi.f(TileImageComponent.class, m11, "tileImage");
        this.nullableMultiButtonDTOAdapter = moshi.f(MultiButtonDTO.class, m11, "multiButton");
        b e11 = D.e(List.class, Object.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO_GridItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(TopRightButtonCheckBox.class);
        final String str2 = "checkbox";
        final String str3 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO_GridItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b12 = N.b(FavoriteProductMolecule.class);
        final String str4 = "favoriteProductMolecule";
        ProtoOneOfSignature protoOneOfSignature2 = new ProtoOneOfSignature(str4, str3, b12) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO_GridItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b13 = N.b(FavoriteProductMoleculeV2.class);
        final String str5 = "favoriteProductMoleculeV2";
        ProtoOneOfSignature protoOneOfSignature3 = new ProtoOneOfSignature(str5, str3, b13) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO_GridItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b14 = N.b(ButtonV3Atom.SmallIconButton.class);
        final String str6 = "smallIconButton";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, protoOneOfSignature2, protoOneOfSignature3, new ProtoOneOfSignature(str6, str3, b14) { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO_GridItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "topRightButtons");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "compactFavoriteIcon");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(54, "GeneratedJsonAdapter(SearchResultsGridDTO.GridItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchResultsGridDTO.GridItemDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        SearchResultsGridDTO.GridItemDTO.Onboarding onboarding = null;
        String str = null;
        String str2 = null;
        List<AtomComponentDTO> list = null;
        TileImageComponent tileImageComponent = null;
        MultiButtonDTO multiButtonDTO = null;
        List<Object> list2 = null;
        Boolean bool = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool2 = null;
        while (true) {
            SearchResultsGridDTO.GridItemDTO.Onboarding onboarding2 = onboarding;
            String str3 = str;
            if (!reader.hasNext()) {
                String str4 = str2;
                reader.endObject();
                if (i12 == -1032) {
                    if (list == null) {
                        throw Y9.c.j("mainState", "mainState", reader);
                    }
                    if (tileImageComponent == null) {
                        throw Y9.c.j("tileImage", "tileImage", reader);
                    }
                    if (bool == null) {
                        throw Y9.c.j(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    boolean booleanValue = bool.booleanValue();
                    if (atomActionDTO2 == null) {
                        throw Y9.c.j("action", "action", reader);
                    }
                    List<Object> list3 = list2;
                    return new SearchResultsGridDTO.GridItemDTO(onboarding2, str3, str4, list, tileImageComponent, multiButtonDTO, list3, booleanValue, atomActionDTO2, map, bool2);
                }
                Constructor<SearchResultsGridDTO.GridItemDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = SearchResultsGridDTO.GridItemDTO.class.getDeclaredConstructor(SearchResultsGridDTO.GridItemDTO.Onboarding.class, String.class, String.class, List.class, TileImageComponent.class, MultiButtonDTO.class, List.class, Boolean.TYPE, AtomActionDTO.class, Map.class, Boolean.class, Integer.TYPE, Y9.c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<SearchResultsGridDTO.GridItemDTO> constructor2 = constructor;
                if (list == null) {
                    throw Y9.c.j("mainState", "mainState", reader);
                }
                if (tileImageComponent == null) {
                    throw Y9.c.j("tileImage", "tileImage", reader);
                }
                if (bool == null) {
                    throw Y9.c.j(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                }
                if (atomActionDTO == null) {
                    throw Y9.c.j("action", "action", reader);
                }
                SearchResultsGridDTO.GridItemDTO newInstance = constructor2.newInstance(onboarding2, str3, str4, list, tileImageComponent, multiButtonDTO, list2, bool, atomActionDTO, map, bool2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str5 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 0:
                    onboarding = this.nullableOnboardingAdapter.fromJson(reader);
                    i12 &= -2;
                    str2 = str5;
                    str = str3;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    str2 = str5;
                    onboarding = onboarding2;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    onboarding = onboarding2;
                    str = str3;
                case 3:
                    list = this.listOfAtomComponentDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("mainState", "mainState", reader);
                    }
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 4:
                    tileImageComponent = this.tileImageComponentAdapter.fromJson(reader);
                    if (tileImageComponent == null) {
                        throw Y9.c.q("tileImage", "tileImage", reader);
                    }
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 5:
                    multiButtonDTO = this.nullableMultiButtonDTOAdapter.fromJson(reader);
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 6:
                    list2 = this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 7:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw Y9.c.q(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, reader);
                    }
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 8:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw Y9.c.q("action", "action", reader);
                    }
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                case 10:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -1025;
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
                default:
                    str2 = str5;
                    onboarding = onboarding2;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchResultsGridDTO.GridItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("onboarding");
        this.nullableOnboardingAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("backgroundImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundImage());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("mainState");
        this.listOfAtomComponentDTOAdapter.mo44toJson(writer, (x) value.getMainState());
        writer.w("tileImage");
        this.tileImageComponentAdapter.mo44toJson(writer, (x) value.getTileImage());
        writer.w("multiButton");
        this.nullableMultiButtonDTOAdapter.mo44toJson(writer, (x) value.getMultiButton());
        writer.w("topRightButtons");
        this.nullableListOfNullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getTopRightButtons());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isAdult()));
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("compactFavoriteIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getCompactFavoriteIcon());
        writer.p();
    }
}
