package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.dmi;
import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3678pe {
    public final String a;
    public final String b;
    public final InMobiNativeImage c;
    public final String d;
    public final JSONObject e;
    public final String f;
    public final Float g;
    public final boolean h;
    public final MediaView i;
    public final View j;

    public C3678pe(String str, String str2, InMobiNativeImage inMobiNativeImage, String str3, JSONObject jSONObject, String str4, Float f, boolean z, MediaView mediaView, View view) {
        inMobiNativeImage.getClass();
        jSONObject.getClass();
        this.a = str;
        this.b = str2;
        this.c = inMobiNativeImage;
        this.d = str3;
        this.e = jSONObject;
        this.f = str4;
        this.g = f;
        this.h = z;
        this.i = mediaView;
        this.j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3678pe)) {
            return false;
        }
        C3678pe c3678pe = (C3678pe) obj;
        return Intrinsics.c(this.a, c3678pe.a) && Intrinsics.c(this.b, c3678pe.b) && Intrinsics.c(this.c, c3678pe.c) && Intrinsics.c(this.d, c3678pe.d) && Intrinsics.c(this.e, c3678pe.e) && Intrinsics.c(this.f, c3678pe.f) && Intrinsics.c(this.g, c3678pe.g) && this.h == c3678pe.h && Intrinsics.c(this.i, c3678pe.i) && Intrinsics.c(this.j, c3678pe.j);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.g;
        int e = dmi.e((hashCode4 + (f == null ? 0 : f.hashCode())) * 31, 31, this.h);
        MediaView mediaView = this.i;
        int hashCode5 = (e + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.j;
        return hashCode5 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        InMobiNativeImage inMobiNativeImage = this.c;
        String str3 = this.d;
        JSONObject jSONObject = this.e;
        String str4 = this.f;
        Float f = this.g;
        boolean z = this.h;
        MediaView mediaView = this.i;
        View view = this.j;
        StringBuilder s = mz1.s("NativePubData(title=", str, ", description=", str2, ", iconImage=");
        s.append(inMobiNativeImage);
        s.append(", ctaText=");
        s.append(str3);
        s.append(", extras=");
        s.append(jSONObject);
        s.append(", sponsored=");
        s.append(str4);
        s.append(", adRating=");
        s.append(f);
        s.append(", isVideo=");
        s.append(z);
        s.append(", mediaView=");
        s.append(mediaView);
        s.append(", adChoiceIcon=");
        s.append(view);
        s.append(")");
        return s.toString();
    }
}
