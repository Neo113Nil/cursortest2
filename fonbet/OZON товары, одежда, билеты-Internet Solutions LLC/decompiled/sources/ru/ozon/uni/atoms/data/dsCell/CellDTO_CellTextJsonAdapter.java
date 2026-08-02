package ru.ozon.uni.atoms.data.dsCell;

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
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO_CellTextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsCell/CellDTO$CellText;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "nullableTruncatingModeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellDTO_CellTextJsonAdapter extends JsonAdapter<CellDTO.CellText> {
    public static final int $stable = 8;
    private volatile Constructor<CellDTO.CellText> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO.TruncatingMode> nullableTruncatingModeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public CellDTO_CellTextJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "textColor", "typographyToken", "maxLines", "truncatingMode");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "textColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "maxLines");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<CommonAtomLabelDTO.TruncatingMode> f13 = moshi.f(CommonAtomLabelDTO.TruncatingMode.class, m11, "truncatingMode");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTruncatingModeAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CellDTO.CellText)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO.CellText fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                if (ozonSpannableString == null) {
                    throw c.q("text", "text", reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                num = this.nullableIntAdapter.fromJson(reader);
                i11 &= -17;
            } else if (v11 == 4) {
                truncatingMode = this.nullableTruncatingModeAdapter.fromJson(reader);
                i11 &= -33;
            }
        }
        reader.endObject();
        if (i11 == -55) {
            String str3 = str2;
            String str4 = str;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            if (ozonSpannableString2 == null) {
                throw c.j("text", "text", reader);
            }
            return new CellDTO.CellText(ozonSpannableString2, str4, str3, false, num, truncatingMode, 8, null);
        }
        String str5 = str2;
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = truncatingMode;
        String str6 = str;
        Integer num2 = num;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        Constructor<CellDTO.CellText> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CellDTO.CellText.class.getDeclaredConstructor(OzonSpannableString.class, String.class, String.class, Boolean.TYPE, Integer.class, CommonAtomLabelDTO.TruncatingMode.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CellDTO.CellText> constructor2 = constructor;
        if (ozonSpannableString3 == null) {
            throw c.j("text", "text", reader);
        }
        CellDTO.CellText newInstance = constructor2.newInstance(ozonSpannableString3, str6, str5, Boolean.FALSE, num2, truncatingMode2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO.CellText value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("typographyToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTypographyToken());
        writer.w("maxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMaxLines());
        writer.w("truncatingMode");
        this.nullableTruncatingModeAdapter.mo44toJson(writer, (x) value_.getTruncatingMode());
        writer.p();
    }
}
