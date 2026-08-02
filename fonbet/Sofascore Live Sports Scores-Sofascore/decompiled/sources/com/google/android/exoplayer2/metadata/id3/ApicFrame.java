package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.lik;
import defpackage.n6c;
import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new wd(1);
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ApicFrame(Parcel parcel) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame.ID);
        String readString = parcel.readString();
        int i = lik.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void e(n6c n6cVar) {
        n6cVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.d == apicFrame.d && lik.a(this.b, apicFrame.b) && lik.a(this.c, apicFrame.c) && Arrays.equals(this.e, apicFrame.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }
}
