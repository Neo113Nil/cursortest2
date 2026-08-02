package com.vk.catalog2.common.ui.mvp.auto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.movika.sdk.base.logic.interactor.e;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.b25;
import xsna.c22;
import xsna.e3a;
import xsna.epx;
import xsna.fo50;
import xsna.fpf0;
import xsna.ft0;
import xsna.g8u0;
import xsna.jda;
import xsna.k7m;
import xsna.m7m;
import xsna.m8u0;
import xsna.mxa0;
import xsna.np1;
import xsna.op1;
import xsna.ox0;
import xsna.peq0;
import xsna.rsg0;
import xsna.t4a;
import xsna.t5a;
import xsna.u4a;
import xsna.ux0;
import xsna.v1v;
import xsna.vx6;
import xsna.w95;
import xsna.wga;
import xsna.xga;
import xsna.xhu0;
import xsna.yfb;
import xsna.z90;

/* compiled from: CatalogMediaServiceDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class d {
    public final VKAndroidAutoCatalogMediaService a;
    public final xga b;
    public final e3a c;
    public final Context d;
    public final g8u0 e;
    public final u4a f;
    public final jda g;
    public String h;

    public d(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService) {
        xga xgaVar = new xga();
        e3a e3aVar = new e3a();
        this.a = vKAndroidAutoCatalogMediaService;
        this.b = xgaVar;
        this.c = e3aVar;
        this.d = vKAndroidAutoCatalogMediaService.getApplicationContext();
        xhu0 xhu0Var = t4a.a.a;
        this.e = new g8u0(xhu0Var == null ? null : xhu0Var);
        u4a a = a(c22.a.c);
        this.f = a;
        this.g = a.b.s.K(a);
        this.h = "";
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            UIBlock uIBlock = (UIBlock) it.next();
            if (uIBlock instanceof UIBlockList) {
                i2 = ((UIBlockList) uIBlock).y.size();
            }
            i += i2;
        }
        return i >= 180;
    }

    public final u4a a(c22.a aVar) {
        String str;
        Uri parse;
        Bundle bundle = new Bundle();
        String str2 = aVar.a;
        if (str2 == null || (parse = Uri.parse(str2)) == null) {
            str = null;
        } else {
            new peq0(parse);
            str = parse.getQueryParameter("section");
        }
        Class cls = epx.f(str, "audio_offline") ? VKAndroidAutoCatalogMediaService.a.class : VKAndroidAutoCatalogMediaService.class;
        if (bundle.containsKey("___CTLG_KEY_CLASS__")) {
            throw new IllegalStateException("Bundle already contains key: ___CTLG_KEY_CLASS__");
        }
        bundle.putString("___CTLG_KEY_CLASS__", cls.getCanonicalName());
        bundle.putBoolean("VKAndroidAutoCatalogMediaService.key_new_android_auto", true);
        bundle.putString("key_url", str2);
        StringBuilder b = v1v.b(bundle.getString("___CTLG_KEY_CLASS__"), '_');
        b.append(UUID.randomUUID());
        String sb = b.toString();
        g8u0 g8u0Var = this.e;
        u4a.a a = g8u0Var.a.a(bundle, sb);
        VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService = this.a;
        b25 s = ((AuthBridgeComponent) ((k7m) m7m.b(vKAndroidAutoCatalogMediaService)).a(fpf0.a(AuthBridgeComponent.class))).s();
        u4a.a a2 = u4a.a.a(a, null, new m8u0(a.i, s, new mxa0(s, ((MusicPlaybackQueueComponent) ((k7m) m7m.b(vKAndroidAutoCatalogMediaService)).a(fpf0.a(MusicPlaybackQueueComponent.class))).za(), (PlayerUIComponent) ((k7m) m7m.b(vKAndroidAutoCatalogMediaService)).a(fpf0.a(PlayerUIComponent.class)))), null, null, null, null, null, null, null, null, null, -257, 1048575);
        fo50 fo50Var = fo50.b;
        g8u0Var.getClass();
        return new u4a(a2, new u4a.b(fo50Var, g8u0.a.a, EmptyList.b, new t5a(), null, this.d, null, PsExtractor.AUDIO_STREAM));
    }

    public final q<List<UIBlock>> c(c22.c cVar, List<? extends UIBlock> list) {
        return new p1(this.f.b.s.D(cVar.a, cVar.b, false).U(new ux0(new e(this, 10), 8)), new vx6(new z90(9), 5)).L(new ox0(new w95(list, this, cVar, 1), 8), false);
    }

    public final j1 d(String str, String str2, boolean z) {
        return rsg0.T(yfb.x(wga.i(this.b, str, null, null, Boolean.valueOf(z), str2, null, null, null, 918))).U(new np1(new com.vk.channels.impl.channel_screen.send_msg.e(this.c, 2), 5)).U(new ft0(new op1(this, 12), 8));
    }
}
