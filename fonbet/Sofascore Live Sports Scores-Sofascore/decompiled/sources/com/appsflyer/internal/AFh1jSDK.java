package com.appsflyer.internal;

import defpackage.dmi;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1jSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "registerClient", "J", "unregisterClient", "AFKeystoreWrapper", "F", "AFLogger", "d", "Ljava/util/List;", "I", "Ljava/lang/String;", "force", "e", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFh1jSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final float AFLogger;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public final String d;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<String> AFKeystoreWrapper;

    /* renamed from: force, reason: from kotlin metadata */
    @NotNull
    public final String e;

    /* renamed from: registerClient, reason: from kotlin metadata */
    public final long unregisterClient;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    public final int registerClient;

    public AFh1jSDK(long j, float f, @NotNull List<String> list, int i, @NotNull String str, @NotNull String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.unregisterClient = j;
        this.AFLogger = f;
        this.AFKeystoreWrapper = list;
        this.registerClient = i;
        this.d = str;
        this.e = str2;
    }

    public static long registerClient() {
        return AFa1zSDK.d().AFKeystoreWrapper.i().unregisterClient();
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!AFh1jSDK.class.equals(p0 != null ? p0.getClass() : null)) {
            return false;
        }
        p0.getClass();
        AFh1jSDK aFh1jSDK = (AFh1jSDK) p0;
        return this.unregisterClient == aFh1jSDK.unregisterClient && this.AFLogger == aFh1jSDK.AFLogger && Intrinsics.c(this.AFKeystoreWrapper, aFh1jSDK.AFKeystoreWrapper) && this.registerClient == aFh1jSDK.registerClient && Intrinsics.c(this.d, aFh1jSDK.d) && Intrinsics.c(this.e, aFh1jSDK.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((dmi.d(fc6.a(this.AFLogger, Long.hashCode(this.unregisterClient) * 31, 31), 31, this.AFKeystoreWrapper) + this.registerClient) * 31)) * 31);
    }
}
