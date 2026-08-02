package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* loaded from: classes12.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {
    public final i a;
    public k b;
    public final int c;
    public final int d;
    public final String e;
    public String f;
    public String g;
    public final int h;
    public final HashMap i = new HashMap();

    public c(i iVar, int i, int i2, String str, int i3) {
        this.a = iVar;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.h = i3;
    }

    public final void a(x xVar, String str) {
        List list = (List) this.i.get(xVar);
        if (list == null) {
            list = new ArrayList();
            this.i.put(xVar, list);
        }
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.c);
        sb.append(" h:");
        sb.append(this.d);
        sb.append(" type:");
        sb.append(this.a.toString());
        sb.append(" creativeType: ");
        k kVar = this.b;
        sb.append(kVar != null ? kVar.mimeType : "none");
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" events:");
        sb.append(this.i);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.i.isEmpty()) {
            return null;
        }
        return (List) this.i.get(xVar);
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Logger.METHOD_W, this.c);
            jSONObject.put("h", this.d);
            jSONObject.put("type", this.a.toString());
            k kVar = this.b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, this.f);
            return jSONObject;
        } catch (JSONException e) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
            return jSONObject;
        }
    }
}
