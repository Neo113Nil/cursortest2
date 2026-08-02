package com.vk.channels.impl.list;

import android.content.Context;
import android.view.View;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.channels.impl.list.c;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.fib;
import xsna.hm50;
import xsna.k2q0;
import xsna.l9;
import xsna.mxv;
import xsna.wd8;
import xsna.zv;

/* compiled from: ChannelsListRouter.kt */
/* loaded from: classes16.dex */
public final class d implements hm50<c> {
    public final Context a;
    public final fib b;
    public final mxv c;
    public final wd8 d;

    public d(Context context, fib fibVar, mxv mxvVar, wd8 wd8Var) {
        this.a = context;
        this.b = fibVar;
        this.c = mxvVar;
        this.d = wd8Var;
    }

    @Override // xsna.hm50
    public final void a(c cVar) {
        c cVar2 = cVar;
        boolean z = cVar2 instanceof c.a;
        Context context = this.a;
        if (z) {
            c.a aVar = (c.a) cVar2;
            this.b.c(context, aVar.a, ChannelHistoryOpenMode.OpenAtUnread.b, aVar.b);
            return;
        }
        boolean z2 = cVar2 instanceof c.C0537c;
        mxv mxvVar = this.c;
        if (z2) {
            c.C0537c c0537c = (c.C0537c) cVar2;
            View view = c0537c.c.get();
            if (view == null) {
                return;
            }
            mxvVar.g().a(view, c0537c.a, c0537c.b, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_CHANNELS, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNELS_LIST, new l9(14));
            return;
        }
        if (cVar2 instanceof c.b) {
            mxvVar.k().b(context, ((c.b) cVar2).a);
        } else {
            if (!(cVar2 instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            k2q0.a(context, new zv(5, this, cVar2));
        }
    }
}
