package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.V5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class X5 {
    private final Context a;
    private final C4292e5 b;
    private final W5 c;
    private final Ob d;
    private final InterfaceC4652y7 e = Kb.Y().a();

    public X5(Context context, C4292e5 c4292e5, W5 w5, Ob ob) {
        this.a = context;
        this.b = c4292e5;
        this.c = w5;
        this.d = ob;
    }

    public void b(C4671z8 c4671z8) throws Exception {
        if (c4671z8.exists()) {
            ArrayList<C4671z8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c4671z8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c4671z8) || !c4671z8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C4671z8 c4671z8) throws Exception {
        if (c4671z8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c4671z8, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C4671z8 c4671z8) throws Exception {
        if (c4671z8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c4671z8);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(C4671z8 c4671z8, String str, int i, int i2, Oc oc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(V5.a.a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(Z3.A);
        }
        if (!T3.h(this.a)) {
            throw new Exception(Z3.C);
        }
        this.c.a(c4671z8.getPath(), new a(oc));
        if (!c4671z8.exists()) {
            this.b.a(c4671z8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c4671z8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public class a implements Oc {
        final /* synthetic */ Oc a;

        /* renamed from: com.ironsource.X5$a$a, reason: collision with other inner class name */
        public class C0210a extends JSONObject {
            public C0210a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(Oc oc) {
            this.a = oc;
        }

        @Override // com.ironsource.Oc
        public void a(C4671z8 c4671z8) {
            this.a.a(c4671z8);
            try {
                X5.this.d.a(c4671z8.getName(), new C0210a());
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C4671z8 c4671z8, C4510q8 c4510q8) {
            this.a.a(c4671z8, c4510q8);
        }
    }

    public void a(C4671z8 c4671z8) throws Exception {
        if (c4671z8.exists()) {
            if (c4671z8.delete()) {
                this.d.a(c4671z8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C4671z8 c4671z8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c4671z8.exists()) {
                if (!this.d.b(c4671z8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
