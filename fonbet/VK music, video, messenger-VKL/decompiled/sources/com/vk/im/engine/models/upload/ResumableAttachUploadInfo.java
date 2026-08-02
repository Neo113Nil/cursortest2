package com.vk.im.engine.models.upload;

import java.io.Serializable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;

/* compiled from: ResumableAttachUploadInfo.kt */
/* loaded from: classes2.dex */
public final class ResumableAttachUploadInfo implements Serializable {
    private static final long serialVersionUID = -7492046182705721895L;
    private int attachLocalId;
    private long bytesTotal;
    private long bytesUploaded;
    private String contentFileName;
    private String contentType;
    private boolean isPrepared;
    private String sessionId;
    private String targetFile;
    private boolean targetFileRemovable;
    private String uploadUrl;

    public ResumableAttachUploadInfo(String str, int i, String str2, boolean z, boolean z2, String str3, String str4, long j, long j2, String str5) {
        this.sessionId = str;
        this.attachLocalId = i;
        this.targetFile = str2;
        this.targetFileRemovable = z;
        this.isPrepared = z2;
        this.contentFileName = str3;
        this.contentType = str4;
        this.bytesUploaded = j;
        this.bytesTotal = j2;
        this.uploadUrl = str5;
    }

    public static ResumableAttachUploadInfo a(ResumableAttachUploadInfo resumableAttachUploadInfo, String str, String str2, String str3, long j) {
        String str4 = resumableAttachUploadInfo.sessionId;
        int i = resumableAttachUploadInfo.attachLocalId;
        resumableAttachUploadInfo.getClass();
        return new ResumableAttachUploadInfo(str4, i, str, true, true, str2, str3, 0L, j, "");
    }

    public final int d() {
        return this.attachLocalId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResumableAttachUploadInfo)) {
            return false;
        }
        ResumableAttachUploadInfo resumableAttachUploadInfo = (ResumableAttachUploadInfo) obj;
        return epx.f(this.sessionId, resumableAttachUploadInfo.sessionId) && this.attachLocalId == resumableAttachUploadInfo.attachLocalId && epx.f(this.targetFile, resumableAttachUploadInfo.targetFile) && this.targetFileRemovable == resumableAttachUploadInfo.targetFileRemovable && this.isPrepared == resumableAttachUploadInfo.isPrepared && epx.f(this.contentFileName, resumableAttachUploadInfo.contentFileName) && epx.f(this.contentType, resumableAttachUploadInfo.contentType) && this.bytesUploaded == resumableAttachUploadInfo.bytesUploaded && this.bytesTotal == resumableAttachUploadInfo.bytesTotal && epx.f(this.uploadUrl, resumableAttachUploadInfo.uploadUrl);
    }

    public final long g() {
        return this.bytesTotal;
    }

    public final long h() {
        return this.bytesUploaded;
    }

    public final int hashCode() {
        int a = shy.a(this.attachLocalId, this.sessionId.hashCode() * 31, 31);
        String str = this.targetFile;
        int b = qoy.b(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.targetFileRemovable), 31, this.isPrepared);
        String str2 = this.contentFileName;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentType;
        int a2 = bh10.a(bh10.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.bytesUploaded), 31, this.bytesTotal);
        String str4 = this.uploadUrl;
        return a2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.contentFileName;
    }

    public final String j() {
        return this.contentType;
    }

    public final String k() {
        return this.sessionId;
    }

    public final String l() {
        return this.targetFile;
    }

    public final boolean m() {
        return this.targetFileRemovable;
    }

    public final String n() {
        return this.uploadUrl;
    }

    public final boolean o() {
        return this.isPrepared;
    }

    public final void p(long j) {
        this.bytesTotal = j;
    }

    public final void q(long j) {
        this.bytesUploaded = j;
    }

    public final void r(String str) {
        this.contentFileName = str;
    }

    public final void s(String str) {
        this.contentType = str;
    }

    public final void t(String str) {
        this.targetFile = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumableAttachUploadInfo(sessionId=");
        sb.append(this.sessionId);
        sb.append(", attachLocalId=");
        sb.append(this.attachLocalId);
        sb.append(", targetFile=");
        sb.append(this.targetFile);
        sb.append(", targetFileRemovable=");
        sb.append(this.targetFileRemovable);
        sb.append(", isPrepared=");
        sb.append(this.isPrepared);
        sb.append(", contentFileName=");
        sb.append(this.contentFileName);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", bytesUploaded=");
        sb.append(this.bytesUploaded);
        sb.append(", bytesTotal=");
        sb.append(this.bytesTotal);
        sb.append(", uploadUrl=");
        return ho8.a(sb, this.uploadUrl, ')');
    }

    public final void u(String str) {
        this.uploadUrl = str;
    }
}
