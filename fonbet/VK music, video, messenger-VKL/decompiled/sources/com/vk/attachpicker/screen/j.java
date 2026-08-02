package com.vk.attachpicker.screen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import com.vk.attachpicker.screen.h;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import java.io.File;
import xsna.em6;
import xsna.g4p;
import xsna.g760;
import xsna.gzs;
import xsna.i760;
import xsna.j760;
import xsna.s4p;
import xsna.t4p;
import xsna.wzs;
import xsna.zlw;

/* compiled from: NewEditorScreenFactoryImpl.kt */
/* loaded from: classes15.dex */
public final class j implements g760 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.g760
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void a(final Activity activity, s4p s4pVar, com.vk.core.simplescreen.a aVar, final gzs gzsVar) {
        if (aVar == null) {
            throw new IllegalStateException("windowScreenContainer must be instance of com.vk.core.simplescreen.WindowScreenContainer");
        }
        if (!(s4pVar instanceof em6)) {
            throw new IllegalStateException("screen must be instance of com.vk.core.simplescreen.BaseScreen");
        }
        if (!aVar.isShowing()) {
            aVar.show();
        }
        aVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.h760
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                activity.setRequestedOrientation(-1);
                gzsVar.invoke();
            }
        });
        if (activity.getResources().getConfiguration().orientation == 2) {
            new j760(activity, aVar, s4pVar).enable();
            activity.setRequestedOrientation(1);
        } else {
            activity.setRequestedOrientation(1);
            aVar.b((em6) s4pVar);
        }
    }

    @Override // xsna.g760
    public final boolean b(File file) {
        return h.a.a(new g4p(new zlw(file).a()));
    }

    @Override // xsna.g760
    public final h c(File file, t4p t4pVar, g760.a aVar, Object obj, String str, wzs wzsVar, SpoilerConfiguration spoilerConfiguration) {
        com.vk.core.simplescreen.a aVar2;
        if (obj == null) {
            aVar2 = null;
        } else {
            if (!(obj instanceof com.vk.core.simplescreen.a)) {
                throw new IllegalStateException("rootScreenContainer must be instance of WindowScreenContainer");
            }
            aVar2 = (com.vk.core.simplescreen.a) obj;
        }
        com.vk.core.simplescreen.a aVar3 = aVar2;
        return new h(new zlw(file), null, t4pVar, new i760(aVar), false, aVar3, str, wzsVar, null, spoilerConfiguration, 256);
    }
}
