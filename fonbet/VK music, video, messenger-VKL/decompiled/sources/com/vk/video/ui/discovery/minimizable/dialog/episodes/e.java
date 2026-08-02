package com.vk.video.ui.discovery.minimizable.dialog.episodes;

import java.util.List;
import xsna.atp;
import xsna.epx;
import xsna.km50;
import xsna.ms9;

/* compiled from: VideoEpisodesState.kt */
/* loaded from: classes7.dex */
public abstract class e implements km50 {

    /* compiled from: VideoEpisodesState.kt */
    public static final class a extends e {
        public static final a b = new a();
    }

    /* compiled from: VideoEpisodesState.kt */
    public static final class b extends e {
        public final List<atp> b;

        public b(List<atp> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Items(items="), this.b);
        }
    }
}
