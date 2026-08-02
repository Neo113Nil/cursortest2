package com.vk.libvideo.ui.video2.controls;

import defpackage.q0;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.asp;
import xsna.epx;
import xsna.xq;
import xsna.zrp;

/* compiled from: VideoControlsUiEvent.kt */
/* loaded from: classes3.dex */
public interface VideoControlsUiEvent {

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class Seek implements VideoControlsUiEvent {
        public final Source a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoControlsUiEvent.kt */
        public static final class Source {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source DoubleTap;
            public static final Source Slider;

            static {
                Source source = new Source("Slider", 0);
                Slider = source;
                Source source2 = new Source("DoubleTap", 1);
                DoubleTap = source2;
                Source[] sourceArr = {source, source2};
                $VALUES = sourceArr;
                $ENTRIES = new asp(sourceArr);
            }

            public Source() {
                throw null;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public Seek(Source source) {
            this.a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Seek) && this.a == ((Seek) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Seek(source=" + this.a + ')';
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public interface a extends VideoControlsUiEvent {

        /* compiled from: VideoControlsUiEvent.kt */
        /* renamed from: com.vk.libvideo.ui.video2.controls.VideoControlsUiEvent$a$a, reason: collision with other inner class name */
        public static final class C1252a implements a {
            public static final C1252a a = new C1252a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1252a);
            }

            public final int hashCode() {
                return 498654565;
            }

            public final String toString() {
                return "CastClicked";
            }
        }

        /* compiled from: VideoControlsUiEvent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -948887136;
            }

            public final String toString() {
                return "ScaleClicked";
            }
        }

        /* compiled from: VideoControlsUiEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -440431231;
            }

            public final String toString() {
                return "SettingsClicked";
            }
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class b implements VideoControlsUiEvent {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ControlsVisibilityChanged(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class c implements VideoControlsUiEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "ExtendSeekbarChanged(opened=false)";
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class d implements VideoControlsUiEvent {
        public final AdaptiveTrackSelectionInterval a;

        public d(AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval) {
            this.a = adaptiveTrackSelectionInterval;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "IntervalUpdated(interval=" + this.a + ')';
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class e implements VideoControlsUiEvent {
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class f implements VideoControlsUiEvent {
        public final float a;

        public f(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.a, ((f) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("PlaybackSpeedChanged(speed="));
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class g implements VideoControlsUiEvent {
        public final one.video.player.tracks.c a;

        public g(one.video.player.tracks.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            one.video.player.tracks.c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "TrackSelected(videoTrack=" + this.a + ')';
        }
    }

    /* compiled from: VideoControlsUiEvent.kt */
    public static final class h implements VideoControlsUiEvent {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -2094611925;
        }

        public final String toString() {
            return "Unsupported";
        }
    }
}
