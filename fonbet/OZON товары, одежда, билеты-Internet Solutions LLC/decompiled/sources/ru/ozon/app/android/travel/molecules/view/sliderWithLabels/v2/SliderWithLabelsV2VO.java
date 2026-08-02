package ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2;

import B0.C2454a;
import B6.b;
import Ek.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.sliderWithLabels.v2.SliderWithLabelsV2ViewGroup;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b)\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "", "", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Label;", "points", "", "min", "max", "initialMinValue", "initialMaxValue", "step", "maxRange", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;", "startedThumb", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "actionTokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "sliderSelectAction", "<init>", "(Ljava/util/List;IIIIIILru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(Ljava/util/List;IIIIIILru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2VO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "I", "getMin", "getMax", "getInitialMinValue", "getInitialMaxValue", "getStep", "getMaxRange", "Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;", "getStartedThumb", "()Lru/ozon/app/android/travel/molecules/view/sliderWithLabels/v2/SliderWithLabelsV2ViewGroup$Thumb;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "LWZ/t;", "getActionTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getSliderSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SliderWithLabelsV2VO {
    private final t actionTokenizedEvent;
    private final CommonControlSettings common;
    private final int initialMaxValue;
    private final int initialMinValue;
    private final int max;
    private final int maxRange;
    private final int min;

    @NotNull
    private final List<SliderWithLabelsV2ViewGroup.Label> points;
    private final AtomAction sliderSelectAction;
    private final SliderWithLabelsV2ViewGroup.Thumb startedThumb;
    private final int step;

    public SliderWithLabelsV2VO(@NotNull List<SliderWithLabelsV2ViewGroup.Label> points, int i11, int i12, int i13, int i14, int i15, int i16, SliderWithLabelsV2ViewGroup.Thumb thumb, CommonControlSettings commonControlSettings, t tVar, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
        this.min = i11;
        this.max = i12;
        this.initialMinValue = i13;
        this.initialMaxValue = i14;
        this.step = i15;
        this.maxRange = i16;
        this.startedThumb = thumb;
        this.common = commonControlSettings;
        this.actionTokenizedEvent = tVar;
        this.sliderSelectAction = atomAction;
    }

    public static /* synthetic */ SliderWithLabelsV2VO copy$default(SliderWithLabelsV2VO sliderWithLabelsV2VO, List list, int i11, int i12, int i13, int i14, int i15, int i16, SliderWithLabelsV2ViewGroup.Thumb thumb, CommonControlSettings commonControlSettings, t tVar, AtomAction atomAction, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            list = sliderWithLabelsV2VO.points;
        }
        if ((i17 & 2) != 0) {
            i11 = sliderWithLabelsV2VO.min;
        }
        if ((i17 & 4) != 0) {
            i12 = sliderWithLabelsV2VO.max;
        }
        if ((i17 & 8) != 0) {
            i13 = sliderWithLabelsV2VO.initialMinValue;
        }
        if ((i17 & 16) != 0) {
            i14 = sliderWithLabelsV2VO.initialMaxValue;
        }
        if ((i17 & 32) != 0) {
            i15 = sliderWithLabelsV2VO.step;
        }
        if ((i17 & 64) != 0) {
            i16 = sliderWithLabelsV2VO.maxRange;
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            thumb = sliderWithLabelsV2VO.startedThumb;
        }
        if ((i17 & 256) != 0) {
            commonControlSettings = sliderWithLabelsV2VO.common;
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            tVar = sliderWithLabelsV2VO.actionTokenizedEvent;
        }
        if ((i17 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            atomAction = sliderWithLabelsV2VO.sliderSelectAction;
        }
        t tVar2 = tVar;
        AtomAction atomAction2 = atomAction;
        SliderWithLabelsV2ViewGroup.Thumb thumb2 = thumb;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        int i18 = i15;
        int i19 = i16;
        int i21 = i14;
        int i22 = i12;
        return sliderWithLabelsV2VO.copy(list, i11, i22, i13, i21, i18, i19, thumb2, commonControlSettings2, tVar2, atomAction2);
    }

    @NotNull
    public final SliderWithLabelsV2VO copy(@NotNull List<SliderWithLabelsV2ViewGroup.Label> points, int min, int max, int initialMinValue, int initialMaxValue, int step, int maxRange, SliderWithLabelsV2ViewGroup.Thumb startedThumb, CommonControlSettings common, t actionTokenizedEvent, AtomAction sliderSelectAction) {
        Intrinsics.checkNotNullParameter(points, "points");
        return new SliderWithLabelsV2VO(points, min, max, initialMinValue, initialMaxValue, step, maxRange, startedThumb, common, actionTokenizedEvent, sliderSelectAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderWithLabelsV2VO)) {
            return false;
        }
        SliderWithLabelsV2VO sliderWithLabelsV2VO = (SliderWithLabelsV2VO) other;
        return Intrinsics.d(this.points, sliderWithLabelsV2VO.points) && this.min == sliderWithLabelsV2VO.min && this.max == sliderWithLabelsV2VO.max && this.initialMinValue == sliderWithLabelsV2VO.initialMinValue && this.initialMaxValue == sliderWithLabelsV2VO.initialMaxValue && this.step == sliderWithLabelsV2VO.step && this.maxRange == sliderWithLabelsV2VO.maxRange && this.startedThumb == sliderWithLabelsV2VO.startedThumb && Intrinsics.d(this.common, sliderWithLabelsV2VO.common) && Intrinsics.d(this.actionTokenizedEvent, sliderWithLabelsV2VO.actionTokenizedEvent) && Intrinsics.d(this.sliderSelectAction, sliderWithLabelsV2VO.sliderSelectAction);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final int getInitialMaxValue() {
        return this.initialMaxValue;
    }

    public final int getInitialMinValue() {
        return this.initialMinValue;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMaxRange() {
        return this.maxRange;
    }

    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final List<SliderWithLabelsV2ViewGroup.Label> getPoints() {
        return this.points;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxRange, C2454a.a(this.step, C2454a.a(this.initialMaxValue, C2454a.a(this.initialMinValue, C2454a.a(this.max, C2454a.a(this.min, this.points.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        SliderWithLabelsV2ViewGroup.Thumb thumb = this.startedThumb;
        int hashCode = (a11 + (thumb == null ? 0 : thumb.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        t tVar = this.actionTokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction atomAction = this.sliderSelectAction;
        return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<SliderWithLabelsV2ViewGroup.Label> list = this.points;
        int i11 = this.min;
        int i12 = this.max;
        int i13 = this.initialMinValue;
        int i14 = this.initialMaxValue;
        int i15 = this.step;
        int i16 = this.maxRange;
        SliderWithLabelsV2ViewGroup.Thumb thumb = this.startedThumb;
        CommonControlSettings commonControlSettings = this.common;
        t tVar = this.actionTokenizedEvent;
        AtomAction atomAction = this.sliderSelectAction;
        StringBuilder sb2 = new StringBuilder("SliderWithLabelsV2VO(points=");
        sb2.append(list);
        sb2.append(", min=");
        sb2.append(i11);
        sb2.append(", max=");
        a.f(i12, i13, ", initialMinValue=", ", initialMaxValue=", sb2);
        a.f(i14, i15, ", step=", ", maxRange=", sb2);
        sb2.append(i16);
        sb2.append(", startedThumb=");
        sb2.append(thumb);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", actionTokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", sliderSelectAction=");
        return b.b(sb2, atomAction, ")");
    }
}
