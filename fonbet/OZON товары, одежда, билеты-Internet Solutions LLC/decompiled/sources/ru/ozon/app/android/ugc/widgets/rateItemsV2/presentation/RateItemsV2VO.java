package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import B0.C2454a;
import G.g;
import GR.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00046789B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0019R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "items", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "", "separatorHeight", "", "widgetPageKey", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "strokeColor", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "scrollType", "<init>", "(JLjava/util/List;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;Ljava/lang/Integer;Ljava/lang/String;LWZ/t;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;Ljava/lang/Integer;Ljava/lang/String;LWZ/t;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;", "getHeader", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;", "Ljava/lang/Integer;", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getWidgetPageKey", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getStrokeColor", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "getScrollType", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "RateItemVO", "RatingActionVO", "RateItemsHeaderVO", "HideButtonVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RateItemsV2VO implements c {
    private final RateItemsHeaderVO header;
    private final long id;

    @NotNull
    private final List<RateItemVO> items;

    @NotNull
    private final RateItemsV2DTO.ScrollType scrollType;
    private final Integer separatorHeight;
    private final String strokeColor;
    private final t tokenizedEvent;
    private final String widgetPageKey;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleWidth", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftPadding", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/uni/atoms/data/common/Paddings;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getTitleWidth", "Lru/ozon/uni/atoms/data/common/Paddings;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideButtonVO {

        @NotNull
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final TextDTO title;
        private final int titleWidth;
        private final t tokenizedEvent;

        public HideButtonVO(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO title, int i11, @NotNull Paddings leftPadding, t tVar) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            this.iconButton = iconButton;
            this.title = title;
            this.titleWidth = i11;
            this.leftPadding = leftPadding;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideButtonVO)) {
                return false;
            }
            HideButtonVO hideButtonVO = (HideButtonVO) other;
            return Intrinsics.d(this.iconButton, hideButtonVO.iconButton) && Intrinsics.d(this.title, hideButtonVO.title) && this.titleWidth == hideButtonVO.titleWidth && this.leftPadding == hideButtonVO.leftPadding && Intrinsics.d(this.tokenizedEvent, hideButtonVO.tokenizedEvent);
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final int getTitleWidth() {
            return this.titleWidth;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int b11 = b.b(this.leftPadding, C2454a.a(this.titleWidth, Ns.b.a(this.title, this.iconButton.hashCode() * 31, 31), 31), 31);
            t tVar = this.tokenizedEvent;
            return b11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            TextDTO textDTO = this.title;
            int i11 = this.titleWidth;
            Paddings paddings = this.leftPadding;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("HideButtonVO(iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", titleWidth=");
            sb2.append(i11);
            sb2.append(", leftPadding=");
            sb2.append(paddings);
            sb2.append(", tokenizedEvent=");
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemsHeaderVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RateItemsHeaderVO {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO iconButton;
        private final TextDTO title;

        public RateItemsHeaderVO(TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO) {
            this.title = textDTO;
            this.iconButton = iconButtonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RateItemsHeaderVO)) {
                return false;
            }
            RateItemsHeaderVO rateItemsHeaderVO = (RateItemsHeaderVO) other;
            return Intrinsics.d(this.title, rateItemsHeaderVO.title) && Intrinsics.d(this.iconButton, rateItemsHeaderVO.iconButton);
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            return hashCode + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RateItemsHeaderVO(title=" + this.title + ", iconButton=" + this.iconButton + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RatingActionVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tracking", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTracking", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RatingActionVO {
        private final AtomAction action;
        private final t tracking;

        public RatingActionVO(AtomAction atomAction, t tVar) {
            this.action = atomAction;
            this.tracking = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RatingActionVO)) {
                return false;
            }
            RatingActionVO ratingActionVO = (RatingActionVO) other;
            return Intrinsics.d(this.action, ratingActionVO.action) && Intrinsics.d(this.tracking, ratingActionVO.tracking);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final t getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            int hashCode = (atomAction == null ? 0 : atomAction.hashCode()) * 31;
            t tVar = this.tracking;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RatingActionVO(action=" + this.action + ", tracking=" + this.tracking + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RateItemsV2VO(long j11, @NotNull List<? extends RateItemVO> items, RateItemsHeaderVO rateItemsHeaderVO, Integer num, String str, t tVar, String str2, @NotNull RateItemsV2DTO.ScrollType scrollType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollType, "scrollType");
        this.id = j11;
        this.items = items;
        this.header = rateItemsHeaderVO;
        this.separatorHeight = num;
        this.widgetPageKey = str;
        this.tokenizedEvent = tVar;
        this.strokeColor = str2;
        this.scrollType = scrollType;
    }

    public static /* synthetic */ RateItemsV2VO copy$default(RateItemsV2VO rateItemsV2VO, long j11, List list, RateItemsHeaderVO rateItemsHeaderVO, Integer num, String str, t tVar, String str2, RateItemsV2DTO.ScrollType scrollType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = rateItemsV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = rateItemsV2VO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            rateItemsHeaderVO = rateItemsV2VO.header;
        }
        RateItemsHeaderVO rateItemsHeaderVO2 = rateItemsHeaderVO;
        if ((i11 & 8) != 0) {
            num = rateItemsV2VO.separatorHeight;
        }
        return rateItemsV2VO.copy(j12, list2, rateItemsHeaderVO2, num, (i11 & 16) != 0 ? rateItemsV2VO.widgetPageKey : str, (i11 & 32) != 0 ? rateItemsV2VO.tokenizedEvent : tVar, (i11 & 64) != 0 ? rateItemsV2VO.strokeColor : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rateItemsV2VO.scrollType : scrollType);
    }

    @NotNull
    public final RateItemsV2VO copy(long id2, @NotNull List<? extends RateItemVO> items, RateItemsHeaderVO header, Integer separatorHeight, String widgetPageKey, t tokenizedEvent, String strokeColor, @NotNull RateItemsV2DTO.ScrollType scrollType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollType, "scrollType");
        return new RateItemsV2VO(id2, items, header, separatorHeight, widgetPageKey, tokenizedEvent, strokeColor, scrollType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateItemsV2VO)) {
            return false;
        }
        RateItemsV2VO rateItemsV2VO = (RateItemsV2VO) other;
        return this.id == rateItemsV2VO.id && Intrinsics.d(this.items, rateItemsV2VO.items) && Intrinsics.d(this.header, rateItemsV2VO.header) && Intrinsics.d(this.separatorHeight, rateItemsV2VO.separatorHeight) && Intrinsics.d(this.widgetPageKey, rateItemsV2VO.widgetPageKey) && Intrinsics.d(this.tokenizedEvent, rateItemsV2VO.tokenizedEvent) && Intrinsics.d(this.strokeColor, rateItemsV2VO.strokeColor) && this.scrollType == rateItemsV2VO.scrollType;
    }

    public final RateItemsHeaderVO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<RateItemVO> getItems() {
        return this.items;
    }

    @NotNull
    public final RateItemsV2DTO.ScrollType getScrollType() {
        return this.scrollType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetPageKey() {
        return this.widgetPageKey;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        RateItemsHeaderVO rateItemsHeaderVO = this.header;
        int hashCode = (b11 + (rateItemsHeaderVO == null ? 0 : rateItemsHeaderVO.hashCode())) * 31;
        Integer num = this.separatorHeight;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.widgetPageKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str2 = this.strokeColor;
        return this.scrollType.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RateItemVO> list = this.items;
        RateItemsHeaderVO rateItemsHeaderVO = this.header;
        Integer num = this.separatorHeight;
        String str = this.widgetPageKey;
        t tVar = this.tokenizedEvent;
        String str2 = this.strokeColor;
        RateItemsV2DTO.ScrollType scrollType = this.scrollType;
        StringBuilder b11 = Lh.b.b(j11, "RateItemsV2VO(id=", ", items=", list);
        b11.append(", header=");
        b11.append(rateItemsHeaderVO);
        b11.append(", separatorHeight=");
        b11.append(num);
        Bi.a.f(b11, ", widgetPageKey=", str, ", tokenizedEvent=", tVar);
        b11.append(", strokeColor=");
        b11.append(str2);
        b11.append(", scrollType=");
        b11.append(scrollType);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u001c\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "RateProductItemVO", "RateReviewsItemVO", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RateItemVO {

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "strokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "getStrokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RateReviewsItemVO implements RateItemVO {
            private final AtomAction action;
            private final String backgroundColor;
            private final CellDTO cell;

            @NotNull
            private final IconDTO icon;
            private final String strokeColor;
            private final TextDTO title;
            private final t tokenizedEvent;

            public RateReviewsItemVO(@NotNull IconDTO icon, TextDTO textDTO, String str, String str2, AtomAction atomAction, t tVar, CellDTO cellDTO) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.title = textDTO;
                this.backgroundColor = str;
                this.strokeColor = str2;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
                this.cell = cellDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateReviewsItemVO)) {
                    return false;
                }
                RateReviewsItemVO rateReviewsItemVO = (RateReviewsItemVO) other;
                return Intrinsics.d(this.icon, rateReviewsItemVO.icon) && Intrinsics.d(this.title, rateReviewsItemVO.title) && Intrinsics.d(this.backgroundColor, rateReviewsItemVO.backgroundColor) && Intrinsics.d(this.strokeColor, rateReviewsItemVO.strokeColor) && Intrinsics.d(this.action, rateReviewsItemVO.action) && Intrinsics.d(this.tokenizedEvent, rateReviewsItemVO.tokenizedEvent) && Intrinsics.d(this.cell, rateReviewsItemVO.cell);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public final String getStrokeColor() {
                return this.strokeColor;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO.RateItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                TextDTO textDTO = this.title;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.strokeColor;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                AtomAction atomAction = this.action;
                int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                CellDTO cellDTO = this.cell;
                return hashCode6 + (cellDTO != null ? cellDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.title;
                String str = this.backgroundColor;
                String str2 = this.strokeColor;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                CellDTO cellDTO = this.cell;
                StringBuilder i11 = Bi.b.i("RateReviewsItemVO(icon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
                Nh.a.h(i11, str, ", strokeColor=", str2, ", action=");
                i11.append(atomAction);
                i11.append(", tokenizedEvent=");
                i11.append(tVar);
                i11.append(", cell=");
                i11.append(cellDTO);
                i11.append(")");
                return i11.toString();
            }
        }

        t getTokenizedEvent();

        @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\u0010\u0019\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$Jð\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b;\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b<\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bI\u0010:R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u0010LR\"\u0010\u0019\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bM\u0010ER\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\bQ\u0010?R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010X\u001a\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMedia", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "", "sku", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "backgroundColor", "strokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "ratingClickEvent", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "hideButtonVO", "headerTitle", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RatingActionVO;", "ratingActions", "tokenizedEvent", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", DynamicElementDTO.TIMER, "titleAction", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "scrollType", "", "wasAnimated", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;Z)V", "copy", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;Lru/ozon/app/android/timerMolecule/presentation/TimerVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;Z)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Ljava/lang/String;", "getSku", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "getStrokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getRatingClickEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "getHideButtonVO", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "getHeaderTitle", "Ljava/util/List;", "getRatingActions", "()Ljava/util/List;", "getTokenizedEvent", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "getTitleAction", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "getScrollType", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "Z", "getWasAnimated", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RateProductItemVO implements RateItemVO {
            private final AtomAction action;
            private final String backgroundColor;
            private final BadgeDTO badge;
            private final CellDTO cell;
            private final TextDTO headerTitle;
            private final HideButtonVO hideButtonVO;

            @NotNull
            private final ProductMediaDTO productMedia;

            @NotNull
            private final RatingDTO rating;

            @NotNull
            private final List<RatingActionVO> ratingActions;
            private final t ratingClickEvent;

            @NotNull
            private final RateItemsV2DTO.ScrollType scrollType;
            private final String sku;
            private final String strokeColor;
            private final TimerVO timer;
            private final TextDTO title;
            private final AtomAction titleAction;
            private final t tokenizedEvent;
            private final boolean wasAnimated;

            public RateProductItemVO(@NotNull ProductMediaDTO productMedia, @NotNull RatingDTO rating, String str, TextDTO textDTO, String str2, String str3, AtomAction atomAction, BadgeDTO badgeDTO, t tVar, HideButtonVO hideButtonVO, TextDTO textDTO2, @NotNull List<RatingActionVO> ratingActions, t tVar2, TimerVO timerVO, AtomAction atomAction2, CellDTO cellDTO, @NotNull RateItemsV2DTO.ScrollType scrollType, boolean z11) {
                Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                Intrinsics.checkNotNullParameter(rating, "rating");
                Intrinsics.checkNotNullParameter(ratingActions, "ratingActions");
                Intrinsics.checkNotNullParameter(scrollType, "scrollType");
                this.productMedia = productMedia;
                this.rating = rating;
                this.sku = str;
                this.title = textDTO;
                this.backgroundColor = str2;
                this.strokeColor = str3;
                this.action = atomAction;
                this.badge = badgeDTO;
                this.ratingClickEvent = tVar;
                this.hideButtonVO = hideButtonVO;
                this.headerTitle = textDTO2;
                this.ratingActions = ratingActions;
                this.tokenizedEvent = tVar2;
                this.timer = timerVO;
                this.titleAction = atomAction2;
                this.cell = cellDTO;
                this.scrollType = scrollType;
                this.wasAnimated = z11;
            }

            public static /* synthetic */ RateProductItemVO copy$default(RateProductItemVO rateProductItemVO, ProductMediaDTO productMediaDTO, RatingDTO ratingDTO, String str, TextDTO textDTO, String str2, String str3, AtomAction atomAction, BadgeDTO badgeDTO, t tVar, HideButtonVO hideButtonVO, TextDTO textDTO2, List list, t tVar2, TimerVO timerVO, AtomAction atomAction2, CellDTO cellDTO, RateItemsV2DTO.ScrollType scrollType, boolean z11, int i11, Object obj) {
                boolean z12;
                RateItemsV2DTO.ScrollType scrollType2;
                ProductMediaDTO productMediaDTO2 = (i11 & 1) != 0 ? rateProductItemVO.productMedia : productMediaDTO;
                RatingDTO ratingDTO2 = (i11 & 2) != 0 ? rateProductItemVO.rating : ratingDTO;
                String str4 = (i11 & 4) != 0 ? rateProductItemVO.sku : str;
                TextDTO textDTO3 = (i11 & 8) != 0 ? rateProductItemVO.title : textDTO;
                String str5 = (i11 & 16) != 0 ? rateProductItemVO.backgroundColor : str2;
                String str6 = (i11 & 32) != 0 ? rateProductItemVO.strokeColor : str3;
                AtomAction atomAction3 = (i11 & 64) != 0 ? rateProductItemVO.action : atomAction;
                BadgeDTO badgeDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rateProductItemVO.badge : badgeDTO;
                t tVar3 = (i11 & 256) != 0 ? rateProductItemVO.ratingClickEvent : tVar;
                HideButtonVO hideButtonVO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rateProductItemVO.hideButtonVO : hideButtonVO;
                TextDTO textDTO4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rateProductItemVO.headerTitle : textDTO2;
                List list2 = (i11 & 2048) != 0 ? rateProductItemVO.ratingActions : list;
                t tVar4 = (i11 & 4096) != 0 ? rateProductItemVO.tokenizedEvent : tVar2;
                TimerVO timerVO2 = (i11 & 8192) != 0 ? rateProductItemVO.timer : timerVO;
                ProductMediaDTO productMediaDTO3 = productMediaDTO2;
                AtomAction atomAction4 = (i11 & 16384) != 0 ? rateProductItemVO.titleAction : atomAction2;
                CellDTO cellDTO2 = (i11 & 32768) != 0 ? rateProductItemVO.cell : cellDTO;
                RateItemsV2DTO.ScrollType scrollType3 = (i11 & 65536) != 0 ? rateProductItemVO.scrollType : scrollType;
                if ((i11 & 131072) != 0) {
                    scrollType2 = scrollType3;
                    z12 = rateProductItemVO.wasAnimated;
                } else {
                    z12 = z11;
                    scrollType2 = scrollType3;
                }
                return rateProductItemVO.copy(productMediaDTO3, ratingDTO2, str4, textDTO3, str5, str6, atomAction3, badgeDTO2, tVar3, hideButtonVO2, textDTO4, list2, tVar4, timerVO2, atomAction4, cellDTO2, scrollType2, z12);
            }

            @NotNull
            public final RateProductItemVO copy(@NotNull ProductMediaDTO productMedia, @NotNull RatingDTO rating, String sku, TextDTO title, String backgroundColor, String strokeColor, AtomAction action, BadgeDTO badge, t ratingClickEvent, HideButtonVO hideButtonVO, TextDTO headerTitle, @NotNull List<RatingActionVO> ratingActions, t tokenizedEvent, TimerVO timer, AtomAction titleAction, CellDTO cell, @NotNull RateItemsV2DTO.ScrollType scrollType, boolean wasAnimated) {
                Intrinsics.checkNotNullParameter(productMedia, "productMedia");
                Intrinsics.checkNotNullParameter(rating, "rating");
                Intrinsics.checkNotNullParameter(ratingActions, "ratingActions");
                Intrinsics.checkNotNullParameter(scrollType, "scrollType");
                return new RateProductItemVO(productMedia, rating, sku, title, backgroundColor, strokeColor, action, badge, ratingClickEvent, hideButtonVO, headerTitle, ratingActions, tokenizedEvent, timer, titleAction, cell, scrollType, wasAnimated);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateProductItemVO)) {
                    return false;
                }
                RateProductItemVO rateProductItemVO = (RateProductItemVO) other;
                return Intrinsics.d(this.productMedia, rateProductItemVO.productMedia) && Intrinsics.d(this.rating, rateProductItemVO.rating) && Intrinsics.d(this.sku, rateProductItemVO.sku) && Intrinsics.d(this.title, rateProductItemVO.title) && Intrinsics.d(this.backgroundColor, rateProductItemVO.backgroundColor) && Intrinsics.d(this.strokeColor, rateProductItemVO.strokeColor) && Intrinsics.d(this.action, rateProductItemVO.action) && Intrinsics.d(this.badge, rateProductItemVO.badge) && Intrinsics.d(this.ratingClickEvent, rateProductItemVO.ratingClickEvent) && Intrinsics.d(this.hideButtonVO, rateProductItemVO.hideButtonVO) && Intrinsics.d(this.headerTitle, rateProductItemVO.headerTitle) && Intrinsics.d(this.ratingActions, rateProductItemVO.ratingActions) && Intrinsics.d(this.tokenizedEvent, rateProductItemVO.tokenizedEvent) && Intrinsics.d(this.timer, rateProductItemVO.timer) && Intrinsics.d(this.titleAction, rateProductItemVO.titleAction) && Intrinsics.d(this.cell, rateProductItemVO.cell) && this.scrollType == rateProductItemVO.scrollType && this.wasAnimated == rateProductItemVO.wasAnimated;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final CellDTO getCell() {
                return this.cell;
            }

            public final TextDTO getHeaderTitle() {
                return this.headerTitle;
            }

            public final HideButtonVO getHideButtonVO() {
                return this.hideButtonVO;
            }

            @NotNull
            public final ProductMediaDTO getProductMedia() {
                return this.productMedia;
            }

            @NotNull
            public final RatingDTO getRating() {
                return this.rating;
            }

            @NotNull
            public final List<RatingActionVO> getRatingActions() {
                return this.ratingActions;
            }

            @NotNull
            public final RateItemsV2DTO.ScrollType getScrollType() {
                return this.scrollType;
            }

            public final String getSku() {
                return this.sku;
            }

            public final String getStrokeColor() {
                return this.strokeColor;
            }

            public final TimerVO getTimer() {
                return this.timer;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public final AtomAction getTitleAction() {
                return this.titleAction;
            }

            @Override // ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO.RateItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public final boolean getWasAnimated() {
                return this.wasAnimated;
            }

            public int hashCode() {
                int hashCode = (this.rating.hashCode() + (this.productMedia.hashCode() * 31)) * 31;
                String str = this.sku;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                TextDTO textDTO = this.title;
                int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                String str2 = this.backgroundColor;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.strokeColor;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                AtomAction atomAction = this.action;
                int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                int hashCode7 = (hashCode6 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                t tVar = this.ratingClickEvent;
                int hashCode8 = (hashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                HideButtonVO hideButtonVO = this.hideButtonVO;
                int hashCode9 = (hashCode8 + (hideButtonVO == null ? 0 : hideButtonVO.hashCode())) * 31;
                TextDTO textDTO2 = this.headerTitle;
                int b11 = g.b((hashCode9 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.ratingActions);
                t tVar2 = this.tokenizedEvent;
                int hashCode10 = (b11 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
                TimerVO timerVO = this.timer;
                int hashCode11 = (hashCode10 + (timerVO == null ? 0 : timerVO.hashCode())) * 31;
                AtomAction atomAction2 = this.titleAction;
                int hashCode12 = (hashCode11 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
                CellDTO cellDTO = this.cell;
                return Boolean.hashCode(this.wasAnimated) + ((this.scrollType.hashCode() + ((hashCode12 + (cellDTO != null ? cellDTO.hashCode() : 0)) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                ProductMediaDTO productMediaDTO = this.productMedia;
                RatingDTO ratingDTO = this.rating;
                String str = this.sku;
                TextDTO textDTO = this.title;
                String str2 = this.backgroundColor;
                String str3 = this.strokeColor;
                AtomAction atomAction = this.action;
                BadgeDTO badgeDTO = this.badge;
                t tVar = this.ratingClickEvent;
                HideButtonVO hideButtonVO = this.hideButtonVO;
                TextDTO textDTO2 = this.headerTitle;
                List<RatingActionVO> list = this.ratingActions;
                t tVar2 = this.tokenizedEvent;
                TimerVO timerVO = this.timer;
                AtomAction atomAction2 = this.titleAction;
                CellDTO cellDTO = this.cell;
                RateItemsV2DTO.ScrollType scrollType = this.scrollType;
                boolean z11 = this.wasAnimated;
                StringBuilder sb2 = new StringBuilder("RateProductItemVO(productMedia=");
                sb2.append(productMediaDTO);
                sb2.append(", rating=");
                sb2.append(ratingDTO);
                sb2.append(", sku=");
                sb2.append(str);
                sb2.append(", title=");
                sb2.append(textDTO);
                sb2.append(", backgroundColor=");
                Nh.a.h(sb2, str2, ", strokeColor=", str3, ", action=");
                sb2.append(atomAction);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", ratingClickEvent=");
                sb2.append(tVar);
                sb2.append(", hideButtonVO=");
                sb2.append(hideButtonVO);
                sb2.append(", headerTitle=");
                Tl.a.e(sb2, textDTO2, ", ratingActions=", list, ", tokenizedEvent=");
                sb2.append(tVar2);
                sb2.append(", timer=");
                sb2.append(timerVO);
                sb2.append(", titleAction=");
                sb2.append(atomAction2);
                sb2.append(", cell=");
                sb2.append(cellDTO);
                sb2.append(", scrollType=");
                sb2.append(scrollType);
                sb2.append(", wasAnimated=");
                sb2.append(z11);
                sb2.append(")");
                return sb2.toString();
            }

            public /* synthetic */ RateProductItemVO(ProductMediaDTO productMediaDTO, RatingDTO ratingDTO, String str, TextDTO textDTO, String str2, String str3, AtomAction atomAction, BadgeDTO badgeDTO, t tVar, HideButtonVO hideButtonVO, TextDTO textDTO2, List list, t tVar2, TimerVO timerVO, AtomAction atomAction2, CellDTO cellDTO, RateItemsV2DTO.ScrollType scrollType, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(productMediaDTO, ratingDTO, str, textDTO, str2, str3, atomAction, badgeDTO, tVar, hideButtonVO, textDTO2, list, tVar2, timerVO, atomAction2, cellDTO, scrollType, (i11 & 131072) != 0 ? false : z11);
            }
        }
    }
}
