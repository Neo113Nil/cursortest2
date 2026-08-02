package com.blaze.blazesdk.features.videos.models.ui;

import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import defpackage.zzl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h {
    public static final BlazeVideosPlayerStyle a(a aVar) {
        aVar.getClass();
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            a.d dVar = bVar.c;
            if (dVar instanceof a.d.C0014a) {
                return bVar.b;
            }
            if (dVar instanceof g) {
                return bVar.a;
            }
            zzl.b();
            return null;
        }
        if (!(aVar instanceof a.C0011a)) {
            if (aVar instanceof a.e) {
                return ((a.e) aVar).a;
            }
            zzl.b();
            return null;
        }
        a.C0011a c0011a = (a.C0011a) aVar;
        a.d dVar2 = c0011a.c;
        if (dVar2 instanceof a.d.C0014a) {
            return c0011a.b;
        }
        if (dVar2 instanceof g) {
            return c0011a.a;
        }
        zzl.b();
        return null;
    }

    public static final void b(a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        aVar.getClass();
        if (aVar instanceof a.b) {
            a.d dVar = ((a.b) aVar).c;
            if (dVar instanceof a.d.C0014a) {
                function02.invoke();
                return;
            } else if (dVar instanceof g) {
                function0.invoke();
                return;
            } else {
                zzl.b();
                return;
            }
        }
        if (!(aVar instanceof a.C0011a)) {
            if (aVar instanceof a.e) {
                function05.invoke();
                return;
            } else {
                zzl.b();
                return;
            }
        }
        a.d dVar2 = ((a.C0011a) aVar).c;
        if (dVar2 instanceof a.d.C0014a) {
            function04.invoke();
        } else if (dVar2 instanceof g) {
            function03.invoke();
        } else {
            zzl.b();
        }
    }

    public static final boolean c(a aVar) {
        aVar.getClass();
        if ((aVar instanceof a.b) || (aVar instanceof a.C0011a)) {
            return aVar.b() instanceof a.d.C0014a;
        }
        if (aVar instanceof a.e) {
            return true;
        }
        zzl.b();
        return false;
    }

    public static final boolean d(a aVar) {
        aVar.getClass();
        a.d b = aVar.b();
        if ((aVar instanceof a.b) || (aVar instanceof a.C0011a)) {
            if ((b instanceof a.d.C0014a) && Intrinsics.c(((a.d.C0014a) b).a, c.a)) {
                return true;
            }
        } else if (!(aVar instanceof a.e)) {
            zzl.b();
            return false;
        }
        return false;
    }
}
