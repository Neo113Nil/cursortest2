package com.vk.core.view.components.cell;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.imi0;
import xsna.n9x;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* compiled from: VkCellSkeleton.kt */
@imi0
/* loaded from: classes17.dex */
public final class f {
    public static final b Companion = new b();
    public final String a;
    public final int b;
    public final int c;

    /* compiled from: VkCellSkeleton.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<f> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Middle.TextSkeletonParams", aVar, 3);
            xfb0Var.j("text", true);
            xfb0Var.j("linesCount", true);
            xfb0Var.j("singleLineWidth", true);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            n9x n9xVar = n9x.a;
            return new KSerializer[]{xn8.a(oqm0.a), n9xVar, n9xVar};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            String str = null;
            boolean z = true;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (z) {
                int m = d.m(serialDescriptor);
                if (m == -1) {
                    z = false;
                } else if (m == 0) {
                    str = (String) d.i(serialDescriptor, 0, oqm0.a, str);
                    i |= 1;
                } else if (m == 1) {
                    i2 = d.s(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (m != 2) {
                        throw new UnknownFieldException(m);
                    }
                    i3 = d.s(serialDescriptor, 2);
                    i |= 4;
                }
            }
            d.e(serialDescriptor);
            return new f(i, str, i2, i3);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            f fVar = (f) obj;
            int i = fVar.c;
            int i2 = fVar.b;
            String str = fVar.a;
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            b bVar = f.Companion;
            if (d.z() || str != null) {
                d.s(serialDescriptor, 0, oqm0.a, str);
            }
            if (d.z() || i2 != 1) {
                d.M(1, i2, serialDescriptor);
            }
            if (d.z() || i != 0) {
                d.M(2, i, serialDescriptor);
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
        public static f a(int i) {
            return new f(null, 1, i);
        }

        public static /* synthetic */ f b(b bVar) {
            bVar.getClass();
            return a(0);
        }

        public final KSerializer<f> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ f(int i, String str, int i2, int i3) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
    }

    public f(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
