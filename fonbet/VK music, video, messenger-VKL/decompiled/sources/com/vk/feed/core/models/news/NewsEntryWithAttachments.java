package com.vk.feed.core.models.news;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.fsx0;
import xsna.j5g;
import xsna.shy;
import xsna.wsx0;
import xsna.zcl;

/* compiled from: NewsEntryWithAttachments.kt */
/* loaded from: classes18.dex */
public abstract class NewsEntryWithAttachments extends NewsEntry implements fsx0, wsx0 {
    public final EntryHeader i;
    public final List<EntryAttachment> j;
    public final Cut k;

    /* compiled from: NewsEntryWithAttachments.kt */
    public static final class Cut extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Cut> CREATOR = new a();
        public final int b;
        public final int c;
        public final float d;
        public boolean e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Cut> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Cut a(Serializer serializer) {
                return new Cut(serializer.u(), serializer.u(), serializer.s(), false, 8, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cut[i];
            }
        }

        public /* synthetic */ Cut(int i, int i2, float f, boolean z, int i3, zcl zclVar) {
            this(i, i2, f, (i3 & 8) != 0 ? true : z);
        }

        public final boolean Ab() {
            return this.b >= 0 || this.c >= 0;
        }

        public final boolean Bb() {
            return this.e;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.P(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cut)) {
                return false;
            }
            Cut cut = (Cut) obj;
            return this.b == cut.b && this.c == cut.c && Float.compare(this.d, cut.d) == 0 && this.e == cut.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + b.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cut(attachCount=");
            sb.append(this.b);
            sb.append(", compactAttachmentsBeforeCut=");
            sb.append(this.c);
            sb.append(", textRate=");
            sb.append(this.d);
            sb.append(", collapsed=");
            return q0.a(sb, this.e, ')');
        }

        public final int zb() {
            return this.b;
        }

        public Cut(int i, int i2, float f, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = f;
            this.e = z;
        }
    }

    public NewsEntryWithAttachments(NewsEntry.TrackData trackData, EntryHeader entryHeader, List<EntryAttachment> list, Cut cut) {
        super(trackData);
        this.i = entryHeader;
        this.j = list;
        this.k = cut;
    }

    public final boolean Eb(Attachment attachment) {
        return Jb(attachment) >= 0;
    }

    public final boolean Fb() {
        Object obj;
        Iterator<T> it = ((Post) this).z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EntryAttachment) obj).b.getClass().equals(PhotoAttachment.class)) {
                break;
            }
        }
        EntryAttachment entryAttachment = (EntryAttachment) obj;
        return (entryAttachment != null ? entryAttachment.b : null) != null;
    }

    public List<EntryAttachment> Gb() {
        return this.j;
    }

    public Cut Hb() {
        return this.k;
    }

    public final Attachment Ib() {
        EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(Gb());
        if (entryAttachment != null) {
            return entryAttachment.b;
        }
        return null;
    }

    public final int Jb(Attachment attachment) {
        Iterator<EntryAttachment> it = Gb().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (epx.f(it.next().b, attachment)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int Kb(Attachment attachment) {
        int Jb = Jb(attachment);
        if (Jb >= 0) {
            Gb().remove(Jb);
        }
        return Jb;
    }

    public EntryHeader getHeader() {
        return this.i;
    }
}
