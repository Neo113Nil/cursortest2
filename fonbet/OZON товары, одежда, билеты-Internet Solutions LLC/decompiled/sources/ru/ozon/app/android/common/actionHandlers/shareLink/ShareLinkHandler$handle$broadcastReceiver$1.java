package ru.ozon.app.android.common.actionHandlers.shareLink;

import Bq.C2668a;
import UZ.a;
import WZ.g;
import WZ.h;
import WZ.t;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"ru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler$handle$broadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareLinkHandler$handle$broadcastReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ t $shareTokenizedEvent;
    final /* synthetic */ ShareLinkHandler this$0;

    ShareLinkHandler$handle$broadcastReceiver$1(t tVar, ShareLinkHandler shareLinkHandler) {
        this.$shareTokenizedEvent = tVar;
        this.this$0 = shareLinkHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onReceive$lambda$0(String str, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        Map<String, Object> b11 = params.b();
        Pair[] pairs = {new Pair(SelectionItemFormDTO.TITLE_FIELD_NAME, str)};
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap a11 = h.a(b11);
        U.o(a11, pairs);
        return g.a(params, a11, null, 2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i iVar;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        ComponentName componentName = intent != null ? (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT") : null;
        String packageName = componentName != null ? componentName.getPackageName() : null;
        if (packageName == null || this.$shareTokenizedEvent == null) {
            return;
        }
        iVar = this.this$0.container;
        TokenizedAnalyticsExtensionsKt.processNonViewEvents(iVar.X(), this.$shareTokenizedEvent, new C2668a(packageName, 0));
    }
}
