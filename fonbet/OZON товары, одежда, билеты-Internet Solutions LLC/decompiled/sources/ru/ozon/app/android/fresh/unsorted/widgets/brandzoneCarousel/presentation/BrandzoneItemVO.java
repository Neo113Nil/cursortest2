package ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u0011R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "logo", SelectionItemFormDTO.TITLE_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "getLogo", "getTitle", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BrandzoneItemVO implements c {

    @NotNull
    private final AtomAction action;
    private final long id;

    @NotNull
    private final String image;

    @NotNull
    private final String logo;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    public BrandzoneItemVO(long j11, @NotNull String image, @NotNull String logo, @NotNull String title, t tVar, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.image = image;
        this.logo = logo;
        this.title = title;
        this.tokenizedEvent = tVar;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandzoneItemVO)) {
            return false;
        }
        BrandzoneItemVO brandzoneItemVO = (BrandzoneItemVO) other;
        return this.id == brandzoneItemVO.id && Intrinsics.d(this.image, brandzoneItemVO.image) && Intrinsics.d(this.logo, brandzoneItemVO.logo) && Intrinsics.d(this.title, brandzoneItemVO.title) && Intrinsics.d(this.tokenizedEvent, brandzoneItemVO.tokenizedEvent) && Intrinsics.d(this.action, brandzoneItemVO.action);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
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
        int a11 = g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.image), 31, this.logo), 31, this.title);
        t tVar = this.tokenizedEvent;
        return this.action.hashCode() + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        String str2 = this.logo;
        String str3 = this.title;
        t tVar = this.tokenizedEvent;
        AtomAction atomAction = this.action;
        StringBuilder c11 = C2436a.c(j11, "BrandzoneItemVO(id=", ", image=", str);
        a.h(c11, ", logo=", str2, ", title=", str3);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(")");
        return c11.toString();
    }
}
