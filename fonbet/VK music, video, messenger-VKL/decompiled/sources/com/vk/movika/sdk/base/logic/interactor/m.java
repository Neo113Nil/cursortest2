package com.vk.movika.sdk.base.logic.interactor;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.im.engine.internal.storage.structure.Table;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import java.util.Calendar;
import java.util.Collections;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.ok.android.webrtc.di.CallModuleImpl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.apg0;
import xsna.cd90;
import xsna.cn70;
import xsna.dhr0;
import xsna.e43;
import xsna.e8r;
import xsna.fq30;
import xsna.gv3;
import xsna.gzs;
import xsna.hif0;
import xsna.i5g;
import xsna.o2o0;
import xsna.pco;
import xsna.qpj;
import xsna.rli0;
import xsna.rwm0;
import xsna.s3q0;
import xsna.ucg0;
import xsna.ulp0;
import xsna.upo;
import xsna.x6p0;
import xsna.zq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new a();
            case 1:
                return new upo();
            case 2:
                return e43.l(new Pair("online_booking", zq70.h()), new Pair("video", zq70.h()), new Pair("album", zq70.h()), new Pair("photo", zq70.h()), new Pair("market_album", zq70.h()), new Pair("document_image", zq70.h()), new Pair("narrative", zq70.h()), new Pair("aliexpress_link", zq70.h()), new Pair("podcast", zq70.h()), new Pair("article", zq70.h()), new Pair("audio_playlist", zq70.h()), new Pair("artist", zq70.h()), new Pair("market", zq70.h()), new Pair("geo", zq70.h()), new Pair("graffiti", zq70.h()), new Pair("audio", zq70.h()), new Pair("group", zq70.h()), new Pair("link", zq70.h()), new Pair("doc", Collections.singletonList("compact")), new Pair(SignalingProtocol.KEY_ROOM, Collections.singletonList("full")), new Pair("poll", zq70.h()), new Pair("gif", Collections.singletonList("full")));
            case 3:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY_OFFLINE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 4:
                return new Path();
            case 5:
                return Calendar.getInstance();
            case 6:
                return CallModuleImpl.g();
            case 7:
                return new PorterDuffColorFilter(Color.argb(153, 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return rli0.l(new ulp0(new i5g(Table.DIALOGS.h()), new qpj(new Regex("\\s"), 4)), new gv3(18));
            case 12:
                return new hif0(0);
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return new cd90();
            case 16:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f);
                path.lineTo(1.0f, 0.5713795f);
                path.lineTo(2.0f, 0.90995026f);
                path.lineTo(3.0f, 0.1f);
                return path;
            case 17:
                return new pco(48);
            case 18:
                return new Regex("/docs([-0-9]*)");
            case 19:
                return new o2o0();
            case 20:
                return s3q0.a;
            case 21:
                return new fq30.b();
            case 22:
                return new ucg0();
            case 23:
                return new apg0(cn70.a() * 10.0f, cn70.a() * 0.5f);
            case 24:
                PublishFragmentInternalComponent.a aVar = PublishFragmentInternalComponent.v;
                return com.vk.core.utils.newtork.b.a;
            case 25:
                return s3q0.a;
            case 26:
                return PrivateFiles.e(e8r.a, PrivateSubdir.TEMP_UPLOADS, "new_avatar", "jpg", 24);
            case 27:
                return s3q0.a;
            case 28:
                int i = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.b(dhr0.s());
            default:
                return new x6p0(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public /* synthetic */ m(zq70 zq70Var) {
        this.b = 2;
    }
}
