package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import C.o0;
import De.C2859b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import Z1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0003234BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b\n\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "avatar", "", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;", "achievements", "", "isTooltipClosed", "", "backgroundColor", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "paddings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;Ljava/util/List;ZLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;LWZ/t;)V", "copy", "(JLru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;Ljava/util/List;ZLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "getAvatar", "()Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "Ljava/util/List;", "getAchievements", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AvatarVO", "AchievementVO", "PaddingsVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AvatarAchievementsVO implements c {
    private final List<AchievementVO> achievements;

    @NotNull
    private final AvatarVO avatar;

    @NotNull
    private final String backgroundColor;
    private final long id;
    private final boolean isTooltipClosed;

    @NotNull
    private final PaddingsVO paddings;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b(\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "defaultImage", "darkThemeImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "counter", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltip", "", "tooltipKey", "counterStrokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDefaultImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDarkThemeImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCounter", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "Ljava/lang/String;", "getTooltipKey", "getCounterStrokeColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AchievementVO {
        private final AtomAction clickAction;
        private final BadgeDTO counter;

        @NotNull
        private final String counterStrokeColor;
        private final ImageDTO darkThemeImage;

        @NotNull
        private final ImageDTO defaultImage;
        private final t tokenizedEvent;
        private final TooltipDTO tooltip;
        private final String tooltipKey;

        public AchievementVO(@NotNull ImageDTO defaultImage, ImageDTO imageDTO, BadgeDTO badgeDTO, TooltipDTO tooltipDTO, String str, @NotNull String counterStrokeColor, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(defaultImage, "defaultImage");
            Intrinsics.checkNotNullParameter(counterStrokeColor, "counterStrokeColor");
            this.defaultImage = defaultImage;
            this.darkThemeImage = imageDTO;
            this.counter = badgeDTO;
            this.tooltip = tooltipDTO;
            this.tooltipKey = str;
            this.counterStrokeColor = counterStrokeColor;
            this.clickAction = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AchievementVO)) {
                return false;
            }
            AchievementVO achievementVO = (AchievementVO) other;
            return Intrinsics.d(this.defaultImage, achievementVO.defaultImage) && Intrinsics.d(this.darkThemeImage, achievementVO.darkThemeImage) && Intrinsics.d(this.counter, achievementVO.counter) && Intrinsics.d(this.tooltip, achievementVO.tooltip) && Intrinsics.d(this.tooltipKey, achievementVO.tooltipKey) && Intrinsics.d(this.counterStrokeColor, achievementVO.counterStrokeColor) && Intrinsics.d(this.clickAction, achievementVO.clickAction) && Intrinsics.d(this.tokenizedEvent, achievementVO.tokenizedEvent);
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        public final BadgeDTO getCounter() {
            return this.counter;
        }

        @NotNull
        public final String getCounterStrokeColor() {
            return this.counterStrokeColor;
        }

        public final ImageDTO getDarkThemeImage() {
            return this.darkThemeImage;
        }

        @NotNull
        public final ImageDTO getDefaultImage() {
            return this.defaultImage;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        public int hashCode() {
            int hashCode = this.defaultImage.hashCode() * 31;
            ImageDTO imageDTO = this.darkThemeImage;
            int hashCode2 = (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.counter;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TooltipDTO tooltipDTO = this.tooltip;
            int hashCode4 = (hashCode3 + (tooltipDTO == null ? 0 : tooltipDTO.hashCode())) * 31;
            String str = this.tooltipKey;
            int a11 = g.a((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.counterStrokeColor);
            AtomAction atomAction = this.clickAction;
            int hashCode5 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.defaultImage;
            ImageDTO imageDTO2 = this.darkThemeImage;
            BadgeDTO badgeDTO = this.counter;
            TooltipDTO tooltipDTO = this.tooltip;
            String str = this.tooltipKey;
            String str2 = this.counterStrokeColor;
            AtomAction atomAction = this.clickAction;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("AchievementVO(defaultImage=");
            sb2.append(imageDTO);
            sb2.append(", darkThemeImage=");
            sb2.append(imageDTO2);
            sb2.append(", counter=");
            sb2.append(badgeDTO);
            sb2.append(", tooltip=");
            sb2.append(tooltipDTO);
            sb2.append(", tooltipKey=");
            a.h(sb2, str, ", counterStrokeColor=", str2, ", clickAction=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", sb2, atomAction);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "isTopAuthor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AvatarVO {
        private final BadgeDTO badge;
        private final AtomAction clickAction;

        @NotNull
        private final IconDTO icon;
        private final boolean isTopAuthor;
        private final t tokenizedEvent;

        public AvatarVO(@NotNull IconDTO icon, AtomAction atomAction, BadgeDTO badgeDTO, boolean z11, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.clickAction = atomAction;
            this.badge = badgeDTO;
            this.isTopAuthor = z11;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AvatarVO)) {
                return false;
            }
            AvatarVO avatarVO = (AvatarVO) other;
            return Intrinsics.d(this.icon, avatarVO.icon) && Intrinsics.d(this.clickAction, avatarVO.clickAction) && Intrinsics.d(this.badge, avatarVO.badge) && this.isTopAuthor == avatarVO.isTopAuthor && Intrinsics.d(this.tokenizedEvent, avatarVO.tokenizedEvent);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomAction atomAction = this.clickAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int a11 = C3532b.a((hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.isTopAuthor);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isTopAuthor, reason: from getter */
        public final boolean getIsTopAuthor() {
            return this.isTopAuthor;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            AtomAction atomAction = this.clickAction;
            BadgeDTO badgeDTO = this.badge;
            boolean z11 = this.isTopAuthor;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("AvatarVO(icon=");
            sb2.append(iconDTO);
            sb2.append(", clickAction=");
            sb2.append(atomAction);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", isTopAuthor=");
            sb2.append(z11);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "", "LZ1/h;", "leftPadding", "rightPadding", "intersectionPadding", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getLeftPadding-D9Ej5fM", "()F", "getRightPadding-D9Ej5fM", "getIntersectionPadding-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final float intersectionPadding;
        private final float leftPadding;
        private final float rightPadding;

        public /* synthetic */ PaddingsVO(float f7, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, f12);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return h.b(this.leftPadding, paddingsVO.leftPadding) && h.b(this.rightPadding, paddingsVO.rightPadding) && h.b(this.intersectionPadding, paddingsVO.intersectionPadding);
        }

        /* renamed from: getIntersectionPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getIntersectionPadding() {
            return this.intersectionPadding;
        }

        /* renamed from: getLeftPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: getRightPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRightPadding() {
            return this.rightPadding;
        }

        public int hashCode() {
            return Float.hashCode(this.intersectionPadding) + Pk0.b.a(this.rightPadding, Float.hashCode(this.leftPadding) * 31, 31);
        }

        @NotNull
        public String toString() {
            String c11 = h.c(this.leftPadding);
            String c12 = h.c(this.rightPadding);
            return o0.c(C3660k.d("PaddingsVO(leftPadding=", c11, ", rightPadding=", c12, ", intersectionPadding="), h.c(this.intersectionPadding), ")");
        }

        private PaddingsVO(float f7, float f11, float f12) {
            this.leftPadding = f7;
            this.rightPadding = f11;
            this.intersectionPadding = f12;
        }
    }

    public AvatarAchievementsVO(long j11, @NotNull AvatarVO avatar, List<AchievementVO> list, boolean z11, @NotNull String backgroundColor, @NotNull PaddingsVO paddings, t tVar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.avatar = avatar;
        this.achievements = list;
        this.isTooltipClosed = z11;
        this.backgroundColor = backgroundColor;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ AvatarAchievementsVO copy$default(AvatarAchievementsVO avatarAchievementsVO, long j11, AvatarVO avatarVO, List list, boolean z11, String str, PaddingsVO paddingsVO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = avatarAchievementsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            avatarVO = avatarAchievementsVO.avatar;
        }
        AvatarVO avatarVO2 = avatarVO;
        if ((i11 & 4) != 0) {
            list = avatarAchievementsVO.achievements;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            z11 = avatarAchievementsVO.isTooltipClosed;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            str = avatarAchievementsVO.backgroundColor;
        }
        return avatarAchievementsVO.copy(j12, avatarVO2, list2, z12, str, (i11 & 32) != 0 ? avatarAchievementsVO.paddings : paddingsVO, (i11 & 64) != 0 ? avatarAchievementsVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final AvatarAchievementsVO copy(long id2, @NotNull AvatarVO avatar, List<AchievementVO> achievements, boolean isTooltipClosed, @NotNull String backgroundColor, @NotNull PaddingsVO paddings, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new AvatarAchievementsVO(id2, avatar, achievements, isTooltipClosed, backgroundColor, paddings, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarAchievementsVO)) {
            return false;
        }
        AvatarAchievementsVO avatarAchievementsVO = (AvatarAchievementsVO) other;
        return this.id == avatarAchievementsVO.id && Intrinsics.d(this.avatar, avatarAchievementsVO.avatar) && Intrinsics.d(this.achievements, avatarAchievementsVO.achievements) && this.isTooltipClosed == avatarAchievementsVO.isTooltipClosed && Intrinsics.d(this.backgroundColor, avatarAchievementsVO.backgroundColor) && Intrinsics.d(this.paddings, avatarAchievementsVO.paddings) && Intrinsics.d(this.tokenizedEvent, avatarAchievementsVO.tokenizedEvent);
    }

    public final List<AchievementVO> getAchievements() {
        return this.achievements;
    }

    @NotNull
    public final AvatarVO getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
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
        int hashCode = (this.avatar.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        List<AchievementVO> list = this.achievements;
        int hashCode2 = (this.paddings.hashCode() + g.a(C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.isTooltipClosed), 31, this.backgroundColor)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isTooltipClosed, reason: from getter */
    public final boolean getIsTooltipClosed() {
        return this.isTooltipClosed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AvatarVO avatarVO = this.avatar;
        List<AchievementVO> list = this.achievements;
        boolean z11 = this.isTooltipClosed;
        String str = this.backgroundColor;
        PaddingsVO paddingsVO = this.paddings;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("AvatarAchievementsVO(id=");
        sb2.append(j11);
        sb2.append(", avatar=");
        sb2.append(avatarVO);
        AZ.c.c(sb2, ", achievements=", list, ", isTooltipClosed=", z11);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", paddings=");
        sb2.append(paddingsVO);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
