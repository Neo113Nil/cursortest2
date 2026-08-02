package com.vk.fullscreenvideo.design.view.bottom;

import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import java.util.List;
import one.video.exo.offline.DownloadInfo;
import xsna.air;
import xsna.epx;
import xsna.fw3;
import xsna.izs;
import xsna.jq;
import xsna.k8o;
import xsna.qoy;
import xsna.s3q0;
import xsna.tni;
import xsna.vby;

/* compiled from: FullscreenBottomControlsView.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: FullscreenBottomControlsView.kt */
    @vby
    /* renamed from: com.vk.fullscreenvideo.design.view.bottom.a$a, reason: collision with other inner class name */
    public static final class C1075a {
        public final String a;

        public final boolean equals(Object obj) {
            if (obj instanceof C1075a) {
                return epx.f(this.a, ((C1075a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "Image(url=", this.a);
        }
    }

    /* compiled from: FullscreenBottomControlsView.kt */
    public static final class b {
        public final boolean a;
        public final ControlsState.ScreenState b;
        public final VideoFile c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final List<C1075a> j;

        public b(boolean z, ControlsState.ScreenState screenState, VideoFile videoFile, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<C1075a> list, tni tniVar) {
            this.a = z;
            this.b = screenState;
            this.c = videoFile;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
            this.i = z7;
            this.j = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && epx.f(this.j, bVar.j) && epx.f(null, null);
        }

        public final int hashCode() {
            return fw3.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(jq.b(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j) + 0;
        }

        public final String toString() {
            return "State(isLandscape=" + this.a + ", screenState=" + this.b + ", videoFile=" + this.c + ", downloadEnabled=" + this.d + ", showPlaylistButton=" + this.e + ", canAddToWatchLater=" + this.f + ", shouldShowDownloadControl=" + this.g + ", shouldHideShareButton=" + this.h + ", countersEnabled=" + this.i + ", previews=" + this.j + ", restrictedActions=" + ((Object) null) + ')';
        }
    }

    void a(ControlsState.CastStatus castStatus);

    void j(ControlsState.ResizeStatus resizeStatus);

    void m(DownloadInfo downloadInfo);

    void setAreCommentsDisabled(boolean z);

    void setControls(List<? extends a.d> list);

    void setDownloadButtonProvider(k8o k8oVar);

    void setOnClickAction(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar);

    void setShowPlaylistButton(boolean z);

    void setState(b bVar);
}
