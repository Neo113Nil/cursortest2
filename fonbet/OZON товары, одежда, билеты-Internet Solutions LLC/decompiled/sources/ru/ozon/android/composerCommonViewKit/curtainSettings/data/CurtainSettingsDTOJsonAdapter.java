package ru.ozon.android.composerCommonViewKit.curtainSettings.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.curtainSettings.data.CurtainSettingsDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/android/composerCommonViewKit/curtainSettings/data/CurtainSettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/curtainSettings/data/CurtainSettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/curtainSettings/data/CurtainSettingsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/curtainSettings/data/CurtainSettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/android/composerCommonViewKit/curtainSettings/data/CurtainSettingsDTO$HeightMode;", "heightModeAdapter", "booleanAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurtainSettingsDTOJsonAdapter extends JsonAdapter<CurtainSettingsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CurtainSettingsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CurtainSettingsDTO.HeightMode> heightModeAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CurtainSettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("showCloseButton", "scrollableContent", "containerBackgroundColor", "allowResizeByGesture", "hideToungle", "minHeight", "heightMode", "disableCloseByGestures", "onCloseAction", "trackingInfo", "closeButtonBgColor", "closeButtonIconColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.class, m11, "showCloseButton");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableBooleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "containerBackgroundColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "minHeight");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<CurtainSettingsDTO.HeightMode> f13 = moshi.f(CurtainSettingsDTO.HeightMode.class, m11, "heightMode");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.heightModeAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "disableCloseByGestures");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
        JsonAdapter<AtomActionDTO> f15 = moshi.f(AtomActionDTO.class, m11, "onCloseAction");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CurtainSettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CurtainSettingsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        CurtainSettingsDTO.HeightMode heightMode = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Integer num = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    heightMode = this.heightModeAdapter.fromJson(reader);
                    if (heightMode == null) {
                        throw c.q("heightMode", "heightMode", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("disableCloseByGestures", "disableCloseByGestures", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            Intrinsics.g(heightMode, "null cannot be cast to non-null type ru.ozon.android.composerCommonViewKit.curtainSettings.data.CurtainSettingsDTO.HeightMode");
            return new CurtainSettingsDTO(bool3, bool4, str, bool5, bool6, num, heightMode, bool2.booleanValue(), atomActionDTO, map, str2, str3);
        }
        CurtainSettingsDTO.HeightMode heightMode2 = heightMode;
        Constructor<CurtainSettingsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CurtainSettingsDTO.class.getDeclaredConstructor(Boolean.class, Boolean.class, String.class, Boolean.class, Boolean.class, Integer.class, CurtainSettingsDTO.HeightMode.class, Boolean.TYPE, AtomActionDTO.class, Map.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CurtainSettingsDTO newInstance = constructor.newInstance(bool3, bool4, str, bool5, bool6, num, heightMode2, bool2, atomActionDTO, map, str2, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CurtainSettingsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("showCloseButton");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getShowCloseButton());
        writer.w("scrollableContent");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getScrollableContent());
        writer.w("containerBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContainerBackgroundColor());
        writer.w("allowResizeByGesture");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getAllowResizeByGesture());
        writer.w("hideToungle");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHideToungle());
        writer.w("minHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMinHeight());
        writer.w("heightMode");
        this.heightModeAdapter.mo44toJson(writer, (x) value_.getHeightMode());
        writer.w("disableCloseByGestures");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getDisableCloseByGestures()));
        writer.w("onCloseAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getOnCloseAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("closeButtonBgColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCloseButtonBgColor());
        writer.w("closeButtonIconColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCloseButtonIconColor());
        writer.p();
    }
}
