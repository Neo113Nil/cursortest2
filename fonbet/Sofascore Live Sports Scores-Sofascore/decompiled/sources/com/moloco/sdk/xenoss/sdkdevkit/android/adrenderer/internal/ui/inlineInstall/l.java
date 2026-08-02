package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import defpackage.g9i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l {
    public boolean a = false;
    public final com.moloco.sdk.acm.db.e b;
    public final g9i c;
    public final g9i d;

    public l(com.moloco.sdk.acm.db.e eVar, g9i g9iVar, g9i g9iVar2) {
        this.b = eVar;
        this.c = g9iVar;
        this.d = g9iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b && this.c.equals(lVar.c) && this.d.equals(lVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LaunchState(backgroundedSinceLaunch=" + this.a + ", onOutcome=" + this.b + ", timeoutJob=" + this.c + ", fgJob=" + this.d + ')';
    }
}
