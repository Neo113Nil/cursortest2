package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.S5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import defpackage.ogj;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class U5 {
    private final Context a;
    private final C4015c5 b;
    private final T5 c;
    private final Nb d;
    private final InterfaceC4339u7 e = Ib.a0().a();

    public U5(Context context, C4015c5 c4015c5, T5 t5, Nb nb) {
        this.a = context;
        this.b = c4015c5;
        this.c = t5;
        this.d = nb;
    }

    public void a(C4376w8 c4376w8, String str, int i, int i2, Nc nc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            ogj.k(S5.a.a);
            return;
        }
        if (this.e.a(this.b.a()) <= 0) {
            ogj.k(W3.A);
            return;
        }
        if (!Q3.h(this.a)) {
            ogj.k(W3.C);
            return;
        }
        this.c.a(c4376w8.getPath(), new a(nc));
        if (!c4376w8.exists()) {
            this.b.a(c4376w8, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = c4376w8;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void b(C4376w8 c4376w8) throws Exception {
        if (c4376w8.exists()) {
            ArrayList<C4376w8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c4376w8);
            if (IronSourceStorageUtils.deleteFolderContentRecursive(c4376w8) && c4376w8.delete()) {
                this.d.a(filesInFolderRecursive);
            } else {
                ogj.k("Failed to delete folder");
            }
        }
    }

    public JSONObject c(C4376w8 c4376w8) throws Exception {
        if (c4376w8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c4376w8, this.d.b());
        }
        ogj.k("Folder does not exist");
        return null;
    }

    public long d(C4376w8 c4376w8) throws Exception {
        if (c4376w8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c4376w8);
        }
        ogj.k("Folder does not exist");
        return 0L;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Nc {
        final /* synthetic */ Nc a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.U5$a$a, reason: collision with other inner class name */
        public class C0192a extends JSONObject {
            public C0192a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(Nc nc) {
            this.a = nc;
        }

        @Override // com.ironsource.Nc
        public void a(C4376w8 c4376w8) {
            this.a.a(c4376w8);
            try {
                U5.this.d.a(c4376w8.getName(), new C0192a());
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C4376w8 c4376w8, C4215n8 c4215n8) {
            this.a.a(c4376w8, c4215n8);
        }
    }

    public void a(C4376w8 c4376w8) throws Exception {
        if (c4376w8.exists()) {
            if (c4376w8.delete()) {
                this.d.a(c4376w8.getName());
            } else {
                ogj.k("Failed to delete file");
            }
        }
    }

    public void a(C4376w8 c4376w8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c4376w8.exists()) {
                if (this.d.b(c4376w8.getName(), jSONObject)) {
                    return;
                }
                ogj.k("Failed to update attribute");
                return;
            }
            ogj.k("File does not exist");
            return;
        }
        ogj.k("Missing attributes to update");
    }
}
