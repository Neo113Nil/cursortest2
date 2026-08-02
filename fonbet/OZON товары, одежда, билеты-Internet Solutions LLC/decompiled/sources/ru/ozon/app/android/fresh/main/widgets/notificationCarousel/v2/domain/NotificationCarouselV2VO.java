package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain;

import Am.C2438a;
import B0.C2454a;
import Bl.C2639a;
import D3.g;
import De.C2859b;
import E0.C2942q;
import El.C2971a;
import F3.G;
import J0.P;
import Lc.a;
import Ns.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003./0BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JV\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "items", "updatePeriodSeconds", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "paddings", "LWZ/t;", "tokenizedEvent", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(JLjava/util/List;JLru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;JLru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getUpdatePeriodSeconds", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "NotificationCarouselItemVO", "OrderProgressVO", "PaddingsVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationCarouselV2VO implements c {
    private final long id;

    @NotNull
    private final List<NotificationCarouselItemVO> items;
    private final Parcelable layoutManagerState;

    @NotNull
    private final PaddingsVO paddings;
    private final t tokenizedEvent;
    private final long updatePeriodSeconds;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B'\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0004\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "OrderTrackingNotification", "InformationNotification", "ClickDeliveryNotification", "ActionButtonNotification", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ActionButtonNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ClickDeliveryNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$InformationNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$OrderTrackingNotification;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NotificationCarouselItemVO {
        private final String backgroundColor;
        private final AtomAction clickAction;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ActionButtonNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleIcon", "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionButtonNotification extends NotificationCarouselItemVO {
            private final String backgroundColor;

            @NotNull
            private final ButtonV3DTO button;
            private final AtomAction clickAction;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @NotNull
            private final IconDTO titleIcon;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionButtonNotification(@NotNull TextDTO title, @NotNull IconDTO titleIcon, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO button, String str, AtomAction atomAction, t tVar) {
                super(str, atomAction, tVar, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(button, "button");
                this.title = title;
                this.titleIcon = titleIcon;
                this.subtitle = subtitle;
                this.button = button;
                this.backgroundColor = str;
                this.clickAction = atomAction;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionButtonNotification)) {
                    return false;
                }
                ActionButtonNotification actionButtonNotification = (ActionButtonNotification) other;
                return Intrinsics.d(this.title, actionButtonNotification.title) && Intrinsics.d(this.titleIcon, actionButtonNotification.titleIcon) && Intrinsics.d(this.subtitle, actionButtonNotification.subtitle) && Intrinsics.d(this.button, actionButtonNotification.button) && Intrinsics.d(this.backgroundColor, actionButtonNotification.backgroundColor) && Intrinsics.d(this.clickAction, actionButtonNotification.clickAction) && Intrinsics.d(this.tokenizedEvent, actionButtonNotification.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            public final IconDTO getTitleIcon() {
                return this.titleIcon;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int c11 = C2859b.c(this.button, b.a(this.subtitle, C2971a.a(this.titleIcon, this.title.hashCode() * 31, 31), 31), 31);
                String str = this.backgroundColor;
                int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                IconDTO iconDTO = this.titleIcon;
                TextDTO textDTO2 = this.subtitle;
                ButtonV3DTO buttonV3DTO = this.button;
                String str = this.backgroundColor;
                AtomAction atomAction = this.clickAction;
                t tVar = this.tokenizedEvent;
                StringBuilder d11 = C2639a.d("ActionButtonNotification(title=", ", titleIcon=", ", subtitle=", iconDTO, textDTO);
                d11.append(textDTO2);
                d11.append(", button=");
                d11.append(buttonV3DTO);
                d11.append(", backgroundColor=");
                b.d(str, ", clickAction=", ", tokenizedEvent=", d11, atomAction);
                return Tl.b.d(d11, tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ClickDeliveryNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "skuImage", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "getSkuImage", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClickDeliveryNotification extends NotificationCarouselItemVO {
            private final String backgroundColor;

            @NotNull
            private final CellDTO cell;
            private final AtomAction clickAction;

            @NotNull
            private final ImageSkuClickVO skuImage;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClickDeliveryNotification(@NotNull ImageSkuClickVO skuImage, @NotNull CellDTO cell, String str, AtomAction atomAction, t tVar) {
                super(str, atomAction, tVar, null);
                Intrinsics.checkNotNullParameter(skuImage, "skuImage");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.skuImage = skuImage;
                this.cell = cell;
                this.backgroundColor = str;
                this.clickAction = atomAction;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClickDeliveryNotification)) {
                    return false;
                }
                ClickDeliveryNotification clickDeliveryNotification = (ClickDeliveryNotification) other;
                return Intrinsics.d(this.skuImage, clickDeliveryNotification.skuImage) && Intrinsics.d(this.cell, clickDeliveryNotification.cell) && Intrinsics.d(this.backgroundColor, clickDeliveryNotification.backgroundColor) && Intrinsics.d(this.clickAction, clickDeliveryNotification.clickAction) && Intrinsics.d(this.tokenizedEvent, clickDeliveryNotification.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final ImageSkuClickVO getSkuImage() {
                return this.skuImage;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int c11 = Bi.b.c(this.cell, this.skuImage.hashCode() * 31, 31);
                String str = this.backgroundColor;
                int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ImageSkuClickVO imageSkuClickVO = this.skuImage;
                CellDTO cellDTO = this.cell;
                String str = this.backgroundColor;
                AtomAction atomAction = this.clickAction;
                t tVar = this.tokenizedEvent;
                StringBuilder sb2 = new StringBuilder("ClickDeliveryNotification(skuImage=");
                sb2.append(imageSkuClickVO);
                sb2.append(", cell=");
                sb2.append(cellDTO);
                sb2.append(", backgroundColor=");
                b.d(str, ", clickAction=", ", tokenizedEvent=", sb2, atomAction);
                return Tl.b.d(sb2, tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$InformationNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "leftIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "rightIcon", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRightIcon", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InformationNotification extends NotificationCarouselItemVO {
            private final String backgroundColor;
            private final AtomAction clickAction;

            @NotNull
            private final IconDTO leftIcon;
            private final IconDTO rightIcon;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InformationNotification(@NotNull IconDTO leftIcon, @NotNull TextDTO title, @NotNull TextDTO subtitle, IconDTO iconDTO, String str, AtomAction atomAction, t tVar) {
                super(str, atomAction, tVar, null);
                Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.leftIcon = leftIcon;
                this.title = title;
                this.subtitle = subtitle;
                this.rightIcon = iconDTO;
                this.backgroundColor = str;
                this.clickAction = atomAction;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InformationNotification)) {
                    return false;
                }
                InformationNotification informationNotification = (InformationNotification) other;
                return Intrinsics.d(this.leftIcon, informationNotification.leftIcon) && Intrinsics.d(this.title, informationNotification.title) && Intrinsics.d(this.subtitle, informationNotification.subtitle) && Intrinsics.d(this.rightIcon, informationNotification.rightIcon) && Intrinsics.d(this.backgroundColor, informationNotification.backgroundColor) && Intrinsics.d(this.clickAction, informationNotification.clickAction) && Intrinsics.d(this.tokenizedEvent, informationNotification.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final IconDTO getLeftIcon() {
                return this.leftIcon;
            }

            public final IconDTO getRightIcon() {
                return this.rightIcon;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = b.a(this.subtitle, b.a(this.title, this.leftIcon.hashCode() * 31, 31), 31);
                IconDTO iconDTO = this.rightIcon;
                int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.leftIcon;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconDTO iconDTO2 = this.rightIcon;
                String str = this.backgroundColor;
                AtomAction atomAction = this.clickAction;
                t tVar = this.tokenizedEvent;
                StringBuilder i11 = Bi.b.i("InformationNotification(leftIcon=", ", title=", ", subtitle=", iconDTO, textDTO);
                G.f(i11, textDTO2, ", rightIcon=", iconDTO2, ", backgroundColor=");
                b.d(str, ", clickAction=", ", tokenizedEvent=", i11, atomAction);
                return Tl.b.d(i11, tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$OrderTrackingNotification;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleIcon", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "progress", "starIcon", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "getProgress", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "getStarIcon", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OrderTrackingNotification extends NotificationCarouselItemVO {
            private final String backgroundColor;
            private final AtomAction clickAction;

            @NotNull
            private final OrderProgressVO progress;
            private final IconDTO starIcon;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @NotNull
            private final IconDTO titleIcon;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderTrackingNotification(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO titleIcon, @NotNull OrderProgressVO progress, IconDTO iconDTO, String str, AtomAction atomAction, t tVar) {
                super(str, atomAction, tVar, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(progress, "progress");
                this.title = title;
                this.subtitle = subtitle;
                this.titleIcon = titleIcon;
                this.progress = progress;
                this.starIcon = iconDTO;
                this.backgroundColor = str;
                this.clickAction = atomAction;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderTrackingNotification)) {
                    return false;
                }
                OrderTrackingNotification orderTrackingNotification = (OrderTrackingNotification) other;
                return Intrinsics.d(this.title, orderTrackingNotification.title) && Intrinsics.d(this.subtitle, orderTrackingNotification.subtitle) && Intrinsics.d(this.titleIcon, orderTrackingNotification.titleIcon) && Intrinsics.d(this.progress, orderTrackingNotification.progress) && Intrinsics.d(this.starIcon, orderTrackingNotification.starIcon) && Intrinsics.d(this.backgroundColor, orderTrackingNotification.backgroundColor) && Intrinsics.d(this.clickAction, orderTrackingNotification.clickAction) && Intrinsics.d(this.tokenizedEvent, orderTrackingNotification.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public String getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final OrderProgressVO getProgress() {
                return this.progress;
            }

            public final IconDTO getStarIcon() {
                return this.starIcon;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            public final IconDTO getTitleIcon() {
                return this.titleIcon;
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO.NotificationCarouselItemVO
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.progress.hashCode() + C2971a.a(this.titleIcon, b.a(this.subtitle, this.title.hashCode() * 31, 31), 31)) * 31;
                IconDTO iconDTO = this.starIcon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconDTO iconDTO = this.titleIcon;
                OrderProgressVO orderProgressVO = this.progress;
                IconDTO iconDTO2 = this.starIcon;
                String str = this.backgroundColor;
                AtomAction atomAction = this.clickAction;
                t tVar = this.tokenizedEvent;
                StringBuilder g10 = g.g("OrderTrackingNotification(title=", textDTO, ", subtitle=", textDTO2, ", titleIcon=");
                g10.append(iconDTO);
                g10.append(", progress=");
                g10.append(orderProgressVO);
                g10.append(", starIcon=");
                g10.append(iconDTO2);
                g10.append(", backgroundColor=");
                g10.append(str);
                g10.append(", clickAction=");
                return C2859b.e(tVar, ", tokenizedEvent=", ")", g10, atomAction);
            }
        }

        public /* synthetic */ NotificationCarouselItemVO(String str, AtomAction atomAction, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomAction, tVar);
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public AtomAction getClickAction() {
            return this.clickAction;
        }

        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        private NotificationCarouselItemVO(String str, AtomAction atomAction, t tVar) {
            this.backgroundColor = str;
            this.clickAction = atomAction;
            this.tokenizedEvent = tVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO;", "", "", "progress", "", "ringProgressColor", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "type", "<init>", "(FLjava/lang/String;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getProgress", "()F", "Ljava/lang/String;", "getRingProgressColor", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "getType", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "OrderProgressType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderProgressVO {
        private final float progress;

        @NotNull
        private final String ringProgressColor;

        @NotNull
        private final OrderProgressType type;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "", "Icon", "Text", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Icon;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Text;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface OrderProgressType {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Icon;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Icon implements OrderProgressType {

                @NotNull
                private final IconDTO icon;

                public Icon(@NotNull IconDTO icon) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.icon = icon;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Icon) && Intrinsics.d(this.icon, ((Icon) other).icon);
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                public int hashCode() {
                    return this.icon.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Icon(icon=" + this.icon + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType$Text;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$OrderProgressVO$OrderProgressType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Text implements OrderProgressType {

                @NotNull
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public Text(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return Intrinsics.d(this.title, text.title) && Intrinsics.d(this.subtitle, text.subtitle);
                }

                @NotNull
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + (this.title.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return a.b("Text(title=", this.title, ", subtitle=", this.subtitle, ")");
                }
            }
        }

        public OrderProgressVO(float f7, @NotNull String ringProgressColor, @NotNull OrderProgressType type) {
            Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
            Intrinsics.checkNotNullParameter(type, "type");
            this.progress = f7;
            this.ringProgressColor = ringProgressColor;
            this.type = type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderProgressVO)) {
                return false;
            }
            OrderProgressVO orderProgressVO = (OrderProgressVO) other;
            return Float.compare(this.progress, orderProgressVO.progress) == 0 && Intrinsics.d(this.ringProgressColor, orderProgressVO.ringProgressColor) && Intrinsics.d(this.type, orderProgressVO.type);
        }

        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final String getRingProgressColor() {
            return this.ringProgressColor;
        }

        @NotNull
        public final OrderProgressType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + G.g.a(Float.hashCode(this.progress) * 31, 31, this.ringProgressColor);
        }

        @NotNull
        public String toString() {
            return "OrderProgressVO(progress=" + this.progress + ", ringProgressColor=" + this.ringProgressColor + ", type=" + this.type + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "", "", "topPadding", "bottomPadding", "horizontalPadding", "betweenPadding", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPadding", "getBottomPadding", "getHorizontalPadding", "getBetweenPadding", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int betweenPadding;
        private final int bottomPadding;
        private final int horizontalPadding;
        private final int topPadding;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.topPadding = i11;
            this.bottomPadding = i12;
            this.horizontalPadding = i13;
            this.betweenPadding = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.topPadding == paddingsVO.topPadding && this.bottomPadding == paddingsVO.bottomPadding && this.horizontalPadding == paddingsVO.horizontalPadding && this.betweenPadding == paddingsVO.betweenPadding;
        }

        public final int getBetweenPadding() {
            return this.betweenPadding;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.betweenPadding) + C2454a.a(this.horizontalPadding, C2454a.a(this.bottomPadding, Integer.hashCode(this.topPadding) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.horizontalPadding, this.betweenPadding, ", betweenPadding=", ")", C2438a.a("PaddingsVO(topPadding=", this.topPadding, ", bottomPadding=", ", horizontalPadding=", this.bottomPadding));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCarouselV2VO(long j11, @NotNull List<? extends NotificationCarouselItemVO> items, long j12, @NotNull PaddingsVO paddings, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.items = items;
        this.updatePeriodSeconds = j12;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
        this.layoutManagerState = parcelable;
    }

    public static /* synthetic */ NotificationCarouselV2VO copy$default(NotificationCarouselV2VO notificationCarouselV2VO, long j11, List list, long j12, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = notificationCarouselV2VO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            list = notificationCarouselV2VO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            j12 = notificationCarouselV2VO.updatePeriodSeconds;
        }
        long j14 = j12;
        if ((i11 & 8) != 0) {
            paddingsVO = notificationCarouselV2VO.paddings;
        }
        return notificationCarouselV2VO.copy(j13, list2, j14, paddingsVO, (i11 & 16) != 0 ? notificationCarouselV2VO.tokenizedEvent : tVar, (i11 & 32) != 0 ? notificationCarouselV2VO.layoutManagerState : parcelable);
    }

    @NotNull
    public final NotificationCarouselV2VO copy(long id2, @NotNull List<? extends NotificationCarouselItemVO> items, long updatePeriodSeconds, @NotNull PaddingsVO paddings, t tokenizedEvent, Parcelable layoutManagerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new NotificationCarouselV2VO(id2, items, updatePeriodSeconds, paddings, tokenizedEvent, layoutManagerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationCarouselV2VO)) {
            return false;
        }
        NotificationCarouselV2VO notificationCarouselV2VO = (NotificationCarouselV2VO) other;
        return this.id == notificationCarouselV2VO.id && Intrinsics.d(this.items, notificationCarouselV2VO.items) && this.updatePeriodSeconds == notificationCarouselV2VO.updatePeriodSeconds && Intrinsics.d(this.paddings, notificationCarouselV2VO.paddings) && Intrinsics.d(this.tokenizedEvent, notificationCarouselV2VO.tokenizedEvent) && Intrinsics.d(this.layoutManagerState, notificationCarouselV2VO.layoutManagerState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<NotificationCarouselItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getUpdatePeriodSeconds() {
        return this.updatePeriodSeconds;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + Pk0.c.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.updatePeriodSeconds)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<NotificationCarouselItemVO> list = this.items;
        long j12 = this.updatePeriodSeconds;
        PaddingsVO paddingsVO = this.paddings;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.layoutManagerState;
        StringBuilder b11 = Lh.b.b(j11, "NotificationCarouselV2VO(id=", ", items=", list);
        C2942q.f(b11, ", updatePeriodSeconds=", j12, ", paddings=");
        b11.append(paddingsVO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ NotificationCarouselV2VO(long j11, List list, long j12, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, j12, paddingsVO, tVar, (i11 & 32) != 0 ? null : parcelable);
    }
}
