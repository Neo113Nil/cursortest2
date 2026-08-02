package ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data;

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
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data.B2bContactUsDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO_BannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "themeImageV1DTOAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bContactUsDTO_BannerDTOJsonAdapter extends JsonAdapter<B2bContactUsDTO.BannerDTO> {
    public static final int $stable = 8;
    private volatile Constructor<B2bContactUsDTO.BannerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    @NotNull
    private final JsonAdapter<ThemeImageV1DTO> themeImageV1DTOAdapter;

    public B2bContactUsDTO_BannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "action", "imageUrl", "backgroundColor");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.themeImageV1DTOAdapter = moshi.f(ThemeImageV1DTO.class, m11, "imageUrl");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(B2bContactUsDTO.BannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public B2bContactUsDTO.BannerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        AtomActionDTO atomActionDTO = null;
        ThemeImageV1DTO themeImageV1DTO = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 2) {
                atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                themeImageV1DTO = this.themeImageV1DTOAdapter.fromJson(reader);
                if (themeImageV1DTO == null) {
                    throw c.q("imageUrl", "imageUrl", reader);
                }
            } else if (v11 == 4) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
                i11 = -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            ThemeImageV1DTO themeImageV1DTO2 = themeImageV1DTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            TextAtom textAtom3 = textAtom2;
            TextAtom textAtom4 = textAtom;
            if (textAtom4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (themeImageV1DTO2 == null) {
                throw c.j("imageUrl", "imageUrl", reader);
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new B2bContactUsDTO.BannerDTO(textAtom4, textAtom3, atomActionDTO2, themeImageV1DTO2, str);
        }
        ThemeImageV1DTO themeImageV1DTO3 = themeImageV1DTO;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        TextAtom textAtom5 = textAtom2;
        TextAtom textAtom6 = textAtom;
        Constructor<B2bContactUsDTO.BannerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = B2bContactUsDTO.BannerDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, AtomActionDTO.class, ThemeImageV1DTO.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<B2bContactUsDTO.BannerDTO> constructor2 = constructor;
        if (textAtom6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (themeImageV1DTO3 == null) {
            throw c.j("imageUrl", "imageUrl", reader);
        }
        B2bContactUsDTO.BannerDTO newInstance = constructor2.newInstance(textAtom6, textAtom5, atomActionDTO3, themeImageV1DTO3, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, B2bContactUsDTO.BannerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("imageUrl");
        this.themeImageV1DTOAdapter.mo44toJson(writer, (x) value.getImageUrl());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
