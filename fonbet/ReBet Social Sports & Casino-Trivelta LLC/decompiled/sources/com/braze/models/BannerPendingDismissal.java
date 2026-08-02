package com.braze.models;

import Zh.n;
import bi.f;
import bo.app.o;
import bo.app.p;
import ci.d;
import di.F0;
import di.U0;
import di.Z0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/braze/models/BannerPendingDismissal;", "", "", "bannerId", "stableKey", "", "dismissalTimeMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BannerPendingDismissal;Lci/d;Lbi/f;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBannerId", "getBannerId$annotations", "()V", "getStableKey", "getStableKey$annotations", "J", "getDismissalTimeMs", "()J", "getDismissalTimeMs$annotations", "Companion", "bo/app/o", "bo/app/p", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BannerPendingDismissal {
    public static final p Companion = new p();
    private final String bannerId;
    private final long dismissalTimeMs;
    private final String stableKey;

    public /* synthetic */ BannerPendingDismissal(int i10, String str, String str2, long j10, U0 u02) {
        if (5 != (i10 & 5)) {
            F0.a(i10, 5, o.f25839a.getDescriptor());
        }
        this.bannerId = str;
        if ((i10 & 2) == 0) {
            this.stableKey = null;
        } else {
            this.stableKey = str2;
        }
        this.dismissalTimeMs = j10;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$android_sdk_base_release(BannerPendingDismissal self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.bannerId);
        if (output.m(serialDesc, 1) || self.stableKey != null) {
            output.C(serialDesc, 1, Z0.f45341a, self.stableKey);
        }
        output.e(serialDesc, 2, self.dismissalTimeMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerPendingDismissal)) {
            return false;
        }
        BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) other;
        return Intrinsics.areEqual(this.bannerId, bannerPendingDismissal.bannerId) && Intrinsics.areEqual(this.stableKey, bannerPendingDismissal.stableKey) && this.dismissalTimeMs == bannerPendingDismissal.dismissalTimeMs;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final long getDismissalTimeMs() {
        return this.dismissalTimeMs;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public int hashCode() {
        int hashCode = this.bannerId.hashCode() * 31;
        String str = this.stableKey;
        return Long.hashCode(this.dismissalTimeMs) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "BannerPendingDismissal(bannerId=" + this.bannerId + ", stableKey=" + this.stableKey + ", dismissalTimeMs=" + this.dismissalTimeMs + ")";
    }

    public BannerPendingDismissal(String bannerId, String str, long j10) {
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        this.bannerId = bannerId;
        this.stableKey = str;
        this.dismissalTimeMs = j10;
    }
}
