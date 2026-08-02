package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;
import xsna.xuo0;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PostingPollDto implements Parcelable {
    public static final Parcelable.Creator<PostingPollDto> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final List<PollAnswerDto> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final boolean l;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<PostingPollDto> {
        @Override // android.os.Parcelable.Creator
        public final PostingPollDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            long j;
            boolean z6;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PostingPollDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            boolean z7 = false;
            int i = 0;
            while (true) {
                z = true;
                if (i == readInt2) {
                    break;
                }
                i = en.a(PollAnswerDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z2 = false;
                z7 = true;
            } else {
                z2 = false;
            }
            boolean z8 = parcel.readInt() != 0 ? true : z2;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z = z2;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z2;
            }
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z5 = z4;
                j = readLong;
                z6 = z5;
            } else {
                z5 = z4;
                j = readLong;
                z6 = z2;
            }
            if (parcel.readInt() == 0) {
                z5 = z2;
            }
            return new PostingPollDto(readInt, userId, readString, arrayList, z7, z8, z, z3, j, z6, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingPollDto[] newArray(int i) {
            return new PostingPollDto[i];
        }
    }

    public PostingPollDto() {
        this(0, null, null, null, false, false, false, false, 0L, false, false, 2047, null);
    }

    public static PostingPollDto a(PostingPollDto postingPollDto, long j, int i) {
        int i2 = postingPollDto.b;
        UserId userId = postingPollDto.c;
        String str = postingPollDto.d;
        List<PollAnswerDto> list = postingPollDto.e;
        boolean z = postingPollDto.f;
        boolean z2 = postingPollDto.g;
        boolean z3 = postingPollDto.h;
        boolean z4 = postingPollDto.i;
        if ((i & 256) != 0) {
            j = postingPollDto.j;
        }
        boolean z5 = postingPollDto.k;
        boolean z6 = postingPollDto.l;
        postingPollDto.getClass();
        return new PostingPollDto(i2, userId, str, list, z, z2, z3, z4, j, z5, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingPollDto)) {
            return false;
        }
        PostingPollDto postingPollDto = (PostingPollDto) obj;
        return this.b == postingPollDto.b && epx.f(this.c, postingPollDto.c) && epx.f(this.d, postingPollDto.d) && epx.f(this.e, postingPollDto.e) && this.f == postingPollDto.f && this.g == postingPollDto.g && this.h == postingPollDto.h && this.i == postingPollDto.i && this.j == postingPollDto.j && this.k == postingPollDto.k && this.l == postingPollDto.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + qoy.b(bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(fw3.a(urd0.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingPollDto(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", question=");
        sb.append(this.d);
        sb.append(", answers=");
        sb.append(this.e);
        sb.append(", isAnonymous=");
        sb.append(this.f);
        sb.append(", canHaveMultipleVotes=");
        sb.append(this.g);
        sb.append(", disableUnvote=");
        sb.append(this.h);
        sb.append(", hasEndDate=");
        sb.append(this.i);
        sb.append(", endDateMs=");
        sb.append(this.j);
        sb.append(", isPublished=");
        sb.append(this.k);
        sb.append(", canBeDeleted=");
        return q0.a(sb, this.l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((PollAnswerDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public PostingPollDto(int i, UserId userId, String str, List<PollAnswerDto> list, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = j;
        this.k = z5;
        this.l = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PostingPollDto(int i, UserId userId, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, int i2, zcl zclVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, (i2 & 512) == 0 ? z5 : false, (i2 & 1024) != 0 ? true : z6);
        long j2;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        UserId userId2 = (i2 & 2) != 0 ? UserId.d : userId;
        String str2 = (i2 & 4) != 0 ? "" : str;
        List list2 = (i2 & 8) != 0 ? EmptyList.b : list;
        boolean z7 = (i2 & 16) != 0 ? false : z;
        boolean z8 = (i2 & 32) != 0 ? false : z2;
        boolean z9 = (i2 & 64) != 0 ? false : z3;
        boolean z10 = (i2 & 128) != 0 ? false : z4;
        if ((i2 & 256) != 0) {
            xuo0.a.getClass();
            j2 = xuo0.a() + TimeUnit.HOURS.toMillis(24L);
        } else {
            j2 = j;
        }
    }
}
