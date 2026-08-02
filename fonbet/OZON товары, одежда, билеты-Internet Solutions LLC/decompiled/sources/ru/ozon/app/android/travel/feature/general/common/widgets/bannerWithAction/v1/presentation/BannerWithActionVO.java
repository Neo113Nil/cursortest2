package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation;

import An.C2439a;
import B3.p;
import D3.g;
import GR.b;
import WZ.t;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004>?@ABi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b4\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;", "leftBlock", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "rightBlock", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "", "cornerRadius", "", "backgroundColor", "borderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;", "margins", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;FLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;", "getLeftBlock", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "getRightBlock-p6tKhZo", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "F", "getCornerRadius", "()F", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;", "getMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;", "LeftBlockVO", "RightBlockVO", "SettingsVO", "MarginsVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BannerWithActionVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final String borderColor;
    private final IconButtonV3DTO closeButton;
    private final float cornerRadius;
    private final long id;

    @NotNull
    private final LeftBlockVO leftBlock;

    @NotNull
    private final MarginsVO margins;
    private final RightBlockVO rightBlock;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;", "settings", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftBlockVO {
        private final ButtonV3DTO actionButton;

        @NotNull
        private final SettingsVO settings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public LeftBlockVO(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull SettingsVO settings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.title = title;
            this.subtitle = textDTO;
            this.actionButton = buttonV3DTO;
            this.settings = settings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftBlockVO)) {
                return false;
            }
            LeftBlockVO leftBlockVO = (LeftBlockVO) other;
            return Intrinsics.d(this.title, leftBlockVO.title) && Intrinsics.d(this.subtitle, leftBlockVO.subtitle) && Intrinsics.d(this.actionButton, leftBlockVO.actionButton) && Intrinsics.d(this.settings, leftBlockVO.settings);
        }

        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final SettingsVO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            return this.settings.hashCode() + ((hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            SettingsVO settingsVO = this.settings;
            StringBuilder g10 = g.g("LeftBlockVO(title=", textDTO, ", subtitle=", textDTO2, ", actionButton=");
            g10.append(buttonV3DTO);
            g10.append(", settings=");
            g10.append(settingsVO);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "start", "top", "end", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getStart", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getEnd", "getBottom", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsVO {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings end;

        @NotNull
        private final Paddings start;

        @NotNull
        private final Paddings top;

        public MarginsVO(@NotNull Paddings start, @NotNull Paddings top, @NotNull Paddings end, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.start = start;
            this.top = top;
            this.end = end;
            this.bottom = bottom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginsVO)) {
                return false;
            }
            MarginsVO marginsVO = (MarginsVO) other;
            return this.start == marginsVO.start && this.top == marginsVO.top && this.end == marginsVO.end && this.bottom == marginsVO.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getEnd() {
            return this.end;
        }

        @NotNull
        public final Paddings getStart() {
            return this.start;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.end, b.b(this.top, this.start.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.start;
            Paddings paddings2 = this.top;
            return b.e(p.b("MarginsVO(start=", paddings, ", top=", paddings2, ", end="), this.end, ", bottom=", this.bottom, ")");
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "", "Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "image", "constructor-impl", "(Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;)Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;)I", "hashCode", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "getImage", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RightBlockVO {
        private final ThemeImageV2VO image;

        private /* synthetic */ RightBlockVO(ThemeImageV2VO themeImageV2VO) {
            this.image = themeImageV2VO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RightBlockVO m1199boximpl(ThemeImageV2VO themeImageV2VO) {
            return new RightBlockVO(themeImageV2VO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static ThemeImageV2VO m1200constructorimpl(ThemeImageV2VO themeImageV2VO) {
            return themeImageV2VO;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1201equalsimpl(ThemeImageV2VO themeImageV2VO, Object obj) {
            return (obj instanceof RightBlockVO) && Intrinsics.d(themeImageV2VO, ((RightBlockVO) obj).getImage());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1202hashCodeimpl(ThemeImageV2VO themeImageV2VO) {
            if (themeImageV2VO == null) {
                return 0;
            }
            return themeImageV2VO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1203toStringimpl(ThemeImageV2VO themeImageV2VO) {
            return "RightBlockVO(image=" + themeImageV2VO + ")";
        }

        public boolean equals(Object obj) {
            return m1201equalsimpl(this.image, obj);
        }

        public int hashCode() {
            return m1202hashCodeimpl(this.image);
        }

        public String toString() {
            return m1203toStringimpl(this.image);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ ThemeImageV2VO getImage() {
            return this.image;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final Paddings rightPadding;

        @NotNull
        private final Paddings topPadding;

        public SettingsVO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsVO)) {
                return false;
            }
            SettingsVO settingsVO = (SettingsVO) other;
            return this.topPadding == settingsVO.topPadding && this.bottomPadding == settingsVO.bottomPadding && this.leftPadding == settingsVO.leftPadding && this.rightPadding == settingsVO.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("SettingsVO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    public /* synthetic */ BannerWithActionVO(long j11, LeftBlockVO leftBlockVO, RightBlockVO rightBlockVO, IconButtonV3DTO iconButtonV3DTO, float f7, String str, String str2, AtomAction atomAction, t tVar, MarginsVO marginsVO, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, leftBlockVO, rightBlockVO, iconButtonV3DTO, f7, str, str2, atomAction, tVar, marginsVO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerWithActionVO)) {
            return false;
        }
        BannerWithActionVO bannerWithActionVO = (BannerWithActionVO) other;
        return this.id == bannerWithActionVO.id && Intrinsics.d(this.leftBlock, bannerWithActionVO.leftBlock) && Intrinsics.d(this.rightBlock, bannerWithActionVO.rightBlock) && Intrinsics.d(this.closeButton, bannerWithActionVO.closeButton) && Float.compare(this.cornerRadius, bannerWithActionVO.cornerRadius) == 0 && Intrinsics.d(this.backgroundColor, bannerWithActionVO.backgroundColor) && Intrinsics.d(this.borderColor, bannerWithActionVO.borderColor) && Intrinsics.d(this.action, bannerWithActionVO.action) && Intrinsics.d(this.tokenizedEvent, bannerWithActionVO.tokenizedEvent) && Intrinsics.d(this.margins, bannerWithActionVO.margins);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LeftBlockVO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    public final MarginsVO getMargins() {
        return this.margins;
    }

    /* renamed from: getRightBlock-p6tKhZo, reason: not valid java name and from getter */
    public final RightBlockVO getRightBlock() {
        return this.rightBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.leftBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        RightBlockVO rightBlockVO = this.rightBlock;
        int m1202hashCodeimpl = (hashCode + (rightBlockVO == null ? 0 : RightBlockVO.m1202hashCodeimpl(rightBlockVO.getImage()))) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int a11 = Pk0.b.a(this.cornerRadius, (m1202hashCodeimpl + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.margins.hashCode() + ((hashCode4 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        LeftBlockVO leftBlockVO = this.leftBlock;
        RightBlockVO rightBlockVO = this.rightBlock;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        float f7 = this.cornerRadius;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        MarginsVO marginsVO = this.margins;
        StringBuilder sb2 = new StringBuilder("BannerWithActionVO(id=");
        sb2.append(j11);
        sb2.append(", leftBlock=");
        sb2.append(leftBlockVO);
        sb2.append(", rightBlock=");
        sb2.append(rightBlockVO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", cornerRadius=");
        sb2.append(f7);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        C2439a.c(", borderColor=", str2, ", action=", sb2, atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", margins=");
        sb2.append(marginsVO);
        sb2.append(")");
        return sb2.toString();
    }

    private BannerWithActionVO(long j11, LeftBlockVO leftBlock, RightBlockVO rightBlockVO, IconButtonV3DTO iconButtonV3DTO, float f7, String str, String str2, AtomAction atomAction, t tVar, MarginsVO margins) {
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.id = j11;
        this.leftBlock = leftBlock;
        this.rightBlock = rightBlockVO;
        this.closeButton = iconButtonV3DTO;
        this.cornerRadius = f7;
        this.backgroundColor = str;
        this.borderColor = str2;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.margins = margins;
    }
}
