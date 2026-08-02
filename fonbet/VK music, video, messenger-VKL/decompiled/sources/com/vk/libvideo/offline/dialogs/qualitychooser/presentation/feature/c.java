package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import one.video.exo.offline.f;
import xsna.epx;

/* compiled from: QualityChooserNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: QualityChooserNavigationEvent.kt */
    public static final class a implements c {
        public final QualityOptionTypeDo a;
        public final f b;

        public a(QualityOptionTypeDo qualityOptionTypeDo, f fVar) {
            this.a = qualityOptionTypeDo;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CloseDialog(qualityOption=" + this.a + ", selection=" + this.b + ')';
        }
    }

    /* compiled from: QualityChooserNavigationEvent.kt */
    public static final class b implements c {
        public static final b a = new b();
    }
}
