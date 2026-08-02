package com.sofascore.model.branding;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "", "", "home", "draw", "away", "homeUrl", "drawUrl", "awayUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHome", "getDraw", "getAway", "getHomeUrl", "getDrawUrl", "getAwayUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingBoostedOdds {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String away;

    @NotNull
    private final String awayUrl;

    @Nullable
    private final String draw;

    @Nullable
    private final String drawUrl;

    @NotNull
    private final String home;

    @NotNull
    private final String homeUrl;

    public /* synthetic */ ServerBrandingBoostedOdds(int i, String str, String str2, String str3, String str4, String str5, String str6, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, ServerBrandingBoostedOdds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.home = str;
        this.draw = str2;
        this.away = str3;
        this.homeUrl = str4;
        this.drawUrl = str5;
        this.awayUrl = str6;
    }

    public static /* synthetic */ ServerBrandingBoostedOdds copy$default(ServerBrandingBoostedOdds serverBrandingBoostedOdds, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverBrandingBoostedOdds.home;
        }
        if ((i & 2) != 0) {
            str2 = serverBrandingBoostedOdds.draw;
        }
        if ((i & 4) != 0) {
            str3 = serverBrandingBoostedOdds.away;
        }
        if ((i & 8) != 0) {
            str4 = serverBrandingBoostedOdds.homeUrl;
        }
        if ((i & 16) != 0) {
            str5 = serverBrandingBoostedOdds.drawUrl;
        }
        if ((i & 32) != 0) {
            str6 = serverBrandingBoostedOdds.awayUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return serverBrandingBoostedOdds.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingBoostedOdds self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.home);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.draw);
        output.y(serialDesc, 2, self.away);
        output.y(serialDesc, 3, self.homeUrl);
        output.h(serialDesc, 4, uhiVar, self.drawUrl);
        output.y(serialDesc, 5, self.awayUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDraw() {
        return this.draw;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAway() {
        return this.away;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHomeUrl() {
        return this.homeUrl;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDrawUrl() {
        return this.drawUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAwayUrl() {
        return this.awayUrl;
    }

    @NotNull
    public final ServerBrandingBoostedOdds copy(@NotNull String home, @Nullable String draw, @NotNull String away, @NotNull String homeUrl, @Nullable String drawUrl, @NotNull String awayUrl) {
        home.getClass();
        away.getClass();
        homeUrl.getClass();
        awayUrl.getClass();
        return new ServerBrandingBoostedOdds(home, draw, away, homeUrl, drawUrl, awayUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingBoostedOdds)) {
            return false;
        }
        ServerBrandingBoostedOdds serverBrandingBoostedOdds = (ServerBrandingBoostedOdds) other;
        return Intrinsics.c(this.home, serverBrandingBoostedOdds.home) && Intrinsics.c(this.draw, serverBrandingBoostedOdds.draw) && Intrinsics.c(this.away, serverBrandingBoostedOdds.away) && Intrinsics.c(this.homeUrl, serverBrandingBoostedOdds.homeUrl) && Intrinsics.c(this.drawUrl, serverBrandingBoostedOdds.drawUrl) && Intrinsics.c(this.awayUrl, serverBrandingBoostedOdds.awayUrl);
    }

    @NotNull
    public final String getAway() {
        return this.away;
    }

    @NotNull
    public final String getAwayUrl() {
        return this.awayUrl;
    }

    @Nullable
    public final String getDraw() {
        return this.draw;
    }

    @Nullable
    public final String getDrawUrl() {
        return this.drawUrl;
    }

    @NotNull
    public final String getHome() {
        return this.home;
    }

    @NotNull
    public final String getHomeUrl() {
        return this.homeUrl;
    }

    public int hashCode() {
        int hashCode = this.home.hashCode() * 31;
        String str = this.draw;
        int c = dmi.c(dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.away), 31, this.homeUrl);
        String str2 = this.drawUrl;
        return this.awayUrl.hashCode() + ((c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.home;
        String str2 = this.draw;
        String str3 = this.away;
        String str4 = this.homeUrl;
        String str5 = this.drawUrl;
        String str6 = this.awayUrl;
        StringBuilder s = mz1.s("ServerBrandingBoostedOdds(home=", str, ", draw=", str2, ", away=");
        bf3.v(s, str3, ", homeUrl=", str4, ", drawUrl=");
        return fc6.o(s, str5, ", awayUrl=", str6, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingBoostedOdds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingBoostedOdds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingBoostedOdds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingBoostedOdds(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6) {
        w1l.y(str, str3, str4, str6);
        this.home = str;
        this.draw = str2;
        this.away = str3;
        this.homeUrl = str4;
        this.drawUrl = str5;
        this.awayUrl = str6;
    }
}
