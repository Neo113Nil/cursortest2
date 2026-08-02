package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2757y8 extends File {
    public C2757y8(String str, String str2) {
        super(str, str2);
    }

    public JSONObject a() throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put("name", getName());
        jsonObjectInit.put("path", getPath());
        jsonObjectInit.put("lastModified", lastModified());
        if (isFile()) {
            jsonObjectInit.put("size", length());
        }
        return jsonObjectInit;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C2757y8(String str) {
        super(str);
    }
}
