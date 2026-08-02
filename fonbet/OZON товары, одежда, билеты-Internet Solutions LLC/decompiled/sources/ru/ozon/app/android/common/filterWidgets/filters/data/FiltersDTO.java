package ru.ozon.app.android.common.filterWidgets.filters.data;

import B3.p;
import B90.C2616s;
import G.g;
import GZ.e;
import Ih.a;
import N3.C3660k;
import Pk0.h;
import Ql.c;
import Sh.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004 !\"#B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO;", "", "originalUrl", "", "navBar", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "sections", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section;", "closeApplyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getOriginalUrl", "()Ljava/lang/String;", "getNavBar", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "getSections", "()Ljava/util/List;", "getCloseApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "NavBar", "Section", "ColorIcon", "ColorAspect", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FiltersDTO {

    @NotNull
    private final ButtonV3Atom.LargeButton closeApplyButton;

    @NotNull
    private final NavBar navBar;

    @NotNull
    private final String originalUrl;

    @NotNull
    private final List<Section> sections;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JX\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "", "colors", "", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getColors", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "equals", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorAspect {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final List<String> colors;
        private final Boolean isSelected;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ColorAspect(@NotNull List<String> colors, Boolean bool, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(action, "action");
            this.colors = colors;
            this.isSelected = bool;
            this.action = action;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ ColorAspect copy$default(ColorAspect colorAspect, List list, Boolean bool, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = colorAspect.colors;
            }
            if ((i11 & 2) != 0) {
                bool = colorAspect.isSelected;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = colorAspect.action;
            }
            if ((i11 & 8) != 0) {
                map = colorAspect.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                testInfo = colorAspect.testInfo;
            }
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return colorAspect.copy(list, bool, atomActionDTO2, map, testInfo2);
        }

        @NotNull
        public final List<String> component1() {
            return this.colors;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final ColorAspect copy(@NotNull List<String> colors, Boolean isSelected, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ColorAspect(colors, isSelected, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorAspect)) {
                return false;
            }
            ColorAspect colorAspect = (ColorAspect) other;
            return Intrinsics.d(this.colors, colorAspect.colors) && Intrinsics.d(this.isSelected, colorAspect.isSelected) && Intrinsics.d(this.action, colorAspect.action) && Intrinsics.d(this.trackingInfo, colorAspect.trackingInfo) && Intrinsics.d(this.testInfo, colorAspect.testInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final List<String> getColors() {
            return this.colors;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.colors.hashCode() * 31;
            Boolean bool = this.isSelected;
            int b11 = a.b(this.action, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            List<String> list = this.colors;
            Boolean bool = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ColorAspect(colors=");
            sb2.append(list);
            sb2.append(", isSelected=");
            sb2.append(bool);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "equals", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorIcon {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final IconDTO icon;
        private final Boolean isSelected;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ColorIcon(@NotNull IconDTO icon, Boolean bool, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = icon;
            this.isSelected = bool;
            this.action = action;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ ColorIcon copy$default(ColorIcon colorIcon, IconDTO iconDTO, Boolean bool, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = colorIcon.icon;
            }
            if ((i11 & 2) != 0) {
                bool = colorIcon.isSelected;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = colorIcon.action;
            }
            if ((i11 & 8) != 0) {
                map = colorIcon.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                testInfo = colorIcon.testInfo;
            }
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return colorIcon.copy(iconDTO, bool, atomActionDTO2, map, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final ColorIcon copy(@NotNull IconDTO icon, Boolean isSelected, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ColorIcon(icon, isSelected, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorIcon)) {
                return false;
            }
            ColorIcon colorIcon = (ColorIcon) other;
            return Intrinsics.d(this.icon, colorIcon.icon) && Intrinsics.d(this.isSelected, colorIcon.isSelected) && Intrinsics.d(this.action, colorIcon.action) && Intrinsics.d(this.trackingInfo, colorIcon.trackingInfo) && Intrinsics.d(this.testInfo, colorIcon.testInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            Boolean bool = this.isSelected;
            int b11 = a.b(this.action, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            Boolean bool = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ColorIcon(icon=");
            sb2.append(iconDTO);
            sb2.append(", isSelected=");
            sb2.append(bool);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "rightButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Ljava/lang/String;", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBar {
        private final ButtonV3Atom.SmallIconButton backButton;
        private final ButtonV3Atom.LargeBorderlessButton rightButton;

        @NotNull
        private final String title;

        public NavBar(@NotNull String title, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.backButton = smallIconButton;
            this.rightButton = largeBorderlessButton;
        }

        public static /* synthetic */ NavBar copy$default(NavBar navBar, String str, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = navBar.title;
            }
            if ((i11 & 2) != 0) {
                smallIconButton = navBar.backButton;
            }
            if ((i11 & 4) != 0) {
                largeBorderlessButton = navBar.rightButton;
            }
            return navBar.copy(str, smallIconButton, largeBorderlessButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getBackButton() {
            return this.backButton;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
            return this.rightButton;
        }

        @NotNull
        public final NavBar copy(@NotNull String title, ButtonV3Atom.SmallIconButton backButton, ButtonV3Atom.LargeBorderlessButton rightButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new NavBar(title, backButton, rightButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBar)) {
                return false;
            }
            NavBar navBar = (NavBar) other;
            return Intrinsics.d(this.title, navBar.title) && Intrinsics.d(this.backButton, navBar.backButton) && Intrinsics.d(this.rightButton, navBar.rightButton);
        }

        public final ButtonV3Atom.SmallIconButton getBackButton() {
            return this.backButton;
        }

        public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
            return this.rightButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ButtonV3Atom.SmallIconButton smallIconButton = this.backButton;
            int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
            return hashCode2 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NavBar(title=" + this.title + ", backButton=" + this.backButton + ", rightButton=" + this.rightButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Header;", "filters", "", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Header;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Header;", "getFilters", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Filter", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Section {
        private final List<Object> filters;
        private final Header header;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", "", "<init>", "()V", "TagFilter", "CategoryFilter", "ColorFilter", "AspectBrandFilter", "TextInputFilter", "BrandFilter", "MultipleRangesFilter", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$BrandFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$MultipleRangesFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Filter {

            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0096\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0010HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "items", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter$AspectBrand;", "scrollEnabled", "", "maxRowsCount", "", "totalValuesCount", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getItems", "()Ljava/util/List;", "getScrollEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxRowsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalValuesCount", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter;", "equals", "other", "", "hashCode", "toString", "AspectBrand", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class AspectBrandFilter extends Filter {
                private final AtomActionDTO action;

                @NotNull
                private final List<AspectBrand> items;
                private final Integer maxRowsCount;
                private final ButtonV3DTO rightButton;
                private final IconDTO rightIcon;
                private final Boolean scrollEnabled;
                private final TestInfo testInfo;
                private final String title;
                private final Integer totalValuesCount;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter$AspectBrand;", "", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class AspectBrand {

                    @NotNull
                    private final AtomActionDTO action;

                    @NotNull
                    private final AspectDTO aspect;
                    private final IconDTO icon;
                    private final TestInfo testInfo;

                    @NotNull
                    private final String title;
                    private final Map<String, TokenizedTrackingInfo> trackingInfo;

                    public AspectBrand(@NotNull AspectDTO aspect, IconDTO iconDTO, @NotNull String title, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                        Intrinsics.checkNotNullParameter(aspect, "aspect");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(action, "action");
                        this.aspect = aspect;
                        this.icon = iconDTO;
                        this.title = title;
                        this.action = action;
                        this.trackingInfo = map;
                        this.testInfo = testInfo;
                    }

                    public static /* synthetic */ AspectBrand copy$default(AspectBrand aspectBrand, AspectDTO aspectDTO, IconDTO iconDTO, String str, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            aspectDTO = aspectBrand.aspect;
                        }
                        if ((i11 & 2) != 0) {
                            iconDTO = aspectBrand.icon;
                        }
                        if ((i11 & 4) != 0) {
                            str = aspectBrand.title;
                        }
                        if ((i11 & 8) != 0) {
                            atomActionDTO = aspectBrand.action;
                        }
                        if ((i11 & 16) != 0) {
                            map = aspectBrand.trackingInfo;
                        }
                        if ((i11 & 32) != 0) {
                            testInfo = aspectBrand.testInfo;
                        }
                        Map map2 = map;
                        TestInfo testInfo2 = testInfo;
                        return aspectBrand.copy(aspectDTO, iconDTO, str, atomActionDTO, map2, testInfo2);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final AspectDTO getAspect() {
                        return this.aspect;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final IconDTO getIcon() {
                        return this.icon;
                    }

                    @NotNull
                    /* renamed from: component3, reason: from getter */
                    public final String getTitle() {
                        return this.title;
                    }

                    @NotNull
                    /* renamed from: component4, reason: from getter */
                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final Map<String, TokenizedTrackingInfo> component5() {
                        return this.trackingInfo;
                    }

                    /* renamed from: component6, reason: from getter */
                    public final TestInfo getTestInfo() {
                        return this.testInfo;
                    }

                    @NotNull
                    public final AspectBrand copy(@NotNull AspectDTO aspect, IconDTO icon, @NotNull String title, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                        Intrinsics.checkNotNullParameter(aspect, "aspect");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(action, "action");
                        return new AspectBrand(aspect, icon, title, action, trackingInfo, testInfo);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof AspectBrand)) {
                            return false;
                        }
                        AspectBrand aspectBrand = (AspectBrand) other;
                        return Intrinsics.d(this.aspect, aspectBrand.aspect) && Intrinsics.d(this.icon, aspectBrand.icon) && Intrinsics.d(this.title, aspectBrand.title) && Intrinsics.d(this.action, aspectBrand.action) && Intrinsics.d(this.trackingInfo, aspectBrand.trackingInfo) && Intrinsics.d(this.testInfo, aspectBrand.testInfo);
                    }

                    @NotNull
                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    @NotNull
                    public final AspectDTO getAspect() {
                        return this.aspect;
                    }

                    public final IconDTO getIcon() {
                        return this.icon;
                    }

                    public final TestInfo getTestInfo() {
                        return this.testInfo;
                    }

                    @NotNull
                    public final String getTitle() {
                        return this.title;
                    }

                    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                        return this.trackingInfo;
                    }

                    public int hashCode() {
                        int hashCode = this.aspect.hashCode() * 31;
                        IconDTO iconDTO = this.icon;
                        int b11 = a.b(this.action, g.a((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.title), 31);
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
                        TestInfo testInfo = this.testInfo;
                        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        AspectDTO aspectDTO = this.aspect;
                        IconDTO iconDTO = this.icon;
                        String str = this.title;
                        AtomActionDTO atomActionDTO = this.action;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        TestInfo testInfo = this.testInfo;
                        StringBuilder sb2 = new StringBuilder("AspectBrand(aspect=");
                        sb2.append(aspectDTO);
                        sb2.append(", icon=");
                        sb2.append(iconDTO);
                        sb2.append(", title=");
                        p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
                        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AspectBrandFilter(String str, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, IconDTO iconDTO, @NotNull List<AspectBrand> items, Boolean bool, Integer num, Integer num2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                    super(null);
                    Intrinsics.checkNotNullParameter(items, "items");
                    this.title = str;
                    this.action = atomActionDTO;
                    this.rightButton = buttonV3DTO;
                    this.rightIcon = iconDTO;
                    this.items = items;
                    this.scrollEnabled = bool;
                    this.maxRowsCount = num;
                    this.totalValuesCount = num2;
                    this.trackingInfo = map;
                    this.testInfo = testInfo;
                }

                public static /* synthetic */ AspectBrandFilter copy$default(AspectBrandFilter aspectBrandFilter, String str, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, IconDTO iconDTO, List list, Boolean bool, Integer num, Integer num2, Map map, TestInfo testInfo, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = aspectBrandFilter.title;
                    }
                    if ((i11 & 2) != 0) {
                        atomActionDTO = aspectBrandFilter.action;
                    }
                    if ((i11 & 4) != 0) {
                        buttonV3DTO = aspectBrandFilter.rightButton;
                    }
                    if ((i11 & 8) != 0) {
                        iconDTO = aspectBrandFilter.rightIcon;
                    }
                    if ((i11 & 16) != 0) {
                        list = aspectBrandFilter.items;
                    }
                    if ((i11 & 32) != 0) {
                        bool = aspectBrandFilter.scrollEnabled;
                    }
                    if ((i11 & 64) != 0) {
                        num = aspectBrandFilter.maxRowsCount;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        num2 = aspectBrandFilter.totalValuesCount;
                    }
                    if ((i11 & 256) != 0) {
                        map = aspectBrandFilter.trackingInfo;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        testInfo = aspectBrandFilter.testInfo;
                    }
                    Map map2 = map;
                    TestInfo testInfo2 = testInfo;
                    Integer num3 = num;
                    Integer num4 = num2;
                    List list2 = list;
                    Boolean bool2 = bool;
                    return aspectBrandFilter.copy(str, atomActionDTO, buttonV3DTO, iconDTO, list2, bool2, num3, num4, map2, testInfo2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component10, reason: from getter */
                public final TestInfo getTestInfo() {
                    return this.testInfo;
                }

                /* renamed from: component2, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                /* renamed from: component3, reason: from getter */
                public final ButtonV3DTO getRightButton() {
                    return this.rightButton;
                }

                /* renamed from: component4, reason: from getter */
                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                @NotNull
                public final List<AspectBrand> component5() {
                    return this.items;
                }

                /* renamed from: component6, reason: from getter */
                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                /* renamed from: component7, reason: from getter */
                public final Integer getMaxRowsCount() {
                    return this.maxRowsCount;
                }

                /* renamed from: component8, reason: from getter */
                public final Integer getTotalValuesCount() {
                    return this.totalValuesCount;
                }

                public final Map<String, TokenizedTrackingInfo> component9() {
                    return this.trackingInfo;
                }

                @NotNull
                public final AspectBrandFilter copy(String title, AtomActionDTO action, ButtonV3DTO rightButton, IconDTO rightIcon, @NotNull List<AspectBrand> items, Boolean scrollEnabled, Integer maxRowsCount, Integer totalValuesCount, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    return new AspectBrandFilter(title, action, rightButton, rightIcon, items, scrollEnabled, maxRowsCount, totalValuesCount, trackingInfo, testInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AspectBrandFilter)) {
                        return false;
                    }
                    AspectBrandFilter aspectBrandFilter = (AspectBrandFilter) other;
                    return Intrinsics.d(this.title, aspectBrandFilter.title) && Intrinsics.d(this.action, aspectBrandFilter.action) && Intrinsics.d(this.rightButton, aspectBrandFilter.rightButton) && Intrinsics.d(this.rightIcon, aspectBrandFilter.rightIcon) && Intrinsics.d(this.items, aspectBrandFilter.items) && Intrinsics.d(this.scrollEnabled, aspectBrandFilter.scrollEnabled) && Intrinsics.d(this.maxRowsCount, aspectBrandFilter.maxRowsCount) && Intrinsics.d(this.totalValuesCount, aspectBrandFilter.totalValuesCount) && Intrinsics.d(this.trackingInfo, aspectBrandFilter.trackingInfo) && Intrinsics.d(this.testInfo, aspectBrandFilter.testInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                public final List<AspectBrand> getItems() {
                    return this.items;
                }

                public final Integer getMaxRowsCount() {
                    return this.maxRowsCount;
                }

                public final ButtonV3DTO getRightButton() {
                    return this.rightButton;
                }

                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                public final TestInfo getTestInfo() {
                    return this.testInfo;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final Integer getTotalValuesCount() {
                    return this.totalValuesCount;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.title;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    ButtonV3DTO buttonV3DTO = this.rightButton;
                    int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                    IconDTO iconDTO = this.rightIcon;
                    int b11 = g.b((hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.items);
                    Boolean bool = this.scrollEnabled;
                    int hashCode4 = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Integer num = this.maxRowsCount;
                    int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.totalValuesCount;
                    int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
                    TestInfo testInfo = this.testInfo;
                    return hashCode7 + (testInfo != null ? testInfo.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    AtomActionDTO atomActionDTO = this.action;
                    ButtonV3DTO buttonV3DTO = this.rightButton;
                    IconDTO iconDTO = this.rightIcon;
                    List<AspectBrand> list = this.items;
                    Boolean bool = this.scrollEnabled;
                    Integer num = this.maxRowsCount;
                    Integer num2 = this.totalValuesCount;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    TestInfo testInfo = this.testInfo;
                    StringBuilder c11 = c.c("AspectBrandFilter(title=", str, ", action=", atomActionDTO, ", rightButton=");
                    c11.append(buttonV3DTO);
                    c11.append(", rightIcon=");
                    c11.append(iconDTO);
                    c11.append(", items=");
                    c11.append(list);
                    c11.append(", scrollEnabled=");
                    c11.append(bool);
                    c11.append(", maxRowsCount=");
                    Ef0.c.e(c11, num, ", totalValuesCount=", num2, ", trackingInfo=");
                    return Ns.b.b(", testInfo=", ")", c11, map, testInfo);
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$BrandFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "roundedCells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "bottomCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getRoundedCells", "()Ljava/util/List;", "getBottomCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BrandFilter extends Filter {
                private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter bottomCell;

                @NotNull
                private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells;

                @NotNull
                private final String title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BrandFilter(@NotNull String title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(roundedCells, "roundedCells");
                    this.title = title;
                    this.roundedCells = roundedCells;
                    this.bottomCell = cellWithSubtitleCounter;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ BrandFilter copy$default(BrandFilter brandFilter, String str, List list, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = brandFilter.title;
                    }
                    if ((i11 & 2) != 0) {
                        list = brandFilter.roundedCells;
                    }
                    if ((i11 & 4) != 0) {
                        cellWithSubtitleCounter = brandFilter.bottomCell;
                    }
                    if ((i11 & 8) != 0) {
                        map = brandFilter.trackingInfo;
                    }
                    return brandFilter.copy(str, list, cellWithSubtitleCounter, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> component2() {
                    return this.roundedCells;
                }

                /* renamed from: component3, reason: from getter */
                public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getBottomCell() {
                    return this.bottomCell;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                @NotNull
                public final BrandFilter copy(@NotNull String title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter bottomCell, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(roundedCells, "roundedCells");
                    return new BrandFilter(title, roundedCells, bottomCell, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BrandFilter)) {
                        return false;
                    }
                    BrandFilter brandFilter = (BrandFilter) other;
                    return Intrinsics.d(this.title, brandFilter.title) && Intrinsics.d(this.roundedCells, brandFilter.roundedCells) && Intrinsics.d(this.bottomCell, brandFilter.bottomCell) && Intrinsics.d(this.trackingInfo, brandFilter.trackingInfo);
                }

                public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getBottomCell() {
                    return this.bottomCell;
                }

                @NotNull
                public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> getRoundedCells() {
                    return this.roundedCells;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int b11 = g.b(this.title.hashCode() * 31, 31, this.roundedCells);
                    CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.bottomCell;
                    int hashCode = (b11 + (cellWithSubtitleCounter == null ? 0 : cellWithSubtitleCounter.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list = this.roundedCells;
                    CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.bottomCell;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder f7 = Tl.b.f("BrandFilter(title=", str, ", roundedCells=", ", bottomCell=", list);
                    f7.append(cellWithSubtitleCounter);
                    f7.append(", trackingInfo=");
                    f7.append(map);
                    f7.append(")");
                    return f7.toString();
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", "categories", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Footer;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Footer;)V", "getCategories", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Footer;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Category", "Footer", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class CategoryFilter extends Filter {

                @NotNull
                private final List<Category> categories;
                private final Footer footer;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Category;", "", "level", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "<init>", "(ILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)V", "getLevel", "()I", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Category {

                    @NotNull
                    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell;
                    private final int level;

                    public Category(int i11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell) {
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        this.level = i11;
                        this.cell = cell;
                    }

                    public static /* synthetic */ Category copy$default(Category category, int i11, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            i11 = category.level;
                        }
                        if ((i12 & 2) != 0) {
                            cellWithSubtitleCheckboxRadioCounter = category.cell;
                        }
                        return category.copy(i11, cellWithSubtitleCheckboxRadioCounter);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final int getLevel() {
                        return this.level;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getCell() {
                        return this.cell;
                    }

                    @NotNull
                    public final Category copy(int level, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cell) {
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        return new Category(level, cell);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Category)) {
                            return false;
                        }
                        Category category = (Category) other;
                        return this.level == category.level && Intrinsics.d(this.cell, category.cell);
                    }

                    @NotNull
                    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getCell() {
                        return this.cell;
                    }

                    public final int getLevel() {
                        return this.level;
                    }

                    public int hashCode() {
                        return this.cell.hashCode() + (Integer.hashCode(this.level) * 31);
                    }

                    @NotNull
                    public String toString() {
                        return "Category(level=" + this.level + ", cell=" + this.cell + ")";
                    }
                }

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$CategoryFilter$Footer;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Footer {

                    @NotNull
                    private final ButtonV3Atom.LargeBorderlessButton button;

                    public Footer(@NotNull ButtonV3Atom.LargeBorderlessButton button) {
                        Intrinsics.checkNotNullParameter(button, "button");
                        this.button = button;
                    }

                    public static /* synthetic */ Footer copy$default(Footer footer, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            largeBorderlessButton = footer.button;
                        }
                        return footer.copy(largeBorderlessButton);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final ButtonV3Atom.LargeBorderlessButton getButton() {
                        return this.button;
                    }

                    @NotNull
                    public final Footer copy(@NotNull ButtonV3Atom.LargeBorderlessButton button) {
                        Intrinsics.checkNotNullParameter(button, "button");
                        return new Footer(button);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Footer) && Intrinsics.d(this.button, ((Footer) other).button);
                    }

                    @NotNull
                    public final ButtonV3Atom.LargeBorderlessButton getButton() {
                        return this.button;
                    }

                    public int hashCode() {
                        return this.button.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Footer(button=" + this.button + ")";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CategoryFilter(@NotNull List<Category> categories, Footer footer) {
                    super(null);
                    Intrinsics.checkNotNullParameter(categories, "categories");
                    this.categories = categories;
                    this.footer = footer;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ CategoryFilter copy$default(CategoryFilter categoryFilter, List list, Footer footer, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = categoryFilter.categories;
                    }
                    if ((i11 & 2) != 0) {
                        footer = categoryFilter.footer;
                    }
                    return categoryFilter.copy(list, footer);
                }

                @NotNull
                public final List<Category> component1() {
                    return this.categories;
                }

                /* renamed from: component2, reason: from getter */
                public final Footer getFooter() {
                    return this.footer;
                }

                @NotNull
                public final CategoryFilter copy(@NotNull List<Category> categories, Footer footer) {
                    Intrinsics.checkNotNullParameter(categories, "categories");
                    return new CategoryFilter(categories, footer);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CategoryFilter)) {
                        return false;
                    }
                    CategoryFilter categoryFilter = (CategoryFilter) other;
                    return Intrinsics.d(this.categories, categoryFilter.categories) && Intrinsics.d(this.footer, categoryFilter.footer);
                }

                @NotNull
                public final List<Category> getCategories() {
                    return this.categories;
                }

                public final Footer getFooter() {
                    return this.footer;
                }

                public int hashCode() {
                    int hashCode = this.categories.hashCode() * 31;
                    Footer footer = this.footer;
                    return hashCode + (footer == null ? 0 : footer.hashCode());
                }

                @NotNull
                public String toString() {
                    return "CategoryFilter(categories=" + this.categories + ", footer=" + this.footer + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003J¤\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00152\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006?"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rightButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "colors", "", "Lru/ozon/app/android/atoms/data/color/ColorAtom;", "colorIcons", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "colorAspects", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "scrollEnabled", "", "rightIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getColors", "()Ljava/util/List;", "getColorIcons", "getColorAspects", "getScrollEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$ColorFilter;", "equals", "other", "", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ColorFilter extends Filter {
                private final AtomActionDTO action;
                private final List<ColorAspect> colorAspects;
                private final List<ColorIcon> colorIcons;
                private final List<ColorAtom> colors;
                private final Icon icon;
                private final ButtonV3Atom.LargeBorderlessButton rightButton;
                private final IconDTO rightIcon;
                private final Boolean scrollEnabled;
                private final String title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public ColorFilter(String str, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List<ColorAtom> list, List<ColorIcon> list2, List<ColorAspect> list3, Boolean bool, IconDTO iconDTO) {
                    super(null);
                    this.title = str;
                    this.icon = icon;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                    this.rightButton = largeBorderlessButton;
                    this.colors = list;
                    this.colorIcons = list2;
                    this.colorAspects = list3;
                    this.scrollEnabled = bool;
                    this.rightIcon = iconDTO;
                }

                public static /* synthetic */ ColorFilter copy$default(ColorFilter colorFilter, String str, Icon icon, AtomActionDTO atomActionDTO, Map map, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List list, List list2, List list3, Boolean bool, IconDTO iconDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = colorFilter.title;
                    }
                    if ((i11 & 2) != 0) {
                        icon = colorFilter.icon;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = colorFilter.action;
                    }
                    if ((i11 & 8) != 0) {
                        map = colorFilter.trackingInfo;
                    }
                    if ((i11 & 16) != 0) {
                        largeBorderlessButton = colorFilter.rightButton;
                    }
                    if ((i11 & 32) != 0) {
                        list = colorFilter.colors;
                    }
                    if ((i11 & 64) != 0) {
                        list2 = colorFilter.colorIcons;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        list3 = colorFilter.colorAspects;
                    }
                    if ((i11 & 256) != 0) {
                        bool = colorFilter.scrollEnabled;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        iconDTO = colorFilter.rightIcon;
                    }
                    Boolean bool2 = bool;
                    IconDTO iconDTO2 = iconDTO;
                    List list4 = list2;
                    List list5 = list3;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = largeBorderlessButton;
                    List list6 = list;
                    return colorFilter.copy(str, icon, atomActionDTO, map, largeBorderlessButton2, list6, list4, list5, bool2, iconDTO2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component10, reason: from getter */
                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                /* renamed from: component2, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                /* renamed from: component5, reason: from getter */
                public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                    return this.rightButton;
                }

                public final List<ColorAtom> component6() {
                    return this.colors;
                }

                public final List<ColorIcon> component7() {
                    return this.colorIcons;
                }

                public final List<ColorAspect> component8() {
                    return this.colorAspects;
                }

                /* renamed from: component9, reason: from getter */
                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                @NotNull
                public final ColorFilter copy(String title, Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, ButtonV3Atom.LargeBorderlessButton rightButton, List<ColorAtom> colors, List<ColorIcon> colorIcons, List<ColorAspect> colorAspects, Boolean scrollEnabled, IconDTO rightIcon) {
                    return new ColorFilter(title, icon, action, trackingInfo, rightButton, colors, colorIcons, colorAspects, scrollEnabled, rightIcon);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ColorFilter)) {
                        return false;
                    }
                    ColorFilter colorFilter = (ColorFilter) other;
                    return Intrinsics.d(this.title, colorFilter.title) && Intrinsics.d(this.icon, colorFilter.icon) && Intrinsics.d(this.action, colorFilter.action) && Intrinsics.d(this.trackingInfo, colorFilter.trackingInfo) && Intrinsics.d(this.rightButton, colorFilter.rightButton) && Intrinsics.d(this.colors, colorFilter.colors) && Intrinsics.d(this.colorIcons, colorFilter.colorIcons) && Intrinsics.d(this.colorAspects, colorFilter.colorAspects) && Intrinsics.d(this.scrollEnabled, colorFilter.scrollEnabled) && Intrinsics.d(this.rightIcon, colorFilter.rightIcon);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final List<ColorAspect> getColorAspects() {
                    return this.colorAspects;
                }

                public final List<ColorIcon> getColorIcons() {
                    return this.colorIcons;
                }

                public final List<ColorAtom> getColors() {
                    return this.colors;
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                    return this.rightButton;
                }

                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.title;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Icon icon = this.icon;
                    int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
                    int hashCode5 = (hashCode4 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
                    List<ColorAtom> list = this.colors;
                    int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
                    List<ColorIcon> list2 = this.colorIcons;
                    int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    List<ColorAspect> list3 = this.colorAspects;
                    int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
                    Boolean bool = this.scrollEnabled;
                    int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
                    IconDTO iconDTO = this.rightIcon;
                    return hashCode9 + (iconDTO != null ? iconDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    Icon icon = this.icon;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
                    List<ColorAtom> list = this.colors;
                    List<ColorIcon> list2 = this.colorIcons;
                    List<ColorAspect> list3 = this.colorAspects;
                    Boolean bool = this.scrollEnabled;
                    IconDTO iconDTO = this.rightIcon;
                    StringBuilder sb2 = new StringBuilder("ColorFilter(title=");
                    sb2.append(str);
                    sb2.append(", icon=");
                    sb2.append(icon);
                    sb2.append(", action=");
                    b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", rightButton=");
                    sb2.append(largeBorderlessButton);
                    sb2.append(", colors=");
                    sb2.append(list);
                    sb2.append(", colorIcons=");
                    C2616s.g(", colorAspects=", ", scrollEnabled=", sb2, list2, list3);
                    sb2.append(bool);
                    sb2.append(", rightIcon=");
                    sb2.append(iconDTO);
                    sb2.append(")");
                    return sb2.toString();
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$MultipleRangesFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", "tagFilter", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "rangeFilter", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;)V", "getTagFilter", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "getRangeFilter", "()Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class MultipleRangesFilter extends Filter {
                private final RangeFilter rangeFilter;
                private final TagFilter tagFilter;

                public MultipleRangesFilter(TagFilter tagFilter, RangeFilter rangeFilter) {
                    super(null);
                    this.tagFilter = tagFilter;
                    this.rangeFilter = rangeFilter;
                }

                public static /* synthetic */ MultipleRangesFilter copy$default(MultipleRangesFilter multipleRangesFilter, TagFilter tagFilter, RangeFilter rangeFilter, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        tagFilter = multipleRangesFilter.tagFilter;
                    }
                    if ((i11 & 2) != 0) {
                        rangeFilter = multipleRangesFilter.rangeFilter;
                    }
                    return multipleRangesFilter.copy(tagFilter, rangeFilter);
                }

                /* renamed from: component1, reason: from getter */
                public final TagFilter getTagFilter() {
                    return this.tagFilter;
                }

                /* renamed from: component2, reason: from getter */
                public final RangeFilter getRangeFilter() {
                    return this.rangeFilter;
                }

                @NotNull
                public final MultipleRangesFilter copy(TagFilter tagFilter, RangeFilter rangeFilter) {
                    return new MultipleRangesFilter(tagFilter, rangeFilter);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MultipleRangesFilter)) {
                        return false;
                    }
                    MultipleRangesFilter multipleRangesFilter = (MultipleRangesFilter) other;
                    return Intrinsics.d(this.tagFilter, multipleRangesFilter.tagFilter) && Intrinsics.d(this.rangeFilter, multipleRangesFilter.rangeFilter);
                }

                public final RangeFilter getRangeFilter() {
                    return this.rangeFilter;
                }

                public final TagFilter getTagFilter() {
                    return this.tagFilter;
                }

                public int hashCode() {
                    TagFilter tagFilter = this.tagFilter;
                    int hashCode = (tagFilter == null ? 0 : tagFilter.hashCode()) * 31;
                    RangeFilter rangeFilter = this.rangeFilter;
                    return hashCode + (rangeFilter != null ? rangeFilter.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "MultipleRangesFilter(tagFilter=" + this.tagFilter + ", rangeFilter=" + this.rangeFilter + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J¢\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0016HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-¨\u0006B"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rightButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "tags", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hideSeparator", "", "rightIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "scrollEnabled", "maxRowsCount", "", "totalValuesCount", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getTags", "()Ljava/util/List;", "getHideSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getScrollEnabled", "getMaxRowsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalValuesCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TagFilter;", "equals", "other", "", "hashCode", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TagFilter extends Filter {
                private final AtomActionDTO action;
                private final Boolean hideSeparator;
                private final Icon icon;
                private final Integer maxRowsCount;
                private final ButtonV3Atom.LargeBorderlessButton rightButton;
                private final IconDTO rightIcon;
                private final Boolean scrollEnabled;

                @NotNull
                private final List<AtomDTO> tags;
                private final String title;
                private final Integer totalValuesCount;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public TagFilter(String str, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tag", type = TagV3Atom.TagAtom.class), @ProtoOneOfSignature(name = "crossTag", type = TagV3Atom.CrossTagAtom.class), @ProtoOneOfSignature(name = "crossColorTag", type = TagV3Atom.CrossColorTagAtom.class), @ProtoOneOfSignature(name = "buttonTag", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> tags, Boolean bool, IconDTO iconDTO, Boolean bool2, Integer num, Integer num2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(tags, "tags");
                    this.title = str;
                    this.icon = icon;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                    this.rightButton = largeBorderlessButton;
                    this.tags = tags;
                    this.hideSeparator = bool;
                    this.rightIcon = iconDTO;
                    this.scrollEnabled = bool2;
                    this.maxRowsCount = num;
                    this.totalValuesCount = num2;
                }

                public static /* synthetic */ TagFilter copy$default(TagFilter tagFilter, String str, Icon icon, AtomActionDTO atomActionDTO, Map map, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, List list, Boolean bool, IconDTO iconDTO, Boolean bool2, Integer num, Integer num2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = tagFilter.title;
                    }
                    if ((i11 & 2) != 0) {
                        icon = tagFilter.icon;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = tagFilter.action;
                    }
                    if ((i11 & 8) != 0) {
                        map = tagFilter.trackingInfo;
                    }
                    if ((i11 & 16) != 0) {
                        largeBorderlessButton = tagFilter.rightButton;
                    }
                    if ((i11 & 32) != 0) {
                        list = tagFilter.tags;
                    }
                    if ((i11 & 64) != 0) {
                        bool = tagFilter.hideSeparator;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        iconDTO = tagFilter.rightIcon;
                    }
                    if ((i11 & 256) != 0) {
                        bool2 = tagFilter.scrollEnabled;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        num = tagFilter.maxRowsCount;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        num2 = tagFilter.totalValuesCount;
                    }
                    Integer num3 = num;
                    Integer num4 = num2;
                    IconDTO iconDTO2 = iconDTO;
                    Boolean bool3 = bool2;
                    List list2 = list;
                    Boolean bool4 = bool;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2 = largeBorderlessButton;
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    return tagFilter.copy(str, icon, atomActionDTO2, map, largeBorderlessButton2, list2, bool4, iconDTO2, bool3, num3, num4);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component10, reason: from getter */
                public final Integer getMaxRowsCount() {
                    return this.maxRowsCount;
                }

                /* renamed from: component11, reason: from getter */
                public final Integer getTotalValuesCount() {
                    return this.totalValuesCount;
                }

                /* renamed from: component2, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component4() {
                    return this.trackingInfo;
                }

                /* renamed from: component5, reason: from getter */
                public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                    return this.rightButton;
                }

                @NotNull
                public final List<AtomDTO> component6() {
                    return this.tags;
                }

                /* renamed from: component7, reason: from getter */
                public final Boolean getHideSeparator() {
                    return this.hideSeparator;
                }

                /* renamed from: component8, reason: from getter */
                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                /* renamed from: component9, reason: from getter */
                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                @NotNull
                public final TagFilter copy(String title, Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, ButtonV3Atom.LargeBorderlessButton rightButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tag", type = TagV3Atom.TagAtom.class), @ProtoOneOfSignature(name = "crossTag", type = TagV3Atom.CrossTagAtom.class), @ProtoOneOfSignature(name = "crossColorTag", type = TagV3Atom.CrossColorTagAtom.class), @ProtoOneOfSignature(name = "buttonTag", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> tags, Boolean hideSeparator, IconDTO rightIcon, Boolean scrollEnabled, Integer maxRowsCount, Integer totalValuesCount) {
                    Intrinsics.checkNotNullParameter(tags, "tags");
                    return new TagFilter(title, icon, action, trackingInfo, rightButton, tags, hideSeparator, rightIcon, scrollEnabled, maxRowsCount, totalValuesCount);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TagFilter)) {
                        return false;
                    }
                    TagFilter tagFilter = (TagFilter) other;
                    return Intrinsics.d(this.title, tagFilter.title) && Intrinsics.d(this.icon, tagFilter.icon) && Intrinsics.d(this.action, tagFilter.action) && Intrinsics.d(this.trackingInfo, tagFilter.trackingInfo) && Intrinsics.d(this.rightButton, tagFilter.rightButton) && Intrinsics.d(this.tags, tagFilter.tags) && Intrinsics.d(this.hideSeparator, tagFilter.hideSeparator) && Intrinsics.d(this.rightIcon, tagFilter.rightIcon) && Intrinsics.d(this.scrollEnabled, tagFilter.scrollEnabled) && Intrinsics.d(this.maxRowsCount, tagFilter.maxRowsCount) && Intrinsics.d(this.totalValuesCount, tagFilter.totalValuesCount);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Boolean getHideSeparator() {
                    return this.hideSeparator;
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                public final Integer getMaxRowsCount() {
                    return this.maxRowsCount;
                }

                public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                    return this.rightButton;
                }

                public final IconDTO getRightIcon() {
                    return this.rightIcon;
                }

                public final Boolean getScrollEnabled() {
                    return this.scrollEnabled;
                }

                @NotNull
                public final List<AtomDTO> getTags() {
                    return this.tags;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final Integer getTotalValuesCount() {
                    return this.totalValuesCount;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.title;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Icon icon = this.icon;
                    int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
                    int b11 = g.b((hashCode4 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31, 31, this.tags);
                    Boolean bool = this.hideSeparator;
                    int hashCode5 = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
                    IconDTO iconDTO = this.rightIcon;
                    int hashCode6 = (hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                    Boolean bool2 = this.scrollEnabled;
                    int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num = this.maxRowsCount;
                    int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.totalValuesCount;
                    return hashCode8 + (num2 != null ? num2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    Icon icon = this.icon;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
                    List<AtomDTO> list = this.tags;
                    Boolean bool = this.hideSeparator;
                    IconDTO iconDTO = this.rightIcon;
                    Boolean bool2 = this.scrollEnabled;
                    Integer num = this.maxRowsCount;
                    Integer num2 = this.totalValuesCount;
                    StringBuilder sb2 = new StringBuilder("TagFilter(title=");
                    sb2.append(str);
                    sb2.append(", icon=");
                    sb2.append(icon);
                    sb2.append(", action=");
                    b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", rightButton=");
                    sb2.append(largeBorderlessButton);
                    sb2.append(", tags=");
                    sb2.append(list);
                    sb2.append(", hideSeparator=");
                    sb2.append(bool);
                    sb2.append(", rightIcon=");
                    sb2.append(iconDTO);
                    sb2.append(", scrollEnabled=");
                    e.d(bool2, num, ", maxRowsCount=", ", totalValuesCount=", sb2);
                    return Ep.a.c(sb2, num2, ")");
                }
            }

            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "input", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter$Input;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter$Input;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getInput", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter$Input;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Input", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class TextInputFilter extends Filter {
                private final AtomActionDTO action;
                private final Icon icon;

                @NotNull
                private final Input input;
                private final String title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$TextInputFilter$Input;", "", HammersV3BodyDTO.PLACEHOLDER, "", "prefix", AppMeasurementSdk.ConditionalUserProperty.VALUE, "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPlaceholder", "()Ljava/lang/String;", "getPrefix", "getValue", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Input {
                    private final AtomActionDTO action;
                    private final String placeholder;
                    private final String prefix;
                    private final Map<String, TokenizedTrackingInfo> trackingInfo;
                    private final String value;

                    public Input(String str, String str2, String str3, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                        this.placeholder = str;
                        this.prefix = str2;
                        this.value = str3;
                        this.action = atomActionDTO;
                        this.trackingInfo = map;
                    }

                    public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = input.placeholder;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = input.prefix;
                        }
                        if ((i11 & 4) != 0) {
                            str3 = input.value;
                        }
                        if ((i11 & 8) != 0) {
                            atomActionDTO = input.action;
                        }
                        if ((i11 & 16) != 0) {
                            map = input.trackingInfo;
                        }
                        Map map2 = map;
                        String str4 = str3;
                        return input.copy(str, str2, str4, atomActionDTO, map2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getPlaceholder() {
                        return this.placeholder;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getPrefix() {
                        return this.prefix;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final String getValue() {
                        return this.value;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final Map<String, TokenizedTrackingInfo> component5() {
                        return this.trackingInfo;
                    }

                    @NotNull
                    public final Input copy(String placeholder, String prefix, String value, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                        return new Input(placeholder, prefix, value, action, trackingInfo);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Input)) {
                            return false;
                        }
                        Input input = (Input) other;
                        return Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.prefix, input.prefix) && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.action, input.action) && Intrinsics.d(this.trackingInfo, input.trackingInfo);
                    }

                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final String getPlaceholder() {
                        return this.placeholder;
                    }

                    public final String getPrefix() {
                        return this.prefix;
                    }

                    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                        return this.trackingInfo;
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        String str = this.placeholder;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.prefix;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.value;
                        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        AtomActionDTO atomActionDTO = this.action;
                        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        return hashCode4 + (map != null ? map.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        String str = this.placeholder;
                        String str2 = this.prefix;
                        String str3 = this.value;
                        AtomActionDTO atomActionDTO = this.action;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        StringBuilder d11 = C3660k.d("Input(placeholder=", str, ", prefix=", str2, ", value=");
                        p.c(str3, ", action=", ", trackingInfo=", d11, atomActionDTO);
                        return P.f(d11, map, ")");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextInputFilter(String str, Icon icon, AtomActionDTO atomActionDTO, @NotNull Input input, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(input, "input");
                    this.title = str;
                    this.icon = icon;
                    this.action = atomActionDTO;
                    this.input = input;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ TextInputFilter copy$default(TextInputFilter textInputFilter, String str, Icon icon, AtomActionDTO atomActionDTO, Input input, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = textInputFilter.title;
                    }
                    if ((i11 & 2) != 0) {
                        icon = textInputFilter.icon;
                    }
                    if ((i11 & 4) != 0) {
                        atomActionDTO = textInputFilter.action;
                    }
                    if ((i11 & 8) != 0) {
                        input = textInputFilter.input;
                    }
                    if ((i11 & 16) != 0) {
                        map = textInputFilter.trackingInfo;
                    }
                    Map map2 = map;
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    return textInputFilter.copy(str, icon, atomActionDTO2, input, map2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                /* renamed from: component3, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final Input getInput() {
                    return this.input;
                }

                public final Map<String, TokenizedTrackingInfo> component5() {
                    return this.trackingInfo;
                }

                @NotNull
                public final TextInputFilter copy(String title, Icon icon, AtomActionDTO action, @NotNull Input input, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    return new TextInputFilter(title, icon, action, input, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TextInputFilter)) {
                        return false;
                    }
                    TextInputFilter textInputFilter = (TextInputFilter) other;
                    return Intrinsics.d(this.title, textInputFilter.title) && Intrinsics.d(this.icon, textInputFilter.icon) && Intrinsics.d(this.action, textInputFilter.action) && Intrinsics.d(this.input, textInputFilter.input) && Intrinsics.d(this.trackingInfo, textInputFilter.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                @NotNull
                public final Input getInput() {
                    return this.input;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.title;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Icon icon = this.icon;
                    int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode3 = (this.input.hashCode() + ((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode3 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    Icon icon = this.icon;
                    AtomActionDTO atomActionDTO = this.action;
                    Input input = this.input;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("TextInputFilter(title=");
                    sb2.append(str);
                    sb2.append(", icon=");
                    sb2.append(icon);
                    sb2.append(", action=");
                    sb2.append(atomActionDTO);
                    sb2.append(", input=");
                    sb2.append(input);
                    sb2.append(", trackingInfo=");
                    return P.f(sb2, map, ")");
                }
            }

            public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Filter() {
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "rightButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Ljava/lang/String;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getRightButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {
            private final ButtonV3Atom.LargeButton largeButton;
            private final ButtonV3Atom.LargeBorderlessButton rightButton;

            @NotNull
            private final String title;

            public Header(@NotNull String title, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.largeButton = largeButton;
                this.rightButton = largeBorderlessButton;
            }

            public static /* synthetic */ Header copy$default(Header header, String str, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = header.title;
                }
                if ((i11 & 2) != 0) {
                    largeButton = header.largeButton;
                }
                if ((i11 & 4) != 0) {
                    largeBorderlessButton = header.rightButton;
                }
                return header.copy(str, largeButton, largeBorderlessButton);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final ButtonV3Atom.LargeButton getLargeButton() {
                return this.largeButton;
            }

            /* renamed from: component3, reason: from getter */
            public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                return this.rightButton;
            }

            @NotNull
            public final Header copy(@NotNull String title, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeBorderlessButton rightButton) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Header(title, largeButton, rightButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.largeButton, header.largeButton) && Intrinsics.d(this.rightButton, header.rightButton);
            }

            public final ButtonV3Atom.LargeButton getLargeButton() {
                return this.largeButton;
            }

            public final ButtonV3Atom.LargeBorderlessButton getRightButton() {
                return this.rightButton;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                ButtonV3Atom.LargeButton largeButton = this.largeButton;
                int hashCode2 = (hashCode + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
                ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.rightButton;
                return hashCode2 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Header(title=" + this.title + ", largeButton=" + this.largeButton + ", rightButton=" + this.rightButton + ")";
            }
        }

        public Section(Header header, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tagFilter", type = Filter.TagFilter.class), @ProtoOneOfSignature(name = "categoryFilter", type = Filter.CategoryFilter.class), @ProtoOneOfSignature(name = "colorFilter", type = Filter.ColorFilter.class), @ProtoOneOfSignature(name = "rangeFilter", type = RangeFilter.class), @ProtoOneOfSignature(name = "timeRangeFilter", type = TimeRangeFilter.class), @ProtoOneOfSignature(name = "openRangeFilter", type = OpenRangeFilter.class), @ProtoOneOfSignature(name = "cellWithSubtitleToggleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class), @ProtoOneOfSignature(name = "textInputFilter", type = Filter.TextInputFilter.class), @ProtoOneOfSignature(name = "brandFilter", type = Filter.BrandFilter.class), @ProtoOneOfSignature(name = "multipleRangesFilter", type = Filter.MultipleRangesFilter.class), @ProtoOneOfSignature(name = "aspectFilter", type = Filter.AspectBrandFilter.class)}) @ProtoOneOf(label = "type") List<? extends Object> list) {
            this.header = header;
            this.filters = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, Header header, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                header = section.header;
            }
            if ((i11 & 2) != 0) {
                list = section.filters;
            }
            return section.copy(header, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        public final List<Object> component2() {
            return this.filters;
        }

        @NotNull
        public final Section copy(Header header, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tagFilter", type = Filter.TagFilter.class), @ProtoOneOfSignature(name = "categoryFilter", type = Filter.CategoryFilter.class), @ProtoOneOfSignature(name = "colorFilter", type = Filter.ColorFilter.class), @ProtoOneOfSignature(name = "rangeFilter", type = RangeFilter.class), @ProtoOneOfSignature(name = "timeRangeFilter", type = TimeRangeFilter.class), @ProtoOneOfSignature(name = "openRangeFilter", type = OpenRangeFilter.class), @ProtoOneOfSignature(name = "cellWithSubtitleToggleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggleCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter.class), @ProtoOneOfSignature(name = "textInputFilter", type = Filter.TextInputFilter.class), @ProtoOneOfSignature(name = "brandFilter", type = Filter.BrandFilter.class), @ProtoOneOfSignature(name = "multipleRangesFilter", type = Filter.MultipleRangesFilter.class), @ProtoOneOfSignature(name = "aspectFilter", type = Filter.AspectBrandFilter.class)}) @ProtoOneOf(label = "type") List<? extends Object> filters) {
            return new Section(header, filters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.d(this.header, section.header) && Intrinsics.d(this.filters, section.filters);
        }

        public final List<Object> getFilters() {
            return this.filters;
        }

        public final Header getHeader() {
            return this.header;
        }

        public int hashCode() {
            Header header = this.header;
            int hashCode = (header == null ? 0 : header.hashCode()) * 31;
            List<Object> list = this.filters;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Section(header=" + this.header + ", filters=" + this.filters + ")";
        }
    }

    public FiltersDTO(@NotNull String originalUrl, @NotNull NavBar navBar, @NotNull List<Section> sections, @NotNull ButtonV3Atom.LargeButton closeApplyButton) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(closeApplyButton, "closeApplyButton");
        this.originalUrl = originalUrl;
        this.navBar = navBar;
        this.sections = sections;
        this.closeApplyButton = closeApplyButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiltersDTO copy$default(FiltersDTO filtersDTO, String str, NavBar navBar, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = filtersDTO.originalUrl;
        }
        if ((i11 & 2) != 0) {
            navBar = filtersDTO.navBar;
        }
        if ((i11 & 4) != 0) {
            list = filtersDTO.sections;
        }
        if ((i11 & 8) != 0) {
            largeButton = filtersDTO.closeApplyButton;
        }
        return filtersDTO.copy(str, navBar, list, largeButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavBar getNavBar() {
        return this.navBar;
    }

    @NotNull
    public final List<Section> component3() {
        return this.sections;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getCloseApplyButton() {
        return this.closeApplyButton;
    }

    @NotNull
    public final FiltersDTO copy(@NotNull String originalUrl, @NotNull NavBar navBar, @NotNull List<Section> sections, @NotNull ButtonV3Atom.LargeButton closeApplyButton) {
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(closeApplyButton, "closeApplyButton");
        return new FiltersDTO(originalUrl, navBar, sections, closeApplyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersDTO)) {
            return false;
        }
        FiltersDTO filtersDTO = (FiltersDTO) other;
        return Intrinsics.d(this.originalUrl, filtersDTO.originalUrl) && Intrinsics.d(this.navBar, filtersDTO.navBar) && Intrinsics.d(this.sections, filtersDTO.sections) && Intrinsics.d(this.closeApplyButton, filtersDTO.closeApplyButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getCloseApplyButton() {
        return this.closeApplyButton;
    }

    @NotNull
    public final NavBar getNavBar() {
        return this.navBar;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.closeApplyButton.hashCode() + g.b((this.navBar.hashCode() + (this.originalUrl.hashCode() * 31)) * 31, 31, this.sections);
    }

    @NotNull
    public String toString() {
        return "FiltersDTO(originalUrl=" + this.originalUrl + ", navBar=" + this.navBar + ", sections=" + this.sections + ", closeApplyButton=" + this.closeApplyButton + ")";
    }
}
