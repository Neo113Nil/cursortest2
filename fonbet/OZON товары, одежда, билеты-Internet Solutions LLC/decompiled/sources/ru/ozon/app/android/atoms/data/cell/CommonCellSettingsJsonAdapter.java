package ru.ozon.app.android.atoms.data.cell;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/CommonCellSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonCellSettingsJsonAdapter extends JsonAdapter<CommonCellSettings> {
    public static final int $stable = 8;
    private volatile Constructor<CommonCellSettings> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public CommonCellSettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("layoutPaddingLeft", "layoutPaddingRight", "hasSeparator", "separatorColor", "action", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<CommonCellSettings.LayoutPadding> f7 = moshi.f(CommonCellSettings.LayoutPadding.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.cell.CommonCellSettingsJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "layoutPaddingLeft");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter = f7;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "hasSeparator");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "separatorColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<AtomActionDTO> f13 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f13;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f14 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f14;
        JsonAdapter<TestInfo> f15 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTestInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CommonCellSettings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonCellSettings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        Boolean bool = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    layoutPadding = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    layoutPadding2 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str2 = str;
            return new CommonCellSettings(layoutPadding, layoutPadding2, bool, str2, atomActionDTO2, map2, testInfo2);
        }
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        String str3 = str;
        Boolean bool2 = bool;
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding;
        Constructor<CommonCellSettings> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonCellSettings.class.getDeclaredConstructor(CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, Boolean.class, String.class, AtomActionDTO.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CommonCellSettings newInstance = constructor.newInstance(layoutPadding4, layoutPadding3, bool2, str3, atomActionDTO3, map3, testInfo3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonCellSettings value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("layoutPaddingLeft");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingLeft());
        writer.w("layoutPaddingRight");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLayoutPaddingRight());
        writer.w("hasSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasSeparator());
        writer.w("separatorColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSeparatorColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
