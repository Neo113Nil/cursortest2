package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.d2g;
import defpackage.ie2;
import defpackage.iod;
import defpackage.jod;
import defpackage.qzf;
import defpackage.yg2;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class OkHttp3Downloader implements Downloader {
    private final ie2 cache;
    final yg2 client;
    private boolean sharedClient;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttp3Downloader(File file, long j) {
        this(new jod(r0));
        iod iodVar = new iod();
        iodVar.l = new ie2(file, j);
        this.sharedClient = false;
    }

    @Override // com.squareup.picasso.Downloader
    @NonNull
    public d2g load(@NonNull qzf qzfVar) throws IOException {
        return FirebasePerfOkHttpClient.execute(((jod) this.client).b(qzfVar));
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        ie2 ie2Var;
        if (this.sharedClient || (ie2Var = this.cache) == null) {
            return;
        }
        try {
            ie2Var.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j) {
        this(Utils.createDefaultCacheDir(context), j);
    }

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    public OkHttp3Downloader(jod jodVar) {
        this.sharedClient = true;
        this.client = jodVar;
        this.cache = jodVar.k;
    }

    public OkHttp3Downloader(yg2 yg2Var) {
        this.sharedClient = true;
        this.client = yg2Var;
        this.cache = null;
    }
}
