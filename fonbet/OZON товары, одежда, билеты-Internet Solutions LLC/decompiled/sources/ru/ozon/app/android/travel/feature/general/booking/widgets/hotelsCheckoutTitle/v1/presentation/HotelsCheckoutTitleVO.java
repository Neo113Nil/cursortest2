package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation;

import D3.g;
import Pk0.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00015BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "badge", "Lorg/joda/time/DateTime;", "endTime", "deadline", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "getBadge", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "Lorg/joda/time/DateTime;", "getEndTime", "()Lorg/joda/time/DateTime;", "Ljava/lang/Long;", "getDeadline", "()Ljava/lang/Long;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "CustomBadge", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HotelsCheckoutTitleVO implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final CustomBadge badge;
    private final Long deadline;
    private final DateTime endTime;
    private final long id;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;FLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomBadge {
        private final AtomAction action;
        private final String backgroundColor;
        private final float cornerRadius;

        @NotNull
        private final TextDTO title;

        public CustomBadge(@NotNull TextDTO title, String str, float f7, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.backgroundColor = str;
            this.cornerRadius = f7;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomBadge)) {
                return false;
            }
            CustomBadge customBadge = (CustomBadge) other;
            return Intrinsics.d(this.title, customBadge.title) && Intrinsics.d(this.backgroundColor, customBadge.backgroundColor) && Float.compare(this.cornerRadius, customBadge.cornerRadius) == 0 && Intrinsics.d(this.action, customBadge.action);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.backgroundColor;
            int a11 = b.a(this.cornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            AtomAction atomAction = this.action;
            return a11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            float f7 = this.cornerRadius;
            AtomAction atomAction = this.action;
            StringBuilder f11 = g.f("CustomBadge(title=", textDTO, ", backgroundColor=", str, ", cornerRadius=");
            f11.append(f7);
            f11.append(", action=");
            f11.append(atomAction);
            f11.append(")");
            return f11.toString();
        }
    }

    public HotelsCheckoutTitleVO(long j11, @NotNull TextDTO title, CustomBadge customBadge, DateTime dateTime, Long l11, String str, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.badge = customBadge;
        this.endTime = dateTime;
        this.deadline = l11;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsCheckoutTitleVO)) {
            return false;
        }
        HotelsCheckoutTitleVO hotelsCheckoutTitleVO = (HotelsCheckoutTitleVO) other;
        return this.id == hotelsCheckoutTitleVO.id && Intrinsics.d(this.title, hotelsCheckoutTitleVO.title) && Intrinsics.d(this.badge, hotelsCheckoutTitleVO.badge) && Intrinsics.d(this.endTime, hotelsCheckoutTitleVO.endTime) && Intrinsics.d(this.deadline, hotelsCheckoutTitleVO.deadline) && Intrinsics.d(this.backgroundColor, hotelsCheckoutTitleVO.backgroundColor) && Intrinsics.d(this.action, hotelsCheckoutTitleVO.action) && Intrinsics.d(this.tokenizedEvent, hotelsCheckoutTitleVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CustomBadge getBadge() {
        return this.badge;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final DateTime getEndTime() {
        return this.endTime;
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
        int a11 = Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31);
        CustomBadge customBadge = this.badge;
        int hashCode = (a11 + (customBadge == null ? 0 : customBadge.hashCode())) * 31;
        DateTime dateTime = this.endTime;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l11 = this.deadline;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        CustomBadge customBadge = this.badge;
        DateTime dateTime = this.endTime;
        Long l11 = this.deadline;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("HotelsCheckoutTitleVO(id=", j11, ", title=", textDTO);
        b11.append(", badge=");
        b11.append(customBadge);
        b11.append(", endTime=");
        b11.append(dateTime);
        b11.append(", deadline=");
        b11.append(l11);
        b11.append(", backgroundColor=");
        b11.append(str);
        Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
        b11.append(")");
        return b11.toString();
    }
}
