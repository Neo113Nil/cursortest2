package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import B4.V;
import B6.b;
import D3.g;
import De.C2859b;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003234BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b,\u0010(R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "flights", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addFlight", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "passenger", "submitButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "isUpdatedFromRemote", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Z)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Z)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getFlights", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddFlight", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "getPassenger", "()Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "getSubmitButton", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "Flight", "Field", "Content", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaComplexSearchFormVO implements c {
    private final ButtonV3DTO addFlight;

    @NotNull
    private final List<Flight> flights;
    private final long id;
    private final boolean isUpdatedFromRemote;

    @NotNull
    private final IconFieldVO passenger;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final t viewEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction clickAction;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Content(@NotNull TextDTO title, TextDTO textDTO, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.clickAction = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.title, content.title) && Intrinsics.d(this.subtitle, content.subtitle) && Intrinsics.d(this.clickAction, content.clickAction);
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
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
            AtomAction atomAction = this.clickAction;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return b.b(g.g("Content(title=", textDTO, ", subtitle=", textDTO2, ", clickAction="), this.clickAction, ")");
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b%\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "leftValue", "rightValue", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "errorMessage", "", "borderColor", "backgroundColor", "", "cornerRadius", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "getLeftValue", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "getRightValue", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getErrorMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "F", "getCornerRadius", "()F", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Field {
        public static final int $stable;

        @NotNull
        private final String backgroundColor;
        private final String borderColor;
        private final float cornerRadius;
        private final TextDTO errorMessage;
        private final IconDTO icon;

        @NotNull
        private final Content leftValue;
        private final Content rightValue;

        static {
            int i11 = IconDTO.$stable;
            int i12 = AtomAction.$stable;
            $stable = i11 | i12 | i12;
        }

        public Field(@NotNull Content leftValue, Content content, IconDTO iconDTO, TextDTO textDTO, String str, @NotNull String backgroundColor, float f7) {
            Intrinsics.checkNotNullParameter(leftValue, "leftValue");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.leftValue = leftValue;
            this.rightValue = content;
            this.icon = iconDTO;
            this.errorMessage = textDTO;
            this.borderColor = str;
            this.backgroundColor = backgroundColor;
            this.cornerRadius = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.d(this.leftValue, field.leftValue) && Intrinsics.d(this.rightValue, field.rightValue) && Intrinsics.d(this.icon, field.icon) && Intrinsics.d(this.errorMessage, field.errorMessage) && Intrinsics.d(this.borderColor, field.borderColor) && Intrinsics.d(this.backgroundColor, field.backgroundColor) && Float.compare(this.cornerRadius, field.cornerRadius) == 0;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final TextDTO getErrorMessage() {
            return this.errorMessage;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final Content getLeftValue() {
            return this.leftValue;
        }

        public final Content getRightValue() {
            return this.rightValue;
        }

        public int hashCode() {
            int hashCode = this.leftValue.hashCode() * 31;
            Content content = this.rightValue;
            int hashCode2 = (hashCode + (content == null ? 0 : content.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.errorMessage;
            int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.borderColor;
            return Float.hashCode(this.cornerRadius) + G.g.a((hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            Content content = this.leftValue;
            Content content2 = this.rightValue;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.errorMessage;
            String str = this.borderColor;
            String str2 = this.backgroundColor;
            float f7 = this.cornerRadius;
            StringBuilder sb2 = new StringBuilder("Field(leftValue=");
            sb2.append(content);
            sb2.append(", rightValue=");
            sb2.append(content2);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", errorMessage=");
            sb2.append(textDTO);
            sb2.append(", borderColor=");
            a.h(sb2, str, ", backgroundColor=", str2, ", cornerRadius=");
            return V.b(f7, ")", sb2);
        }
    }

    public AviaComplexSearchFormVO(long j11, @NotNull List<Flight> flights, ButtonV3DTO buttonV3DTO, @NotNull IconFieldVO passenger, @NotNull ButtonV3DTO submitButton, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.flights = flights;
        this.addFlight = buttonV3DTO;
        this.passenger = passenger;
        this.submitButton = submitButton;
        this.viewEvent = tVar;
        this.isUpdatedFromRemote = z11;
    }

    public static /* synthetic */ AviaComplexSearchFormVO copy$default(AviaComplexSearchFormVO aviaComplexSearchFormVO, long j11, List list, ButtonV3DTO buttonV3DTO, IconFieldVO iconFieldVO, ButtonV3DTO buttonV3DTO2, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aviaComplexSearchFormVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = aviaComplexSearchFormVO.flights;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            buttonV3DTO = aviaComplexSearchFormVO.addFlight;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            iconFieldVO = aviaComplexSearchFormVO.passenger;
        }
        IconFieldVO iconFieldVO2 = iconFieldVO;
        if ((i11 & 16) != 0) {
            buttonV3DTO2 = aviaComplexSearchFormVO.submitButton;
        }
        return aviaComplexSearchFormVO.copy(j12, list2, buttonV3DTO3, iconFieldVO2, buttonV3DTO2, (i11 & 32) != 0 ? aviaComplexSearchFormVO.viewEvent : tVar, (i11 & 64) != 0 ? aviaComplexSearchFormVO.isUpdatedFromRemote : z11);
    }

    @NotNull
    public final AviaComplexSearchFormVO copy(long id2, @NotNull List<Flight> flights, ButtonV3DTO addFlight, @NotNull IconFieldVO passenger, @NotNull ButtonV3DTO submitButton, t viewEvent, boolean isUpdatedFromRemote) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        Intrinsics.checkNotNullParameter(passenger, "passenger");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new AviaComplexSearchFormVO(id2, flights, addFlight, passenger, submitButton, viewEvent, isUpdatedFromRemote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaComplexSearchFormVO)) {
            return false;
        }
        AviaComplexSearchFormVO aviaComplexSearchFormVO = (AviaComplexSearchFormVO) other;
        return this.id == aviaComplexSearchFormVO.id && Intrinsics.d(this.flights, aviaComplexSearchFormVO.flights) && Intrinsics.d(this.addFlight, aviaComplexSearchFormVO.addFlight) && Intrinsics.d(this.passenger, aviaComplexSearchFormVO.passenger) && Intrinsics.d(this.submitButton, aviaComplexSearchFormVO.submitButton) && Intrinsics.d(this.viewEvent, aviaComplexSearchFormVO.viewEvent) && this.isUpdatedFromRemote == aviaComplexSearchFormVO.isUpdatedFromRemote;
    }

    public final ButtonV3DTO getAddFlight() {
        return this.addFlight;
    }

    @NotNull
    public final List<Flight> getFlights() {
        return this.flights;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final IconFieldVO getPassenger() {
        return this.passenger;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = G.g.b(Long.hashCode(this.id) * 31, 31, this.flights);
        ButtonV3DTO buttonV3DTO = this.addFlight;
        int c11 = C2859b.c(this.submitButton, (this.passenger.hashCode() + ((b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31)) * 31, 31);
        t tVar = this.viewEvent;
        return Boolean.hashCode(this.isUpdatedFromRemote) + ((c11 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isUpdatedFromRemote, reason: from getter */
    public final boolean getIsUpdatedFromRemote() {
        return this.isUpdatedFromRemote;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Flight> list = this.flights;
        ButtonV3DTO buttonV3DTO = this.addFlight;
        IconFieldVO iconFieldVO = this.passenger;
        ButtonV3DTO buttonV3DTO2 = this.submitButton;
        t tVar = this.viewEvent;
        boolean z11 = this.isUpdatedFromRemote;
        StringBuilder b11 = Lh.b.b(j11, "AviaComplexSearchFormVO(id=", ", flights=", list);
        b11.append(", addFlight=");
        b11.append(buttonV3DTO);
        b11.append(", passenger=");
        b11.append(iconFieldVO);
        b11.append(", submitButton=");
        b11.append(buttonV3DTO2);
        b11.append(", viewEvent=");
        b11.append(tVar);
        return Bi.b.f(b11, ", isUpdatedFromRemote=", z11, ")");
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "direction", "date", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteButton", "", "isSwiped", "isAnimateItem", "<init>", "(ILru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZ)V", "copy", "(ILru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "getDirection", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "getDate", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Flight {
        public static final int $stable;

        @NotNull
        private final Field date;
        private final IconButtonV3DTO deleteButton;

        @NotNull
        private final Field direction;
        private final int id;
        private final boolean isAnimateItem;
        private final boolean isSwiped;

        static {
            int i11 = IconButtonV3DTO.$stable;
            int i12 = IconDTO.$stable;
            int i13 = AtomAction.$stable;
            $stable = i11 | i12 | i13 | i13 | i12 | i13 | i13;
        }

        public Flight(int i11, @NotNull Field direction, @NotNull Field date, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(date, "date");
            this.id = i11;
            this.direction = direction;
            this.date = date;
            this.deleteButton = iconButtonV3DTO;
            this.isSwiped = z11;
            this.isAnimateItem = z12;
        }

        public static /* synthetic */ Flight copy$default(Flight flight, int i11, Field field, Field field2, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = flight.id;
            }
            if ((i12 & 2) != 0) {
                field = flight.direction;
            }
            if ((i12 & 4) != 0) {
                field2 = flight.date;
            }
            if ((i12 & 8) != 0) {
                iconButtonV3DTO = flight.deleteButton;
            }
            if ((i12 & 16) != 0) {
                z11 = flight.isSwiped;
            }
            if ((i12 & 32) != 0) {
                z12 = flight.isAnimateItem;
            }
            boolean z13 = z11;
            boolean z14 = z12;
            return flight.copy(i11, field, field2, iconButtonV3DTO, z13, z14);
        }

        @NotNull
        public final Flight copy(int id2, @NotNull Field direction, @NotNull Field date, IconButtonV3DTO deleteButton, boolean isSwiped, boolean isAnimateItem) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(date, "date");
            return new Flight(id2, direction, date, deleteButton, isSwiped, isAnimateItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flight)) {
                return false;
            }
            Flight flight = (Flight) other;
            return this.id == flight.id && Intrinsics.d(this.direction, flight.direction) && Intrinsics.d(this.date, flight.date) && Intrinsics.d(this.deleteButton, flight.deleteButton) && this.isSwiped == flight.isSwiped && this.isAnimateItem == flight.isAnimateItem;
        }

        @NotNull
        public final Field getDate() {
            return this.date;
        }

        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        @NotNull
        public final Field getDirection() {
            return this.direction;
        }

        public int hashCode() {
            int hashCode = (this.date.hashCode() + ((this.direction.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
            return Boolean.hashCode(this.isAnimateItem) + C3532b.a((hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.isSwiped);
        }

        /* renamed from: isAnimateItem, reason: from getter */
        public final boolean getIsAnimateItem() {
            return this.isAnimateItem;
        }

        /* renamed from: isSwiped, reason: from getter */
        public final boolean getIsSwiped() {
            return this.isSwiped;
        }

        @NotNull
        public String toString() {
            return "Flight(id=" + this.id + ", direction=" + this.direction + ", date=" + this.date + ", deleteButton=" + this.deleteButton + ", isSwiped=" + this.isSwiped + ", isAnimateItem=" + this.isAnimateItem + ")";
        }

        public /* synthetic */ Flight(int i11, Field field, Field field2, IconButtonV3DTO iconButtonV3DTO, boolean z11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, field, field2, iconButtonV3DTO, (i12 & 16) != 0 ? false : z11, z12);
        }
    }

    public /* synthetic */ AviaComplexSearchFormVO(long j11, List list, ButtonV3DTO buttonV3DTO, IconFieldVO iconFieldVO, ButtonV3DTO buttonV3DTO2, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, buttonV3DTO, iconFieldVO, buttonV3DTO2, tVar, (i11 & 64) != 0 ? true : z11);
    }
}
