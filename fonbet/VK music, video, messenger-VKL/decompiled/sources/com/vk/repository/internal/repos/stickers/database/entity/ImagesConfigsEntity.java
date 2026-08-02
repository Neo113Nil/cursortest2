package com.vk.repository.internal.repos.stickers.database.entity;

import com.ironsource.C4313f8;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ImagesConfigsEntity.kt */
/* loaded from: classes5.dex */
public final class ImagesConfigsEntity {

    @pmi0(C4313f8.p)
    private final List<ImageConfigEntity> configs;

    @pmi0("defaultConfig")
    private final int defaultConfig;

    @pmi0("hash")
    private final String hash;

    public ImagesConfigsEntity(String str, int i, List<ImageConfigEntity> list) {
        this.hash = str;
        this.defaultConfig = i;
        this.configs = list;
    }

    public final List<ImageConfigEntity> a() {
        return this.configs;
    }

    public final int b() {
        return this.defaultConfig;
    }

    public final String c() {
        return this.hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesConfigsEntity)) {
            return false;
        }
        ImagesConfigsEntity imagesConfigsEntity = (ImagesConfigsEntity) obj;
        return epx.f(this.hash, imagesConfigsEntity.hash) && this.defaultConfig == imagesConfigsEntity.defaultConfig && epx.f(this.configs, imagesConfigsEntity.configs);
    }

    public final int hashCode() {
        return this.configs.hashCode() + shy.a(this.defaultConfig, this.hash.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImagesConfigsEntity(hash=");
        sb.append(this.hash);
        sb.append(", defaultConfig=");
        sb.append(this.defaultConfig);
        sb.append(", configs=");
        return ms9.a(')', sb, this.configs);
    }
}
