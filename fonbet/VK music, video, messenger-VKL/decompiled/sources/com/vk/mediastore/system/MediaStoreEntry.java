package com.vk.mediastore.system;

import android.net.Uri;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: MediaStoreEntry.kt */
/* loaded from: classes3.dex */
public abstract class MediaStoreEntry implements Parcelable {
    public final int b;
    public final Uri c;
    public final long d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public volatile boolean i;

    public MediaStoreEntry(int i, Uri uri, long j, int i2, int i3, long j2, long j3, zcl zclVar) {
        this.b = i;
        this.c = uri;
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
    }

    public long d() {
        return this.g;
    }

    public long e() {
        return this.d;
    }

    public Uri f() {
        return this.c;
    }

    public long g() {
        return this.h;
    }

    public int getHeight() {
        return this.f;
    }

    public int getId() {
        return this.b;
    }

    public int getWidth() {
        return this.e;
    }
}
