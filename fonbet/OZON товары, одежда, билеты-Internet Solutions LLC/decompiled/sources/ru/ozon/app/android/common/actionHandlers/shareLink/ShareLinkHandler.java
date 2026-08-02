package ru.ozon.app.android.common.actionHandlers.shareLink;

import WZ.t;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.a;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler;", "", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "shareTokenizedEvent", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$Click;LWZ/t;)V", "Ll10/i;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareLinkHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final i container;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkHandler$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "KEY_TEXT", "KEY_TITLE", "ACTION_SHARE", "CELL_TITLE", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShareLinkHandler(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    public final void handle(@NotNull AtomAction.Click action, t shareTokenizedEvent) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.getLink() == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("text") : null;
        if (str == null) {
            str = "";
        }
        String link = action.getLink();
        String obj = h.z0(str + " " + (link != null ? link : "")).toString();
        Map<String, String> params2 = action.getParams();
        String str2 = params2 != null ? params2.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
        r i11 = this.container.Q().i();
        ShareLinkHandler$handle$broadcastReceiver$1 shareLinkHandler$handle$broadcastReceiver$1 = new ShareLinkHandler$handle$broadcastReceiver$1(shareTokenizedEvent, this);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", obj).setType("text/plain");
        Intent createChooser = Intent.createChooser(intent, str2, PendingIntent.getBroadcast(i11, 0, new Intent("ru.ozon.app.android.ACTION_SHARE"), 201326592).getIntentSender());
        a.registerReceiver(i11, shareLinkHandler$handle$broadcastReceiver$1, new IntentFilter("ru.ozon.app.android.ACTION_SHARE"), 2);
        i11.startActivity(createChooser);
    }
}
