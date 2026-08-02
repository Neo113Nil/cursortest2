package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;", "buttonInfoDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFavoriteMoleculeDTOJsonAdapter extends JsonAdapter<FreshFavoriteMoleculeDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<FreshFavoriteMoleculeDTO.ButtonInfoDTO> buttonInfoDTOAdapter;
    private volatile Constructor<FreshFavoriteMoleculeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    public FreshFavoriteMoleculeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", "isFavorite", "favoriteButton", "unfavoriteButton");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "sku");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFavorite");
        this.buttonInfoDTOAdapter = moshi.f(FreshFavoriteMoleculeDTO.ButtonInfoDTO.class, m11, "favoriteButton");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(FreshFavoriteMoleculeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FreshFavoriteMoleculeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        Long l11 = null;
        FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO = null;
        FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("sku", "sku", reader);
                }
            } else if (v11 == 1) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("isFavorite", "isFavorite", reader);
                }
                i11 = -3;
            } else if (v11 == 2) {
                buttonInfoDTO = this.buttonInfoDTOAdapter.fromJson(reader);
                if (buttonInfoDTO == null) {
                    throw c.q("favoriteButton", "favoriteButton", reader);
                }
            } else if (v11 == 3 && (buttonInfoDTO2 = this.buttonInfoDTOAdapter.fromJson(reader)) == null) {
                throw c.q("unfavoriteButton", "unfavoriteButton", reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO3 = buttonInfoDTO;
            if (l11 == null) {
                throw c.j("sku", "sku", reader);
            }
            FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO4 = buttonInfoDTO2;
            long longValue = l11.longValue();
            boolean booleanValue = bool2.booleanValue();
            if (buttonInfoDTO3 == null) {
                throw c.j("favoriteButton", "favoriteButton", reader);
            }
            if (buttonInfoDTO4 != null) {
                return new FreshFavoriteMoleculeDTO(longValue, booleanValue, buttonInfoDTO3, buttonInfoDTO4);
            }
            throw c.j("unfavoriteButton", "unfavoriteButton", reader);
        }
        FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO5 = buttonInfoDTO2;
        FreshFavoriteMoleculeDTO.ButtonInfoDTO buttonInfoDTO6 = buttonInfoDTO;
        Constructor<FreshFavoriteMoleculeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FreshFavoriteMoleculeDTO.class.getDeclaredConstructor(Long.TYPE, Boolean.TYPE, FreshFavoriteMoleculeDTO.ButtonInfoDTO.class, FreshFavoriteMoleculeDTO.ButtonInfoDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l11 == null) {
            throw c.j("sku", "sku", reader);
        }
        if (buttonInfoDTO6 == null) {
            throw c.j("favoriteButton", "favoriteButton", reader);
        }
        if (buttonInfoDTO5 == null) {
            throw c.j("unfavoriteButton", "unfavoriteButton", reader);
        }
        FreshFavoriteMoleculeDTO newInstance = constructor.newInstance(l11, bool2, buttonInfoDTO6, buttonInfoDTO5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FreshFavoriteMoleculeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSku()));
        writer.w("isFavorite");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFavorite()));
        writer.w("favoriteButton");
        this.buttonInfoDTOAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("unfavoriteButton");
        this.buttonInfoDTOAdapter.mo44toJson(writer, (x) value.getUnfavoriteButton());
        writer.p();
    }
}
