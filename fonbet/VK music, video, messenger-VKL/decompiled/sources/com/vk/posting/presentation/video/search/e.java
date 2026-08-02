package com.vk.posting.presentation.video.search;

import com.vk.dto.common.VideoFile;
import xsna.am50;
import xsna.epx;
import xsna.uf90;
import xsna.wf90;

/* compiled from: SearchVideoPickerSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class e {

    /* compiled from: SearchVideoPickerSideEffect.kt */
    public static abstract class a extends e {

        /* compiled from: SearchVideoPickerSideEffect.kt */
        /* renamed from: com.vk.posting.presentation.video.search.e$a$a, reason: collision with other inner class name */
        public static final class C1549a extends a {
            public static final C1549a a = new C1549a();
        }

        /* compiled from: SearchVideoPickerSideEffect.kt */
        public static final class b extends a {
            public final VideoFile a;
            public final am50 b;

            public b(VideoFile videoFile, am50 am50Var) {
                this.a = videoFile;
                this.b = am50Var;
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

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ReturnResult(video=" + this.a + ", techMetricsCollector=" + this.b + ')';
            }
        }
    }

    /* compiled from: SearchVideoPickerSideEffect.kt */
    public static abstract class b extends e {

        /* compiled from: SearchVideoPickerSideEffect.kt */
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
