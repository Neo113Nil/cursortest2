package com.vk.attachpicker.screen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.mediastore.system.MediaStoreEntry;
import xsna.bmk0;
import xsna.e43;
import xsna.pro0;
import xsna.t4p;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class s implements t4p {
    public final /* synthetic */ MediaStoreEntry a;
    public final /* synthetic */ p b;

    public s(p pVar, MediaStoreEntry mediaStoreEntry) {
        this.b = pVar;
        this.a = mediaStoreEntry;
    }

    @Override // xsna.t4p
    public final void a(@NonNull t4p.a aVar) {
        boolean z = true;
        final boolean z2 = !(aVar instanceof t4p.a.c);
        p pVar = this.b;
        com.vk.attachpicker.b bVar = pVar.G;
        if (pVar.O()) {
            pVar.b0 = z2;
            if (BuildInfo.t() || BuildInfo.s()) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                z = Preference.g(context).getBoolean("saveProcessedImage", true);
            }
            boolean z3 = aVar instanceof t4p.a.b;
            MediaStoreEntry mediaStoreEntry = this.a;
            if (z3) {
                t4p.a.b bVar2 = (t4p.a.b) aVar;
                t4p.a.f fVar = bVar2.c;
                Object obj = bVar2.b;
                MediaStoreEntry mediaStoreEntry2 = bVar2.a;
                bmk0 bmk0Var = new bmk0(fVar.a, fVar.b);
                if (z) {
                    bVar.a(mediaStoreEntry, mediaStoreEntry2, obj, bmk0Var);
                } else {
                    bVar.t(mediaStoreEntry, mediaStoreEntry2, obj, bmk0Var);
                    pVar.Q(mediaStoreEntry);
                }
            } else if (aVar instanceof t4p.a.C3718a) {
                t4p.a.f fVar2 = ((t4p.a.C3718a) aVar).a;
                bVar.r(mediaStoreEntry, new bmk0(fVar2.a, fVar2.b));
                pVar.Q(mediaStoreEntry);
            } else if (aVar instanceof t4p.a.d) {
                pVar.Q(mediaStoreEntry);
            } else if (aVar instanceof t4p.a.e) {
                if (z) {
                    pVar.Q(mediaStoreEntry);
                } else {
                    bVar.c(mediaStoreEntry);
                    pVar.Q(mediaStoreEntry);
                }
            }
        } else {
            pro0.c(new Runnable() { // from class: xsna.m3u0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vk.attachpicker.screen.s.this.b.b0 = z2;
                }
            });
        }
        Activity activity = pVar.k;
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        pVar.S.X(pVar.z);
    }

    @Override // xsna.t4p
    public final boolean b() {
        return this.b.P;
    }
}
