package com.vk.core.view.components.cell;

import com.vk.core.view.components.cell.f;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.epx;
import xsna.fd90;
import xsna.imi0;
import xsna.msy;
import xsna.ozl;
import xsna.sp;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* compiled from: VkCellSkeleton.kt */
@imi0
/* loaded from: classes17.dex */
public final class e {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] e = {null, null, null, msy.a(LazyThreadSafetyMode.PUBLICATION, new fd90(22))};
    public final f a;
    public final f b;
    public final f c;
    public final VkCellSkeleton$Middle$Size d;

    /* compiled from: VkCellSkeleton.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<e> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Middle.DefaultMiddle", aVar, 4);
            xfb0Var.j("title", false);
            xfb0Var.j("subtitle", true);
            xfb0Var.j("extraSubtitle", true);
            xfb0Var.j("size", true);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = e.e;
            f.a aVar = f.a.a;
            return new KSerializer[]{xn8.a(aVar), xn8.a(aVar), xn8.a(aVar), lazyArr[3].getValue()};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = e.e;
            int i = 0;
            f fVar = null;
            f fVar2 = null;
            f fVar3 = null;
            VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size = null;
            boolean z = true;
            while (z) {
                int m = d.m(serialDescriptor);
                if (m == -1) {
                    z = false;
                } else if (m == 0) {
                    fVar = (f) d.i(serialDescriptor, 0, f.a.a, fVar);
                    i |= 1;
                } else if (m == 1) {
                    fVar2 = (f) d.i(serialDescriptor, 1, f.a.a, fVar2);
                    i |= 2;
                } else if (m == 2) {
                    fVar3 = (f) d.i(serialDescriptor, 2, f.a.a, fVar3);
                    i |= 4;
                } else {
                    if (m != 3) {
                        throw new UnknownFieldException(m);
                    }
                    vkCellSkeleton$Middle$Size = (VkCellSkeleton$Middle$Size) d.y(serialDescriptor, 3, lazyArr[3].getValue(), vkCellSkeleton$Middle$Size);
                    i |= 8;
                }
            }
            d.e(serialDescriptor);
            return new e(i, fVar, fVar2, fVar3, vkCellSkeleton$Middle$Size);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            e eVar = (e) obj;
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = e.e;
            f.a aVar = f.a.a;
            f fVar = eVar.a;
            VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size = eVar.d;
            f fVar2 = eVar.c;
            f fVar3 = eVar.b;
            d.s(serialDescriptor, 0, aVar, fVar);
            if (d.z() || fVar3 != null) {
                d.s(serialDescriptor, 1, aVar, fVar3);
            }
            if (d.z() || fVar2 != null) {
                d.s(serialDescriptor, 2, aVar, fVar2);
            }
            if (d.z() || vkCellSkeleton$Middle$Size != VkCellSkeleton$Middle$Size.Medium) {
                d.n(serialDescriptor, 3, lazyArr[3].getValue(), vkCellSkeleton$Middle$Size);
            }
            d.e(serialDescriptor);
        }

        @Override // xsna.vht
        public final KSerializer<?>[] typeParametersSerializers() {
            return x1o0.c;
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    public static final class b {
        public final KSerializer<e> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ e(int i, f fVar, f fVar2, f fVar3, VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size) {
        if (1 != (i & 1)) {
            sp.x(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = fVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = fVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = fVar3;
        }
        if ((i & 8) == 0) {
            this.d = VkCellSkeleton$Middle$Size.Medium;
        } else {
            this.d = vkCellSkeleton$Middle$Size;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d;
    }

    public final int hashCode() {
        f fVar = this.a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.b;
        int hashCode2 = (hashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (fVar3 != null ? fVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DefaultMiddle(title=" + this.a + ", subtitle=" + this.b + ", extraSubtitle=" + this.c + ", size=" + this.d + ')';
    }

    public e(f fVar, f fVar2, f fVar3, VkCellSkeleton$Middle$Size vkCellSkeleton$Middle$Size) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
        this.d = vkCellSkeleton$Middle$Size;
    }

    public /* synthetic */ e(f fVar, f fVar2, int i) {
        this(fVar, (i & 2) != 0 ? null : fVar2, null, VkCellSkeleton$Middle$Size.Medium);
    }
}
