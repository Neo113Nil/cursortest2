package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.d;
import com.mbridge.msdk.config.component.load.downloader.e;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.foundation.tools.q0;
import io.jsonwebtoken.Header;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {
    com.mbridge.msdk.config.component.load.model.a l;
    private final String h = "LoadCpt";
    final String i = "1000001";
    final String j = "1000002";
    final String k = "1000003";
    int m = 0;
    final f n = new a();

    public class a implements f {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void b(b bVar) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("file_size"), String.valueOf(bVar.c()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", (Map<String, Object>) hashMap));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void d(b bVar) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("percent"), String.valueOf(bVar.d()));
            hashMap.put(c.c("file_size"), String.valueOf(bVar.c()));
            hashMap.put(c.c("file_path"), bVar.h());
            hashMap.put(c.c("md5"), bVar.j());
            try {
                com.mbridge.msdk.config.component.common.file.b e = com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.l.f());
                if (e != null && e.b().contains(Header.COMPRESSION_ALGORITHM) && bVar.d() >= 100) {
                    if (TextUtils.isEmpty(e.d())) {
                        hashMap.put(c.c("file_path"), e.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.f(bVar.h(), com.mbridge.msdk.config.component.common.file.a.d(LoadCpt.this.l.f(), LoadCpt.this.l.b()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        hashMap.put(c.c("file_path"), com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.l.f(), LoadCpt.this.l.b()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", (Map<String, Object>) hashMap));
                if (bVar.k()) {
                    return;
                }
                LoadCpt.this.a("912006", (HashMap<String, Object>) null);
            } catch (Exception e2) {
                LoadCpt.this.a("912005", "1000002", e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("percent"), String.valueOf(bVar.d()));
            hashMap.put(c.c("file_size"), String.valueOf(bVar.c()));
            hashMap.put(c.c("code"), "1000002");
            hashMap.put(c.c("reason"), aVar.a().getMessage());
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", (Map<String, Object>) hashMap));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.k()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.m) {
                return;
            }
            loadCpt.m = currentDownloadRate;
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("percent"), String.valueOf(currentDownloadRate));
            hashMap.put(c.c("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", (Map<String, Object>) hashMap));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void c(b bVar) {
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b b = com.mbridge.msdk.config.component.common.file.a.b(this.l.f(), this.l.b());
            if (b == null) {
                return;
            }
            try {
                new URL(this.l.f());
                int d = (int) (this.l.d() * 100.0f);
                com.mbridge.msdk.config.component.load.model.a aVar = this.l;
                b bVar = new b(aVar, aVar.f(), this.l.b(), b.a(), d);
                bVar.a(this.l.a());
                e.a().a(bVar).b(this.l.h()).a(this.l.h()).c(this.l.h()).a(2).withHttpRetryCounter(this.l.g()).a(this.n).withTimeout(60000L).build().m();
            } catch (Exception e) {
                q0.b("LoadCpt", e.getMessage());
                a("912005", "1000002", "Illegal Uri");
            }
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("code"), "");
            hashMap.put(c.c("reason"), th.getMessage());
            a(a("912005", (Map<String, Object>) hashMap));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "912001";
        this.l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.l.c())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.l.c().equals(c.c("310"))) {
            j();
        }
        if (this.l.c().equals(c.c("311"))) {
            i();
        }
        a("912007", (HashMap<String, Object>) null);
    }

    public void h() {
        try {
            if (e.a().b()) {
                return;
            }
            e.a().a(new d.b().a(this.l.e()).a());
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
        }
    }

    public void i() {
        if (this.l != null) {
            String b = e.a().b(this.l.f());
            if (TextUtils.isEmpty(b)) {
                return;
            }
            e.a().a(b);
        }
    }

    public void j() {
        if (this.l != null) {
            g();
        }
    }
}
