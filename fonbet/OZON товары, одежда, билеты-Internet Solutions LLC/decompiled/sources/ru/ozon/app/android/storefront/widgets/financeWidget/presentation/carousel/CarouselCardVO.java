package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel;

import D3.g;
import Ds.C2880a;
import E0.C2942q;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00010Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u000e\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b\u0010\u0010+R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "banners", "bannerDuration", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "widgetTokenizedEvent", "", "widgetBackgroundColor", "", "isCompactSize", "", "spanIndex", "<init>", "(JLjava/util/List;JLWZ/t;LWZ/t;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "getBannerDuration", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getWidgetTokenizedEvent", "Ljava/lang/String;", "getWidgetBackgroundColor", "Z", "()Z", "I", "getSpanIndex", "setSpanIndex", "(I)V", "Banner", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CarouselCardVO implements c {
    private final long bannerDuration;

    @NotNull
    private final List<Banner> banners;
    private final long id;
    private final boolean isCompactSize;
    private int spanIndex;
    private final t tokenizedEvent;
    private final String widgetBackgroundColor;
    private final t widgetTokenizedEvent;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b\u0010\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "backgroundColor", "backgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "isCompactSize", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {
        private final AtomAction action;
        private final String backgroundColor;
        private final String backgroundImage;
        private final ButtonV3DTO button;
        private final boolean isCompactSize;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public Banner(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO, String str, String str2, AtomAction atomAction, t tVar, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.button = buttonV3DTO;
            this.backgroundColor = str;
            this.backgroundImage = str2;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.isCompactSize = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.button, banner.button) && Intrinsics.d(this.backgroundColor, banner.backgroundColor) && Intrinsics.d(this.backgroundImage, banner.backgroundImage) && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.tokenizedEvent, banner.tokenizedEvent) && this.isCompactSize == banner.isCompactSize;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundImage;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.isCompactSize) + ((hashCode6 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        /* renamed from: isCompactSize, reason: from getter */
        public final boolean getIsCompactSize() {
            return this.isCompactSize;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.backgroundColor;
            String str2 = this.backgroundImage;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.isCompactSize;
            StringBuilder g10 = g.g("Banner(title=", textDTO, ", subtitle=", textDTO2, ", button=");
            g10.append(buttonV3DTO);
            g10.append(", backgroundColor=");
            g10.append(str);
            g10.append(", backgroundImage=");
            b.d(str2, ", action=", ", tokenizedEvent=", g10, atomAction);
            g10.append(tVar);
            g10.append(", isCompactSize=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }
    }

    public CarouselCardVO(long j11, @NotNull List<Banner> banners, long j12, t tVar, t tVar2, String str, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.id = j11;
        this.banners = banners;
        this.bannerDuration = j12;
        this.tokenizedEvent = tVar;
        this.widgetTokenizedEvent = tVar2;
        this.widgetBackgroundColor = str;
        this.isCompactSize = z11;
        this.spanIndex = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardVO)) {
            return false;
        }
        CarouselCardVO carouselCardVO = (CarouselCardVO) other;
        return this.id == carouselCardVO.id && Intrinsics.d(this.banners, carouselCardVO.banners) && this.bannerDuration == carouselCardVO.bannerDuration && Intrinsics.d(this.tokenizedEvent, carouselCardVO.tokenizedEvent) && Intrinsics.d(this.widgetTokenizedEvent, carouselCardVO.widgetTokenizedEvent) && Intrinsics.d(this.widgetBackgroundColor, carouselCardVO.widgetBackgroundColor) && this.isCompactSize == carouselCardVO.isCompactSize && this.spanIndex == carouselCardVO.spanIndex;
    }

    public final long getBannerDuration() {
        return this.bannerDuration;
    }

    @NotNull
    public final List<Banner> getBanners() {
        return this.banners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpanIndex() {
        return this.spanIndex;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public final t getWidgetTokenizedEvent() {
        return this.widgetTokenizedEvent;
    }

    public int hashCode() {
        int a11 = Pk0.c.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.banners), 31, this.bannerDuration);
        t tVar = this.tokenizedEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.widgetTokenizedEvent;
        int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        String str = this.widgetBackgroundColor;
        return Integer.hashCode(this.spanIndex) + C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isCompactSize);
    }

    /* renamed from: isCompactSize, reason: from getter */
    public final boolean getIsCompactSize() {
        return this.isCompactSize;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Banner> list = this.banners;
        long j12 = this.bannerDuration;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.widgetTokenizedEvent;
        String str = this.widgetBackgroundColor;
        boolean z11 = this.isCompactSize;
        int i11 = this.spanIndex;
        StringBuilder b11 = Lh.b.b(j11, "CarouselCardVO(id=", ", banners=", list);
        C2942q.f(b11, ", bannerDuration=", j12, ", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", widgetTokenizedEvent=");
        b11.append(tVar2);
        b11.append(", widgetBackgroundColor=");
        C2880a.c(str, ", isCompactSize=", ", spanIndex=", b11, z11);
        return K00.b.e(i11, ")", b11);
    }
}
