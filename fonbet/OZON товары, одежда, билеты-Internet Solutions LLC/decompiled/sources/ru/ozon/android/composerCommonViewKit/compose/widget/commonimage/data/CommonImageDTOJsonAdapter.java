package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.data;

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
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/core/models/UniPaddingToken;", "nullableUniPaddingTokenAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonImageDTOJsonAdapter extends JsonAdapter<CommonImageDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CommonImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<UniPaddingToken> nullableUniPaddingTokenAdapter;

    @NotNull
    private final n.a options;

    public CommonImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("image", "leftMargin", "topMargin", "rightMargin", "bottomMargin");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ImageDTO> f7 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableImageDTOAdapter = f7;
        JsonAdapter<UniPaddingToken> f11 = moshi.f(UniPaddingToken.class, m11, "leftMargin");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableUniPaddingTokenAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CommonImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ImageDTO imageDTO = null;
        UniPaddingToken uniPaddingToken = null;
        UniPaddingToken uniPaddingToken2 = null;
        UniPaddingToken uniPaddingToken3 = null;
        UniPaddingToken uniPaddingToken4 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                uniPaddingToken = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                uniPaddingToken2 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                uniPaddingToken3 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                uniPaddingToken4 = this.nullableUniPaddingTokenAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            UniPaddingToken uniPaddingToken5 = uniPaddingToken4;
            UniPaddingToken uniPaddingToken6 = uniPaddingToken3;
            return new CommonImageDTO(imageDTO, uniPaddingToken, uniPaddingToken2, uniPaddingToken6, uniPaddingToken5);
        }
        UniPaddingToken uniPaddingToken7 = uniPaddingToken4;
        UniPaddingToken uniPaddingToken8 = uniPaddingToken3;
        UniPaddingToken uniPaddingToken9 = uniPaddingToken2;
        UniPaddingToken uniPaddingToken10 = uniPaddingToken;
        ImageDTO imageDTO2 = imageDTO;
        Constructor<CommonImageDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonImageDTO.class.getDeclaredConstructor(ImageDTO.class, UniPaddingToken.class, UniPaddingToken.class, UniPaddingToken.class, UniPaddingToken.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CommonImageDTO newInstance = constructor.newInstance(imageDTO2, uniPaddingToken10, uniPaddingToken9, uniPaddingToken8, uniPaddingToken7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonImageDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("leftMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getLeftMargin());
        writer.w("topMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getTopMargin());
        writer.w("rightMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getRightMargin());
        writer.w("bottomMargin");
        this.nullableUniPaddingTokenAdapter.mo44toJson(writer, (x) value_.getBottomMargin());
        writer.p();
    }
}
