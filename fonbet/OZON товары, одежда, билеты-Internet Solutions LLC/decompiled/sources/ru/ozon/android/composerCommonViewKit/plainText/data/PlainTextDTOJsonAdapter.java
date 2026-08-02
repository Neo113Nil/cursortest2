package ru.ozon.android.composerCommonViewKit.plainText.data;

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
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlainTextDTOJsonAdapter extends JsonAdapter<PlainTextDTO> {
    public static final int $stable = 8;
    private volatile Constructor<PlainTextDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public PlainTextDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "backgroundColor", "topIslandCornerRadius", "bottomIslandCornerRadius", "leftMargin", "topMargin", "rightMargin", "bottomMargin");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, "textDTO");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<CornerRadius> f12 = moshi.f(CornerRadius.class, m11, "topIslandCornerRadius");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.cornerRadiusAdapter = f12;
        JsonAdapter<Paddings> f13 = moshi.f(Paddings.class, m11, "leftMargin");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.paddingsAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(PlainTextDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PlainTextDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        String str = null;
        CornerRadius cornerRadius = null;
        CornerRadius cornerRadius2 = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("textDTO", "text", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("topIslandCornerRadius", "topIslandCornerRadius", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    cornerRadius2 = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius2 == null) {
                        throw c.q("bottomIslandCornerRadius", "bottomIslandCornerRadius", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    paddings = this.paddingsAdapter.fromJson(reader);
                    if (paddings == null) {
                        throw c.q("leftMargin", "leftMargin", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    paddings2 = this.paddingsAdapter.fromJson(reader);
                    if (paddings2 == null) {
                        throw c.q("topMargin", "topMargin", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    paddings3 = this.paddingsAdapter.fromJson(reader);
                    if (paddings3 == null) {
                        throw c.q("rightMargin", "rightMargin", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    paddings4 = this.paddingsAdapter.fromJson(reader);
                    if (paddings4 == null) {
                        throw c.q("bottomMargin", "bottomMargin", reader);
                    }
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 != -253) {
            String str2 = str;
            TextDTO textDTO2 = textDTO;
            Constructor<PlainTextDTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = PlainTextDTO.class.getDeclaredConstructor(TextDTO.class, String.class, CornerRadius.class, CornerRadius.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor<PlainTextDTO> constructor2 = constructor;
            if (textDTO2 == null) {
                throw c.j("textDTO", "text", reader);
            }
            PlainTextDTO newInstance = constructor2.newInstance(textDTO2, str2, cornerRadius, cornerRadius2, paddings, paddings2, paddings3, paddings4, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        String str3 = str;
        TextDTO textDTO3 = textDTO;
        if (textDTO3 == null) {
            throw c.j("textDTO", "text", reader);
        }
        Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
        Intrinsics.g(cornerRadius2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
        Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Paddings paddings5 = paddings4;
        Paddings paddings6 = paddings3;
        Paddings paddings7 = paddings2;
        return new PlainTextDTO(textDTO3, str3, cornerRadius, cornerRadius2, paddings, paddings7, paddings6, paddings5);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PlainTextDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTextDTO());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("topIslandCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value_.getTopIslandCornerRadius());
        writer.w("bottomIslandCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value_.getBottomIslandCornerRadius());
        writer.w("leftMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getLeftMargin());
        writer.w("topMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getTopMargin());
        writer.w("rightMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getRightMargin());
        writer.w("bottomMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getBottomMargin());
        writer.p();
    }
}
