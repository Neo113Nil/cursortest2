package ru.ozon.app.android.partnerBanks.presentation.view;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "", "LWZ/l;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "partnerBanksView", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "partnerBanksVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;Lkotlin/jvm/functions/Function1;)V", "trackView", "()V", "onDetach", "LWZ/l;", "model", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "currentView", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartnerBanksDelegate {
    private PartnerBanksView currentView;
    private PartnerBanksVO model;

    @NotNull
    private final l tokenizedAnalytics;

    public PartnerBanksDelegate(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void bindOrGone(@NotNull PartnerBanksView partnerBanksView, PartnerBanksVO partnerBanksVO, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(partnerBanksView, "partnerBanksView");
        this.model = partnerBanksVO;
        this.currentView = partnerBanksView;
        partnerBanksView.bindOrGone(partnerBanksVO, actionHandler);
    }

    public final void onDetach() {
        this.currentView = null;
        this.model = null;
    }

    public final void trackView() {
        t tokenizedEvent;
        PartnerBanksVO partnerBanksVO = this.model;
        if (partnerBanksVO == null || (tokenizedEvent = partnerBanksVO.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }
}
