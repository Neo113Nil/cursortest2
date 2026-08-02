package com.vk.storycamera.upload;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.upload.impl.b;
import java.io.File;
import kotlin.text.Regex;
import xsna.epx;
import xsna.ho8;
import xsna.oba0;
import xsna.vhk0;
import xsna.zjm0;

/* compiled from: PersistingStoryUpload.kt */
/* loaded from: classes6.dex */
public final class PersistingStoryUpload extends Serializer.StreamParcelableAdapter implements IPersistingStoryUpload {
    public static final Serializer.c<PersistingStoryUpload> CREATOR = new a();
    public final boolean b;
    public final File c;
    public final File d;
    public final StoryTaskParams e;
    public final StoryUploadParams f;
    public String g;
    public transient b<StoryEntry> h;
    public transient zjm0 i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PersistingStoryUpload> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PersistingStoryUpload a(Serializer serializer) {
            return new PersistingStoryUpload(serializer.m(), (File) serializer.C(), (File) serializer.C(), StoryTaskParams.CREATOR.a(serializer), StoryUploadParams.CREATOR.a(serializer), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersistingStoryUpload[i];
        }
    }

    public PersistingStoryUpload(boolean z, File file, File file2, StoryTaskParams storyTaskParams, StoryUploadParams storyUploadParams, String str) {
        this.b = z;
        this.c = file;
        this.d = file2;
        this.e = storyTaskParams;
        this.f = storyUploadParams;
        this.g = str;
    }

    @Override // com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload
    public final String O6() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.g0(this.c);
        serializer.g0(this.d);
        this.e.O7(serializer);
        this.f.O7(serializer);
        serializer.j0(this.g);
    }

    @Override // com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload
    public final void V3(String str) {
        this.g = str;
    }

    @Override // com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload
    public final zjm0 V7() {
        zjm0 zjm0Var;
        zjm0 zjm0Var2 = this.i;
        if (zjm0Var2 != null) {
            return zjm0Var2;
        }
        boolean z = this.b;
        StoryTaskParams storyTaskParams = this.e;
        if (z) {
            int i = d9().d;
            CommonUploadParams commonUploadParams = storyTaskParams.e;
            StoryUploadParams storyUploadParams = storyTaskParams.f;
            zjm0Var = new zjm0("photo", i);
            zjm0Var.e = this.c;
            zjm0Var.j = commonUploadParams;
            zjm0Var.k = storyUploadParams;
        } else {
            int i2 = d9().d;
            CommonUploadParams commonUploadParams2 = storyTaskParams.e;
            StoryUploadParams storyUploadParams2 = storyTaskParams.f;
            zjm0Var = new zjm0("video", i2);
            zjm0Var.e = this.d;
            zjm0Var.j = commonUploadParams2;
            zjm0Var.k = storyUploadParams2;
        }
        this.i = zjm0Var;
        return zjm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistingStoryUpload)) {
            return false;
        }
        PersistingStoryUpload persistingStoryUpload = (PersistingStoryUpload) obj;
        return this.b == persistingStoryUpload.b && epx.f(this.c, persistingStoryUpload.c) && epx.f(this.d, persistingStoryUpload.d) && epx.f(this.e, persistingStoryUpload.e) && epx.f(this.f, persistingStoryUpload.f) && epx.f(this.g, persistingStoryUpload.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31;
        File file = this.d;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (file == null ? 0 : file.hashCode())) * 31)) * 31)) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistingStoryUpload(isPhoto=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", preview=");
        sb.append(this.d);
        sb.append(", taskParams=");
        sb.append(this.e);
        sb.append(", uploadParams=");
        sb.append(this.f);
        sb.append(", renderingFile=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public final b<StoryEntry> d9() {
        b<StoryEntry> bVar;
        b<StoryEntry> bVar2 = this.h;
        b<StoryEntry> bVar3 = bVar2;
        if (bVar2 == null) {
            boolean z = this.b;
            File file = this.c;
            StoryTaskParams storyTaskParams = this.e;
            if (z) {
                bVar = new oba0(file.getAbsolutePath(), storyTaskParams.zb(), storyTaskParams);
            } else {
                String str = this.g;
                String str2 = null;
                File file2 = str != null ? new File(str) : null;
                if (file2 != null) {
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(file2)) {
                        str2 = file2.getAbsolutePath();
                    }
                }
                com.vk.storycamera.upload.a aVar = new com.vk.storycamera.upload.a(file.getAbsolutePath(), storyTaskParams.c, str2, false);
                aVar.y = storyTaskParams.zb();
                aVar.z = storyTaskParams;
                bVar = aVar;
            }
            this.h = bVar;
            bVar3 = bVar;
        }
        return bVar3;
    }
}
