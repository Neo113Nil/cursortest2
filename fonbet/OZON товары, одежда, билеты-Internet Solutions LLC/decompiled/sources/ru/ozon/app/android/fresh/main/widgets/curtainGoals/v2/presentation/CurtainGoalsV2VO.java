package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import Ak.C2436a;
import De.C2859b;
import G.g;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00016B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b2\u00101R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "progressState", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", DynamicElementDTO.LARGE_BUTTON, "termsButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "getProgressState", "()Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLargeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTermsButton", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ProgressState", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CurtainGoalsV2VO implements c {
    private final BadgeDTO badge;

    @NotNull
    private final TextDTO description;
    private final long id;

    @NotNull
    private final String image;
    private final ButtonV3DTO largeButton;
    private final ProgressState progressState;

    @NotNull
    private final ButtonV3DTO termsButton;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "", "", "progress", "Lru/ozon/uni/atoms/data/text/TextDTO;", "progressText", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getProgress", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getProgressText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressState {
        private final int progress;

        @NotNull
        private final TextDTO progressText;

        public ProgressState(int i11, @NotNull TextDTO progressText) {
            Intrinsics.checkNotNullParameter(progressText, "progressText");
            this.progress = i11;
            this.progressText = progressText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressState)) {
                return false;
            }
            ProgressState progressState = (ProgressState) other;
            return this.progress == progressState.progress && Intrinsics.d(this.progressText, progressState.progressText);
        }

        public final int getProgress() {
            return this.progress;
        }

        @NotNull
        public final TextDTO getProgressText() {
            return this.progressText;
        }

        public int hashCode() {
            return this.progressText.hashCode() + (Integer.hashCode(this.progress) * 31);
        }

        @NotNull
        public String toString() {
            return "ProgressState(progress=" + this.progress + ", progressText=" + this.progressText + ")";
        }
    }

    public CurtainGoalsV2VO(long j11, @NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, BadgeDTO badgeDTO, ProgressState progressState, ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO termsButton, t tVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(termsButton, "termsButton");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.description = description;
        this.badge = badgeDTO;
        this.progressState = progressState;
        this.largeButton = buttonV3DTO;
        this.termsButton = termsButton;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainGoalsV2VO)) {
            return false;
        }
        CurtainGoalsV2VO curtainGoalsV2VO = (CurtainGoalsV2VO) other;
        return this.id == curtainGoalsV2VO.id && Intrinsics.d(this.image, curtainGoalsV2VO.image) && Intrinsics.d(this.title, curtainGoalsV2VO.title) && Intrinsics.d(this.description, curtainGoalsV2VO.description) && Intrinsics.d(this.badge, curtainGoalsV2VO.badge) && Intrinsics.d(this.progressState, curtainGoalsV2VO.progressState) && Intrinsics.d(this.largeButton, curtainGoalsV2VO.largeButton) && Intrinsics.d(this.termsButton, curtainGoalsV2VO.termsButton) && Intrinsics.d(this.tokenizedEvent, curtainGoalsV2VO.tokenizedEvent);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final ButtonV3DTO getLargeButton() {
        return this.largeButton;
    }

    public final ProgressState getProgressState() {
        return this.progressState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getTermsButton() {
        return this.termsButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.description, b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.image), 31), 31);
        BadgeDTO badgeDTO = this.badge;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ProgressState progressState = this.progressState;
        int hashCode2 = (hashCode + (progressState == null ? 0 : progressState.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.largeButton;
        int c11 = C2859b.c(this.termsButton, (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        BadgeDTO badgeDTO = this.badge;
        ProgressState progressState = this.progressState;
        ButtonV3DTO buttonV3DTO = this.largeButton;
        ButtonV3DTO buttonV3DTO2 = this.termsButton;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "CurtainGoalsV2VO(id=", ", image=", str);
        D3.g.i(", title=", ", description=", c11, textDTO, textDTO2);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", progressState=");
        c11.append(progressState);
        c11.append(", largeButton=");
        c11.append(buttonV3DTO);
        c11.append(", termsButton=");
        c11.append(buttonV3DTO2);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
