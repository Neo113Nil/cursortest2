package com.vk.im.engine.internal.jobs.dialogs;

import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;
import defpackage.k0;
import xsna.iuz;
import xsna.sf4;
import xsna.w2w;

/* compiled from: DialogLocalArchiveUnarchiveCmd.kt */
/* loaded from: classes2.dex */
public final class b extends iuz {
    public final long b;
    public final DialogArchiveUnarchiveJob.Action c;

    public b(long j, DialogArchiveUnarchiveJob.Action action) {
        this.b = j;
        this.c = action;
    }

    @Override // xsna.m2w
    public final String a() {
        return k0.a(this.b, "im-dialog-archive-unarchive-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.c == bVar.c;
    }

    @Override // xsna.iuz
    public final long h() {
        return this.b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.iuz
    public final boolean j(w2w w2wVar) {
        w2wVar.I0().u(new sf4(8, this, this.c));
        return true;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogLocalArchiveUnarchiveCmd(dialogId=" + this.b + ", action=" + this.c + ')';
    }

    @Override // xsna.iuz
    public final void i(w2w w2wVar) {
    }
}
