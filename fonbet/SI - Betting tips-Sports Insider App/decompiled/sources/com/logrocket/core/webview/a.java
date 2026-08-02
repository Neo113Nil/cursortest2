package com.logrocket.core.webview;

import com.logrocket.core.f0;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends JSONObject {
    public a(f0 f0Var) {
        put("type", "LOGROCKET_WEB_VIEW_RECORDING_STATUS");
        put("appID", f0Var.f6445a);
        put("recordingID", f0Var.f6446b);
        put("sessionID", f0Var.f6447c);
        put(PredictionTable.statusColumn, true);
    }

    public a(f0 f0Var, long j) {
        put("type", "LOGROCKET_WEB_VIEW_ACTIVITY");
        put("appID", f0Var.f6445a);
        put("recordingID", f0Var.f6446b);
        put("sessionID", f0Var.f6447c);
        put("activityTime", j);
    }
}
