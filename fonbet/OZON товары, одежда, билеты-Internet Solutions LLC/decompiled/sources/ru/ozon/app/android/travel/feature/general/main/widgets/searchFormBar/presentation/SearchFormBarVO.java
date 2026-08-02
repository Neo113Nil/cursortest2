package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation;

import El.C2971a;
import G.g;
import Nh.a;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00011BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b)\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "bar", "", "cornerRadius", "", "backgroundColor", "leftPatchColor", "rightPatchColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "getBar", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "F", "getCornerRadius", "()F", "Ljava/lang/String;", "getBackgroundColor", "getLeftPatchColor", "getRightPatchColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Bar", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchFormBarVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Bar bar;
    private final float cornerRadius;
    private final long id;
    private final String leftPatchColor;
    private final String rightPatchColor;
    private final t trackingInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;FLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bar {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final String backgroundColor;
        private final float cornerRadius;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO placeholder;

        public Bar(@NotNull String backgroundColor, float f7, @NotNull IconDTO icon, @NotNull TextDTO placeholder) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.backgroundColor = backgroundColor;
            this.cornerRadius = f7;
            this.icon = icon;
            this.placeholder = placeholder;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) other;
            return Intrinsics.d(this.backgroundColor, bar.backgroundColor) && Float.compare(this.cornerRadius, bar.cornerRadius) == 0 && Intrinsics.d(this.icon, bar.icon) && Intrinsics.d(this.placeholder, bar.placeholder);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.placeholder.hashCode() + C2971a.a(this.icon, b.a(this.cornerRadius, this.backgroundColor.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Bar(backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", icon=" + this.icon + ", placeholder=" + this.placeholder + ")";
        }
    }

    public SearchFormBarVO(long j11, @NotNull Bar bar, float f7, @NotNull String backgroundColor, String str, String str2, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.bar = bar;
        this.cornerRadius = f7;
        this.backgroundColor = backgroundColor;
        this.leftPatchColor = str;
        this.rightPatchColor = str2;
        this.action = atomAction;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFormBarVO)) {
            return false;
        }
        SearchFormBarVO searchFormBarVO = (SearchFormBarVO) other;
        return this.id == searchFormBarVO.id && Intrinsics.d(this.bar, searchFormBarVO.bar) && Float.compare(this.cornerRadius, searchFormBarVO.cornerRadius) == 0 && Intrinsics.d(this.backgroundColor, searchFormBarVO.backgroundColor) && Intrinsics.d(this.leftPatchColor, searchFormBarVO.leftPatchColor) && Intrinsics.d(this.rightPatchColor, searchFormBarVO.rightPatchColor) && Intrinsics.d(this.action, searchFormBarVO.action) && Intrinsics.d(this.trackingInfo, searchFormBarVO.trackingInfo);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Bar getBar() {
        return this.bar;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getLeftPatchColor() {
        return this.leftPatchColor;
    }

    public final String getRightPatchColor() {
        return this.rightPatchColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(b.a(this.cornerRadius, (this.bar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31, this.backgroundColor);
        String str = this.leftPatchColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightPatchColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Bar bar = this.bar;
        float f7 = this.cornerRadius;
        String str = this.backgroundColor;
        String str2 = this.leftPatchColor;
        String str3 = this.rightPatchColor;
        AtomAction atomAction = this.action;
        t tVar = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SearchFormBarVO(id=");
        sb2.append(j11);
        sb2.append(", bar=");
        sb2.append(bar);
        sb2.append(", cornerRadius=");
        sb2.append(f7);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        a.h(sb2, ", leftPatchColor=", str2, ", rightPatchColor=", str3);
        Fj.c.e(tVar, ", action=", ", trackingInfo=", sb2, atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
