package Lf;

import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerResponse;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final TriggerResponse f7166a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7167b;

    public b(TriggerResponse triggerResponse, HashMap hashMap) {
        this.f7166a = triggerResponse;
        this.f7167b = hashMap;
    }

    public static /* synthetic */ b b(b bVar, TriggerResponse triggerResponse, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            triggerResponse = bVar.f7166a;
        }
        if ((i10 & 2) != 0) {
            hashMap = bVar.f7167b;
        }
        return bVar.a(triggerResponse, hashMap);
    }

    public final b a(TriggerResponse triggerResponse, HashMap hashMap) {
        return new b(triggerResponse, hashMap);
    }

    public final HashMap c() {
        return this.f7167b;
    }

    public final TriggerResponse d() {
        return this.f7166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f7166a, bVar.f7166a) && Intrinsics.areEqual(this.f7167b, bVar.f7167b);
    }

    public int hashCode() {
        TriggerResponse triggerResponse = this.f7166a;
        int hashCode = (triggerResponse == null ? 0 : triggerResponse.hashCode()) * 31;
        HashMap hashMap = this.f7167b;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public String toString() {
        return "TriggerCache(triggerResponse=" + this.f7166a + ", customActionTriggerResponse=" + this.f7167b + ')';
    }

    public /* synthetic */ b(TriggerResponse triggerResponse, HashMap hashMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : triggerResponse, (i10 & 2) != 0 ? null : hashMap);
    }
}
