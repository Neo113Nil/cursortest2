package ru.ozon.uni.ozi.atom.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.ozi.atom.models.OziButtonDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/uni/ozi/atom/models/OziButtonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/ozi/atom/models/OziButtonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/ozi/atom/models/OziButtonDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/ozi/atom/models/OziButtonDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;", "nullableStyleTypesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;", "nullableSizesAdapter", "stringAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziButtonDTOJsonAdapter extends JsonAdapter<OziButtonDTO> {
    public static final int $stable = 8;
    private volatile Constructor<OziButtonDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<OziButtonDTO.Sizes> nullableSizesAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<OziButtonDTO.StyleTypes> nullableStyleTypesAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OziButtonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("styleType", "size", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "isDisabled", "common", "titleColor", "subtitleColor", "iconColor", "backgroundColor", "context");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OziButtonDTO.StyleTypes> f7 = moshi.f(OziButtonDTO.StyleTypes.class, m11, "styleType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStyleTypesAdapter = f7;
        JsonAdapter<OziButtonDTO.Sizes> f11 = moshi.f(OziButtonDTO.Sizes.class, m11, "size");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSizesAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "isDisabled");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<CommonControlSettings> f15 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(OziButtonDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OziButtonDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        OziButtonDTO.StyleTypes styleTypes = null;
        OziButtonDTO.Sizes sizes = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        CommonControlSettings commonControlSettings = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    styleTypes = this.nullableStyleTypesAdapter.fromJson(reader);
                    i12 &= -2;
                    break;
                case 1:
                    sizes = this.nullableSizesAdapter.fromJson(reader);
                    i12 &= -3;
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -4092) {
            String str9 = str5;
            String str10 = str4;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Boolean bool2 = bool;
            String str11 = str3;
            String str12 = str2;
            String str13 = str;
            OziButtonDTO.Sizes sizes2 = sizes;
            OziButtonDTO.StyleTypes styleTypes2 = styleTypes;
            if (str13 != null) {
                return new OziButtonDTO(styleTypes2, sizes2, str13, str12, str11, bool2, commonControlSettings2, str10, str9, str6, str7, str8);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        String str14 = str5;
        String str15 = str4;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        Boolean bool3 = bool;
        String str16 = str3;
        String str17 = str2;
        String str18 = str;
        OziButtonDTO.Sizes sizes3 = sizes;
        OziButtonDTO.StyleTypes styleTypes3 = styleTypes;
        Constructor<OziButtonDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = OziButtonDTO.class.getDeclaredConstructor(OziButtonDTO.StyleTypes.class, OziButtonDTO.Sizes.class, String.class, String.class, String.class, Boolean.class, CommonControlSettings.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<OziButtonDTO> constructor2 = constructor;
        if (str18 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        OziButtonDTO newInstance = constructor2.newInstance(styleTypes3, sizes3, str18, str17, str16, bool3, commonControlSettings3, str15, str14, str6, str7, str8, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OziButtonDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("styleType");
        this.nullableStyleTypesAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("size");
        this.nullableSizesAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("titleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitleColor());
        writer.w("subtitleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitleColor());
        writer.w("iconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.p();
    }
}
