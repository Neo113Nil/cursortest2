package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation;

import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v2/presentation/SearchResultsNavTitleV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvents", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvents", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchResultsNavTitleV2VO implements c {
    private final String backgroundColor;
    private final AtomAction clickAction;
    private final long id;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t viewEvents;

    public SearchResultsNavTitleV2VO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, String str, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundColor = str;
        this.clickAction = atomAction;
        this.viewEvents = tVar;
        this.onboarding = onBoardingDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsNavTitleV2VO)) {
            return false;
        }
        SearchResultsNavTitleV2VO searchResultsNavTitleV2VO = (SearchResultsNavTitleV2VO) other;
        return this.id == searchResultsNavTitleV2VO.id && Intrinsics.d(this.title, searchResultsNavTitleV2VO.title) && Intrinsics.d(this.subtitle, searchResultsNavTitleV2VO.subtitle) && Intrinsics.d(this.backgroundColor, searchResultsNavTitleV2VO.backgroundColor) && Intrinsics.d(this.clickAction, searchResultsNavTitleV2VO.clickAction) && Intrinsics.d(this.viewEvents, searchResultsNavTitleV2VO.viewEvents) && Intrinsics.d(this.onboarding, searchResultsNavTitleV2VO.onboarding);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
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

    public final t getViewEvents() {
        return this.viewEvents;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.subtitle, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.clickAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.viewEvents;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode3 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.backgroundColor;
        AtomAction atomAction = this.clickAction;
        t tVar = this.viewEvents;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        StringBuilder b11 = a.b("SearchResultsNavTitleV2VO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", backgroundColor=");
        b11.append(str);
        Fj.c.e(tVar, ", clickAction=", ", viewEvents=", b11, atomAction);
        b11.append(", onboarding=");
        b11.append(onBoardingDTO);
        b11.append(")");
        return b11.toString();
    }
}
