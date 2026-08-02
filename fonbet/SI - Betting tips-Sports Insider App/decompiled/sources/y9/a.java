package y9;

import com.logrocket.core.LogRocketCore;
import com.logrocket.core.f0;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f25735a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25736b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25737c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f25738d;

    /* renamed from: e, reason: collision with root package name */
    public final d f25739e;

    public a(f0 f0Var, int i5) {
        this.f25735a = f0Var;
        this.f25736b = i5;
        LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
        this.f25737c = maybeGetInstance != null ? (String) maybeGetInstance.K.f681c : null;
        LogRocketCore maybeGetInstance2 = LogRocketCore.maybeGetInstance();
        this.f25739e = maybeGetInstance2 != null ? (d) maybeGetInstance2.K.f682d : d.ANONYMOUS;
        LogRocketCore maybeGetInstance3 = LogRocketCore.maybeGetInstance();
        this.f25738d = maybeGetInstance3 != null ? (Map) maybeGetInstance3.K.f683e : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r4.length() == 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        JSONObject jSONObject;
        String str;
        int size;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        f0 f0Var = this.f25735a;
        jSONObject3.put("appID", f0Var.f6445a);
        jSONObject3.put("recordingID", f0Var.f6446b);
        jSONObject3.put("sessionID", f0Var.f6447c);
        jSONObject3.put("tabID", f0Var.f6448d);
        jSONObject3.put(PredictionTable.startTimeColumn, f0Var.f6459p);
        jSONObject3.put("batchNumber", this.f25736b);
        jSONObject3.put("anonymousUserId", f0Var.f6449e);
        jSONObject3.put("originalStartTime", f0Var.q);
        LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
        String str2 = null;
        if (maybeGetInstance != null) {
            v9.d dVar = maybeGetInstance.j;
            synchronized (dVar.f24489s) {
                try {
                    size = dVar.f24479g.size();
                    jSONObject2 = size > 0 ? new JSONObject(dVar.f24479g) : null;
                } finally {
                }
            }
            if (!dVar.j.get() && (dVar.f24475c.size() != 0 || size != 0)) {
                jSONObject = new JSONObject();
                try {
                    if (dVar.f24476d.size() > 0) {
                        jSONObject.put("f", new JSONArray((Collection) dVar.f24476d));
                    }
                    if (dVar.f24478f.size() > 0) {
                        jSONObject.put("rc", new JSONArray((Collection) dVar.f24478f));
                    }
                    Double d10 = dVar.f24483l;
                    if (d10 != null) {
                        jSONObject.put("rct", d10);
                    }
                    if (jSONObject2 != null) {
                        jSONObject.put("mc", jSONObject2);
                    }
                } catch (JSONException e7) {
                    dVar.f24482k.e("Error while unloading filter manager data", e7);
                }
            }
        }
        jSONObject = null;
        LogRocketCore maybeGetInstance2 = LogRocketCore.maybeGetInstance();
        JSONArray jSONArray = maybeGetInstance2 != null ? new JSONArray((Collection) maybeGetInstance2.f6464c) : null;
        LogRocketCore maybeGetInstance3 = LogRocketCore.maybeGetInstance();
        JSONObject jSONObject4 = maybeGetInstance3 != null ? new JSONObject(maybeGetInstance3.f6463b) : null;
        LogRocketCore maybeGetInstance4 = LogRocketCore.maybeGetInstance();
        JSONArray jSONArray2 = maybeGetInstance4 != null ? new JSONArray((Collection) maybeGetInstance4.K.f680b) : null;
        LogRocketCore maybeGetInstance5 = LogRocketCore.maybeGetInstance();
        int i5 = maybeGetInstance5 != null ? maybeGetInstance5.f6465d : 0;
        if (i5 != 0) {
            if (i5 == 1) {
                str = "NONE";
            } else if (i5 == 2) {
                str = "LIMITED";
            } else {
                if (i5 != 3) {
                    throw null;
                }
                str = "FULL";
            }
            str2 = str;
        }
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject3.put("triggeredSessions", jSONArray);
        }
        if (jSONObject4 != null && jSONObject4.length() > 0) {
            jSONObject3.put("recordingStatuses", jSONObject4);
        }
        if (jSONObject != null) {
            jSONObject3.put("filterManagerData", jSONObject);
        }
        if (jSONArray2 != null) {
            jSONObject3.put("seenUsers", jSONArray2);
        }
        String str3 = this.f25737c;
        if (str3 != null) {
            jSONObject3.put("lastSeenUser", str3);
        }
        jSONObject3.put("lastSeenIdentityStatus", this.f25739e);
        Map map = this.f25738d;
        if (map != null) {
            jSONObject3.put("lastSeenUserInfo", map);
        }
        jSONObject3.put("lastSeenIdentityStatus", this.f25739e);
        jSONObject3.put("isSessionConfirmed", f0Var.j);
        jSONObject3.put("lookbackType", str2);
        return jSONObject3.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        f0 f0Var = this.f25735a;
        sb3.append(f0Var.f6445a.replace('/', '.'));
        sb3.append(".");
        sb3.append(f0Var.f6446b);
        sb3.append(".");
        sb3.append(f0Var.f6447c);
        sb3.append(".");
        sb3.append(f0Var.f6448d);
        sb2.append(sb3.toString());
        sb2.append(".");
        sb2.append(this.f25736b);
        return sb2.toString();
    }
}
