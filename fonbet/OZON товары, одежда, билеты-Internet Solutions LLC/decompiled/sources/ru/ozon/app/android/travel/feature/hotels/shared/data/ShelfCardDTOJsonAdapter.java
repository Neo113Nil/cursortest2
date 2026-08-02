package ru.ozon.app.android.travel.feature.hotels.shared.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;", "galleryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "nullableFavoriteProductMoleculeV4Adapter", "", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$ContentItem;", "listOfContentItemAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Theme;", "nullableThemeAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShelfCardDTOJsonAdapter extends JsonAdapter<ShelfCardDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ShelfCardDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ShelfCardDTO.Gallery> galleryAdapter;

    @NotNull
    private final JsonAdapter<List<ShelfCardDTO.ContentItem>> listOfContentItemAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMoleculeV4> nullableFavoriteProductMoleculeV4Adapter;

    @NotNull
    private final JsonAdapter<ShelfCardDTO.Theme> nullableThemeAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public ShelfCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("gallery", "favoriteButton", "contentList", "common", "theme");
        M m11 = M.f71699a;
        this.galleryAdapter = moshi.f(ShelfCardDTO.Gallery.class, m11, "gallery");
        this.nullableFavoriteProductMoleculeV4Adapter = moshi.f(FavoriteProductMoleculeV4.class, m11, "favoriteButton");
        this.listOfContentItemAdapter = moshi.f(D.e(List.class, ShelfCardDTO.ContentItem.class), m11, "contentList");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableThemeAtEnumNullFallbackAdapter = moshi.f(ShelfCardDTO.Theme.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "theme");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(ShelfCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ShelfCardDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ShelfCardDTO.Gallery gallery = null;
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = null;
        List<ShelfCardDTO.ContentItem> list = null;
        CommonControlSettings commonControlSettings = null;
        ShelfCardDTO.Theme theme = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                gallery = this.galleryAdapter.fromJson(reader);
                if (gallery == null) {
                    throw c.q("gallery", "gallery", reader);
                }
            } else if (v11 == 1) {
                favoriteProductMoleculeV4 = this.nullableFavoriteProductMoleculeV4Adapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.listOfContentItemAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("contentList", "contentList", reader);
                }
                i11 = -5;
            } else if (v11 == 3) {
                commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
            } else if (v11 == 4) {
                theme = this.nullableThemeAtEnumNullFallbackAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -5) {
            FavoriteProductMoleculeV4 favoriteProductMoleculeV42 = favoriteProductMoleculeV4;
            ShelfCardDTO.Gallery gallery2 = gallery;
            if (gallery2 == null) {
                throw c.j("gallery", "gallery", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO.ContentItem>");
            return new ShelfCardDTO(gallery2, favoriteProductMoleculeV42, list, commonControlSettings, theme);
        }
        FavoriteProductMoleculeV4 favoriteProductMoleculeV43 = favoriteProductMoleculeV4;
        ShelfCardDTO.Gallery gallery3 = gallery;
        Constructor<ShelfCardDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShelfCardDTO.class.getDeclaredConstructor(ShelfCardDTO.Gallery.class, FavoriteProductMoleculeV4.class, List.class, CommonControlSettings.class, ShelfCardDTO.Theme.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<ShelfCardDTO> constructor2 = constructor;
        if (gallery3 == null) {
            throw c.j("gallery", "gallery", reader);
        }
        ShelfCardDTO newInstance = constructor2.newInstance(gallery3, favoriteProductMoleculeV43, list, commonControlSettings, theme, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ShelfCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("gallery");
        this.galleryAdapter.mo44toJson(writer, (x) value.getGallery());
        writer.w("favoriteButton");
        this.nullableFavoriteProductMoleculeV4Adapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("contentList");
        this.listOfContentItemAdapter.mo44toJson(writer, (x) value.getContentList());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("theme");
        this.nullableThemeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.p();
    }
}
