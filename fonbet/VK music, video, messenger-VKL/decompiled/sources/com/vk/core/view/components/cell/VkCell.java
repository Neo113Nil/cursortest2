package com.vk.core.view.components.cell;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.vk.core.tool.view.AdaptiveHorizontalLinearLayout;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.h;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import defpackage.q0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.a7p0;
import xsna.a8j0;
import xsna.aju0;
import xsna.ap80;
import xsna.asp;
import xsna.bpc0;
import xsna.bt;
import xsna.buc0;
import xsna.bzq0;
import xsna.cti;
import xsna.cy20;
import xsna.daz;
import xsna.dcy;
import xsna.dgc0;
import xsna.dko;
import xsna.dqm0;
import xsna.e1m0;
import xsna.e3c0;
import xsna.e6k0;
import xsna.epx;
import xsna.eul0;
import xsna.f7q0;
import xsna.f84;
import xsna.fd90;
import xsna.fiu0;
import xsna.fog0;
import xsna.fpf0;
import xsna.g0s0;
import xsna.g18;
import xsna.g9l0;
import xsna.gko;
import xsna.gos0;
import xsna.gwd0;
import xsna.gzr0;
import xsna.gzs;
import xsna.hbh0;
import xsna.hyd0;
import xsna.ia90;
import xsna.im80;
import xsna.imi0;
import xsna.iud0;
import xsna.izs;
import xsna.j1t0;
import xsna.j5g;
import xsna.jo60;
import xsna.jql0;
import xsna.k1u0;
import xsna.k5f0;
import xsna.kcc0;
import xsna.kg;
import xsna.ko60;
import xsna.ku70;
import xsna.kud0;
import xsna.la0;
import xsna.lly;
import xsna.ltb0;
import xsna.msy;
import xsna.n9x;
import xsna.nof0;
import xsna.nyk0;
import xsna.o2a0;
import xsna.ozl;
import xsna.pdh0;
import xsna.pkd0;
import xsna.q0s0;
import xsna.qbe0;
import xsna.qdh0;
import xsna.qmj0;
import xsna.qoy;
import xsna.qqf0;
import xsna.qub0;
import xsna.rcs0;
import xsna.rjg0;
import xsna.s3q0;
import xsna.s7c0;
import xsna.sf3;
import xsna.shy;
import xsna.slh0;
import xsna.sp;
import xsna.sqf0;
import xsna.ssi;
import xsna.t970;
import xsna.ta50;
import xsna.tlo0;
import xsna.tqf0;
import xsna.uf3;
import xsna.up;
import xsna.uqi;
import xsna.uv80;
import xsna.vht;
import xsna.vhu0;
import xsna.vq6;
import xsna.vqf0;
import xsna.vxl0;
import xsna.w0o0;
import xsna.w5k0;
import xsna.wqf0;
import xsna.wzs;
import xsna.x1c0;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xiu0;
import xsna.xk70;
import xsna.xn8;
import xsna.xqf0;
import xsna.xqi0;
import xsna.y8p0;
import xsna.yjt0;
import xsna.yo80;
import xsna.z0h0;
import xsna.zo80;
import xsna.zpt0;
import xsna.zqf0;
import xsna.zrp;

/* compiled from: VkCell.kt */
/* loaded from: classes17.dex */
public class VkCell extends FrameLayout {
    public Left.b b;
    public Right.d c;
    public Middle.b d;
    public final h e;
    public a f;
    public b g;
    public c h;
    public List<? extends Slot<?>> i;
    public List<? extends Slot<?>> j;
    public List<? extends Slot<?>> k;
    public Slot.Align l;
    public Slot.Size m;

    /* compiled from: VkCell.kt */
    @imi0
    public interface Left {
        public static final a Companion = a.a;

        /* compiled from: VkCell.kt */
        @imi0
        public interface Main extends Left {
            public static final b Companion = b.a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkCell.kt */
            @imi0
            public static final class Size {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Size[] $VALUES;
                private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
                public static final a Companion;

                @ozl
                public static final Size ExtraSmall;
                public static final Size Large;
                public static final Size Medium;
                public static final Size Small;

                /* compiled from: VkCell.kt */
                public static final class a {
                    public final KSerializer<Size> serializer() {
                        return (KSerializer) Size.$cachedSerializer$delegate.getValue();
                    }
                }

                /* compiled from: VkCell.kt */
                public static final /* synthetic */ class b {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Size.values().length];
                        try {
                            iArr[Size.ExtraSmall.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Size.Small.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Size.Medium.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Size.Large.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                static {
                    Size size = new Size("ExtraSmall", 0);
                    ExtraSmall = size;
                    Size size2 = new Size("Small", 1);
                    Small = size2;
                    Size size3 = new Size("Medium", 2);
                    Medium = size3;
                    Size size4 = new Size("Large", 3);
                    Large = size4;
                    Size[] sizeArr = {size, size2, size3, size4};
                    $VALUES = sizeArr;
                    $ENTRIES = new asp(sizeArr);
                    Companion = new a();
                    $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new w5k0(10));
                }

                public Size() {
                    throw null;
                }

                public static zrp<Size> i() {
                    return $ENTRIES;
                }

                public static Size valueOf(String str) {
                    return (Size) Enum.valueOf(Size.class, str);
                }

                public static Size[] values() {
                    return (Size[]) $VALUES.clone();
                }

                public final int j() {
                    int i = b.$EnumSwitchMapping$0[ordinal()];
                    if (i == 1) {
                        return 28;
                    }
                    if (i == 2) {
                        return 40;
                    }
                    if (i == 3) {
                        return 48;
                    }
                    if (i == 4) {
                        return 72;
                    }
                    throw new NoWhenBranchMatchedException();
                }

                public final int k(Context context) {
                    return hbh0.b(j(), context);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class a implements Main {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] d;
                public final f a;
                public final int b;
                public final izs<Rect, s3q0> c;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Left$Main$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0809a implements vht<a> {
                    public static final C0809a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0809a c0809a = new C0809a();
                        a = c0809a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Main.Avatar", c0809a, 3);
                        xfb0Var.j("avatar", false);
                        xfb0Var.j("sizeDp", false);
                        xfb0Var.j("onBoundsChange", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = a.d;
                        return new KSerializer[]{lazyArr[0].getValue(), n9x.a, xn8.a(lazyArr[2].getValue())};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = a.d;
                        f fVar = null;
                        boolean z = true;
                        int i = 0;
                        int i2 = 0;
                        izs izsVar = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                i |= 1;
                            } else if (m == 1) {
                                i2 = d.s(serialDescriptor, 1);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                izsVar = (izs) d.i(serialDescriptor, 2, lazyArr[2].getValue(), izsVar);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new a(i, fVar, i2, izsVar);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        a aVar = (a) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = a.d;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        f fVar = aVar.a;
                        izs<Rect, s3q0> izsVar = aVar.c;
                        d.n(serialDescriptor, 0, value, fVar);
                        d.M(1, aVar.b, serialDescriptor);
                        if (d.z() || izsVar != null) {
                            d.s(serialDescriptor, 2, lazyArr[2].getValue(), izsVar);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<a> serializer() {
                        return C0809a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    d = new Lazy[]{msy.a(lazyThreadSafetyMode, new g9l0(8)), null, msy.a(lazyThreadSafetyMode, new a7p0(5))};
                }

                public a() {
                    throw null;
                }

                public /* synthetic */ a(int i, f fVar, int i2, izs izsVar) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, C0809a.a.getDescriptor());
                        throw null;
                    }
                    this.a = fVar;
                    this.b = i2;
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = izsVar;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
                }

                public final int hashCode() {
                    int a = shy.a(this.b, this.a.hashCode() * 31, 31);
                    izs<Rect, s3q0> izsVar = this.c;
                    return a + (izsVar == null ? 0 : izsVar.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Avatar(avatar=");
                    sb.append(this.a);
                    sb.append(", sizeDp=");
                    sb.append(this.b);
                    sb.append(", onBoundsChange=");
                    return up.c(sb, this.c, ')');
                }

                public a(f fVar, int i) {
                    this.a = fVar;
                    this.b = i;
                    this.c = null;
                }

                public a(f fVar, Size size) {
                    this(fVar, size.j());
                }
            }

            /* compiled from: VkCell.kt */
            public static final class b {
                public static final /* synthetic */ b a = new b();

                public final KSerializer<Main> serializer() {
                    return new slh0("com.vk.core.view.components.cell.VkCell.Left.Main", fpf0.a(Main.class), new dcy[]{fpf0.a(a.class), fpf0.a(c.class), fpf0.a(d.class), fpf0.a(e.class)}, new KSerializer[]{a.C0809a.a, c.a.a, d.a.a, e.a.a}, new Annotation[0]);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class d implements Main {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] c;
                public final f a;
                public final Size b;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<d> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Main.Picture", aVar, 2);
                        xfb0Var.j("image", false);
                        xfb0Var.j("size", false);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        f fVar = null;
                        boolean z = true;
                        int i = 0;
                        Size size = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                i |= 1;
                            } else {
                                if (m != 1) {
                                    throw new UnknownFieldException(m);
                                }
                                size = (Size) d.y(serialDescriptor, 1, lazyArr[1].getValue(), size);
                                i |= 2;
                            }
                        }
                        d.e(serialDescriptor);
                        return new d(i, fVar, size);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        d dVar = (d) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        d.n(serialDescriptor, 0, lazyArr[0].getValue(), dVar.a);
                        d.n(serialDescriptor, 1, lazyArr[1].getValue(), dVar.b);
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<d> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    c = new Lazy[]{msy.a(lazyThreadSafetyMode, new g0s0(2)), msy.a(lazyThreadSafetyMode, new y8p0(3))};
                }

                public /* synthetic */ d(int i, f fVar, Size size) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = fVar;
                    this.b = size;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && this.b == dVar.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Picture(image=" + this.a + ", size=" + this.b + ')';
                }

                public d(f fVar, Size size) {
                    this.a = fVar;
                    this.b = size;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class e implements Main {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] c;
                public final f a;
                public final android.util.Size b;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<e> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Main.View", aVar, 2);
                        xfb0Var.j("params", false);
                        xfb0Var.j("contentSize", false);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        f fVar = null;
                        boolean z = true;
                        int i = 0;
                        android.util.Size size = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                i |= 1;
                            } else {
                                if (m != 1) {
                                    throw new UnknownFieldException(m);
                                }
                                size = (android.util.Size) d.y(serialDescriptor, 1, lazyArr[1].getValue(), size);
                                i |= 2;
                            }
                        }
                        d.e(serialDescriptor);
                        return new e(i, fVar, size);
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
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        d.n(serialDescriptor, 0, lazyArr[0].getValue(), eVar.a);
                        d.n(serialDescriptor, 1, lazyArr[1].getValue(), eVar.b);
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<e> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    c = new Lazy[]{msy.a(lazyThreadSafetyMode, new a8j0(11)), msy.a(lazyThreadSafetyMode, new sqf0(14))};
                }

                public /* synthetic */ e(int i, f fVar, android.util.Size size) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = fVar;
                    this.b = size;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "View(params=" + this.a + ", contentSize=" + this.b + ')';
                }

                public e(f fVar, android.util.Size size) {
                    this.a = fVar;
                    this.b = size;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class c implements Main {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] e;
                public final dko a;
                public final Size b;
                public final k1u0 c;
                public final tlo0 d;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<c> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Main.Icon", aVar, 4);
                        xfb0Var.j("icon", false);
                        xfb0Var.j("size", false);
                        xfb0Var.j("iconTint", true);
                        xfb0Var.j("iconDescription", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), xn8.a(lazyArr[3].getValue())};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        int i = 0;
                        dko dkoVar = null;
                        Size size = null;
                        k1u0 k1u0Var = null;
                        tlo0 tlo0Var = null;
                        boolean z = true;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                i |= 1;
                            } else if (m == 1) {
                                size = (Size) d.y(serialDescriptor, 1, lazyArr[1].getValue(), size);
                                i |= 2;
                            } else if (m == 2) {
                                k1u0Var = (k1u0) d.y(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                                i |= 4;
                            } else {
                                if (m != 3) {
                                    throw new UnknownFieldException(m);
                                }
                                tlo0Var = (tlo0) d.i(serialDescriptor, 3, lazyArr[3].getValue(), tlo0Var);
                                i |= 8;
                            }
                        }
                        d.e(serialDescriptor);
                        return new c(i, dkoVar, size, k1u0Var, tlo0Var);
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
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        dko dkoVar = cVar.a;
                        tlo0 tlo0Var = cVar.d;
                        k1u0 k1u0Var = cVar.c;
                        d.n(serialDescriptor, 0, value, dkoVar);
                        d.n(serialDescriptor, 1, lazyArr[1].getValue(), cVar.b);
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                        }
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 3, lazyArr[3].getValue(), tlo0Var);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<c> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    int i = 6;
                    e = new Lazy[]{msy.a(lazyThreadSafetyMode, new qmj0(i)), msy.a(lazyThreadSafetyMode, new pdh0(7)), msy.a(lazyThreadSafetyMode, new qdh0(6)), msy.a(lazyThreadSafetyMode, new qqf0(i))};
                }

                public c(int i, Size size, k1u0 k1u0Var, tlo0 tlo0Var) {
                    this(new gko(i), size, k1u0Var, tlo0Var);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
                }

                public final int hashCode() {
                    int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
                    tlo0 tlo0Var = this.d;
                    return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Icon(icon=");
                    sb.append(this.a);
                    sb.append(", size=");
                    sb.append(this.b);
                    sb.append(", iconTint=");
                    sb.append(this.c);
                    sb.append(", iconDescription=");
                    return bt.a(sb, this.d, ')');
                }

                public /* synthetic */ c(int i, dko dkoVar, Size size, k1u0 k1u0Var, tlo0 tlo0Var) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = dkoVar;
                    this.b = size;
                    if ((i & 4) == 0) {
                        this.c = k1u0.b.a;
                    } else {
                        this.c = k1u0Var;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = tlo0Var;
                    }
                }

                public c(dko dkoVar, Size size, k1u0 k1u0Var, tlo0 tlo0Var) {
                    this.a = dkoVar;
                    this.b = size;
                    this.c = k1u0Var;
                    this.d = tlo0Var;
                }

                public /* synthetic */ c(dko dkoVar, Size size, k1u0 k1u0Var, int i) {
                    this(dkoVar, size, (i & 4) != 0 ? k1u0.b.a : k1u0Var, (tlo0) null);
                }

                public /* synthetic */ c(int i, Size size, k1u0 k1u0Var, tlo0.h hVar, int i2) {
                    this(i, size, (i2 & 4) != 0 ? k1u0.b.a : k1u0Var, (i2 & 8) != 0 ? null : hVar);
                }
            }
        }

        /* compiled from: VkCell.kt */
        public static final class a {
            public static final /* synthetic */ a a = new a();

            public static b a(a aVar, Main main) {
                aVar.getClass();
                return new b(main, null);
            }

            public final KSerializer<Left> serializer() {
                return new slh0("com.vk.core.view.components.cell.VkCell.Left", fpf0.a(Left.class), new dcy[]{fpf0.a(b.class), fpf0.a(Main.a.class), fpf0.a(Main.c.class), fpf0.a(Main.d.class), fpf0.a(Main.e.class)}, new KSerializer[]{b.a.a, Main.a.C0809a.a, Main.c.a.a, Main.d.a.a, Main.e.a.a}, new Annotation[0]);
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class b implements Left {
            public static final C0810b Companion = new C0810b();
            public static final Lazy<KSerializer<Object>>[] c;
            public final Main a;
            public final c b;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<b> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.DefaultLeft", aVar, 2);
                    xfb0Var.j(X3.i.Z, false);
                    xfb0Var.j("extra", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = b.c;
                    return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lazyArr[1].getValue())};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.c;
                    Main main = null;
                    boolean z = true;
                    int i = 0;
                    c cVar = null;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            main = (Main) d.y(serialDescriptor, 0, lazyArr[0].getValue(), main);
                            i |= 1;
                        } else {
                            if (m != 1) {
                                throw new UnknownFieldException(m);
                            }
                            cVar = (c) d.i(serialDescriptor, 1, lazyArr[1].getValue(), cVar);
                            i |= 2;
                        }
                    }
                    d.e(serialDescriptor);
                    return new b(i, main, cVar);
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
                    Lazy<KSerializer<Object>>[] lazyArr = b.c;
                    KSerializer<Object> value = lazyArr[0].getValue();
                    Main main = bVar.a;
                    c cVar = bVar.b;
                    d.n(serialDescriptor, 0, value, main);
                    if (d.z() || cVar != null) {
                        d.s(serialDescriptor, 1, lazyArr[1].getValue(), cVar);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            /* renamed from: com.vk.core.view.components.cell.VkCell$Left$b$b, reason: collision with other inner class name */
            public static final class C0810b {
                public final KSerializer<b> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                c = new Lazy[]{msy.a(lazyThreadSafetyMode, new la0(27)), msy.a(lazyThreadSafetyMode, new vxl0(6))};
            }

            public /* synthetic */ b(int i, Main main, c cVar) {
                if (1 != (i & 1)) {
                    sp.x(i, 1, a.a.getDescriptor());
                    throw null;
                }
                this.a = main;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = cVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                c cVar = this.b;
                return hashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public final String toString() {
                return "DefaultLeft(main=" + this.a + ", extra=" + this.b + ')';
            }

            public b(Main main, c cVar) {
                this.a = main;
                this.b = cVar;
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public interface c {
            public static final C0813c Companion = C0813c.a;

            /* compiled from: VkCell.kt */
            @imi0
            public static final class a implements c {
                public static final b Companion = new b();
                public final boolean a;
                public final gzs<s3q0> b;
                public final boolean c;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Left$c$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0811a implements vht<a> {
                    public static final C0811a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0811a c0811a = new C0811a();
                        a = c0811a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Extra.Check", c0811a, 3);
                        xfb0Var.j("checked", false);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("enabled", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        KSerializer<?> a2 = xn8.a(lly.a);
                        g18 g18Var = g18.a;
                        return new KSerializer[]{g18Var, a2, g18Var};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        gzs gzsVar = null;
                        boolean z = true;
                        int i = 0;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                z2 = d.F(serialDescriptor, 0);
                                i |= 1;
                            } else if (m == 1) {
                                gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                z3 = d.F(serialDescriptor, 2);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new a(i, gzsVar, z2, z3);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        a aVar = (a) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        boolean z = aVar.a;
                        boolean z2 = aVar.c;
                        gzs<s3q0> gzsVar = aVar.b;
                        d.l(serialDescriptor, 0, z);
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 1, lly.a, gzsVar);
                        }
                        if (d.z() || !z2) {
                            d.l(serialDescriptor, 2, z2);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<a> serializer() {
                        return C0811a.a;
                    }
                }

                public /* synthetic */ a(int i, gzs gzsVar, boolean z, boolean z2) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, C0811a.a.getDescriptor());
                        throw null;
                    }
                    this.a = z;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = gzsVar;
                    }
                    if ((i & 4) == 0) {
                        this.c = true;
                    } else {
                        this.c = z2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.a) * 31;
                    gzs<s3q0> gzsVar = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Check(checked=");
                    sb.append(this.a);
                    sb.append(", onClick=");
                    sb.append(this.b);
                    sb.append(", enabled=");
                    return q0.a(sb, this.c, ')');
                }

                public /* synthetic */ a(int i, gzs gzsVar, boolean z) {
                    this((i & 2) != 0 ? null : gzsVar, z, true);
                }

                public a(gzs gzsVar, boolean z, boolean z2) {
                    this.a = z;
                    this.b = gzsVar;
                    this.c = z2;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class b implements c {
                public static final C0812b Companion = new C0812b();
                public static final Lazy<KSerializer<Object>>[] d;
                public final gzs<s3q0> a;
                public final tlo0 b;
                public final k1u0 c;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<b> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Extra.Close", aVar, 3);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("contentDescription", true);
                        xfb0Var.j("iconTint", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = b.d;
                        return new KSerializer[]{xn8.a(lly.a), xn8.a(lazyArr[1].getValue()), lazyArr[2].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = b.d;
                        gzs gzsVar = null;
                        boolean z = true;
                        int i = 0;
                        tlo0 tlo0Var = null;
                        k1u0 k1u0Var = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                gzsVar = (gzs) d.i(serialDescriptor, 0, lly.a, gzsVar);
                                i |= 1;
                            } else if (m == 1) {
                                tlo0Var = (tlo0) d.i(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                k1u0Var = (k1u0) d.y(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new b(i, gzsVar, tlo0Var, k1u0Var);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        b bVar = (b) obj;
                        k1u0 k1u0Var = bVar.c;
                        tlo0 tlo0Var = bVar.b;
                        gzs<s3q0> gzsVar = bVar.a;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = b.d;
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 0, lly.a, gzsVar);
                        }
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                        }
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                /* renamed from: com.vk.core.view.components.cell.VkCell$Left$c$b$b, reason: collision with other inner class name */
                public static final class C0812b {
                    public final KSerializer<b> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    d = new Lazy[]{null, msy.a(lazyThreadSafetyMode, new f84(28)), msy.a(lazyThreadSafetyMode, new bzq0(3))};
                }

                public b() {
                    this(null, null, 7);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    tlo0 tlo0Var = this.b;
                    return this.c.hashCode() + ((hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    return "Close(onClick=" + this.a + ", contentDescription=" + this.b + ", iconTint=" + this.c + ')';
                }

                public /* synthetic */ b(int i, gzs gzsVar, tlo0 tlo0Var, k1u0 k1u0Var) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = gzsVar;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = tlo0Var;
                    }
                    if ((i & 4) == 0) {
                        this.c = k1u0.b.a;
                    } else {
                        this.c = k1u0Var;
                    }
                }

                public b(vq6 vq6Var, k1u0.a aVar, int i) {
                    vq6Var = (i & 1) != 0 ? null : vq6Var;
                    k1u0 k1u0Var = (i & 4) != 0 ? k1u0.b.a : aVar;
                    this.a = vq6Var;
                    this.b = null;
                    this.c = k1u0Var;
                }
            }

            /* compiled from: VkCell.kt */
            /* renamed from: com.vk.core.view.components.cell.VkCell$Left$c$c, reason: collision with other inner class name */
            public static final class C0813c {
                public static final /* synthetic */ C0813c a = new C0813c();

                public final KSerializer<c> serializer() {
                    return new slh0("com.vk.core.view.components.cell.VkCell.Left.Extra", fpf0.a(c.class), new dcy[]{fpf0.a(a.class), fpf0.a(b.class), fpf0.a(d.class)}, new KSerializer[]{a.C0811a.a, b.a.a, d.a.a}, new Annotation[0]);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class d implements c {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] f;
                public final dko a;
                public final k1u0 b;
                public final Size c;
                public final gzs<s3q0> d;
                public final tlo0 e;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<d> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Left.Extra.Icon", aVar, 5);
                        xfb0Var.j("icon", false);
                        xfb0Var.j("iconTint", true);
                        xfb0Var.j("iconSize", true);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("iconDescription", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = d.f;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), xn8.a(lazyArr[2].getValue()), xn8.a(lly.a), xn8.a(lazyArr[4].getValue())};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.f;
                        int i = 0;
                        dko dkoVar = null;
                        k1u0 k1u0Var = null;
                        Size size = null;
                        gzs gzsVar = null;
                        tlo0 tlo0Var = null;
                        boolean z = true;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                i |= 1;
                            } else if (m == 1) {
                                k1u0Var = (k1u0) d.y(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                                i |= 2;
                            } else if (m == 2) {
                                size = (Size) d.i(serialDescriptor, 2, lazyArr[2].getValue(), size);
                                i |= 4;
                            } else if (m == 3) {
                                gzsVar = (gzs) d.i(serialDescriptor, 3, lly.a, gzsVar);
                                i |= 8;
                            } else {
                                if (m != 4) {
                                    throw new UnknownFieldException(m);
                                }
                                tlo0Var = (tlo0) d.i(serialDescriptor, 4, lazyArr[4].getValue(), tlo0Var);
                                i |= 16;
                            }
                        }
                        d.e(serialDescriptor);
                        return new d(i, dkoVar, k1u0Var, size, gzsVar, tlo0Var);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        d dVar = (d) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.f;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        dko dkoVar = dVar.a;
                        tlo0 tlo0Var = dVar.e;
                        gzs<s3q0> gzsVar = dVar.d;
                        Size size = dVar.c;
                        k1u0 k1u0Var = dVar.b;
                        d.n(serialDescriptor, 0, value, dkoVar);
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                        }
                        if (d.z() || size != null) {
                            d.s(serialDescriptor, 2, lazyArr[2].getValue(), size);
                        }
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 3, lly.a, gzsVar);
                        }
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 4, lazyArr[4].getValue(), tlo0Var);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<d> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    f = new Lazy[]{msy.a(lazyThreadSafetyMode, new hyd0(9)), msy.a(lazyThreadSafetyMode, new im80(14)), msy.a(lazyThreadSafetyMode, new buc0(19)), null, msy.a(lazyThreadSafetyMode, new ta50(22))};
                }

                public d() {
                    throw null;
                }

                public /* synthetic */ d(int i, dko dkoVar, k1u0 k1u0Var, Size size, gzs gzsVar, tlo0 tlo0Var) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = dkoVar;
                    if ((i & 2) == 0) {
                        this.b = k1u0.b.a;
                    } else {
                        this.b = k1u0Var;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = size;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = gzsVar;
                    }
                    if ((i & 16) == 0) {
                        this.e = null;
                    } else {
                        this.e = tlo0Var;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
                }

                public final int hashCode() {
                    int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                    Size size = this.c;
                    int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
                    gzs<s3q0> gzsVar = this.d;
                    int hashCode3 = (hashCode2 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                    tlo0 tlo0Var = this.e;
                    return hashCode3 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Icon(icon=");
                    sb.append(this.a);
                    sb.append(", iconTint=");
                    sb.append(this.b);
                    sb.append(", iconSize=");
                    sb.append(this.c);
                    sb.append(", onClick=");
                    sb.append(this.d);
                    sb.append(", iconDescription=");
                    return bt.a(sb, this.e, ')');
                }

                public d(gko gkoVar) {
                    k1u0.b bVar = k1u0.b.a;
                    this.a = gkoVar;
                    this.b = bVar;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                }
            }
        }
    }

    /* compiled from: VkCell.kt */
    @imi0
    public interface Middle {
        public static final a Companion = a.a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkCell.kt */
        @imi0
        public static final class Size {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final a Companion;
            public static final Size Large;
            public static final Size Medium;

            /* compiled from: VkCell.kt */
            public static final class a {
                public final KSerializer<Size> serializer() {
                    return (KSerializer) Size.$cachedSerializer$delegate.getValue();
                }
            }

            static {
                Size size = new Size("Medium", 0);
                Medium = size;
                Size size2 = new Size("Large", 1);
                Large = size2;
                Size[] sizeArr = {size, size2};
                $VALUES = sizeArr;
                $ENTRIES = new asp(sizeArr);
                Companion = new a();
                $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new eul0(8));
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

        /* compiled from: VkCell.kt */
        public static final class a {
            public static final /* synthetic */ a a = new a();

            public static b a(a aVar, e eVar, d dVar, c cVar, int i) {
                if ((i & 1) != 0) {
                    eVar = null;
                }
                if ((i & 2) != 0) {
                    dVar = null;
                }
                if ((i & 4) != 0) {
                    cVar = null;
                }
                Size size = Size.Medium;
                aVar.getClass();
                return new b(eVar, dVar, cVar, size);
            }

            public final KSerializer<Middle> serializer() {
                return new slh0("com.vk.core.view.components.cell.VkCell.Middle", fpf0.a(Middle.class), new dcy[]{fpf0.a(b.class)}, new KSerializer[]{b.a.a}, new Annotation[0]);
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class b implements Middle {
            public static final C0814b Companion = new C0814b();
            public static final Lazy<KSerializer<Object>>[] e = {null, null, null, msy.a(LazyThreadSafetyMode.PUBLICATION, new q0s0(4))};
            public final e a;
            public final d b;
            public final c c;
            public final Size d;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<b> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.DefaultMiddle", aVar, 4);
                    xfb0Var.j("title", true);
                    xfb0Var.j("subtitle", true);
                    xfb0Var.j("extraSubtitle", true);
                    xfb0Var.j("size", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{xn8.a(e.a.a), xn8.a(d.a.a), xn8.a(c.a.a), b.e[3].getValue()};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.e;
                    int i = 0;
                    e eVar = null;
                    d dVar = null;
                    c cVar = null;
                    Size size = null;
                    boolean z = true;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            eVar = (e) d.i(serialDescriptor, 0, e.a.a, eVar);
                            i |= 1;
                        } else if (m == 1) {
                            dVar = (d) d.i(serialDescriptor, 1, d.a.a, dVar);
                            i |= 2;
                        } else if (m == 2) {
                            cVar = (c) d.i(serialDescriptor, 2, c.a.a, cVar);
                            i |= 4;
                        } else {
                            if (m != 3) {
                                throw new UnknownFieldException(m);
                            }
                            size = (Size) d.y(serialDescriptor, 3, lazyArr[3].getValue(), size);
                            i |= 8;
                        }
                    }
                    d.e(serialDescriptor);
                    return new b(i, eVar, dVar, cVar, size);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    b bVar = (b) obj;
                    Size size = bVar.d;
                    c cVar = bVar.c;
                    d dVar = bVar.b;
                    e eVar = bVar.a;
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.e;
                    if (d.z() || eVar != null) {
                        d.s(serialDescriptor, 0, e.a.a, eVar);
                    }
                    if (d.z() || dVar != null) {
                        d.s(serialDescriptor, 1, d.a.a, dVar);
                    }
                    if (d.z() || cVar != null) {
                        d.s(serialDescriptor, 2, c.a.a, cVar);
                    }
                    if (d.z() || size != Size.Medium) {
                        d.n(serialDescriptor, 3, lazyArr[3].getValue(), size);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$b$b, reason: collision with other inner class name */
            public static final class C0814b {
                public final KSerializer<b> serializer() {
                    return a.a;
                }
            }

            public b() {
                this((e) null, (d) null, (c) null, (Size) null, 15);
            }

            public static b a(b bVar, e eVar) {
                return new b(eVar, bVar.b, bVar.c, bVar.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                e eVar = this.a;
                int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
                d dVar = this.b;
                int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                c cVar = this.c;
                return this.d.hashCode() + ((hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "DefaultMiddle(title=" + this.a + ", subtitle=" + this.b + ", extraSubtitle=" + this.c + ", size=" + this.d + ')';
            }

            public /* synthetic */ b(int i, e eVar, d dVar, c cVar, Size size) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = eVar;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = dVar;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = cVar;
                }
                if ((i & 8) == 0) {
                    this.d = Size.Medium;
                } else {
                    this.d = size;
                }
            }

            public b(e eVar, d dVar, c cVar, Size size) {
                this.a = eVar;
                this.b = dVar;
                this.c = cVar;
                this.d = size;
            }

            public /* synthetic */ b(e eVar, d dVar, c cVar, Size size, int i) {
                this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? Size.Medium : size);
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class c {
            public static final b Companion = new b();
            public static final Lazy<KSerializer<Object>>[] e;
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final int c;
            public final TextUtils.TruncateAt d;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<c> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.ExtraSubtitle", aVar, 4);
                    xfb0Var.j("extraSubtitle", false);
                    xfb0Var.j("onClick", true);
                    xfb0Var.j("maxLines", true);
                    xfb0Var.j("overflow", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = c.e;
                    return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lly.a), n9x.a, xn8.a(lazyArr[3].getValue())};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = c.e;
                    int i = 0;
                    int i2 = 0;
                    tlo0 tlo0Var = null;
                    gzs gzsVar = null;
                    TextUtils.TruncateAt truncateAt = null;
                    boolean z = true;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            tlo0Var = (tlo0) d.y(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                            i |= 1;
                        } else if (m == 1) {
                            gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                            i |= 2;
                        } else if (m == 2) {
                            i2 = d.s(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            if (m != 3) {
                                throw new UnknownFieldException(m);
                            }
                            truncateAt = (TextUtils.TruncateAt) d.i(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                            i |= 8;
                        }
                    }
                    d.e(serialDescriptor);
                    return new c(i, tlo0Var, gzsVar, i2, truncateAt);
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
                    Lazy<KSerializer<Object>>[] lazyArr = c.e;
                    KSerializer<Object> value = lazyArr[0].getValue();
                    tlo0 tlo0Var = cVar.a;
                    TextUtils.TruncateAt truncateAt = cVar.d;
                    int i = cVar.c;
                    gzs<s3q0> gzsVar = cVar.b;
                    d.n(serialDescriptor, 0, value, tlo0Var);
                    if (d.z() || gzsVar != null) {
                        d.s(serialDescriptor, 1, lly.a, gzsVar);
                    }
                    if (d.z() || i != Integer.MAX_VALUE) {
                        d.M(2, i, serialDescriptor);
                    }
                    if (d.z() || truncateAt != null) {
                        d.s(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class b {
                public final KSerializer<c> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                e = new Lazy[]{msy.a(lazyThreadSafetyMode, new pkd0(13)), null, null, msy.a(lazyThreadSafetyMode, new ltb0(17))};
            }

            public c() {
                throw null;
            }

            public /* synthetic */ c(int i, tlo0 tlo0Var, gzs gzsVar, int i2, TextUtils.TruncateAt truncateAt) {
                if (1 != (i & 1)) {
                    sp.x(i, 1, a.a.getDescriptor());
                    throw null;
                }
                this.a = tlo0Var;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = gzsVar;
                }
                if ((i & 4) == 0) {
                    this.c = Integer.MAX_VALUE;
                } else {
                    this.c = i2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = truncateAt;
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
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                gzs<s3q0> gzsVar = this.b;
                int a2 = shy.a(this.c, (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31, 31);
                TextUtils.TruncateAt truncateAt = this.d;
                return a2 + (truncateAt != null ? truncateAt.hashCode() : 0);
            }

            public final String toString() {
                return "ExtraSubtitle(extraSubtitle=" + this.a + ", onClick=" + this.b + ", maxLines=" + this.c + ", overflow=" + this.d + ')';
            }

            public c(tlo0 tlo0Var, kg kgVar, int i, int i2) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                kgVar = (i2 & 2) != 0 ? null : kgVar;
                i = (i2 & 4) != 0 ? Integer.MAX_VALUE : i;
                truncateAt = (i2 & 8) != 0 ? null : truncateAt;
                this.a = tlo0Var;
                this.b = kgVar;
                this.c = i;
                this.d = truncateAt;
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class d {
            public static final c Companion = new c();
            public static final Lazy<KSerializer<Object>>[] g;
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final int c;
            public final TextUtils.TruncateAt d;
            public final b e;
            public final b f;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<d> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Subtitle", aVar, 6);
                    xfb0Var.j("subtitle", false);
                    xfb0Var.j("onClick", true);
                    xfb0Var.j("maxLines", true);
                    xfb0Var.j("overflow", true);
                    xfb0Var.j("before", true);
                    xfb0Var.j("after", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = d.g;
                    return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lly.a), n9x.a, xn8.a(lazyArr[3].getValue()), xn8.a(lazyArr[4].getValue()), xn8.a(lazyArr[5].getValue())};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = d.g;
                    int i = 0;
                    int i2 = 0;
                    tlo0 tlo0Var = null;
                    gzs gzsVar = null;
                    TextUtils.TruncateAt truncateAt = null;
                    b bVar = null;
                    b bVar2 = null;
                    boolean z = true;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        switch (m) {
                            case -1:
                                z = false;
                                break;
                            case 0:
                                tlo0Var = (tlo0) d.y(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                                i |= 1;
                                break;
                            case 1:
                                gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                                break;
                            case 2:
                                i2 = d.s(serialDescriptor, 2);
                                i |= 4;
                                break;
                            case 3:
                                truncateAt = (TextUtils.TruncateAt) d.i(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                                i |= 8;
                                break;
                            case 4:
                                bVar = (b) d.i(serialDescriptor, 4, lazyArr[4].getValue(), bVar);
                                i |= 16;
                                break;
                            case 5:
                                bVar2 = (b) d.i(serialDescriptor, 5, lazyArr[5].getValue(), bVar2);
                                i |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(m);
                        }
                    }
                    d.e(serialDescriptor);
                    return new d(i, tlo0Var, gzsVar, i2, truncateAt, bVar, bVar2);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    d dVar = (d) obj;
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = d.g;
                    KSerializer<Object> value = lazyArr[0].getValue();
                    tlo0 tlo0Var = dVar.a;
                    b bVar = dVar.f;
                    b bVar2 = dVar.e;
                    TextUtils.TruncateAt truncateAt = dVar.d;
                    int i = dVar.c;
                    gzs<s3q0> gzsVar = dVar.b;
                    d.n(serialDescriptor, 0, value, tlo0Var);
                    if (d.z() || gzsVar != null) {
                        d.s(serialDescriptor, 1, lly.a, gzsVar);
                    }
                    if (d.z() || i != Integer.MAX_VALUE) {
                        d.M(2, i, serialDescriptor);
                    }
                    if (d.z() || truncateAt != null) {
                        d.s(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                    }
                    if (d.z() || bVar2 != null) {
                        d.s(serialDescriptor, 4, lazyArr[4].getValue(), bVar2);
                    }
                    if (d.z() || bVar != null) {
                        d.s(serialDescriptor, 5, lazyArr[5].getValue(), bVar);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class c {
                public final KSerializer<d> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                g = new Lazy[]{msy.a(lazyThreadSafetyMode, new bpc0(8)), null, null, msy.a(lazyThreadSafetyMode, new kcc0(10)), msy.a(lazyThreadSafetyMode, new cy20(23)), msy.a(lazyThreadSafetyMode, new e1m0(13))};
            }

            public /* synthetic */ d(int i, tlo0 tlo0Var, gzs gzsVar, int i2, TextUtils.TruncateAt truncateAt, b bVar, b bVar2) {
                if (1 != (i & 1)) {
                    sp.x(i, 1, a.a.getDescriptor());
                    throw null;
                }
                this.a = tlo0Var;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = gzsVar;
                }
                if ((i & 4) == 0) {
                    this.c = Integer.MAX_VALUE;
                } else {
                    this.c = i2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = truncateAt;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = bVar;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = bVar2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                gzs<s3q0> gzsVar = this.b;
                int a2 = shy.a(this.c, (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31, 31);
                TextUtils.TruncateAt truncateAt = this.d;
                int hashCode2 = (a2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
                b bVar = this.e;
                int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                b bVar2 = this.f;
                return hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
            }

            public final String toString() {
                return "Subtitle(subtitle=" + this.a + ", onClick=" + this.b + ", maxLines=" + this.c + ", overflow=" + this.d + ", before=" + this.e + ", after=" + this.f + ')';
            }

            /* compiled from: VkCell.kt */
            @imi0
            public interface b {
                public static final a Companion = a.a;

                /* compiled from: VkCell.kt */
                public static final class a {
                    public static final /* synthetic */ a a = new a();

                    public final KSerializer<b> serializer() {
                        return new slh0("com.vk.core.view.components.cell.VkCell.Middle.Subtitle.Along", fpf0.a(b.class), new dcy[]{fpf0.a(C0815b.class)}, new KSerializer[]{C0815b.a.a}, new Annotation[0]);
                    }
                }

                /* compiled from: VkCell.kt */
                @imi0
                /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$d$b$b, reason: collision with other inner class name */
                public static final class C0815b implements b {
                    public static final C0816b Companion = new C0816b();
                    public static final Lazy<KSerializer<Object>>[] d;
                    public final dko a;
                    public final k1u0 b;
                    public final tlo0 c;

                    /* compiled from: VkCell.kt */
                    @ozl
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$d$b$b$a */
                    public static final /* synthetic */ class a implements vht<C0815b> {
                        public static final a a;
                        private static final SerialDescriptor descriptor;

                        static {
                            a aVar = new a();
                            a = aVar;
                            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Subtitle.Along.Icon", aVar, 3);
                            xfb0Var.j("icon", false);
                            xfb0Var.j("iconTint", true);
                            xfb0Var.j("iconDescription", true);
                            descriptor = xfb0Var;
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] childSerializers() {
                            Lazy<KSerializer<Object>>[] lazyArr = C0815b.d;
                            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), xn8.a(lazyArr[2].getValue())};
                        }

                        @Override // xsna.a3m
                        public final Object deserialize(Decoder decoder) {
                            SerialDescriptor serialDescriptor = descriptor;
                            ssi d = decoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = C0815b.d;
                            dko dkoVar = null;
                            boolean z = true;
                            int i = 0;
                            k1u0 k1u0Var = null;
                            tlo0 tlo0Var = null;
                            while (z) {
                                int m = d.m(serialDescriptor);
                                if (m == -1) {
                                    z = false;
                                } else if (m == 0) {
                                    dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                    i |= 1;
                                } else if (m == 1) {
                                    k1u0Var = (k1u0) d.y(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                                    i |= 2;
                                } else {
                                    if (m != 2) {
                                        throw new UnknownFieldException(m);
                                    }
                                    tlo0Var = (tlo0) d.i(serialDescriptor, 2, lazyArr[2].getValue(), tlo0Var);
                                    i |= 4;
                                }
                            }
                            d.e(serialDescriptor);
                            return new C0815b(i, dkoVar, k1u0Var, tlo0Var);
                        }

                        @Override // xsna.mmi0, xsna.a3m
                        public final SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // xsna.mmi0
                        public final void serialize(Encoder encoder, Object obj) {
                            C0815b c0815b = (C0815b) obj;
                            SerialDescriptor serialDescriptor = descriptor;
                            cti d = encoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = C0815b.d;
                            KSerializer<Object> value = lazyArr[0].getValue();
                            dko dkoVar = c0815b.a;
                            tlo0 tlo0Var = c0815b.c;
                            k1u0 k1u0Var = c0815b.b;
                            d.n(serialDescriptor, 0, value, dkoVar);
                            if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                                d.n(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                            }
                            if (d.z() || tlo0Var != null) {
                                d.s(serialDescriptor, 2, lazyArr[2].getValue(), tlo0Var);
                            }
                            d.e(serialDescriptor);
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] typeParametersSerializers() {
                            return x1o0.c;
                        }
                    }

                    /* compiled from: VkCell.kt */
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$d$b$b$b, reason: collision with other inner class name */
                    public static final class C0816b {
                        public final KSerializer<C0815b> serializer() {
                            return a.a;
                        }
                    }

                    static {
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                        d = new Lazy[]{msy.a(lazyThreadSafetyMode, new w0o0(9)), msy.a(lazyThreadSafetyMode, new fd90(21)), msy.a(lazyThreadSafetyMode, new tqf0(12))};
                    }

                    public /* synthetic */ C0815b(int i, dko dkoVar, k1u0 k1u0Var, tlo0 tlo0Var) {
                        if (1 != (i & 1)) {
                            sp.x(i, 1, a.a.getDescriptor());
                            throw null;
                        }
                        this.a = dkoVar;
                        if ((i & 2) == 0) {
                            this.b = k1u0.b.a;
                        } else {
                            this.b = k1u0Var;
                        }
                        if ((i & 4) == 0) {
                            this.c = null;
                        } else {
                            this.c = tlo0Var;
                        }
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0815b)) {
                            return false;
                        }
                        C0815b c0815b = (C0815b) obj;
                        return epx.f(this.a, c0815b.a) && epx.f(this.b, c0815b.b) && epx.f(this.c, c0815b.c);
                    }

                    public final int hashCode() {
                        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                        tlo0 tlo0Var = this.c;
                        return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Icon(icon=");
                        sb.append(this.a);
                        sb.append(", iconTint=");
                        sb.append(this.b);
                        sb.append(", iconDescription=");
                        return bt.a(sb, this.c, ')');
                    }

                    public C0815b(gko gkoVar, k1u0 k1u0Var, int i) {
                        k1u0Var = (i & 2) != 0 ? k1u0.b.a : k1u0Var;
                        this.a = gkoVar;
                        this.b = k1u0Var;
                        this.c = null;
                    }
                }
            }

            public /* synthetic */ d(tlo0 tlo0Var, gzs gzsVar, int i, TextUtils.TruncateAt truncateAt, b.C0815b c0815b, b.C0815b c0815b2, int i2) {
                this(tlo0Var, (i2 & 2) != 0 ? null : gzsVar, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? null : truncateAt, (i2 & 16) != 0 ? null : c0815b, (i2 & 32) != 0 ? null : c0815b2);
            }

            public d(tlo0 tlo0Var, gzs<s3q0> gzsVar, int i, TextUtils.TruncateAt truncateAt, b bVar, b bVar2) {
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = i;
                this.d = truncateAt;
                this.e = bVar;
                this.f = bVar2;
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class e {
            public static final c Companion = new c();
            public static final Lazy<KSerializer<Object>>[] g;
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final int c;
            public final TextUtils.TruncateAt d;
            public final b e;
            public final b f;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<e> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Title", aVar, 6);
                    xfb0Var.j("title", false);
                    xfb0Var.j("onClick", true);
                    xfb0Var.j("maxLines", true);
                    xfb0Var.j("overflow", true);
                    xfb0Var.j("before", true);
                    xfb0Var.j("after", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = e.g;
                    return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lly.a), n9x.a, xn8.a(lazyArr[3].getValue()), xn8.a(lazyArr[4].getValue()), xn8.a(lazyArr[5].getValue())};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = e.g;
                    int i = 0;
                    int i2 = 0;
                    tlo0 tlo0Var = null;
                    gzs gzsVar = null;
                    TextUtils.TruncateAt truncateAt = null;
                    b bVar = null;
                    b bVar2 = null;
                    boolean z = true;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        switch (m) {
                            case -1:
                                z = false;
                                break;
                            case 0:
                                tlo0Var = (tlo0) d.y(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                                i |= 1;
                                break;
                            case 1:
                                gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                                break;
                            case 2:
                                i2 = d.s(serialDescriptor, 2);
                                i |= 4;
                                break;
                            case 3:
                                truncateAt = (TextUtils.TruncateAt) d.i(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                                i |= 8;
                                break;
                            case 4:
                                bVar = (b) d.i(serialDescriptor, 4, lazyArr[4].getValue(), bVar);
                                i |= 16;
                                break;
                            case 5:
                                bVar2 = (b) d.i(serialDescriptor, 5, lazyArr[5].getValue(), bVar2);
                                i |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(m);
                        }
                    }
                    d.e(serialDescriptor);
                    return new e(i, tlo0Var, gzsVar, i2, truncateAt, bVar, bVar2);
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
                    Lazy<KSerializer<Object>>[] lazyArr = e.g;
                    KSerializer<Object> value = lazyArr[0].getValue();
                    tlo0 tlo0Var = eVar.a;
                    b bVar = eVar.f;
                    b bVar2 = eVar.e;
                    TextUtils.TruncateAt truncateAt = eVar.d;
                    int i = eVar.c;
                    gzs<s3q0> gzsVar = eVar.b;
                    d.n(serialDescriptor, 0, value, tlo0Var);
                    if (d.z() || gzsVar != null) {
                        d.s(serialDescriptor, 1, lly.a, gzsVar);
                    }
                    if (d.z() || i != Integer.MAX_VALUE) {
                        d.M(2, i, serialDescriptor);
                    }
                    if (d.z() || truncateAt != null) {
                        d.s(serialDescriptor, 3, lazyArr[3].getValue(), truncateAt);
                    }
                    if (d.z() || bVar2 != null) {
                        d.s(serialDescriptor, 4, lazyArr[4].getValue(), bVar2);
                    }
                    if (d.z() || bVar != null) {
                        d.s(serialDescriptor, 5, lazyArr[5].getValue(), bVar);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class c {
                public final KSerializer<e> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                g = new Lazy[]{msy.a(lazyThreadSafetyMode, new f7q0(8)), null, null, msy.a(lazyThreadSafetyMode, new gwd0(16)), msy.a(lazyThreadSafetyMode, new vqf0(12)), msy.a(lazyThreadSafetyMode, new wqf0(11))};
            }

            public /* synthetic */ e(int i, tlo0 tlo0Var, gzs gzsVar, int i2, TextUtils.TruncateAt truncateAt, b bVar, b bVar2) {
                if (1 != (i & 1)) {
                    sp.x(i, 1, a.a.getDescriptor());
                    throw null;
                }
                this.a = tlo0Var;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = gzsVar;
                }
                if ((i & 4) == 0) {
                    this.c = Integer.MAX_VALUE;
                } else {
                    this.c = i2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = truncateAt;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = bVar;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = bVar2;
                }
            }

            public static e a(e eVar, b bVar) {
                tlo0 tlo0Var = eVar.a;
                gzs<s3q0> gzsVar = eVar.b;
                int i = eVar.c;
                TextUtils.TruncateAt truncateAt = eVar.d;
                b bVar2 = eVar.e;
                eVar.getClass();
                return new e(tlo0Var, gzsVar, i, truncateAt, bVar2, bVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                gzs<s3q0> gzsVar = this.b;
                int a2 = shy.a(this.c, (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31, 31);
                TextUtils.TruncateAt truncateAt = this.d;
                int hashCode2 = (a2 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31;
                b bVar = this.e;
                int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                b bVar2 = this.f;
                return hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
            }

            public final String toString() {
                return "Title(title=" + this.a + ", onClick=" + this.b + ", maxLines=" + this.c + ", overflow=" + this.d + ", before=" + this.e + ", after=" + this.f + ')';
            }

            /* compiled from: VkCell.kt */
            @imi0
            public interface b {
                public static final a Companion = a.a;

                /* compiled from: VkCell.kt */
                public static final class a {
                    public static final /* synthetic */ a a = new a();

                    public final KSerializer<b> serializer() {
                        return new slh0("com.vk.core.view.components.cell.VkCell.Middle.Title.Along", fpf0.a(b.class), new dcy[]{fpf0.a(C0817b.class), fpf0.a(c.class), fpf0.a(d.class)}, new KSerializer[]{C0817b.a.a, c.a.a, d.a.a}, new Annotation[0]);
                    }
                }

                /* compiled from: VkCell.kt */
                @imi0
                public static final class c implements b {
                    public static final C0819b Companion = new C0819b();
                    public final C0817b a;
                    public final C0817b b;

                    /* compiled from: VkCell.kt */
                    @ozl
                    public static final /* synthetic */ class a implements vht<c> {
                        public static final a a;
                        private static final SerialDescriptor descriptor;

                        static {
                            a aVar = new a();
                            a = aVar;
                            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Title.Along.Pair", aVar, 2);
                            xfb0Var.j("first", false);
                            xfb0Var.j("second", false);
                            descriptor = xfb0Var;
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] childSerializers() {
                            C0817b.a aVar = C0817b.a.a;
                            return new KSerializer[]{aVar, aVar};
                        }

                        @Override // xsna.a3m
                        public final Object deserialize(Decoder decoder) {
                            SerialDescriptor serialDescriptor = descriptor;
                            ssi d = decoder.d(serialDescriptor);
                            C0817b c0817b = null;
                            boolean z = true;
                            int i = 0;
                            C0817b c0817b2 = null;
                            while (z) {
                                int m = d.m(serialDescriptor);
                                if (m == -1) {
                                    z = false;
                                } else if (m == 0) {
                                    c0817b = (C0817b) d.y(serialDescriptor, 0, C0817b.a.a, c0817b);
                                    i |= 1;
                                } else {
                                    if (m != 1) {
                                        throw new UnknownFieldException(m);
                                    }
                                    c0817b2 = (C0817b) d.y(serialDescriptor, 1, C0817b.a.a, c0817b2);
                                    i |= 2;
                                }
                            }
                            d.e(serialDescriptor);
                            return new c(i, c0817b, c0817b2);
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
                            C0819b c0819b = c.Companion;
                            C0817b.a aVar = C0817b.a.a;
                            d.n(serialDescriptor, 0, aVar, cVar.a);
                            d.n(serialDescriptor, 1, aVar, cVar.b);
                            d.e(serialDescriptor);
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] typeParametersSerializers() {
                            return x1o0.c;
                        }
                    }

                    /* compiled from: VkCell.kt */
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$e$b$c$b, reason: collision with other inner class name */
                    public static final class C0819b {
                        public final KSerializer<c> serializer() {
                            return a.a;
                        }
                    }

                    public /* synthetic */ c(int i, C0817b c0817b, C0817b c0817b2) {
                        if (3 != (i & 3)) {
                            sp.x(i, 3, a.a.getDescriptor());
                            throw null;
                        }
                        this.a = c0817b;
                        this.b = c0817b2;
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
                        return this.b.hashCode() + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        return "Pair(first=" + this.a + ", second=" + this.b + ')';
                    }

                    public c(C0817b c0817b, C0817b c0817b2) {
                        this.a = c0817b;
                        this.b = c0817b2;
                    }
                }

                /* compiled from: VkCell.kt */
                @imi0
                public static final class d implements b {
                    public static final C0820b Companion = new C0820b();
                    public static final Lazy<KSerializer<Object>>[] c;
                    public final f a;
                    public final android.util.Size b;

                    /* compiled from: VkCell.kt */
                    @ozl
                    public static final /* synthetic */ class a implements vht<d> {
                        public static final a a;
                        private static final SerialDescriptor descriptor;

                        static {
                            a aVar = new a();
                            a = aVar;
                            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Title.Along.View", aVar, 2);
                            xfb0Var.j("params", false);
                            xfb0Var.j("size", false);
                            descriptor = xfb0Var;
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] childSerializers() {
                            Lazy<KSerializer<Object>>[] lazyArr = d.c;
                            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
                        }

                        @Override // xsna.a3m
                        public final Object deserialize(Decoder decoder) {
                            SerialDescriptor serialDescriptor = descriptor;
                            ssi d = decoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = d.c;
                            f fVar = null;
                            boolean z = true;
                            int i = 0;
                            android.util.Size size = null;
                            while (z) {
                                int m = d.m(serialDescriptor);
                                if (m == -1) {
                                    z = false;
                                } else if (m == 0) {
                                    fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                    i |= 1;
                                } else {
                                    if (m != 1) {
                                        throw new UnknownFieldException(m);
                                    }
                                    size = (android.util.Size) d.y(serialDescriptor, 1, lazyArr[1].getValue(), size);
                                    i |= 2;
                                }
                            }
                            d.e(serialDescriptor);
                            return new d(i, fVar, size);
                        }

                        @Override // xsna.mmi0, xsna.a3m
                        public final SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // xsna.mmi0
                        public final void serialize(Encoder encoder, Object obj) {
                            d dVar = (d) obj;
                            SerialDescriptor serialDescriptor = descriptor;
                            cti d = encoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = d.c;
                            d.n(serialDescriptor, 0, lazyArr[0].getValue(), dVar.a);
                            d.n(serialDescriptor, 1, lazyArr[1].getValue(), dVar.b);
                            d.e(serialDescriptor);
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] typeParametersSerializers() {
                            return x1o0.c;
                        }
                    }

                    /* compiled from: VkCell.kt */
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$e$b$d$b, reason: collision with other inner class name */
                    public static final class C0820b {
                        public final KSerializer<d> serializer() {
                            return a.a;
                        }
                    }

                    static {
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                        c = new Lazy[]{msy.a(lazyThreadSafetyMode, new x1c0(17)), msy.a(lazyThreadSafetyMode, new ia90(18))};
                    }

                    public /* synthetic */ d(int i, f fVar, android.util.Size size) {
                        if (3 != (i & 3)) {
                            sp.x(i, 3, a.a.getDescriptor());
                            throw null;
                        }
                        this.a = fVar;
                        this.b = size;
                    }

                    public d(f fVar, android.util.Size size) {
                        this.a = fVar;
                        this.b = size;
                    }
                }

                /* compiled from: VkCell.kt */
                @imi0
                /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$e$b$b, reason: collision with other inner class name */
                public static final class C0817b implements b {
                    public static final C0818b Companion = new C0818b();
                    public static final Lazy<KSerializer<Object>>[] e;
                    public final dko a;
                    public final k1u0 b;
                    public final tlo0 c;
                    public final android.util.Size d;

                    /* compiled from: VkCell.kt */
                    @ozl
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$e$b$b$a */
                    public static final /* synthetic */ class a implements vht<C0817b> {
                        public static final a a;
                        private static final SerialDescriptor descriptor;

                        static {
                            a aVar = new a();
                            a = aVar;
                            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Middle.Title.Along.Icon", aVar, 4);
                            xfb0Var.j("icon", false);
                            xfb0Var.j("iconTint", true);
                            xfb0Var.j("iconDescription", true);
                            xfb0Var.j("iconSize", true);
                            descriptor = xfb0Var;
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] childSerializers() {
                            Lazy<KSerializer<Object>>[] lazyArr = C0817b.e;
                            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), xn8.a(lazyArr[2].getValue()), xn8.a(lazyArr[3].getValue())};
                        }

                        @Override // xsna.a3m
                        public final Object deserialize(Decoder decoder) {
                            SerialDescriptor serialDescriptor = descriptor;
                            ssi d = decoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = C0817b.e;
                            int i = 0;
                            dko dkoVar = null;
                            k1u0 k1u0Var = null;
                            tlo0 tlo0Var = null;
                            android.util.Size size = null;
                            boolean z = true;
                            while (z) {
                                int m = d.m(serialDescriptor);
                                if (m == -1) {
                                    z = false;
                                } else if (m == 0) {
                                    dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                    i |= 1;
                                } else if (m == 1) {
                                    k1u0Var = (k1u0) d.y(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                                    i |= 2;
                                } else if (m == 2) {
                                    tlo0Var = (tlo0) d.i(serialDescriptor, 2, lazyArr[2].getValue(), tlo0Var);
                                    i |= 4;
                                } else {
                                    if (m != 3) {
                                        throw new UnknownFieldException(m);
                                    }
                                    size = (android.util.Size) d.i(serialDescriptor, 3, lazyArr[3].getValue(), size);
                                    i |= 8;
                                }
                            }
                            d.e(serialDescriptor);
                            return new C0817b(i, dkoVar, k1u0Var, tlo0Var, size);
                        }

                        @Override // xsna.mmi0, xsna.a3m
                        public final SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // xsna.mmi0
                        public final void serialize(Encoder encoder, Object obj) {
                            C0817b c0817b = (C0817b) obj;
                            SerialDescriptor serialDescriptor = descriptor;
                            cti d = encoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = C0817b.e;
                            KSerializer<Object> value = lazyArr[0].getValue();
                            dko dkoVar = c0817b.a;
                            android.util.Size size = c0817b.d;
                            tlo0 tlo0Var = c0817b.c;
                            k1u0 k1u0Var = c0817b.b;
                            d.n(serialDescriptor, 0, value, dkoVar);
                            if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                                d.n(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                            }
                            if (d.z() || tlo0Var != null) {
                                d.s(serialDescriptor, 2, lazyArr[2].getValue(), tlo0Var);
                            }
                            if (d.z() || size != null) {
                                d.s(serialDescriptor, 3, lazyArr[3].getValue(), size);
                            }
                            d.e(serialDescriptor);
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] typeParametersSerializers() {
                            return x1o0.c;
                        }
                    }

                    /* compiled from: VkCell.kt */
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Middle$e$b$b$b, reason: collision with other inner class name */
                    public static final class C0818b {
                        public final KSerializer<C0817b> serializer() {
                            return a.a;
                        }
                    }

                    static {
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                        e = new Lazy[]{msy.a(lazyThreadSafetyMode, new xqf0(12)), msy.a(lazyThreadSafetyMode, new k5f0(14)), msy.a(lazyThreadSafetyMode, new t970(21)), msy.a(lazyThreadSafetyMode, new j1t0(4))};
                    }

                    public /* synthetic */ C0817b(int i, dko dkoVar, k1u0 k1u0Var, tlo0 tlo0Var, android.util.Size size) {
                        if (1 != (i & 1)) {
                            sp.x(i, 1, a.a.getDescriptor());
                            throw null;
                        }
                        this.a = dkoVar;
                        if ((i & 2) == 0) {
                            this.b = k1u0.b.a;
                        } else {
                            this.b = k1u0Var;
                        }
                        if ((i & 4) == 0) {
                            this.c = null;
                        } else {
                            this.c = tlo0Var;
                        }
                        if ((i & 8) == 0) {
                            this.d = null;
                        } else {
                            this.d = size;
                        }
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0817b)) {
                            return false;
                        }
                        C0817b c0817b = (C0817b) obj;
                        return epx.f(this.a, c0817b.a) && epx.f(this.b, c0817b.b) && epx.f(this.c, c0817b.c) && epx.f(this.d, c0817b.d);
                    }

                    public final int hashCode() {
                        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                        tlo0 tlo0Var = this.c;
                        int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                        android.util.Size size = this.d;
                        return hashCode2 + (size != null ? size.hashCode() : 0);
                    }

                    public final String toString() {
                        return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=" + this.c + ", iconSize=" + this.d + ')';
                    }

                    public C0817b(dko dkoVar, k1u0 k1u0Var, tlo0.f fVar, android.util.Size size, int i) {
                        k1u0Var = (i & 2) != 0 ? k1u0.b.a : k1u0Var;
                        fVar = (i & 4) != 0 ? null : fVar;
                        size = (i & 8) != 0 ? null : size;
                        this.a = dkoVar;
                        this.b = k1u0Var;
                        this.c = fVar;
                        this.d = size;
                    }
                }
            }

            public /* synthetic */ e(tlo0 tlo0Var, int i, TextUtils.TruncateAt truncateAt, b bVar, b bVar2, int i2) {
                this(tlo0Var, (gzs<s3q0>) null, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? null : truncateAt, (i2 & 16) != 0 ? null : bVar, (i2 & 32) != 0 ? null : bVar2);
            }

            public e(tlo0 tlo0Var, gzs<s3q0> gzsVar, int i, TextUtils.TruncateAt truncateAt, b bVar, b bVar2) {
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = i;
                this.d = truncateAt;
                this.e = bVar;
                this.f = bVar2;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCell.kt */
    public static final class Region {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;
        public static final Region ExtraSubtitle;
        public static final Region LeftExtra;
        public static final Region LeftMain;
        public static final Region RightAction;
        public static final Region RightExtra;
        public static final Region RightExtraAction;
        public static final Region Subtitle;
        public static final Region Title;

        static {
            Region region = new Region("LeftExtra", 0);
            LeftExtra = region;
            Region region2 = new Region("LeftMain", 1);
            LeftMain = region2;
            Region region3 = new Region("Title", 2);
            Title = region3;
            Region region4 = new Region("Subtitle", 3);
            Subtitle = region4;
            Region region5 = new Region("ExtraSubtitle", 4);
            ExtraSubtitle = region5;
            Region region6 = new Region("RightAction", 5);
            RightAction = region6;
            Region region7 = new Region("RightExtra", 6);
            RightExtra = region7;
            Region region8 = new Region("RightExtraAction", 7);
            RightExtraAction = region8;
            Region[] regionArr = {region, region2, region3, region4, region5, region6, region7, region8};
            $VALUES = regionArr;
            $ENTRIES = new asp(regionArr);
        }

        public Region() {
            throw null;
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCell.kt */
    @imi0
    public interface Right {
        public static final c Companion = c.a;

        /* compiled from: VkCell.kt */
        @imi0
        public static final class b implements Right {
            public static final C0831b Companion = new C0831b();
            public static final Lazy<KSerializer<Object>>[] d;
            public final izs<View, s3q0> a;
            public final tlo0 b;
            public final k1u0 c;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<b> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Chevron", aVar, 3);
                    xfb0Var.j("onClick", true);
                    xfb0Var.j("contentDescription", true);
                    xfb0Var.j("iconTint", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = b.d;
                    return new KSerializer[]{xn8.a(lly.a), xn8.a(lazyArr[1].getValue()), lazyArr[2].getValue()};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.d;
                    izs izsVar = null;
                    boolean z = true;
                    int i = 0;
                    tlo0 tlo0Var = null;
                    k1u0 k1u0Var = null;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            izsVar = (izs) d.i(serialDescriptor, 0, lly.a, izsVar);
                            i |= 1;
                        } else if (m == 1) {
                            tlo0Var = (tlo0) d.i(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                            i |= 2;
                        } else {
                            if (m != 2) {
                                throw new UnknownFieldException(m);
                            }
                            k1u0Var = (k1u0) d.y(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                            i |= 4;
                        }
                    }
                    d.e(serialDescriptor);
                    return new b(i, izsVar, tlo0Var, k1u0Var);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    b bVar = (b) obj;
                    k1u0 k1u0Var = bVar.c;
                    tlo0 tlo0Var = bVar.b;
                    izs<View, s3q0> izsVar = bVar.a;
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = b.d;
                    if (d.z() || izsVar != null) {
                        d.s(serialDescriptor, 0, lly.a, izsVar);
                    }
                    if (d.z() || tlo0Var != null) {
                        d.s(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                    }
                    if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                        d.n(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            /* renamed from: com.vk.core.view.components.cell.VkCell$Right$b$b, reason: collision with other inner class name */
            public static final class C0831b {
                public final KSerializer<b> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new Lazy[]{null, msy.a(lazyThreadSafetyMode, new iud0(13)), msy.a(lazyThreadSafetyMode, new zpt0(3))};
            }

            public b() {
                this((izs) null, (tlo0.f) null, (k1u0.a) null, 7);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                izs<View, s3q0> izsVar = this.a;
                int hashCode = (izsVar == null ? 0 : izsVar.hashCode()) * 31;
                tlo0 tlo0Var = this.b;
                return this.c.hashCode() + ((hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Chevron(onClick=" + this.a + ", contentDescription=" + this.b + ", iconTint=" + this.c + ')';
            }

            public /* synthetic */ b(int i, izs izsVar, tlo0 tlo0Var, k1u0 k1u0Var) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = izsVar;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = tlo0Var;
                }
                if ((i & 4) == 0) {
                    this.c = k1u0.b.a;
                } else {
                    this.c = k1u0Var;
                }
            }

            public b(izs izsVar, tlo0.f fVar, k1u0.a aVar, int i) {
                izsVar = (i & 1) != 0 ? null : izsVar;
                fVar = (i & 2) != 0 ? null : fVar;
                k1u0 k1u0Var = (i & 4) != 0 ? k1u0.b.a : aVar;
                this.a = izsVar;
                this.b = fVar;
                this.c = k1u0Var;
            }
        }

        /* compiled from: VkCell.kt */
        public static final class c {
            public static final /* synthetic */ c a = new c();

            public static d a(c cVar, a aVar, e eVar, ExtraAction extraAction, b bVar, int i) {
                if ((i & 1) != 0) {
                    aVar = null;
                }
                if ((i & 2) != 0) {
                    eVar = null;
                }
                if ((i & 4) != 0) {
                    extraAction = null;
                }
                if ((i & 8) != 0) {
                    bVar = null;
                }
                cVar.getClass();
                return new d(aVar, eVar, extraAction, bVar, (f) null);
            }

            public final KSerializer<Right> serializer() {
                return new slh0("com.vk.core.view.components.cell.VkCell.Right", fpf0.a(Right.class), new dcy[]{fpf0.a(a.C0822a.class), fpf0.a(a.b.class), fpf0.a(a.d.class), fpf0.a(a.e.class), fpf0.a(a.f.class), fpf0.a(b.class), fpf0.a(d.class), fpf0.a(e.b.class), fpf0.a(e.d.class), fpf0.a(ExtraAction.a.class), fpf0.a(ExtraAction.c.class), fpf0.a(ExtraAction.d.class), fpf0.a(ExtraAction.e.class), fpf0.a(f.class)}, new KSerializer[]{a.C0822a.C0823a.a, a.b.C0824a.a, a.d.C0828a.a, a.e.C0829a.a, a.f.C0830a.a, b.a.a, d.a.a, e.b.a.a, e.d.a.a, ExtraAction.a.C0821a.a, ExtraAction.c.a.a, ExtraAction.d.a.a, ExtraAction.e.a.a, f.a.a}, new Annotation[0]);
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class d implements Right {
            public static final b Companion = new b();
            public static final Lazy<KSerializer<Object>>[] f;
            public final a a;
            public final e b;
            public final ExtraAction c;
            public final b d;
            public final f e;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<d> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.DefaultRight", aVar, 5);
                    xfb0Var.j("action", true);
                    xfb0Var.j("extra", true);
                    xfb0Var.j("extraAction", true);
                    xfb0Var.j("chevron", true);
                    xfb0Var.j("reorder", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = d.f;
                    return new KSerializer[]{xn8.a(lazyArr[0].getValue()), xn8.a(lazyArr[1].getValue()), xn8.a(lazyArr[2].getValue()), xn8.a(b.a.a), xn8.a(f.a.a)};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = d.f;
                    int i = 0;
                    a aVar = null;
                    e eVar = null;
                    ExtraAction extraAction = null;
                    b bVar = null;
                    f fVar = null;
                    boolean z = true;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            aVar = (a) d.i(serialDescriptor, 0, lazyArr[0].getValue(), aVar);
                            i |= 1;
                        } else if (m == 1) {
                            eVar = (e) d.i(serialDescriptor, 1, lazyArr[1].getValue(), eVar);
                            i |= 2;
                        } else if (m == 2) {
                            extraAction = (ExtraAction) d.i(serialDescriptor, 2, lazyArr[2].getValue(), extraAction);
                            i |= 4;
                        } else if (m == 3) {
                            bVar = (b) d.i(serialDescriptor, 3, b.a.a, bVar);
                            i |= 8;
                        } else {
                            if (m != 4) {
                                throw new UnknownFieldException(m);
                            }
                            fVar = (f) d.i(serialDescriptor, 4, f.a.a, fVar);
                            i |= 16;
                        }
                    }
                    d.e(serialDescriptor);
                    return new d(i, aVar, eVar, extraAction, bVar, fVar);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    d dVar = (d) obj;
                    f fVar = dVar.e;
                    b bVar = dVar.d;
                    ExtraAction extraAction = dVar.c;
                    e eVar = dVar.b;
                    a aVar = dVar.a;
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = d.f;
                    if (d.z() || aVar != null) {
                        d.s(serialDescriptor, 0, lazyArr[0].getValue(), aVar);
                    }
                    if (d.z() || eVar != null) {
                        d.s(serialDescriptor, 1, lazyArr[1].getValue(), eVar);
                    }
                    if (d.z() || extraAction != null) {
                        d.s(serialDescriptor, 2, lazyArr[2].getValue(), extraAction);
                    }
                    if (d.z() || bVar != null) {
                        d.s(serialDescriptor, 3, b.a.a, bVar);
                    }
                    if (d.z() || fVar != null) {
                        d.s(serialDescriptor, 4, f.a.a, fVar);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class b {
                public final KSerializer<d> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                int i = 16;
                f = new Lazy[]{msy.a(lazyThreadSafetyMode, new z0h0(i)), msy.a(lazyThreadSafetyMode, new e3c0(i)), msy.a(lazyThreadSafetyMode, new nof0(8)), null, null};
            }

            public d() {
                this((a) null, (e) null, (ExtraAction.a) null, (b) null, 31);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v6, types: [com.vk.core.view.components.cell.VkCell$Right$a] */
            /* JADX WARN: Type inference failed for: r9v2, types: [com.vk.core.view.components.cell.VkCell$Right$ExtraAction] */
            public static d a(d dVar, a.b bVar, e eVar, ExtraAction.d dVar2, b bVar2, f fVar, int i) {
                a.b bVar3 = bVar;
                if ((i & 1) != 0) {
                    bVar3 = dVar.a;
                }
                a.b bVar4 = bVar3;
                if ((i & 2) != 0) {
                    eVar = dVar.b;
                }
                e eVar2 = eVar;
                ExtraAction.d dVar3 = dVar2;
                if ((i & 4) != 0) {
                    dVar3 = dVar.c;
                }
                ExtraAction.d dVar4 = dVar3;
                if ((i & 8) != 0) {
                    bVar2 = dVar.d;
                }
                b bVar5 = bVar2;
                if ((i & 16) != 0) {
                    fVar = dVar.e;
                }
                dVar.getClass();
                return new d(bVar4, eVar2, dVar4, bVar5, fVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
            }

            public final int hashCode() {
                a aVar = this.a;
                int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
                e eVar = this.b;
                int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
                ExtraAction extraAction = this.c;
                int hashCode3 = (hashCode2 + (extraAction == null ? 0 : extraAction.hashCode())) * 31;
                b bVar = this.d;
                int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                f fVar = this.e;
                return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
            }

            public final String toString() {
                return "DefaultRight(action=" + this.a + ", extra=" + this.b + ", extraAction=" + this.c + ", chevron=" + this.d + ", reorder=" + this.e + ')';
            }

            public /* synthetic */ d(int i, a aVar, e eVar, ExtraAction extraAction, b bVar, f fVar) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = aVar;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = eVar;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = extraAction;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = bVar;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = fVar;
                }
            }

            public /* synthetic */ d(a aVar, e eVar, ExtraAction.a aVar2, b bVar, int i) {
                this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : eVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? null : bVar, (f) null);
            }

            public d(a aVar, e eVar, ExtraAction extraAction, b bVar, f fVar) {
                this.a = aVar;
                this.b = eVar;
                this.c = extraAction;
                this.d = bVar;
                this.e = fVar;
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public static final class f implements Right {
            public static final b Companion = new b();
            public static final Lazy<KSerializer<Object>>[] d;
            public final izs<MotionEvent, Boolean> a;
            public final tlo0 b;
            public final k1u0 c;

            /* compiled from: VkCell.kt */
            @ozl
            public static final /* synthetic */ class a implements vht<f> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Reorder", aVar, 3);
                    xfb0Var.j("onTouchEvent", true);
                    xfb0Var.j("contentDescription", true);
                    xfb0Var.j("iconTint", true);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    Lazy<KSerializer<Object>>[] lazyArr = f.d;
                    return new KSerializer[]{xn8.a(lazyArr[0].getValue()), xn8.a(lazyArr[1].getValue()), lazyArr[2].getValue()};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = f.d;
                    izs izsVar = null;
                    boolean z = true;
                    int i = 0;
                    tlo0 tlo0Var = null;
                    k1u0 k1u0Var = null;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else if (m == 0) {
                            izsVar = (izs) d.i(serialDescriptor, 0, lazyArr[0].getValue(), izsVar);
                            i |= 1;
                        } else if (m == 1) {
                            tlo0Var = (tlo0) d.i(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                            i |= 2;
                        } else {
                            if (m != 2) {
                                throw new UnknownFieldException(m);
                            }
                            k1u0Var = (k1u0) d.y(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                            i |= 4;
                        }
                    }
                    d.e(serialDescriptor);
                    return new f(i, izsVar, tlo0Var, k1u0Var);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    f fVar = (f) obj;
                    k1u0 k1u0Var = fVar.c;
                    tlo0 tlo0Var = fVar.b;
                    izs<MotionEvent, Boolean> izsVar = fVar.a;
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    Lazy<KSerializer<Object>>[] lazyArr = f.d;
                    if (d.z() || izsVar != null) {
                        d.s(serialDescriptor, 0, lazyArr[0].getValue(), izsVar);
                    }
                    if (d.z() || tlo0Var != null) {
                        d.s(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                    }
                    if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                        d.n(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                    }
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class b {
                public final KSerializer<f> serializer() {
                    return a.a;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new Lazy[]{msy.a(lazyThreadSafetyMode, new gzr0(4)), msy.a(lazyThreadSafetyMode, new s7c0(18)), msy.a(lazyThreadSafetyMode, new o2a0(19))};
            }

            public f() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                izs<MotionEvent, Boolean> izsVar = this.a;
                int hashCode = (izsVar == null ? 0 : izsVar.hashCode()) * 31;
                tlo0 tlo0Var = this.b;
                return this.c.hashCode() + ((hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Reorder(onTouchEvent=" + this.a + ", contentDescription=" + this.b + ", iconTint=" + this.c + ')';
            }

            public /* synthetic */ f(int i, izs izsVar, tlo0 tlo0Var, k1u0 k1u0Var) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = izsVar;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = tlo0Var;
                }
                if ((i & 4) == 0) {
                    this.c = k1u0.b.a;
                } else {
                    this.c = k1u0Var;
                }
            }

            public f(Object obj) {
                k1u0.b bVar = k1u0.b.a;
                this.a = null;
                this.b = null;
                this.c = bVar;
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public interface e extends Right {
            public static final a Companion = a.a;

            /* compiled from: VkCell.kt */
            public static final class a {
                public static final /* synthetic */ a a = new a();

                public final KSerializer<e> serializer() {
                    return new slh0("com.vk.core.view.components.cell.VkCell.Right.Extra", fpf0.a(e.class), new dcy[]{fpf0.a(b.class), fpf0.a(d.class)}, new KSerializer[]{b.a.a, d.a.a}, new Annotation[0]);
                }
            }

            /* compiled from: VkCell.kt */
            public static final class c implements e {
                public final b a;
                public final b b;

                public c(b bVar, b bVar2) {
                    this.a = bVar;
                    this.b = bVar2;
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
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Pair(first=" + this.a + ", second=" + this.b + ')';
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class d implements e {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] c;
                public final f a;
                public final Size b;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<d> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Extra.View", aVar, 2);
                        xfb0Var.j("params", false);
                        xfb0Var.j("contentSize", false);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        f fVar = null;
                        boolean z = true;
                        int i = 0;
                        Size size = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                i |= 1;
                            } else {
                                if (m != 1) {
                                    throw new UnknownFieldException(m);
                                }
                                size = (Size) d.y(serialDescriptor, 1, lazyArr[1].getValue(), size);
                                i |= 2;
                            }
                        }
                        d.e(serialDescriptor);
                        return new d(i, fVar, size);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        d dVar = (d) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.c;
                        d.n(serialDescriptor, 0, lazyArr[0].getValue(), dVar.a);
                        d.n(serialDescriptor, 1, lazyArr[1].getValue(), dVar.b);
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<d> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    c = new Lazy[]{msy.a(lazyThreadSafetyMode, new rcs0(6)), msy.a(lazyThreadSafetyMode, new kud0(15))};
                }

                public /* synthetic */ d(int i, f fVar, Size size) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = fVar;
                    this.b = size;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "View(params=" + this.a + ", contentSize=" + this.b + ')';
                }

                public d(f fVar, Size size) {
                    this.a = fVar;
                    this.b = size;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class b implements e {
                public static final C0832b Companion = new C0832b();
                public static final Lazy<KSerializer<Object>>[] g;
                public final dko a;
                public final k1u0 b;
                public final Size c;
                public final tlo0 d;
                public final boolean e;
                public final gzs<s3q0> f;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<b> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Extra.Icon", aVar, 6);
                        xfb0Var.j("icon", false);
                        xfb0Var.j("iconTint", true);
                        xfb0Var.j("iconSize", true);
                        xfb0Var.j("iconDescription", true);
                        xfb0Var.j("isEnabled", true);
                        xfb0Var.j("onClick", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = b.g;
                        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), xn8.a(lazyArr[2].getValue()), xn8.a(lazyArr[3].getValue()), g18.a, xn8.a(lly.a)};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = b.g;
                        int i = 0;
                        boolean z = false;
                        dko dkoVar = null;
                        k1u0 k1u0Var = null;
                        Size size = null;
                        tlo0 tlo0Var = null;
                        gzs gzsVar = null;
                        boolean z2 = true;
                        while (z2) {
                            int m = d.m(serialDescriptor);
                            switch (m) {
                                case -1:
                                    z2 = false;
                                    break;
                                case 0:
                                    dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                    i |= 1;
                                    break;
                                case 1:
                                    k1u0Var = (k1u0) d.y(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                                    i |= 2;
                                    break;
                                case 2:
                                    size = (Size) d.i(serialDescriptor, 2, lazyArr[2].getValue(), size);
                                    i |= 4;
                                    break;
                                case 3:
                                    tlo0Var = (tlo0) d.i(serialDescriptor, 3, lazyArr[3].getValue(), tlo0Var);
                                    i |= 8;
                                    break;
                                case 4:
                                    z = d.F(serialDescriptor, 4);
                                    i |= 16;
                                    break;
                                case 5:
                                    gzsVar = (gzs) d.i(serialDescriptor, 5, lly.a, gzsVar);
                                    i |= 32;
                                    break;
                                default:
                                    throw new UnknownFieldException(m);
                            }
                        }
                        d.e(serialDescriptor);
                        return new b(i, dkoVar, k1u0Var, size, tlo0Var, z, gzsVar);
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
                        Lazy<KSerializer<Object>>[] lazyArr = b.g;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        dko dkoVar = bVar.a;
                        gzs<s3q0> gzsVar = bVar.f;
                        boolean z = bVar.e;
                        tlo0 tlo0Var = bVar.d;
                        Size size = bVar.c;
                        k1u0 k1u0Var = bVar.b;
                        d.n(serialDescriptor, 0, value, dkoVar);
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 1, lazyArr[1].getValue(), k1u0Var);
                        }
                        if (d.z() || size != null) {
                            d.s(serialDescriptor, 2, lazyArr[2].getValue(), size);
                        }
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 3, lazyArr[3].getValue(), tlo0Var);
                        }
                        if (d.z() || !z) {
                            d.l(serialDescriptor, 4, z);
                        }
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 5, lly.a, gzsVar);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$e$b$b, reason: collision with other inner class name */
                public static final class C0832b {
                    public final KSerializer<b> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    g = new Lazy[]{msy.a(lazyThreadSafetyMode, new ku70(16)), msy.a(lazyThreadSafetyMode, new daz(29)), msy.a(lazyThreadSafetyMode, new jo60(24)), msy.a(lazyThreadSafetyMode, new uv80(18)), null, null};
                }

                public b() {
                    throw null;
                }

                public /* synthetic */ b(int i, dko dkoVar, k1u0 k1u0Var, Size size, tlo0 tlo0Var, boolean z, gzs gzsVar) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = dkoVar;
                    if ((i & 2) == 0) {
                        this.b = k1u0.b.a;
                    } else {
                        this.b = k1u0Var;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = size;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = tlo0Var;
                    }
                    if ((i & 16) == 0) {
                        this.e = true;
                    } else {
                        this.e = z;
                    }
                    if ((i & 32) == 0) {
                        this.f = null;
                    } else {
                        this.f = gzsVar;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f);
                }

                public final int hashCode() {
                    int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                    Size size = this.c;
                    int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
                    tlo0 tlo0Var = this.d;
                    int b = qoy.b((hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31, this.e);
                    gzs<s3q0> gzsVar = this.f;
                    return b + (gzsVar != null ? gzsVar.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Icon(icon=");
                    sb.append(this.a);
                    sb.append(", iconTint=");
                    sb.append(this.b);
                    sb.append(", iconSize=");
                    sb.append(this.c);
                    sb.append(", iconDescription=");
                    sb.append(this.d);
                    sb.append(", isEnabled=");
                    sb.append(this.e);
                    sb.append(", onClick=");
                    return uf3.d(sb, this.f, ')');
                }

                public b(dko dkoVar, k1u0 k1u0Var, Size size, tlo0 tlo0Var, boolean z, gzs gzsVar, int i) {
                    k1u0Var = (i & 2) != 0 ? k1u0.b.a : k1u0Var;
                    size = (i & 4) != 0 ? null : size;
                    tlo0Var = (i & 8) != 0 ? null : tlo0Var;
                    z = (i & 16) != 0 ? true : z;
                    gzsVar = (i & 32) != 0 ? null : gzsVar;
                    this.a = dkoVar;
                    this.b = k1u0Var;
                    this.c = size;
                    this.d = tlo0Var;
                    this.e = z;
                    this.f = gzsVar;
                }
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public interface ExtraAction extends Right {
            public static final b Companion = b.a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkCell.kt */
            @imi0
            public static final class Mode {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Mode[] $VALUES;
                private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
                public static final a Companion;
                public static final Mode Primary;
                public static final Mode Secondary;

                /* compiled from: VkCell.kt */
                public static final class a {
                    public final KSerializer<Mode> serializer() {
                        return (KSerializer) Mode.$cachedSerializer$delegate.getValue();
                    }
                }

                static {
                    Mode mode = new Mode("Primary", 0);
                    Primary = mode;
                    Mode mode2 = new Mode("Secondary", 1);
                    Secondary = mode2;
                    Mode[] modeArr = {mode, mode2};
                    $VALUES = modeArr;
                    $ENTRIES = new asp(modeArr);
                    Companion = new a();
                    $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new yo80(17));
                }

                public Mode() {
                    throw null;
                }

                public static Mode valueOf(String str) {
                    return (Mode) Enum.valueOf(Mode.class, str);
                }

                public static Mode[] values() {
                    return (Mode[]) $VALUES.clone();
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class a implements ExtraAction {
                public static final b Companion = new b();
                public final boolean a;
                public final gzs<s3q0> b;
                public final boolean c;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$ExtraAction$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0821a implements vht<a> {
                    public static final C0821a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0821a c0821a = new C0821a();
                        a = c0821a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.ExtraAction.Check", c0821a, 3);
                        xfb0Var.j("checked", false);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("enabled", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        KSerializer<?> a2 = xn8.a(lly.a);
                        g18 g18Var = g18.a;
                        return new KSerializer[]{g18Var, a2, g18Var};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        gzs gzsVar = null;
                        boolean z = true;
                        int i = 0;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                z2 = d.F(serialDescriptor, 0);
                                i |= 1;
                            } else if (m == 1) {
                                gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                z3 = d.F(serialDescriptor, 2);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new a(i, gzsVar, z2, z3);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        a aVar = (a) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        boolean z = aVar.a;
                        boolean z2 = aVar.c;
                        gzs<s3q0> gzsVar = aVar.b;
                        d.l(serialDescriptor, 0, z);
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 1, lly.a, gzsVar);
                        }
                        if (d.z() || !z2) {
                            d.l(serialDescriptor, 2, z2);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<a> serializer() {
                        return C0821a.a;
                    }
                }

                public /* synthetic */ a(int i, gzs gzsVar, boolean z, boolean z2) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, C0821a.a.getDescriptor());
                        throw null;
                    }
                    this.a = z;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = gzsVar;
                    }
                    if ((i & 4) == 0) {
                        this.c = true;
                    } else {
                        this.c = z2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.a) * 31;
                    gzs<s3q0> gzsVar = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Check(checked=");
                    sb.append(this.a);
                    sb.append(", onClick=");
                    sb.append(this.b);
                    sb.append(", enabled=");
                    return q0.a(sb, this.c, ')');
                }

                public a(int i, gzs gzsVar, boolean z) {
                    gzsVar = (i & 2) != 0 ? null : gzsVar;
                    this.a = z;
                    this.b = gzsVar;
                    this.c = true;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class b {
                public static final /* synthetic */ b a = new b();

                public final KSerializer<ExtraAction> serializer() {
                    return new slh0("com.vk.core.view.components.cell.VkCell.Right.ExtraAction", fpf0.a(ExtraAction.class), new dcy[]{fpf0.a(a.class), fpf0.a(c.class), fpf0.a(d.class), fpf0.a(e.class)}, new KSerializer[]{a.C0821a.a, c.a.a, d.a.a, e.a.a}, new Annotation[0]);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class d implements ExtraAction {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] d;
                public final gzs<s3q0> a;
                public final tlo0 b;
                public final k1u0 c;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<d> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.ExtraAction.More", aVar, 3);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("contentDescription", true);
                        xfb0Var.j("iconTint", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        return new KSerializer[]{xn8.a(lly.a), xn8.a(lazyArr[1].getValue()), lazyArr[2].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        gzs gzsVar = null;
                        boolean z = true;
                        int i = 0;
                        tlo0 tlo0Var = null;
                        k1u0 k1u0Var = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                gzsVar = (gzs) d.i(serialDescriptor, 0, lly.a, gzsVar);
                                i |= 1;
                            } else if (m == 1) {
                                tlo0Var = (tlo0) d.i(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                k1u0Var = (k1u0) d.y(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new d(i, gzsVar, tlo0Var, k1u0Var);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        d dVar = (d) obj;
                        k1u0 k1u0Var = dVar.c;
                        tlo0 tlo0Var = dVar.b;
                        gzs<s3q0> gzsVar = dVar.a;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 0, lly.a, gzsVar);
                        }
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var);
                        }
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 2, lazyArr[2].getValue(), k1u0Var);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<d> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    d = new Lazy[]{null, msy.a(lazyThreadSafetyMode, new zo80(13)), msy.a(lazyThreadSafetyMode, new ap80(16))};
                }

                /* JADX WARN: Multi-variable type inference failed */
                public d() {
                    this((gzs) null, (tlo0.f) (0 == true ? 1 : 0), 7);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    tlo0 tlo0Var = this.b;
                    return this.c.hashCode() + ((hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    return "More(onClick=" + this.a + ", contentDescription=" + this.b + ", iconTint=" + this.c + ')';
                }

                public /* synthetic */ d(int i, gzs gzsVar, tlo0 tlo0Var, k1u0 k1u0Var) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = gzsVar;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = tlo0Var;
                    }
                    if ((i & 4) == 0) {
                        this.c = k1u0.b.a;
                    } else {
                        this.c = k1u0Var;
                    }
                }

                public d(gzs<s3q0> gzsVar, tlo0 tlo0Var, k1u0 k1u0Var) {
                    this.a = gzsVar;
                    this.b = tlo0Var;
                    this.c = k1u0Var;
                }

                public /* synthetic */ d(gzs gzsVar, tlo0.f fVar, int i) {
                    this((gzs<s3q0>) ((i & 1) != 0 ? null : gzsVar), (i & 2) != 0 ? null : fVar, k1u0.b.a);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class e implements ExtraAction {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] c = {msy.a(LazyThreadSafetyMode.PUBLICATION, new dgc0(16)), null};
                public final f a;
                public final Integer b;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<e> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.ExtraAction.Picture", aVar, 2);
                        xfb0Var.j("image", false);
                        xfb0Var.j("contentSize", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{e.c[0].getValue(), xn8.a(n9x.a)};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        f fVar = null;
                        boolean z = true;
                        int i = 0;
                        Integer num = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                fVar = (f) d.y(serialDescriptor, 0, lazyArr[0].getValue(), fVar);
                                i |= 1;
                            } else {
                                if (m != 1) {
                                    throw new UnknownFieldException(m);
                                }
                                num = (Integer) d.i(serialDescriptor, 1, n9x.a, num);
                                i |= 2;
                            }
                        }
                        d.e(serialDescriptor);
                        return new e(i, fVar, num);
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
                        KSerializer<Object> value = e.c[0].getValue();
                        f fVar = eVar.a;
                        Integer num = eVar.b;
                        d.n(serialDescriptor, 0, value, fVar);
                        if (d.z() || num != null) {
                            d.s(serialDescriptor, 1, n9x.a, num);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<e> serializer() {
                        return a.a;
                    }
                }

                public /* synthetic */ e(int i, f fVar, Integer num) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = fVar;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = num;
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
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    Integer num = this.b;
                    return hashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Picture(image=");
                    sb.append(this.a);
                    sb.append(", contentSize=");
                    return uqi.b(sb, this.b, ')');
                }

                public e(f fVar, Integer num) {
                    this.a = fVar;
                    this.b = num;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class c implements ExtraAction {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] e;
                public final tlo0 a;
                public final gzs<s3q0> b;
                public final Mode c;
                public final k1u0 d;

                /* compiled from: VkCell.kt */
                @ozl
                public static final /* synthetic */ class a implements vht<c> {
                    public static final a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        a = aVar;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.ExtraAction.Dropdown", aVar, 4);
                        xfb0Var.j("text", false);
                        xfb0Var.j("onClick", false);
                        xfb0Var.j(X3.a.t, true);
                        xfb0Var.j("iconTint", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        return new KSerializer[]{lazyArr[0].getValue(), lly.a, lazyArr[2].getValue(), lazyArr[3].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        int i = 0;
                        tlo0 tlo0Var = null;
                        gzs gzsVar = null;
                        Mode mode = null;
                        k1u0 k1u0Var = null;
                        boolean z = true;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                tlo0Var = (tlo0) d.y(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                                i |= 1;
                            } else if (m == 1) {
                                gzsVar = (gzs) d.y(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                            } else if (m == 2) {
                                mode = (Mode) d.y(serialDescriptor, 2, lazyArr[2].getValue(), mode);
                                i |= 4;
                            } else {
                                if (m != 3) {
                                    throw new UnknownFieldException(m);
                                }
                                k1u0Var = (k1u0) d.y(serialDescriptor, 3, lazyArr[3].getValue(), k1u0Var);
                                i |= 8;
                            }
                        }
                        d.e(serialDescriptor);
                        return new c(i, tlo0Var, gzsVar, mode, k1u0Var);
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
                        Lazy<KSerializer<Object>>[] lazyArr = c.e;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        tlo0 tlo0Var = cVar.a;
                        k1u0 k1u0Var = cVar.d;
                        Mode mode = cVar.c;
                        d.n(serialDescriptor, 0, value, tlo0Var);
                        d.n(serialDescriptor, 1, lly.a, cVar.b);
                        if (d.z() || mode != Mode.Secondary) {
                            d.n(serialDescriptor, 2, lazyArr[2].getValue(), mode);
                        }
                        if (d.z() || !epx.f(k1u0Var, k1u0.b.a)) {
                            d.n(serialDescriptor, 3, lazyArr[3].getValue(), k1u0Var);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<c> serializer() {
                        return a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    e = new Lazy[]{msy.a(lazyThreadSafetyMode, new ko60(15)), null, msy.a(lazyThreadSafetyMode, new nyk0(7)), msy.a(lazyThreadSafetyMode, new jql0(5))};
                }

                public c() {
                    throw null;
                }

                public /* synthetic */ c(int i, tlo0 tlo0Var, gzs gzsVar, Mode mode, k1u0 k1u0Var) {
                    if (3 != (i & 3)) {
                        sp.x(i, 3, a.a.getDescriptor());
                        throw null;
                    }
                    this.a = tlo0Var;
                    this.b = gzsVar;
                    if ((i & 4) == 0) {
                        this.c = Mode.Secondary;
                    } else {
                        this.c = mode;
                    }
                    if ((i & 8) == 0) {
                        this.d = k1u0.b.a;
                    } else {
                        this.d = k1u0Var;
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
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + ((this.c.hashCode() + sf3.a(this.a.hashCode() * 31, 31, this.b)) * 31);
                }

                public final String toString() {
                    return "Dropdown(text=" + this.a + ", onClick=" + this.b + ", mode=" + this.c + ", iconTint=" + this.d + ')';
                }

                public c(tlo0.h hVar, gzs gzsVar) {
                    Mode mode = Mode.Secondary;
                    k1u0.b bVar = k1u0.b.a;
                    this.a = hVar;
                    this.b = gzsVar;
                    this.c = mode;
                    this.d = bVar;
                }
            }
        }

        /* compiled from: VkCell.kt */
        @imi0
        public interface a extends Right {
            public static final c Companion = c.a;

            /* compiled from: VkCell.kt */
            @imi0
            /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$a, reason: collision with other inner class name */
            public static final class C0822a implements a {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] b = {msy.a(LazyThreadSafetyMode.PUBLICATION, new dqm0(6))};
                public final VkBadge.Appearance a;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0823a implements vht<C0822a> {
                    public static final C0823a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0823a c0823a = new C0823a();
                        a = c0823a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Badge", c0823a, 1);
                        xfb0Var.j("appearance", false);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{C0822a.b[0].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = C0822a.b;
                        VkBadge.Appearance appearance = null;
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
                                appearance = (VkBadge.Appearance) d.y(serialDescriptor, 0, lazyArr[0].getValue(), appearance);
                                i = 1;
                            }
                        }
                        d.e(serialDescriptor);
                        return new C0822a(i, appearance);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        d.n(serialDescriptor, 0, C0822a.b[0].getValue(), ((C0822a) obj).a);
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$a$b */
                public static final class b {
                    public final KSerializer<C0822a> serializer() {
                        return C0823a.a;
                    }
                }

                public /* synthetic */ C0822a(int i, VkBadge.Appearance appearance) {
                    if (1 == (i & 1)) {
                        this.a = appearance;
                    } else {
                        sp.x(i, 1, C0823a.a.getDescriptor());
                        throw null;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0822a) && epx.f(this.a, ((C0822a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Badge(appearance=" + this.a + ')';
                }

                public C0822a(VkBadge.Appearance.Design design) {
                    this.a = design;
                }
            }

            /* compiled from: VkCell.kt */
            public static final class c {
                public static final /* synthetic */ c a = new c();

                public final KSerializer<a> serializer() {
                    return new slh0("com.vk.core.view.components.cell.VkCell.Right.Action", fpf0.a(a.class), new dcy[]{fpf0.a(C0822a.class), fpf0.a(b.class), fpf0.a(d.class), fpf0.a(e.class), fpf0.a(f.class)}, new KSerializer[]{C0822a.C0823a.a, b.C0824a.a, d.C0828a.a, e.C0829a.a, f.C0830a.a}, new Annotation[0]);
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class e implements a {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] c;
                public final tlo0 a;
                public final tlo0 b;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$e$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0829a implements vht<e> {
                    public static final C0829a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0829a c0829a = new C0829a();
                        a = c0829a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Detail", c0829a, 2);
                        xfb0Var.j("text", false);
                        xfb0Var.j("contentDescription", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        return new KSerializer[]{lazyArr[0].getValue(), xn8.a(lazyArr[1].getValue())};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        tlo0 tlo0Var = null;
                        boolean z = true;
                        int i = 0;
                        tlo0 tlo0Var2 = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                tlo0Var = (tlo0) d.y(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                                i |= 1;
                            } else {
                                if (m != 1) {
                                    throw new UnknownFieldException(m);
                                }
                                tlo0Var2 = (tlo0) d.i(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var2);
                                i |= 2;
                            }
                        }
                        d.e(serialDescriptor);
                        return new e(i, tlo0Var, tlo0Var2);
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
                        Lazy<KSerializer<Object>>[] lazyArr = e.c;
                        KSerializer<Object> value = lazyArr[0].getValue();
                        tlo0 tlo0Var = eVar.a;
                        tlo0 tlo0Var2 = eVar.b;
                        d.n(serialDescriptor, 0, value, tlo0Var);
                        if (d.z() || !epx.f(tlo0Var2, tlo0Var)) {
                            d.s(serialDescriptor, 1, lazyArr[1].getValue(), tlo0Var2);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<e> serializer() {
                        return C0829a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    c = new Lazy[]{msy.a(lazyThreadSafetyMode, new vhu0(1)), msy.a(lazyThreadSafetyMode, new gos0(3))};
                }

                public /* synthetic */ e(int i, tlo0 tlo0Var, tlo0 tlo0Var2) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, C0829a.a.getDescriptor());
                        throw null;
                    }
                    this.a = tlo0Var;
                    if ((i & 2) == 0) {
                        this.b = tlo0Var;
                    } else {
                        this.b = tlo0Var2;
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
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    tlo0 tlo0Var = this.b;
                    return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Detail(text=");
                    sb.append(this.a);
                    sb.append(", contentDescription=");
                    return bt.a(sb, this.b, ')');
                }

                public e(tlo0 tlo0Var, tlo0 tlo0Var2) {
                    this.a = tlo0Var;
                    this.b = tlo0Var2;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class f implements a {
                public static final b Companion = new b();
                public final boolean a;
                public final gzs<s3q0> b;
                public final boolean c;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$f$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0830a implements vht<f> {
                    public static final C0830a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0830a c0830a = new C0830a();
                        a = c0830a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Switch", c0830a, 3);
                        xfb0Var.j("checked", false);
                        xfb0Var.j("onClick", true);
                        xfb0Var.j("enabled", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        KSerializer<?> a2 = xn8.a(lly.a);
                        g18 g18Var = g18.a;
                        return new KSerializer[]{g18Var, a2, g18Var};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        gzs gzsVar = null;
                        boolean z = true;
                        int i = 0;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                z2 = d.F(serialDescriptor, 0);
                                i |= 1;
                            } else if (m == 1) {
                                gzsVar = (gzs) d.i(serialDescriptor, 1, lly.a, gzsVar);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                z3 = d.F(serialDescriptor, 2);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new f(i, gzsVar, z2, z3);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        f fVar = (f) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        boolean z = fVar.a;
                        boolean z2 = fVar.c;
                        gzs<s3q0> gzsVar = fVar.b;
                        d.l(serialDescriptor, 0, z);
                        if (d.z() || gzsVar != null) {
                            d.s(serialDescriptor, 1, lly.a, gzsVar);
                        }
                        if (d.z() || !z2) {
                            d.l(serialDescriptor, 2, z2);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<f> serializer() {
                        return C0830a.a;
                    }
                }

                public /* synthetic */ f(int i, gzs gzsVar, boolean z, boolean z2) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, C0830a.a.getDescriptor());
                        throw null;
                    }
                    this.a = z;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = gzsVar;
                    }
                    if ((i & 4) == 0) {
                        this.c = true;
                    } else {
                        this.c = z2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return this.a == fVar.a && epx.f(this.b, fVar.b) && this.c == fVar.c;
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.a) * 31;
                    gzs<s3q0> gzsVar = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Switch(checked=");
                    sb.append(this.a);
                    sb.append(", onClick=");
                    sb.append(this.b);
                    sb.append(", enabled=");
                    return q0.a(sb, this.c, ')');
                }

                public /* synthetic */ f(int i, gzs gzsVar, boolean z) {
                    this((i & 2) != 0 ? null : gzsVar, z, true);
                }

                public f(gzs gzsVar, boolean z, boolean z2) {
                    this.a = z;
                    this.b = gzsVar;
                    this.c = z2;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class b implements a {
                public static final C0825b Companion = new C0825b();
                public static final Lazy<KSerializer<Object>>[] l;
                public final tlo0 a;
                public final gzs<s3q0> b;
                public final VkButton.Appearance c;
                public final VkButton.Mode d;
                public final VkButton.Size e;
                public final c f;
                public final tlo0 g;
                public final boolean h;
                public final c i;
                public final Integer j;
                public final tlo0 k;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$b$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0824a implements vht<b> {
                    public static final C0824a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0824a c0824a = new C0824a();
                        a = c0824a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Button", c0824a, 11);
                        xfb0Var.j("text", true);
                        xfb0Var.j("onClick", false);
                        xfb0Var.j("buttonAppearance", false);
                        xfb0Var.j("buttonMode", true);
                        xfb0Var.j("buttonSize", true);
                        xfb0Var.j("icon", true);
                        xfb0Var.j("contentDescription", true);
                        xfb0Var.j("isLoading", true);
                        xfb0Var.j("trailingIcon", true);
                        xfb0Var.j("count", true);
                        xfb0Var.j("onClickLabel", true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = b.l;
                        c.C0826a c0826a = c.C0826a.a;
                        return new KSerializer[]{xn8.a(lazyArr[0].getValue()), lly.a, lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), xn8.a(c0826a), xn8.a(lazyArr[6].getValue()), g18.a, xn8.a(c0826a), xn8.a(n9x.a), xn8.a(lazyArr[10].getValue())};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        Lazy<KSerializer<Object>>[] lazyArr;
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr2 = b.l;
                        c cVar = null;
                        Integer num = null;
                        tlo0 tlo0Var = null;
                        tlo0 tlo0Var2 = null;
                        gzs gzsVar = null;
                        VkButton.Appearance appearance = null;
                        VkButton.Mode mode = null;
                        VkButton.Size size = null;
                        c cVar2 = null;
                        tlo0 tlo0Var3 = null;
                        int i = 0;
                        boolean z = true;
                        boolean z2 = false;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            switch (m) {
                                case -1:
                                    z = false;
                                    continue;
                                case 0:
                                    lazyArr = lazyArr2;
                                    tlo0Var2 = (tlo0) d.i(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var2);
                                    i |= 1;
                                    break;
                                case 1:
                                    lazyArr = lazyArr2;
                                    gzsVar = (gzs) d.y(serialDescriptor, 1, lly.a, gzsVar);
                                    i |= 2;
                                    break;
                                case 2:
                                    lazyArr = lazyArr2;
                                    appearance = (VkButton.Appearance) d.y(serialDescriptor, 2, lazyArr[2].getValue(), appearance);
                                    i |= 4;
                                    break;
                                case 3:
                                    lazyArr = lazyArr2;
                                    mode = (VkButton.Mode) d.y(serialDescriptor, 3, lazyArr[3].getValue(), mode);
                                    i |= 8;
                                    break;
                                case 4:
                                    lazyArr = lazyArr2;
                                    size = (VkButton.Size) d.y(serialDescriptor, 4, lazyArr[4].getValue(), size);
                                    i |= 16;
                                    break;
                                case 5:
                                    lazyArr = lazyArr2;
                                    cVar2 = (c) d.i(serialDescriptor, 5, c.C0826a.a, cVar2);
                                    i |= 32;
                                    break;
                                case 6:
                                    lazyArr = lazyArr2;
                                    tlo0Var3 = (tlo0) d.i(serialDescriptor, 6, lazyArr[6].getValue(), tlo0Var3);
                                    i |= 64;
                                    break;
                                case 7:
                                    lazyArr = lazyArr2;
                                    z2 = d.F(serialDescriptor, 7);
                                    i |= 128;
                                    break;
                                case 8:
                                    lazyArr = lazyArr2;
                                    cVar = (c) d.i(serialDescriptor, 8, c.C0826a.a, cVar);
                                    i |= 256;
                                    break;
                                case 9:
                                    lazyArr = lazyArr2;
                                    num = (Integer) d.i(serialDescriptor, 9, n9x.a, num);
                                    i |= 512;
                                    break;
                                case 10:
                                    lazyArr = lazyArr2;
                                    tlo0Var = (tlo0) d.i(serialDescriptor, 10, lazyArr2[10].getValue(), tlo0Var);
                                    i |= 1024;
                                    break;
                                default:
                                    throw new UnknownFieldException(m);
                            }
                            lazyArr2 = lazyArr;
                        }
                        d.e(serialDescriptor);
                        return new b(i, tlo0Var2, gzsVar, appearance, mode, size, cVar2, tlo0Var3, z2, cVar, num, tlo0Var);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        b bVar = (b) obj;
                        tlo0 tlo0Var = bVar.a;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = b.l;
                        if (d.z() || tlo0Var != null) {
                            d.s(serialDescriptor, 0, lazyArr[0].getValue(), tlo0Var);
                        }
                        lly llyVar = lly.a;
                        gzs<s3q0> gzsVar = bVar.b;
                        tlo0 tlo0Var2 = bVar.k;
                        Integer num = bVar.j;
                        c cVar = bVar.i;
                        boolean z = bVar.h;
                        tlo0 tlo0Var3 = bVar.g;
                        c cVar2 = bVar.f;
                        VkButton.Size size = bVar.e;
                        VkButton.Mode mode = bVar.d;
                        d.n(serialDescriptor, 1, llyVar, gzsVar);
                        d.n(serialDescriptor, 2, lazyArr[2].getValue(), bVar.c);
                        if (d.z() || mode != VkButton.Mode.Primary) {
                            d.n(serialDescriptor, 3, lazyArr[3].getValue(), mode);
                        }
                        if (d.z() || size != VkButton.Size.Small) {
                            d.n(serialDescriptor, 4, lazyArr[4].getValue(), size);
                        }
                        if (d.z() || cVar2 != null) {
                            d.s(serialDescriptor, 5, c.C0826a.a, cVar2);
                        }
                        if (d.z() || !epx.f(tlo0Var3, tlo0Var)) {
                            d.s(serialDescriptor, 6, lazyArr[6].getValue(), tlo0Var3);
                        }
                        if (d.z() || z) {
                            d.l(serialDescriptor, 7, z);
                        }
                        if (d.z() || cVar != null) {
                            d.s(serialDescriptor, 8, c.C0826a.a, cVar);
                        }
                        if (d.z() || num != null) {
                            d.s(serialDescriptor, 9, n9x.a, num);
                        }
                        if (d.z() || tlo0Var2 != null) {
                            d.s(serialDescriptor, 10, lazyArr[10].getValue(), tlo0Var2);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$b$b, reason: collision with other inner class name */
                public static final class C0825b {
                    public final KSerializer<b> serializer() {
                        return C0824a.a;
                    }
                }

                /* compiled from: VkCell.kt */
                @imi0
                public static final class c {
                    public static final C0827b Companion = new C0827b();
                    public static final Lazy<KSerializer<Object>>[] d = {msy.a(LazyThreadSafetyMode.PUBLICATION, new xqi0(6)), null, null};
                    public final dko a;
                    public final Integer b;
                    public final Integer c;

                    /* compiled from: VkCell.kt */
                    @ozl
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$b$c$a, reason: collision with other inner class name */
                    public static final /* synthetic */ class C0826a implements vht<c> {
                        public static final C0826a a;
                        private static final SerialDescriptor descriptor;

                        static {
                            C0826a c0826a = new C0826a();
                            a = c0826a;
                            xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Button.Icon", c0826a, 3);
                            xfb0Var.j("icon", false);
                            xfb0Var.j("iconSize", true);
                            xfb0Var.j("iconTint", true);
                            descriptor = xfb0Var;
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] childSerializers() {
                            n9x n9xVar = n9x.a;
                            return new KSerializer[]{c.d[0].getValue(), xn8.a(n9xVar), xn8.a(n9xVar)};
                        }

                        @Override // xsna.a3m
                        public final Object deserialize(Decoder decoder) {
                            SerialDescriptor serialDescriptor = descriptor;
                            ssi d = decoder.d(serialDescriptor);
                            Lazy<KSerializer<Object>>[] lazyArr = c.d;
                            dko dkoVar = null;
                            boolean z = true;
                            int i = 0;
                            Integer num = null;
                            Integer num2 = null;
                            while (z) {
                                int m = d.m(serialDescriptor);
                                if (m == -1) {
                                    z = false;
                                } else if (m == 0) {
                                    dkoVar = (dko) d.y(serialDescriptor, 0, lazyArr[0].getValue(), dkoVar);
                                    i |= 1;
                                } else if (m == 1) {
                                    num = (Integer) d.i(serialDescriptor, 1, n9x.a, num);
                                    i |= 2;
                                } else {
                                    if (m != 2) {
                                        throw new UnknownFieldException(m);
                                    }
                                    num2 = (Integer) d.i(serialDescriptor, 2, n9x.a, num2);
                                    i |= 4;
                                }
                            }
                            d.e(serialDescriptor);
                            return new c(i, dkoVar, num, num2);
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
                            KSerializer<Object> value = c.d[0].getValue();
                            dko dkoVar = cVar.a;
                            Integer num = cVar.c;
                            Integer num2 = cVar.b;
                            d.n(serialDescriptor, 0, value, dkoVar);
                            if (d.z() || num2 != null) {
                                d.s(serialDescriptor, 1, n9x.a, num2);
                            }
                            if (d.z() || num != null) {
                                d.s(serialDescriptor, 2, n9x.a, num);
                            }
                            d.e(serialDescriptor);
                        }

                        @Override // xsna.vht
                        public final KSerializer<?>[] typeParametersSerializers() {
                            return x1o0.c;
                        }
                    }

                    /* compiled from: VkCell.kt */
                    /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$b$c$b, reason: collision with other inner class name */
                    public static final class C0827b {
                        public final KSerializer<c> serializer() {
                            return C0826a.a;
                        }
                    }

                    public /* synthetic */ c(int i, dko dkoVar, Integer num, Integer num2) {
                        if (1 != (i & 1)) {
                            sp.x(i, 1, C0826a.a.getDescriptor());
                            throw null;
                        }
                        this.a = dkoVar;
                        if ((i & 2) == 0) {
                            this.b = null;
                        } else {
                            this.b = num;
                        }
                        if ((i & 4) == 0) {
                            this.c = null;
                        } else {
                            this.c = num2;
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
                        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.a.hashCode() * 31;
                        Integer num = this.b;
                        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                        Integer num2 = this.c;
                        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Icon(icon=");
                        sb.append(this.a);
                        sb.append(", iconSize=");
                        sb.append(this.b);
                        sb.append(", iconTint=");
                        return uqi.b(sb, this.c, ')');
                    }

                    public /* synthetic */ c(dko dkoVar, Integer num, int i) {
                        this(dkoVar, (Integer) null, (i & 4) != 0 ? null : num);
                    }

                    public c(dko dkoVar, Integer num, Integer num2) {
                        this.a = dkoVar;
                        this.b = num;
                        this.c = num2;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    l = new Lazy[]{msy.a(lazyThreadSafetyMode, new xk70(14)), null, msy.a(lazyThreadSafetyMode, new rjg0(9)), msy.a(lazyThreadSafetyMode, new zqf0(11)), msy.a(lazyThreadSafetyMode, new e6k0(8)), null, msy.a(lazyThreadSafetyMode, new qbe0(12)), null, null, null, msy.a(lazyThreadSafetyMode, new fiu0(0))};
                }

                public b() {
                    throw null;
                }

                public /* synthetic */ b(int i, tlo0 tlo0Var, gzs gzsVar, VkButton.Appearance appearance, VkButton.Mode mode, VkButton.Size size, c cVar, tlo0 tlo0Var2, boolean z, c cVar2, Integer num, tlo0 tlo0Var3) {
                    if (6 != (i & 6)) {
                        sp.x(i, 6, C0824a.a.getDescriptor());
                        throw null;
                    }
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = tlo0Var;
                    }
                    this.b = gzsVar;
                    this.c = appearance;
                    if ((i & 8) == 0) {
                        this.d = VkButton.Mode.Primary;
                    } else {
                        this.d = mode;
                    }
                    if ((i & 16) == 0) {
                        this.e = VkButton.Size.Small;
                    } else {
                        this.e = size;
                    }
                    if ((i & 32) == 0) {
                        this.f = null;
                    } else {
                        this.f = cVar;
                    }
                    if ((i & 64) == 0) {
                        this.g = this.a;
                    } else {
                        this.g = tlo0Var2;
                    }
                    if ((i & 128) == 0) {
                        this.h = false;
                    } else {
                        this.h = z;
                    }
                    if ((i & 256) == 0) {
                        this.i = null;
                    } else {
                        this.i = cVar2;
                    }
                    if ((i & 512) == 0) {
                        this.j = null;
                    } else {
                        this.j = num;
                    }
                    if ((i & 1024) == 0) {
                        this.k = null;
                    } else {
                        this.k = tlo0Var3;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h == bVar.h && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k);
                }

                public final int hashCode() {
                    tlo0 tlo0Var = this.a;
                    int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + sf3.a((tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31;
                    c cVar = this.f;
                    int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
                    tlo0 tlo0Var2 = this.g;
                    int b = qoy.b((hashCode2 + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31, 31, this.h);
                    c cVar2 = this.i;
                    int hashCode3 = (b + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
                    Integer num = this.j;
                    int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                    tlo0 tlo0Var3 = this.k;
                    return hashCode4 + (tlo0Var3 != null ? tlo0Var3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(text=");
                    sb.append(this.a);
                    sb.append(", onClick=");
                    sb.append(this.b);
                    sb.append(", buttonAppearance=");
                    sb.append(this.c);
                    sb.append(", buttonMode=");
                    sb.append(this.d);
                    sb.append(", buttonSize=");
                    sb.append(this.e);
                    sb.append(", icon=");
                    sb.append(this.f);
                    sb.append(", contentDescription=");
                    sb.append(this.g);
                    sb.append(", isLoading=");
                    sb.append(this.h);
                    sb.append(", trailingIcon=");
                    sb.append(this.i);
                    sb.append(", count=");
                    sb.append(this.j);
                    sb.append(", onClickLabel=");
                    return bt.a(sb, this.k, ')');
                }

                public b(tlo0 tlo0Var, gzs gzsVar, VkButton.Appearance appearance, VkButton.Mode mode, VkButton.Size size, c cVar, tlo0.f fVar, c cVar2, int i) {
                    tlo0Var = (i & 1) != 0 ? null : tlo0Var;
                    mode = (i & 8) != 0 ? VkButton.Mode.Primary : mode;
                    size = (i & 16) != 0 ? VkButton.Size.Small : size;
                    cVar = (i & 32) != 0 ? null : cVar;
                    tlo0 tlo0Var2 = (i & 64) != 0 ? tlo0Var : fVar;
                    cVar2 = (i & 256) != 0 ? null : cVar2;
                    this.a = tlo0Var;
                    this.b = gzsVar;
                    this.c = appearance;
                    this.d = mode;
                    this.e = size;
                    this.f = cVar;
                    this.g = tlo0Var2;
                    this.h = false;
                    this.i = cVar2;
                    this.j = null;
                    this.k = null;
                }
            }

            /* compiled from: VkCell.kt */
            @imi0
            public static final class d implements a {
                public static final b Companion = new b();
                public static final Lazy<KSerializer<Object>>[] d;
                public final int a;
                public final VkCounter.CounterAppearance b;
                public final VkCounter.Mode c;

                /* compiled from: VkCell.kt */
                @ozl
                /* renamed from: com.vk.core.view.components.cell.VkCell$Right$a$d$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0828a implements vht<d> {
                    public static final C0828a a;
                    private static final SerialDescriptor descriptor;

                    static {
                        C0828a c0828a = new C0828a();
                        a = c0828a;
                        xfb0 xfb0Var = new xfb0("com.vk.core.view.components.cell.VkCell.Right.Action.Counter", c0828a, 3);
                        xfb0Var.j("count", false);
                        xfb0Var.j("appearance", true);
                        xfb0Var.j(X3.a.t, true);
                        descriptor = xfb0Var;
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] childSerializers() {
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        return new KSerializer[]{n9x.a, lazyArr[1].getValue(), lazyArr[2].getValue()};
                    }

                    @Override // xsna.a3m
                    public final Object deserialize(Decoder decoder) {
                        SerialDescriptor serialDescriptor = descriptor;
                        ssi d = decoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        VkCounter.CounterAppearance counterAppearance = null;
                        boolean z = true;
                        int i = 0;
                        int i2 = 0;
                        VkCounter.Mode mode = null;
                        while (z) {
                            int m = d.m(serialDescriptor);
                            if (m == -1) {
                                z = false;
                            } else if (m == 0) {
                                i2 = d.s(serialDescriptor, 0);
                                i |= 1;
                            } else if (m == 1) {
                                counterAppearance = (VkCounter.CounterAppearance) d.y(serialDescriptor, 1, lazyArr[1].getValue(), counterAppearance);
                                i |= 2;
                            } else {
                                if (m != 2) {
                                    throw new UnknownFieldException(m);
                                }
                                mode = (VkCounter.Mode) d.y(serialDescriptor, 2, lazyArr[2].getValue(), mode);
                                i |= 4;
                            }
                        }
                        d.e(serialDescriptor);
                        return new d(i, i2, counterAppearance, mode);
                    }

                    @Override // xsna.mmi0, xsna.a3m
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // xsna.mmi0
                    public final void serialize(Encoder encoder, Object obj) {
                        d dVar = (d) obj;
                        SerialDescriptor serialDescriptor = descriptor;
                        cti d = encoder.d(serialDescriptor);
                        Lazy<KSerializer<Object>>[] lazyArr = d.d;
                        int i = dVar.a;
                        VkCounter.Mode mode = dVar.c;
                        VkCounter.CounterAppearance counterAppearance = dVar.b;
                        d.M(0, i, serialDescriptor);
                        if (d.z() || counterAppearance != VkCounter.CounterAppearance.Appearance.Accent) {
                            d.n(serialDescriptor, 1, lazyArr[1].getValue(), counterAppearance);
                        }
                        if (d.z() || mode != VkCounter.Mode.Primary) {
                            d.n(serialDescriptor, 2, lazyArr[2].getValue(), mode);
                        }
                        d.e(serialDescriptor);
                    }

                    @Override // xsna.vht
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return x1o0.c;
                    }
                }

                /* compiled from: VkCell.kt */
                public static final class b {
                    public final KSerializer<d> serializer() {
                        return C0828a.a;
                    }
                }

                static {
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    d = new Lazy[]{null, msy.a(lazyThreadSafetyMode, new fog0(8)), msy.a(lazyThreadSafetyMode, new yjt0(1))};
                }

                public /* synthetic */ d(int i, int i2, VkCounter.CounterAppearance counterAppearance, VkCounter.Mode mode) {
                    if (1 != (i & 1)) {
                        sp.x(i, 1, C0828a.a.getDescriptor());
                        throw null;
                    }
                    this.a = i2;
                    if ((i & 2) == 0) {
                        this.b = VkCounter.CounterAppearance.Appearance.Accent;
                    } else {
                        this.b = counterAppearance;
                    }
                    if ((i & 4) == 0) {
                        this.c = VkCounter.Mode.Primary;
                    } else {
                        this.c = mode;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
                }

                public final String toString() {
                    return "Counter(count=" + this.a + ", appearance=" + this.b + ", mode=" + this.c + ')';
                }

                public d(int i, VkCounter.CounterAppearance counterAppearance, VkCounter.Mode mode) {
                    this.a = i;
                    this.b = counterAppearance;
                    this.c = mode;
                }

                public /* synthetic */ d(int i, VkCounter.CounterAppearance.Appearance appearance, int i2) {
                    this(i, (i2 & 2) != 0 ? VkCounter.CounterAppearance.Appearance.Accent : appearance, VkCounter.Mode.Primary);
                }
            }
        }
    }

    /* compiled from: VkCell.kt */
    public interface d {
        void a(f fVar);

        View getView();
    }

    /* compiled from: VkCell.kt */
    public interface e {
        d create(Context context);
    }

    /* compiled from: VkCell.kt */
    @qub0
    public interface f {
    }

    /* compiled from: VkCell.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.LeftExtra.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Region.LeftMain.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Region.Title.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Region.Subtitle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Region.ExtraSubtitle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Region.RightAction.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Region.RightExtra.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Region.RightExtraAction.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkCell(Context context) {
        this(context, null, 6, 0);
    }

    private final void setMinHeightAndVerticalPaddings(h hVar) {
        hVar.getContext();
        hVar.setMinimumHeight(hbh0.b(48, hVar.getContext()));
        hVar.setCustomVerticalPaddings$foundation_release(0);
    }

    public final a a() {
        a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(getContext());
        this.f = aVar2;
        return aVar2;
    }

    public final Rect b(Region region) {
        VkCellLeft vkCellLeft;
        VkCellLeft vkCellLeft2;
        FrameLayout frameLayout;
        xiu0 xiu0Var;
        xiu0 xiu0Var2;
        xiu0 xiu0Var3;
        VkCellRight vkCellRight;
        VkCellRight vkCellRight2;
        VkCellRight vkCellRight3;
        Rect rect = new Rect();
        switch (g.$EnumSwitchMapping$0[region.ordinal()]) {
            case 1:
                a aVar = this.f;
                if (aVar != null && (vkCellLeft = aVar.b) != null) {
                    vkCellLeft.b().getGlobalVisibleRect(rect);
                }
                return rect;
            case 2:
                a aVar2 = this.f;
                if (aVar2 != null && (vkCellLeft2 = aVar2.b) != null && (frameLayout = vkCellLeft2.h) != null) {
                    frameLayout.getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 3:
                b bVar = this.g;
                if (bVar != null && (xiu0Var = bVar.b) != null) {
                    xiu0Var.h().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 4:
                b bVar2 = this.g;
                if (bVar2 != null && (xiu0Var2 = bVar2.b) != null) {
                    xiu0Var2.g().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 5:
                b bVar3 = this.g;
                if (bVar3 != null && (xiu0Var3 = bVar3.b) != null) {
                    xiu0Var3.e().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 6:
                c cVar = this.h;
                if (cVar != null && (vkCellRight = cVar.b) != null) {
                    vkCellRight.c().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 7:
                c cVar2 = this.h;
                if (cVar2 != null && (vkCellRight2 = cVar2.b) != null) {
                    vkCellRight2.h().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            case 8:
                c cVar3 = this.h;
                if (cVar3 != null && (vkCellRight3 = cVar3.b) != null) {
                    vkCellRight3.f().getGlobalVisibleRect(rect);
                    return rect;
                }
                return rect;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final <VIEW extends View> void c(izs<? super Context, ? extends VIEW> izsVar, wzs<? super VIEW, ? super f, s3q0> wzsVar) {
        a().b.setLeftMainViewController(new com.vk.core.view.components.cell.b(izsVar, wzsVar));
    }

    @Override // android.view.View
    public final Left.b getLeft() {
        return this.b;
    }

    public final Middle.b getMiddle() {
        return this.d;
    }

    @Override // android.view.View
    public final Right.d getRight() {
        return this.c;
    }

    public final List<Slot<?>> getSexyCellAfterSlots() {
        return this.k;
    }

    public final Slot.Align getSexyCellAlign() {
        return this.l;
    }

    public final List<Slot<?>> getSexyCellBeforeSlots() {
        return this.i;
    }

    public final List<Slot<?>> getSexyCellMiddleSlots() {
        return this.j;
    }

    public final Slot.Size getSexyCellSize() {
        return this.m;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnabledAppearance(z);
    }

    public final void setEnabledAppearance(boolean z) {
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setLeft(Left.b bVar) {
        this.b = bVar;
        a a2 = a();
        a2.b.a(bVar);
        this.e.setBefore(bVar != null ? new h.b(Collections.singletonList(a2)) : null);
    }

    public final void setLeftMainAvatarController(e eVar) {
        a().b.setLeftMainAvatarController(eVar);
    }

    public final void setLeftMainPictureController(e eVar) {
        a().b.setLeftMainPictureController(eVar);
    }

    public final void setLeftMainViewController(e eVar) {
        a().b.setLeftMainViewController(eVar);
    }

    public final void setMiddle(Middle.b bVar) {
        this.d = bVar;
        b bVar2 = this.g;
        if (bVar2 == null) {
            bVar2 = new b(getContext());
            this.g = bVar2;
        }
        bVar2.b.d(bVar);
        this.e.setMiddle(bVar != null ? new h.c(bVar2, null, null) : null);
    }

    public final void setMiddleTitleHolderFactory(aju0 aju0Var) {
        b bVar = this.g;
        if (bVar == null) {
            bVar = new b(getContext());
            this.g = bVar;
        }
        bVar.b.setTitleHolderFactory(aju0Var);
    }

    public final void setRight(Right.d dVar) {
        this.c = dVar;
        c cVar = this.h;
        if (cVar == null) {
            cVar = new c(getContext());
            this.h = cVar;
        }
        cVar.b.a(dVar);
        this.e.setAfter(dVar != null ? new h.a(Collections.singletonList(cVar)) : null);
    }

    public final void setRightAdaptivity(AdaptiveHorizontalLinearLayout.LayoutParams.Adaptivity adaptivity) {
        this.e.setAfterAdaptivity$foundation_release(adaptivity);
    }

    public final void setRightExtraActionPictureController(e eVar) {
        c cVar = this.h;
        if (cVar == null) {
            cVar = new c(getContext());
            this.h = cVar;
        }
        cVar.b.setRightExtraActionPictureController(eVar);
    }

    public final void setRightExtraViewController(e eVar) {
        c cVar = this.h;
        if (cVar == null) {
            cVar = new c(getContext());
            this.h = cVar;
        }
        cVar.b.setRightExtraViewController(eVar);
    }

    public final void setSexyCellAfterSlots(List<? extends Slot<?>> list) {
        this.k = list;
        this.e.setAfter(list != null ? new h.a(list) : null);
    }

    public final void setSexyCellAlign(Slot.Align align) {
        this.l = align;
        this.e.setAlign(align);
    }

    public final void setSexyCellBeforeSlots(List<? extends Slot<?>> list) {
        this.i = list;
        this.e.setBefore(list != null ? new h.b(list) : null);
    }

    public final void setSexyCellMiddleSlots(List<? extends Slot<?>> list) {
        List H0;
        Slot slot;
        this.j = list;
        h.c cVar = null;
        if (list != null && (H0 = j5g.H0(list, 3)) != null && (slot = (Slot) j5g.b0(0, H0)) != null) {
            cVar = new h.c(slot, (Slot) j5g.b0(1, H0), (Slot) j5g.b0(2, H0));
        }
        this.e.setMiddle(cVar);
    }

    public final void setSexyCellSize(Slot.Size size) {
        this.m = size;
        this.e.setSize(size);
    }

    public final void setTitleAfterController(e eVar) {
        b bVar = this.g;
        if (bVar == null) {
            bVar = new b(getContext());
            this.g = bVar;
        }
        bVar.b.setTitleAfterViewController$foundation_release(eVar);
    }

    public VkCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ VkCell(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = Slot.Align.Middle;
        this.m = Slot.Size.M;
        h hVar = new h(context);
        hVar.setId(R.id.ds_internal_sexy_cell);
        hVar.setClipChildren(false);
        setMinHeightAndVerticalPaddings(hVar);
        this.e = hVar;
        addView(hVar);
        this.e = hVar;
    }

    /* compiled from: VkCell.kt */
    public static final class a implements Slot<Object> {
        public final VkCellLeft b;

        public a(Context context) {
            this.b = new VkCellLeft(context, null, 6);
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }

    /* compiled from: VkCell.kt */
    public static final class b implements Slot<Object> {
        public final xiu0 b;

        public b(Context context) {
            this.b = new xiu0(context);
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }

    /* compiled from: VkCell.kt */
    public static final class c implements Slot<Object> {
        public final VkCellRight b;

        public c(Context context) {
            this.b = new VkCellRight(context, null, 6);
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }

    public static /* synthetic */ void getSexyCellAfterSlots$annotations() {
    }

    public static /* synthetic */ void getSexyCellAlign$annotations() {
    }

    public static /* synthetic */ void getSexyCellBeforeSlots$annotations() {
    }

    public static /* synthetic */ void getSexyCellMiddleSlots$annotations() {
    }

    public static /* synthetic */ void getSexyCellSize$annotations() {
    }
}
