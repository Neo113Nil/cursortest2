package ru.ozon.android.composerCommonViewKit.emptyState.v2.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/EmptyStateV2DTO$EmptyStateSize;", "emptyStateSizeAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2DTOJsonAdapter extends JsonAdapter<EmptyStateV2DTO> {
    public static final int $stable = 8;
    private volatile Constructor<EmptyStateV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<EmptyStateV2DTO.EmptyStateSize> emptyStateSizeAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public EmptyStateV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("message", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "buttons", "size", "backgroundColor", "imageAtom", "titleAtom", "messageAtom");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "message");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<List<AtomDTO>> f12 = moshi.f(D.e(List.class, AtomDTO.class), m11, "buttons");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfAtomDTOAdapter = f12;
        JsonAdapter<EmptyStateV2DTO.EmptyStateSize> f13 = moshi.f(EmptyStateV2DTO.EmptyStateSize.class, m11, "size");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.emptyStateSizeAdapter = f13;
        JsonAdapter<ImageDTO> f14 = moshi.f(ImageDTO.class, m11, "imageAtom");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableImageDTOAdapter = f14;
        JsonAdapter<TextDTO> f15 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTextDTOAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(EmptyStateV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EmptyStateV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        String str2 = null;
        List<AtomDTO> list = null;
        EmptyStateV2DTO.EmptyStateSize emptyStateSize = null;
        String str3 = null;
        ImageDTO imageDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    emptyStateSize = this.emptyStateSizeAdapter.fromJson(reader);
                    if (emptyStateSize == null) {
                        throw c.q("size", "size", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -401) {
            List<AtomDTO> list2 = list;
            String str4 = str2;
            String str5 = str;
            Intrinsics.g(emptyStateSize, "null cannot be cast to non-null type ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO.EmptyStateSize");
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            return new EmptyStateV2DTO(ozonSpannableString, str5, str4, list2, emptyStateSize, str3, imageDTO, textDTO4, textDTO3);
        }
        List<AtomDTO> list3 = list;
        String str6 = str2;
        String str7 = str;
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        Constructor<EmptyStateV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmptyStateV2DTO.class.getDeclaredConstructor(OzonSpannableString.class, String.class, String.class, List.class, EmptyStateV2DTO.EmptyStateSize.class, String.class, ImageDTO.class, TextDTO.class, TextDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        EmptyStateV2DTO newInstance = constructor.newInstance(ozonSpannableString2, str7, str6, list3, emptyStateSize, str3, imageDTO, textDTO, textDTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EmptyStateV2DTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("message");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getMessage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("buttons");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value_.getButtons());
        writer.w("size");
        this.emptyStateSizeAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("imageAtom");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImageAtom());
        writer.w("titleAtom");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("messageAtom");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getMessageAtom());
        writer.p();
    }
}
