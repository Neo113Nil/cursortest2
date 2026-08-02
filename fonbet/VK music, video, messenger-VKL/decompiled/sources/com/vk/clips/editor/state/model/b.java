package com.vk.clips.editor.state.model;

import com.vk.clips.editor.state.model.e;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import xsna.epx;
import xsna.kyd;
import xsna.nov;
import xsna.q500;

/* compiled from: ClipsEditorStickerItem.kt */
/* loaded from: classes16.dex */
public final class b implements kyd {
    public static final long c = TimeUnit.SECONDS.toMillis(5);
    public final String a;
    public final nov b;

    public b(String str, nov novVar) {
        this.a = str;
        this.b = novVar;
    }

    public final long a() {
        q500 o = this.b.getCommons().o();
        return o != null ? o.c : c;
    }

    @Override // xsna.kyd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e.b getOffset() {
        q500 o = this.b.getCommons().o();
        return new e.b(o != null ? o.b : 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
    }

    @Override // xsna.kyd
    public final long getDurationMs() {
        if (a() != 0) {
            return a() - getOffset().a;
        }
        return Long.MAX_VALUE;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // xsna.kyd
    public final String m() {
        return this.a;
    }

    public final String toString() {
        return "ClipsEditorStickerItem(uniqueId=" + this.a + ", drawableSticker=" + this.b + ')';
    }

    public /* synthetic */ b(nov novVar) {
        this(UUID.randomUUID().toString(), novVar);
    }
}
