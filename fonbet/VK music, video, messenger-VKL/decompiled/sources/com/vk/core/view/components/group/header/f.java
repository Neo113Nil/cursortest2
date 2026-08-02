package com.vk.core.view.components.group.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.group.header.a;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.chromium.base.version_info.VersionConstants;
import xsna.cti;
import xsna.d7s0;
import xsna.dcy;
import xsna.e3m;
import xsna.f4m;
import xsna.fpf0;
import xsna.hbh0;
import xsna.imi0;
import xsna.ixu0;
import xsna.izs;
import xsna.j3g;
import xsna.jl4;
import xsna.m360;
import xsna.msy;
import xsna.n9x;
import xsna.ozl;
import xsna.q770;
import xsna.rme0;
import xsna.s3q0;
import xsna.slh0;
import xsna.sp;
import xsna.ssi;
import xsna.t9b;
import xsna.vht;
import xsna.vjv0;
import xsna.vu5;
import xsna.x1o0;
import xsna.xfb0;

/* compiled from: VkGroupHeaderSkeleton.kt */
/* loaded from: classes17.dex */
public final class f extends FrameLayout implements vjv0 {
    public final ThemableShimmer b;
    public VkGroupHeader.Size c;
    public a d;
    public c e;
    public b f;
    public com.vk.core.view.components.skeleton.a g;
    public boolean h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    /* compiled from: VkGroupHeaderSkeleton.kt */
    @imi0
    public interface a {
        public static final C0846a Companion = C0846a.a;

        /* compiled from: VkGroupHeaderSkeleton.kt */
        /* renamed from: com.vk.core.view.components.group.header.f$a$a, reason: collision with other inner class name */
        public static final class C0846a {
            public static final /* synthetic */ C0846a a = new C0846a();

            public final KSerializer<a> serializer() {
                return new slh0("com.vk.core.view.components.group.header.VkGroupHeaderSkeleton.Left", fpf0.a(a.class), new dcy[]{fpf0.a(b.class)}, new KSerializer[]{b.C0847a.a}, new Annotation[0]);
            }
        }

        /* compiled from: VkGroupHeaderSkeleton.kt */
        @imi0
        public static final class b implements a {
            public static final C0848b Companion = new C0848b();
            public final int a;

            /* compiled from: VkGroupHeaderSkeleton.kt */
            @ozl
            /* renamed from: com.vk.core.view.components.group.header.f$a$b$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0847a implements vht<b> {
                public static final C0847a a;
                private static final SerialDescriptor descriptor;

                static {
                    C0847a c0847a = new C0847a();
                    a = c0847a;
                    xfb0 xfb0Var = new xfb0("com.vk.core.view.components.group.header.VkGroupHeaderSkeleton.Left.Icon", c0847a, 1);
                    xfb0Var.j("iconSize", false);
                    descriptor = xfb0Var;
                }

                @Override // xsna.vht
                public final KSerializer<?>[] childSerializers() {
                    return new KSerializer[]{n9x.a};
                }

                @Override // xsna.a3m
                public final Object deserialize(Decoder decoder) {
                    SerialDescriptor serialDescriptor = descriptor;
                    ssi d = decoder.d(serialDescriptor);
                    boolean z = true;
                    int i = 0;
                    int i2 = 0;
                    while (z) {
                        int m = d.m(serialDescriptor);
                        if (m == -1) {
                            z = false;
                        } else {
                            if (m != 0) {
                                throw new UnknownFieldException(m);
                            }
                            i2 = d.s(serialDescriptor, 0);
                            i = 1;
                        }
                    }
                    d.e(serialDescriptor);
                    return new b(i, i2);
                }

                @Override // xsna.mmi0, xsna.a3m
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // xsna.mmi0
                public final void serialize(Encoder encoder, Object obj) {
                    SerialDescriptor serialDescriptor = descriptor;
                    cti d = encoder.d(serialDescriptor);
                    d.M(0, ((b) obj).a, serialDescriptor);
                    d.e(serialDescriptor);
                }

                @Override // xsna.vht
                public final KSerializer<?>[] typeParametersSerializers() {
                    return x1o0.c;
                }
            }

            /* compiled from: VkGroupHeaderSkeleton.kt */
            /* renamed from: com.vk.core.view.components.group.header.f$a$b$b, reason: collision with other inner class name */
            public static final class C0848b {
                public final KSerializer<b> serializer() {
                    return C0847a.a;
                }
            }

            public /* synthetic */ b(int i, int i2) {
                if (1 == (i & 1)) {
                    this.a = i2;
                } else {
                    sp.x(i, 1, C0847a.a.getDescriptor());
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Icon(iconSize="), this.a, ')');
            }

            public b() {
                this.a = 28;
            }
        }
    }

    /* compiled from: VkGroupHeaderSkeleton.kt */
    @imi0
    public static final class b {
        public static final C0849b Companion = new C0849b();
        public final int a;

        /* compiled from: VkGroupHeaderSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.group.header.VkGroupHeaderSkeleton.Subtitle", aVar, 1);
                xfb0Var.j("singleLineWidth", true);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{n9x.a};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else {
                        if (m != 0) {
                            throw new UnknownFieldException(m);
                        }
                        i2 = d.s(serialDescriptor, 0);
                        i = 1;
                    }
                }
                d.e(serialDescriptor);
                return new b(i, i2);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                int i = ((b) obj).a;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                C0849b c0849b = b.Companion;
                if (d.z() || i != 80) {
                    d.M(0, i, serialDescriptor);
                }
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkGroupHeaderSkeleton.kt */
        /* renamed from: com.vk.core.view.components.group.header.f$b$b, reason: collision with other inner class name */
        public static final class C0849b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, int i2) {
            if ((i & 1) == 0) {
                this.a = 80;
            } else {
                this.a = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Subtitle(singleLineWidth="), this.a, ')');
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this.a = 80;
        }
    }

    /* compiled from: VkGroupHeaderSkeleton.kt */
    @imi0
    public static final class c {
        public static final b Companion = new b();
        public final int a;

        /* compiled from: VkGroupHeaderSkeleton.kt */
        @ozl
        public static final /* synthetic */ class a implements vht<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                xfb0 xfb0Var = new xfb0("com.vk.core.view.components.group.header.VkGroupHeaderSkeleton.Title", aVar, 1);
                xfb0Var.j("singleLineWidth", true);
                descriptor = xfb0Var;
            }

            @Override // xsna.vht
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{n9x.a};
            }

            @Override // xsna.a3m
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ssi d = decoder.d(serialDescriptor);
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    int m = d.m(serialDescriptor);
                    if (m == -1) {
                        z = false;
                    } else {
                        if (m != 0) {
                            throw new UnknownFieldException(m);
                        }
                        i2 = d.s(serialDescriptor, 0);
                        i = 1;
                    }
                }
                d.e(serialDescriptor);
                return new c(i, i2);
            }

            @Override // xsna.mmi0, xsna.a3m
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // xsna.mmi0
            public final void serialize(Encoder encoder, Object obj) {
                int i = ((c) obj).a;
                SerialDescriptor serialDescriptor = descriptor;
                cti d = encoder.d(serialDescriptor);
                b bVar = c.Companion;
                if (d.z() || i != 140) {
                    d.M(0, i, serialDescriptor);
                }
                d.e(serialDescriptor);
            }

            @Override // xsna.vht
            public final KSerializer<?>[] typeParametersSerializers() {
                return x1o0.c;
            }
        }

        /* compiled from: VkGroupHeaderSkeleton.kt */
        public static final class b {
            public final KSerializer<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, int i2) {
            if ((i & 1) == 0) {
                this.a = VersionConstants.PRODUCT_MAJOR_VERSION;
            } else {
                this.a = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Title(singleLineWidth="), this.a, ')');
        }

        public c() {
            this(0);
        }

        public c(int i) {
            this.a = VersionConstants.PRODUCT_MAJOR_VERSION;
        }
    }

    /* compiled from: VkGroupHeaderSkeleton.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkGroupHeader.Size.values().length];
            try {
                iArr[VkGroupHeader.Size.ExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkGroupHeader.Size.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkGroupHeader.Size.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkGroupHeader.Size.Small.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(Context context) {
        super(context, null, 0);
        this.b = new ThemableShimmer.a(context).a();
        this.c = VkGroupHeader.Size.Large;
        this.g = new a.C0863a(this);
        j3g j3gVar = new j3g(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, j3gVar);
        this.j = msy.a(lazyThreadSafetyMode, new rme0(context, 22));
        this.k = msy.a(lazyThreadSafetyMode, new q770(context, 1));
        this.l = msy.a(lazyThreadSafetyMode, new d7s0(5, context, this));
        this.m = msy.a(lazyThreadSafetyMode, new jl4(27, context, this));
        this.n = msy.a(lazyThreadSafetyMode, new t9b(23, context, this));
        getContentLayout().addView(getLeftLayout());
        getContentLayout().addView(getMiddleLayout());
        addView(getContentLayout());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getContentLayout() {
        return (LinearLayout) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSkeleton getLeftIconSkeletonView() {
        return (VkSkeleton) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getLeftLayout() {
        return (LinearLayout) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getMiddleLayout() {
        return (LinearLayout) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkTextSkeleton getSubtitleSkeletonView() {
        return (VkTextSkeleton) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkTextSkeleton getTitleSkeletonView() {
        return (VkTextSkeleton) this.m.getValue();
    }

    public final void a(izs<? super vjv0, s3q0> izsVar) {
        if (findViewById(R.id.ds_internal_group_header_left_icon) != null) {
            izsVar.invoke(getLeftIconSkeletonView());
        }
        if (findViewById(R.id.ds_internal_group_header_title) != null) {
            izsVar.invoke(getTitleSkeletonView());
        }
        if (findViewById(R.id.ds_internal_group_header_subtitle) != null) {
            izsVar.invoke(getSubtitleSkeletonView());
        }
    }

    public final void b() {
        getMiddleLayout().removeAllViews();
        c cVar = this.e;
        if (cVar != null) {
            VkTextSkeleton titleSkeletonView = getTitleSkeletonView();
            titleSkeletonView.setVisibility(0);
            titleSkeletonView.setLayoutParams(new LinearLayout.LayoutParams(hbh0.b(cVar.a, titleSkeletonView.getContext()), -2));
            getMiddleLayout().addView(getTitleSkeletonView());
        }
        b bVar = this.f;
        if (bVar != null) {
            VkTextSkeleton subtitleSkeletonView = getSubtitleSkeletonView();
            subtitleSkeletonView.setVisibility(0);
            subtitleSkeletonView.setLayoutParams(new LinearLayout.LayoutParams(hbh0.b(bVar.a, subtitleSkeletonView.getContext()), -2));
            getMiddleLayout().addView(getSubtitleSkeletonView());
        }
    }

    public final void c() {
        c cVar = this.e;
        int i = 0;
        boolean z = cVar != null && this.f == null;
        boolean z2 = (cVar == null || this.f == null) ? false : true;
        LinearLayout contentLayout = getContentLayout();
        if (z) {
            i = hbh0.b(46, getContext());
        } else if (z2) {
            int i2 = d.$EnumSwitchMapping$0[this.c.ordinal()];
            if (i2 == 1) {
                i = hbh0.b(62, getContext());
            } else if (i2 == 2) {
                i = hbh0.b(60, getContext());
            } else if (i2 == 3) {
                i = hbh0.b(53, getContext());
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = hbh0.b(50, getContext());
            }
        }
        contentLayout.setMinimumHeight(i);
    }

    public final void d() {
        VkGroupHeader.Size size;
        int i;
        int i2 = d.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i2 == 1) {
            size = VkGroupHeader.Size.ExtraLarge;
        } else if (i2 == 2) {
            size = VkGroupHeader.Size.Large;
        } else if (i2 == 3) {
            size = VkGroupHeader.Size.Medium;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            size = VkGroupHeader.Size.Small;
        }
        if (this.e != null) {
            VkTextSkeleton titleSkeletonView = getTitleSkeletonView();
            Context context = getContext();
            int i3 = a.C0845a.$EnumSwitchMapping$0[size.ordinal()];
            if (i3 == 1) {
                i = R.attr.vk_ui_typography_display_title2;
            } else if (i3 == 2) {
                i = R.attr.vk_ui_typography_display_title3;
            } else if (i3 == 3) {
                i = R.attr.vk_ui_typography_headline1;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.attr.vk_ui_typography_footnote_caps;
            }
            titleSkeletonView.setTextAppearance(e3m.g(i, context));
        }
        if (this.f != null) {
            VkTextSkeleton subtitleSkeletonView = getSubtitleSkeletonView();
            Context context2 = getContext();
            int i4 = a.C0845a.$EnumSwitchMapping$0[size.ordinal()];
            int i5 = R.attr.vk_ui_typography_subhead;
            if (i4 != 1 && i4 != 2) {
                i5 = R.attr.vk_ui_typography_caption1;
                if (i4 != 3 && i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            subtitleSkeletonView.setTextAppearance(e3m.g(i5, context2));
        }
    }

    public com.vk.core.view.components.skeleton.a getArea() {
        return this.g;
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.d;
    }

    public boolean getShimmerManagedExternally() {
        return this.h;
    }

    public final VkGroupHeader.Size getSize() {
        return this.c;
    }

    public final b getSubtitle() {
        return this.f;
    }

    public final c getTitle() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally() || (valueAnimator = this.b.u) == null) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        ThemableShimmer themableShimmer = this.b;
        if (i == 0) {
            themableShimmer.b();
        } else if (i == 4 || i == 8) {
            themableShimmer.c();
        }
    }

    @Override // xsna.vjv0
    public void setArea(com.vk.core.view.components.skeleton.a aVar) {
        this.g = aVar;
        a(new ixu0(aVar, 0));
    }

    public final void setLeft(a aVar) {
        this.d = aVar;
        if (aVar == null) {
            f4m.j(getLeftLayout());
        } else {
            getLeftLayout().removeAllViews();
            if (aVar instanceof a.b) {
                VkSkeleton leftIconSkeletonView = getLeftIconSkeletonView();
                leftIconSkeletonView.setType(VkSkeleton.a.b.a);
                int i = ((a.b) aVar).a;
                leftIconSkeletonView.setLayoutParams(new LinearLayout.LayoutParams(hbh0.b(i, leftIconSkeletonView.getContext()), hbh0.b(i, leftIconSkeletonView.getContext())));
                leftIconSkeletonView.setArea(getArea());
                getLeftLayout().addView(getLeftIconSkeletonView());
                getLeftLayout().setVisibility(0);
            }
        }
        c();
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        a(new m360(themableShimmer, 29));
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.h = z;
    }

    public final void setSize(VkGroupHeader.Size size) {
        this.c = size;
        d();
    }

    public final void setSubtitle(b bVar) {
        this.f = bVar;
        b();
        c();
        d();
    }

    public final void setTitle(c cVar) {
        this.e = cVar;
        b();
        c();
        d();
    }
}
