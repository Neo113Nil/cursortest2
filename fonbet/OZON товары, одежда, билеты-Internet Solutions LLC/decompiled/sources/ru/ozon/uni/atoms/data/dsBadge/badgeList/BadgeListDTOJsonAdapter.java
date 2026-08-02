package ru.ozon.uni.atoms.data.dsBadge.badgeList;

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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "nullableBadgeSizeAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "nullableStyleAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAtEnumNullFallbackAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeListDTOJsonAdapter extends JsonAdapter<BadgeListDTO> {
    public static final int $stable = 8;
    private volatile Constructor<BadgeListDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.BadgeSize> nullableBadgeSizeAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO.Style> nullableStyleAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public BadgeListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("badges", "badgesSize", "badgesStyle", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "gap", "context", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, BadgeDTO.class);
        M m11 = M.f71699a;
        JsonAdapter<List<BadgeDTO>> f7 = moshi.f(e11, m11, "badges");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfBadgeDTOAdapter = f7;
        JsonAdapter<BadgeDTO.BadgeSize> f11 = moshi.f(BadgeDTO.BadgeSize.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "badgesSize");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBadgeSizeAtEnumNullFallbackAdapter = f11;
        JsonAdapter<BadgeDTO.Style> f12 = moshi.f(BadgeDTO.Style.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "badgesStyle");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStyleAtEnumNullFallbackAdapter = f12;
        JsonAdapter<CommonCellSettings.LayoutPadding> f13 = moshi.f(CommonCellSettings.LayoutPadding.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "leftPadding");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(BadgeListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BadgeListDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        List<BadgeDTO> list = null;
        BadgeDTO.BadgeSize badgeSize = null;
        BadgeDTO.Style style = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        CommonCellSettings.LayoutPadding layoutPadding5 = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfBadgeDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("badges", "badges", reader);
                    }
                    break;
                case 1:
                    badgeSize = this.nullableBadgeSizeAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -3;
                    break;
                case 2:
                    style = this.nullableStyleAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -5;
                    break;
                case 3:
                    layoutPadding = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    layoutPadding2 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    layoutPadding3 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    layoutPadding4 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    layoutPadding5 = this.nullableLayoutPaddingAtEnumNullFallbackAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -2047) {
            String str2 = str;
            CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding5;
            CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding4;
            CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding3;
            CommonCellSettings.LayoutPadding layoutPadding9 = layoutPadding2;
            CommonCellSettings.LayoutPadding layoutPadding10 = layoutPadding;
            BadgeDTO.Style style2 = style;
            BadgeDTO.BadgeSize badgeSize2 = badgeSize;
            List<BadgeDTO> list2 = list;
            if (list2 != null) {
                return new BadgeListDTO(list2, badgeSize2, style2, layoutPadding10, layoutPadding9, layoutPadding8, layoutPadding7, layoutPadding6, str2, map, testInfo);
            }
            throw c.j("badges", "badges", reader);
        }
        String str3 = str;
        CommonCellSettings.LayoutPadding layoutPadding11 = layoutPadding5;
        CommonCellSettings.LayoutPadding layoutPadding12 = layoutPadding4;
        CommonCellSettings.LayoutPadding layoutPadding13 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding14 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding15 = layoutPadding;
        BadgeDTO.Style style3 = style;
        BadgeDTO.BadgeSize badgeSize3 = badgeSize;
        List<BadgeDTO> list3 = list;
        Constructor<BadgeListDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = BadgeListDTO.class.getDeclaredConstructor(List.class, BadgeDTO.BadgeSize.class, BadgeDTO.Style.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, String.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<BadgeListDTO> constructor2 = constructor;
        if (list3 == null) {
            throw c.j("badges", "badges", reader);
        }
        BadgeListDTO newInstance = constructor2.newInstance(list3, badgeSize3, style3, layoutPadding15, layoutPadding14, layoutPadding13, layoutPadding12, layoutPadding11, str3, map, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BadgeListDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value_.getBadges());
        writer.w("badgesSize");
        this.nullableBadgeSizeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBadgesSize());
        writer.w("badgesStyle");
        this.nullableStyleAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBadgesStyle());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("topPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("bottomPadding");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.w("gap");
        this.nullableLayoutPaddingAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getGap());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
