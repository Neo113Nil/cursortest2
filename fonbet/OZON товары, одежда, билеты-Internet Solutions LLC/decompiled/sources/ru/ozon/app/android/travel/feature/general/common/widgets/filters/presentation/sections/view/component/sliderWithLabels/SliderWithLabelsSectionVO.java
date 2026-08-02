package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels;

import B0.C2454a;
import B90.C2618u;
import G.g;
import Pk0.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "thereInputs", "backInputs", "<init>", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Ljava/util/List;", "getThereInputs", "()Ljava/util/List;", "getBackInputs", "SliderWithLabelsControlVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SliderWithLabelsSectionVO {

    @NotNull
    private final List<SliderWithLabelsControlVO> backInputs;
    private final TabsDTO tabs;

    @NotNull
    private final List<SliderWithLabelsControlVO> thereInputs;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b#\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "badge", "", "badgeTextTemplate", "badgeTextMask", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "sliderWithLabels", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Ljava/lang/String;", "getBadgeTextTemplate", "getBadgeTextMask", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "getSliderWithLabels", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "SliderWithLabelsVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SliderWithLabelsControlVO {

        @NotNull
        private final TagButtonDTO badge;
        private final String badgeTextMask;

        @NotNull
        private final String badgeTextTemplate;
        private final CommonControlSettings common;
        private final int id;

        @NotNull
        private final SliderWithLabelsVO sliderWithLabels;

        @NotNull
        private final TextDTO title;

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "", "", "isInRangeMode", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "points", "", "min", "max", "initialMinValue", "initialMaxValue", "", "step", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "actionTokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "sliderSelectAction", "<init>", "(ZLjava/util/List;FFFFILru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction$Refresh;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "F", "getMin", "()F", "getMax", "getInitialMinValue", "getInitialMaxValue", "I", "getStep", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "LWZ/t;", "getActionTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "getSliderSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SliderWithLabelsVO {
            private final t actionTokenizedEvent;
            private final CommonControlSettings common;
            private final float initialMaxValue;
            private final float initialMinValue;
            private final boolean isInRangeMode;
            private final float max;
            private final float min;

            @NotNull
            private final List<FilterSeekbar.Label> points;
            private final AtomAction.Refresh sliderSelectAction;
            private final int step;

            public SliderWithLabelsVO(boolean z11, @NotNull List<FilterSeekbar.Label> points, float f7, float f11, float f12, float f13, int i11, CommonControlSettings commonControlSettings, t tVar, AtomAction.Refresh refresh) {
                Intrinsics.checkNotNullParameter(points, "points");
                this.isInRangeMode = z11;
                this.points = points;
                this.min = f7;
                this.max = f11;
                this.initialMinValue = f12;
                this.initialMaxValue = f13;
                this.step = i11;
                this.common = commonControlSettings;
                this.actionTokenizedEvent = tVar;
                this.sliderSelectAction = refresh;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SliderWithLabelsVO)) {
                    return false;
                }
                SliderWithLabelsVO sliderWithLabelsVO = (SliderWithLabelsVO) other;
                return this.isInRangeMode == sliderWithLabelsVO.isInRangeMode && Intrinsics.d(this.points, sliderWithLabelsVO.points) && Float.compare(this.min, sliderWithLabelsVO.min) == 0 && Float.compare(this.max, sliderWithLabelsVO.max) == 0 && Float.compare(this.initialMinValue, sliderWithLabelsVO.initialMinValue) == 0 && Float.compare(this.initialMaxValue, sliderWithLabelsVO.initialMaxValue) == 0 && this.step == sliderWithLabelsVO.step && Intrinsics.d(this.common, sliderWithLabelsVO.common) && Intrinsics.d(this.actionTokenizedEvent, sliderWithLabelsVO.actionTokenizedEvent) && Intrinsics.d(this.sliderSelectAction, sliderWithLabelsVO.sliderSelectAction);
            }

            public final t getActionTokenizedEvent() {
                return this.actionTokenizedEvent;
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            public final float getInitialMaxValue() {
                return this.initialMaxValue;
            }

            public final float getInitialMinValue() {
                return this.initialMinValue;
            }

            public final float getMax() {
                return this.max;
            }

            public final float getMin() {
                return this.min;
            }

            @NotNull
            public final List<FilterSeekbar.Label> getPoints() {
                return this.points;
            }

            public final AtomAction.Refresh getSliderSelectAction() {
                return this.sliderSelectAction;
            }

            public final int getStep() {
                return this.step;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.step, b.a(this.initialMaxValue, b.a(this.initialMinValue, b.a(this.max, b.a(this.min, g.b(Boolean.hashCode(this.isInRangeMode) * 31, 31, this.points), 31), 31), 31), 31), 31);
                CommonControlSettings commonControlSettings = this.common;
                int hashCode = (a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
                t tVar = this.actionTokenizedEvent;
                int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
                AtomAction.Refresh refresh = this.sliderSelectAction;
                return hashCode2 + (refresh != null ? refresh.hashCode() : 0);
            }

            /* renamed from: isInRangeMode, reason: from getter */
            public final boolean getIsInRangeMode() {
                return this.isInRangeMode;
            }

            @NotNull
            public String toString() {
                return "SliderWithLabelsVO(isInRangeMode=" + this.isInRangeMode + ", points=" + this.points + ", min=" + this.min + ", max=" + this.max + ", initialMinValue=" + this.initialMinValue + ", initialMaxValue=" + this.initialMaxValue + ", step=" + this.step + ", common=" + this.common + ", actionTokenizedEvent=" + this.actionTokenizedEvent + ", sliderSelectAction=" + this.sliderSelectAction + ")";
            }
        }

        public SliderWithLabelsControlVO(int i11, @NotNull TextDTO title, @NotNull TagButtonDTO badge, @NotNull String badgeTextTemplate, String str, @NotNull SliderWithLabelsVO sliderWithLabels, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(badgeTextTemplate, "badgeTextTemplate");
            Intrinsics.checkNotNullParameter(sliderWithLabels, "sliderWithLabels");
            this.id = i11;
            this.title = title;
            this.badge = badge;
            this.badgeTextTemplate = badgeTextTemplate;
            this.badgeTextMask = str;
            this.sliderWithLabels = sliderWithLabels;
            this.common = commonControlSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SliderWithLabelsControlVO)) {
                return false;
            }
            SliderWithLabelsControlVO sliderWithLabelsControlVO = (SliderWithLabelsControlVO) other;
            return this.id == sliderWithLabelsControlVO.id && Intrinsics.d(this.title, sliderWithLabelsControlVO.title) && Intrinsics.d(this.badge, sliderWithLabelsControlVO.badge) && Intrinsics.d(this.badgeTextTemplate, sliderWithLabelsControlVO.badgeTextTemplate) && Intrinsics.d(this.badgeTextMask, sliderWithLabelsControlVO.badgeTextMask) && Intrinsics.d(this.sliderWithLabels, sliderWithLabelsControlVO.sliderWithLabels) && Intrinsics.d(this.common, sliderWithLabelsControlVO.common);
        }

        @NotNull
        public final TagButtonDTO getBadge() {
            return this.badge;
        }

        public final String getBadgeTextMask() {
            return this.badgeTextMask;
        }

        @NotNull
        public final String getBadgeTextTemplate() {
            return this.badgeTextTemplate;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final SliderWithLabelsVO getSliderWithLabels() {
            return this.sliderWithLabels;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a((this.badge.hashCode() + Ns.b.a(this.title, Integer.hashCode(this.id) * 31, 31)) * 31, 31, this.badgeTextTemplate);
            String str = this.badgeTextMask;
            int hashCode = (this.sliderWithLabels.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TagButtonDTO tagButtonDTO = this.badge;
            String str = this.badgeTextTemplate;
            String str2 = this.badgeTextMask;
            SliderWithLabelsVO sliderWithLabelsVO = this.sliderWithLabels;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder b11 = C4055a.b(textDTO, "SliderWithLabelsControlVO(id=", ", title=", ", badge=", i11);
            b11.append(tagButtonDTO);
            b11.append(", badgeTextTemplate=");
            b11.append(str);
            b11.append(", badgeTextMask=");
            b11.append(str2);
            b11.append(", sliderWithLabels=");
            b11.append(sliderWithLabelsVO);
            b11.append(", common=");
            return Ak.b.g(b11, commonControlSettings, ")");
        }
    }

    public SliderWithLabelsSectionVO(TabsDTO tabsDTO, @NotNull List<SliderWithLabelsControlVO> thereInputs, @NotNull List<SliderWithLabelsControlVO> backInputs) {
        Intrinsics.checkNotNullParameter(thereInputs, "thereInputs");
        Intrinsics.checkNotNullParameter(backInputs, "backInputs");
        this.tabs = tabsDTO;
        this.thereInputs = thereInputs;
        this.backInputs = backInputs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderWithLabelsSectionVO)) {
            return false;
        }
        SliderWithLabelsSectionVO sliderWithLabelsSectionVO = (SliderWithLabelsSectionVO) other;
        return Intrinsics.d(this.tabs, sliderWithLabelsSectionVO.tabs) && Intrinsics.d(this.thereInputs, sliderWithLabelsSectionVO.thereInputs) && Intrinsics.d(this.backInputs, sliderWithLabelsSectionVO.backInputs);
    }

    @NotNull
    public final List<SliderWithLabelsControlVO> getBackInputs() {
        return this.backInputs;
    }

    public final TabsDTO getTabs() {
        return this.tabs;
    }

    @NotNull
    public final List<SliderWithLabelsControlVO> getThereInputs() {
        return this.thereInputs;
    }

    public int hashCode() {
        TabsDTO tabsDTO = this.tabs;
        return this.backInputs.hashCode() + g.b((tabsDTO == null ? 0 : tabsDTO.hashCode()) * 31, 31, this.thereInputs);
    }

    @NotNull
    public String toString() {
        TabsDTO tabsDTO = this.tabs;
        List<SliderWithLabelsControlVO> list = this.thereInputs;
        List<SliderWithLabelsControlVO> list2 = this.backInputs;
        StringBuilder sb2 = new StringBuilder("SliderWithLabelsSectionVO(tabs=");
        sb2.append(tabsDTO);
        sb2.append(", thereInputs=");
        sb2.append(list);
        sb2.append(", backInputs=");
        return C2618u.h(sb2, list2, ")");
    }
}
