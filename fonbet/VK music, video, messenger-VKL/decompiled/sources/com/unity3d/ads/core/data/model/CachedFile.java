package com.unity3d.ads.core.data.model;

import java.io.File;
import xsna.bh10;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CachedFile.kt */
/* loaded from: classes14.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String str, String str2, File file, String str3, long j, String str4, int i) {
        this.url = str;
        this.name = str2;
        this.file = file;
        this.extension = str3;
        this.contentLength = j;
        this.protocol = str4;
        this.priority = i;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i2 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i2 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i2 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i2 & 16) != 0) {
            j = cachedFile.contentLength;
        }
        if ((i2 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i2 & 64) != 0) {
            i = cachedFile.priority;
        }
        long j2 = j;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j2, str4, i);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.name;
    }

    public final File component3() {
        return this.file;
    }

    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    public final CachedFile copy(String str, String str2, File file, String str3, long j, String str4, int i) {
        return new CachedFile(str, str2, file, str3, j, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return epx.f(this.url, cachedFile.url) && epx.f(this.name, cachedFile.name) && epx.f(this.file, cachedFile.file) && epx.f(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && epx.f(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int a = urd0.a(this.url.hashCode() * 31, 31, this.name);
        File file = this.file;
        int hashCode = (a + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return Integer.hashCode(this.priority) + urd0.a(bh10.a((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.contentLength), 31, this.protocol);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedFile(url=");
        sb.append(this.url);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", extension=");
        sb.append(this.extension);
        sb.append(", contentLength=");
        sb.append(this.contentLength);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", priority=");
        return vu5.b(sb, this.priority, ')');
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j, String str4, int i, int i2, zcl zclVar) {
        this(str, str2, (i2 & 4) != 0 ? null : file, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? Integer.MAX_VALUE : i);
    }
}
