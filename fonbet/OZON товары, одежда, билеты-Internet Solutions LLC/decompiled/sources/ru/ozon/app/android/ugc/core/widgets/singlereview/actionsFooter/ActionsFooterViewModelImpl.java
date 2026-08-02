package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModelImpl;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "reviewUuid", "", "isLiked", "", "votePressed", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;Z)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lze/h;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent;", "_singleEvent", "Lze/h;", "LAe/h;", "singleEvent", "LAe/h;", "getSingleEvent", "()LAe/h;", "processing", "Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionsFooterViewModelImpl extends w0 {

    @NotNull
    private final h<ActionsFooterViewModel$SingleEvent> _singleEvent;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private boolean processing;

    @NotNull
    private final InterfaceC2395h<ActionsFooterViewModel$SingleEvent> singleEvent;

    public ActionsFooterViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        C11115c a11 = k.a(-2, 6, null);
        this._singleEvent = a11;
        this.singleEvent = C2399j.H(a11);
    }

    @NotNull
    public InterfaceC2395h<ActionsFooterViewModel$SingleEvent> getSingleEvent() {
        return this.singleEvent;
    }

    public void votePressed(@NotNull AtomAction.Click action, @NotNull String reviewUuid, boolean isLiked) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        String link = action.getLink();
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("reaction")) == null) {
            str = "like";
        }
        String str2 = str;
        if (link == null || params == null || this.processing) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new ActionsFooterViewModelImpl$votePressed$1(this, reviewUuid, isLiked, str2, params, link, null), 3);
    }
}
