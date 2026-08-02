package com.sofascore.model.mvvm.model;

import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "Ljava/io/Serializable;", "", "role", "batting", "bowling", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRole", "getBatting", "getBowling", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CricketPlayerInfo implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String batting;

    @Nullable
    private final String bowling;

    @Nullable
    private final String role;

    public /* synthetic */ CricketPlayerInfo(int i, String str, String str2, String str3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, CricketPlayerInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.role = str;
        this.batting = str2;
        this.bowling = str3;
    }

    public static /* synthetic */ CricketPlayerInfo copy$default(CricketPlayerInfo cricketPlayerInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cricketPlayerInfo.role;
        }
        if ((i & 2) != 0) {
            str2 = cricketPlayerInfo.batting;
        }
        if ((i & 4) != 0) {
            str3 = cricketPlayerInfo.bowling;
        }
        return cricketPlayerInfo.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(CricketPlayerInfo self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.role);
        output.h(serialDesc, 1, uhiVar, self.batting);
        output.h(serialDesc, 2, uhiVar, self.bowling);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBatting() {
        return this.batting;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBowling() {
        return this.bowling;
    }

    @NotNull
    public final CricketPlayerInfo copy(@Nullable String role, @Nullable String batting, @Nullable String bowling) {
        return new CricketPlayerInfo(role, batting, bowling);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CricketPlayerInfo)) {
            return false;
        }
        CricketPlayerInfo cricketPlayerInfo = (CricketPlayerInfo) other;
        return Intrinsics.c(this.role, cricketPlayerInfo.role) && Intrinsics.c(this.batting, cricketPlayerInfo.batting) && Intrinsics.c(this.bowling, cricketPlayerInfo.bowling);
    }

    @Nullable
    public final String getBatting() {
        return this.batting;
    }

    @Nullable
    public final String getBowling() {
        return this.bowling;
    }

    @Nullable
    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        String str = this.role;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.batting;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bowling;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.role;
        String str2 = this.batting;
        return mz1.o(mz1.s("CricketPlayerInfo(role=", str, ", batting=", str2, ", bowling="), this.bowling, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/CricketPlayerInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/CricketPlayerInfo;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CricketPlayerInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CricketPlayerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.role = str;
        this.batting = str2;
        this.bowling = str3;
    }
}
