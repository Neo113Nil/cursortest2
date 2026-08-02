package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import B90.C2619v;
import Bl.C2639a;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/avatar/Avatar;", "logo", "description", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "unbindButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/avatar/Avatar;", "getLogo", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getDescription", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "getUnbindButton", "()Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "UnbindButtonVO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserSocialsMobileItemVO implements c {
    public static final int $stable;
    private final TextAtom description;
    private final long id;

    @NotNull
    private final Avatar logo;

    @NotNull
    private final TextAtom title;
    private final UnbindButtonVO unbindButton;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "confirmationData", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "getConfirmationData", "()Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "ConfirmationDataVO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnbindButtonVO {
        public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeBorderlessButton button;

        @NotNull
        private final ConfirmationDataVO confirmationData;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConfirmationDataVO {

            @NotNull
            private final String subtitle;

            @NotNull
            private final String title;

            public ConfirmationDataVO(@NotNull String title, @NotNull String subtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConfirmationDataVO)) {
                    return false;
                }
                ConfirmationDataVO confirmationDataVO = (ConfirmationDataVO) other;
                return Intrinsics.d(this.title, confirmationDataVO.title) && Intrinsics.d(this.subtitle, confirmationDataVO.subtitle);
            }

            @NotNull
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("ConfirmationDataVO(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        public UnbindButtonVO(@NotNull ButtonV3Atom.LargeBorderlessButton button, @NotNull ConfirmationDataVO confirmationData) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(confirmationData, "confirmationData");
            this.button = button;
            this.confirmationData = confirmationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnbindButtonVO)) {
                return false;
            }
            UnbindButtonVO unbindButtonVO = (UnbindButtonVO) other;
            return Intrinsics.d(this.button, unbindButtonVO.button) && Intrinsics.d(this.confirmationData, unbindButtonVO.confirmationData);
        }

        @NotNull
        public final ButtonV3Atom.LargeBorderlessButton getButton() {
            return this.button;
        }

        @NotNull
        public final ConfirmationDataVO getConfirmationData() {
            return this.confirmationData;
        }

        public int hashCode() {
            return this.confirmationData.hashCode() + (this.button.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UnbindButtonVO(button=" + this.button + ", confirmationData=" + this.confirmationData + ")";
        }
    }

    static {
        int i11 = ButtonV3Atom.LargeBorderlessButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | Avatar.$stable | i12;
    }

    public UserSocialsMobileItemVO(long j11, @NotNull TextAtom title, @NotNull Avatar logo, TextAtom textAtom, UnbindButtonVO unbindButtonVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.id = j11;
        this.title = title;
        this.logo = logo;
        this.description = textAtom;
        this.unbindButton = unbindButtonVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSocialsMobileItemVO)) {
            return false;
        }
        UserSocialsMobileItemVO userSocialsMobileItemVO = (UserSocialsMobileItemVO) other;
        return this.id == userSocialsMobileItemVO.id && Intrinsics.d(this.title, userSocialsMobileItemVO.title) && Intrinsics.d(this.logo, userSocialsMobileItemVO.logo) && Intrinsics.d(this.description, userSocialsMobileItemVO.description) && Intrinsics.d(this.unbindButton, userSocialsMobileItemVO.unbindButton);
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Avatar getLogo() {
        return this.logo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final UnbindButtonVO getUnbindButton() {
        return this.unbindButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.logo.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.title)) * 31;
        TextAtom textAtom = this.description;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        UnbindButtonVO unbindButtonVO = this.unbindButton;
        return hashCode2 + (unbindButtonVO != null ? unbindButtonVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        Avatar avatar = this.logo;
        TextAtom textAtom2 = this.description;
        UnbindButtonVO unbindButtonVO = this.unbindButton;
        StringBuilder c11 = C2639a.c("UserSocialsMobileItemVO(id=", j11, ", title=", textAtom);
        c11.append(", logo=");
        c11.append(avatar);
        c11.append(", description=");
        c11.append(textAtom2);
        c11.append(", unbindButton=");
        c11.append(unbindButtonVO);
        c11.append(")");
        return c11.toString();
    }
}
