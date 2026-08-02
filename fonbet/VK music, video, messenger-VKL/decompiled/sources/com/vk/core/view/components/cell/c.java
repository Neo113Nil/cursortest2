package com.vk.core.view.components.cell;

import com.ironsource.X3;
import com.vk.core.view.components.cell.d;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.bpc0;
import xsna.cti;
import xsna.epx;
import xsna.eul0;
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
public final class c {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] c;
    public final VkCellSkeleton$Left$Main a;
    public final d b;

    /* compiled from: VkCellSkeleton.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<c> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.DefaultLeft", aVar, 2);
            xfb0Var.j(X3.i.Z, false);
            xfb0Var.j("extra", true);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = c.c;
            return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lazyArr[1].getValue())};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c.c;
            VkCellSkeleton$Left$Main vkCellSkeleton$Left$Main = null;
            boolean z = true;
            int i = 0;
            d dVar = null;
            while (z) {
                int m = d.m(serialDescriptor);
                if (m == -1) {
                    z = false;
                } else if (m == 0) {
                    vkCellSkeleton$Left$Main = (VkCellSkeleton$Left$Main) d.y(serialDescriptor, 0, lazyArr[0].getValue(), vkCellSkeleton$Left$Main);
                    i |= 1;
                } else {
                    if (m != 1) {
                        throw new UnknownFieldException(m);
                    }
                    dVar = (d) d.i(serialDescriptor, 1, lazyArr[1].getValue(), dVar);
                    i |= 2;
                }
            }
            d.e(serialDescriptor);
            return new c(i, vkCellSkeleton$Left$Main, dVar);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            c cVar = (c) obj;
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c.c;
            KSerializer<Object> value = lazyArr[0].getValue();
            VkCellSkeleton$Left$Main vkCellSkeleton$Left$Main = cVar.a;
            d dVar = cVar.b;
            d.n(serialDescriptor, 0, value, vkCellSkeleton$Left$Main);
            if (d.z() || dVar != null) {
                d.s(serialDescriptor, 1, lazyArr[1].getValue(), dVar);
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
        public final KSerializer<c> serializer() {
            return a.a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{msy.a(lazyThreadSafetyMode, new eul0(9)), msy.a(lazyThreadSafetyMode, new bpc0(9))};
    }

    public /* synthetic */ c(int i, VkCellSkeleton$Left$Main vkCellSkeleton$Left$Main, d dVar) {
        if (1 != (i & 1)) {
            sp.x(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = vkCellSkeleton$Left$Main;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = dVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "DefaultLeft(main=" + this.a + ", extra=" + this.b + ')';
    }

    public c(VkCellSkeleton$Left$Main vkCellSkeleton$Left$Main, d.b bVar) {
        this.a = vkCellSkeleton$Left$Main;
        this.b = bVar;
    }
}
