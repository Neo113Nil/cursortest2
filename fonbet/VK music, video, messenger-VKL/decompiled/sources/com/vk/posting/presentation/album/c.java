package com.vk.posting.presentation.album;

import com.vkontakte.android.attachments.AlbumAttachment;
import xsna.am50;
import xsna.epx;
import xsna.uf90;
import xsna.wf90;

/* compiled from: AlbumPickerSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class c {

    /* compiled from: AlbumPickerSideEffect.kt */
    public static abstract class a extends c {

        /* compiled from: AlbumPickerSideEffect.kt */
        /* renamed from: com.vk.posting.presentation.album.c$a$a, reason: collision with other inner class name */
        public static final class C1526a extends a {
            public final AlbumAttachment a;
            public final am50 b;

            public C1526a(AlbumAttachment albumAttachment, am50 am50Var) {
                this.a = albumAttachment;
                this.b = am50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1526a)) {
                    return false;
                }
                C1526a c1526a = (C1526a) obj;
                return epx.f(this.a, c1526a.a) && epx.f(this.b, c1526a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ReturnResult(album=" + this.a + ", techMetricsCollector=" + this.b + ')';
            }
        }
    }

    /* compiled from: AlbumPickerSideEffect.kt */
    public static abstract class b extends c {

        /* compiled from: AlbumPickerSideEffect.kt */
        public static final class a extends b {
            public final uf90 a;

            public a(wf90 wf90Var) {
                this.a = wf90Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Init(pagingHelper=" + this.a + ')';
            }
        }
    }
}
