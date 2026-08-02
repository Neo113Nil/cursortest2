package ru.ozon.app.android.atoms.data.tabs;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.common.Rounds;
import ru.ozon.app.android.atoms.data.tabs.TabsDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/data/tabs/TabsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/tabs/TabsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/tabs/TabsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/tabs/TabsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/atoms/data/tabs/TabsDTO$TabDTO;", "listOfTabDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/atoms/data/tabs/TabsDTO$Style;", "nullableStyleAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "nullableStyleAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/common/Rounds;", "nullableRoundsAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsDTOJsonAdapter extends JsonAdapter<TabsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TabsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TabsDTO.TabDTO>> listOfTabDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Rounds> nullableRoundsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TabsDTO.Style> nullableStyleAdapter;

    @NotNull
    private final JsonAdapter<TabsDTO.Style> nullableStyleAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public TabsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(DynamicElementDTO.TABS, "selectedTabIndex", "hideSubtitle", "style", "trackingInfo", "testInfo", "styleType", "round", "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, TabsDTO.TabDTO.class);
        M m11 = M.f71699a;
        JsonAdapter<List<TabsDTO.TabDTO>> f7 = moshi.f(e11, m11, DynamicElementDTO.TABS);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfTabDTOAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.TYPE, m11, "selectedTabIndex");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.intAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "hideSubtitle");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
        JsonAdapter<TabsDTO.Style> f13 = moshi.f(TabsDTO.Style.class, m11, "style");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStyleAdapter = f13;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f14 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f14;
        JsonAdapter<TestInfo> f15 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableTestInfoAdapter = f15;
        JsonAdapter<TabsDTO.Style> f16 = moshi.f(TabsDTO.Style.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.tabs.TabsDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "styleType");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableStyleAtEnumNullFallbackAdapter = f16;
        JsonAdapter<Rounds> f17 = moshi.f(Rounds.class, m11, "round");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableRoundsAdapter = f17;
        JsonAdapter<String> f18 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableStringAdapter = f18;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(29, "GeneratedJsonAdapter(TabsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TabsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<TabsDTO.TabDTO> list = null;
        Integer num = null;
        Boolean bool = null;
        TabsDTO.Style style = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        TabsDTO.Style style2 = null;
        Rounds rounds = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfTabDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("selectedTabIndex", "selectedTabIndex", reader);
                    }
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    style = this.nullableStyleAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    style2 = this.nullableStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    rounds = this.nullableRoundsAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -509) {
            Integer num2 = num;
            List<TabsDTO.TabDTO> list2 = list;
            if (list2 == null) {
                throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
            }
            if (num2 == null) {
                throw c.j("selectedTabIndex", "selectedTabIndex", reader);
            }
            String str2 = str;
            Rounds rounds2 = rounds;
            TabsDTO.Style style3 = style2;
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            return new TabsDTO(list2, num2.intValue(), bool, style, map2, testInfo2, style3, rounds2, str2);
        }
        Integer num3 = num;
        List<TabsDTO.TabDTO> list3 = list;
        String str3 = str;
        Rounds rounds3 = rounds;
        TabsDTO.Style style4 = style2;
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        TabsDTO.Style style5 = style;
        Boolean bool2 = bool;
        Constructor<TabsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TabsDTO.class.getDeclaredConstructor(List.class, cls2, Boolean.class, TabsDTO.Style.class, Map.class, TestInfo.class, TabsDTO.Style.class, Rounds.class, String.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TabsDTO> constructor2 = constructor;
        if (list3 == null) {
            throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
        }
        if (num3 == null) {
            throw c.j("selectedTabIndex", "selectedTabIndex", reader);
        }
        TabsDTO newInstance = constructor2.newInstance(list3, num3, bool2, style5, map3, testInfo3, style4, rounds3, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TabsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TABS);
        this.listOfTabDTOAdapter.mo44toJson(writer, (x) value_.getTabs());
        writer.w("selectedTabIndex");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getSelectedTabIndex()));
        writer.w("hideSubtitle");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHideSubtitle());
        writer.w("style");
        this.nullableStyleAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("styleType");
        this.nullableStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getStyleType());
        writer.w("round");
        this.nullableRoundsAdapter.mo44toJson(writer, (x) value_.getRound());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.p();
    }
}
