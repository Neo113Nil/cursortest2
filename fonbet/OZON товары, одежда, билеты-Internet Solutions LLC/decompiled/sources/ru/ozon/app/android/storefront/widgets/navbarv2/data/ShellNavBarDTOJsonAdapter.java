package ru.ozon.app.android.storefront.widgets.navbarv2.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "nullableShowFullNavBarModeAdapter", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "nullableDynamicOnScrollColorsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarDTOJsonAdapter extends JsonAdapter<ShellNavBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<DynamicOnScrollColors> nullableDynamicOnScrollColorsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<ShellNavBarDTO.ShowFullNavBarMode> nullableShowFullNavBarModeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ShellNavBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "overlayColor", "forceWhiteStatusBar", "backgroundImage", "darkBackgroundImage", "isRounded", "disableRounding", "isStickyThirdLevel", "statusBarBottomSpacing", "level0BottomSpacing", "level1BottomSpacing", "level1LeftPaddingApps", "level1RightPaddingApps", "level2BottomSpacing", "level2LeftPaddingApps", "level2RightPaddingApps", "level3LeftPadding", "level3RightPadding", "showFullNavbarMode", "hasScrollLevel", "hasTeeth", "backButtonColor", "dynamicOnScrollColors", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "forceWhiteStatusBar");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "statusBarBottomSpacing");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "level1LeftPaddingApps");
        this.nullableShowFullNavBarModeAdapter = moshi.f(ShellNavBarDTO.ShowFullNavBarMode.class, m11, "showFullNavbarMode");
        this.nullableDynamicOnScrollColorsAdapter = moshi.f(DynamicOnScrollColors.class, m11, "dynamicOnScrollColors");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(ShellNavBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ShellNavBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Integer num4 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        Paddings paddings5 = null;
        Paddings paddings6 = null;
        ShellNavBarDTO.ShowFullNavBarMode showFullNavBarMode = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str5 = null;
        DynamicOnScrollColors dynamicOnScrollColors = null;
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
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 10:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 11:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 12:
                    paddings2 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 13:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 14:
                    paddings3 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 15:
                    paddings4 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 16:
                    paddings5 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 17:
                    paddings6 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 18:
                    showFullNavBarMode = this.nullableShowFullNavBarModeAdapter.fromJson(reader);
                    break;
                case 19:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 20:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 21:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 22:
                    dynamicOnScrollColors = this.nullableDynamicOnScrollColorsAdapter.fromJson(reader);
                    break;
                case 23:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new ShellNavBarDTO(str, str2, bool, str3, str4, bool2, bool3, bool4, num, num2, num3, paddings, paddings2, num4, paddings3, paddings4, paddings5, paddings6, showFullNavBarMode, bool5, bool6, str5, dynamicOnScrollColors, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ShellNavBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("overlayColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOverlayColor());
        writer.w("forceWhiteStatusBar");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getForceWhiteStatusBar());
        writer.w("backgroundImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundImage());
        writer.w("darkBackgroundImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDarkBackgroundImage());
        writer.w("isRounded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isRounded());
        writer.w("disableRounding");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDisableRounding());
        writer.w("isStickyThirdLevel");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isStickyThirdLevel());
        writer.w("statusBarBottomSpacing");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getStatusBarBottomSpacing());
        writer.w("level0BottomSpacing");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLevel0BottomSpacing());
        writer.w("level1BottomSpacing");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLevel1BottomSpacing());
        writer.w("level1LeftPaddingApps");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel1LeftPaddingApps());
        writer.w("level1RightPaddingApps");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel1RightPaddingApps());
        writer.w("level2BottomSpacing");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLevel2BottomSpacing());
        writer.w("level2LeftPaddingApps");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel2LeftPaddingApps());
        writer.w("level2RightPaddingApps");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel2RightPaddingApps());
        writer.w("level3LeftPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel3LeftPadding());
        writer.w("level3RightPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getLevel3RightPadding());
        writer.w("showFullNavbarMode");
        this.nullableShowFullNavBarModeAdapter.mo44toJson(writer, (x) value.getShowFullNavbarMode());
        writer.w("hasScrollLevel");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasScrollLevel());
        writer.w("hasTeeth");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasTeeth());
        writer.w("backButtonColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackButtonColor());
        writer.w("dynamicOnScrollColors");
        this.nullableDynamicOnScrollColorsAdapter.mo44toJson(writer, (x) value.getDynamicOnScrollColors());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
