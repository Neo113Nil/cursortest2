package com.bykv.vk.openvk.preload.geckox.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.a.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.mz1;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UpdatePackage {
    private String accessKey;
    private String channel;
    private int channelIndex;
    private Content content;
    private String groupName;
    private long localVersion;
    private int packageType;
    private long version;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Content {
        private Package fullPackage;
        private Package patch;
        private Strategy strategy;

        public Content fromJson(JSONObject jSONObject) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            JSONObject optJSONObject3;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("package") && (optJSONObject3 = jSONObject.optJSONObject("package")) != null) {
                        Package r3 = new Package();
                        this.fullPackage = r3;
                        r3.fromJson(optJSONObject3);
                    }
                    if (jSONObject.has("patch") && (optJSONObject2 = jSONObject.optJSONObject("patch")) != null) {
                        Package r2 = new Package();
                        this.patch = r2;
                        r2.fromJson(optJSONObject2);
                    }
                    if (jSONObject.has("strategies") && (optJSONObject = jSONObject.optJSONObject("strategies")) != null) {
                        Strategy strategy = new Strategy();
                        this.strategy = strategy;
                        strategy.fromJson(optJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public UpdatePackage(long j, String str, Package r4, Package r5) {
        this.version = j;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r4;
        this.content.patch = r5;
    }

    private static boolean isInvalidName(String str) {
        return TextUtils.isEmpty(str) || str.contains("../") || str.contains("/") || str.contains("..");
    }

    public UpdatePackage fromJson(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("group_name")) {
                    this.groupName = (String) a.a(jSONObject, "group_name", String.class);
                }
                if (jSONObject.has("channel_index")) {
                    this.channelIndex = jSONObject.optInt("channel_index");
                }
                if (jSONObject.has("package_version")) {
                    this.version = jSONObject.optLong("package_version");
                }
                if (jSONObject.has("channel")) {
                    String str = (String) a.a(jSONObject, "channel", String.class);
                    if (!isInvalidName(str)) {
                        this.channel = str;
                    }
                }
                if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) && (optJSONObject = jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) != null) {
                    Content content = new Content();
                    this.content = content;
                    content.fromJson(optJSONObject);
                }
                if (jSONObject.has("localVersion")) {
                    this.localVersion = jSONObject.optLong("localVersion");
                }
                if (jSONObject.has("accessKey")) {
                    this.accessKey = (String) a.a(jSONObject, "accessKey", String.class);
                }
                if (jSONObject.has("package_type")) {
                    this.packageType = jSONObject.optInt("package_type");
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        if (isInvalidName(this.channel)) {
            return null;
        }
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        if (isInvalidName(str)) {
            return;
        }
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setFullPackage(Package r1) {
        this.content.fullPackage = r1;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setPatch(Package r1) {
        this.content.patch = r1;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.version);
        sb.append(", channel='");
        sb.append(this.channel);
        sb.append("', content=");
        sb.append(this.content);
        sb.append(", packageType=");
        return wv8.j(sb, this.packageType, '}');
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Package {
        long id;
        long length;
        String md5;

        @Deprecated
        String url;
        List<String> urlList;

        public Package(int i, List<String> list, String str) {
            this.id = i;
            this.urlList = list;
            this.md5 = str;
        }

        public Package fromJson(JSONObject jSONObject) {
            JSONArray optJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("id")) {
                        this.id = jSONObject.optLong("id");
                    }
                    if (jSONObject.has("url")) {
                        this.url = (String) a.a(jSONObject, "url", String.class);
                    }
                    if (jSONObject.has("url_list") && (optJSONArray = jSONObject.optJSONArray("url_list")) != null && optJSONArray.length() > 0) {
                        this.urlList = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            this.urlList.add(optJSONArray.optString(i));
                        }
                    }
                    if (jSONObject.has("md5")) {
                        this.md5 = (String) a.a(jSONObject, "md5", String.class);
                    }
                    if (jSONObject.has("size")) {
                        this.length = jSONObject.optLong("size");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.url);
            sb.append("', md5='");
            return mz1.o(sb, this.md5, "'}");
        }

        public Package() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Strategy {
        private boolean deleteIfFail;
        private boolean deleteOldPackageBeforeDownload;
        private boolean needUnzip;

        public Strategy(int i) {
            this.deleteIfFail = i == 1;
        }

        public Strategy fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("del_if_download_failed")) {
                        this.deleteIfFail = jSONObject.optBoolean("del_if_download_failed");
                    }
                    if (jSONObject.has("del_old_pkg_before_download")) {
                        this.deleteOldPackageBeforeDownload = jSONObject.optBoolean("del_old_pkg_before_download");
                    }
                    if (jSONObject.has("need_unzip")) {
                        this.needUnzip = jSONObject.optBoolean("need_unzip");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z) {
            this.deleteIfFail = z;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z) {
            this.deleteOldPackageBeforeDownload = z;
        }

        public void setNeedUnzip(boolean z) {
            this.needUnzip = z;
        }

        public Strategy() {
        }
    }

    public UpdatePackage() {
    }
}
