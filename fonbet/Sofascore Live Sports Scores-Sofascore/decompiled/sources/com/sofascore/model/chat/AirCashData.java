package com.sofascore.model.chat;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lcom/sofascore/model/chat/AirCashData;", "", "", "showEventPercentage", "minMessageDistance", "maxMessageDistance", "minTimeDistance", "maxTimeDistance", "", "username", PglCryptUtils.KEY_MESSAGE, "<init>", "(IIIIILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIIIILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/chat/AirCashData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "copy", "(IIIIILjava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/chat/AirCashData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getShowEventPercentage", "getMinMessageDistance", "getMaxMessageDistance", "getMinTimeDistance", "getMaxTimeDistance", "Ljava/lang/String;", "getUsername", "getMessage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AirCashData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int maxMessageDistance;
    private final int maxTimeDistance;

    @NotNull
    private final String message;
    private final int minMessageDistance;
    private final int minTimeDistance;
    private final int showEventPercentage;

    @NotNull
    private final String username;

    public /* synthetic */ AirCashData(int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, AirCashData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.showEventPercentage = i2;
        this.minMessageDistance = i3;
        this.maxMessageDistance = i4;
        this.minTimeDistance = i5;
        this.maxTimeDistance = i6;
        this.username = str;
        this.message = str2;
    }

    public static /* synthetic */ AirCashData copy$default(AirCashData airCashData, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = airCashData.showEventPercentage;
        }
        if ((i6 & 2) != 0) {
            i2 = airCashData.minMessageDistance;
        }
        if ((i6 & 4) != 0) {
            i3 = airCashData.maxMessageDistance;
        }
        if ((i6 & 8) != 0) {
            i4 = airCashData.minTimeDistance;
        }
        if ((i6 & 16) != 0) {
            i5 = airCashData.maxTimeDistance;
        }
        if ((i6 & 32) != 0) {
            str = airCashData.username;
        }
        if ((i6 & 64) != 0) {
            str2 = airCashData.message;
        }
        String str3 = str;
        String str4 = str2;
        int i7 = i5;
        int i8 = i3;
        return airCashData.copy(i, i2, i8, i4, i7, str3, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(AirCashData self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.showEventPercentage, serialDesc);
        output.u(1, self.minMessageDistance, serialDesc);
        output.u(2, self.maxMessageDistance, serialDesc);
        output.u(3, self.minTimeDistance, serialDesc);
        output.u(4, self.maxTimeDistance, serialDesc);
        output.y(serialDesc, 5, self.username);
        output.y(serialDesc, 6, self.message);
    }

    /* renamed from: component1, reason: from getter */
    public final int getShowEventPercentage() {
        return this.showEventPercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinMessageDistance() {
        return this.minMessageDistance;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxMessageDistance() {
        return this.maxMessageDistance;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinTimeDistance() {
        return this.minTimeDistance;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxTimeDistance() {
        return this.maxTimeDistance;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final AirCashData copy(int showEventPercentage, int minMessageDistance, int maxMessageDistance, int minTimeDistance, int maxTimeDistance, @NotNull String username, @NotNull String message) {
        username.getClass();
        message.getClass();
        return new AirCashData(showEventPercentage, minMessageDistance, maxMessageDistance, minTimeDistance, maxTimeDistance, username, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirCashData)) {
            return false;
        }
        AirCashData airCashData = (AirCashData) other;
        return this.showEventPercentage == airCashData.showEventPercentage && this.minMessageDistance == airCashData.minMessageDistance && this.maxMessageDistance == airCashData.maxMessageDistance && this.minTimeDistance == airCashData.minTimeDistance && this.maxTimeDistance == airCashData.maxTimeDistance && Intrinsics.c(this.username, airCashData.username) && Intrinsics.c(this.message, airCashData.message);
    }

    public final int getMaxMessageDistance() {
        return this.maxMessageDistance;
    }

    public final int getMaxTimeDistance() {
        return this.maxTimeDistance;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getMinMessageDistance() {
        return this.minMessageDistance;
    }

    public final int getMinTimeDistance() {
        return this.minTimeDistance;
    }

    public final int getShowEventPercentage() {
        return this.showEventPercentage;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.message.hashCode() + dmi.c(wv8.a(this.maxTimeDistance, wv8.a(this.minTimeDistance, wv8.a(this.maxMessageDistance, wv8.a(this.minMessageDistance, Integer.hashCode(this.showEventPercentage) * 31, 31), 31), 31), 31), 31, this.username);
    }

    @NotNull
    public String toString() {
        int i = this.showEventPercentage;
        int i2 = this.minMessageDistance;
        int i3 = this.maxMessageDistance;
        int i4 = this.minTimeDistance;
        int i5 = this.maxTimeDistance;
        String str = this.username;
        String str2 = this.message;
        StringBuilder s = lnb.s(i, i2, "AirCashData(showEventPercentage=", ", minMessageDistance=", ", maxMessageDistance=");
        me4.q(s, i3, ", minTimeDistance=", i4, ", maxTimeDistance=");
        vxd.p(i5, ", username=", str, ", message=", s);
        return mz1.o(s, str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/chat/AirCashData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/chat/AirCashData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AirCashData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AirCashData(int i, int i2, int i3, int i4, int i5, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.showEventPercentage = i;
        this.minMessageDistance = i2;
        this.maxMessageDistance = i3;
        this.minTimeDistance = i4;
        this.maxTimeDistance = i5;
        this.username = str;
        this.message = str2;
    }
}
