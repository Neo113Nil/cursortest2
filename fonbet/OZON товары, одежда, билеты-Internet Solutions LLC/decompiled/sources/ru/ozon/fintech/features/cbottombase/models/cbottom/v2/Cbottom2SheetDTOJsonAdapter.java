package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

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
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SheetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "cbottomTypeAdapter", "", "nullableIntAdapter", "", "LF40/a;", "nullableListOfCbottomWidget2DTOAdapter", "", "nullableBooleanAdapter", "nullableListOfIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2SheetDTOJsonAdapter extends JsonAdapter<Cbottom2SheetDTO> {

    @NotNull
    private final JsonAdapter<CbottomType> cbottomTypeAdapter;
    private volatile Constructor<Cbottom2SheetDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<F40.a>> nullableListOfCbottomWidget2DTOAdapter;

    @NotNull
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public Cbottom2SheetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "type", "version", CommentV3DTO.HEADER_FIELD_NAME, "main", CommentV3DTO.FOOTER_FIELD_NAME, "dashHidden", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "headerPaddings", "mainPaddings", "footerPaddings");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<CbottomType> f11 = moshi.f(CbottomType.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.cbottomTypeAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<List<F40.a>> f13 = moshi.f(D.e(List.class, F40.a.class), m11, CommentV3DTO.HEADER_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfCbottomWidget2DTOAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "dashHidden");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<List<Integer>> f15 = moshi.f(D.e(List.class, Integer.class), m11, "headerPaddings");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfIntAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(Cbottom2SheetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Cbottom2SheetDTO fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str2 = null;
        CbottomType cbottomType = null;
        Integer num = null;
        List<F40.a> list = null;
        List<F40.a> list2 = null;
        List<F40.a> list3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List<Integer> list4 = null;
        List<Integer> list5 = null;
        List<Integer> list6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    cbottomType = this.cbottomTypeAdapter.fromJson(reader);
                    if (cbottomType == null) {
                        throw c.q("type", "type", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    list = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    list3 = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    list4 = this.nullableListOfIntAdapter.fromJson(reader);
                    break;
                case 9:
                    list5 = this.nullableListOfIntAdapter.fromJson(reader);
                    break;
                case 10:
                    list6 = this.nullableListOfIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            String str3 = str2;
            if (str3 == null) {
                throw c.j("id", "id", reader);
            }
            Intrinsics.g(cbottomType, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType");
            List<Integer> list7 = list4;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            List<F40.a> list8 = list3;
            List<F40.a> list9 = list2;
            return new Cbottom2SheetDTO(str3, cbottomType, num, list, list9, list8, bool4, bool3, list7, list5, list6);
        }
        String str4 = str2;
        Constructor<Cbottom2SheetDTO> constructor = this.constructorRef;
        if (constructor == null) {
            str = str4;
            constructor = Cbottom2SheetDTO.class.getDeclaredConstructor(String.class, CbottomType.class, Integer.class, List.class, List.class, List.class, Boolean.class, Boolean.class, List.class, List.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            str = str4;
        }
        Constructor<Cbottom2SheetDTO> constructor2 = constructor;
        if (str == null) {
            throw c.j("id", "id", reader);
        }
        Cbottom2SheetDTO newInstance = constructor2.newInstance(str, cbottomType, num, list, list2, list3, bool, bool2, list4, list5, list6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cbottom2SheetDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("type");
        this.cbottomTypeAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("version");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersion());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getHeader());
        writer.w("main");
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getMain());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getFooter());
        writer.w("dashHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getDashHidden());
        writer.w(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getExpanded());
        writer.w("headerPaddings");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getHeaderPaddings());
        writer.w("mainPaddings");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getMainPaddings());
        writer.w("footerPaddings");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getFooterPaddings());
        writer.p();
    }
}
