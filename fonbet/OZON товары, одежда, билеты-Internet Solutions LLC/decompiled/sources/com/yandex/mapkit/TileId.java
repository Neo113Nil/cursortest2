package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class TileId implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private int f60718x;

    /* renamed from: y, reason: collision with root package name */
    private int f60719y;

    /* renamed from: z, reason: collision with root package name */
    private int f60720z;

    public TileId(int i11, int i12, int i13) {
        this.f60718x = i11;
        this.f60719y = i12;
        this.f60720z = i13;
    }

    public int getX() {
        return this.f60718x;
    }

    public int getY() {
        return this.f60719y;
    }

    public int getZ() {
        return this.f60720z;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60718x = archive.add(this.f60718x);
        this.f60719y = archive.add(this.f60719y);
        this.f60720z = archive.add(this.f60720z);
    }

    public TileId() {
    }
}
