package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Lh.b;
import T7.E;
import TY.a;
import WZ.t;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.view.shared.ListItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Purchase", "Periods", "Title", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Title;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface InstallmentVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull InstallmentVO installmentVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull InstallmentVO installmentVO) {
            return installmentVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods$PeriodItem;", "periods", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "background", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPeriods", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getBackground", "PeriodItem", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Periods implements InstallmentVO {
        private final AtomAction action;

        @NotNull
        private final String background;
        private final long id;

        @NotNull
        private final List<PeriodItem> periods;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods$PeriodItem;", "Lru/ozon/app/android/pdp/view/shared/ListItem;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PeriodItem implements ListItem {

            @NotNull
            private final BadgeDTO badge;
            private final long id;

            public PeriodItem(long j11, @NotNull BadgeDTO badge) {
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.id = j11;
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PeriodItem)) {
                    return false;
                }
                PeriodItem periodItem = (PeriodItem) other;
                return this.id == periodItem.id && Intrinsics.d(this.badge, periodItem.badge);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @Override // ru.ozon.app.android.pdp.view.shared.ListItem
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.badge.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "PeriodItem(id=" + this.id + ", badge=" + this.badge + ")";
            }
        }

        public Periods(long j11, @NotNull List<PeriodItem> periods, AtomAction atomAction, t tVar, @NotNull String background) {
            Intrinsics.checkNotNullParameter(periods, "periods");
            Intrinsics.checkNotNullParameter(background, "background");
            this.id = j11;
            this.periods = periods;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.background = background;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Periods)) {
                return false;
            }
            Periods periods = (Periods) other;
            return this.id == periods.id && Intrinsics.d(this.periods, periods.periods) && Intrinsics.d(this.action, periods.action) && Intrinsics.d(this.tokenizedEvent, periods.tokenizedEvent) && Intrinsics.d(this.background, periods.background);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackground() {
            return this.background;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final List<PeriodItem> getPeriods() {
            return this.periods;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.periods);
            AtomAction atomAction = this.action;
            int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return this.background.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<PeriodItem> list = this.periods;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            String str = this.background;
            StringBuilder b11 = b.b(j11, "Periods(id=", ", periods=", list);
            Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
            return C6594f.a(", background=", str, ")", b11);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Title;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title implements InstallmentVO {
        private final AtomAction action;
        private final BadgeDTO badge;
        private final long id;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public Title(long j11, @NotNull TextDTO title, BadgeDTO badgeDTO, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.title = title;
            this.badge = badgeDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return this.id == title.id && Intrinsics.d(this.title, title.title) && Intrinsics.d(this.badge, title.badge) && Intrinsics.d(this.action, title.action) && Intrinsics.d(this.tokenizedEvent, title.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.title;
            BadgeDTO badgeDTO = this.badge;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = a.b("Title(id=", j11, ", title=", textDTO);
            b11.append(", badge=");
            b11.append(badgeDTO);
            b11.append(", action=");
            b11.append(atomAction);
            return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u0001IB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ¬\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0014\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b@\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO;", "", "id", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "price", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "animationTimer", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "animationTokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "showTopRounding", "hasPeriods", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "needShowOnboardingData", "tokenizedEvent", "Lru/ozon/uni/atoms/data/button/Icon;", "priceIcon", "", "background", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "chevronIcon", "<init>", "(JLru/ozon/app/android/atoms/data/price/PriceWithTitle;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Integer;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;ZZLru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;LWZ/t;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)V", "copy", "(JLru/ozon/app/android/atoms/data/price/PriceWithTitle;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Integer;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;ZZLru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;LWZ/t;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;)Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "getPrice", "()Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Integer;", "getAnimationTimer", "()Ljava/lang/Integer;", "LWZ/t;", "getAnimationTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Z", "getShowTopRounding", "()Z", "getHasPeriods", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "getNeedShowOnboardingData", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "getTokenizedEvent", "Lru/ozon/uni/atoms/data/button/Icon;", "getPriceIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBackground", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getChevronIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "NeedShowOnboardingData", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Purchase implements InstallmentVO {
        private final AtomAction action;
        private final Integer animationTimer;
        private final t animationTokenizedEvent;

        @NotNull
        private final String background;
        private final CommonAtomIconDTO chevronIcon;
        private final boolean hasPeriods;
        private final long id;

        @NotNull
        private final NeedShowOnboardingData needShowOnboardingData;
        private final OnBoardingDTO onboarding;

        @NotNull
        private final PriceWithTitle price;
        private final Icon priceIcon;
        private final boolean showTopRounding;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "", "Empty", "Show", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData$Empty;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData$Show;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface NeedShowOnboardingData {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData$Empty;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Empty implements NeedShowOnboardingData {

                @NotNull
                public static final Empty INSTANCE = new Empty();

                private Empty() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof Empty);
                }

                public int hashCode() {
                    return 945401150;
                }

                @NotNull
                public String toString() {
                    return "Empty";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData$Show;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase$NeedShowOnboardingData;", "", "additionalHeight", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAdditionalHeight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Show implements NeedShowOnboardingData {
                private final int additionalHeight;

                public Show(int i11) {
                    this.additionalHeight = i11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Show) && this.additionalHeight == ((Show) other).additionalHeight;
                }

                public final int getAdditionalHeight() {
                    return this.additionalHeight;
                }

                public int hashCode() {
                    return Integer.hashCode(this.additionalHeight);
                }

                @NotNull
                public String toString() {
                    return E.a(this.additionalHeight, "Show(additionalHeight=", ")");
                }
            }
        }

        public Purchase(long j11, @NotNull PriceWithTitle price, AtomAction atomAction, Integer num, t tVar, OnBoardingDTO onBoardingDTO, boolean z11, boolean z12, @NotNull NeedShowOnboardingData needShowOnboardingData, t tVar2, Icon icon, @NotNull String background, CommonAtomIconDTO commonAtomIconDTO) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(needShowOnboardingData, "needShowOnboardingData");
            Intrinsics.checkNotNullParameter(background, "background");
            this.id = j11;
            this.price = price;
            this.action = atomAction;
            this.animationTimer = num;
            this.animationTokenizedEvent = tVar;
            this.onboarding = onBoardingDTO;
            this.showTopRounding = z11;
            this.hasPeriods = z12;
            this.needShowOnboardingData = needShowOnboardingData;
            this.tokenizedEvent = tVar2;
            this.priceIcon = icon;
            this.background = background;
            this.chevronIcon = commonAtomIconDTO;
        }

        @NotNull
        public final Purchase copy(long id2, @NotNull PriceWithTitle price, AtomAction action, Integer animationTimer, t animationTokenizedEvent, OnBoardingDTO onboarding, boolean showTopRounding, boolean hasPeriods, @NotNull NeedShowOnboardingData needShowOnboardingData, t tokenizedEvent, Icon priceIcon, @NotNull String background, CommonAtomIconDTO chevronIcon) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(needShowOnboardingData, "needShowOnboardingData");
            Intrinsics.checkNotNullParameter(background, "background");
            return new Purchase(id2, price, action, animationTimer, animationTokenizedEvent, onboarding, showTopRounding, hasPeriods, needShowOnboardingData, tokenizedEvent, priceIcon, background, chevronIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Purchase)) {
                return false;
            }
            Purchase purchase = (Purchase) other;
            return this.id == purchase.id && Intrinsics.d(this.price, purchase.price) && Intrinsics.d(this.action, purchase.action) && Intrinsics.d(this.animationTimer, purchase.animationTimer) && Intrinsics.d(this.animationTokenizedEvent, purchase.animationTokenizedEvent) && Intrinsics.d(this.onboarding, purchase.onboarding) && this.showTopRounding == purchase.showTopRounding && this.hasPeriods == purchase.hasPeriods && Intrinsics.d(this.needShowOnboardingData, purchase.needShowOnboardingData) && Intrinsics.d(this.tokenizedEvent, purchase.tokenizedEvent) && Intrinsics.d(this.priceIcon, purchase.priceIcon) && Intrinsics.d(this.background, purchase.background) && Intrinsics.d(this.chevronIcon, purchase.chevronIcon);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final t getAnimationTokenizedEvent() {
            return this.animationTokenizedEvent;
        }

        @NotNull
        public final String getBackground() {
            return this.background;
        }

        public final CommonAtomIconDTO getChevronIcon() {
            return this.chevronIcon;
        }

        public final boolean getHasPeriods() {
            return this.hasPeriods;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final NeedShowOnboardingData getNeedShowOnboardingData() {
            return this.needShowOnboardingData;
        }

        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final PriceWithTitle getPrice() {
            return this.price;
        }

        public final Icon getPriceIcon() {
            return this.priceIcon;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final boolean getShowTopRounding() {
            return this.showTopRounding;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = (this.price.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Integer num = this.animationTimer;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            t tVar = this.animationTokenizedEvent;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            int hashCode5 = (this.needShowOnboardingData.hashCode() + C3532b.a(C3532b.a((hashCode4 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31, 31, this.showTopRounding), 31, this.hasPeriods)) * 31;
            t tVar2 = this.tokenizedEvent;
            int hashCode6 = (hashCode5 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            Icon icon = this.priceIcon;
            int a11 = g.a((hashCode6 + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.background);
            CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
            return a11 + (commonAtomIconDTO != null ? commonAtomIconDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            PriceWithTitle priceWithTitle = this.price;
            AtomAction atomAction = this.action;
            Integer num = this.animationTimer;
            t tVar = this.animationTokenizedEvent;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            boolean z11 = this.showTopRounding;
            boolean z12 = this.hasPeriods;
            NeedShowOnboardingData needShowOnboardingData = this.needShowOnboardingData;
            t tVar2 = this.tokenizedEvent;
            Icon icon = this.priceIcon;
            String str = this.background;
            CommonAtomIconDTO commonAtomIconDTO = this.chevronIcon;
            StringBuilder sb2 = new StringBuilder("Purchase(id=");
            sb2.append(j11);
            sb2.append(", price=");
            sb2.append(priceWithTitle);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", animationTimer=");
            sb2.append(num);
            sb2.append(", animationTokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", onboarding=");
            sb2.append(onBoardingDTO);
            C2436a.e(", showTopRounding=", ", hasPeriods=", sb2, z11, z12);
            sb2.append(", needShowOnboardingData=");
            sb2.append(needShowOnboardingData);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar2);
            sb2.append(", priceIcon=");
            sb2.append(icon);
            sb2.append(", background=");
            sb2.append(str);
            sb2.append(", chevronIcon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ Purchase(long j11, PriceWithTitle priceWithTitle, AtomAction atomAction, Integer num, t tVar, OnBoardingDTO onBoardingDTO, boolean z11, boolean z12, NeedShowOnboardingData needShowOnboardingData, t tVar2, Icon icon, String str, CommonAtomIconDTO commonAtomIconDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, priceWithTitle, atomAction, num, tVar, onBoardingDTO, z11, z12, (i11 & 256) != 0 ? NeedShowOnboardingData.Empty.INSTANCE : needShowOnboardingData, tVar2, icon, str, commonAtomIconDTO);
        }
    }
}
