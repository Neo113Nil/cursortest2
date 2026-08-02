package com.vk.core.view.components.cell;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.dcy;
import xsna.fpf0;
import xsna.imi0;
import xsna.ozl;
import xsna.slh0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* compiled from: VkCellSkeleton.kt */
@imi0
/* loaded from: classes17.dex */
public interface d {
    public static final a Companion = a.a;

    /* compiled from: VkCellSkeleton.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final KSerializer<d> serializer() {
            return new slh0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Extra", fpf0.a(d.class), new dcy[]{fpf0.a(b.class)}, new KSerializer[]{b.a.a}, new Annotation[0]);
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class b implements d {
        public static final C0835b Companion = new C0835b();

        /* compiled from: VkCellSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                descriptor = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Extra.Icon", aVar, 0);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[0];
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                int m = d.m(serialDescriptor);
                if (m != -1) {
                    throw new UnknownFieldException(m);
                }
                d.e(serialDescriptor);
                return new b();
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                C0835b c0835b = b.Companion;
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkCellSkeleton.kt */
        /* renamed from: com.vk.core.view.components.cell.d$b$b, reason: collision with other inner class name */
        public static final class C0835b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }
    }
}
