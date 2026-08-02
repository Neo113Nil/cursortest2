package com.vk.dto.attaches;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Reaction;
import com.vk.dto.common.id.UserId;
import java.io.File;
import java.util.Arrays;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.ftx0;
import xsna.qoy;
import xsna.shy;
import xsna.sr;
import xsna.urd0;
import xsna.xqm0;
import xsna.zcl;

/* compiled from: AttachAudioMsg.kt */
/* loaded from: classes18.dex */
public final class AttachAudioMsg implements AttachWithTranscription, ftx0 {
    public static final Serializer.c<AttachAudioMsg> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public int f;
    public byte[] g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Reaction q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachAudioMsg> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachAudioMsg a(Serializer serializer) {
            return new AttachAudioMsg(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachAudioMsg[i];
        }
    }

    public AttachAudioMsg() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new byte[0];
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
    }

    public final void C0(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final int Ka() {
        return this.m;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final Reaction L6() {
        return this.q;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.e0(this.d);
        serializer.S(this.f);
        serializer.M(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        if (this.l.length() > 16000) {
            serializer.S(2);
            serializer.M(super.r7(this.l));
        } else {
            serializer.S(1);
            serializer.j0(this.l);
        }
        serializer.S(this.m);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        Reaction reaction = this.q;
        serializer.V(reaction != null ? Integer.valueOf(reaction.i()) : null);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final String Y4() {
        return this.l;
    }

    public final void a(AttachAudioMsg attachAudioMsg) {
        this.b = attachAudioMsg.b;
        this.c = attachAudioMsg.c;
        this.e = attachAudioMsg.e;
        this.d = attachAudioMsg.d;
        this.f = attachAudioMsg.f;
        byte[] bArr = attachAudioMsg.g;
        this.g = Arrays.copyOf(bArr, bArr.length);
        this.h = attachAudioMsg.h;
        this.i = attachAudioMsg.i;
        this.j = attachAudioMsg.j;
        this.k = attachAudioMsg.k;
        this.l = attachAudioMsg.l;
        this.m = attachAudioMsg.m;
        this.o = attachAudioMsg.o;
        this.n = attachAudioMsg.n;
        this.p = attachAudioMsg.p;
        this.q = attachAudioMsg.q;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachAudioMsg(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachAudioMsg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachAudioMsg attachAudioMsg = (AttachAudioMsg) obj;
        return this.b == attachAudioMsg.b && this.c == attachAudioMsg.c && this.e == attachAudioMsg.e && epx.f(this.d, attachAudioMsg.d) && this.f == attachAudioMsg.f && Arrays.equals(this.g, attachAudioMsg.g) && epx.f(this.h, attachAudioMsg.h) && epx.f(this.i, attachAudioMsg.i) && epx.f(this.j, attachAudioMsg.j) && epx.f(this.k, attachAudioMsg.k) && epx.f(this.l, attachAudioMsg.l) && this.m == attachAudioMsg.m && this.o == attachAudioMsg.o && this.n == attachAudioMsg.n && this.p == attachAudioMsg.p && this.q == attachAudioMsg.q;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean gb() {
        return this.p;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.m, urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((Arrays.hashCode(this.g) + ((bh10.a(((int) (bo.a(this.c, this.b * 31, 31) + this.e)) * 31, 31, this.d.b) + this.f) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.o), 31, this.n), 31, this.p);
        Reaction reaction = this.q;
        return b + (reaction != null ? reaction.hashCode() : 0);
    }

    @Override // xsna.ftx0
    public final File i1() {
        return new File(Uri.parse(this.j).getPath());
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void k9(boolean z) {
        this.o = z;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean m4() {
        return this.o;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void na(int i) {
        this.m = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            return xqm0.g("\n            AttachAudioMsg(\n                localId=" + this.b + ",\n                syncState=" + this.c + ",\n                id=" + this.e + ",\n                ownerId=" + this.d + ", \n                duration=" + this.f + ", \n                waveForm=" + Arrays.toString(this.g) + ", \n                localFileUri='" + this.j + "', \n                isTranscriptEdited='" + this.n + "'\n                isTranscriptRateEnabled = " + this.p + "\n                transcriptRateMark = " + this.q + "\n                )\n            ");
        }
        return xqm0.h("\n                AttachAudioMsg(\n                 localId=" + this.b + ", \n                 syncState=" + this.c + ",\n                 id=" + this.e + ", \n                 ownerId=" + this.d + ",\n                 duration=" + this.f + ",\n                 waveForm=" + Arrays.toString(this.g) + ",\n                 linkOgg='" + this.h + "',\n                 linkMp3='" + this.i + "',\n                 localFileUri='" + this.j + "',\n                 accessKey='" + this.k + "',\n                 isTranscriptEdited='" + this.n + "'\n                 isTranscriptRateEnabled = " + this.p + "\n                 transcriptRateMark = " + this.q + "\n                 )\n             ");
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final boolean u1() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    @Override // com.vk.dto.attaches.AttachWithTranscription
    public final void ya(String str) {
        this.l = str;
    }

    public AttachAudioMsg(AttachAudioMsg attachAudioMsg) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new byte[0];
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        a(attachAudioMsg);
    }

    public AttachAudioMsg(Serializer serializer, zcl zclVar) {
        Reaction reaction;
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.g = new byte[0];
        String str = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.f = serializer.u();
        this.g = serializer.a();
        this.h = serializer.H();
        this.i = serializer.H();
        this.j = serializer.H();
        this.k = serializer.H();
        int u = serializer.u();
        if (u == 1) {
            str = serializer.H();
        } else if (u == 2) {
            str = super.W4(serializer.a());
        }
        this.l = str;
        this.m = serializer.u();
        this.o = serializer.m();
        this.n = serializer.m();
        this.p = serializer.m();
        Integer v = serializer.v();
        if (v != null) {
            int intValue = v.intValue();
            Reaction.Companion.getClass();
            reaction = Reaction.a.a(intValue);
        } else {
            reaction = null;
        }
        this.q = reaction;
    }
}
