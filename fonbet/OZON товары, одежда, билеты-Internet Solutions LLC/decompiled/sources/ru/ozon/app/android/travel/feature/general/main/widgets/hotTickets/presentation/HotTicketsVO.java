package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import B90.C2616s;
import G.g;
import Ns.b;
import Ul.C4070a;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001f !B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Ljava/lang/String;", "getAsyncData", "State", "LoadedState", "SkeletonState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotTicketsVO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b\u0011\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "tickets", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "backgroundImage", "image", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "widgetBorderColor", "", "isSingle", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitleImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getTickets", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getBackgroundImage", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getImage", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getWidgetBorderColor", "Z", "()Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadedState implements State {
        private final ThemeImageV1VO backgroundImage;
        private final ButtonV3DTO button;
        private final ThemeImageV1VO image;
        private final boolean isSingle;

        @NotNull
        private final List<TicketVO> tickets;

        @NotNull
        private final TextDTO title;
        private final ImageDTO titleImage;
        private final String widgetBorderColor;

        public LoadedState(ImageDTO imageDTO, @NotNull TextDTO title, @NotNull List<TicketVO> tickets, ThemeImageV1VO themeImageV1VO, ThemeImageV1VO themeImageV1VO2, ButtonV3DTO buttonV3DTO, String str, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tickets, "tickets");
            this.titleImage = imageDTO;
            this.title = title;
            this.tickets = tickets;
            this.backgroundImage = themeImageV1VO;
            this.image = themeImageV1VO2;
            this.button = buttonV3DTO;
            this.widgetBorderColor = str;
            this.isSingle = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedState)) {
                return false;
            }
            LoadedState loadedState = (LoadedState) other;
            return Intrinsics.d(this.titleImage, loadedState.titleImage) && Intrinsics.d(this.title, loadedState.title) && Intrinsics.d(this.tickets, loadedState.tickets) && Intrinsics.d(this.backgroundImage, loadedState.backgroundImage) && Intrinsics.d(this.image, loadedState.image) && Intrinsics.d(this.button, loadedState.button) && Intrinsics.d(this.widgetBorderColor, loadedState.widgetBorderColor) && this.isSingle == loadedState.isSingle;
        }

        public final ThemeImageV1VO getBackgroundImage() {
            return this.backgroundImage;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final ThemeImageV1VO getImage() {
            return this.image;
        }

        @NotNull
        public final List<TicketVO> getTickets() {
            return this.tickets;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final ImageDTO getTitleImage() {
            return this.titleImage;
        }

        public final String getWidgetBorderColor() {
            return this.widgetBorderColor;
        }

        public int hashCode() {
            ImageDTO imageDTO = this.titleImage;
            int b11 = g.b(b.a(this.title, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31), 31, this.tickets);
            ThemeImageV1VO themeImageV1VO = this.backgroundImage;
            int hashCode = (b11 + (themeImageV1VO == null ? 0 : themeImageV1VO.hashCode())) * 31;
            ThemeImageV1VO themeImageV1VO2 = this.image;
            int hashCode2 = (hashCode + (themeImageV1VO2 == null ? 0 : themeImageV1VO2.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str = this.widgetBorderColor;
            return Boolean.hashCode(this.isSingle) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        /* renamed from: isSingle, reason: from getter */
        public final boolean getIsSingle() {
            return this.isSingle;
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.titleImage;
            TextDTO textDTO = this.title;
            List<TicketVO> list = this.tickets;
            ThemeImageV1VO themeImageV1VO = this.backgroundImage;
            ThemeImageV1VO themeImageV1VO2 = this.image;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.widgetBorderColor;
            boolean z11 = this.isSingle;
            StringBuilder d11 = C2616s.d("LoadedState(titleImage=", imageDTO, ", title=", textDTO, ", tickets=");
            d11.append(list);
            d11.append(", backgroundImage=");
            d11.append(themeImageV1VO);
            d11.append(", image=");
            d11.append(themeImageV1VO2);
            d11.append(", button=");
            d11.append(buttonV3DTO);
            d11.append(", widgetBorderColor=");
            d11.append(str);
            d11.append(", isSingle=");
            d11.append(z11);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u0015R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$SkeletonState;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketSkeleton;", "skeletons", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "backgroundImage", "image", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "widgetBorderColor", "", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitleImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSkeletons", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getBackgroundImage", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getImage", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getWidgetBorderColor", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkeletonState implements State {
        private final Map<String, String> asyncParams;
        private final ThemeImageV1VO backgroundImage;
        private final ButtonV3DTO button;
        private final ThemeImageV1VO image;
        private final List<HotTicketSkeleton> skeletons;

        @NotNull
        private final TextDTO title;
        private final ImageDTO titleImage;
        private final String widgetBorderColor;

        public SkeletonState(ImageDTO imageDTO, @NotNull TextDTO title, List<HotTicketSkeleton> list, ThemeImageV1VO themeImageV1VO, ThemeImageV1VO themeImageV1VO2, ButtonV3DTO buttonV3DTO, String str, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.titleImage = imageDTO;
            this.title = title;
            this.skeletons = list;
            this.backgroundImage = themeImageV1VO;
            this.image = themeImageV1VO2;
            this.button = buttonV3DTO;
            this.widgetBorderColor = str;
            this.asyncParams = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkeletonState)) {
                return false;
            }
            SkeletonState skeletonState = (SkeletonState) other;
            return Intrinsics.d(this.titleImage, skeletonState.titleImage) && Intrinsics.d(this.title, skeletonState.title) && Intrinsics.d(this.skeletons, skeletonState.skeletons) && Intrinsics.d(this.backgroundImage, skeletonState.backgroundImage) && Intrinsics.d(this.image, skeletonState.image) && Intrinsics.d(this.button, skeletonState.button) && Intrinsics.d(this.widgetBorderColor, skeletonState.widgetBorderColor) && Intrinsics.d(this.asyncParams, skeletonState.asyncParams);
        }

        public final Map<String, String> getAsyncParams() {
            return this.asyncParams;
        }

        public final ThemeImageV1VO getBackgroundImage() {
            return this.backgroundImage;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final ThemeImageV1VO getImage() {
            return this.image;
        }

        public final List<HotTicketSkeleton> getSkeletons() {
            return this.skeletons;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final ImageDTO getTitleImage() {
            return this.titleImage;
        }

        public final String getWidgetBorderColor() {
            return this.widgetBorderColor;
        }

        public int hashCode() {
            ImageDTO imageDTO = this.titleImage;
            int a11 = b.a(this.title, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31);
            List<HotTicketSkeleton> list = this.skeletons;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            ThemeImageV1VO themeImageV1VO = this.backgroundImage;
            int hashCode2 = (hashCode + (themeImageV1VO == null ? 0 : themeImageV1VO.hashCode())) * 31;
            ThemeImageV1VO themeImageV1VO2 = this.image;
            int hashCode3 = (hashCode2 + (themeImageV1VO2 == null ? 0 : themeImageV1VO2.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str = this.widgetBorderColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.asyncParams;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.titleImage;
            TextDTO textDTO = this.title;
            List<HotTicketSkeleton> list = this.skeletons;
            ThemeImageV1VO themeImageV1VO = this.backgroundImage;
            ThemeImageV1VO themeImageV1VO2 = this.image;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.widgetBorderColor;
            Map<String, String> map = this.asyncParams;
            StringBuilder d11 = C2616s.d("SkeletonState(titleImage=", imageDTO, ", title=", textDTO, ", skeletons=");
            d11.append(list);
            d11.append(", backgroundImage=");
            d11.append(themeImageV1VO);
            d11.append(", image=");
            d11.append(themeImageV1VO2);
            d11.append(", button=");
            d11.append(buttonV3DTO);
            d11.append(", widgetBorderColor=");
            return C4070a.a(d11, str, ", asyncParams=", map, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$SkeletonState;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {
    }

    public HotTicketsVO(long j11, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ HotTicketsVO copy$default(HotTicketsVO hotTicketsVO, long j11, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hotTicketsVO.id;
        }
        if ((i11 & 2) != 0) {
            state = hotTicketsVO.state;
        }
        if ((i11 & 4) != 0) {
            str = hotTicketsVO.asyncData;
        }
        return hotTicketsVO.copy(j11, state, str);
    }

    @NotNull
    public final HotTicketsVO copy(long id2, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HotTicketsVO(id2, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotTicketsVO)) {
            return false;
        }
        HotTicketsVO hotTicketsVO = (HotTicketsVO) other;
        return this.id == hotTicketsVO.id && Intrinsics.d(this.state, hotTicketsVO.state) && Intrinsics.d(this.asyncData, hotTicketsVO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("HotTicketsVO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}
