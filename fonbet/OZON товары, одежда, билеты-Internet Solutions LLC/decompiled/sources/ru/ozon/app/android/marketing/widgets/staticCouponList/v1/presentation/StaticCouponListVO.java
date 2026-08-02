package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Ak.C2436a;
import Ak.b;
import C.o0;
import D40.d;
import El.C2971a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundImage", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "content", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/lang/String;Ljava/util/List;LWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/util/List;LWZ/t;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "ContentItem", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StaticCouponListVO implements c {

    @NotNull
    private final String backgroundImage;

    @NotNull
    private final List<ContentItem> content;
    private final long id;
    private final t viewEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public StaticCouponListVO(long j11, @NotNull String backgroundImage, @NotNull List<? extends ContentItem> content, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.backgroundImage = backgroundImage;
        this.content = content;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ StaticCouponListVO copy$default(StaticCouponListVO staticCouponListVO, long j11, String str, List list, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = staticCouponListVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = staticCouponListVO.backgroundImage;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            list = staticCouponListVO.content;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            tVar = staticCouponListVO.viewEvent;
        }
        return staticCouponListVO.copy(j12, str2, list2, tVar);
    }

    @NotNull
    public final StaticCouponListVO copy(long id2, @NotNull String backgroundImage, @NotNull List<? extends ContentItem> content, t viewEvent) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(content, "content");
        return new StaticCouponListVO(id2, backgroundImage, content, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticCouponListVO)) {
            return false;
        }
        StaticCouponListVO staticCouponListVO = (StaticCouponListVO) other;
        return this.id == staticCouponListVO.id && Intrinsics.d(this.backgroundImage, staticCouponListVO.backgroundImage) && Intrinsics.d(this.content, staticCouponListVO.content) && Intrinsics.d(this.viewEvent, staticCouponListVO.viewEvent);
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final List<ContentItem> getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.a(Long.hashCode(this.id) * 31, 31, this.backgroundImage), 31, this.content);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundImage;
        List<ContentItem> list = this.content;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2436a.c(j11, "StaticCouponListVO(id=", ", backgroundImage=", str);
        b.h(c11, ", content=", list, ", viewEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "", "id", "", "getId", "()J", "Badge", "Coupon", "Creative", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ContentItem {

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "", "id", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bgColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "leftIcon", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "text", "<init>", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "getBgColor", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "getText", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "Text", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Badge implements ContentItem {
            public static final int $stable = IconDTO.$stable;
            private final StaticCouponListBackground bgColor;
            private final long id;
            private final IconDTO leftIcon;

            @NotNull
            private final Text text;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "", "Static", "Timer", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Static;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public interface Text {

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Static;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "staticText", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getStaticText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Static implements Text {
                    private final TextDTO staticText;

                    public Static(TextDTO textDTO) {
                        this.staticText = textDTO;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Static) && Intrinsics.d(this.staticText, ((Static) other).staticText);
                    }

                    public final TextDTO getStaticText() {
                        return this.staticText;
                    }

                    public int hashCode() {
                        TextDTO textDTO = this.staticText;
                        if (textDTO == null) {
                            return 0;
                        }
                        return textDTO.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Static(staticText=" + this.staticText + ")";
                    }
                }

                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b*\u0010\u001a¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "", "timerColorToken", "timerStyleToken", "Lru/ozon/uni/atoms/data/text/TextDTO;", "preSaleText", "saleActiveText", "postSaleText", "", "startSaleTimestamp", "endSaleTimestamp", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "wordDeclension", "saleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Ljava/lang/Long;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getTimerColorToken", "getTimerStyleToken", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPreSaleText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSaleActiveText", "getPostSaleText", "Ljava/lang/Long;", "getStartSaleTimestamp", "()Ljava/lang/Long;", "getEndSaleTimestamp", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "getWordDeclension", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "getSaleId", "WordDeclension", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Timer implements Text {
                    private final Long endSaleTimestamp;
                    private final TextDTO postSaleText;
                    private final TextDTO preSaleText;
                    private final TextDTO saleActiveText;

                    @NotNull
                    private final String saleId;
                    private final Long startSaleTimestamp;
                    private final String timerColorToken;
                    private final String timerStyleToken;

                    @NotNull
                    private final WordDeclension wordDeclension;

                    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "", "", "", "day", "hour", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDay", "()Ljava/util/List;", "getHour", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final /* data */ class WordDeclension {

                        @NotNull
                        private final List<String> day;

                        @NotNull
                        private final List<String> hour;

                        public WordDeclension(@NotNull List<String> day, @NotNull List<String> hour) {
                            Intrinsics.checkNotNullParameter(day, "day");
                            Intrinsics.checkNotNullParameter(hour, "hour");
                            this.day = day;
                            this.hour = hour;
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof WordDeclension)) {
                                return false;
                            }
                            WordDeclension wordDeclension = (WordDeclension) other;
                            return Intrinsics.d(this.day, wordDeclension.day) && Intrinsics.d(this.hour, wordDeclension.hour);
                        }

                        @NotNull
                        public final List<String> getDay() {
                            return this.day;
                        }

                        @NotNull
                        public final List<String> getHour() {
                            return this.hour;
                        }

                        public int hashCode() {
                            return this.hour.hashCode() + (this.day.hashCode() * 31);
                        }

                        @NotNull
                        public String toString() {
                            return C2436a.b("WordDeclension(day=", this.day, ", hour=", ")", this.hour);
                        }
                    }

                    public Timer(String str, String str2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, Long l11, Long l12, @NotNull WordDeclension wordDeclension, @NotNull String saleId) {
                        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
                        Intrinsics.checkNotNullParameter(saleId, "saleId");
                        this.timerColorToken = str;
                        this.timerStyleToken = str2;
                        this.preSaleText = textDTO;
                        this.saleActiveText = textDTO2;
                        this.postSaleText = textDTO3;
                        this.startSaleTimestamp = l11;
                        this.endSaleTimestamp = l12;
                        this.wordDeclension = wordDeclension;
                        this.saleId = saleId;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Timer)) {
                            return false;
                        }
                        Timer timer = (Timer) other;
                        return Intrinsics.d(this.timerColorToken, timer.timerColorToken) && Intrinsics.d(this.timerStyleToken, timer.timerStyleToken) && Intrinsics.d(this.preSaleText, timer.preSaleText) && Intrinsics.d(this.saleActiveText, timer.saleActiveText) && Intrinsics.d(this.postSaleText, timer.postSaleText) && Intrinsics.d(this.wordDeclension, timer.wordDeclension) && Intrinsics.d(this.saleId, timer.saleId);
                    }

                    public final Long getEndSaleTimestamp() {
                        return this.endSaleTimestamp;
                    }

                    public final TextDTO getPostSaleText() {
                        return this.postSaleText;
                    }

                    public final TextDTO getPreSaleText() {
                        return this.preSaleText;
                    }

                    public final TextDTO getSaleActiveText() {
                        return this.saleActiveText;
                    }

                    @NotNull
                    public final String getSaleId() {
                        return this.saleId;
                    }

                    public final Long getStartSaleTimestamp() {
                        return this.startSaleTimestamp;
                    }

                    public final String getTimerColorToken() {
                        return this.timerColorToken;
                    }

                    public final String getTimerStyleToken() {
                        return this.timerStyleToken;
                    }

                    @NotNull
                    public final WordDeclension getWordDeclension() {
                        return this.wordDeclension;
                    }

                    public int hashCode() {
                        String str = this.timerColorToken;
                        int hashCode = (str != null ? str.hashCode() : 0) * 31;
                        String str2 = this.timerStyleToken;
                        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                        TextDTO textDTO = this.preSaleText;
                        int hashCode3 = (hashCode2 + (textDTO != null ? textDTO.hashCode() : 0)) * 31;
                        TextDTO textDTO2 = this.saleActiveText;
                        int hashCode4 = (hashCode3 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31;
                        TextDTO textDTO3 = this.postSaleText;
                        return this.saleId.hashCode() + ((this.wordDeclension.hashCode() + ((hashCode4 + (textDTO3 != null ? textDTO3.hashCode() : 0)) * 31)) * 31);
                    }

                    @NotNull
                    public String toString() {
                        String str = this.timerColorToken;
                        String str2 = this.timerStyleToken;
                        TextDTO textDTO = this.preSaleText;
                        TextDTO textDTO2 = this.saleActiveText;
                        TextDTO textDTO3 = this.postSaleText;
                        Long l11 = this.startSaleTimestamp;
                        Long l12 = this.endSaleTimestamp;
                        WordDeclension wordDeclension = this.wordDeclension;
                        String str3 = this.saleId;
                        StringBuilder d11 = C3660k.d("Timer(timerColorToken=", str, ", timerStyleToken=", str2, ", preSaleText=");
                        d.e(", saleActiveText=", ", postSaleText=", d11, textDTO, textDTO2);
                        d11.append(textDTO3);
                        d11.append(", startSaleTimestamp=");
                        d11.append(l11);
                        d11.append(", endSaleTimestamp=");
                        d11.append(l12);
                        d11.append(", wordDeclension=");
                        d11.append(wordDeclension);
                        d11.append(", saleId=");
                        return o0.c(d11, str3, ")");
                    }
                }
            }

            public Badge(long j11, StaticCouponListBackground staticCouponListBackground, IconDTO iconDTO, @NotNull Text text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = j11;
                this.bgColor = staticCouponListBackground;
                this.leftIcon = iconDTO;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Badge)) {
                    return false;
                }
                Badge badge = (Badge) other;
                return this.id == badge.id && Intrinsics.d(this.bgColor, badge.bgColor) && Intrinsics.d(this.leftIcon, badge.leftIcon) && Intrinsics.d(this.text, badge.text);
            }

            public final StaticCouponListBackground getBgColor() {
                return this.bgColor;
            }

            @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO.ContentItem
            public long getId() {
                return this.id;
            }

            public final IconDTO getLeftIcon() {
                return this.leftIcon;
            }

            @NotNull
            public final Text getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                StaticCouponListBackground staticCouponListBackground = this.bgColor;
                int hashCode2 = (hashCode + (staticCouponListBackground == null ? 0 : staticCouponListBackground.hashCode())) * 31;
                IconDTO iconDTO = this.leftIcon;
                return this.text.hashCode() + ((hashCode2 + (iconDTO != null ? iconDTO.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "Badge(id=" + this.id + ", bgColor=" + this.bgColor + ", leftIcon=" + this.leftIcon + ", text=" + this.text + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "", "id", "", "creativeImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCreativeImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Creative implements ContentItem {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;

            @NotNull
            private final String creativeImage;
            private final long id;

            public Creative(long j11, @NotNull String creativeImage, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(creativeImage, "creativeImage");
                this.id = j11;
                this.creativeImage = creativeImage;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Creative)) {
                    return false;
                }
                Creative creative = (Creative) other;
                return this.id == creative.id && Intrinsics.d(this.creativeImage, creative.creativeImage) && Intrinsics.d(this.action, creative.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getCreativeImage() {
                return this.creativeImage;
            }

            @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO.ContentItem
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.creativeImage);
                AtomAction atomAction = this.action;
                return a11 + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.creativeImage;
                AtomAction atomAction = this.action;
                StringBuilder c11 = C2436a.c(j11, "Creative(id=", ", creativeImage=", str);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(")");
                return c11.toString();
            }
        }

        long getId();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u00018B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\r\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b7\u00100¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "", "id", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bg", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "chevron", "leftIcon", "", "isApplied", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "stub", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "needAnimateTear", "<init>", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;Lru/ozon/uni/atoms/af/AtomAction;Z)V", "copy", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;Lru/ozon/uni/atoms/af/AtomAction;Z)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "getBg", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getChevron", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLeftIcon", "Z", "()Z", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "getStub", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getNeedAnimateTear", "Stub", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Coupon implements ContentItem {
            public static final int $stable;
            private final AtomAction action;

            @NotNull
            private final StaticCouponListBackground bg;

            @NotNull
            private final IconDTO chevron;
            private final long id;
            private final boolean isApplied;
            private final IconDTO leftIcon;
            private final boolean needAnimateTear;

            @NotNull
            private final Stub stub;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "", "", "isApplied", "Lru/ozon/uni/atoms/data/text/TextDTO;", "appliedText", "unAppliedText", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "unappliedBg", "appliedBg", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAppliedText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getUnAppliedText", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "getUnappliedBg", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "getAppliedBg", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Stub {
                public static final int $stable = AtomAction.$stable;
                private final AtomAction action;

                @NotNull
                private final StaticCouponListBackground appliedBg;

                @NotNull
                private final TextDTO appliedText;
                private final boolean isApplied;

                @NotNull
                private final TextDTO unAppliedText;

                @NotNull
                private final StaticCouponListBackground unappliedBg;

                public Stub(boolean z11, @NotNull TextDTO appliedText, @NotNull TextDTO unAppliedText, @NotNull StaticCouponListBackground unappliedBg, @NotNull StaticCouponListBackground appliedBg, AtomAction atomAction) {
                    Intrinsics.checkNotNullParameter(appliedText, "appliedText");
                    Intrinsics.checkNotNullParameter(unAppliedText, "unAppliedText");
                    Intrinsics.checkNotNullParameter(unappliedBg, "unappliedBg");
                    Intrinsics.checkNotNullParameter(appliedBg, "appliedBg");
                    this.isApplied = z11;
                    this.appliedText = appliedText;
                    this.unAppliedText = unAppliedText;
                    this.unappliedBg = unappliedBg;
                    this.appliedBg = appliedBg;
                    this.action = atomAction;
                }

                public static /* synthetic */ Stub copy$default(Stub stub, boolean z11, TextDTO textDTO, TextDTO textDTO2, StaticCouponListBackground staticCouponListBackground, StaticCouponListBackground staticCouponListBackground2, AtomAction atomAction, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        z11 = stub.isApplied;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = stub.appliedText;
                    }
                    if ((i11 & 4) != 0) {
                        textDTO2 = stub.unAppliedText;
                    }
                    if ((i11 & 8) != 0) {
                        staticCouponListBackground = stub.unappliedBg;
                    }
                    if ((i11 & 16) != 0) {
                        staticCouponListBackground2 = stub.appliedBg;
                    }
                    if ((i11 & 32) != 0) {
                        atomAction = stub.action;
                    }
                    StaticCouponListBackground staticCouponListBackground3 = staticCouponListBackground2;
                    AtomAction atomAction2 = atomAction;
                    return stub.copy(z11, textDTO, textDTO2, staticCouponListBackground, staticCouponListBackground3, atomAction2);
                }

                @NotNull
                public final Stub copy(boolean isApplied, @NotNull TextDTO appliedText, @NotNull TextDTO unAppliedText, @NotNull StaticCouponListBackground unappliedBg, @NotNull StaticCouponListBackground appliedBg, AtomAction action) {
                    Intrinsics.checkNotNullParameter(appliedText, "appliedText");
                    Intrinsics.checkNotNullParameter(unAppliedText, "unAppliedText");
                    Intrinsics.checkNotNullParameter(unappliedBg, "unappliedBg");
                    Intrinsics.checkNotNullParameter(appliedBg, "appliedBg");
                    return new Stub(isApplied, appliedText, unAppliedText, unappliedBg, appliedBg, action);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Stub)) {
                        return false;
                    }
                    Stub stub = (Stub) other;
                    return this.isApplied == stub.isApplied && Intrinsics.d(this.appliedText, stub.appliedText) && Intrinsics.d(this.unAppliedText, stub.unAppliedText) && Intrinsics.d(this.unappliedBg, stub.unappliedBg) && Intrinsics.d(this.appliedBg, stub.appliedBg) && Intrinsics.d(this.action, stub.action);
                }

                public final AtomAction getAction() {
                    return this.action;
                }

                @NotNull
                public final StaticCouponListBackground getAppliedBg() {
                    return this.appliedBg;
                }

                @NotNull
                public final TextDTO getAppliedText() {
                    return this.appliedText;
                }

                @NotNull
                public final TextDTO getUnAppliedText() {
                    return this.unAppliedText;
                }

                @NotNull
                public final StaticCouponListBackground getUnappliedBg() {
                    return this.unappliedBg;
                }

                public int hashCode() {
                    int hashCode = (this.appliedBg.hashCode() + ((this.unappliedBg.hashCode() + Ns.b.a(this.unAppliedText, Ns.b.a(this.appliedText, Boolean.hashCode(this.isApplied) * 31, 31), 31)) * 31)) * 31;
                    AtomAction atomAction = this.action;
                    return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
                }

                /* renamed from: isApplied, reason: from getter */
                public final boolean getIsApplied() {
                    return this.isApplied;
                }

                @NotNull
                public String toString() {
                    return "Stub(isApplied=" + this.isApplied + ", appliedText=" + this.appliedText + ", unAppliedText=" + this.unAppliedText + ", unappliedBg=" + this.unappliedBg + ", appliedBg=" + this.appliedBg + ", action=" + this.action + ")";
                }
            }

            static {
                int i11 = AtomAction.$stable;
                int i12 = IconDTO.$stable;
                $stable = i11 | i12 | i12;
            }

            public Coupon(long j11, @NotNull StaticCouponListBackground bg2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO chevron, IconDTO iconDTO, boolean z11, @NotNull Stub stub, AtomAction atomAction, boolean z12) {
                Intrinsics.checkNotNullParameter(bg2, "bg");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(chevron, "chevron");
                Intrinsics.checkNotNullParameter(stub, "stub");
                this.id = j11;
                this.bg = bg2;
                this.title = title;
                this.subtitle = subtitle;
                this.chevron = chevron;
                this.leftIcon = iconDTO;
                this.isApplied = z11;
                this.stub = stub;
                this.action = atomAction;
                this.needAnimateTear = z12;
            }

            public static /* synthetic */ Coupon copy$default(Coupon coupon, long j11, StaticCouponListBackground staticCouponListBackground, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, IconDTO iconDTO2, boolean z11, Stub stub, AtomAction atomAction, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = coupon.id;
                }
                long j12 = j11;
                if ((i11 & 2) != 0) {
                    staticCouponListBackground = coupon.bg;
                }
                return coupon.copy(j12, staticCouponListBackground, (i11 & 4) != 0 ? coupon.title : textDTO, (i11 & 8) != 0 ? coupon.subtitle : textDTO2, (i11 & 16) != 0 ? coupon.chevron : iconDTO, (i11 & 32) != 0 ? coupon.leftIcon : iconDTO2, (i11 & 64) != 0 ? coupon.isApplied : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? coupon.stub : stub, (i11 & 256) != 0 ? coupon.action : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? coupon.needAnimateTear : z12);
            }

            @NotNull
            public final Coupon copy(long id2, @NotNull StaticCouponListBackground bg2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO chevron, IconDTO leftIcon, boolean isApplied, @NotNull Stub stub, AtomAction action, boolean needAnimateTear) {
                Intrinsics.checkNotNullParameter(bg2, "bg");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(chevron, "chevron");
                Intrinsics.checkNotNullParameter(stub, "stub");
                return new Coupon(id2, bg2, title, subtitle, chevron, leftIcon, isApplied, stub, action, needAnimateTear);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Coupon)) {
                    return false;
                }
                Coupon coupon = (Coupon) other;
                return this.id == coupon.id && Intrinsics.d(this.bg, coupon.bg) && Intrinsics.d(this.title, coupon.title) && Intrinsics.d(this.subtitle, coupon.subtitle) && Intrinsics.d(this.chevron, coupon.chevron) && Intrinsics.d(this.leftIcon, coupon.leftIcon) && this.isApplied == coupon.isApplied && Intrinsics.d(this.stub, coupon.stub) && Intrinsics.d(this.action, coupon.action) && this.needAnimateTear == coupon.needAnimateTear;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final StaticCouponListBackground getBg() {
                return this.bg;
            }

            @NotNull
            public final IconDTO getChevron() {
                return this.chevron;
            }

            @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO.ContentItem
            public long getId() {
                return this.id;
            }

            public final IconDTO getLeftIcon() {
                return this.leftIcon;
            }

            public final boolean getNeedAnimateTear() {
                return this.needAnimateTear;
            }

            @NotNull
            public final Stub getStub() {
                return this.stub;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = C2971a.a(this.chevron, Ns.b.a(this.subtitle, Ns.b.a(this.title, (this.bg.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31), 31);
                IconDTO iconDTO = this.leftIcon;
                int hashCode = (this.stub.hashCode() + C3532b.a((a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.isApplied)) * 31;
                AtomAction atomAction = this.action;
                return Boolean.hashCode(this.needAnimateTear) + ((hashCode + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
            }

            /* renamed from: isApplied, reason: from getter */
            public final boolean getIsApplied() {
                return this.isApplied;
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                StaticCouponListBackground staticCouponListBackground = this.bg;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                IconDTO iconDTO = this.chevron;
                IconDTO iconDTO2 = this.leftIcon;
                boolean z11 = this.isApplied;
                Stub stub = this.stub;
                AtomAction atomAction = this.action;
                boolean z12 = this.needAnimateTear;
                StringBuilder sb2 = new StringBuilder("Coupon(id=");
                sb2.append(j11);
                sb2.append(", bg=");
                sb2.append(staticCouponListBackground);
                D3.g.i(", title=", ", subtitle=", sb2, textDTO, textDTO2);
                sb2.append(", chevron=");
                sb2.append(iconDTO);
                sb2.append(", leftIcon=");
                sb2.append(iconDTO2);
                sb2.append(", isApplied=");
                sb2.append(z11);
                sb2.append(", stub=");
                sb2.append(stub);
                sb2.append(", action=");
                sb2.append(atomAction);
                sb2.append(", needAnimateTear=");
                sb2.append(z12);
                sb2.append(")");
                return sb2.toString();
            }

            public /* synthetic */ Coupon(long j11, StaticCouponListBackground staticCouponListBackground, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, IconDTO iconDTO2, boolean z11, Stub stub, AtomAction atomAction, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, staticCouponListBackground, textDTO, textDTO2, iconDTO, iconDTO2, z11, stub, atomAction, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z12);
            }
        }
    }
}
