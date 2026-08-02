package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation;

import Bl.b;
import G.g;
import Kk.C3532b;
import Lh.a;
import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO;", "Ll20/c;", "Lru/ozon/composer/network/widget/item/ViewItem;", "", "id", "", "forceShow", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;", "withoutWelcomeBonus", "withWelcomeBonus", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JZLru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getForceShow", "()Z", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;", "getWithoutWelcomeBonus", "()Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;", "getWithWelcomeBonus", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ScreenInfo", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WelcomeScreenVO implements c {
    private final boolean forceShow;
    private final long id;
    private final t tokenizedEvent;
    private final ScreenInfo withWelcomeBonus;

    @NotNull
    private final ScreenInfo withoutWelcomeBonus;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;", "", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getTitle", "getSubtitle", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScreenInfo {

        @NotNull
        private final MorkovskShadowButtonDTO button;

        @NotNull
        private final String image;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public ScreenInfo(@NotNull String image, @NotNull String title, @NotNull String subtitle, @NotNull MorkovskShadowButtonDTO button) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(button, "button");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenInfo)) {
                return false;
            }
            ScreenInfo screenInfo = (ScreenInfo) other;
            return Intrinsics.d(this.image, screenInfo.image) && Intrinsics.d(this.title, screenInfo.title) && Intrinsics.d(this.subtitle, screenInfo.subtitle) && Intrinsics.d(this.button, screenInfo.button);
        }

        @NotNull
        public final MorkovskShadowButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final String getImage() {
            return this.image;
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
            return this.button.hashCode() + g.a(g.a(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.subtitle;
            MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
            StringBuilder d11 = C3660k.d("ScreenInfo(image=", str, ", title=", str2, ", subtitle=");
            d11.append(str3);
            d11.append(", button=");
            d11.append(morkovskShadowButtonDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public WelcomeScreenVO(long j11, boolean z11, @NotNull ScreenInfo withoutWelcomeBonus, ScreenInfo screenInfo, t tVar) {
        Intrinsics.checkNotNullParameter(withoutWelcomeBonus, "withoutWelcomeBonus");
        this.id = j11;
        this.forceShow = z11;
        this.withoutWelcomeBonus = withoutWelcomeBonus;
        this.withWelcomeBonus = screenInfo;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeScreenVO)) {
            return false;
        }
        WelcomeScreenVO welcomeScreenVO = (WelcomeScreenVO) other;
        return this.id == welcomeScreenVO.id && this.forceShow == welcomeScreenVO.forceShow && Intrinsics.d(this.withoutWelcomeBonus, welcomeScreenVO.withoutWelcomeBonus) && Intrinsics.d(this.withWelcomeBonus, welcomeScreenVO.withWelcomeBonus) && Intrinsics.d(this.tokenizedEvent, welcomeScreenVO.tokenizedEvent);
    }

    public final boolean getForceShow() {
        return this.forceShow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    public final ScreenInfo getWithWelcomeBonus() {
        return this.withWelcomeBonus;
    }

    @NotNull
    public final ScreenInfo getWithoutWelcomeBonus() {
        return this.withoutWelcomeBonus;
    }

    public int hashCode() {
        int hashCode = (this.withoutWelcomeBonus.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.forceShow)) * 31;
        ScreenInfo screenInfo = this.withWelcomeBonus;
        int hashCode2 = (hashCode + (screenInfo == null ? 0 : screenInfo.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.forceShow;
        ScreenInfo screenInfo = this.withoutWelcomeBonus;
        ScreenInfo screenInfo2 = this.withWelcomeBonus;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = b.c(j11, "WelcomeScreenVO(id=", ", forceShow=", z11);
        c11.append(", withoutWelcomeBonus=");
        c11.append(screenInfo);
        c11.append(", withWelcomeBonus=");
        c11.append(screenInfo2);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
