package com.vk.movika.sdk.base.ui;

import android.os.Handler;
import android.os.Looper;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.dja;
import xsna.ekw;
import xsna.gko;
import xsna.gzs;
import xsna.hd60;
import xsna.hfh;
import xsna.hse;
import xsna.jhv;
import xsna.k5e;
import xsna.kc10;
import xsna.qcy;
import xsna.qou0;
import xsna.r55;
import xsna.s3q0;
import xsna.soc;
import xsna.tzr0;
import xsna.u4c;
import xsna.up30;
import xsna.wng0;
import xsna.x7w;
import xsna.xo9;
import xsna.xuj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ v(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return "gamePresenter.process";
            case 1:
                return Calendar.getInstance();
            case 2:
                return s3q0.a;
            case 3:
                return new LocationFragment();
            case 4:
                return new tzr0();
            case 5:
                qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
                return null;
            case 6:
                return new dja("local_block_id");
            case 7:
                return new u4c();
            case 8:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                return new k5e();
            case 9:
                qcy<Object>[] qcyVarArr3 = ClipsPlaylistsComponentImpl.h;
                return new hse();
            case 10:
                return new ekw();
            case 11:
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                return new soc();
            case 12:
                return new kc10();
            case 13:
                return new hfh();
            case 14:
                return Integer.valueOf(hd60.a().a().p());
            case 15:
                return Boolean.valueOf(com.vk.toggle.d.Q());
            case 16:
                return s3q0.a;
            case 17:
                return new gko(R.drawable.vk_icon_lego_bell_28);
            case 18:
                return new jhv();
            case 19:
                return "#doStartBgSync succeed";
            case 20:
                return new x7w(xo9.x(0L, com.vk.im.engine.models.im_item.b.b, 7L), 0L, 0L);
            case 21:
                return new Regex("/(settings|edit)");
            case 22:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CANCEL_LONG_REQUESTS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 23:
                r55 r55Var = r55.a;
                Object i = r55.i();
                qou0 qou0Var = i instanceof qou0 ? (qou0) i : null;
                if (qou0Var != null) {
                    return qou0Var.a();
                }
                return null;
            case 24:
                wng0 wng0Var = new wng0();
                int i2 = up30.t;
                xuj xujVar = wng0Var.b;
                xujVar.getClass();
                xujVar.a = i2;
                xujVar.b = i2;
                xujVar.c = i2;
                xujVar.d = i2;
                wng0Var.invalidateSelf();
                return wng0Var;
            case 25:
                return a0a.d.concat("/audio?section=audio_download_history_link");
            case 26:
                return Boolean.valueOf(com.vk.toggle.d.I());
            case 27:
                return new Handler(Looper.getMainLooper());
            case 28:
                return s3q0.a;
            default:
                return ReporterType.CHANNEL;
        }
    }
}
