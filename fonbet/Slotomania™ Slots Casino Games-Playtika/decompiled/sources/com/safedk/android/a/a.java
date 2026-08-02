package com.safedk.android.a;

import com.google.android.exoplayer2.C;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class a extends g {
    FileUploadManager.a a;

    public a(String str, String str2, int i, FileUploadManager.a aVar) {
        super(str, str2, i);
        this.a = aVar;
        this.d = "AwsS3UploadFile";
        Logger.d(this.d, "AwsS3UploadFile object created, File path=", str, ", hash=", str2, ", params =", aVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() throws IOException {
        if (this.j == null) {
            Logger.d(this.d, "File to upload is null");
            return null;
        }
        String str = this.a.f() + "/";
        Logger.d(this.d, "About to upload File to ", str, ", prefix=", this.a.d(), ",File path: ", this.j);
        d dVar = new d("POST", str, C.UTF8_NAME, this.i, new HashMap());
        File file = new File(this.j);
        if (!file.exists()) {
            Logger.d(this.d, "File file to upload not found ", this.j);
            return null;
        }
        dVar.a("key", this.a.d() + "/" + this.k + BrandSafetyUtils.a);
        dVar.a("AWSAccessKeyId", this.a.a());
        dVar.a("acl", this.a.g());
        dVar.a("Content-Type", this.a.l());
        dVar.a("policy", this.a.b());
        dVar.a(InAppPurchaseMetaData.KEY_SIGNATURE, this.a.c());
        dVar.a("x-amz-server-side-encryption", this.a.j());
        dVar.a("X-Amz-Credential", this.a.k());
        dVar.a("X-Amz-Algorithm", this.a.h());
        dVar.a("X-Amz-Date", this.a.i());
        dVar.a("file", file, true);
        dVar.a();
        String str2 = this.a.f() + "/" + this.a.d() + "/" + this.k + BrandSafetyUtils.a;
        Logger.d(this.d, "File uploaded successfully to AWS");
        return new g.a(str2, dVar.b(), this.k);
    }
}
