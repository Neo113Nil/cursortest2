package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain;

import An.C2439a;
import El.C2971a;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.FavoriteBadge;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/FavoriteBadgeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge$Gradient;", "gradient", "", "borderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge$Gradient;", "getGradient", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge$Gradient;", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteBadgeVO implements c {
    private final AtomAction action;
    private final String borderColor;

    @NotNull
    private final FavoriteBadge.Gradient gradient;

    @NotNull
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final TextDTO text;
    private final t tokenizedEvent;

    public FavoriteBadgeVO(long j11, @NotNull IconDTO icon, @NotNull TextDTO text, @NotNull FavoriteBadge.Gradient gradient, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.id = j11;
        this.icon = icon;
        this.text = text;
        this.gradient = gradient;
        this.borderColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteBadgeVO)) {
            return false;
        }
        FavoriteBadgeVO favoriteBadgeVO = (FavoriteBadgeVO) other;
        return this.id == favoriteBadgeVO.id && Intrinsics.d(this.icon, favoriteBadgeVO.icon) && Intrinsics.d(this.text, favoriteBadgeVO.text) && Intrinsics.d(this.gradient, favoriteBadgeVO.gradient) && Intrinsics.d(this.borderColor, favoriteBadgeVO.borderColor) && Intrinsics.d(this.action, favoriteBadgeVO.action) && Intrinsics.d(this.tokenizedEvent, favoriteBadgeVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final FavoriteBadge.Gradient getGradient() {
        return this.gradient;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
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
    public final TextDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.gradient.hashCode() + b.a(this.text, C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31), 31)) * 31;
        String str = this.borderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        FavoriteBadge.Gradient gradient = this.gradient;
        String str = this.borderColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("FavoriteBadgeVO(id=", j11, ", icon=", iconDTO);
        b11.append(", text=");
        b11.append(textDTO);
        b11.append(", gradient=");
        b11.append(gradient);
        C2439a.c(", borderColor=", str, ", action=", b11, atomAction);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
