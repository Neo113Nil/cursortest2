package ru.ozon.fintech.analytic.models;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0085\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lru/ozon/fintech/analytic/models/HealthPermissions;", "", "camera", "", "push", "calls", "geo", "bio", "contacts", "sms", "calendar", "motion", "gallery", "audio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCamera", "()Ljava/lang/String;", "getPush", "getCalls", "getGeo", "getBio", "getContacts", "getSms", "getCalendar", "getMotion", "getGallery", "getAudio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthPermissions {

    @i(name = "audio")
    @NotNull
    private final String audio;

    @i(name = "bio")
    private final String bio;

    @i(name = "calendar")
    @NotNull
    private final String calendar;

    @i(name = "calls")
    private final String calls;

    @i(name = "camera")
    private final String camera;

    @i(name = "contacts")
    private final String contacts;

    @i(name = "gallery")
    @NotNull
    private final String gallery;

    @i(name = "geo")
    private final String geo;

    @i(name = "motion")
    @NotNull
    private final String motion;

    @i(name = "push")
    private final String push;

    @i(name = "sms")
    private final String sms;

    public HealthPermissions(String str, String str2, String str3, String str4, String str5, String str6, String str7, @NotNull String calendar, @NotNull String motion, @NotNull String gallery, @NotNull String audio) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(motion, "motion");
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(audio, "audio");
        this.camera = str;
        this.push = str2;
        this.calls = str3;
        this.geo = str4;
        this.bio = str5;
        this.contacts = str6;
        this.sms = str7;
        this.calendar = calendar;
        this.motion = motion;
        this.gallery = gallery;
        this.audio = audio;
    }

    public static /* synthetic */ HealthPermissions copy$default(HealthPermissions healthPermissions, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = healthPermissions.camera;
        }
        if ((i11 & 2) != 0) {
            str2 = healthPermissions.push;
        }
        if ((i11 & 4) != 0) {
            str3 = healthPermissions.calls;
        }
        if ((i11 & 8) != 0) {
            str4 = healthPermissions.geo;
        }
        if ((i11 & 16) != 0) {
            str5 = healthPermissions.bio;
        }
        if ((i11 & 32) != 0) {
            str6 = healthPermissions.contacts;
        }
        if ((i11 & 64) != 0) {
            str7 = healthPermissions.sms;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = healthPermissions.calendar;
        }
        if ((i11 & 256) != 0) {
            str9 = healthPermissions.motion;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str10 = healthPermissions.gallery;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str11 = healthPermissions.audio;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return healthPermissions.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCamera() {
        return this.camera;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getGallery() {
        return this.gallery;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getAudio() {
        return this.audio;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPush() {
        return this.push;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCalls() {
        return this.calls;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGeo() {
        return this.geo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContacts() {
        return this.contacts;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSms() {
        return this.sms;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCalendar() {
        return this.calendar;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getMotion() {
        return this.motion;
    }

    @NotNull
    public final HealthPermissions copy(String camera, String push, String calls, String geo, String bio, String contacts, String sms, @NotNull String calendar, @NotNull String motion, @NotNull String gallery, @NotNull String audio) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(motion, "motion");
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(audio, "audio");
        return new HealthPermissions(camera, push, calls, geo, bio, contacts, sms, calendar, motion, gallery, audio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthPermissions)) {
            return false;
        }
        HealthPermissions healthPermissions = (HealthPermissions) other;
        return Intrinsics.d(this.camera, healthPermissions.camera) && Intrinsics.d(this.push, healthPermissions.push) && Intrinsics.d(this.calls, healthPermissions.calls) && Intrinsics.d(this.geo, healthPermissions.geo) && Intrinsics.d(this.bio, healthPermissions.bio) && Intrinsics.d(this.contacts, healthPermissions.contacts) && Intrinsics.d(this.sms, healthPermissions.sms) && Intrinsics.d(this.calendar, healthPermissions.calendar) && Intrinsics.d(this.motion, healthPermissions.motion) && Intrinsics.d(this.gallery, healthPermissions.gallery) && Intrinsics.d(this.audio, healthPermissions.audio);
    }

    @NotNull
    public final String getAudio() {
        return this.audio;
    }

    public final String getBio() {
        return this.bio;
    }

    @NotNull
    public final String getCalendar() {
        return this.calendar;
    }

    public final String getCalls() {
        return this.calls;
    }

    public final String getCamera() {
        return this.camera;
    }

    public final String getContacts() {
        return this.contacts;
    }

    @NotNull
    public final String getGallery() {
        return this.gallery;
    }

    public final String getGeo() {
        return this.geo;
    }

    @NotNull
    public final String getMotion() {
        return this.motion;
    }

    public final String getPush() {
        return this.push;
    }

    public final String getSms() {
        return this.sms;
    }

    public int hashCode() {
        String str = this.camera;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.push;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.calls;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.geo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bio;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.contacts;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sms;
        return this.audio.hashCode() + g.a(g.a(g.a((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.calendar), 31, this.motion), 31, this.gallery);
    }

    @NotNull
    public String toString() {
        String str = this.camera;
        String str2 = this.push;
        String str3 = this.calls;
        String str4 = this.geo;
        String str5 = this.bio;
        String str6 = this.contacts;
        String str7 = this.sms;
        String str8 = this.calendar;
        String str9 = this.motion;
        String str10 = this.gallery;
        String str11 = this.audio;
        StringBuilder d11 = C3660k.d("HealthPermissions(camera=", str, ", push=", str2, ", calls=");
        a.h(d11, str3, ", geo=", str4, ", bio=");
        a.h(d11, str5, ", contacts=", str6, ", sms=");
        a.h(d11, str7, ", calendar=", str8, ", motion=");
        a.h(d11, str9, ", gallery=", str10, ", audio=");
        return o0.c(d11, str11, ")");
    }

    public /* synthetic */ HealthPermissions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? "unknown" : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "unknown" : str8, (i11 & 256) != 0 ? "unknown" : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "unknown" : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "unknown" : str11);
    }
}
