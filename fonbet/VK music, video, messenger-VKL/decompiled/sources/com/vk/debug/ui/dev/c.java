package com.vk.debug.ui.dev;

import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.Executor;
import xsna.enj;
import xsna.g2v;
import xsna.gg9;
import xsna.l370;
import xsna.m0v0;
import xsna.re9;
import xsna.uek;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                uek uekVar = (uek) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                File file = uekVar.e;
                if (!file.exists()) {
                    enj.r(debugDevSettingsFragment.mo2getContext(), "NetLog фай не найден", 0);
                    break;
                } else {
                    uekVar.c();
                    try {
                        File L = l370.L(file);
                        if (sharedPreferences.getBoolean("__dbg_network_netlog_write", false)) {
                            uekVar.b();
                        }
                        g2v.c().getClass();
                        m0v0.a.b(debugDevSettingsFragment.requireContext(), L);
                        break;
                    } catch (Throwable th) {
                        enj.r(debugDevSettingsFragment.mo2getContext(), "Netlog compress failed:" + th.toString(), 0);
                        return;
                    }
                }
            default:
                gg9 gg9Var = (gg9) obj;
                re9.a aVar = ((re9) obj3).r;
                aVar.a.add(gg9Var);
                aVar.b.put(gg9Var, (Executor) obj2);
                break;
        }
    }
}
