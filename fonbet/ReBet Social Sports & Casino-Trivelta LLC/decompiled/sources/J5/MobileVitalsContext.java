package J5;

import Zh.InterfaceC1901b;
import Zh.n;
import ai.AbstractC2028a;
import bi.f;
import bi.l;
import com.bumptech.glide.gifdecoder.e;
import di.A0;
import di.Z0;
import e5.MobileVitalsAggregation;
import ei.AbstractC4212b;
import ei.C;
import ei.h;
import ei.j;
import ei.s;
import f5.MobileVitalsSnapshot;
import f5.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import oh.g;
import org.jetbrains.annotations.NotNull;

@n(with = b.class)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u001a\u001cBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001a\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(¨\u0006*"}, d2 = {"LJ5/c;", "", "Lf5/j;", "fps", "LJ5/b;", "memory", "LJ5/a;", "cpu", "LJ5/d;", "slowFrozen", "Lkotlin/Pair;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/coralogix/android/sdk/internal/features/instrumentations/vitals/OneShotEvent;", "oneShot", "<init>", "(Lf5/j;LJ5/b;LJ5/a;LJ5/d;Lkotlin/Pair;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf5/j;", com.google.crypto.tink.integration.android.b.f37029b, "()Lf5/j;", "LJ5/b;", "c", "()LJ5/b;", "LJ5/a;", "()LJ5/a;", W9.d.f13160a, "LJ5/d;", e.f29601m, "()LJ5/d;", "Lkotlin/Pair;", "()Lkotlin/Pair;", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J5.c, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class MobileVitalsContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot fps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final MemoryUsageDetails memory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final CpuUsageDetails cpu;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final SlowFrozenFramesDetails slowFrozen;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final transient Pair oneShot;

    /* renamed from: J5.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MobileVitalsContext a(g attributes) {
            MobileVitalsAggregation mobileVitalsAggregation;
            Pair pair;
            Map slowFrozenFrames;
            Map cpu;
            Map memory;
            Map fps;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (!R4.a.j(attributes)) {
                return null;
            }
            String c10 = R4.a.c(attributes, "mobile_vitals_aggregation");
            E5.b bVar = E5.b.f3006a;
            bVar.a("aggregated json: " + c10);
            String c11 = R4.a.c(attributes, "mobile_vitals_one_shot");
            bVar.a("one-shot json: " + c11);
            if (c10 != null) {
                AbstractC4212b b10 = F5.b.b();
                b10.a();
                mobileVitalsAggregation = (MobileVitalsAggregation) b10.d(AbstractC2028a.t(MobileVitalsAggregation.INSTANCE.serializer()), c10);
            } else {
                mobileVitalsAggregation = null;
            }
            if (c11 != null) {
                AbstractC4212b b11 = F5.b.b();
                b11.a();
                pair = (Pair) b11.d(AbstractC2028a.t(new A0(Z0.f45341a, JsonObject.INSTANCE.serializer())), c11);
            } else {
                pair = null;
            }
            MobileVitalsContext mobileVitalsContext = new MobileVitalsContext((mobileVitalsAggregation == null || (fps = mobileVitalsAggregation.getFps()) == null) ? null : (MobileVitalsSnapshot) fps.get(f5.e.f46399c), (mobileVitalsAggregation == null || (memory = mobileVitalsAggregation.getMemory()) == null) ? null : new MemoryUsageDetails((MobileVitalsSnapshot) memory.get(f5.g.f46403c), (MobileVitalsSnapshot) memory.get(f5.g.f46404d), (MobileVitalsSnapshot) memory.get(f5.g.f46405e), (MobileVitalsSnapshot) memory.get(f5.g.f46406f), (MobileVitalsSnapshot) memory.get(f5.g.f46407g), (MobileVitalsSnapshot) memory.get(f5.g.f46408h), (MobileVitalsSnapshot) memory.get(f5.g.f46409i)), (mobileVitalsAggregation == null || (cpu = mobileVitalsAggregation.getCpu()) == null) ? null : new CpuUsageDetails((MobileVitalsSnapshot) cpu.get(f5.c.f46393c), (MobileVitalsSnapshot) cpu.get(f5.c.f46394d), (MobileVitalsSnapshot) cpu.get(f5.c.f46395e)), (mobileVitalsAggregation == null || (slowFrozenFrames = mobileVitalsAggregation.getSlowFrozenFrames()) == null) ? null : new SlowFrozenFramesDetails((MobileVitalsSnapshot) slowFrozenFrames.get(i.f46413c), (MobileVitalsSnapshot) slowFrozenFrames.get(i.f46414d)), pair);
            bVar.a("mobile vitals context: " + mobileVitalsContext);
            if (b(mobileVitalsContext)) {
                return null;
            }
            return mobileVitalsContext;
        }

        public final boolean b(MobileVitalsContext mobileVitalsContext) {
            return Intrinsics.areEqual(mobileVitalsContext, new MobileVitalsContext(null, null, null, null, null, 31, null));
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return b.f5942a;
        }

        public Companion() {
        }
    }

    /* renamed from: J5.c$b */
    public static final class b implements InterfaceC1901b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5942a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final f f5943b = l.e("MobileVitalsContext", new f[0], null, 4, null);

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MobileVitalsContext deserialize(ci.e decoder) {
            Object obj;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            h hVar = decoder instanceof h ? (h) decoder : null;
            if (hVar == null) {
                throw new IllegalStateException("MobileVitalsContext must be decoded with JSON");
            }
            AbstractC4212b d10 = hVar.d();
            JsonObject l10 = j.l(hVar.j());
            JsonElement jsonElement = (JsonElement) l10.get("fps");
            MobileVitalsSnapshot mobileVitalsSnapshot = jsonElement != null ? (MobileVitalsSnapshot) d10.c(MobileVitalsSnapshot.INSTANCE.serializer(), jsonElement) : null;
            JsonElement jsonElement2 = (JsonElement) l10.get("memory");
            MemoryUsageDetails memoryUsageDetails = jsonElement2 != null ? (MemoryUsageDetails) d10.c(MemoryUsageDetails.INSTANCE.serializer(), jsonElement2) : null;
            JsonElement jsonElement3 = (JsonElement) l10.get("cpu");
            CpuUsageDetails cpuUsageDetails = jsonElement3 != null ? (CpuUsageDetails) d10.c(CpuUsageDetails.INSTANCE.serializer(), jsonElement3) : null;
            JsonElement jsonElement4 = (JsonElement) l10.get("slow_frozen");
            SlowFrozenFramesDetails slowFrozenFramesDetails = jsonElement4 != null ? (SlowFrozenFramesDetails) d10.c(SlowFrozenFramesDetails.INSTANCE.serializer(), jsonElement4) : null;
            Set of2 = SetsKt.setOf((Object[]) new String[]{"fps", "memory", "cpu", "slow_frozen"});
            Iterator<T> it = l10.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) ((Map.Entry) obj).getKey();
                if (!of2.contains(str) && f5942a.c((JsonElement) l10.get(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            return new MobileVitalsContext(mobileVitalsSnapshot, memoryUsageDetails, cpuUsageDetails, slowFrozenFramesDetails, entry != null ? TuplesKt.to((String) entry.getKey(), j.l((JsonElement) entry.getValue())) : null);
        }

        public final boolean c(JsonElement jsonElement) {
            return jsonElement instanceof JsonObject;
        }

        @Override // Zh.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void serialize(ci.f encoder, MobileVitalsContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            s sVar = encoder instanceof s ? (s) encoder : null;
            if (sVar == null) {
                throw new IllegalStateException("MobileVitalsContext must be encoded with JSON");
            }
            AbstractC4212b d10 = sVar.d();
            C c10 = new C();
            MobileVitalsSnapshot fps = value.getFps();
            if (fps != null) {
                c10.b("fps", d10.e(MobileVitalsSnapshot.INSTANCE.serializer(), fps));
            }
            MemoryUsageDetails memory = value.getMemory();
            if (memory != null) {
                c10.b("memory", d10.e(MemoryUsageDetails.INSTANCE.serializer(), memory));
            }
            CpuUsageDetails cpu = value.getCpu();
            if (cpu != null) {
                c10.b("cpu", d10.e(CpuUsageDetails.INSTANCE.serializer(), cpu));
            }
            SlowFrozenFramesDetails slowFrozen = value.getSlowFrozen();
            if (slowFrozen != null) {
                c10.b("slow_frozen", d10.e(SlowFrozenFramesDetails.INSTANCE.serializer(), slowFrozen));
            }
            Pair oneShot = value.getOneShot();
            if (oneShot != null) {
                c10.b((String) oneShot.component1(), (JsonObject) oneShot.component2());
            }
            sVar.D(c10.a());
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public f getDescriptor() {
            return f5943b;
        }
    }

    public MobileVitalsContext(MobileVitalsSnapshot mobileVitalsSnapshot, MemoryUsageDetails memoryUsageDetails, CpuUsageDetails cpuUsageDetails, SlowFrozenFramesDetails slowFrozenFramesDetails, Pair pair) {
        this.fps = mobileVitalsSnapshot;
        this.memory = memoryUsageDetails;
        this.cpu = cpuUsageDetails;
        this.slowFrozen = slowFrozenFramesDetails;
        this.oneShot = pair;
    }

    /* renamed from: a, reason: from getter */
    public final CpuUsageDetails getCpu() {
        return this.cpu;
    }

    /* renamed from: b, reason: from getter */
    public final MobileVitalsSnapshot getFps() {
        return this.fps;
    }

    /* renamed from: c, reason: from getter */
    public final MemoryUsageDetails getMemory() {
        return this.memory;
    }

    /* renamed from: d, reason: from getter */
    public final Pair getOneShot() {
        return this.oneShot;
    }

    /* renamed from: e, reason: from getter */
    public final SlowFrozenFramesDetails getSlowFrozen() {
        return this.slowFrozen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVitalsContext)) {
            return false;
        }
        MobileVitalsContext mobileVitalsContext = (MobileVitalsContext) other;
        return Intrinsics.areEqual(this.fps, mobileVitalsContext.fps) && Intrinsics.areEqual(this.memory, mobileVitalsContext.memory) && Intrinsics.areEqual(this.cpu, mobileVitalsContext.cpu) && Intrinsics.areEqual(this.slowFrozen, mobileVitalsContext.slowFrozen) && Intrinsics.areEqual(this.oneShot, mobileVitalsContext.oneShot);
    }

    public int hashCode() {
        MobileVitalsSnapshot mobileVitalsSnapshot = this.fps;
        int hashCode = (mobileVitalsSnapshot == null ? 0 : mobileVitalsSnapshot.hashCode()) * 31;
        MemoryUsageDetails memoryUsageDetails = this.memory;
        int hashCode2 = (hashCode + (memoryUsageDetails == null ? 0 : memoryUsageDetails.hashCode())) * 31;
        CpuUsageDetails cpuUsageDetails = this.cpu;
        int hashCode3 = (hashCode2 + (cpuUsageDetails == null ? 0 : cpuUsageDetails.hashCode())) * 31;
        SlowFrozenFramesDetails slowFrozenFramesDetails = this.slowFrozen;
        int hashCode4 = (hashCode3 + (slowFrozenFramesDetails == null ? 0 : slowFrozenFramesDetails.hashCode())) * 31;
        Pair pair = this.oneShot;
        return hashCode4 + (pair != null ? pair.hashCode() : 0);
    }

    public String toString() {
        return "MobileVitalsContext(fps=" + this.fps + ", memory=" + this.memory + ", cpu=" + this.cpu + ", slowFrozen=" + this.slowFrozen + ", oneShot=" + this.oneShot + ")";
    }

    public /* synthetic */ MobileVitalsContext(MobileVitalsSnapshot mobileVitalsSnapshot, MemoryUsageDetails memoryUsageDetails, CpuUsageDetails cpuUsageDetails, SlowFrozenFramesDetails slowFrozenFramesDetails, Pair pair, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : mobileVitalsSnapshot, (i10 & 2) != 0 ? null : memoryUsageDetails, (i10 & 4) != 0 ? null : cpuUsageDetails, (i10 & 8) != 0 ? null : slowFrozenFramesDetails, (i10 & 16) != 0 ? null : pair);
    }
}
