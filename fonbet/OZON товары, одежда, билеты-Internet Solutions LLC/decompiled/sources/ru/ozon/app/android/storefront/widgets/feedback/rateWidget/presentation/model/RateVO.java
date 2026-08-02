package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model;

import Ak.b;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JP\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b\u000e\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "navbar", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "sections", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "isSelect", "<init>", "(JLru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;Ljava/util/List;LWZ/t;Z)V", "copy", "(JLru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;Ljava/util/List;LWZ/t;Z)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RateVO implements c {
    private final long id;
    private final boolean isSelect;

    @NotNull
    private final FeedbackNavbarVO navbar;

    @NotNull
    private final List<RateSection> sections;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RateVO(long j11, @NotNull FeedbackNavbarVO navbar, @NotNull List<? extends RateSection> sections, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.id = j11;
        this.navbar = navbar;
        this.sections = sections;
        this.tokenizedEvent = tVar;
        this.isSelect = z11;
    }

    public static /* synthetic */ RateVO copy$default(RateVO rateVO, long j11, FeedbackNavbarVO feedbackNavbarVO, List list, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = rateVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            feedbackNavbarVO = rateVO.navbar;
        }
        FeedbackNavbarVO feedbackNavbarVO2 = feedbackNavbarVO;
        if ((i11 & 4) != 0) {
            list = rateVO.sections;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            tVar = rateVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 16) != 0) {
            z11 = rateVO.isSelect;
        }
        return rateVO.copy(j12, feedbackNavbarVO2, list2, tVar2, z11);
    }

    @NotNull
    public final RateVO copy(long id2, @NotNull FeedbackNavbarVO navbar, @NotNull List<? extends RateSection> sections, t tokenizedEvent, boolean isSelect) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new RateVO(id2, navbar, sections, tokenizedEvent, isSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateVO)) {
            return false;
        }
        RateVO rateVO = (RateVO) other;
        return this.id == rateVO.id && Intrinsics.d(this.navbar, rateVO.navbar) && Intrinsics.d(this.sections, rateVO.sections) && Intrinsics.d(this.tokenizedEvent, rateVO.tokenizedEvent) && this.isSelect == rateVO.isSelect;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FeedbackNavbarVO getNavbar() {
        return this.navbar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<RateSection> getSections() {
        return this.sections;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.navbar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.sections);
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isSelect) + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FeedbackNavbarVO feedbackNavbarVO = this.navbar;
        List<RateSection> list = this.sections;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.isSelect;
        StringBuilder sb2 = new StringBuilder("RateVO(id=");
        sb2.append(j11);
        sb2.append(", navbar=");
        sb2.append(feedbackNavbarVO);
        b.h(sb2, ", sections=", list, ", tokenizedEvent=", tVar);
        return Bi.b.f(sb2, ", isSelect=", z11, ")");
    }
}
