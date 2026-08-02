package Q5;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final EventContext f9412a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9414c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9415d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9416e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewContext f9417f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f9418g;

    /* renamed from: h, reason: collision with root package name */
    public final i f9419h;

    /* renamed from: i, reason: collision with root package name */
    public final LogContext f9420i;

    /* renamed from: j, reason: collision with root package name */
    public final NetworkRequestContext f9421j;

    /* renamed from: k, reason: collision with root package name */
    public final UserContext f9422k;

    /* renamed from: l, reason: collision with root package name */
    public final LifecycleContext f9423l;

    /* renamed from: m, reason: collision with root package name */
    public final CustomMeasurementContext f9424m;

    /* renamed from: n, reason: collision with root package name */
    public final InteractionContext f9425n;

    public h(EventContext eventContext, Map map, String str, String str2, String str3, ViewContext viewContext, Boolean bool, i iVar, LogContext logContext, NetworkRequestContext networkRequestContext, UserContext userContext, LifecycleContext lifecycleContext, CustomMeasurementContext customMeasurementContext, InteractionContext interactionContext) {
        this.f9412a = eventContext;
        this.f9413b = map;
        this.f9414c = str;
        this.f9415d = str2;
        this.f9416e = str3;
        this.f9417f = viewContext;
        this.f9418g = bool;
        this.f9419h = iVar;
        this.f9420i = logContext;
        this.f9421j = networkRequestContext;
        this.f9422k = userContext;
        this.f9423l = lifecycleContext;
        this.f9424m = customMeasurementContext;
        this.f9425n = interactionContext;
    }

    public final CustomMeasurementContext a() {
        return this.f9424m;
    }

    public final String b() {
        return this.f9416e;
    }

    public final i c() {
        return this.f9419h;
    }

    public final EventContext d() {
        return this.f9412a;
    }

    public final InteractionContext e() {
        return this.f9425n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f9412a, hVar.f9412a) && Intrinsics.areEqual(this.f9413b, hVar.f9413b) && Intrinsics.areEqual(this.f9414c, hVar.f9414c) && Intrinsics.areEqual(this.f9415d, hVar.f9415d) && Intrinsics.areEqual(this.f9416e, hVar.f9416e) && Intrinsics.areEqual(this.f9417f, hVar.f9417f) && Intrinsics.areEqual(this.f9418g, hVar.f9418g) && Intrinsics.areEqual(this.f9419h, hVar.f9419h) && Intrinsics.areEqual(this.f9420i, hVar.f9420i) && Intrinsics.areEqual(this.f9421j, hVar.f9421j) && Intrinsics.areEqual(this.f9422k, hVar.f9422k) && Intrinsics.areEqual(this.f9423l, hVar.f9423l) && Intrinsics.areEqual(this.f9424m, hVar.f9424m) && Intrinsics.areEqual(this.f9425n, hVar.f9425n);
    }

    public final Map f() {
        return this.f9413b;
    }

    public final LifecycleContext g() {
        return this.f9423l;
    }

    public final LogContext h() {
        return this.f9420i;
    }

    public int hashCode() {
        EventContext eventContext = this.f9412a;
        int hashCode = (eventContext == null ? 0 : eventContext.hashCode()) * 31;
        Map map = this.f9413b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f9414c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9415d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9416e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ViewContext viewContext = this.f9417f;
        int hashCode6 = (hashCode5 + (viewContext == null ? 0 : viewContext.hashCode())) * 31;
        Boolean bool = this.f9418g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        i iVar = this.f9419h;
        int hashCode8 = (hashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        LogContext logContext = this.f9420i;
        int hashCode9 = (hashCode8 + (logContext == null ? 0 : logContext.hashCode())) * 31;
        NetworkRequestContext networkRequestContext = this.f9421j;
        int hashCode10 = (hashCode9 + (networkRequestContext == null ? 0 : networkRequestContext.hashCode())) * 31;
        UserContext userContext = this.f9422k;
        int hashCode11 = (hashCode10 + (userContext == null ? 0 : userContext.hashCode())) * 31;
        LifecycleContext lifecycleContext = this.f9423l;
        int hashCode12 = (hashCode11 + (lifecycleContext == null ? 0 : lifecycleContext.hashCode())) * 31;
        CustomMeasurementContext customMeasurementContext = this.f9424m;
        int hashCode13 = (hashCode12 + (customMeasurementContext == null ? 0 : customMeasurementContext.hashCode())) * 31;
        InteractionContext interactionContext = this.f9425n;
        return hashCode13 + (interactionContext != null ? interactionContext.hashCode() : 0);
    }

    public final NetworkRequestContext i() {
        return this.f9421j;
    }

    public final String j() {
        return this.f9414c;
    }

    public final String k() {
        return this.f9415d;
    }

    public final UserContext l() {
        return this.f9422k;
    }

    public final ViewContext m() {
        return this.f9417f;
    }

    public final Boolean n() {
        return this.f9418g;
    }

    public String toString() {
        return "EditableCxRum(eventContext=" + this.f9412a + ", labels=" + this.f9413b + ", spanId=" + this.f9414c + ", traceId=" + this.f9415d + ", environment=" + this.f9416e + ", viewContext=" + this.f9417f + ", isSnapshotEvent=" + this.f9418g + ", errorContext=" + this.f9419h + ", logContext=" + this.f9420i + ", networkRequestContext=" + this.f9421j + ", userContext=" + this.f9422k + ", lifecycleContext=" + this.f9423l + ", customMeasurementContext=" + this.f9424m + ", interactionContext=" + this.f9425n + ")";
    }
}
