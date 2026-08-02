package com.vk.video.ui.discovery.minimizable.dialog.about;

import java.util.List;
import xsna.epx;
import xsna.hfz;
import xsna.ms9;
import xsna.xl50;

/* compiled from: VideoAboutPatch.kt */
/* loaded from: classes7.dex */
public abstract class c implements xl50 {

    /* compiled from: VideoAboutPatch.kt */
    public static final class a extends c {
        public final List<hfz> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends hfz> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Loaded(items="), this.b);
        }
    }
}
