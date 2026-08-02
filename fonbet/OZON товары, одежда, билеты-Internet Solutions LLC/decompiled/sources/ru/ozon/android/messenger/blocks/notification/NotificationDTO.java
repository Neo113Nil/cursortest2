package ru.ozon.android.messenger.blocks.notification;

import B90.C2616s;
import J0.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002/0Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J{\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTO;", "", "image", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "content", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "buttons", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO;", DynamicElementDTO.TIMER, "Lru/ozon/android/messenger/framework/data/modules/atoms/timerbadge/TimerBadge;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/android/messenger/framework/data/modules/atoms/timerbadge/TimerBadge;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;", "getBadges", "()Ljava/util/List;", "getContent", "getButtons", "getTimer", "()Lru/ozon/android/messenger/framework/data/modules/atoms/timerbadge/TimerBadge;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ImageDTO", "ButtonDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NotificationDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final List<Badge> badges;
    private final List<ButtonDTO> buttons;
    private final List<TextAtom> content;
    private final ImageDTO image;
    private final TimerBadge timer;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001b\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO;", "", "content", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "type", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Ljava/lang/String;)V", "getContent", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "getType", "()Ljava/lang/String;", "buttonAtom", "Small", "SmallBorderless", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO$Small;", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO$SmallBorderless;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ButtonDTO {
        public static final int $stable = ButtonV3Atom.$stable;
        private final ButtonV3Atom content;

        @NotNull
        private final String type;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO$Small;", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO;", "content", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getContent", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Small extends ButtonDTO {
            public static final int $stable = ButtonV3Atom.SmallButton.$stable;
            private final ButtonV3Atom.SmallButton content;

            public Small(ButtonV3Atom.SmallButton smallButton) {
                super(smallButton, AtomTypeImpl.SMALL_BUTTON.getValue(), null);
                this.content = smallButton;
            }

            public static /* synthetic */ Small copy$default(Small small, ButtonV3Atom.SmallButton smallButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    smallButton = small.content;
                }
                return small.copy(smallButton);
            }

            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.SmallButton getContent() {
                return this.content;
            }

            @NotNull
            public final Small copy(ButtonV3Atom.SmallButton content) {
                return new Small(content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Small) && Intrinsics.d(this.content, ((Small) other).content);
            }

            public int hashCode() {
                ButtonV3Atom.SmallButton smallButton = this.content;
                if (smallButton == null) {
                    return 0;
                }
                return smallButton.hashCode();
            }

            @NotNull
            public String toString() {
                return "Small(content=" + this.content + ")";
            }

            @Override // ru.ozon.android.messenger.blocks.notification.NotificationDTO.ButtonDTO
            public ButtonV3Atom.SmallButton getContent() {
                return this.content;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO$SmallBorderless;", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO;", "content", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getContent", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SmallBorderless extends ButtonDTO {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;
            private final ButtonV3Atom.SmallBorderlessButton content;

            public SmallBorderless(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                super(smallBorderlessButton, AtomTypeImpl.SMALL_BORDERLESS_BUTTON.getValue(), null);
                this.content = smallBorderlessButton;
            }

            public static /* synthetic */ SmallBorderless copy$default(SmallBorderless smallBorderless, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    smallBorderlessButton = smallBorderless.content;
                }
                return smallBorderless.copy(smallBorderlessButton);
            }

            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.SmallBorderlessButton getContent() {
                return this.content;
            }

            @NotNull
            public final SmallBorderless copy(ButtonV3Atom.SmallBorderlessButton content) {
                return new SmallBorderless(content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SmallBorderless) && Intrinsics.d(this.content, ((SmallBorderless) other).content);
            }

            public int hashCode() {
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.content;
                if (smallBorderlessButton == null) {
                    return 0;
                }
                return smallBorderlessButton.hashCode();
            }

            @NotNull
            public String toString() {
                return "SmallBorderless(content=" + this.content + ")";
            }

            @Override // ru.ozon.android.messenger.blocks.notification.NotificationDTO.ButtonDTO
            public ButtonV3Atom.SmallBorderlessButton getContent() {
                return this.content;
            }
        }

        public /* synthetic */ ButtonDTO(ButtonV3Atom buttonV3Atom, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(buttonV3Atom, str);
        }

        public final ButtonV3Atom buttonAtom() {
            return getContent();
        }

        public ButtonV3Atom getContent() {
            return this.content;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        private ButtonDTO(ButtonV3Atom buttonV3Atom, String str) {
            this.content = buttonV3Atom;
            this.type = str;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;", "", ImagesContract.URL, "", "width", "", "height", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageDTO {
        public static final int $stable = 0;
        private final Integer height;

        @NotNull
        private final String url;
        private final Integer width;

        public ImageDTO(@NotNull String url, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.width = num;
            this.height = num2;
        }

        public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageDTO.url;
            }
            if ((i11 & 2) != 0) {
                num = imageDTO.width;
            }
            if ((i11 & 4) != 0) {
                num2 = imageDTO.height;
            }
            return imageDTO.copy(str, num, num2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final ImageDTO copy(@NotNull String url, Integer width, Integer height) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ImageDTO(url, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageDTO)) {
                return false;
            }
            ImageDTO imageDTO = (ImageDTO) other;
            return Intrinsics.d(this.url, imageDTO.url) && Intrinsics.d(this.width, imageDTO.width) && Intrinsics.d(this.height, imageDTO.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Integer num = this.width;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.height;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            Integer num = this.width;
            return Ep.a.c(P.b("ImageDTO(url=", str, num, ", width=", ", height="), this.height, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationDTO(ImageDTO imageDTO, List<Badge> list, List<TextAtom> list2, List<? extends ButtonDTO> list3, TimerBadge timerBadge, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
        this.image = imageDTO;
        this.badges = list;
        this.content = list2;
        this.buttons = list3;
        this.timer = timerBadge;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ NotificationDTO copy$default(NotificationDTO notificationDTO, ImageDTO imageDTO, List list, List list2, List list3, TimerBadge timerBadge, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = notificationDTO.image;
        }
        if ((i11 & 2) != 0) {
            list = notificationDTO.badges;
        }
        if ((i11 & 4) != 0) {
            list2 = notificationDTO.content;
        }
        if ((i11 & 8) != 0) {
            list3 = notificationDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            timerBadge = notificationDTO.timer;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = notificationDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = notificationDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        TimerBadge timerBadge2 = timerBadge;
        List list4 = list2;
        return notificationDTO.copy(imageDTO, list, list4, list3, timerBadge2, atomActionDTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    public final List<Badge> component2() {
        return this.badges;
    }

    public final List<TextAtom> component3() {
        return this.content;
    }

    public final List<ButtonDTO> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final TimerBadge getTimer() {
        return this.timer;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, MessengerTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final NotificationDTO copy(ImageDTO image, List<Badge> badges, List<TextAtom> content, List<? extends ButtonDTO> buttons, TimerBadge timer, AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
        return new NotificationDTO(image, badges, content, buttons, timer, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDTO)) {
            return false;
        }
        NotificationDTO notificationDTO = (NotificationDTO) other;
        return Intrinsics.d(this.image, notificationDTO.image) && Intrinsics.d(this.badges, notificationDTO.badges) && Intrinsics.d(this.content, notificationDTO.content) && Intrinsics.d(this.buttons, notificationDTO.buttons) && Intrinsics.d(this.timer, notificationDTO.timer) && Intrinsics.d(this.action, notificationDTO.action) && Intrinsics.d(this.trackingInfo, notificationDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final List<ButtonDTO> getButtons() {
        return this.buttons;
    }

    public final List<TextAtom> getContent() {
        return this.content;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final TimerBadge getTimer() {
        return this.timer;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        List<Badge> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<TextAtom> list2 = this.content;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ButtonDTO> list3 = this.buttons;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TimerBadge timerBadge = this.timer;
        int hashCode5 = (hashCode4 + (timerBadge == null ? 0 : timerBadge.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        List<Badge> list = this.badges;
        List<TextAtom> list2 = this.content;
        List<ButtonDTO> list3 = this.buttons;
        TimerBadge timerBadge = this.timer;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("NotificationDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", badges=");
        sb2.append(list);
        sb2.append(", content=");
        C2616s.g(", buttons=", ", timer=", sb2, list2, list3);
        sb2.append(timerBadge);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return T7.P.f(sb2, map, ")");
    }
}
