package ru.ozon.app.android.atoms.data.price;

import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Tz.C4055a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import bh.C5663a;
import bh.C5664b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.common.Paddings;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0005TUVWXB³\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cB«\u0001\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001dB\u009f\u0001\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001eJµ\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u00107J©\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0007¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\bH\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u001aHÆ\u0003JÀ\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001¢\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020\bJ\u0013\u0010J\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\bHÖ\u0001J\t\u0010N\u001a\u00020\u0006HÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00105¨\u0006Y"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "price", "", "Lru/ozon/app/android/atoms/data/price/PriceDTO$Component;", "discount", "", "backgroundCapacity", "", "priceStyle", "Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;", "preset", "Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;", "paddingLeft", "Lru/ozon/app/android/atoms/data/common/Paddings;", "paddingRight", "paddingTop", "paddingBottom", "context", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "discountColor", "isStrikethroughLineHidden", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;Z)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)V", "getPrice", "()Ljava/util/List;", "getDiscount", "()Ljava/lang/String;", "getBackgroundCapacity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriceStyle", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;", "getPreset", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;", "getPaddingLeft", "()Lru/ozon/app/android/atoms/data/common/Paddings;", "getPaddingRight", "getPaddingTop", "getPaddingBottom", "getContext", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getDiscountColor", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/price/PriceDTO;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/price/PriceDTO;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Lru/ozon/app/android/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;Z)Lru/ozon/app/android/atoms/data/price/PriceDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Component", "PriceStyle", "Gradient", "Preset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PriceDTO extends AtomDTO {

    @Deprecated
    @NotNull
    public static final String FLAG = "_flag_";

    @Deprecated
    @NotNull
    public static final String MULTICOLOR = "_multicolor_";
    private final Integer backgroundCapacity;
    private final String context;
    private final String discount;
    private final String discountColor;
    private final boolean isStrikethroughLineHidden;

    @EnumNullFallback
    private final Paddings paddingBottom;

    @EnumNullFallback
    private final Paddings paddingLeft;

    @EnumNullFallback
    private final Paddings paddingRight;

    @EnumNullFallback
    private final Paddings paddingTop;

    @NotNull
    private final Preset preset;

    @NotNull
    private final List<Component> price;

    @NotNull
    private final PriceStyle priceStyle;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PriceDTO> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Companion;", "", "<init>", "()V", "MULTICOLOR", "", "FLAG", "isMulticolor", "", "(Ljava/lang/String;)Z", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isMulticolor(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return h.t(str, "_multicolor_", false) || h.t(str, "_flag_", false);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nJ,\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Component;", "Landroid/os/Parcelable;", "icon", "", "text", "textStyle", "Lru/ozon/app/android/atoms/data/price/PriceDTO$Component$TextStyle;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/price/PriceDTO$Component$TextStyle;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/price/PriceDTO$Component$TextStyle;)V", "getIcon", "()Ljava/lang/String;", "getText", "getTextStyle", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$Component$TextStyle;", "getColor", "isIconMulticolor", "", "isIconMulticolor$design_system_release", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "copy", "component1", "component2", "component3", "component4", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TextStyle", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Component implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Component> CREATOR = new Creator();
        private final String color;
        private final String icon;
        private final Boolean isIconMulticolor;
        private final String text;

        @EnumNullFallback
        private final TextStyle textStyle;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Component> {
            @Override // android.os.Parcelable.Creator
            public final Component createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Component(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TextStyle.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Component[] newArray(int i11) {
                return new Component[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Component$TextStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PREFIX", "PRICE", "PPU", "CAPTION", "ORIGINAL_PRICE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class TextStyle {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TextStyle[] $VALUES;
            public static final TextStyle PREFIX = new TextStyle("PREFIX", 0);
            public static final TextStyle PRICE = new TextStyle("PRICE", 1);
            public static final TextStyle PPU = new TextStyle("PPU", 2);
            public static final TextStyle CAPTION = new TextStyle("CAPTION", 3);
            public static final TextStyle ORIGINAL_PRICE = new TextStyle("ORIGINAL_PRICE", 4);

            private static final /* synthetic */ TextStyle[] $values() {
                return new TextStyle[]{PREFIX, PRICE, PPU, CAPTION, ORIGINAL_PRICE};
            }

            static {
                TextStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private TextStyle(String str, int i11) {
            }

            @NotNull
            public static a<TextStyle> getEntries() {
                return $ENTRIES;
            }

            public static TextStyle valueOf(String str) {
                return (TextStyle) Enum.valueOf(TextStyle.class, str);
            }

            public static TextStyle[] values() {
                return (TextStyle[]) $VALUES.clone();
            }
        }

        public Component() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Component copy$default(Component component, String str, String str2, TextStyle textStyle, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = component.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = component.text;
            }
            if ((i11 & 4) != 0) {
                textStyle = component.textStyle;
            }
            if ((i11 & 8) != 0) {
                str3 = component.color;
            }
            return component.copy(str, str2, textStyle, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Component copy(String icon, String text, TextStyle textStyle, String color) {
            return new Component(icon, text, textStyle, color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Component)) {
                return false;
            }
            Component component = (Component) other;
            return Intrinsics.d(this.icon, component.icon) && Intrinsics.d(this.text, component.text) && this.textStyle == component.textStyle && Intrinsics.d(this.color, component.color);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextStyle textStyle = this.textStyle;
            int hashCode3 = (hashCode2 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
            String str3 = this.color;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* renamed from: isIconMulticolor$design_system_release, reason: from getter */
        public final Boolean getIsIconMulticolor() {
            return this.isIconMulticolor;
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.text;
            TextStyle textStyle = this.textStyle;
            String str3 = this.color;
            StringBuilder d11 = C3660k.d("Component(icon=", str, ", text=", str2, ", textStyle=");
            d11.append(textStyle);
            d11.append(", color=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon);
            dest.writeString(this.text);
            TextStyle textStyle = this.textStyle;
            if (textStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(textStyle.name());
            }
            dest.writeString(this.color);
        }

        public Component(String str, String str2, TextStyle textStyle, String str3) {
            this.icon = str;
            this.text = str2;
            this.textStyle = textStyle;
            this.color = str3;
            this.isIconMulticolor = str != null ? Boolean.valueOf(PriceDTO.Companion.isMulticolor(str)) : null;
        }

        public static /* synthetic */ Component copy$default(Component component, String str, String str2, TextStyle textStyle, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = component.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = component.text;
            }
            if ((i11 & 4) != 0) {
                textStyle = component.textStyle;
            }
            return component.copy(str, str2, textStyle);
        }

        @InterfaceC3999a
        public final /* synthetic */ Component copy(String icon, String text, TextStyle textStyle) {
            return copy(icon, text, textStyle, this.color);
        }

        public /* synthetic */ Component(String str, String str2, TextStyle textStyle, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : textStyle, (i11 & 8) != 0 ? null : str3);
        }

        public /* synthetic */ Component(String str, String str2, TextStyle textStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : textStyle);
        }

        public Component(String str, String str2, TextStyle textStyle) {
            this(str, str2, textStyle, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceDTO> {
        @Override // android.os.Parcelable.Creator
        public final PriceDTO createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            int readInt = parcel2.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11 = Ak.b.b(Component.CREATOR, parcel2, arrayList, i11, 1)) {
            }
            String readString = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            PriceStyle createFromParcel = PriceStyle.CREATOR.createFromParcel(parcel2);
            Preset valueOf2 = Preset.valueOf(parcel2.readString());
            Paddings valueOf3 = parcel2.readInt() == 0 ? null : Paddings.valueOf(parcel2.readString());
            Paddings valueOf4 = parcel2.readInt() == 0 ? null : Paddings.valueOf(parcel2.readString());
            Paddings valueOf5 = parcel2.readInt() == 0 ? null : Paddings.valueOf(parcel2.readString());
            Paddings valueOf6 = parcel2.readInt() == 0 ? null : Paddings.valueOf(parcel2.readString());
            String readString2 = parcel2.readString();
            TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                int readInt2 = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(PriceDTO.class, parcel2, linkedHashMap, parcel2.readString(), i12, 1);
                    parcel2 = parcel;
                    readInt2 = readInt2;
                }
            }
            return new PriceDTO(arrayList, readString, valueOf, createFromParcel, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, readString2, createFromParcel2, linkedHashMap, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDTO[] newArray(int i11) {
            return new PriceDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Preset;", "", "Lbh/b;", "settings", "<init>", "(Ljava/lang/String;ILbh/b;)V", "Lbh/b;", "getSettings", "()Lbh/b;", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_800", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_200 = new Preset("SIZE_200", 0, C5663a.a());
        public static final Preset SIZE_300 = new Preset("SIZE_300", 1, C5663a.b());
        public static final Preset SIZE_400 = new Preset("SIZE_400", 2, C5663a.c());
        public static final Preset SIZE_500 = new Preset("SIZE_500", 3, C5663a.d());
        public static final Preset SIZE_600 = new Preset("SIZE_600", 4, C5663a.e());
        public static final Preset SIZE_800 = new Preset("SIZE_800", 5, C5663a.f());

        @NotNull
        private final C5664b settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600, SIZE_800};
        }

        static {
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, C5664b c5664b) {
            this.settings = c5664b;
        }

        @NotNull
        public static a<Preset> getEntries() {
            return $ENTRIES;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) $VALUES.clone();
        }

        @NotNull
        public final C5664b getSettings() {
            return this.settings;
        }
    }

    public /* synthetic */ PriceDTO(List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Component>) list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, priceStyle, preset, (i11 & 32) != 0 ? Paddings.NONE : paddings, (i11 & 64) != 0 ? Paddings.NONE : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings3, (i11 & 256) != 0 ? Paddings.NONE : paddings4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (Map<String, TokenizedTrackingInfo>) ((i11 & 2048) != 0 ? null : map), (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? false : z11);
    }

    public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, String str3, boolean z11, int i11, Object obj) {
        return priceDTO.copy((i11 & 1) != 0 ? priceDTO.price : list, (i11 & 2) != 0 ? priceDTO.discount : str, (i11 & 4) != 0 ? priceDTO.backgroundCapacity : num, (i11 & 8) != 0 ? priceDTO.priceStyle : priceStyle, (i11 & 16) != 0 ? priceDTO.preset : preset, (i11 & 32) != 0 ? priceDTO.paddingLeft : paddings, (i11 & 64) != 0 ? priceDTO.paddingRight : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? priceDTO.paddingTop : paddings3, (i11 & 256) != 0 ? priceDTO.paddingBottom : paddings4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? priceDTO.context : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? priceDTO.testInfo : testInfo, (i11 & 2048) != 0 ? priceDTO.trackingInfo : map, (i11 & 4096) != 0 ? priceDTO.discountColor : str3, (i11 & 8192) != 0 ? priceDTO.isStrikethroughLineHidden : z11);
    }

    @NotNull
    public final List<Component> component1() {
        return this.price;
    }

    /* renamed from: component10, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDiscountColor() {
        return this.discountColor;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsStrikethroughLineHidden() {
        return this.isStrikethroughLineHidden;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getBackgroundCapacity() {
        return this.backgroundCapacity;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PriceStyle getPriceStyle() {
        return this.priceStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getPaddingLeft() {
        return this.paddingLeft;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getPaddingRight() {
        return this.paddingRight;
    }

    /* renamed from: component8, reason: from getter */
    public final Paddings getPaddingTop() {
        return this.paddingTop;
    }

    /* renamed from: component9, reason: from getter */
    public final Paddings getPaddingBottom() {
        return this.paddingBottom;
    }

    @NotNull
    public final PriceDTO copy(@NotNull List<Component> price, String discount, Integer backgroundCapacity, @NotNull PriceStyle priceStyle, @NotNull Preset preset, Paddings paddingLeft, Paddings paddingRight, Paddings paddingTop, Paddings paddingBottom, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, String discountColor, boolean isStrikethroughLineHidden) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
        return new PriceDTO(price, discount, backgroundCapacity, priceStyle, preset, paddingLeft, paddingRight, paddingTop, paddingBottom, context, testInfo, trackingInfo, discountColor, isStrikethroughLineHidden);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceDTO)) {
            return false;
        }
        PriceDTO priceDTO = (PriceDTO) other;
        return Intrinsics.d(this.price, priceDTO.price) && Intrinsics.d(this.discount, priceDTO.discount) && Intrinsics.d(this.backgroundCapacity, priceDTO.backgroundCapacity) && Intrinsics.d(this.priceStyle, priceDTO.priceStyle) && this.preset == priceDTO.preset && this.paddingLeft == priceDTO.paddingLeft && this.paddingRight == priceDTO.paddingRight && this.paddingTop == priceDTO.paddingTop && this.paddingBottom == priceDTO.paddingBottom && Intrinsics.d(this.context, priceDTO.context) && Intrinsics.d(this.testInfo, priceDTO.testInfo) && Intrinsics.d(this.trackingInfo, priceDTO.trackingInfo) && Intrinsics.d(this.discountColor, priceDTO.discountColor) && this.isStrikethroughLineHidden == priceDTO.isStrikethroughLineHidden;
    }

    public final Integer getBackgroundCapacity() {
        return this.backgroundCapacity;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final String getDiscountColor() {
        return this.discountColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.priceV2;
    }

    public final Paddings getPaddingBottom() {
        return this.paddingBottom;
    }

    public final Paddings getPaddingLeft() {
        return this.paddingLeft;
    }

    public final Paddings getPaddingRight() {
        return this.paddingRight;
    }

    public final Paddings getPaddingTop() {
        return this.paddingTop;
    }

    @NotNull
    public final Preset getPreset() {
        return this.preset;
    }

    @NotNull
    public final List<Component> getPrice() {
        return this.price;
    }

    @NotNull
    public final PriceStyle getPriceStyle() {
        return this.priceStyle;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        String str = this.discount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.backgroundCapacity;
        int hashCode3 = (this.preset.hashCode() + ((this.priceStyle.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        Paddings paddings = this.paddingLeft;
        int hashCode4 = (hashCode3 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.paddingRight;
        int hashCode5 = (hashCode4 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.paddingTop;
        int hashCode6 = (hashCode5 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.paddingBottom;
        int hashCode7 = (hashCode6 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        String str2 = this.context;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.discountColor;
        return Boolean.hashCode(this.isStrikethroughLineHidden) + ((hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isStrikethroughLineHidden() {
        return this.isStrikethroughLineHidden;
    }

    @NotNull
    public String toString() {
        List<Component> list = this.price;
        String str = this.discount;
        Integer num = this.backgroundCapacity;
        PriceStyle priceStyle = this.priceStyle;
        Preset preset = this.preset;
        Paddings paddings = this.paddingLeft;
        Paddings paddings2 = this.paddingRight;
        Paddings paddings3 = this.paddingTop;
        Paddings paddings4 = this.paddingBottom;
        String str2 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str3 = this.discountColor;
        boolean z11 = this.isStrikethroughLineHidden;
        StringBuilder a11 = C4055a.a("PriceDTO(price=", ", discount=", str, ", backgroundCapacity=", list);
        a11.append(num);
        a11.append(", priceStyle=");
        a11.append(priceStyle);
        a11.append(", preset=");
        a11.append(preset);
        a11.append(", paddingLeft=");
        a11.append(paddings);
        a11.append(", paddingRight=");
        a11.append(paddings2);
        a11.append(", paddingTop=");
        a11.append(paddings3);
        a11.append(", paddingBottom=");
        a11.append(paddings4);
        a11.append(", context=");
        a11.append(str2);
        a11.append(", testInfo=");
        a11.append(testInfo);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(", discountColor=");
        a11.append(str3);
        a11.append(", isStrikethroughLineHidden=");
        a11.append(z11);
        a11.append(")");
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.price, dest);
        while (c11.hasNext()) {
            ((Component) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.discount);
        Integer num = this.backgroundCapacity;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        this.priceStyle.writeToParcel(dest, flags);
        dest.writeString(this.preset.name());
        Paddings paddings = this.paddingLeft;
        if (paddings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings.name());
        }
        Paddings paddings2 = this.paddingRight;
        if (paddings2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings2.name());
        }
        Paddings paddings3 = this.paddingTop;
        if (paddings3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings3.name());
        }
        Paddings paddings4 = this.paddingBottom;
        if (paddings4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paddings4.name());
        }
        dest.writeString(this.context);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeString(this.discountColor);
        dest.writeInt(this.isStrikethroughLineHidden ? 1 : 0);
    }

    public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = priceDTO.price;
        }
        return priceDTO.copy(list, (i11 & 2) != 0 ? priceDTO.discount : str, (i11 & 4) != 0 ? priceDTO.backgroundCapacity : num, (i11 & 8) != 0 ? priceDTO.priceStyle : priceStyle, (i11 & 16) != 0 ? priceDTO.preset : preset, (i11 & 32) != 0 ? priceDTO.paddingLeft : paddings, (i11 & 64) != 0 ? priceDTO.paddingRight : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? priceDTO.paddingTop : paddings3, (i11 & 256) != 0 ? priceDTO.paddingBottom : paddings4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? priceDTO.getContext() : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? priceDTO.getTestInfo() : testInfo, (i11 & 2048) != 0 ? priceDTO.getTrackingInfo() : map, (i11 & 4096) != 0 ? priceDTO.discountColor : str3);
    }

    @InterfaceC3999a
    public final /* synthetic */ PriceDTO copy(List price, String discount, Integer backgroundCapacity, PriceStyle priceStyle, Preset preset, Paddings paddingLeft, Paddings paddingRight, Paddings paddingTop, Paddings paddingBottom, String context, TestInfo testInfo, Map trackingInfo, String discountColor) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
        return copy(price, discount, backgroundCapacity, priceStyle, preset, paddingLeft, paddingRight, paddingTop, paddingBottom, context, testInfo, trackingInfo, discountColor, false);
    }

    @InterfaceC3999a
    public final /* synthetic */ PriceDTO copy(List price, String discount, Integer backgroundCapacity, PriceStyle priceStyle, Preset preset, Paddings paddingLeft, Paddings paddingRight, Paddings paddingTop, Paddings paddingBottom, String context, TestInfo testInfo, Map trackingInfo) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
        return copy$default(this, price, discount, backgroundCapacity, priceStyle, preset, paddingLeft, paddingRight, paddingTop, paddingBottom, context, testInfo, trackingInfo, this.discountColor, false, 8192, null);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient;", "Landroid/os/Parcelable;", "startColor", "", "endColor", "direction", "Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient$Direction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient$Direction;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "getDirection", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient$Direction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Direction", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Gradient implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Gradient> CREATOR = new Creator();

        @EnumNullFallback
        private final Direction direction;

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gradient> {
            @Override // android.os.Parcelable.Creator
            public final Gradient createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gradient(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Direction.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Gradient[] newArray(int i11) {
                return new Gradient[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "RIGHT_LEFT", "BOTTOM_TOP", "LEFT_RIGHT", "BOTTOM_RIGHT_TOP_LEFT", "BOTTOM_LEFT_TOP_RIGHT", "TOP_LEFT_BOTTOM_RIGHT", "TOP_RIGHT_BOTTOM_LEFT", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class Direction {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Direction[] $VALUES;
            public static final Direction TOP_BOTTOM = new Direction("TOP_BOTTOM", 0);
            public static final Direction RIGHT_LEFT = new Direction("RIGHT_LEFT", 1);
            public static final Direction BOTTOM_TOP = new Direction("BOTTOM_TOP", 2);
            public static final Direction LEFT_RIGHT = new Direction("LEFT_RIGHT", 3);
            public static final Direction BOTTOM_RIGHT_TOP_LEFT = new Direction("BOTTOM_RIGHT_TOP_LEFT", 4);
            public static final Direction BOTTOM_LEFT_TOP_RIGHT = new Direction("BOTTOM_LEFT_TOP_RIGHT", 5);
            public static final Direction TOP_LEFT_BOTTOM_RIGHT = new Direction("TOP_LEFT_BOTTOM_RIGHT", 6);
            public static final Direction TOP_RIGHT_BOTTOM_LEFT = new Direction("TOP_RIGHT_BOTTOM_LEFT", 7);

            private static final /* synthetic */ Direction[] $values() {
                return new Direction[]{TOP_BOTTOM, RIGHT_LEFT, BOTTOM_TOP, LEFT_RIGHT, BOTTOM_RIGHT_TOP_LEFT, BOTTOM_LEFT_TOP_RIGHT, TOP_LEFT_BOTTOM_RIGHT, TOP_RIGHT_BOTTOM_LEFT};
            }

            static {
                Direction[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Direction(String str, int i11) {
            }

            @NotNull
            public static a<Direction> getEntries() {
                return $ENTRIES;
            }

            public static Direction valueOf(String str) {
                return (Direction) Enum.valueOf(Direction.class, str);
            }

            public static Direction[] values() {
                return (Direction[]) $VALUES.clone();
            }
        }

        public Gradient(@NotNull String startColor, @NotNull String endColor, Direction direction) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
            this.direction = direction;
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, String str, String str2, Direction direction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gradient.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = gradient.endColor;
            }
            if ((i11 & 4) != 0) {
                direction = gradient.direction;
            }
            return gradient.copy(str, str2, direction);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartColor() {
            return this.startColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndColor() {
            return this.endColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        @NotNull
        public final Gradient copy(@NotNull String startColor, @NotNull String endColor, Direction direction) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new Gradient(startColor, endColor, direction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.startColor, gradient.startColor) && Intrinsics.d(this.endColor, gradient.endColor) && this.direction == gradient.direction;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            int a11 = g.a(this.startColor.hashCode() * 31, 31, this.endColor);
            Direction direction = this.direction;
            return a11 + (direction == null ? 0 : direction.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.startColor;
            String str2 = this.endColor;
            Direction direction = this.direction;
            StringBuilder d11 = C3660k.d("Gradient(startColor=", str, ", endColor=", str2, ", direction=");
            d11.append(direction);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.startColor);
            dest.writeString(this.endColor);
            Direction direction = this.direction;
            if (direction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(direction.name());
            }
        }

        public /* synthetic */ Gradient(String str, String str2, Direction direction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? Direction.TOP_LEFT_BOTTOM_RIGHT : direction);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle;", "Landroid/os/Parcelable;", "styleType", "Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle$StyleType;", "gradientToken", "", "gradient", "Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient;", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle$StyleType;Ljava/lang/String;Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient;)V", "getStyleType", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle$StyleType;", "getGradientToken", "()Ljava/lang/String;", "getGradient", "()Lru/ozon/app/android/atoms/data/price/PriceDTO$Gradient;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "StyleType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PriceStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<PriceStyle> CREATOR = new Creator();
        private final Gradient gradient;
        private final String gradientToken;

        @NotNull
        private final StyleType styleType;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceStyle> {
            @Override // android.os.Parcelable.Creator
            public final PriceStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceStyle(StyleType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Gradient.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PriceStyle[] newArray(int i11) {
                return new PriceStyle[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceDTO$PriceStyle$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTUAL_PRICE", "UNAVAILABLE", "SECOND_LVL", "CARD_PRICE", "CREDIT_PRICE", "SALE_PRICE", "ON_COLOR", "UNAVAILABLE_ON_COLOR", "SECOND_LVL_ON_COLOR", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class StyleType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ StyleType[] $VALUES;
            public static final StyleType ACTUAL_PRICE = new StyleType("ACTUAL_PRICE", 0);
            public static final StyleType UNAVAILABLE = new StyleType("UNAVAILABLE", 1);
            public static final StyleType SECOND_LVL = new StyleType("SECOND_LVL", 2);
            public static final StyleType CARD_PRICE = new StyleType("CARD_PRICE", 3);
            public static final StyleType CREDIT_PRICE = new StyleType("CREDIT_PRICE", 4);
            public static final StyleType SALE_PRICE = new StyleType("SALE_PRICE", 5);
            public static final StyleType ON_COLOR = new StyleType("ON_COLOR", 6);
            public static final StyleType UNAVAILABLE_ON_COLOR = new StyleType("UNAVAILABLE_ON_COLOR", 7);
            public static final StyleType SECOND_LVL_ON_COLOR = new StyleType("SECOND_LVL_ON_COLOR", 8);

            private static final /* synthetic */ StyleType[] $values() {
                return new StyleType[]{ACTUAL_PRICE, UNAVAILABLE, SECOND_LVL, CARD_PRICE, CREDIT_PRICE, SALE_PRICE, ON_COLOR, UNAVAILABLE_ON_COLOR, SECOND_LVL_ON_COLOR};
            }

            static {
                StyleType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private StyleType(String str, int i11) {
            }

            @NotNull
            public static a<StyleType> getEntries() {
                return $ENTRIES;
            }

            public static StyleType valueOf(String str) {
                return (StyleType) Enum.valueOf(StyleType.class, str);
            }

            public static StyleType[] values() {
                return (StyleType[]) $VALUES.clone();
            }
        }

        public PriceStyle(@NotNull StyleType styleType, String str, Gradient gradient) {
            Intrinsics.checkNotNullParameter(styleType, "styleType");
            this.styleType = styleType;
            this.gradientToken = str;
            this.gradient = gradient;
        }

        public static /* synthetic */ PriceStyle copy$default(PriceStyle priceStyle, StyleType styleType, String str, Gradient gradient, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                styleType = priceStyle.styleType;
            }
            if ((i11 & 2) != 0) {
                str = priceStyle.gradientToken;
            }
            if ((i11 & 4) != 0) {
                gradient = priceStyle.gradient;
            }
            return priceStyle.copy(styleType, str, gradient);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final StyleType getStyleType() {
            return this.styleType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGradientToken() {
            return this.gradientToken;
        }

        /* renamed from: component3, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final PriceStyle copy(@NotNull StyleType styleType, String gradientToken, Gradient gradient) {
            Intrinsics.checkNotNullParameter(styleType, "styleType");
            return new PriceStyle(styleType, gradientToken, gradient);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceStyle)) {
                return false;
            }
            PriceStyle priceStyle = (PriceStyle) other;
            return this.styleType == priceStyle.styleType && Intrinsics.d(this.gradientToken, priceStyle.gradientToken) && Intrinsics.d(this.gradient, priceStyle.gradient);
        }

        public final Gradient getGradient() {
            return this.gradient;
        }

        public final String getGradientToken() {
            return this.gradientToken;
        }

        @NotNull
        public final StyleType getStyleType() {
            return this.styleType;
        }

        public int hashCode() {
            int hashCode = this.styleType.hashCode() * 31;
            String str = this.gradientToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Gradient gradient = this.gradient;
            return hashCode2 + (gradient != null ? gradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PriceStyle(styleType=" + this.styleType + ", gradientToken=" + this.gradientToken + ", gradient=" + this.gradient + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.styleType.name());
            dest.writeString(this.gradientToken);
            Gradient gradient = this.gradient;
            if (gradient == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                gradient.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ PriceStyle(StyleType styleType, String str, Gradient gradient, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(styleType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : gradient);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDTO(@NotNull List<Component> price, String str, Integer num, @NotNull PriceStyle priceStyle, @NotNull Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, String str3, boolean z11) {
        super(DsAtomsType.PRICE_V2, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
        this.price = price;
        this.discount = str;
        this.backgroundCapacity = num;
        this.priceStyle = priceStyle;
        this.preset = preset;
        this.paddingLeft = paddings;
        this.paddingRight = paddings2;
        this.paddingTop = paddings3;
        this.paddingBottom = paddings4;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.discountColor = str3;
        this.isStrikethroughLineHidden = z11;
    }

    public static /* synthetic */ PriceDTO copy$default(PriceDTO priceDTO, List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = priceDTO.price;
        }
        if ((i11 & 2) != 0) {
            str = priceDTO.discount;
        }
        if ((i11 & 4) != 0) {
            num = priceDTO.backgroundCapacity;
        }
        if ((i11 & 8) != 0) {
            priceStyle = priceDTO.priceStyle;
        }
        if ((i11 & 16) != 0) {
            preset = priceDTO.preset;
        }
        if ((i11 & 32) != 0) {
            paddings = priceDTO.paddingLeft;
        }
        if ((i11 & 64) != 0) {
            paddings2 = priceDTO.paddingRight;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings3 = priceDTO.paddingTop;
        }
        if ((i11 & 256) != 0) {
            paddings4 = priceDTO.paddingBottom;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str2 = priceDTO.getContext();
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = priceDTO.getTestInfo();
        }
        if ((i11 & 2048) != 0) {
            map = priceDTO.getTrackingInfo();
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        Paddings paddings5 = paddings4;
        String str3 = str2;
        Paddings paddings6 = paddings2;
        Paddings paddings7 = paddings3;
        Preset preset2 = preset;
        Paddings paddings8 = paddings;
        return priceDTO.copy(list, str, num, priceStyle, preset2, paddings8, paddings6, paddings7, paddings5, str3, testInfo2, map2);
    }

    public /* synthetic */ PriceDTO(List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, priceStyle, preset, (i11 & 32) != 0 ? Paddings.NONE : paddings, (i11 & 64) != 0 ? Paddings.NONE : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings3, (i11 & 256) != 0 ? Paddings.NONE : paddings4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map, (i11 & 4096) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ PriceDTO(List price, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, String str3) {
        this((List<Component>) price, str, num, priceStyle, preset, paddings, paddings2, paddings3, paddings4, str2, testInfo, (Map<String, TokenizedTrackingInfo>) map, str3, false);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
    }

    public /* synthetic */ PriceDTO(List list, String str, Integer num, PriceStyle priceStyle, Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, priceStyle, preset, (i11 & 32) != 0 ? Paddings.NONE : paddings, (i11 & 64) != 0 ? Paddings.NONE : paddings2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings3, (i11 & 256) != 0 ? Paddings.NONE : paddings4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceDTO(@NotNull List<Component> price, String str, Integer num, @NotNull PriceStyle priceStyle, @NotNull Preset preset, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        this(price, str, num, priceStyle, preset, paddings, paddings2, paddings3, paddings4, str2, testInfo, map, null, false, 8192, null);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        Intrinsics.checkNotNullParameter(preset, "preset");
    }
}
