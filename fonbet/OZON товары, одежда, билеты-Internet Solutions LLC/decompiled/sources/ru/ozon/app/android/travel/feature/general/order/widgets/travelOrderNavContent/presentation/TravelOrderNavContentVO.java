package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation;

import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000201BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "viewEvent", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "dateTimeInfo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "getDateTimeInfo", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "DateTimeInfoVO", "DateTimeItemVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelOrderNavContentVO implements c {
    private final AtomAction action;
    private final DateTimeInfoVO dateTimeInfo;
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "leftDateTimeItem", "rightDateTimeItem", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "getLeftDateTimeItem", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "getRightDateTimeItem", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTimeInfoVO {
        public static final int $stable;
        private final IconDTO icon;

        @NotNull
        private final DateTimeItemVO leftDateTimeItem;

        @NotNull
        private final DateTimeItemVO rightDateTimeItem;

        static {
            int i11 = IconDTO.$stable;
            int i12 = AspectDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public DateTimeInfoVO(@NotNull DateTimeItemVO leftDateTimeItem, @NotNull DateTimeItemVO rightDateTimeItem, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(leftDateTimeItem, "leftDateTimeItem");
            Intrinsics.checkNotNullParameter(rightDateTimeItem, "rightDateTimeItem");
            this.leftDateTimeItem = leftDateTimeItem;
            this.rightDateTimeItem = rightDateTimeItem;
            this.icon = iconDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeInfoVO)) {
                return false;
            }
            DateTimeInfoVO dateTimeInfoVO = (DateTimeInfoVO) other;
            return Intrinsics.d(this.leftDateTimeItem, dateTimeInfoVO.leftDateTimeItem) && Intrinsics.d(this.rightDateTimeItem, dateTimeInfoVO.rightDateTimeItem) && Intrinsics.d(this.icon, dateTimeInfoVO.icon);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final DateTimeItemVO getLeftDateTimeItem() {
            return this.leftDateTimeItem;
        }

        @NotNull
        public final DateTimeItemVO getRightDateTimeItem() {
            return this.rightDateTimeItem;
        }

        public int hashCode() {
            int hashCode = (this.rightDateTimeItem.hashCode() + (this.leftDateTimeItem.hashCode() * 31)) * 31;
            IconDTO iconDTO = this.icon;
            return hashCode + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "DateTimeInfoVO(leftDateTimeItem=" + this.leftDateTimeItem + ", rightDateTimeItem=" + this.rightDateTimeItem + ", icon=" + this.icon + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTimeItemVO {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public DateTimeItemVO(@NotNull AspectDTO aspect, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.aspect = aspect;
            this.title = title;
            this.subtitle = subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeItemVO)) {
                return false;
            }
            DateTimeItemVO dateTimeItemVO = (DateTimeItemVO) other;
            return Intrinsics.d(this.aspect, dateTimeItemVO.aspect) && Intrinsics.d(this.title, dateTimeItemVO.title) && Intrinsics.d(this.subtitle, dateTimeItemVO.subtitle);
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
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
            return this.subtitle.hashCode() + b.a(this.title, this.aspect.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.aspect;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("DateTimeItemVO(aspect=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    public TravelOrderNavContentVO(long j11, @NotNull TextDTO title, IconDTO iconDTO, @NotNull TextDTO subtitle, AtomAction atomAction, t tVar, DateTimeInfoVO dateTimeInfoVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.icon = iconDTO;
        this.subtitle = subtitle;
        this.action = atomAction;
        this.viewEvent = tVar;
        this.dateTimeInfo = dateTimeInfoVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderNavContentVO)) {
            return false;
        }
        TravelOrderNavContentVO travelOrderNavContentVO = (TravelOrderNavContentVO) other;
        return this.id == travelOrderNavContentVO.id && Intrinsics.d(this.title, travelOrderNavContentVO.title) && Intrinsics.d(this.icon, travelOrderNavContentVO.icon) && Intrinsics.d(this.subtitle, travelOrderNavContentVO.subtitle) && Intrinsics.d(this.action, travelOrderNavContentVO.action) && Intrinsics.d(this.viewEvent, travelOrderNavContentVO.viewEvent) && Intrinsics.d(this.dateTimeInfo, travelOrderNavContentVO.dateTimeInfo);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final DateTimeInfoVO getDateTimeInfo() {
        return this.dateTimeInfo;
    }

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
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        IconDTO iconDTO = this.icon;
        int a12 = b.a(this.subtitle, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.viewEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        DateTimeInfoVO dateTimeInfoVO = this.dateTimeInfo;
        return hashCode2 + (dateTimeInfoVO != null ? dateTimeInfoVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO2 = this.subtitle;
        AtomAction atomAction = this.action;
        t tVar = this.viewEvent;
        DateTimeInfoVO dateTimeInfoVO = this.dateTimeInfo;
        StringBuilder b11 = a.b("TravelOrderNavContentVO(id=", j11, ", title=", textDTO);
        b11.append(", icon=");
        b11.append(iconDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        Fj.c.e(tVar, ", action=", ", viewEvent=", b11, atomAction);
        b11.append(", dateTimeInfo=");
        b11.append(dateTimeInfoVO);
        b11.append(")");
        return b11.toString();
    }
}
