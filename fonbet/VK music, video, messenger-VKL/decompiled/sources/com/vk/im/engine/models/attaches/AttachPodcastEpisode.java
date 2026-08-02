package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.content.PodcastEpisode;
import xsna.bo;
import xsna.epx;
import xsna.gp;
import xsna.sr;
import xsna.t33;
import xsna.zcl;

/* compiled from: AttachPodcastEpisode.kt */
/* loaded from: classes2.dex */
public final class AttachPodcastEpisode implements AttachWithId {
    public static final Serializer.c<AttachPodcastEpisode> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final PodcastEpisode d;
    public final long e;
    public final UserId f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachPodcastEpisode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachPodcastEpisode a(Serializer serializer) {
            return new AttachPodcastEpisode(serializer.u(), sr.b(serializer, AttachSyncState.Companion), (PodcastEpisode) serializer.G(PodcastEpisode.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachPodcastEpisode[i];
        }
    }

    public AttachPodcastEpisode(int i, AttachSyncState attachSyncState, PodcastEpisode podcastEpisode) {
        this.b = i;
        this.c = attachSyncState;
        this.d = podcastEpisode;
        this.e = podcastEpisode.b;
        this.f = podcastEpisode.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/podcast");
        PodcastEpisode podcastEpisode = this.d;
        a2.append(podcastEpisode.c);
        a2.append('_');
        a2.append(podcastEpisode.b);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.i0(this.d);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachPodcastEpisode(this.b, this.c, this.d);
    }

    public final boolean d() {
        PodcastEpisode podcastEpisode = this.d;
        return (podcastEpisode.h == null || podcastEpisode.g == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.d.f == 11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachPodcastEpisode)) {
            return false;
        }
        AttachPodcastEpisode attachPodcastEpisode = (AttachPodcastEpisode) obj;
        return this.b == attachPodcastEpisode.b && this.c == attachPodcastEpisode.c && epx.f(this.d, attachPodcastEpisode.d);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + bo.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachPodcastEpisode(localId=");
        sb.append(this.b);
        sb.append(", syncState=");
        sb.append(this.c);
        sb.append(", podcastEpisode=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", ownerId=");
        return gp.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachPodcastEpisode(AttachPodcastEpisode attachPodcastEpisode) {
        this(attachPodcastEpisode.b, attachPodcastEpisode.c, attachPodcastEpisode.d);
    }

    public /* synthetic */ AttachPodcastEpisode(int i, AttachSyncState attachSyncState, PodcastEpisode podcastEpisode, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AttachSyncState.DONE : attachSyncState, podcastEpisode);
    }
}
