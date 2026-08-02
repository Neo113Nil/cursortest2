package com.braze.lrucache;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.File;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f567a;
    public final long[] b;
    public boolean c;
    public d d;
    public final int e;
    public final File f;

    public g(String str, int i, File file) {
        this.f567a = str;
        this.e = i;
        this.f = file;
        this.b = new long[i];
    }

    public final File a(int i) {
        return new File(this.f, this.f567a + "." + i + DefaultDiskStorage.FileType.TEMP);
    }
}
