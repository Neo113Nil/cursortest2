package com.vk.sharing.api.dto;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.common.links.AwayLink;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.LinkAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;

/* compiled from: RepostAttachmentInfo.kt */
/* loaded from: classes5.dex */
public final class RepostAttachmentInfo implements Parcelable {
    public static final Parcelable.Creator<RepostAttachmentInfo> CREATOR = new b();
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final LinkAttachment i;
    public final boolean j;
    public final String k;
    public final List<DeprecatedStatisticInterface> l;
    public final String m;

    /* compiled from: RepostAttachmentInfo.kt */
    public static final class a {
        public static String a(int i, boolean z) {
            if (i == 1) {
                return "link";
            }
            if (i == 15) {
                return "narrative";
            }
            if (i == 24) {
                return "link";
            }
            if (i == 26) {
                return "story";
            }
            if (i == 37) {
                return "widget";
            }
            if (i == 3) {
                return "article";
            }
            if (i == 4) {
                return "artist";
            }
            if (i == 5) {
                return "audio";
            }
            if (i == 7) {
                return "clip";
            }
            if (i == 8) {
                return "doc";
            }
            if (i == 11) {
                return "link";
            }
            if (i == 12) {
                return "market";
            }
            if (i == 49) {
                return "channel_message";
            }
            if (i == 50) {
                return "video_playlist";
            }
            switch (i) {
                case 18:
                    return "photo";
                case 19:
                    return "audio_playlist";
                case 20:
                    return "podcast";
                case 21:
                    return z ? "board_poll" : "poll";
                default:
                    switch (i) {
                        case 30:
                            return "video";
                        case 31:
                        case 33:
                            return "wall";
                        case 32:
                            return "wall_ads";
                        case 34:
                            return "curator";
                        default:
                            switch (i) {
                                case 39:
                                    return "marusia_chat_screen";
                                case 40:
                                    return "vmoji";
                                case 41:
                                    return "matched_playlist";
                                default:
                                    return "";
                            }
                    }
            }
        }
    }

    /* compiled from: RepostAttachmentInfo.kt */
    public static final class b implements Parcelable.Creator<RepostAttachmentInfo> {
        @Override // android.os.Parcelable.Creator
        public final RepostAttachmentInfo createFromParcel(Parcel parcel) {
            LinkAttachment linkAttachment;
            boolean z;
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            LinkAttachment linkAttachment2 = (LinkAttachment) parcel.readParcelable(RepostAttachmentInfo.class.getClassLoader());
            if (parcel.readInt() != 0) {
                linkAttachment = linkAttachment2;
                z = true;
            } else {
                linkAttachment = linkAttachment2;
                z = false;
            }
            String readString5 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (true) {
                long j = readLong;
                if (i == readInt2) {
                    return new RepostAttachmentInfo(readInt, readLong, readLong2, readString, readString2, readString3, readString4, linkAttachment, z, readString5, arrayList, parcel.readString());
                }
                i = bo.b(RepostAttachmentInfo.class, parcel, arrayList, i, 1);
                readLong = j;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final RepostAttachmentInfo[] newArray(int i) {
            return new RepostAttachmentInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepostAttachmentInfo(int i, long j, long j2, String str, String str2, String str3, String str4, LinkAttachment linkAttachment, boolean z, String str5, List<? extends DeprecatedStatisticInterface> list, String str6) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = linkAttachment;
        this.j = z;
        this.k = str5;
        this.l = list;
        this.m = str6;
    }

    public static final RepostAttachmentInfo a(AttachmentInfo attachmentInfo) {
        LinkAttachment linkAttachment;
        Object parcelable;
        LinkAttachment linkAttachment2 = null;
        if (attachmentInfo == null) {
            return null;
        }
        Bundle bundle = attachmentInfo.f;
        int i = Build.VERSION.SDK_INT;
        List parcelableArrayList = i >= 33 ? bundle.getParcelableArrayList("stats", DeprecatedStatisticInterface.class) : bundle.getParcelableArrayList("stats");
        int i2 = attachmentInfo.b;
        if (i2 == 11 || i2 == 24) {
            try {
                if (i >= 33) {
                    parcelable = bundle.getParcelable("attachments", LinkAttachment.class);
                    linkAttachment = (LinkAttachment) parcelable;
                } else {
                    linkAttachment = (LinkAttachment) bundle.getParcelable("attachments");
                }
                linkAttachment2 = linkAttachment;
            } catch (ClassCastException unused) {
            }
        }
        LinkAttachment linkAttachment3 = linkAttachment2;
        int i3 = attachmentInfo.b;
        long j = attachmentInfo.c;
        long j2 = attachmentInfo.d;
        String str = attachmentInfo.e;
        String string = bundle.getString("link");
        String string2 = bundle.getString("artistId");
        String string3 = bundle.getString("curatorId");
        boolean z = bundle.getBoolean("is_board", false);
        String string4 = bundle.getString("trackCode");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        return new RepostAttachmentInfo(i3, j, j2, str, string, string2, string3, linkAttachment3, z, string4, parcelableArrayList, bundle.getString("pending_photo_uri"));
    }

    public final String d() {
        AwayLink awayLink;
        LinkAttachment linkAttachment = this.i;
        String str = (linkAttachment == null || (awayLink = linkAttachment.f) == null) ? null : awayLink.b;
        String str2 = this.f;
        long j = this.c;
        int i = this.b;
        if (i == 3 && j == 0) {
            return str2 == null ? "" : str2;
        }
        if (i == 4) {
            return "artist" + this.g;
        }
        if (i == 34) {
            return "curator" + this.h;
        }
        if ((i == 11 || i == 24) && str != null) {
            return str;
        }
        if (i == 40 && str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.a(i, this.j));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append('_');
        sb2.append(this.d);
        String str3 = this.e;
        sb2.append(str3 != null ? BundleUtil.UNDERLINE_TAG.concat(str3) : "");
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostAttachmentInfo)) {
            return false;
        }
        RepostAttachmentInfo repostAttachmentInfo = (RepostAttachmentInfo) obj;
        return this.b == repostAttachmentInfo.b && this.c == repostAttachmentInfo.c && this.d == repostAttachmentInfo.d && epx.f(this.e, repostAttachmentInfo.e) && epx.f(this.f, repostAttachmentInfo.f) && epx.f(this.g, repostAttachmentInfo.g) && epx.f(this.h, repostAttachmentInfo.h) && epx.f(this.i, repostAttachmentInfo.i) && this.j == repostAttachmentInfo.j && epx.f(this.k, repostAttachmentInfo.k) && epx.f(this.l, repostAttachmentInfo.l) && epx.f(this.m, repostAttachmentInfo.m);
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LinkAttachment linkAttachment = this.i;
        int b2 = qoy.b((hashCode4 + (linkAttachment == null ? 0 : linkAttachment.hashCode())) * 31, 31, this.j);
        String str5 = this.k;
        int a3 = fw3.a((b2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.l);
        String str6 = this.m;
        return a3 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepostAttachmentInfo(type=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", mediaId=");
        sb.append(this.d);
        sb.append(", accessKey=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", artistId=");
        sb.append(this.g);
        sb.append(", curatorId=");
        sb.append(this.h);
        sb.append(", linkAttachment=");
        sb.append(this.i);
        sb.append(", isBoard=");
        sb.append(this.j);
        sb.append(", trackCode=");
        sb.append(this.k);
        sb.append(", stats=");
        sb.append(this.l);
        sb.append(", pendingPhotoUri=");
        return ho8.a(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k);
        Iterator a2 = ao.a(parcel, this.l);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.m);
    }
}
