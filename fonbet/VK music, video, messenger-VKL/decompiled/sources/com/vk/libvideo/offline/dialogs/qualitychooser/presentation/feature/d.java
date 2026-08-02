package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.xl50;

/* compiled from: QualityChooserPatch.kt */
/* loaded from: classes3.dex */
public interface d extends xl50 {

    /* compiled from: QualityChooserPatch.kt */
    public static final class a implements d {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("Init(options="), this.b);
        }
    }
}
