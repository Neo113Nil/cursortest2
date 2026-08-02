package ru.ozon.app.android.travel.molecules.view.travelTab.v2;

import Cm.e;
import G.g;
import Kk.C3532b;
import Ns.b;
import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Jv\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b)\u0010\u0016R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "", "", "id", "", "text", "", "isSelected", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "accentColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "testInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILjava/lang/String;ZLru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(ILjava/lang/String;ZLru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getText", "Z", "()Z", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getAccentColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getTestInfo", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelTabVO {
    private final String accentColor;
    private final AtomAction action;
    private final int id;
    private final IndicatorDTO indicator;
    private final boolean isSelected;
    private final String testInfo;

    @NotNull
    private final String text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelTabVO(int i11, @NotNull String text, boolean z11, IndicatorDTO indicatorDTO, String str, AtomAction atomAction, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i11;
        this.text = text;
        this.isSelected = z11;
        this.indicator = indicatorDTO;
        this.accentColor = str;
        this.action = atomAction;
        this.testInfo = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelTabVO copy$default(TravelTabVO travelTabVO, int i11, String str, boolean z11, IndicatorDTO indicatorDTO, String str2, AtomAction atomAction, String str3, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = travelTabVO.id;
        }
        if ((i12 & 2) != 0) {
            str = travelTabVO.text;
        }
        if ((i12 & 4) != 0) {
            z11 = travelTabVO.isSelected;
        }
        if ((i12 & 8) != 0) {
            indicatorDTO = travelTabVO.indicator;
        }
        if ((i12 & 16) != 0) {
            str2 = travelTabVO.accentColor;
        }
        if ((i12 & 32) != 0) {
            atomAction = travelTabVO.action;
        }
        if ((i12 & 64) != 0) {
            str3 = travelTabVO.testInfo;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = travelTabVO.trackingInfo;
        }
        String str4 = str3;
        Map map2 = map;
        String str5 = str2;
        AtomAction atomAction2 = atomAction;
        return travelTabVO.copy(i11, str, z11, indicatorDTO, str5, atomAction2, str4, map2);
    }

    @NotNull
    public final TravelTabVO copy(int id2, @NotNull String text, boolean isSelected, IndicatorDTO indicator, String accentColor, AtomAction action, String testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TravelTabVO(id2, text, isSelected, indicator, accentColor, action, testInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTabVO)) {
            return false;
        }
        TravelTabVO travelTabVO = (TravelTabVO) other;
        return this.id == travelTabVO.id && Intrinsics.d(this.text, travelTabVO.text) && this.isSelected == travelTabVO.isSelected && Intrinsics.d(this.indicator, travelTabVO.indicator) && Intrinsics.d(this.accentColor, travelTabVO.accentColor) && Intrinsics.d(this.action, travelTabVO.action) && Intrinsics.d(this.testInfo, travelTabVO.testInfo) && Intrinsics.d(this.trackingInfo, travelTabVO.trackingInfo);
    }

    public final String getAccentColor() {
        return this.accentColor;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final int getId() {
        return this.id;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    public final String getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(Integer.hashCode(this.id) * 31, 31, this.text), 31, this.isSelected);
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode = (a11 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        String str = this.accentColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str2 = this.testInfo;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        String str = this.text;
        boolean z11 = this.isSelected;
        IndicatorDTO indicatorDTO = this.indicator;
        String str2 = this.accentColor;
        AtomAction atomAction = this.action;
        String str3 = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = e.g(i11, "TravelTabVO(id=", ", text=", str, ", isSelected=");
        g10.append(z11);
        g10.append(", indicator=");
        g10.append(indicatorDTO);
        g10.append(", accentColor=");
        b.d(str2, ", action=", ", testInfo=", g10, atomAction);
        return C4070a.a(g10, str3, ", trackingInfo=", map, ")");
    }
}
