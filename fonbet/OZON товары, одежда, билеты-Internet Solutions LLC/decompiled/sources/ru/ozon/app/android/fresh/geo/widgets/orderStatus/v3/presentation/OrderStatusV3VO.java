package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import A00.a;
import G.g;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u00012BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J^\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "ringProgressColor", "", "progress", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "progressType", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;FLru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;FLru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;LWZ/t;)Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getRingProgressColor", "F", "getProgress", "()F", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "getProgressType", "()Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ProgressType", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderStatusV3VO implements c, a.J.InterfaceC0007a {
    private final long id;
    private final float progress;

    @NotNull
    private final ProgressType progressType;

    @NotNull
    private final String ringProgressColor;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "", "<init>", "()V", "ProgressIcon", "ProgressText", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType$ProgressIcon;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType$ProgressText;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static abstract class ProgressType {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType$ProgressIcon;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProgressIcon extends ProgressType {

            @NotNull
            private final IconDTO icon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProgressIcon(@NotNull IconDTO icon) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProgressIcon) && Intrinsics.d(this.icon, ((ProgressIcon) other).icon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public int hashCode() {
                return this.icon.hashCode();
            }

            @NotNull
            public String toString() {
                return "ProgressIcon(icon=" + this.icon + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType$ProgressText;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO$ProgressType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProgressText extends ProgressType {

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProgressText(@NotNull TextDTO title, @NotNull TextDTO subtitle) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProgressText)) {
                    return false;
                }
                ProgressText progressText = (ProgressText) other;
                return Intrinsics.d(this.title, progressText.title) && Intrinsics.d(this.subtitle, progressText.subtitle);
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
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return Lc.a.b("ProgressText(title=", this.title, ", subtitle=", this.subtitle, ")");
            }
        }

        public /* synthetic */ ProgressType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProgressType() {
        }
    }

    public OrderStatusV3VO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String ringProgressColor, float f7, @NotNull ProgressType progressType, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
        Intrinsics.checkNotNullParameter(progressType, "progressType");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.ringProgressColor = ringProgressColor;
        this.progress = f7;
        this.progressType = progressType;
        this.tokenizedEvent = tVar;
    }

    @NotNull
    public final OrderStatusV3VO copy(long id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String ringProgressColor, float progress, @NotNull ProgressType progressType, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ringProgressColor, "ringProgressColor");
        Intrinsics.checkNotNullParameter(progressType, "progressType");
        return new OrderStatusV3VO(id2, title, subtitle, ringProgressColor, progress, progressType, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusV3VO)) {
            return false;
        }
        OrderStatusV3VO orderStatusV3VO = (OrderStatusV3VO) other;
        return this.id == orderStatusV3VO.id && Intrinsics.d(this.title, orderStatusV3VO.title) && Intrinsics.d(this.subtitle, orderStatusV3VO.subtitle) && Intrinsics.d(this.ringProgressColor, orderStatusV3VO.ringProgressColor) && Float.compare(this.progress, orderStatusV3VO.progress) == 0 && Intrinsics.d(this.progressType, orderStatusV3VO.progressType) && Intrinsics.d(this.tokenizedEvent, orderStatusV3VO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    public final ProgressType getProgressType() {
        return this.progressType;
    }

    @NotNull
    public final String getRingProgressColor() {
        return this.ringProgressColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.progressType.hashCode() + b.a(this.progress, g.a(Ns.b.a(this.subtitle, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31, this.ringProgressColor), 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.ringProgressColor;
        float f7 = this.progress;
        ProgressType progressType = this.progressType;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = TY.a.b("OrderStatusV3VO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", ringProgressColor=");
        b11.append(str);
        b11.append(", progress=");
        b11.append(f7);
        b11.append(", progressType=");
        b11.append(progressType);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
