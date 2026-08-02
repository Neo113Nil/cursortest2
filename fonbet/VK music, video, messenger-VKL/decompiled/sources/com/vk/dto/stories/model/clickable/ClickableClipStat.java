package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableClipStat.kt */
/* loaded from: classes18.dex */
public final class ClickableClipStat extends ClickableSticker {
    public static final Serializer.c<ClickableClipStat> CREATOR = new a();
    public final WebStickerType e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableClipStat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableClipStat a(Serializer serializer) {
            return new ClickableClipStat(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableClipStat[i];
        }
    }

    public /* synthetic */ ClickableClipStat(long j, List list, q500 q500Var, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ClickableClipStat) && super.equals(obj)) {
            return this.e == ((ClickableClipStat) obj).e;
        }
        return false;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        return this.e.hashCode() + (super.hashCode() * 31);
    }

    public ClickableClipStat(long j, List<WebClickablePoint> list, q500 q500Var) {
        super(j, list, q500Var);
        this.e = WebStickerType.CLIP_STAT;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableClipStat(Serializer serializer) {
        this(r0, r2 == null ? new ArrayList() : r2, serializer.y());
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
