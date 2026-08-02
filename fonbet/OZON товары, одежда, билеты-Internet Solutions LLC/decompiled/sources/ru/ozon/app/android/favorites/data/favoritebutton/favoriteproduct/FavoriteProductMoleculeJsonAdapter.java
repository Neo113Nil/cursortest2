package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;", "nullableThemeTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteProductMoleculeJsonAdapter extends JsonAdapter<FavoriteProductMolecule> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FavoriteProductMolecule> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMolecule.ThemeType> nullableThemeTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    public FavoriteProductMoleculeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("theme", "sku", "isFavorite", "favoriteButton", "unfavoriteButton", "addToListAction", "changeSourceId");
        M m11 = M.f71699a;
        this.nullableThemeTypeAdapter = moshi.f(FavoriteProductMolecule.ThemeType.class, m11, "theme");
        this.longAdapter = moshi.f(Long.TYPE, m11, "sku");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFavorite");
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "favoriteButton");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "addToListAction");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "changeSourceId");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(FavoriteProductMolecule)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FavoriteProductMolecule fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        FavoriteProductMolecule.ThemeType themeType = null;
        Long l11 = null;
        Boolean bool = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        AtomActionDTO atomActionDTO = null;
        Integer num = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    themeType = this.nullableThemeTypeAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("sku", "sku", reader);
                    }
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isFavorite", "isFavorite", reader);
                    }
                    break;
                case 3:
                    smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton == null) {
                        throw c.q("favoriteButton", "favoriteButton", reader);
                    }
                    break;
                case 4:
                    smallIconButton2 = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton2 == null) {
                        throw c.q("unfavoriteButton", "unfavoriteButton", reader);
                    }
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -66) {
            Long l12 = l11;
            FavoriteProductMolecule.ThemeType themeType2 = themeType;
            if (l12 == null) {
                throw c.j("sku", "sku", reader);
            }
            Boolean bool2 = bool;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            ButtonV3Atom.SmallIconButton smallIconButton3 = smallIconButton;
            long longValue = l12.longValue();
            if (bool2 == null) {
                throw c.j("isFavorite", "isFavorite", reader);
            }
            Integer num2 = num;
            ButtonV3Atom.SmallIconButton smallIconButton4 = smallIconButton2;
            boolean booleanValue = bool2.booleanValue();
            if (smallIconButton3 == null) {
                throw c.j("favoriteButton", "favoriteButton", reader);
            }
            if (smallIconButton4 != null) {
                return new FavoriteProductMolecule(themeType2, longValue, booleanValue, smallIconButton3, smallIconButton4, atomActionDTO2, num2);
            }
            throw c.j("unfavoriteButton", "unfavoriteButton", reader);
        }
        Integer num3 = num;
        ButtonV3Atom.SmallIconButton smallIconButton5 = smallIconButton2;
        Long l13 = l11;
        Boolean bool3 = bool;
        FavoriteProductMolecule.ThemeType themeType3 = themeType;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        ButtonV3Atom.SmallIconButton smallIconButton6 = smallIconButton;
        Constructor<FavoriteProductMolecule> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FavoriteProductMolecule.class.getDeclaredConstructor(FavoriteProductMolecule.ThemeType.class, Long.TYPE, Boolean.TYPE, ButtonV3Atom.SmallIconButton.class, ButtonV3Atom.SmallIconButton.class, AtomActionDTO.class, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l13 == null) {
            throw c.j("sku", "sku", reader);
        }
        if (bool3 == null) {
            throw c.j("isFavorite", "isFavorite", reader);
        }
        if (smallIconButton6 == null) {
            throw c.j("favoriteButton", "favoriteButton", reader);
        }
        if (smallIconButton5 == null) {
            throw c.j("unfavoriteButton", "unfavoriteButton", reader);
        }
        FavoriteProductMolecule newInstance = constructor.newInstance(themeType3, l13, bool3, smallIconButton6, smallIconButton5, atomActionDTO3, num3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FavoriteProductMolecule value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("theme");
        this.nullableThemeTypeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSku()));
        writer.w("isFavorite");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFavorite()));
        writer.w("favoriteButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("unfavoriteButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getUnfavoriteButton());
        writer.w("addToListAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAddToListAction());
        writer.w("changeSourceId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getChangeSourceId());
        writer.p();
    }
}
