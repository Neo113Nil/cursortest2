package com.vk.video.ui.discovery.minimizable.dialog.about;

import java.util.List;
import xsna.epx;
import xsna.hfz;
import xsna.km50;
import xsna.ms9;

/* compiled from: VideoAboutState.kt */
/* loaded from: classes7.dex */
public abstract class f implements km50 {

    /* compiled from: VideoAboutState.kt */
    public static final class a extends f {
        public static final a b = new a();
    }

    /* compiled from: VideoAboutState.kt */
    public static final class b extends f {
        public final List<hfz> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends hfz> list) {
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
