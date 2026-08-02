package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import Bl.C2639a;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Tl.b;
import WZ.t;
import Z1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0002%&B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "badges", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "spacers", "<init>", "(JLjava/util/List;LWZ/t;Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "Badge", "Spacers", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitListVO implements c {

    @NotNull
    private final List<Badge> badges;
    private final long id;

    @NotNull
    private final Spacers spacers;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "separator", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSeparator", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge {
        private final AtomAction action;
        private final IconDTO icon;
        private final TextDTO separator;

        @NotNull
        private final TextDTO text;
        private final t trackingInfo;

        public Badge(@NotNull TextDTO text, IconDTO iconDTO, TextDTO textDTO, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = iconDTO;
            this.separator = textDTO;
            this.action = atomAction;
            this.trackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.d(this.text, badge.text) && Intrinsics.d(this.icon, badge.icon) && Intrinsics.d(this.separator, badge.separator) && Intrinsics.d(this.action, badge.action) && Intrinsics.d(this.trackingInfo, badge.trackingInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getSeparator() {
            return this.separator;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.separator;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.trackingInfo;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO2 = this.separator;
            AtomAction atomAction = this.action;
            t tVar = this.trackingInfo;
            StringBuilder d11 = C2639a.d("Badge(text=", ", icon=", ", separator=", iconDTO, textDTO);
            d11.append(textDTO2);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", trackingInfo=");
            return b.d(d11, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "", "LZ1/h;", "top", "bottom", "left", "right", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTop-D9Ej5fM", "()F", "getBottom-D9Ej5fM", "getLeft-D9Ej5fM", "getRight-D9Ej5fM", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Spacers(float f7, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, f12, f13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return h.b(this.top, spacers.top) && h.b(this.bottom, spacers.bottom) && h.b(this.left, spacers.left) && h.b(this.right, spacers.right);
        }

        /* renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBottom() {
            return this.bottom;
        }

        /* renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeft() {
            return this.left;
        }

        /* renamed from: getRight-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRight() {
            return this.right;
        }

        /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
        public final float getTop() {
            return this.top;
        }

        public int hashCode() {
            return Float.hashCode(this.right) + Pk0.b.a(this.left, Pk0.b.a(this.bottom, Float.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            String c11 = h.c(this.top);
            String c12 = h.c(this.bottom);
            return C3173b.c(C3660k.d("Spacers(top=", c11, ", bottom=", c12, ", left="), h.c(this.left), ", right=", h.c(this.right), ")");
        }

        private Spacers(float f7, float f11, float f12, float f13) {
            this.top = f7;
            this.bottom = f11;
            this.left = f12;
            this.right = f13;
        }
    }

    public BenefitListVO(long j11, @NotNull List<Badge> badges, t tVar, @NotNull Spacers spacers) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.badges = badges;
        this.trackingInfo = tVar;
        this.spacers = spacers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenefitListVO)) {
            return false;
        }
        BenefitListVO benefitListVO = (BenefitListVO) other;
        return this.id == benefitListVO.id && Intrinsics.d(this.badges, benefitListVO.badges) && Intrinsics.d(this.trackingInfo, benefitListVO.trackingInfo) && Intrinsics.d(this.spacers, benefitListVO.spacers);
    }

    @NotNull
    public final List<Badge> getBadges() {
        return this.badges;
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
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.badges);
        t tVar = this.trackingInfo;
        return this.spacers.hashCode() + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Badge> list = this.badges;
        t tVar = this.trackingInfo;
        Spacers spacers = this.spacers;
        StringBuilder b11 = Lh.b.b(j11, "BenefitListVO(id=", ", badges=", list);
        b11.append(", trackingInfo=");
        b11.append(tVar);
        b11.append(", spacers=");
        b11.append(spacers);
        b11.append(")");
        return b11.toString();
    }
}
