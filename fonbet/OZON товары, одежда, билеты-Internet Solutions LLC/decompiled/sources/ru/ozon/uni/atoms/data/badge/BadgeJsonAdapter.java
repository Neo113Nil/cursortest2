package ru.ozon.uni.atoms.data.badge;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/badge/BadgeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/badge/Badge;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/badge/Badge;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;", "nullableGradientColorAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$StyleType;", "nullableStyleTypeAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$Accessory;", "nullableAccessoryAdapter", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "nullableIconPositionAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeJsonAdapter extends JsonAdapter<Badge> {
    public static final int $stable = 8;
    private volatile Constructor<Badge> constructorRef;

    @NotNull
    private final JsonAdapter<Badge.Accessory> nullableAccessoryAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Badge.GradientColor> nullableGradientColorAdapter;

    @NotNull
    private final JsonAdapter<Badge.IconPosition> nullableIconPositionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<Badge.StyleType> nullableStyleTypeAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public BadgeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "image", "tintColor", "iconTintColor", "backgroundColor", "action", "gradientBackgroundColor", "theme", "accessory", "iconPosition", "context", "testInfo", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<AtomActionDTO> f11 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f11;
        JsonAdapter<Badge.GradientColor> f12 = moshi.f(Badge.GradientColor.class, m11, "gradientBackgroundColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableGradientColorAdapter = f12;
        JsonAdapter<Badge.StyleType> f13 = moshi.f(Badge.StyleType.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStyleTypeAdapter = f13;
        JsonAdapter<Badge.Accessory> f14 = moshi.f(Badge.Accessory.class, m11, "accessory");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAccessoryAdapter = f14;
        JsonAdapter<Badge.IconPosition> f15 = moshi.f(Badge.IconPosition.class, m11, "_iconPosition");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIconPositionAdapter = f15;
        JsonAdapter<TestInfo> f16 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTestInfoAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(27, "GeneratedJsonAdapter(Badge)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Badge fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AtomActionDTO atomActionDTO = null;
        Badge.GradientColor gradientColor = null;
        Badge.StyleType styleType = null;
        Badge.Accessory accessory = null;
        Badge.IconPosition iconPosition = null;
        String str6 = null;
        TestInfo testInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    gradientColor = this.nullableGradientColorAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    styleType = this.nullableStyleTypeAdapter.fromJson(reader);
                    break;
                case 8:
                    accessory = this.nullableAccessoryAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    iconPosition = this.nullableIconPositionAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -8001) {
            Badge.Accessory accessory2 = accessory;
            Badge.StyleType styleType2 = styleType;
            Badge.GradientColor gradientColor2 = gradientColor;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str7 = str5;
            String str8 = str4;
            return new Badge(str, str2, str3, str8, str7, atomActionDTO2, gradientColor2, styleType2, accessory2, iconPosition, str6, testInfo, map);
        }
        Badge.Accessory accessory3 = accessory;
        Badge.StyleType styleType3 = styleType;
        Badge.GradientColor gradientColor3 = gradientColor;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        String str9 = str5;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        Constructor<Badge> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Badge.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, AtomActionDTO.class, Badge.GradientColor.class, Badge.StyleType.class, Badge.Accessory.class, Badge.IconPosition.class, String.class, TestInfo.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Badge newInstance = constructor.newInstance(str13, str12, str11, str10, str9, atomActionDTO3, gradientColor3, styleType3, accessory3, iconPosition, str6, testInfo, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Badge value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("tintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTintColor());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconTintColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("gradientBackgroundColor");
        this.nullableGradientColorAdapter.mo44toJson(writer, (x) value_.getGradientBackgroundColor());
        writer.w("theme");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("accessory");
        this.nullableAccessoryAdapter.mo44toJson(writer, (x) value_.getAccessory());
        writer.w("iconPosition");
        this.nullableIconPositionAdapter.mo44toJson(writer, (x) value_.get_iconPosition());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
