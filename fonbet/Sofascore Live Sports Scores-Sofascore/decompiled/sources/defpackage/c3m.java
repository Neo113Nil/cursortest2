package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate;
import com.blaze.blazesdk.delegates.models.BlazeCTAActionType;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c3m implements BlazePlayerInContainerDelegate {
    public final /* synthetic */ hzl a;

    public c3m(hzl hzlVar) {
        this.a = hzlVar;
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onDataLoadComplete(BlazePlayerType blazePlayerType, String str, int i, BlazeResult blazeResult) {
        blazePlayerType.getClass();
        blazeResult.getClass();
        hzl hzlVar = this.a;
        Integer num = hzlVar.k;
        if (Intrinsics.c(str, num != null ? ((BlazeMomentsContainerTabItem) hzlVar.o(num.intValue())).getContainerId() : null) && i == 0) {
            hzlVar.d.invoke();
        }
        hzlVar.c.onDataLoadComplete(blazePlayerType, (String) hzlVar.f.invoke(str), i, blazeResult);
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onDataLoadStarted(BlazePlayerType blazePlayerType, String str) {
        blazePlayerType.getClass();
        hzl hzlVar = this.a;
        hzlVar.c.onDataLoadStarted(blazePlayerType, (String) hzlVar.f.invoke(str));
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onPlayerDidAppear(BlazePlayerType blazePlayerType, String str) {
        blazePlayerType.getClass();
        hzl hzlVar = this.a;
        hzlVar.d.invoke();
        hzlVar.c.onPlayerDidAppear(blazePlayerType, (String) hzlVar.f.invoke(str));
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onPlayerDidDismiss(BlazePlayerType blazePlayerType, String str) {
        blazePlayerType.getClass();
        hzl hzlVar = this.a;
        hzlVar.c.onPlayerDidDismiss(blazePlayerType, (String) hzlVar.f.invoke(str));
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onPlayerEventTriggered(BlazePlayerType blazePlayerType, String str, BlazePlayerEvent blazePlayerEvent) {
        blazePlayerType.getClass();
        blazePlayerEvent.getClass();
        hzl hzlVar = this.a;
        hzlVar.c.onPlayerEventTriggered(blazePlayerType, (String) hzlVar.f.invoke(str), blazePlayerEvent);
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final boolean onTriggerCTA(BlazePlayerType blazePlayerType, String str, BlazeCTAActionType blazeCTAActionType, String str2) {
        blazePlayerType.getClass();
        blazeCTAActionType.getClass();
        str2.getClass();
        hzl hzlVar = this.a;
        return hzlVar.c.onTriggerCTA(blazePlayerType, (String) hzlVar.f.invoke(str), blazeCTAActionType, str2);
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final void onTriggerCustomActionButton(BlazePlayerType blazePlayerType, String str, BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams) {
        blazePlayerType.getClass();
        blazePlayerCustomActionButtonParams.getClass();
        hzl hzlVar = this.a;
        hzlVar.c.onTriggerCustomActionButton(blazePlayerType, (String) hzlVar.f.invoke(str), blazePlayerCustomActionButtonParams);
    }

    @Override // com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate, com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate
    public final BlazeLinkActionHandleType onTriggerPlayerBodyTextLink(BlazePlayerType blazePlayerType, String str, String str2) {
        blazePlayerType.getClass();
        str2.getClass();
        hzl hzlVar = this.a;
        return hzlVar.c.onTriggerPlayerBodyTextLink(blazePlayerType, (String) hzlVar.f.invoke(str), str2);
    }
}
