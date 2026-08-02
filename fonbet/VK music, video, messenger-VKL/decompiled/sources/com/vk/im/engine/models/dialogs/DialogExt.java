package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.c;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.epx;
import xsna.qtd0;
import xsna.xpp;
import xsna.ypp;
import xsna.zcl;

/* compiled from: DialogExt.kt */
/* loaded from: classes2.dex */
public final class DialogExt extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<DialogExt> CREATOR = new a();
    public final ProfilesInfo b;
    public final c c;
    public final ypp<Dialog> d;
    public final long e;
    public final Peer f;
    public final long g;
    public final Peer.Type h;
    public final boolean i;
    public final boolean j;
    public final Boolean k;
    public final boolean l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DialogExt> {
        /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
        
            if (r8 == null) goto L6;
         */
        @Override // com.vk.core.serialize.Serializer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final DialogExt a(Serializer serializer) {
            c cVar;
            long w = serializer.w();
            boolean m = serializer.m();
            Dialog dialog = (Dialog) serializer.G(Dialog.class.getClassLoader());
            ProfilesInfo profilesInfo = (ProfilesInfo) serializer.G(ProfilesInfo.class.getClassLoader());
            String H = serializer.H();
            if (H != null) {
                CopyOnWriteArraySet copyOnWriteArraySet = c.b;
                cVar = c.a.a(H);
            }
            cVar = c.C1124c.c;
            return new DialogExt((ypp<Dialog>) new ypp(Long.valueOf(w), dialog, m), profilesInfo, cVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DialogExt[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogExt(Dialog dialog) {
        this(dialog, (ProfilesInfo) null, 2, (zcl) (0 == true ? 1 : 0));
    }

    public static DialogExt zb(DialogExt dialogExt) {
        return new DialogExt(dialogExt.d, new ProfilesInfo(dialogExt.b), dialogExt.c);
    }

    public final DialogExt Ab(ProfilesInfo profilesInfo) {
        ypp<Dialog> yppVar = this.d;
        ypp yppVar2 = new ypp(yppVar.c, yppVar.d, yppVar.a);
        ProfilesInfo profilesInfo2 = this.b;
        profilesInfo2.getClass();
        ProfilesInfo profilesInfo3 = new ProfilesInfo(profilesInfo2);
        profilesInfo3.Hb(profilesInfo);
        return new DialogExt((ypp<Dialog>) yppVar2, profilesInfo3, this.c);
    }

    public final ChatSettings Bb() {
        Dialog Cb = Cb();
        if (Cb != null) {
            return Cb.Hb();
        }
        return null;
    }

    public final Dialog Cb() {
        return this.d.d;
    }

    public final Peer Db() {
        return this.f;
    }

    public final ProfilesInfo Eb() {
        return this.b;
    }

    public final c Fb() {
        return this.c;
    }

    public final boolean Gb() {
        return this.i;
    }

    public final void Hb(xpp<Dialog> xppVar) {
        Dialog a2 = xppVar.a();
        ypp<Dialog> yppVar = this.d;
        if (a2 == null) {
            a2 = yppVar.d;
        }
        yppVar.d = a2;
        yppVar.c = a2 != null ? a2.getId() : yppVar.c;
        yppVar.a = xppVar.a() != null ? xppVar.a : true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        String str;
        ypp<Dialog> yppVar = this.d;
        serializer.Y(yppVar.c.longValue());
        serializer.L(yppVar.a ? (byte) 1 : (byte) 0);
        serializer.i0(yppVar.d);
        serializer.i0(this.b);
        c cVar = this.c;
        if (cVar == null || (str = cVar.a) == null) {
            str = "";
        }
        serializer.j0(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DialogExt.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        DialogExt dialogExt = (DialogExt) obj;
        return epx.f(this.b, dialogExt.b) && epx.f(this.d, dialogExt.d) && epx.f(this.c, dialogExt.c);
    }

    public final long getId() {
        return this.e;
    }

    public final String getTitle() {
        Dialog dialog = this.d.d;
        qtd0 Cb = this.b.Cb(dialog != null ? dialog.Sb() : null);
        return Cb != null ? Cb.name() : (dialog == null || !dialog.uc()) ? "…" : dialog.Hb().b;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() + (this.b.hashCode() * 31);
        c cVar = this.c;
        return hashCode + (cVar != null ? cVar.a.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogExt(ypp yppVar, ProfilesInfo profilesInfo, c cVar, int i, zcl zclVar) {
        this((ypp<Dialog>) yppVar, profilesInfo, cVar);
        profilesInfo = (i & 2) != 0 ? new ProfilesInfo() : profilesInfo;
        if ((i & 4) != 0) {
            Dialog dialog = (Dialog) yppVar.d;
            cVar = dialog != null ? dialog.ic() : null;
        }
    }

    public DialogExt(ypp<Dialog> yppVar, ProfilesInfo profilesInfo, c cVar) {
        this.b = profilesInfo;
        this.c = cVar;
        this.d = yppVar;
        long longValue = yppVar.c.longValue();
        this.e = longValue;
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        Peer b = Peer.a.b(longValue);
        this.f = b;
        this.g = b.d;
        this.h = b.c;
        Dialog dialog = yppVar.d;
        this.i = dialog != null ? dialog.tc() : false;
        Dialog dialog2 = yppVar.d;
        this.j = dialog2 != null ? dialog2.uc() : false;
        Dialog dialog3 = yppVar.d;
        this.k = dialog3 != null ? Boolean.valueOf(dialog3.tc()) : null;
        Dialog dialog4 = yppVar.d;
        this.l = dialog4 != null ? dialog4.o1() : false;
    }

    public /* synthetic */ DialogExt(Dialog dialog, ProfilesInfo profilesInfo, int i, zcl zclVar) {
        this(dialog, (i & 2) != 0 ? new ProfilesInfo() : profilesInfo);
    }

    public DialogExt(Dialog dialog, ProfilesInfo profilesInfo) {
        this(new ypp(dialog.getId(), dialog, false), profilesInfo, null, 4, null);
    }

    public /* synthetic */ DialogExt(long j, ProfilesInfo profilesInfo, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? new ProfilesInfo() : profilesInfo);
    }

    public DialogExt(long j, ProfilesInfo profilesInfo) {
        this(new ypp(Long.valueOf(j)), profilesInfo, null, 4, null);
    }

    public DialogExt(qtd0 qtd0Var) {
        this(new ypp(Long.valueOf(qtd0Var.G3())), new ProfilesInfo(qtd0Var), null, 4, null);
    }

    public DialogExt(long j, c cVar, int i) {
        this((ypp<Dialog>) new ypp(Long.valueOf(j)), new ProfilesInfo(), cVar);
    }
}
