package ng;

import Uf.j;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.android.tracking.TrackingHelper;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import pd.h;
import rd.C6218a;

/* renamed from: ng.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5735a implements Uf.a {
    @Override // Uf.a
    public void a(String str, Object obj) {
        if (str.equalsIgnoreCase("libraryproperties")) {
            if (!UTSUtil.isTrackingEnabled()) {
                UTSAdapter.disconnect();
                return;
            } else {
                if (LiveChatUtil.isSupportedVersion() && LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled()) {
                    ZohoLiveChat.getApplicationManager();
                    UTSUtil.connectToUTS(j.n());
                    return;
                }
                return;
            }
        }
        if (!str.equalsIgnoreCase("networkstatus")) {
            if (str.equalsIgnoreCase("uts_path")) {
                try {
                    TrackingHelper.updatePageTitle(LiveChatUtil.getString(obj));
                    return;
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                    return;
                }
            }
            return;
        }
        if (!((Boolean) obj).booleanValue()) {
            if (C6218a.W()) {
                return;
            }
            UTSAdapter.setNoReconnect();
        } else if (C6218a.W() && UTSAdapter.getConnStatus() == UTSAdapter.Status.DISCONNECTED && !Q.w()) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new h(null, null));
        }
    }
}
