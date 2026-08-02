package com.vungle.ads.fpd;

import defpackage.cga;
import defpackage.duf;
import defpackage.q5h;
import defpackage.q79;
import defpackage.r5h;
import defpackage.sha;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yea;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Bo\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0002\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u0003R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "<init>", "()V", "", "seen1", "", "modelVersion", "Lcom/vungle/ads/fpd/SessionContext;", "_sessionContext", "Lcom/vungle/ads/fpd/Demographic;", "_demographic", "Lcom/vungle/ads/fpd/Location;", "_location", "Lcom/vungle/ads/fpd/Revenue;", "_revenue", "", "_customData", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/fpd/FirstPartyData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "debug", "()Ljava/lang/String;", "clearAll", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "sessionContext", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "demographic", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "location", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "revenue", "getCustomData", "()Ljava/util/Map;", "customData", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class FirstPartyData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final yea g = cga.c(FirstPartyData$Companion$JSON$1.INSTANCE);
    public final String a;
    public volatile SessionContext b;
    public volatile Demographic c;
    public volatile Location d;
    public volatile Revenue e;
    public Map f;

    @wx4
    public /* synthetic */ FirstPartyData(int i, @q5h("model_version") String str, @q5h("session_context") SessionContext sessionContext, @q5h("demographic") Demographic demographic, @q5h("location") Location location, @q5h("revenue") Revenue revenue, @q5h("custom_data") Map map, t5h t5hVar) {
        this.a = (i & 1) == 0 ? "2.0" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sessionContext;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = demographic;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = location;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = revenue;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
    }

    public static final void write$Self(@NotNull FirstPartyData self, @NotNull wf3 output, @NotNull SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        if (output.o(serialDesc) || !Intrinsics.c(self.a, "2.0")) {
            output.y(serialDesc, 0, self.a);
        }
        if (output.o(serialDesc) || self.b != null) {
            output.h(serialDesc, 1, SessionContext$$serializer.INSTANCE, self.b);
        }
        if (output.o(serialDesc) || self.c != null) {
            output.h(serialDesc, 2, Demographic$$serializer.INSTANCE, self.c);
        }
        if (output.o(serialDesc) || self.d != null) {
            output.h(serialDesc, 3, Location$$serializer.INSTANCE, self.d);
        }
        if (output.o(serialDesc) || self.e != null) {
            output.h(serialDesc, 4, Revenue$$serializer.INSTANCE, self.e);
        }
        if (!output.o(serialDesc) && self.f == null) {
            return;
        }
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, new q79(uhiVar, uhiVar, 1), self.f);
    }

    public final synchronized void clearAll() {
        try {
            this.b = null;
            this.c = null;
            this.e = null;
            this.d = null;
            Map map = this.f;
            if (map != null) {
                map.clear();
            }
            this.f = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final String debug() {
        yea yeaVar = g;
        return yeaVar.c(sha.Q(yeaVar.b, duf.b(FirstPartyData.class)), this);
    }

    @NotNull
    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> map;
        map = this.f;
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.f = map;
        }
        return map;
    }

    @NotNull
    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this.c;
        if (demographic == null) {
            demographic = new Demographic();
            this.c = demographic;
        }
        return demographic;
    }

    @NotNull
    public final synchronized Location getLocation() {
        Location location;
        location = this.d;
        if (location == null) {
            location = new Location();
            this.d = location;
        }
        return location;
    }

    @NotNull
    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this.e;
        if (revenue == null) {
            revenue = new Revenue();
            this.e = revenue;
        }
        return revenue;
    }

    @NotNull
    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this.b;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this.b = sessionContext;
        }
        return sessionContext;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lyea;", "JSON", "Lyea;", "", "MODEL_VERSION", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public FirstPartyData() {
        this.a = "2.0";
    }
}
