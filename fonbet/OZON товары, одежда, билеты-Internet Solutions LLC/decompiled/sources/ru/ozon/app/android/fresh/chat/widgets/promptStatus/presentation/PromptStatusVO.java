package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import El.C2971a;
import G.g;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b)\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "loadingIcon", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "loadingTitles", "textSwitchingTime", "errorIcon", "errorTitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "refreshButton", "Lru/ozon/uni/atoms/af/AtomAction;", "checkStatusAction", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLoadingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/util/List;", "getLoadingTitles", "()Ljava/util/List;", "getTextSwitchingTime", "getErrorIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getErrorTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRefreshButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCheckStatusAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromptStatusVO implements c {
    private final AtomAction checkStatusAction;
    private final IconDTO errorIcon;

    @NotNull
    private final TextDTO errorTitle;
    private final long id;

    @NotNull
    private final IconDTO loadingIcon;

    @NotNull
    private final List<TextDTO> loadingTitles;
    private final IconButtonV3DTO refreshButton;
    private final long textSwitchingTime;
    private final t tokenizedEvent;

    public PromptStatusVO(long j11, @NotNull IconDTO loadingIcon, @NotNull List<TextDTO> loadingTitles, long j12, IconDTO iconDTO, @NotNull TextDTO errorTitle, IconButtonV3DTO iconButtonV3DTO, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(loadingIcon, "loadingIcon");
        Intrinsics.checkNotNullParameter(loadingTitles, "loadingTitles");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        this.id = j11;
        this.loadingIcon = loadingIcon;
        this.loadingTitles = loadingTitles;
        this.textSwitchingTime = j12;
        this.errorIcon = iconDTO;
        this.errorTitle = errorTitle;
        this.refreshButton = iconButtonV3DTO;
        this.checkStatusAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptStatusVO)) {
            return false;
        }
        PromptStatusVO promptStatusVO = (PromptStatusVO) other;
        return this.id == promptStatusVO.id && Intrinsics.d(this.loadingIcon, promptStatusVO.loadingIcon) && Intrinsics.d(this.loadingTitles, promptStatusVO.loadingTitles) && this.textSwitchingTime == promptStatusVO.textSwitchingTime && Intrinsics.d(this.errorIcon, promptStatusVO.errorIcon) && Intrinsics.d(this.errorTitle, promptStatusVO.errorTitle) && Intrinsics.d(this.refreshButton, promptStatusVO.refreshButton) && Intrinsics.d(this.checkStatusAction, promptStatusVO.checkStatusAction) && Intrinsics.d(this.tokenizedEvent, promptStatusVO.tokenizedEvent);
    }

    public final AtomAction getCheckStatusAction() {
        return this.checkStatusAction;
    }

    public final IconDTO getErrorIcon() {
        return this.errorIcon;
    }

    @NotNull
    public final TextDTO getErrorTitle() {
        return this.errorTitle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final IconDTO getLoadingIcon() {
        return this.loadingIcon;
    }

    @NotNull
    public final List<TextDTO> getLoadingTitles() {
        return this.loadingTitles;
    }

    public final IconButtonV3DTO getRefreshButton() {
        return this.refreshButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final long getTextSwitchingTime() {
        return this.textSwitchingTime;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(g.b(C2971a.a(this.loadingIcon, Long.hashCode(this.id) * 31, 31), 31, this.loadingTitles), 31, this.textSwitchingTime);
        IconDTO iconDTO = this.errorIcon;
        int a12 = b.a(this.errorTitle, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.refreshButton;
        int hashCode = (a12 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        AtomAction atomAction = this.checkStatusAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.loadingIcon;
        List<TextDTO> list = this.loadingTitles;
        long j12 = this.textSwitchingTime;
        IconDTO iconDTO2 = this.errorIcon;
        TextDTO textDTO = this.errorTitle;
        IconButtonV3DTO iconButtonV3DTO = this.refreshButton;
        AtomAction atomAction = this.checkStatusAction;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("PromptStatusVO(id=", j11, ", loadingIcon=", iconDTO);
        b11.append(", loadingTitles=");
        b11.append(list);
        b11.append(", textSwitchingTime=");
        b11.append(j12);
        b11.append(", errorIcon=");
        b11.append(iconDTO2);
        b11.append(", errorTitle=");
        b11.append(textDTO);
        b11.append(", refreshButton=");
        b11.append(iconButtonV3DTO);
        Fj.c.e(tVar, ", checkStatusAction=", ", tokenizedEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}
