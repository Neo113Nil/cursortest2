package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import xsna.epx;
import xsna.kj50;
import xsna.tdm;

/* compiled from: QualityChooserAction.kt */
/* loaded from: classes3.dex */
public interface a extends kj50 {

    /* compiled from: QualityChooserAction.kt */
    /* renamed from: com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a$a, reason: collision with other inner class name */
    public static final class C1240a implements a {
        public final QualityChooserViewState.QualityOption.QualityOptionType b;

        public C1240a(QualityChooserViewState.QualityOption.QualityOptionType qualityOptionType) {
            this.b = qualityOptionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1240a) && this.b == ((C1240a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DownloadQualitySelected(quality=" + this.b + ')';
        }
    }

    /* compiled from: QualityChooserAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: QualityChooserAction.kt */
    public static final class c implements a {
        public final tdm b;

        public c(tdm tdmVar) {
            this.b = tdmVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(availableTracks=" + this.b + ')';
        }
    }
}
