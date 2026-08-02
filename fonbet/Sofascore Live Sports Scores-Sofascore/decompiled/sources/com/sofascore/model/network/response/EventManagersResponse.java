package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Manager$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.fc6;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB_\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\b\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b*\u0010)J@\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u0018J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/sofascore/model/network/response/EventManagersResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "Lcom/sofascore/model/mvvm/model/Manager;", "homeManager", "awayManager", "", "homeManagerName", "awayManagerName", "<init>", "(Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/lang/String;ZLt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Manager;", "component2", "component3", "()Ljava/lang/String;", "component4", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/EventManagersResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeManager", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/mvvm/model/Manager;", "getAwayManager", "getHomeManagerName", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/String;", "getAwayManagerName", "copy", "(Lcom/sofascore/model/mvvm/model/Manager;Lcom/sofascore/model/mvvm/model/Manager;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/network/response/EventManagersResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Manager;", "Ljava/lang/String;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventManagersResponse extends AbstractNetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Manager awayManager;

    @Nullable
    private final String awayManagerName;

    @Nullable
    private final Manager homeManager;

    @Nullable
    private final String homeManagerName;
    private boolean shouldReverseTeams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventManagersResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, Manager manager, Manager manager2, String str, String str2, boolean z, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, EventManagersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeManager = manager;
        this.awayManager = manager2;
        this.homeManagerName = str;
        this.awayManagerName = str2;
        if ((i & 64) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Manager getHomeManager() {
        return this.homeManager;
    }

    /* renamed from: component2, reason: from getter */
    private final Manager getAwayManager() {
        return this.awayManager;
    }

    /* renamed from: component3, reason: from getter */
    private final String getHomeManagerName() {
        return this.homeManagerName;
    }

    /* renamed from: component4, reason: from getter */
    private final String getAwayManagerName() {
        return this.awayManagerName;
    }

    public static /* synthetic */ EventManagersResponse copy$default(EventManagersResponse eventManagersResponse, Manager manager, Manager manager2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            manager = eventManagersResponse.homeManager;
        }
        if ((i & 2) != 0) {
            manager2 = eventManagersResponse.awayManager;
        }
        if ((i & 4) != 0) {
            str = eventManagersResponse.homeManagerName;
        }
        if ((i & 8) != 0) {
            str2 = eventManagersResponse.awayManagerName;
        }
        return eventManagersResponse.copy(manager, manager2, str, str2);
    }

    public static /* synthetic */ Manager getAwayManager$default(EventManagersResponse eventManagersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventManagersResponse.getAwayManager(teamSides);
    }

    public static /* synthetic */ String getAwayManagerName$default(EventManagersResponse eventManagersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventManagersResponse.getAwayManagerName(teamSides);
    }

    public static /* synthetic */ Manager getHomeManager$default(EventManagersResponse eventManagersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventManagersResponse.getHomeManager(teamSides);
    }

    public static /* synthetic */ String getHomeManagerName$default(EventManagersResponse eventManagersResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eventManagersResponse.getHomeManagerName(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(EventManagersResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        Manager$$serializer manager$$serializer = Manager$$serializer.INSTANCE;
        output.h(serialDesc, 2, manager$$serializer, self.homeManager);
        output.h(serialDesc, 3, manager$$serializer, self.awayManager);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 4, uhiVar, self.homeManagerName);
        output.h(serialDesc, 5, uhiVar, self.awayManagerName);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 6, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final EventManagersResponse copy(@Nullable Manager homeManager, @Nullable Manager awayManager, @Nullable String homeManagerName, @Nullable String awayManagerName) {
        return new EventManagersResponse(homeManager, awayManager, homeManagerName, awayManagerName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventManagersResponse)) {
            return false;
        }
        EventManagersResponse eventManagersResponse = (EventManagersResponse) other;
        return Intrinsics.c(this.homeManager, eventManagersResponse.homeManager) && Intrinsics.c(this.awayManager, eventManagersResponse.awayManager) && Intrinsics.c(this.homeManagerName, eventManagersResponse.homeManagerName) && Intrinsics.c(this.awayManagerName, eventManagersResponse.awayManagerName);
    }

    @Nullable
    public final Manager getAwayManager(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeManager : this.awayManager;
    }

    @Nullable
    public final String getAwayManagerName(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeManagerName : this.awayManagerName;
    }

    @Nullable
    public final Manager getHomeManager(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayManager : this.homeManager;
    }

    @Nullable
    public final String getHomeManagerName(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayManagerName : this.homeManagerName;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        Manager manager = this.homeManager;
        int hashCode = (manager == null ? 0 : manager.hashCode()) * 31;
        Manager manager2 = this.awayManager;
        int hashCode2 = (hashCode + (manager2 == null ? 0 : manager2.hashCode())) * 31;
        String str = this.homeManagerName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayManagerName;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        Manager manager = this.homeManager;
        Manager manager2 = this.awayManager;
        String str = this.homeManagerName;
        String str2 = this.awayManagerName;
        StringBuilder sb = new StringBuilder("EventManagersResponse(homeManager=");
        sb.append(manager);
        sb.append(", awayManager=");
        sb.append(manager2);
        sb.append(", homeManagerName=");
        return fc6.o(sb, str, ", awayManagerName=", str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/EventManagersResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/EventManagersResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventManagersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventManagersResponse(@Nullable Manager manager, @Nullable Manager manager2, @Nullable String str, @Nullable String str2) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.homeManager = manager;
        this.awayManager = manager2;
        this.homeManagerName = str;
        this.awayManagerName = str2;
    }
}
