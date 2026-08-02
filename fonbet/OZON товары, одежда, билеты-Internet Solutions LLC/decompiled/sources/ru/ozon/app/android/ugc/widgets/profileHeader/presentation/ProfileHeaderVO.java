package ru.ozon.app.android.ugc.widgets.profileHeader.presentation;

import D3.g;
import De.C2859b;
import El.C2971a;
import Kk.C3532b;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001BBw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019J\u009a\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b:\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b\u0013\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\bA\u00101¨\u0006C"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatar", "Lru/ozon/uni/atoms/af/AtomAction;", "avatarAction", "LWZ/t;", "avatarTokenizedEvent", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "leftCount", "middleCount", "rightCount", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "shareButton", "settingsButton", "", "isSubscribeState", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "subscribeButton", "unsubscribeButton", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAvatarAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getAvatarTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "getLeftCount", "()Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "getMiddleCount", "getRightCount", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getShareButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSettingsButton", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getUnsubscribeButton", "getTokenizedEvent", "ProfileHeaderStatVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileHeaderVO implements c {

    @NotNull
    private final IconDTO avatar;
    private final AtomAction avatarAction;
    private final t avatarTokenizedEvent;
    private final long id;
    private final boolean isSubscribeState;

    @NotNull
    private final ProfileHeaderStatVO leftCount;

    @NotNull
    private final ProfileHeaderStatVO middleCount;

    @NotNull
    private final ProfileHeaderStatVO rightCount;
    private final IconButtonV3DTO settingsButton;

    @NotNull
    private final IconButtonV3DTO shareButton;

    @NotNull
    private final ButtonV3DTO subscribeButton;
    private final t tokenizedEvent;

    @NotNull
    private final ButtonV3DTO unsubscribeButton;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/presentation/ProfileHeaderVO$ProfileHeaderStatVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "blockNumber", "blockTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "blockAction", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getBlockNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBlockTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getBlockAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileHeaderStatVO {
        private final AtomAction blockAction;

        @NotNull
        private final TextDTO blockNumber;

        @NotNull
        private final TextDTO blockTitle;
        private final t tokenizedEvent;

        public ProfileHeaderStatVO(@NotNull TextDTO blockNumber, @NotNull TextDTO blockTitle, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(blockNumber, "blockNumber");
            Intrinsics.checkNotNullParameter(blockTitle, "blockTitle");
            this.blockNumber = blockNumber;
            this.blockTitle = blockTitle;
            this.blockAction = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileHeaderStatVO)) {
                return false;
            }
            ProfileHeaderStatVO profileHeaderStatVO = (ProfileHeaderStatVO) other;
            return Intrinsics.d(this.blockNumber, profileHeaderStatVO.blockNumber) && Intrinsics.d(this.blockTitle, profileHeaderStatVO.blockTitle) && Intrinsics.d(this.blockAction, profileHeaderStatVO.blockAction) && Intrinsics.d(this.tokenizedEvent, profileHeaderStatVO.tokenizedEvent);
        }

        public final AtomAction getBlockAction() {
            return this.blockAction;
        }

        @NotNull
        public final TextDTO getBlockNumber() {
            return this.blockNumber;
        }

        @NotNull
        public final TextDTO getBlockTitle() {
            return this.blockTitle;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = b.a(this.blockTitle, this.blockNumber.hashCode() * 31, 31);
            AtomAction atomAction = this.blockAction;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.blockNumber;
            TextDTO textDTO2 = this.blockTitle;
            return C2859b.e(this.tokenizedEvent, ", tokenizedEvent=", ")", g.g("ProfileHeaderStatVO(blockNumber=", textDTO, ", blockTitle=", textDTO2, ", blockAction="), this.blockAction);
        }
    }

    public ProfileHeaderVO(long j11, @NotNull IconDTO avatar, AtomAction atomAction, t tVar, @NotNull ProfileHeaderStatVO leftCount, @NotNull ProfileHeaderStatVO middleCount, @NotNull ProfileHeaderStatVO rightCount, @NotNull IconButtonV3DTO shareButton, IconButtonV3DTO iconButtonV3DTO, boolean z11, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO unsubscribeButton, t tVar2) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(leftCount, "leftCount");
        Intrinsics.checkNotNullParameter(middleCount, "middleCount");
        Intrinsics.checkNotNullParameter(rightCount, "rightCount");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        this.id = j11;
        this.avatar = avatar;
        this.avatarAction = atomAction;
        this.avatarTokenizedEvent = tVar;
        this.leftCount = leftCount;
        this.middleCount = middleCount;
        this.rightCount = rightCount;
        this.shareButton = shareButton;
        this.settingsButton = iconButtonV3DTO;
        this.isSubscribeState = z11;
        this.subscribeButton = subscribeButton;
        this.unsubscribeButton = unsubscribeButton;
        this.tokenizedEvent = tVar2;
    }

    @NotNull
    public final ProfileHeaderVO copy(long id2, @NotNull IconDTO avatar, AtomAction avatarAction, t avatarTokenizedEvent, @NotNull ProfileHeaderStatVO leftCount, @NotNull ProfileHeaderStatVO middleCount, @NotNull ProfileHeaderStatVO rightCount, @NotNull IconButtonV3DTO shareButton, IconButtonV3DTO settingsButton, boolean isSubscribeState, @NotNull ButtonV3DTO subscribeButton, @NotNull ButtonV3DTO unsubscribeButton, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(leftCount, "leftCount");
        Intrinsics.checkNotNullParameter(middleCount, "middleCount");
        Intrinsics.checkNotNullParameter(rightCount, "rightCount");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
        return new ProfileHeaderVO(id2, avatar, avatarAction, avatarTokenizedEvent, leftCount, middleCount, rightCount, shareButton, settingsButton, isSubscribeState, subscribeButton, unsubscribeButton, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileHeaderVO)) {
            return false;
        }
        ProfileHeaderVO profileHeaderVO = (ProfileHeaderVO) other;
        return this.id == profileHeaderVO.id && Intrinsics.d(this.avatar, profileHeaderVO.avatar) && Intrinsics.d(this.avatarAction, profileHeaderVO.avatarAction) && Intrinsics.d(this.avatarTokenizedEvent, profileHeaderVO.avatarTokenizedEvent) && Intrinsics.d(this.leftCount, profileHeaderVO.leftCount) && Intrinsics.d(this.middleCount, profileHeaderVO.middleCount) && Intrinsics.d(this.rightCount, profileHeaderVO.rightCount) && Intrinsics.d(this.shareButton, profileHeaderVO.shareButton) && Intrinsics.d(this.settingsButton, profileHeaderVO.settingsButton) && this.isSubscribeState == profileHeaderVO.isSubscribeState && Intrinsics.d(this.subscribeButton, profileHeaderVO.subscribeButton) && Intrinsics.d(this.unsubscribeButton, profileHeaderVO.unsubscribeButton) && Intrinsics.d(this.tokenizedEvent, profileHeaderVO.tokenizedEvent);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    public final AtomAction getAvatarAction() {
        return this.avatarAction;
    }

    public final t getAvatarTokenizedEvent() {
        return this.avatarTokenizedEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProfileHeaderStatVO getLeftCount() {
        return this.leftCount;
    }

    @NotNull
    public final ProfileHeaderStatVO getMiddleCount() {
        return this.middleCount;
    }

    @NotNull
    public final ProfileHeaderStatVO getRightCount() {
        return this.rightCount;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final IconButtonV3DTO getSettingsButton() {
        return this.settingsButton;
    }

    @NotNull
    public final IconButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    @NotNull
    public final ButtonV3DTO getSubscribeButton() {
        return this.subscribeButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final ButtonV3DTO getUnsubscribeButton() {
        return this.unsubscribeButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2971a.a(this.avatar, Long.hashCode(this.id) * 31, 31);
        AtomAction atomAction = this.avatarAction;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.avatarTokenizedEvent;
        int c11 = GR.b.c(this.shareButton, (this.rightCount.hashCode() + ((this.middleCount.hashCode() + ((this.leftCount.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.settingsButton;
        int c12 = C2859b.c(this.unsubscribeButton, C2859b.c(this.subscribeButton, C3532b.a((c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.isSubscribeState), 31), 31);
        t tVar2 = this.tokenizedEvent;
        return c12 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    /* renamed from: isSubscribeState, reason: from getter */
    public final boolean getIsSubscribeState() {
        return this.isSubscribeState;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatar;
        AtomAction atomAction = this.avatarAction;
        t tVar = this.avatarTokenizedEvent;
        ProfileHeaderStatVO profileHeaderStatVO = this.leftCount;
        ProfileHeaderStatVO profileHeaderStatVO2 = this.middleCount;
        ProfileHeaderStatVO profileHeaderStatVO3 = this.rightCount;
        IconButtonV3DTO iconButtonV3DTO = this.shareButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.settingsButton;
        boolean z11 = this.isSubscribeState;
        ButtonV3DTO buttonV3DTO = this.subscribeButton;
        ButtonV3DTO buttonV3DTO2 = this.unsubscribeButton;
        t tVar2 = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("ProfileHeaderVO(id=", j11, ", avatar=", iconDTO);
        Fj.c.e(tVar, ", avatarAction=", ", avatarTokenizedEvent=", b11, atomAction);
        b11.append(", leftCount=");
        b11.append(profileHeaderStatVO);
        b11.append(", middleCount=");
        b11.append(profileHeaderStatVO2);
        b11.append(", rightCount=");
        b11.append(profileHeaderStatVO3);
        b11.append(", shareButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", settingsButton=");
        b11.append(iconButtonV3DTO2);
        b11.append(", isSubscribeState=");
        b11.append(z11);
        b11.append(", subscribeButton=");
        b11.append(buttonV3DTO);
        b11.append(", unsubscribeButton=");
        b11.append(buttonV3DTO2);
        return a.b(b11, ", tokenizedEvent=", tVar2, ")");
    }
}
