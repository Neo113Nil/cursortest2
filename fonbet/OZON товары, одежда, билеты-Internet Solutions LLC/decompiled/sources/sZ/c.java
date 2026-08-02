package sZ;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import c8.C5766e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class c<Type extends ComponentCallbacksC5392m> extends AbstractC9643a<Type> {

    @NotNull
    public static final a Companion = new a();
    private final boolean addFragmentToBackStack;
    private final boolean addInBackStack;

    @NotNull
    private final String formattedDeeplink;

    @NotNull
    private final Type fragment;
    private final boolean isAnchor;
    private final boolean isAnchorInDeeplink;
    private final boolean isAnchorRefreshRequired;
    private final boolean isReorderingAllowed;

    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> navigator;

    @NotNull
    private final String path;
    private final Integer requestCode;

    @NotNull
    private final String tag;

    @NotNull
    private final b transitionAnimations;

    @NotNull
    private final Uri uri;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f98418a;

        /* renamed from: b, reason: collision with root package name */
        private final int f98419b;

        /* renamed from: c, reason: collision with root package name */
        private final int f98420c;

        /* renamed from: d, reason: collision with root package name */
        private final int f98421d;

        public b() {
            this(0, 0, 0, 15, 0);
        }

        public final int a() {
            return this.f98418a;
        }

        public final int b() {
            return this.f98419b;
        }

        public final int c() {
            return this.f98420c;
        }

        public final int d() {
            return this.f98421d;
        }

        public b(int i11, int i12, int i13, int i14) {
            this.f98418a = i11;
            this.f98419b = i12;
            this.f98420c = i13;
            this.f98421d = i14;
        }

        public /* synthetic */ b(int i11, int i12, int i13, int i14, int i15) {
            this((i14 & 1) != 0 ? 0 : i11, 0, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ c(java.lang.String r15, androidx.fragment.app.ComponentCallbacksC5392m r16, java.lang.Integer r17, boolean r18, boolean r19, sZ.c.b r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r14 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r17
        Lb:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L12
            r6 = r2
            goto L14
        L12:
            r6 = r18
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r7 = r2
            goto L1c
        L1a:
            r7 = r19
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L2c
            sZ.c$b r8 = new sZ.c$b
            r11 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r12 = 15
            r8.<init>(r9, r10, r11, r12, r13)
            goto L2e
        L2c:
            r8 = r20
        L2e:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L35
            r9 = r3
            goto L37
        L35:
            r9 = r21
        L37:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3d
            r10 = r3
            goto L3f
        L3d:
            r10 = r22
        L3f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L49
            r11 = r2
            r3 = r15
            r4 = r16
            r2 = r14
            goto L4f
        L49:
            r11 = r23
            r2 = r14
            r3 = r15
            r4 = r16
        L4f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sZ.c.<init>(java.lang.String, androidx.fragment.app.m, java.lang.Integer, boolean, boolean, sZ.c$b, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, String str, ComponentCallbacksC5392m componentCallbacksC5392m, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            componentCallbacksC5392m = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            bool = null;
        }
        if ((i11 & 16) != 0) {
            bool2 = null;
        }
        if ((i11 & 32) != 0) {
            bool3 = null;
        }
        if ((i11 & 64) != 0) {
            bool4 = null;
        }
        return cVar.copy(str, componentCallbacksC5392m, num, bool, bool2, bool3, bool4);
    }

    @NotNull
    public final c<Type> copy(String str, Type type, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (str == null) {
            str = this.tag;
        }
        String str2 = str;
        if (type == null) {
            type = getFragment();
        }
        Type type2 = type;
        if (num == null) {
            num = this.requestCode;
        }
        return new c<>(str2, type2, num, bool != null ? bool.booleanValue() : this.addInBackStack, bool2 != null ? bool2.booleanValue() : this.addFragmentToBackStack, null, false, bool3 != null ? bool3.booleanValue() : this.isAnchor, bool4 != null ? bool4.booleanValue() : this.isAnchorRefreshRequired, 96, null);
    }

    @Override // pZ.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.compass.fragment.FragmentDestination<*>");
        c cVar = (c) obj;
        return Intrinsics.d(this.tag, cVar.tag) && Intrinsics.d(getFragment(), cVar.getFragment()) && Intrinsics.d(this.requestCode, cVar.requestCode) && this.addInBackStack == cVar.addInBackStack && this.addFragmentToBackStack == cVar.addFragmentToBackStack && Intrinsics.d(this.formattedDeeplink, cVar.formattedDeeplink) && Intrinsics.d(this.path, cVar.path) && this.isAnchorInDeeplink == cVar.isAnchorInDeeplink && this.isAnchor == cVar.isAnchor && this.isAnchorRefreshRequired == cVar.isAnchorRefreshRequired;
    }

    public final boolean getAddFragmentToBackStack() {
        return this.addFragmentToBackStack;
    }

    public final boolean getAddInBackStack() {
        return this.addInBackStack;
    }

    @NotNull
    public Type getFragment() {
        return this.fragment;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final b getTransitionAnimations() {
        return this.transitionAnimations;
    }

    @Override // pZ.f
    public int hashCode() {
        int hashCode = (getFragment().hashCode() + g.a(super.hashCode() * 31, 31, this.tag)) * 31;
        Integer num = this.requestCode;
        return Boolean.hashCode(this.isAnchorRefreshRequired) + C3532b.a(C3532b.a(g.a(g.a(C3532b.a(C3532b.a((hashCode + (num != null ? num.intValue() : 0)) * 31, 31, this.addInBackStack), 31, this.addFragmentToBackStack), 31, this.formattedDeeplink), 31, this.path), 31, this.isAnchorInDeeplink), 31, this.isAnchor);
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isAnchorRefreshRequired() {
        return this.isAnchorRefreshRequired;
    }

    public final boolean isReorderingAllowed() {
        return this.isReorderingAllowed;
    }

    @NotNull
    public String toString() {
        String str = this.tag;
        Type fragment = getFragment();
        Integer num = this.requestCode;
        boolean z11 = this.addInBackStack;
        boolean z12 = this.addFragmentToBackStack;
        String str2 = this.formattedDeeplink;
        String str3 = this.path;
        boolean z13 = this.isAnchorInDeeplink;
        boolean z14 = this.isAnchor;
        boolean z15 = this.isAnchorRefreshRequired;
        StringBuilder sb2 = new StringBuilder("FragmentDestination(tag='");
        sb2.append(str);
        sb2.append("', fragment=");
        sb2.append(fragment);
        sb2.append(", requestCode=");
        sb2.append(num);
        sb2.append(", addInBackStack=");
        sb2.append(z11);
        sb2.append(", addFragmentToBackStack=");
        C5766e.a(", formattedDeeplink='", str2, "', path='", sb2, z12);
        C2880a.c(str3, "', isAnchorInDeeplink=", ", isAnchor=", sb2, z13);
        sb2.append(z14);
        sb2.append(", isAnchorRefreshRequired=");
        sb2.append(z15);
        sb2.append(")");
        return sb2.toString();
    }

    public c(@NotNull String tag, @NotNull Type fragment, Integer num, boolean z11, boolean z12, @NotNull b transitionAnimations, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(transitionAnimations, "transitionAnimations");
        this.tag = tag;
        this.fragment = fragment;
        this.requestCode = num;
        this.addInBackStack = z11;
        this.addFragmentToBackStack = z12;
        this.transitionAnimations = transitionAnimations;
        this.isReorderingAllowed = z13;
        this.navigator = N.b(d.class);
        String b11 = PZ.a.b(tag, false);
        this.formattedDeeplink = b11;
        Uri parse = Uri.parse(b11);
        this.uri = parse;
        boolean booleanQueryParameter = parse.isHierarchical() ? parse.getBooleanQueryParameter("anchor", false) : false;
        this.isAnchorInDeeplink = booleanQueryParameter;
        String uri = parse.buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.path = uri;
        this.isAnchor = booleanQueryParameter || z14;
        this.isAnchorRefreshRequired = booleanQueryParameter || z15;
    }
}
