package ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "cacheId", "animationURL", "", "position", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCacheId", "getAnimationURL", "I", "getPosition", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StickyPromoRedirectV2VO implements c {
    private final AtomAction action;

    @NotNull
    private final String animationURL;

    @NotNull
    private final String cacheId;
    private final long id;
    private final int position;
    private final t tokenizedEvent;

    public StickyPromoRedirectV2VO(long j11, @NotNull String cacheId, @NotNull String animationURL, int i11, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(cacheId, "cacheId");
        Intrinsics.checkNotNullParameter(animationURL, "animationURL");
        this.id = j11;
        this.cacheId = cacheId;
        this.animationURL = animationURL;
        this.position = i11;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyPromoRedirectV2VO)) {
            return false;
        }
        StickyPromoRedirectV2VO stickyPromoRedirectV2VO = (StickyPromoRedirectV2VO) other;
        return this.id == stickyPromoRedirectV2VO.id && Intrinsics.d(this.cacheId, stickyPromoRedirectV2VO.cacheId) && Intrinsics.d(this.animationURL, stickyPromoRedirectV2VO.animationURL) && this.position == stickyPromoRedirectV2VO.position && Intrinsics.d(this.action, stickyPromoRedirectV2VO.action) && Intrinsics.d(this.tokenizedEvent, stickyPromoRedirectV2VO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getAnimationURL() {
        return this.animationURL;
    }

    @NotNull
    public final String getCacheId() {
        return this.cacheId;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getPosition() {
        return this.position;
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
        int a11 = C2454a.a(this.position, g.a(g.a(Long.hashCode(this.id) * 31, 31, this.cacheId), 31, this.animationURL), 31);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.cacheId;
        String str2 = this.animationURL;
        int i11 = this.position;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "StickyPromoRedirectV2VO(id=", ", cacheId=", str);
        c11.append(", animationURL=");
        c11.append(str2);
        c11.append(", position=");
        c11.append(i11);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}
