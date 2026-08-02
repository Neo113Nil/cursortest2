package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data;

import Y9.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "listOfWidgetButtonsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsOrientation;", "buttonsOrientationAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$ButtonsSize;", "nullableButtonsSizeAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$AlignType;", "alignTypeAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$Paddings;", "nullablePaddingsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonStackDTOJsonAdapter extends JsonAdapter<ButtonStackDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.AlignType> alignTypeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.ButtonsOrientation> buttonsOrientationAdapter;
    private volatile Constructor<ButtonStackDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<ButtonStackDTO.WidgetButtons>> listOfWidgetButtonsAdapter;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.ButtonsSize> nullableButtonsSizeAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ButtonStackDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("buttons", "isSticky", "orientation", "buttonsSize", "backgroundColor", "backgroundRadius", "align", "paddings", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, ButtonStackDTO.WidgetButtons.class);
        M m11 = M.f71699a;
        JsonAdapter<List<ButtonStackDTO.WidgetButtons>> f7 = moshi.f(e11, m11, "buttons");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfWidgetButtonsAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.TYPE, m11, "isSticky");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.booleanAdapter = f11;
        JsonAdapter<ButtonStackDTO.ButtonsOrientation> f12 = moshi.f(ButtonStackDTO.ButtonsOrientation.class, m11, "orientation");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.buttonsOrientationAdapter = f12;
        JsonAdapter<ButtonStackDTO.ButtonsSize> f13 = moshi.f(ButtonStackDTO.ButtonsSize.class, m11, "buttonsSize");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableButtonsSizeAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<CornerRadius> f15 = moshi.f(CornerRadius.class, m11, "backgroundRadius");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCornerRadiusAdapter = f15;
        JsonAdapter<ButtonStackDTO.AlignType> f16 = moshi.f(ButtonStackDTO.AlignType.class, m11, "align");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.alignTypeAdapter = f16;
        JsonAdapter<ButtonStackDTO.Paddings> f17 = moshi.f(ButtonStackDTO.Paddings.class, m11, "paddings");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullablePaddingsAdapter = f17;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f18 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f18;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(ButtonStackDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonStackDTO fromJson(@NotNull n reader) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<ButtonStackDTO.WidgetButtons> list = null;
        Boolean bool2 = null;
        ButtonStackDTO.ButtonsOrientation buttonsOrientation = null;
        ButtonStackDTO.ButtonsSize buttonsSize = null;
        String str = null;
        CornerRadius cornerRadius = null;
        ButtonStackDTO.AlignType alignType = null;
        ButtonStackDTO.Paddings paddings = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfWidgetButtonsAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("buttons", "buttons", reader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    break;
                case 2:
                    buttonsOrientation = this.buttonsOrientationAdapter.fromJson(reader);
                    if (buttonsOrientation == null) {
                        throw c.q("orientation", "orientation", reader);
                    }
                    break;
                case 3:
                    buttonsSize = this.nullableButtonsSizeAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 6:
                    alignType = this.alignTypeAdapter.fromJson(reader);
                    if (alignType == null) {
                        throw c.q("align", "align", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -201) {
            Boolean bool3 = bool2;
            List<ButtonStackDTO.WidgetButtons> list2 = list;
            if (list2 == null) {
                throw c.j("buttons", "buttons", reader);
            }
            if (bool3 == null) {
                throw c.j("isSticky", "isSticky", reader);
            }
            CornerRadius cornerRadius2 = cornerRadius;
            String str2 = str;
            ButtonStackDTO.ButtonsSize buttonsSize2 = buttonsSize;
            ButtonStackDTO.ButtonsOrientation buttonsOrientation2 = buttonsOrientation;
            boolean booleanValue = bool3.booleanValue();
            if (buttonsOrientation2 == null) {
                throw c.j("orientation", "orientation", reader);
            }
            Intrinsics.g(alignType, "null cannot be cast to non-null type ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO.AlignType");
            return new ButtonStackDTO(list2, booleanValue, buttonsOrientation2, buttonsSize2, str2, cornerRadius2, alignType, paddings, map);
        }
        Boolean bool4 = bool2;
        List<ButtonStackDTO.WidgetButtons> list3 = list;
        Map<String, TokenizedTrackingInfo> map2 = map;
        ButtonStackDTO.Paddings paddings2 = paddings;
        ButtonStackDTO.AlignType alignType2 = alignType;
        CornerRadius cornerRadius3 = cornerRadius;
        String str3 = str;
        ButtonStackDTO.ButtonsSize buttonsSize3 = buttonsSize;
        ButtonStackDTO.ButtonsOrientation buttonsOrientation3 = buttonsOrientation;
        Constructor<ButtonStackDTO> constructor = this.constructorRef;
        if (constructor == null) {
            bool = bool4;
            constructor = ButtonStackDTO.class.getDeclaredConstructor(List.class, Boolean.TYPE, ButtonStackDTO.ButtonsOrientation.class, ButtonStackDTO.ButtonsSize.class, String.class, CornerRadius.class, ButtonStackDTO.AlignType.class, ButtonStackDTO.Paddings.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            bool = bool4;
        }
        Constructor<ButtonStackDTO> constructor2 = constructor;
        if (list3 == null) {
            throw c.j("buttons", "buttons", reader);
        }
        if (bool == null) {
            throw c.j("isSticky", "isSticky", reader);
        }
        if (buttonsOrientation3 == null) {
            throw c.j("orientation", "orientation", reader);
        }
        ButtonStackDTO newInstance = constructor2.newInstance(list3, bool, buttonsOrientation3, buttonsSize3, str3, cornerRadius3, alignType2, paddings2, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonStackDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("buttons");
        this.listOfWidgetButtonsAdapter.mo44toJson(writer, (x) value_.getButtons());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isSticky()));
        writer.w("orientation");
        this.buttonsOrientationAdapter.mo44toJson(writer, (x) value_.getOrientation());
        writer.w("buttonsSize");
        this.nullableButtonsSizeAdapter.mo44toJson(writer, (x) value_.getButtonsSize());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("backgroundRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value_.getBackgroundRadius());
        writer.w("align");
        this.alignTypeAdapter.mo44toJson(writer, (x) value_.getAlign());
        writer.w("paddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddings());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
