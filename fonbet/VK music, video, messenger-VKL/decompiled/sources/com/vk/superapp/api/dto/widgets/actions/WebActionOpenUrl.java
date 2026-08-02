package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.epx;
import xsna.juu;
import xsna.qxm0;
import xsna.zrp;

/* compiled from: WebActionOpenUrl.kt */
/* loaded from: classes6.dex */
public class WebActionOpenUrl extends WebAction implements juu {
    public static final a CREATOR = new a();
    public final String c;
    public final Target d;
    public final WebAction e;
    public final String f;
    public final boolean g;
    public final long h;
    public final String i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebActionOpenUrl.kt */
    public static final class Target {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Target[] $VALUES;
        public static final Target authorize;

        /* renamed from: default, reason: not valid java name */
        public static final Target f43default;
        public static final Target external;

        /* renamed from: internal, reason: collision with root package name */
        public static final Target f97internal;
        public static final Target internal_hidden;

        static {
            Target target = new Target(D1.e, 0);
            external = target;
            Target target2 = new Target("internal", 1);
            f97internal = target2;
            Target target3 = new Target("internal_hidden", 2);
            internal_hidden = target3;
            Target target4 = new Target("authorize", 3);
            authorize = target4;
            Target target5 = new Target(BuildConfig.FLAVOR, 4);
            f43default = target5;
            Target[] targetArr = {target, target2, target3, target4, target5};
            $VALUES = targetArr;
            $ENTRIES = new asp(targetArr);
        }

        public Target() {
            throw null;
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }
    }

    /* compiled from: WebActionOpenUrl.kt */
    public static final class a implements Parcelable.Creator<WebActionOpenUrl> {
        @Override // android.os.Parcelable.Creator
        public final WebActionOpenUrl createFromParcel(Parcel parcel) {
            return new WebActionOpenUrl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenUrl[] newArray(int i) {
            return new WebActionOpenUrl[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WebActionOpenUrl(java.lang.String r10, com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl.Target r11, com.vk.superapp.api.dto.widgets.actions.WebAction r12, java.lang.String r13, boolean r14, long r15, java.lang.String r17, int r18, xsna.zcl r19) {
        /*
            r9 = this;
            r0 = r18 & 2
            if (r0 == 0) goto L6
            com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl$Target r11 = com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl.Target.f43default
        L6:
            r2 = r11
            r11 = r18 & 16
            if (r11 == 0) goto Lc
            r14 = 0
        Lc:
            r5 = r14
            r11 = r18 & 32
            if (r11 == 0) goto L1b
            r0 = -1
            r6 = r0
            r3 = r12
            r4 = r13
            r8 = r17
            r0 = r9
            r1 = r10
            goto L22
        L1b:
            r6 = r15
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r8 = r17
        L22:
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl.<init>(java.lang.String, com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl$Target, com.vk.superapp.api.dto.widgets.actions.WebAction, java.lang.String, boolean, long, java.lang.String, int, xsna.zcl):void");
    }

    @Override // xsna.juu
    public final boolean d() {
        return this.g;
    }

    @Override // xsna.juu
    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WebActionOpenUrl)) {
            return false;
        }
        WebActionOpenUrl webActionOpenUrl = (WebActionOpenUrl) obj;
        return epx.f(this.c, webActionOpenUrl.c) && this.d == webActionOpenUrl.d && epx.f(this.e, webActionOpenUrl.e) && epx.f(this.f, webActionOpenUrl.f);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.f;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() + (this.c.hashCode() * 31);
        String str = this.f;
        if (str != null) {
            hashCode = (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }
        WebAction webAction = this.e;
        if (webAction != null) {
            return (hashCode * 31) + (webAction != null ? webAction.hashCode() : 0);
        }
        return hashCode;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
    }

    public WebActionOpenUrl(String str, Target target, WebAction webAction, String str2, boolean z, long j, String str3) {
        this.c = str;
        this.d = target;
        this.e = webAction;
        this.f = str2;
        this.g = z;
        this.h = j;
        this.i = str3;
    }

    public WebActionOpenUrl(Parcel parcel) {
        this(parcel.readString(), Target.valueOf(parcel.readString()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), qxm0.v(parcel), parcel.readLong(), parcel.readString());
    }
}
