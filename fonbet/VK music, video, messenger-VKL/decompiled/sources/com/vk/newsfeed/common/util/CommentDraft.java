package com.vk.newsfeed.common.util;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.data.NewsComment;
import xsna.epx;
import xsna.uf3;
import xsna.zcl;

/* compiled from: CommentDraft.kt */
/* loaded from: classes4.dex */
public final class CommentDraft extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommentDraft> CREATOR = new a();
    public final NewsComment b;
    public Bundle c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentDraft> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentDraft a(Serializer serializer) {
            return new CommentDraft((NewsComment) serializer.G(NewsComment.class.getClassLoader()), serializer.o(Bundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentDraft[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentDraft() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.K(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentDraft)) {
            return false;
        }
        CommentDraft commentDraft = (CommentDraft) obj;
        return epx.f(this.b, commentDraft.b) && epx.f(this.c, commentDraft.c);
    }

    public final int hashCode() {
        int i = this.b.i * 31;
        Bundle bundle = this.c;
        return i + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentDraft(comment=");
        sb.append(this.b);
        sb.append(", meta=");
        return uf3.c(sb, this.c, ')');
    }

    public /* synthetic */ CommentDraft(NewsComment newsComment, Bundle bundle, int i, zcl zclVar) {
        this((i & 1) != 0 ? new NewsComment() : newsComment, (i & 2) != 0 ? null : bundle);
    }

    public CommentDraft(NewsComment newsComment, Bundle bundle) {
        this.b = newsComment;
        this.c = bundle;
    }
}
