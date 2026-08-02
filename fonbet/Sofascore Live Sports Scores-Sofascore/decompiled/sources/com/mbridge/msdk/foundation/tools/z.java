package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.mz1;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class z {
    static final List<String> a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(21:9|(1:67)|13|14|(10:16|17|18|(2:(1:(1:22)(2:57|58))|61)(1:62)|59|24|25|(6:42|43|44|45|46|47)(1:(4:30|31|32|33)(1:41))|34|35)|65|17|18|(0)(0)|59|24|25|(1:27)|42|43|44|45|46|47|34|35)|25|(0)|42|43|44|45|46|47|34|35) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:3|4|5|(2:6|7)|(11:(21:9|(1:67)|13|14|(10:16|17|18|(2:(1:(1:22)(2:57|58))|61)(1:62)|59|24|25|(6:42|43|44|45|46|47)(1:(4:30|31|32|33)(1:41))|34|35)|65|17|18|(0)(0)|59|24|25|(1:27)|42|43|44|45|46|47|34|35)|25|(0)|42|43|44|45|46|47|34|35)|69|(1:11)|67|13|14|(0)|65|17|18|(0)(0)|59|24) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:3|4|5|(2:6|7)|(21:9|(1:67)|13|14|(10:16|17|18|(2:(1:(1:22)(2:57|58))|61)(1:62)|59|24|25|(6:42|43|44|45|46|47)(1:(4:30|31|32|33)(1:41))|34|35)|65|17|18|(0)(0)|59|24|25|(1:27)|42|43|44|45|46|47|34|35)|69|(1:11)|67|13|14|(0)|65|17|18|(0)(0)|59|24|25|(0)|42|43|44|45|46|47|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r14 != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("DynamicViewResourceManager", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #2 {Exception -> 0x006c, blocks: (B:14:0x0061, B:16:0x0067), top: B:13:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097 A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #3 {Exception -> 0x009a, blocks: (B:58:0x008b, B:61:0x0093, B:62:0x0097), top: B:18:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(int i, String str, String str2, c cVar, CampaignEx campaignEx) {
        String str3;
        File file;
        String str4;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            str3 = b(i, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        String str5 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        try {
            if (!TextUtils.isEmpty(str3)) {
                file = new File(str5, str3);
                if (file != null || !file.exists()) {
                    file = new File(mz1.o(new StringBuilder(str5), File.separator, str3.replace(".xml", "")), str3);
                }
                if (file.exists()) {
                    str4 = file.getPath();
                    eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("scenes", "1");
                    eVar.a("url", str2);
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                eVar.a("resource_type", 3);
                            }
                        }
                        eVar.a("resource_type", 2);
                    } else {
                        eVar.a("resource_type", 1);
                    }
                    if (!TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        String path = new URL(str2).getPath();
                        String substring = path.substring(path.lastIndexOf(47) + 1);
                        CampaignEx campaignEx2 = campaignEx;
                        a(str2, substring, str5, substring.replace(".zip", ""), cVar, campaignEx2, i);
                        eVar.a("cache", 2);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx2, eVar);
                    } else {
                        if (cVar == null) {
                            return;
                        }
                        try {
                            cVar.a(str2, str4, str3, null, true);
                        } catch (Exception e) {
                            q0.b("DynamicViewResourceManager", e.getMessage());
                        }
                        eVar.a("cache", 1);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
                    }
                    return;
                }
                str4 = "";
                eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("scenes", "1");
                eVar.a("url", str2);
                if (i != 0) {
                }
                if (TextUtils.isEmpty(str4)) {
                }
                String path2 = new URL(str2).getPath();
                String substring2 = path2.substring(path2.lastIndexOf(47) + 1);
                CampaignEx campaignEx22 = campaignEx;
                a(str2, substring2, str5, substring2.replace(".zip", ""), cVar, campaignEx22, i);
                eVar.a("cache", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx22, eVar);
                return;
            }
            if (TextUtils.isEmpty(str4)) {
            }
            String path22 = new URL(str2).getPath();
            String substring22 = path22.substring(path22.lastIndexOf(47) + 1);
            CampaignEx campaignEx222 = campaignEx;
            a(str2, substring22, str5, substring22.replace(".zip", ""), cVar, campaignEx222, i);
            eVar.a("cache", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx222, eVar);
            return;
        } catch (Exception unused2) {
            return;
        }
        file = null;
        if (file != null) {
        }
        file = new File(mz1.o(new StringBuilder(str5), File.separator, str3.replace(".xml", "")), str3);
        if (file.exists()) {
        }
        str4 = "";
        eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("scenes", "1");
        eVar.a("url", str2);
        if (i != 0) {
        }
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = new URL(str).getPath();
                String substring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(substring)) {
                    String replace = substring.replace(".zip", "");
                    List<String> list = a;
                    if (list != null) {
                        if (!list.contains(replace)) {
                            return replace;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements OnDownloadStateListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ c c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        public a(String str, String str2, c cVar, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = cVar;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.a + File.separator + this.b;
                String str3 = this.a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.c == null) {
                    return;
                }
                try {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            q0.b("DynamicViewResourceManager", th.getMessage());
                        }
                        this.c.a(this.d, str3, this.e, str, false);
                        return;
                    }
                    this.c.a(this.d, str3, this.e, str, false);
                    return;
                } catch (Exception e) {
                    q0.b("DynamicViewResourceManager", e.getMessage());
                    return;
                }
                str = "";
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.c;
            if (cVar != null) {
                try {
                    cVar.a(this.d, downloadError);
                } catch (Exception e) {
                    q0.b("DynamicViewResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements OnDownloadStateListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.a + File.separator + this.b, this.a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }
    }

    private static String b(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String path = new URL(str2).getPath();
                String substring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return substring.replace(".zip", "");
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String a(int i, String str, String str2) {
        String str3;
        File file;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = b(i, str, str2);
        } catch (Exception unused) {
            str3 = "";
        }
        String str4 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        if (!TextUtils.isEmpty(str3)) {
            file = new File(str4, str3);
            if (file != null || !file.exists()) {
                file = new File(mz1.o(new StringBuilder(str4), File.separator, str3.replace(".xml", "")), str3);
            }
            return file.getPath();
        }
        file = null;
        if (file != null) {
        }
        file = new File(mz1.o(new StringBuilder(str4), File.separator, str3.replace(".xml", "")), str3);
        return file.getPath();
    }

    public static String a(String str) {
        String str2;
        String str3;
        File file;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.equals("1")) {
                    return "";
                }
            }
        } catch (Throwable unused) {
        }
        try {
            str2 = b(str);
        } catch (Exception unused2) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            file = new File(str3, str2);
        } catch (Exception unused3) {
        }
        if (file.isFile() && file.exists()) {
            return file.getPath();
        }
        String path = new URL(str).getPath();
        a(str, path.substring(path.lastIndexOf(47) + 1), str3, str2);
        return "";
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i) throws Exception {
        q0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.t).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
