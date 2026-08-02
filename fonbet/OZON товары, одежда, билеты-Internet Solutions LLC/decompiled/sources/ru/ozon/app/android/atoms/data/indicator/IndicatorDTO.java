package ru.ozon.app.android.atoms.data.indicator;

import C.J;
import De.C2859b;
import I0.C3173b;
import Kk.c;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import T7.Z;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0006NOPQRSB\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u008b\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0018B\u007f\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0019J\b\u00104\u001a\u000205H\u0016J\u008c\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0007J\u0080\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0006\u0010B\u001a\u000205J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u000205HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u000205R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010%R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010 \u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u00101\u001a\u0004\u0018\u00010\b¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010 \u001a\u0004\b3\u0010\"¨\u0006T"}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "text", "", "icon", "size", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "style", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;", "customPreset", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;", "content", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;", "context", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "styleType", "customStyle", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$CustomStyle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$CustomStyle;)V", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;)V", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getIcon", "getSize", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;", "getCustomPreset$annotations", "getCustomPreset", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;", "getContent$annotations", "getContent", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;", "getContext", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getStyleType", "getCustomStyle", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$CustomStyle;", "compatStyle", "getCompatStyle$annotations", "getCompatStyle", "getItemType", "", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "IndicatorSize", "IndicatorContent", "Style", "CustomStyle", "Custom", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IndicatorDTO extends AtomDTO {
    public static final int $stable = 0;
    private final transient Style compatStyle;

    @EnumNullFallback
    private final IndicatorContent content;
    private final String context;
    private final transient Custom customPreset;
    private final CustomStyle customStyle;
    private final String icon;

    @EnumNullFallback
    private final IndicatorSize size;

    @EnumNullFallback
    private final Style style;

    @EnumNullFallback
    private final Style styleType;
    private final TestInfo testInfo;
    private final String text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    public static final Parcelable.Creator<IndicatorDTO> CREATOR = new Creator();

    @NotNull
    private static final IndicatorSize DefaultSize = IndicatorSize.SIZE_500;

    @NotNull
    private static final Style DefaultStyle = Style.ACCENT;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndicatorDTO> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // android.os.Parcelable.Creator
        public final IndicatorDTO createFromParcel(Parcel parcel) {
            IndicatorContent valueOf;
            Style style;
            Map linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            IndicatorSize valueOf2 = parcel.readInt() == 0 ? null : IndicatorSize.valueOf(parcel.readString());
            Style valueOf3 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            Custom createFromParcel = parcel.readInt() == 0 ? null : Custom.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
                style = null;
            } else {
                valueOf = IndicatorContent.valueOf(parcel.readString());
                style = null;
            }
            String readString3 = parcel.readString();
            TestInfo testInfo = (TestInfo) (parcel.readInt() == 0 ? style : TestInfo.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                linkedHashMap = style;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(IndicatorDTO.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new IndicatorDTO(readString, readString2, valueOf2, valueOf3, createFromParcel, valueOf, readString3, testInfo, (Map<String, TokenizedTrackingInfo>) linkedHashMap, parcel.readInt() == 0 ? style : Style.valueOf(parcel.readString()), (CustomStyle) (parcel.readInt() == 0 ? style : CustomStyle.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final IndicatorDTO[] newArray(int i11) {
            return new IndicatorDTO[i11];
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0003J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;", "Landroid/os/Parcelable;", "backgroundColor", "", "textColor", "iconColor", "borderColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getIconColor", "getBorderColor", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Custom;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Custom implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();
        private final Integer backgroundColor;
        private final Integer borderColor;
        private final Integer iconColor;
        private final Integer textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i11) {
                return new Custom[i11];
            }
        }

        public Custom() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Custom copy$default(Custom custom, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = custom.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                num2 = custom.textColor;
            }
            if ((i11 & 4) != 0) {
                num3 = custom.iconColor;
            }
            if ((i11 & 8) != 0) {
                num4 = custom.borderColor;
            }
            return custom.copy(num, num2, num3, num4);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final Custom copy(Integer backgroundColor, Integer textColor, Integer iconColor, Integer borderColor) {
            return new Custom(backgroundColor, textColor, iconColor, borderColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.d(this.backgroundColor, custom.backgroundColor) && Intrinsics.d(this.textColor, custom.textColor) && Intrinsics.d(this.iconColor, custom.iconColor) && Intrinsics.d(this.borderColor, custom.borderColor);
        }

        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBorderColor() {
            return this.borderColor;
        }

        public final Integer getIconColor() {
            return this.iconColor;
        }

        public final Integer getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            Integer num = this.backgroundColor;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.textColor;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.iconColor;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.borderColor;
            return hashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.backgroundColor;
            Integer num2 = this.textColor;
            return Z.c(c.f("Custom(backgroundColor=", ", textColor=", num, num2, ", iconColor="), this.iconColor, ", borderColor=", this.borderColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.backgroundColor;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            Integer num2 = this.textColor;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num2);
            }
            Integer num3 = this.iconColor;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num3);
            }
            Integer num4 = this.borderColor;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num4);
            }
        }

        public Custom(Integer num, Integer num2, Integer num3, Integer num4) {
            this.backgroundColor = num;
            this.textColor = num2;
            this.iconColor = num3;
            this.borderColor = num4;
        }

        public /* synthetic */ Custom(Integer num, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$CustomStyle;", "Landroid/os/Parcelable;", "backgroundColor", "", "textColor", "iconColor", "borderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTextColor", "getIconColor", "getBorderColor", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomStyle> CREATOR = new Creator();
        private final String backgroundColor;
        private final String borderColor;
        private final String iconColor;
        private final String textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomStyle[] newArray(int i11) {
                return new CustomStyle[i11];
            }
        }

        public CustomStyle() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = customStyle.iconColor;
            }
            if ((i11 & 8) != 0) {
                str4 = customStyle.borderColor;
            }
            return customStyle.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CustomStyle copy(String backgroundColor, String textColor, String iconColor, String borderColor) {
            return new CustomStyle(backgroundColor, textColor, iconColor, borderColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyle)) {
                return false;
            }
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(this.backgroundColor, customStyle.backgroundColor) && Intrinsics.d(this.textColor, customStyle.textColor) && Intrinsics.d(this.iconColor, customStyle.iconColor) && Intrinsics.d(this.borderColor, customStyle.borderColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.borderColor;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.textColor;
            return C3173b.c(C3660k.d("CustomStyle(backgroundColor=", str, ", textColor=", str2, ", iconColor="), this.iconColor, ", borderColor=", this.borderColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.backgroundColor);
            dest.writeString(this.textColor);
            dest.writeString(this.iconColor);
            dest.writeString(this.borderColor);
        }

        public CustomStyle(String str, String str2, String str3, String str4) {
            this.backgroundColor = str;
            this.textColor = str2;
            this.iconColor = str3;
            this.borderColor = str4;
        }

        public /* synthetic */ CustomStyle(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorContent;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TEXT", "ICON", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorContent {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ IndicatorContent[] $VALUES;
        public static final IndicatorContent NONE = new IndicatorContent("NONE", 0);
        public static final IndicatorContent TEXT = new IndicatorContent("TEXT", 1);
        public static final IndicatorContent ICON = new IndicatorContent("ICON", 2);

        private static final /* synthetic */ IndicatorContent[] $values() {
            return new IndicatorContent[]{NONE, TEXT, ICON};
        }

        static {
            IndicatorContent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorContent(String str, int i11) {
        }

        @NotNull
        public static Xc.a<IndicatorContent> getEntries() {
            return $ENTRIES;
        }

        public static IndicatorContent valueOf(String str) {
            return (IndicatorContent) Enum.valueOf(IndicatorContent.class, str);
        }

        public static IndicatorContent[] values() {
            return (IndicatorContent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$IndicatorSize;", "", "size", "", "cornerRadius", "<init>", "(Ljava/lang/String;III)V", "getSize", "()I", "getCornerRadius", "SIZE_300", "SIZE_400", "SIZE_450", "SIZE_500", "SIZE_600", "SIZE_700", "SIZE_800", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorSize {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ IndicatorSize[] $VALUES;
        public static final IndicatorSize SIZE_300 = new IndicatorSize("SIZE_300", 0, 4, 2);
        public static final IndicatorSize SIZE_400 = new IndicatorSize("SIZE_400", 1, 8, 4);
        public static final IndicatorSize SIZE_450 = new IndicatorSize("SIZE_450", 2, 12, 6);
        public static final IndicatorSize SIZE_500 = new IndicatorSize("SIZE_500", 3, 16, 8);
        public static final IndicatorSize SIZE_600 = new IndicatorSize("SIZE_600", 4, 20, 10);
        public static final IndicatorSize SIZE_700 = new IndicatorSize("SIZE_700", 5, 24, 12);
        public static final IndicatorSize SIZE_800 = new IndicatorSize("SIZE_800", 6, 28, 14);
        private final int cornerRadius;
        private final int size;

        private static final /* synthetic */ IndicatorSize[] $values() {
            return new IndicatorSize[]{SIZE_300, SIZE_400, SIZE_450, SIZE_500, SIZE_600, SIZE_700, SIZE_800};
        }

        static {
            IndicatorSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorSize(String str, int i11, int i12, int i13) {
            this.size = i12;
            this.cornerRadius = i13;
        }

        @NotNull
        public static Xc.a<IndicatorSize> getEntries() {
            return $ENTRIES;
        }

        public static IndicatorSize valueOf(String str) {
            return (IndicatorSize) Enum.valueOf(IndicatorSize.class, str);
        }

        public static IndicatorSize[] values() {
            return (IndicatorSize[]) $VALUES.clone();
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "ACCENT", "ACCENT_SECONDARY", "NEUTRAL", "NEUTRAL_TRANSPARENT", "LIGHT", "LIGHT_NEUTRAL", "STATIC", "NEUTRAL_ON_DARK", "CUSTOM", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style ACCENT = new Style("ACCENT", 0);
        public static final Style ACCENT_SECONDARY = new Style("ACCENT_SECONDARY", 1);
        public static final Style NEUTRAL = new Style("NEUTRAL", 2);
        public static final Style NEUTRAL_TRANSPARENT = new Style("NEUTRAL_TRANSPARENT", 3);
        public static final Style LIGHT = new Style("LIGHT", 4);
        public static final Style LIGHT_NEUTRAL = new Style("LIGHT_NEUTRAL", 5);
        public static final Style STATIC = new Style("STATIC", 6);
        public static final Style NEUTRAL_ON_DARK = new Style("NEUTRAL_ON_DARK", 7);
        public static final Style CUSTOM = new Style("CUSTOM", 8);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{ACCENT, ACCENT_SECONDARY, NEUTRAL, NEUTRAL_TRANSPARENT, LIGHT, LIGHT_NEUTRAL, STATIC, NEUTRAL_ON_DARK, CUSTOM};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public /* synthetic */ IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, Style style2, CustomStyle customStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? DefaultSize : indicatorSize, (i11 & 8) != 0 ? DefaultStyle : style, (i11 & 16) != 0 ? null : custom, indicatorContent, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (Map<String, TokenizedTrackingInfo>) ((i11 & 256) != 0 ? null : map), (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : style2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : customStyle);
    }

    public static /* synthetic */ IndicatorDTO copy$default(IndicatorDTO indicatorDTO, String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, Style style2, CustomStyle customStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = indicatorDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = indicatorDTO.icon;
        }
        if ((i11 & 4) != 0) {
            indicatorSize = indicatorDTO.size;
        }
        if ((i11 & 8) != 0) {
            style = indicatorDTO.style;
        }
        if ((i11 & 16) != 0) {
            custom = indicatorDTO.customPreset;
        }
        if ((i11 & 32) != 0) {
            indicatorContent = indicatorDTO.content;
        }
        if ((i11 & 64) != 0) {
            str3 = indicatorDTO.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = indicatorDTO.testInfo;
        }
        if ((i11 & 256) != 0) {
            map = indicatorDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            style2 = indicatorDTO.styleType;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            customStyle = indicatorDTO.customStyle;
        }
        Style style3 = style2;
        CustomStyle customStyle2 = customStyle;
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        IndicatorContent indicatorContent2 = indicatorContent;
        String str4 = str3;
        Custom custom2 = custom;
        IndicatorSize indicatorSize2 = indicatorSize;
        return indicatorDTO.copy(str, str2, indicatorSize2, style, custom2, indicatorContent2, str4, testInfo2, map2, style3, customStyle2);
    }

    public static /* synthetic */ void getCompatStyle$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getContent$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCustomPreset$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getStyle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final Style getStyleType() {
        return this.styleType;
    }

    /* renamed from: component11, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final IndicatorSize getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component5, reason: from getter */
    public final Custom getCustomPreset() {
        return this.customPreset;
    }

    /* renamed from: component6, reason: from getter */
    public final IndicatorContent getContent() {
        return this.content;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final IndicatorDTO copy(String text, String icon, IndicatorSize size, Style style, Custom customPreset, IndicatorContent content, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Style styleType, CustomStyle customStyle) {
        return new IndicatorDTO(text, icon, size, style, customPreset, content, context, testInfo, trackingInfo, styleType, customStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorDTO)) {
            return false;
        }
        IndicatorDTO indicatorDTO = (IndicatorDTO) other;
        return Intrinsics.d(this.text, indicatorDTO.text) && Intrinsics.d(this.icon, indicatorDTO.icon) && this.size == indicatorDTO.size && this.style == indicatorDTO.style && Intrinsics.d(this.customPreset, indicatorDTO.customPreset) && this.content == indicatorDTO.content && Intrinsics.d(this.context, indicatorDTO.context) && Intrinsics.d(this.testInfo, indicatorDTO.testInfo) && Intrinsics.d(this.trackingInfo, indicatorDTO.trackingInfo) && this.styleType == indicatorDTO.styleType && Intrinsics.d(this.customStyle, indicatorDTO.customStyle);
    }

    public final Style getCompatStyle() {
        return this.compatStyle;
    }

    public final IndicatorContent getContent() {
        return this.content;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Custom getCustomPreset() {
        return this.customPreset;
    }

    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.indicator;
    }

    public final IndicatorSize getSize() {
        return this.size;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final Style getStyleType() {
        return this.styleType;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getText() {
        return this.text;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IndicatorSize indicatorSize = this.size;
        int hashCode3 = (hashCode2 + (indicatorSize == null ? 0 : indicatorSize.hashCode())) * 31;
        Style style = this.style;
        int hashCode4 = (hashCode3 + (style == null ? 0 : style.hashCode())) * 31;
        Custom custom = this.customPreset;
        int hashCode5 = (hashCode4 + (custom == null ? 0 : custom.hashCode())) * 31;
        IndicatorContent indicatorContent = this.content;
        int hashCode6 = (hashCode5 + (indicatorContent == null ? 0 : indicatorContent.hashCode())) * 31;
        String str3 = this.context;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Style style2 = this.styleType;
        int hashCode10 = (hashCode9 + (style2 == null ? 0 : style2.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        return hashCode10 + (customStyle != null ? customStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.icon;
        IndicatorSize indicatorSize = this.size;
        Style style = this.style;
        Custom custom = this.customPreset;
        IndicatorContent indicatorContent = this.content;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Style style2 = this.styleType;
        CustomStyle customStyle = this.customStyle;
        StringBuilder d11 = C3660k.d("IndicatorDTO(text=", str, ", icon=", str2, ", size=");
        d11.append(indicatorSize);
        d11.append(", style=");
        d11.append(style);
        d11.append(", customPreset=");
        d11.append(custom);
        d11.append(", content=");
        d11.append(indicatorContent);
        d11.append(", context=");
        D40.b.d(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        d11.append(map);
        d11.append(", styleType=");
        d11.append(style2);
        d11.append(", customStyle=");
        d11.append(customStyle);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.icon);
        IndicatorSize indicatorSize = this.size;
        if (indicatorSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(indicatorSize.name());
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        Custom custom = this.customPreset;
        if (custom == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            custom.writeToParcel(dest, flags);
        }
        IndicatorContent indicatorContent = this.content;
        if (indicatorContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(indicatorContent.name());
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
        Style style2 = this.styleType;
        if (style2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style2.name());
        }
        CustomStyle customStyle = this.customStyle;
        if (customStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customStyle.writeToParcel(dest, flags);
        }
    }

    public static /* synthetic */ IndicatorDTO copy$default(IndicatorDTO indicatorDTO, String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, Style style2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = indicatorDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = indicatorDTO.icon;
        }
        if ((i11 & 4) != 0) {
            indicatorSize = indicatorDTO.size;
        }
        if ((i11 & 8) != 0) {
            style = indicatorDTO.style;
        }
        if ((i11 & 16) != 0) {
            custom = indicatorDTO.customPreset;
        }
        if ((i11 & 32) != 0) {
            indicatorContent = indicatorDTO.content;
        }
        if ((i11 & 64) != 0) {
            str3 = indicatorDTO.getContext();
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = indicatorDTO.getTestInfo();
        }
        if ((i11 & 256) != 0) {
            map = indicatorDTO.getTrackingInfo();
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            style2 = indicatorDTO.styleType;
        }
        Map map2 = map;
        Style style3 = style2;
        String str4 = str3;
        TestInfo testInfo2 = testInfo;
        Custom custom2 = custom;
        IndicatorContent indicatorContent2 = indicatorContent;
        return indicatorDTO.copy(str, str2, indicatorSize, style, custom2, indicatorContent2, str4, testInfo2, map2, style3);
    }

    @InterfaceC3999a
    public final /* synthetic */ IndicatorDTO copy(String text, String icon, IndicatorSize size, Style style, Custom customPreset, IndicatorContent content, String context, TestInfo testInfo, Map trackingInfo, Style styleType) {
        return copy(text, icon, size, style, customPreset, content, context, testInfo, trackingInfo, styleType, null);
    }

    @InterfaceC3999a
    public final /* synthetic */ IndicatorDTO copy(String text, String icon, IndicatorSize size, Style style, Custom customPreset, IndicatorContent content, String context, TestInfo testInfo, Map trackingInfo) {
        return copy$default(this, text, icon, size, style, customPreset, content, context, testInfo, trackingInfo, this.styleType, null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    public IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Style style2, CustomStyle customStyle) {
        super(DsAtomsType.INDICATOR, str3, map, testInfo);
        this.text = str;
        this.icon = str2;
        this.size = indicatorSize;
        this.style = style;
        this.customPreset = custom;
        this.content = indicatorContent;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.styleType = style2;
        this.customStyle = customStyle;
        this.compatStyle = style2 != null ? style2 : style;
    }

    public static /* synthetic */ IndicatorDTO copy$default(IndicatorDTO indicatorDTO, String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = indicatorDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = indicatorDTO.icon;
        }
        if ((i11 & 4) != 0) {
            indicatorSize = indicatorDTO.size;
        }
        if ((i11 & 8) != 0) {
            style = indicatorDTO.style;
        }
        if ((i11 & 16) != 0) {
            custom = indicatorDTO.customPreset;
        }
        if ((i11 & 32) != 0) {
            indicatorContent = indicatorDTO.content;
        }
        if ((i11 & 64) != 0) {
            str3 = indicatorDTO.getContext();
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = indicatorDTO.getTestInfo();
        }
        if ((i11 & 256) != 0) {
            map = indicatorDTO.getTrackingInfo();
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        IndicatorContent indicatorContent2 = indicatorContent;
        String str4 = str3;
        Custom custom2 = custom;
        IndicatorSize indicatorSize2 = indicatorSize;
        return indicatorDTO.copy(str, str2, indicatorSize2, style, custom2, indicatorContent2, str4, testInfo2, map2);
    }

    public /* synthetic */ IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, Style style2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? IndicatorSize.SIZE_500 : indicatorSize, (i11 & 8) != 0 ? Style.ACCENT : style, (i11 & 16) != 0 ? null : custom, indicatorContent, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : style2);
    }

    @InterfaceC3999a
    public /* synthetic */ IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, Style style2) {
        this(str, str2, indicatorSize, style, custom, indicatorContent, str3, testInfo, (Map<String, TokenizedTrackingInfo>) map, style2, (CustomStyle) null);
    }

    public /* synthetic */ IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? IndicatorSize.SIZE_500 : indicatorSize, (i11 & 8) != 0 ? null : style, (i11 & 16) != 0 ? null : custom, indicatorContent, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map);
    }

    public IndicatorDTO(String str, String str2, IndicatorSize indicatorSize, Style style, Custom custom, IndicatorContent indicatorContent, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        this(str, str2, indicatorSize, style, custom, indicatorContent, str3, testInfo, map, null, null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }
}
