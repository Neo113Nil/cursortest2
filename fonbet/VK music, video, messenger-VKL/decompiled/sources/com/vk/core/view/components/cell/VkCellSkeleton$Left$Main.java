package com.vk.core.view.components.cell;

import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.asp;
import xsna.cti;
import xsna.cy20;
import xsna.dcy;
import xsna.e1m0;
import xsna.fpf0;
import xsna.imi0;
import xsna.kcc0;
import xsna.mqr;
import xsna.msy;
import xsna.ozl;
import xsna.slh0;
import xsna.sp;
import xsna.ssi;
import xsna.vht;
import xsna.w0o0;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xq;
import xsna.zrp;

/* compiled from: VkCellSkeleton.kt */
@imi0
/* loaded from: classes17.dex */
public interface VkCellSkeleton$Left$Main {
    public static final c Companion = c.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final a Companion;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        /* compiled from: VkCellSkeleton.kt */
        public static final class a {
            public final KSerializer<Size> serializer() {
                return (KSerializer) Size.$cachedSerializer$delegate.getValue();
            }
        }

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Large", 2);
            Large = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
            Companion = new a();
            $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new w0o0(10));
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class a implements VkCellSkeleton$Left$Main {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] b = {msy.a(LazyThreadSafetyMode.PUBLICATION, new kcc0(11))};
        public final Size a;

        /* compiled from: VkCellSkeleton.kt */
        @ozl
        /* renamed from: com.vk.core.view.components.cell.VkCellSkeleton$Left$Main$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0833a implements vht<a> {
            public static final C0833a a;
            private static final SerialDescriptor descriptor;

            static {
                C0833a c0833a = new C0833a();
                a = c0833a;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Main.Avatar", c0833a, 1);
                xfb0Var.j("size", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{a.b[0].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = a.b;
                Size size = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else {
                        if (m != 0) {
                            throw new UnknownFieldException(m);
                        }
                        size = (Size) d.y(serialDescriptor, 0, lazyArr[0].getValue(), size);
                        i = 1;
                    }
                }
                d.e(serialDescriptor);
                return new a(i, size);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.n(serialDescriptor, 0, a.b[0].getValue(), ((a) obj).a);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkCellSkeleton.kt */
        public static final class b {
            public final KSerializer<a> serializer() {
                return C0833a.a;
            }
        }

        public /* synthetic */ a(int i, Size size) {
            if (1 == (i & 1)) {
                this.a = size;
            } else {
                sp.x(i, 1, C0833a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Avatar(size=" + this.a + ')';
        }

        public a(Size size) {
            this.a = size;
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class b implements VkCellSkeleton$Left$Main {
        public static final C0834b Companion = new C0834b();
        public final float a;
        public final float b;

        /* compiled from: VkCellSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Main.Block", aVar, 2);
                xfb0Var.j("widthDp", false);
                xfb0Var.j("heightDp", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                mqr mqrVar = mqr.a;
                return new KSerializer[]{mqrVar, mqrVar};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                boolean z = true;
                int i = 0;
                float f2 = 0.0f;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else if (m == 0) {
                        f = d.n(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (m != 1) {
                            throw new UnknownFieldException(m);
                        }
                        f2 = d.n(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                d.e(serialDescriptor);
                return new b(f, f2, i);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.w(serialDescriptor, 0, bVar.a);
                d.w(serialDescriptor, 1, bVar.b);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkCellSkeleton.kt */
        /* renamed from: com.vk.core.view.components.cell.VkCellSkeleton$Left$Main$b$b, reason: collision with other inner class name */
        public static final class C0834b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(float f, float f2, int i) {
            if (3 != (i & 3)) {
                sp.x(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Block(widthDp=");
            sb.append(this.a);
            sb.append(", heightDp=");
            return xq.c(')', this.b, sb);
        }

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    public static final class c {
        public static final /* synthetic */ c a = new c();

        public final KSerializer<VkCellSkeleton$Left$Main> serializer() {
            return new slh0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Main", fpf0.a(VkCellSkeleton$Left$Main.class), new dcy[]{fpf0.a(a.class), fpf0.a(b.class), fpf0.a(d.class), fpf0.a(e.class)}, new KSerializer[]{a.C0833a.a, b.a.a, d.a.a, e.a.a}, new Annotation[0]);
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class d implements VkCellSkeleton$Left$Main {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] b = {msy.a(LazyThreadSafetyMode.PUBLICATION, new cy20(24))};
        public final Size a;

        /* compiled from: VkCellSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Main.Icon", aVar, 1);
                xfb0Var.j("size", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{d.b[0].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.b;
                Size size = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else {
                        if (m != 0) {
                            throw new UnknownFieldException(m);
                        }
                        size = (Size) d.y(serialDescriptor, 0, lazyArr[0].getValue(), size);
                        i = 1;
                    }
                }
                d.e(serialDescriptor);
                return new d(i, size);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.n(serialDescriptor, 0, d.b[0].getValue(), ((d) obj).a);
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkCellSkeleton.kt */
        public static final class b {
            public final KSerializer<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, Size size) {
            if (1 == (i & 1)) {
                this.a = size;
            } else {
                sp.x(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Icon(size=" + this.a + ')';
        }

        public d(Size size) {
            this.a = size;
        }
    }

    /* compiled from: VkCellSkeleton.kt */
    @imi0
    public static final class e implements VkCellSkeleton$Left$Main {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] b = {msy.a(LazyThreadSafetyMode.PUBLICATION, new e1m0(14))};
        public final Size a;

        /* compiled from: VkCellSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<e> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCellSkeleton.Left.Main.Picture", aVar, 1);
                xfb0Var.j("size", false);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{e.b[0].getValue()};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.b;
                Size size = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else {
                        if (m != 0) {
                            throw new UnknownFieldException(m);
                        }
                        size = (Size) d.y(serialDescriptor, 0, lazyArr[0].getValue(), size);
                        i = 1;
                    }
                }
                d.e(serialDescriptor);
                return new e(i, size);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                d.n(serialDescriptor, 0, e.b[0].getValue(), ((e) obj).a);
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

        public /* synthetic */ e(int i, Size size) {
            if (1 == (i & 1)) {
                this.a = size;
            } else {
                sp.x(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Picture(size=" + this.a + ')';
        }

        public e(Size size) {
            this.a = size;
        }
    }
}
