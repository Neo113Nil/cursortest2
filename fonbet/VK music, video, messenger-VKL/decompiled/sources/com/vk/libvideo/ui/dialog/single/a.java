package com.vk.libvideo.ui.dialog.single;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ui.VideoDialogParams;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import xsna.fxc0;
import xsna.io2;
import xsna.p90;
import xsna.xy80;
import xsna.yg5;

/* compiled from: VideoDialogBuilder.kt */
/* loaded from: classes3.dex */
public final class a {
    public final Activity a;
    public final yg5 b;
    public final io2 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final SearchStatsLoggingInfo g;
    public AdsDataProvider h;
    public xy80 i;
    public String j;
    public Boolean k;
    public Boolean l;

    public a(Activity activity, yg5 yg5Var, io2 io2Var, boolean z, boolean z2, boolean z3, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = activity;
        this.b = yg5Var;
        this.c = io2Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = searchStatsLoggingInfo;
    }

    public final void a(AdsDataProvider adsDataProvider) {
        this.h = adsDataProvider;
    }

    public final void b(xy80 xy80Var) {
        this.i = xy80Var;
    }

    public final void c(Boolean bool) {
        this.k = bool;
    }

    public final void d() {
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.State state = VideoPipStateHolder.c;
        VideoPipStateHolder.State state2 = VideoPipStateHolder.State.OPENED;
        int compareTo = state.compareTo(VideoPipStateHolder.State.DRAWN);
        yg5 yg5Var = this.b;
        if (compareTo <= 0 && state.compareTo(state2) >= 0) {
            fxc0.B().Y().k(this.a, yg5Var.A(), (r43 & 4) != 0 ? null : yg5Var.d0(), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : this.g, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return;
        }
        AdsDataProvider adsDataProvider = this.h;
        String str = this.j;
        Boolean bool = this.k;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = this.l;
        VideoDialogParams videoDialogParams = new VideoDialogParams(this.d, this.f, booleanValue, bool2 != null ? bool2.booleanValue() : false, str);
        VideoDialog.h hVar = new VideoDialog.h(VideoDialog.class, null, null);
        VideoFile A = yg5Var.A();
        Bundle bundle = hVar.j;
        bundle.putParcelable(X3.i.b, A);
        bundle.putParcelable("ads_provdr", adsDataProvider);
        bundle.putBoolean("over_dlg", this.e);
        bundle.putParcelable("dialog_params", videoDialogParams);
        bundle.putParcelable("search_stats_logging_info", this.g);
        xy80 xy80Var = this.i;
        Activity activity = this.a;
        if (xy80Var == null) {
            xy80Var = new xy80(activity);
        }
        if (!(activity instanceof FragmentActivity) || p90.e(activity)) {
            L.G("Can't create dialog, invalid activity");
            return;
        }
        VideoDialog videoDialog = (VideoDialog) hVar.f();
        int statusBarColor = activity.getWindow().getStatusBarColor();
        if (videoDialog.V == null) {
            videoDialog.V = Integer.valueOf(statusBarColor);
        }
        videoDialog.X = this.c;
        videoDialog.w0 = yg5Var;
        videoDialog.s0 = xy80Var;
        videoDialog.z0 = new WeakReference<>(activity);
        videoDialog.Td(((FragmentActivity) activity).getSupportFragmentManager(), "VideoDialog");
    }

    public final void e(String str) {
        this.j = str;
    }

    public final void f(Boolean bool) {
        this.l = bool;
    }
}
