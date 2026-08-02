package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.lik;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new dyh(15);
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UrlLinkFrame(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = lik.a;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (this.a.equals(urlLinkFrame.a) && lik.a(this.b, urlLinkFrame.b) && lik.a(this.c, urlLinkFrame.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }
}
