package e5;

import Zh.B;
import Zh.InterfaceC1901b;
import Zh.n;
import ai.AbstractC2028a;
import bi.f;
import com.bumptech.glide.gifdecoder.e;
import di.C4084d0;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import f5.MobileVitalsSnapshot;
import f5.g;
import f5.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002$(B_\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBs\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b)\u0010'R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'¨\u0006,"}, d2 = {"Le5/b;", "", "", "Lf5/e;", "Lf5/j;", "fps", "Lf5/c;", "cpu", "Lf5/g;", "memory", "Lf5/i;", "slowFrozenFrames", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "f", "(Le5/b;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", com.google.crypto.tink.integration.android.b.f37029b, W9.d.f13160a, e.f29601m, "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e5.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class MobileVitalsAggregation {

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map fps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map cpu;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map memory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map slowFrozenFrames;

    /* renamed from: e5.b$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45661a;

        @NotNull
        private static final f descriptor;

        static {
            a aVar = new a();
            f45661a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.features.instrumentations.vitals.MobileVitalsAggregation", aVar, 4);
            j02.n("fps", false);
            j02.n("cpu", false);
            j02.n("memory", false);
            j02.n("slowFrozenFrames", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MobileVitalsAggregation deserialize(ci.e decoder) {
            int i10;
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = MobileVitalsAggregation.$childSerializers;
            Map map5 = null;
            if (c10.q()) {
                Map map6 = (Map) c10.C(fVar, 0, interfaceC1901bArr[0], null);
                Map map7 = (Map) c10.C(fVar, 1, interfaceC1901bArr[1], null);
                Map map8 = (Map) c10.C(fVar, 2, interfaceC1901bArr[2], null);
                map4 = (Map) c10.C(fVar, 3, interfaceC1901bArr[3], null);
                map = map6;
                i10 = 15;
                map3 = map8;
                map2 = map7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Map map9 = null;
                Map map10 = null;
                Map map11 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        map5 = (Map) c10.C(fVar, 0, interfaceC1901bArr[0], map5);
                        i11 |= 1;
                    } else if (e10 == 1) {
                        map9 = (Map) c10.C(fVar, 1, interfaceC1901bArr[1], map9);
                        i11 |= 2;
                    } else if (e10 == 2) {
                        map10 = (Map) c10.C(fVar, 2, interfaceC1901bArr[2], map10);
                        i11 |= 4;
                    } else {
                        if (e10 != 3) {
                            throw new B(e10);
                        }
                        map11 = (Map) c10.C(fVar, 3, interfaceC1901bArr[3], map11);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                map = map5;
                map2 = map9;
                map3 = map10;
                map4 = map11;
            }
            c10.b(fVar);
            return new MobileVitalsAggregation(i10, map, map2, map3, map4, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, MobileVitalsAggregation value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            MobileVitalsAggregation.f(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b[] interfaceC1901bArr = MobileVitalsAggregation.$childSerializers;
            return new InterfaceC1901b[]{AbstractC2028a.t(interfaceC1901bArr[0]), AbstractC2028a.t(interfaceC1901bArr[1]), AbstractC2028a.t(interfaceC1901bArr[2]), AbstractC2028a.t(interfaceC1901bArr[3])};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: e5.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f45661a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        InterfaceC1901b serializer = f5.e.INSTANCE.serializer();
        MobileVitalsSnapshot.a aVar = MobileVitalsSnapshot.a.f46422a;
        $childSerializers = new InterfaceC1901b[]{new C4084d0(serializer, aVar), new C4084d0(f5.c.INSTANCE.serializer(), aVar), new C4084d0(g.INSTANCE.serializer(), aVar), new C4084d0(i.INSTANCE.serializer(), aVar)};
    }

    public /* synthetic */ MobileVitalsAggregation(int i10, Map map, Map map2, Map map3, Map map4, U0 u02) {
        if (15 != (i10 & 15)) {
            F0.a(i10, 15, a.f45661a.getDescriptor());
        }
        this.fps = map;
        this.cpu = map2;
        this.memory = map3;
        this.slowFrozenFrames = map4;
    }

    public static final /* synthetic */ void f(MobileVitalsAggregation self, ci.d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.C(serialDesc, 0, interfaceC1901bArr[0], self.fps);
        output.C(serialDesc, 1, interfaceC1901bArr[1], self.cpu);
        output.C(serialDesc, 2, interfaceC1901bArr[2], self.memory);
        output.C(serialDesc, 3, interfaceC1901bArr[3], self.slowFrozenFrames);
    }

    /* renamed from: b, reason: from getter */
    public final Map getCpu() {
        return this.cpu;
    }

    /* renamed from: c, reason: from getter */
    public final Map getFps() {
        return this.fps;
    }

    /* renamed from: d, reason: from getter */
    public final Map getMemory() {
        return this.memory;
    }

    /* renamed from: e, reason: from getter */
    public final Map getSlowFrozenFrames() {
        return this.slowFrozenFrames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVitalsAggregation)) {
            return false;
        }
        MobileVitalsAggregation mobileVitalsAggregation = (MobileVitalsAggregation) other;
        return Intrinsics.areEqual(this.fps, mobileVitalsAggregation.fps) && Intrinsics.areEqual(this.cpu, mobileVitalsAggregation.cpu) && Intrinsics.areEqual(this.memory, mobileVitalsAggregation.memory) && Intrinsics.areEqual(this.slowFrozenFrames, mobileVitalsAggregation.slowFrozenFrames);
    }

    public int hashCode() {
        Map map = this.fps;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.cpu;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.memory;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.slowFrozenFrames;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "MobileVitalsAggregation(fps=" + this.fps + ", cpu=" + this.cpu + ", memory=" + this.memory + ", slowFrozenFrames=" + this.slowFrozenFrames + ")";
    }

    public MobileVitalsAggregation(Map map, Map map2, Map map3, Map map4) {
        this.fps = map;
        this.cpu = map2;
        this.memory = map3;
        this.slowFrozenFrames = map4;
    }
}
