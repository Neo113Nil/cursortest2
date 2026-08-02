package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.dyh;
import defpackage.lik;
import defpackage.n6c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new dyh(17);
    public final String a;
    public final String b;

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = lik.a;
        this.a = readString;
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void e(n6c n6cVar) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                n6cVar.c = str2;
                break;
            case 1:
                n6cVar.a = str2;
                break;
            case 2:
                n6cVar.g = str2;
                break;
            case 3:
                n6cVar.d = str2;
                break;
            case 4:
                n6cVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.a.equals(vorbisComment.a) && this.b.equals(vorbisComment.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + U3.j.b + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public VorbisComment(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
