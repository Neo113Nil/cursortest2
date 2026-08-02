package com.vk.repository.internal.repos.stickers.database.entity;

import com.vk.dto.stickers.images.ImageSize;
import com.vk.dto.stickers.images.ImageTheme;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ImagesConfigsEntity.kt */
/* loaded from: classes5.dex */
public final class ImageConfigEntity {

    @pmi0("id")
    private final int id;

    @pmi0("sizes")
    private final List<ImageSize> sizes;

    @pmi0("template")
    private final String template;

    @pmi0("themes")
    private final List<ImageTheme> themes;

    public ImageConfigEntity(int i, String str, List<ImageSize> list, List<ImageTheme> list2) {
        this.id = i;
        this.template = str;
        this.sizes = list;
        this.themes = list2;
    }

    public final int a() {
        return this.id;
    }

    public final List<ImageSize> b() {
        return this.sizes;
    }

    public final String c() {
        return this.template;
    }

    public final List<ImageTheme> d() {
        return this.themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConfigEntity)) {
            return false;
        }
        ImageConfigEntity imageConfigEntity = (ImageConfigEntity) obj;
        return this.id == imageConfigEntity.id && epx.f(this.template, imageConfigEntity.template) && epx.f(this.sizes, imageConfigEntity.sizes) && epx.f(this.themes, imageConfigEntity.themes);
    }

    public final int hashCode() {
        return this.themes.hashCode() + fw3.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.template), 31, this.sizes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageConfigEntity(id=");
        sb.append(this.id);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", themes=");
        return ms9.a(')', sb, this.themes);
    }
}
