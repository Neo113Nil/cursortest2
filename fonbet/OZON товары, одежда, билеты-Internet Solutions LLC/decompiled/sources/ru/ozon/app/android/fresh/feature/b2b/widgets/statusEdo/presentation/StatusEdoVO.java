package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation;

import G.g;
import Gl.C3124a;
import Ns.b;
import TY.a;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/presentation/StatusEdoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "image", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StatusEdoVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final BadgeDTO badge;
    private final IconButtonV3DTO closeButton;
    private final long id;

    @NotNull
    private final String image;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public StatusEdoVO(long j11, @NotNull TextDTO title, @NotNull BadgeDTO badge, @NotNull String image, IconButtonV3DTO iconButtonV3DTO, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.title = title;
        this.badge = badge;
        this.image = image;
        this.closeButton = iconButtonV3DTO;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusEdoVO)) {
            return false;
        }
        StatusEdoVO statusEdoVO = (StatusEdoVO) other;
        return this.id == statusEdoVO.id && Intrinsics.d(this.title, statusEdoVO.title) && Intrinsics.d(this.badge, statusEdoVO.badge) && Intrinsics.d(this.image, statusEdoVO.image) && Intrinsics.d(this.closeButton, statusEdoVO.closeButton) && Intrinsics.d(this.action, statusEdoVO.action) && Intrinsics.d(this.tokenizedEvent, statusEdoVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        int a11 = g.a(C3124a.c(this.badge, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31, this.image);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int a12 = C4598rp.a(this.action, (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        String str = this.image;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("StatusEdoVO(id=", j11, ", title=", textDTO);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", image=");
        b11.append(str);
        b11.append(", closeButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", action=");
        b11.append(atomAction);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
