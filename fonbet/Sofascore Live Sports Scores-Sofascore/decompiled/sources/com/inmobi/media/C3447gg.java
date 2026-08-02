package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import defpackage.h2d;
import defpackage.iod;
import defpackage.j2d;
import defpackage.jod;
import defpackage.td4;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3447gg {
    public static volatile Picasso a;
    public static final h2d b = new j2d();
    public static final ArrayList c = new ArrayList();
    public static final C3421fg d = new C3421fg();

    public static final Picasso a(Context context) {
        iod iodVar = new iod();
        iodVar.c.add(new J8(((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize() * 1048576));
        Picasso build = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new jod(iodVar))).build();
        build.getClass();
        return build;
    }

    public static Picasso b(Context context) {
        context.getClass();
        return (Picasso) td4.t0(kotlin.coroutines.g.a, new C3344cg(context, null));
    }
}
