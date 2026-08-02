package ru.ozon.uni.atoms.data.dsCell;

import Ak.b;
import Y9.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO_SettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsCell/CellDTO$Settings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellDTO_SettingsJsonAdapter extends JsonAdapter<CellDTO.Settings> {
    public static final int $stable = 8;
    private volatile Constructor<CellDTO.Settings> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CellDTO_SettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("topPadding", "bottomPadding", "leftPadding", "rightPadding", "disableSeparator", "isDisabled", "backgroundColor", "cornerRadius", "backgroundHoverColor", "separatorColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonCellSettings.LayoutPadding> f7 = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "topPadding");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableLayoutPaddingAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "disableSeparator");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<CornerRadius> f13 = moshi.f(CornerRadius.class, m11, "cornerRadius");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCornerRadiusAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CellDTO.Settings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO.Settings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        CornerRadius cornerRadius = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    layoutPadding2 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    layoutPadding3 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    layoutPadding4 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1536) {
            String str4 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            String str5 = str;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding4;
            return new CellDTO.Settings(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding5, bool4, bool3, str5, cornerRadius2, str4, null, str3, UserVerificationMethods.USER_VERIFY_NONE, null);
        }
        String str6 = str2;
        String str7 = str3;
        CornerRadius cornerRadius3 = cornerRadius;
        String str8 = str;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding4;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding9 = layoutPadding;
        Constructor<CellDTO.Settings> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CellDTO.Settings.class.getDeclaredConstructor(CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, Boolean.class, Boolean.class, String.class, CornerRadius.class, String.class, Boolean.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CellDTO.Settings newInstance = constructor.newInstance(layoutPadding9, layoutPadding8, layoutPadding7, layoutPadding6, bool6, bool5, str8, cornerRadius3, str6, null, str7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO.Settings value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("bottomPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("disableSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getDisableSeparator());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value_.getCornerRadius());
        writer.w("backgroundHoverColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundHoverColor());
        writer.w("separatorColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSeparatorColor());
        writer.p();
    }
}
