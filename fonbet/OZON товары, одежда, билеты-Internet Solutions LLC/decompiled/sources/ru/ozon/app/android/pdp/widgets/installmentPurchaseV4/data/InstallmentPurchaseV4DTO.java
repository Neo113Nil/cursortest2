package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.data;

import Ak.C2436a;
import D3.g;
import Ns.b;
import Pk0.h;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004./01BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "common", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$ControlSettings;", "gradientBadge", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;", "image", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$ControlSettings;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$ControlSettings;", "getGradientBadge", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;", "getImage", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ControlSettings", "GradientBadge", "Gradient", "Image", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstallmentPurchaseV4DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final ControlSettings common;
    private final GradientBadge gradientBadge;
    private final IconDTO icon;
    private final Image image;

    @NotNull
    private final TextDTO text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$ControlSettings;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ControlSettings {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ControlSettings() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ControlSettings copy$default(ControlSettings controlSettings, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = controlSettings.action;
            }
            if ((i11 & 2) != 0) {
                map = controlSettings.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                testInfo = controlSettings.testInfo;
            }
            return controlSettings.copy(atomActionDTO, map, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final ControlSettings copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            return new ControlSettings(action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControlSettings)) {
                return false;
            }
            ControlSettings controlSettings = (ControlSettings) other;
            return Intrinsics.d(this.action, controlSettings.action) && Intrinsics.d(this.trackingInfo, controlSettings.trackingInfo) && Intrinsics.d(this.testInfo, controlSettings.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ControlSettings(action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }

        public ControlSettings(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public /* synthetic */ ControlSettings(AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : atomActionDTO, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : testInfo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Gradient;", "", "lightValues", "", "", "darkValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLightValues", "()Ljava/util/List;", "getDarkValues", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {
        public static final int $stable = 8;
        private final List<String> darkValues;

        @NotNull
        private final List<String> lightValues;

        public Gradient(@NotNull List<String> lightValues, List<String> list) {
            Intrinsics.checkNotNullParameter(lightValues, "lightValues");
            this.lightValues = lightValues;
            this.darkValues = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = gradient.lightValues;
            }
            if ((i11 & 2) != 0) {
                list2 = gradient.darkValues;
            }
            return gradient.copy(list, list2);
        }

        @NotNull
        public final List<String> component1() {
            return this.lightValues;
        }

        public final List<String> component2() {
            return this.darkValues;
        }

        @NotNull
        public final Gradient copy(@NotNull List<String> lightValues, List<String> darkValues) {
            Intrinsics.checkNotNullParameter(lightValues, "lightValues");
            return new Gradient(lightValues, darkValues);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.lightValues, gradient.lightValues) && Intrinsics.d(this.darkValues, gradient.darkValues);
        }

        public final List<String> getDarkValues() {
            return this.darkValues;
        }

        @NotNull
        public final List<String> getLightValues() {
            return this.lightValues;
        }

        public int hashCode() {
            int hashCode = this.lightValues.hashCode() * 31;
            List<String> list = this.darkValues;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return C2436a.b("Gradient(lightValues=", this.lightValues, ", darkValues=", ")", this.darkValues);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "gradient", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Gradient;", "animationTimer", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Gradient;Ljava/lang/Integer;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getGradient", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Gradient;", "getAnimationTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Gradient;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$GradientBadge;", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GradientBadge {
        public static final int $stable = 8;
        private final Integer animationTimer;
        private final String backgroundColor;
        private final Gradient gradient;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public GradientBadge(@NotNull TextDTO text, String str, Gradient gradient, Integer num, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.backgroundColor = str;
            this.gradient = gradient;
            this.animationTimer = num;
            this.trackingInfo = map;
        }

        public static /* synthetic */ GradientBadge copy$default(GradientBadge gradientBadge, TextDTO textDTO, String str, Gradient gradient, Integer num, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = gradientBadge.text;
            }
            if ((i11 & 2) != 0) {
                str = gradientBadge.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                gradient = gradientBadge.gradient;
            }
            if ((i11 & 8) != 0) {
                num = gradientBadge.animationTimer;
            }
            if ((i11 & 16) != 0) {
                map = gradientBadge.trackingInfo;
            }
            Map map2 = map;
            Gradient gradient2 = gradient;
            return gradientBadge.copy(textDTO, str, gradient2, num, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final GradientBadge copy(@NotNull TextDTO text, String backgroundColor, Gradient gradient, Integer animationTimer, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new GradientBadge(text, backgroundColor, gradient, animationTimer, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientBadge)) {
                return false;
            }
            GradientBadge gradientBadge = (GradientBadge) other;
            return Intrinsics.d(this.text, gradientBadge.text) && Intrinsics.d(this.backgroundColor, gradientBadge.backgroundColor) && Intrinsics.d(this.gradient, gradientBadge.gradient) && Intrinsics.d(this.animationTimer, gradientBadge.animationTimer) && Intrinsics.d(this.trackingInfo, gradientBadge.trackingInfo);
        }

        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Gradient gradient = this.gradient;
            int hashCode3 = (hashCode2 + (gradient == null ? 0 : gradient.hashCode())) * 31;
            Integer num = this.animationTimer;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.backgroundColor;
            Gradient gradient = this.gradient;
            Integer num = this.animationTimer;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = g.f("GradientBadge(text=", textDTO, ", backgroundColor=", str, ", gradient=");
            f7.append(gradient);
            f7.append(", animationTimer=");
            f7.append(num);
            f7.append(", trackingInfo=");
            return P.f(f7, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "darkImage", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDarkImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = 0;
        private final ImageDTO darkImage;

        @NotNull
        private final ImageDTO image;

        public Image(@NotNull ImageDTO image, ImageDTO imageDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.darkImage = imageDTO;
        }

        public static /* synthetic */ Image copy$default(Image image, ImageDTO imageDTO, ImageDTO imageDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = image.image;
            }
            if ((i11 & 2) != 0) {
                imageDTO2 = image.darkImage;
            }
            return image.copy(imageDTO, imageDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageDTO getDarkImage() {
            return this.darkImage;
        }

        @NotNull
        public final Image copy(@NotNull ImageDTO image, ImageDTO darkImage) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Image(image, darkImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.darkImage, image.darkImage);
        }

        public final ImageDTO getDarkImage() {
            return this.darkImage;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            ImageDTO imageDTO = this.darkImage;
            return hashCode + (imageDTO == null ? 0 : imageDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Image(image=" + this.image + ", darkImage=" + this.darkImage + ")";
        }
    }

    public InstallmentPurchaseV4DTO(BadgeDTO badgeDTO, @NotNull TextDTO text, IconDTO iconDTO, String str, ControlSettings controlSettings, GradientBadge gradientBadge, Image image) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.badge = badgeDTO;
        this.text = text;
        this.icon = iconDTO;
        this.backgroundColor = str;
        this.common = controlSettings;
        this.gradientBadge = gradientBadge;
        this.image = image;
    }

    public static /* synthetic */ InstallmentPurchaseV4DTO copy$default(InstallmentPurchaseV4DTO installmentPurchaseV4DTO, BadgeDTO badgeDTO, TextDTO textDTO, IconDTO iconDTO, String str, ControlSettings controlSettings, GradientBadge gradientBadge, Image image, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = installmentPurchaseV4DTO.badge;
        }
        if ((i11 & 2) != 0) {
            textDTO = installmentPurchaseV4DTO.text;
        }
        if ((i11 & 4) != 0) {
            iconDTO = installmentPurchaseV4DTO.icon;
        }
        if ((i11 & 8) != 0) {
            str = installmentPurchaseV4DTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            controlSettings = installmentPurchaseV4DTO.common;
        }
        if ((i11 & 32) != 0) {
            gradientBadge = installmentPurchaseV4DTO.gradientBadge;
        }
        if ((i11 & 64) != 0) {
            image = installmentPurchaseV4DTO.image;
        }
        GradientBadge gradientBadge2 = gradientBadge;
        Image image2 = image;
        ControlSettings controlSettings2 = controlSettings;
        IconDTO iconDTO2 = iconDTO;
        return installmentPurchaseV4DTO.copy(badgeDTO, textDTO, iconDTO2, str, controlSettings2, gradientBadge2, image2);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final ControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component6, reason: from getter */
    public final GradientBadge getGradientBadge() {
        return this.gradientBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final InstallmentPurchaseV4DTO copy(BadgeDTO badge, @NotNull TextDTO text, IconDTO icon, String backgroundColor, ControlSettings common, GradientBadge gradientBadge, Image image) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new InstallmentPurchaseV4DTO(badge, text, icon, backgroundColor, common, gradientBadge, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPurchaseV4DTO)) {
            return false;
        }
        InstallmentPurchaseV4DTO installmentPurchaseV4DTO = (InstallmentPurchaseV4DTO) other;
        return Intrinsics.d(this.badge, installmentPurchaseV4DTO.badge) && Intrinsics.d(this.text, installmentPurchaseV4DTO.text) && Intrinsics.d(this.icon, installmentPurchaseV4DTO.icon) && Intrinsics.d(this.backgroundColor, installmentPurchaseV4DTO.backgroundColor) && Intrinsics.d(this.common, installmentPurchaseV4DTO.common) && Intrinsics.d(this.gradientBadge, installmentPurchaseV4DTO.gradientBadge) && Intrinsics.d(this.image, installmentPurchaseV4DTO.image);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ControlSettings getCommon() {
        return this.common;
    }

    public final GradientBadge getGradientBadge() {
        return this.gradientBadge;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        BadgeDTO badgeDTO = this.badge;
        int a11 = b.a(this.text, (badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31, 31);
        IconDTO iconDTO = this.icon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ControlSettings controlSettings = this.common;
        int hashCode3 = (hashCode2 + (controlSettings == null ? 0 : controlSettings.hashCode())) * 31;
        GradientBadge gradientBadge = this.gradientBadge;
        int hashCode4 = (hashCode3 + (gradientBadge == null ? 0 : gradientBadge.hashCode())) * 31;
        Image image = this.image;
        return hashCode4 + (image != null ? image.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InstallmentPurchaseV4DTO(badge=" + this.badge + ", text=" + this.text + ", icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + ", common=" + this.common + ", gradientBadge=" + this.gradientBadge + ", image=" + this.image + ")";
    }
}
