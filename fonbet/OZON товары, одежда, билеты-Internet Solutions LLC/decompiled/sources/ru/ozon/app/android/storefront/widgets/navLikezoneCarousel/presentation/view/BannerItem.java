package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view;

import G.g;
import Nh.a;
import WZ.d;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\fj\u0002`\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\fj\u0002`\rH&¢\u0006\u0004\b\u0011\u0010\u0010\u0082\u0001\u0001\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "view", "", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "onClick", "(Lkotlin/jvm/functions/Function1;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "trackView", "(LWZ/l;)V", "trackScrollEvent", "Abstract", "LeftAlign", "CenterAlign", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$Abstract;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BannerItem {

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00122\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00122\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001c\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$Abstract;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "backgroundImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "Lkotlin/Function1;", "", "actionHandler", "onClick", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "view", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "trackView", "(LWZ/l;)V", "trackScrollEvent", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Abstract implements BannerItem {
        private final AtomAction action;
        private final BadgeDTO actionBadge;
        private final String backgroundColor;

        @NotNull
        private final String backgroundImage;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public Abstract(@NotNull TextDTO title, TextDTO textDTO, String str, @NotNull String backgroundImage, BadgeDTO badgeDTO, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            this.title = title;
            this.subtitle = textDTO;
            this.backgroundColor = str;
            this.backgroundImage = backgroundImage;
            this.actionBadge = badgeDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void applyState(@NotNull NavLikezoneCaruselBanner view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.updateBackgroundColor(this.backgroundColor);
            view.updateBackgroundImage(this.backgroundImage);
            view.updateTitle(this.title);
            view.updateSubtitle(this.subtitle);
            view.updateBadge(this.actionBadge);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void onClick(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            AtomAction atomAction = this.action;
            if (atomAction != null) {
                actionHandler.invoke(atomAction);
            }
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void trackScrollEvent(@NotNull l tokenizedAnalytics) {
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            t tVar = this.tokenizedEvent;
            if (tVar != null) {
                tokenizedAnalytics.f(tVar, new d(BannerItem$Abstract$trackScrollEvent$1$1.INSTANCE), null);
            }
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void trackView(@NotNull l tokenizedAnalytics) {
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            t tVar = this.tokenizedEvent;
            if (tVar != null) {
                m.c(tokenizedAnalytics, tVar, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001c\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$CenterAlign;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$Abstract;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "accentImage", "backgroundColor", "backgroundImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "hasTopBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "view", "", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CenterAlign extends Abstract {
        private final String accentImage;
        private final AtomAction action;
        private final BadgeDTO actionBadge;
        private final String backgroundColor;

        @NotNull
        private final String backgroundImage;
        private final boolean hasTopBadge;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CenterAlign(@NotNull TextDTO title, TextDTO textDTO, String str, String str2, @NotNull String backgroundImage, BadgeDTO badgeDTO, AtomAction atomAction, t tVar, boolean z11) {
            super(title, textDTO, str2, backgroundImage, badgeDTO, atomAction, tVar);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            this.title = title;
            this.subtitle = textDTO;
            this.accentImage = str;
            this.backgroundColor = str2;
            this.backgroundImage = backgroundImage;
            this.actionBadge = badgeDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.hasTopBadge = z11;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem.Abstract, ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void applyState(@NotNull NavLikezoneCaruselBanner view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.accentImage == null) {
                view.setupBottomCenterAlign();
            } else {
                view.setupTopCenterAlign();
            }
            view.updateAccentImage(this.accentImage, true);
            super.applyState(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterAlign)) {
                return false;
            }
            CenterAlign centerAlign = (CenterAlign) other;
            return Intrinsics.d(this.title, centerAlign.title) && Intrinsics.d(this.subtitle, centerAlign.subtitle) && Intrinsics.d(this.accentImage, centerAlign.accentImage) && Intrinsics.d(this.backgroundColor, centerAlign.backgroundColor) && Intrinsics.d(this.backgroundImage, centerAlign.backgroundImage) && Intrinsics.d(this.actionBadge, centerAlign.actionBadge) && Intrinsics.d(this.action, centerAlign.action) && Intrinsics.d(this.tokenizedEvent, centerAlign.tokenizedEvent) && this.hasTopBadge == centerAlign.hasTopBadge;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.accentImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a11 = g.a((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.backgroundImage);
            BadgeDTO badgeDTO = this.actionBadge;
            int hashCode4 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.hasTopBadge) + ((hashCode5 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.accentImage;
            String str2 = this.backgroundColor;
            String str3 = this.backgroundImage;
            BadgeDTO badgeDTO = this.actionBadge;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.hasTopBadge;
            StringBuilder g10 = D3.g.g("CenterAlign(title=", textDTO, ", subtitle=", textDTO2, ", accentImage=");
            a.h(g10, str, ", backgroundColor=", str2, ", backgroundImage=");
            g10.append(str3);
            g10.append(", actionBadge=");
            g10.append(badgeDTO);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(", tokenizedEvent=");
            g10.append(tVar);
            g10.append(", hasTopBadge=");
            return Pk0.a.a(")", g10, z11);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001c\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$LeftAlign;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem$Abstract;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "accentImage", "backgroundColor", "backgroundImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "hasTopBadge", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Z)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "view", "", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftAlign extends Abstract {
        private final String accentImage;
        private final AtomAction action;
        private final BadgeDTO actionBadge;
        private final String backgroundColor;

        @NotNull
        private final String backgroundImage;
        private final boolean hasTopBadge;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeftAlign(@NotNull TextDTO title, TextDTO textDTO, String str, String str2, @NotNull String backgroundImage, BadgeDTO badgeDTO, AtomAction atomAction, t tVar, boolean z11) {
            super(title, textDTO, str2, backgroundImage, badgeDTO, atomAction, tVar);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            this.title = title;
            this.subtitle = textDTO;
            this.accentImage = str;
            this.backgroundColor = str2;
            this.backgroundImage = backgroundImage;
            this.actionBadge = badgeDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.hasTopBadge = z11;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem.Abstract, ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem
        public void applyState(@NotNull NavLikezoneCaruselBanner view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setupLeftAlign();
            view.updateAccentImage(this.accentImage, false);
            view.updateTopMargin(this.hasTopBadge ? Dimens.INSTANCE.getDp48() : Dimens.INSTANCE.getDp28());
            super.applyState(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftAlign)) {
                return false;
            }
            LeftAlign leftAlign = (LeftAlign) other;
            return Intrinsics.d(this.title, leftAlign.title) && Intrinsics.d(this.subtitle, leftAlign.subtitle) && Intrinsics.d(this.accentImage, leftAlign.accentImage) && Intrinsics.d(this.backgroundColor, leftAlign.backgroundColor) && Intrinsics.d(this.backgroundImage, leftAlign.backgroundImage) && Intrinsics.d(this.actionBadge, leftAlign.actionBadge) && Intrinsics.d(this.action, leftAlign.action) && Intrinsics.d(this.tokenizedEvent, leftAlign.tokenizedEvent) && this.hasTopBadge == leftAlign.hasTopBadge;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.accentImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a11 = g.a((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.backgroundImage);
            BadgeDTO badgeDTO = this.actionBadge;
            int hashCode4 = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.hasTopBadge) + ((hashCode5 + (tVar != null ? tVar.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.accentImage;
            String str2 = this.backgroundColor;
            String str3 = this.backgroundImage;
            BadgeDTO badgeDTO = this.actionBadge;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.hasTopBadge;
            StringBuilder g10 = D3.g.g("LeftAlign(title=", textDTO, ", subtitle=", textDTO2, ", accentImage=");
            a.h(g10, str, ", backgroundColor=", str2, ", backgroundImage=");
            g10.append(str3);
            g10.append(", actionBadge=");
            g10.append(badgeDTO);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(", tokenizedEvent=");
            g10.append(tVar);
            g10.append(", hasTopBadge=");
            return Pk0.a.a(")", g10, z11);
        }
    }

    void applyState(@NotNull NavLikezoneCaruselBanner view);

    void onClick(@NotNull Function1<? super AtomAction, Unit> actionHandler);

    void trackScrollEvent(@NotNull l tokenizedAnalytics);

    void trackView(@NotNull l tokenizedAnalytics);
}
