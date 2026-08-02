package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.T5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class V5 {
    private final Context a;
    private final C2396e5 b;
    private final U5 c;
    private final Nb d;
    private final InterfaceC2738x7 e = Jb.Y().a();

    public V5(Context context, C2396e5 c2396e5, U5 u5, Nb nb) {
        this.a = context;
        this.b = c2396e5;
        this.c = u5;
        this.d = nb;
    }

    public void a(C2757y8 c2757y8, String str, int i, int i2, Nc nc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(T5.a.a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(Z3.A);
        }
        if (!T3.h(this.a)) {
            throw new Exception(Z3.C);
        }
        this.c.a(c2757y8.getPath(), new a(nc));
        if (!c2757y8.exists()) {
            this.b.a(c2757y8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c2757y8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(C2757y8 c2757y8) throws Exception {
        if (c2757y8.exists()) {
            ArrayList<C2757y8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c2757y8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c2757y8) || !c2757y8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C2757y8 c2757y8) throws Exception {
        if (c2757y8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c2757y8, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C2757y8 c2757y8) throws Exception {
        if (c2757y8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c2757y8);
        }
        throw new Exception("Folder does not exist");
    }

    class a implements Nc {
        final /* synthetic */ Nc a;

        /* renamed from: com.ironsource.V5$a$a, reason: collision with other inner class name */
        class C0186a extends JSONObject {
            C0186a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(Nc nc) {
            this.a = nc;
        }

        @Override // com.ironsource.Nc
        public void a(C2757y8 c2757y8) {
            this.a.a(c2757y8);
            try {
                V5.this.d.a(c2757y8.getName(), SafeIronSourceIronsourceBridge.com_ironsource_V5$a$a_jsonObjectInit(this));
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C2757y8 c2757y8, C2596p8 c2596p8) {
            this.a.a(c2757y8, c2596p8);
        }
    }

    public void a(C2757y8 c2757y8) throws Exception {
        if (c2757y8.exists()) {
            if (c2757y8.delete()) {
                this.d.a(c2757y8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C2757y8 c2757y8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c2757y8.exists()) {
                if (!this.d.b(c2757y8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
