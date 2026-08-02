package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final File f13217a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f13218b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f13219c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f13220d;

    /* renamed from: e, reason: collision with root package name */
    public int f13221e;

    public Y9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f13217a, "rw");
            this.f13219c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f13220d = channel;
            if (this.f13221e == 0) {
                this.f13218b = channel.lock();
            }
            this.f13221e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            this.f13217a.getAbsolutePath();
            int i5 = this.f13221e - 1;
            this.f13221e = i5;
            if (i5 == 0) {
                Ja.a(this.f13218b);
            }
            lo.a((Closeable) this.f13219c);
            lo.a((Closeable) this.f13220d);
            this.f13219c = null;
            this.f13218b = null;
            this.f13220d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Y9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Y9(File file) {
        this.f13221e = 0;
        this.f13217a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
