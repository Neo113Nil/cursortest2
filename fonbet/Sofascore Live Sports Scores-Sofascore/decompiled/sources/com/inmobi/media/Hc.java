package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hc extends ContentObserver implements InterfaceC3598mc {
    public final String a;
    public final Context b;
    public int c;
    public final /* synthetic */ Jc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hc(Jc jc, String str, Context context, Handler handler) {
        super(handler);
        str.getClass();
        this.d = jc;
        this.a = str;
        this.b = context;
        this.c = -1;
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void a() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void b() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        xw3.L(L9.c, null, null, new Gc(this, this.d, z, null), 3);
    }
}
