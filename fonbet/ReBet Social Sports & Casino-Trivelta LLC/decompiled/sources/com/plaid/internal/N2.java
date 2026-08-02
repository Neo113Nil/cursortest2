package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.A;
import com.plaid.internal.EnumC3612d7;
import com.plaid.internal.M0;
import com.plaid.internal.r8;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.twilio.voice.EventKeys;
import di.C4087f;
import di.C4093i;
import di.C4125y0;
import di.N;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.d
@Zh.n
/* loaded from: classes3.dex */
public abstract class N2 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<InterfaceC1901b> f39388a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) c.f39400a);

    public static final class c extends Lambda implements Function0<InterfaceC1901b> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39400a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC1901b invoke() {
            return new Zh.l("com.plaid.internal.workflow.model.LinkState", Reflection.getOrCreateKotlinClass(N2.class), new KClass[]{Reflection.getOrCreateKotlinClass(a.class), Reflection.getOrCreateKotlinClass(b.class), Reflection.getOrCreateKotlinClass(d.class), Reflection.getOrCreateKotlinClass(e.class), Reflection.getOrCreateKotlinClass(i.class), Reflection.getOrCreateKotlinClass(j.class), Reflection.getOrCreateKotlinClass(k.class), Reflection.getOrCreateKotlinClass(l.class)}, new InterfaceC1901b[]{a.C0546a.f39392a, b.a.f39398a, d.a.f39405a, e.a.f39410a, i.a.f39423a, new C4125y0("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f39425b, new Annotation[0]), k.a.f39440a, l.a.f39451a}, new Annotation[0]);
        }
    }

    public interface f {
        @NotNull
        String b();

        @NotNull
        List<r8> d();

        @NotNull
        r8 e();
    }

    public interface g {
        @NotNull
        String a();
    }

    public interface h {
        @NotNull
        String c();
    }

    @Zh.n
    public static final class j extends N2 {

        @NotNull
        public static final Parcelable.Creator<j> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f39425b = new j();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f39426c = "";

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f39427d = "";

        public static final class a extends Lambda implements Function0<InterfaceC1901b> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f39428a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC1901b invoke() {
                return new C4125y0("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", j.f39425b, new Annotation[0]);
            }
        }

        public static final class b implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return j.f39425b;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i10) {
                return new j[i10];
            }
        }

        static {
            LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f39428a);
            CREATOR = new b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return f39426c;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return f39427d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public N2() {
    }

    @NotNull
    public final r8 f() {
        if (this instanceof a) {
            r8.CREATOR.getClass();
            return r8.f41036e;
        }
        if (this instanceof b) {
            r8.CREATOR.getClass();
            return r8.f41036e;
        }
        if (this instanceof l) {
            return ((l) this).f39447f;
        }
        if (this instanceof i) {
            return ((i) this).f39414c;
        }
        if (Intrinsics.areEqual(this, j.f39425b)) {
            r8.CREATOR.getClass();
            return r8.f41036e;
        }
        if (this instanceof e) {
            r8.CREATOR.getClass();
            return r8.f41036e;
        }
        if (this instanceof k) {
            r8.CREATOR.getClass();
            return r8.f41036e;
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        r8.CREATOR.getClass();
        return r8.f41036e;
    }

    @NotNull
    public abstract String g();

    @NotNull
    public abstract String h();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ N2(int i10) {
    }

    @Zh.n
    public static final class e extends N2 {

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39407b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinkExit f39408c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39409d;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39410a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39411b;

            static {
                a aVar = new a();
                f39410a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                j02.n("workflowId", false);
                j02.n("linkOpenId", true);
                f39411b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{z02, z02};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                String str;
                String str2;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39411b;
                ci.c c10 = decoder.c(j02);
                if (c10.q()) {
                    str = c10.s(j02, 0);
                    str2 = c10.s(j02, 1);
                    i10 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int e10 = c10.e(j02);
                        if (e10 == -1) {
                            z10 = false;
                        } else if (e10 == 0) {
                            str = c10.s(j02, 0);
                            i11 |= 1;
                        } else {
                            if (e10 != 1) {
                                throw new Zh.B(e10);
                            }
                            str3 = c10.s(j02, 1);
                            i11 |= 2;
                        }
                    }
                    str2 = str3;
                    i10 = i11;
                }
                c10.b(j02);
                return new e(i10, str, str2);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39411b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                e value = (e) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39411b;
                ci.d c10 = encoder.c(j02);
                c10.G(j02, 0, value.f39407b);
                if (c10.m(j02, 1) || !Intrinsics.areEqual(value.f39409d, "")) {
                    c10.G(j02, 1, value.f39409d);
                }
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new e(parcel.readString(), LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(@NotNull String workflowId, @NotNull LinkExit linkExit) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(linkExit, "linkExit");
            this.f39407b = workflowId;
            this.f39408c = linkExit;
            this.f39409d = "";
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f39407b, eVar.f39407b) && Intrinsics.areEqual(this.f39408c, eVar.f39408c);
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39409d;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39407b;
        }

        public final int hashCode() {
            return this.f39408c.hashCode() + (this.f39407b.hashCode() * 31);
        }

        @NotNull
        public final LinkExit i() {
            return this.f39408c;
        }

        @NotNull
        public final String toString() {
            return "Exit(workflowId=" + this.f39407b + ", linkExit=" + this.f39408c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39407b);
            this.f39408c.writeToParcel(out, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public e(int i10, String str, String str2) {
            super(0);
            if (1 != (i10 & 1)) {
                di.F0.a(i10, 1, a.f39411b);
            }
            this.f39407b = str;
            LinkExitMetadata metadata = L2.a(31, (String) null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f39408c = new LinkExit(null, metadata);
            if ((i10 & 2) == 0) {
                this.f39409d = "";
            } else {
                this.f39409d = str2;
            }
        }
    }

    @Zh.n
    public static final class a extends N2 {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final M0 f39389b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f39390c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39391d;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        /* renamed from: com.plaid.internal.N2$a$a, reason: collision with other inner class name */
        public static final class C0546a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0546a f39392a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39393b;

            static {
                C0546a c0546a = new C0546a();
                f39392a = c0546a;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.BeforeEmbeddedTransition", c0546a, 3);
                j02.n("embeddedSessionInfo", false);
                j02.n("workflowId", true);
                j02.n("linkOpenId", true);
                f39393b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{M0.a.f39367a, z02, z02};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                int i10;
                M0 m02;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39393b;
                ci.c c10 = decoder.c(j02);
                M0 m03 = null;
                if (c10.q()) {
                    m02 = (M0) c10.i(j02, 0, M0.a.f39367a, null);
                    str = c10.s(j02, 1);
                    str2 = c10.s(j02, 2);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String str3 = null;
                    String str4 = null;
                    while (z10) {
                        int e10 = c10.e(j02);
                        if (e10 == -1) {
                            z10 = false;
                        } else if (e10 == 0) {
                            m03 = (M0) c10.i(j02, 0, M0.a.f39367a, m03);
                            i11 |= 1;
                        } else if (e10 == 1) {
                            str3 = c10.s(j02, 1);
                            i11 |= 2;
                        } else {
                            if (e10 != 2) {
                                throw new Zh.B(e10);
                            }
                            str4 = c10.s(j02, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    m02 = m03;
                    str = str3;
                    str2 = str4;
                }
                c10.b(j02);
                return new a(i10, m02, str, str2);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39393b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                a value = (a) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39393b;
                ci.d c10 = encoder.c(j02);
                Parcelable.Creator<a> creator = a.CREATOR;
                c10.B(j02, 0, M0.a.f39367a, value.f39389b);
                if (c10.m(j02, 1) || !Intrinsics.areEqual(value.f39390c, "")) {
                    c10.G(j02, 1, value.f39390c);
                }
                if (c10.m(j02, 2) || !Intrinsics.areEqual(value.f39391d, value.f39389b.f39359b)) {
                    c10.G(j02, 2, value.f39391d);
                }
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(M0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(@NotNull M0 embeddedSessionInfo) {
            Intrinsics.checkNotNullParameter(embeddedSessionInfo, "embeddedSessionInfo");
            this.f39389b = embeddedSessionInfo;
            this.f39390c = "";
            this.f39391d = embeddedSessionInfo.f39359b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f39389b, ((a) obj).f39389b);
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39391d;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39390c;
        }

        public final int hashCode() {
            return this.f39389b.hashCode();
        }

        @NotNull
        public final M0 i() {
            return this.f39389b;
        }

        @NotNull
        public final String toString() {
            return "BeforeEmbeddedTransition(embeddedSessionInfo=" + this.f39389b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f39389b.writeToParcel(out, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public a(int i10, M0 m02, String str, String str2) {
            super(0);
            if (1 != (i10 & 1)) {
                di.F0.a(i10, 1, C0546a.f39393b);
            }
            this.f39389b = m02;
            this.f39390c = (i10 & 2) == 0 ? "" : str;
            if ((i10 & 4) == 0) {
                this.f39391d = m02.f39359b;
            } else {
                this.f39391d = str2;
            }
        }
    }

    @Zh.n
    public static final class b extends N2 implements g {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new C0547b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39394b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinkTokenConfiguration f39395c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39396d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f39397e;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39398a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39399b;

            static {
                a aVar = new a();
                f39398a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", aVar, 3);
                j02.n("linkOpenId", false);
                j02.n("workflowId", true);
                j02.n("oauthNonce", true);
                f39399b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{z02, z02, z02};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                String str;
                String str2;
                String str3;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39399b;
                ci.c c10 = decoder.c(j02);
                if (c10.q()) {
                    str = c10.s(j02, 0);
                    str3 = c10.s(j02, 1);
                    str2 = c10.s(j02, 2);
                    i10 = 7;
                } else {
                    str = null;
                    String str4 = null;
                    String str5 = null;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int e10 = c10.e(j02);
                        if (e10 == -1) {
                            z10 = false;
                        } else if (e10 == 0) {
                            str = c10.s(j02, 0);
                            i11 |= 1;
                        } else if (e10 == 1) {
                            str5 = c10.s(j02, 1);
                            i11 |= 2;
                        } else {
                            if (e10 != 2) {
                                throw new Zh.B(e10);
                            }
                            str4 = c10.s(j02, 2);
                            i11 |= 4;
                        }
                    }
                    str2 = str4;
                    str3 = str5;
                    i10 = i11;
                }
                c10.b(j02);
                return new b(i10, str, str3, str2);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39399b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r3) == false) goto L13;
             */
            @Override // Zh.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void serialize(ci.f encoder, Object obj) {
                b value = (b) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39399b;
                ci.d c10 = encoder.c(j02);
                c10.G(j02, 0, value.f39394b);
                if (c10.m(j02, 1) || !Intrinsics.areEqual(value.f39396d, "")) {
                    c10.G(j02, 1, value.f39396d);
                }
                if (!c10.m(j02, 2)) {
                    String str = value.f39397e;
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                }
                c10.G(j02, 2, value.f39397e);
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        /* renamed from: com.plaid.internal.N2$b$b, reason: collision with other inner class name */
        public static final class C0547b implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), LinkTokenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(@NotNull String linkOpenId, @NotNull LinkTokenConfiguration configuration) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f39394b = linkOpenId;
            this.f39395c = configuration;
            this.f39396d = "";
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            this.f39397e = uuid;
        }

        @Override // com.plaid.internal.N2.g
        @NotNull
        public final String a() {
            return this.f39397e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f39394b, bVar.f39394b) && Intrinsics.areEqual(this.f39395c, bVar.f39395c);
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39394b;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39396d;
        }

        public final int hashCode() {
            return this.f39395c.hashCode() + (this.f39394b.hashCode() * 31);
        }

        @NotNull
        public final LinkTokenConfiguration i() {
            return this.f39395c;
        }

        @NotNull
        public final String toString() {
            return "BeforeLinkOpen(linkOpenId=" + this.f39394b + ", configuration=" + this.f39395c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39394b);
            this.f39395c.writeToParcel(out, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public b(int i10, String str, String str2, String str3) {
            super(0);
            if (1 != (i10 & 1)) {
                di.F0.a(i10, 1, a.f39399b);
            }
            this.f39394b = str;
            this.f39395c = new LinkTokenConfiguration.Builder().build();
            if ((i10 & 2) == 0) {
                this.f39396d = "";
            } else {
                this.f39396d = str2;
            }
            if ((i10 & 4) != 0) {
                this.f39397e = str3;
                return;
            }
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            this.f39397e = uuid;
        }
    }

    @Zh.n
    public static final class d extends N2 implements h {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39401b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f39402c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39403d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f39404e;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39405a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39406b;

            static {
                a aVar = new a();
                f39405a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.CompleteOutOfProcess", aVar, 4);
                j02.n("linkOpenId", false);
                j02.n("workflowId", false);
                j02.n("requestId", false);
                j02.n("userClosedOutOfProcess", false);
                f39406b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{z02, z02, z02, C4093i.f45370a};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                String str;
                boolean z10;
                String str2;
                String str3;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39406b;
                ci.c c10 = decoder.c(j02);
                if (c10.q()) {
                    str = c10.s(j02, 0);
                    String s10 = c10.s(j02, 1);
                    String s11 = c10.s(j02, 2);
                    z10 = c10.t(j02, 3);
                    str2 = s11;
                    str3 = s10;
                    i10 = 15;
                } else {
                    str = null;
                    String str4 = null;
                    String str5 = null;
                    boolean z11 = true;
                    boolean z12 = false;
                    int i11 = 0;
                    while (z11) {
                        int e10 = c10.e(j02);
                        if (e10 == -1) {
                            z11 = false;
                        } else if (e10 == 0) {
                            str = c10.s(j02, 0);
                            i11 |= 1;
                        } else if (e10 == 1) {
                            str5 = c10.s(j02, 1);
                            i11 |= 2;
                        } else if (e10 == 2) {
                            str4 = c10.s(j02, 2);
                            i11 |= 4;
                        } else {
                            if (e10 != 3) {
                                throw new Zh.B(e10);
                            }
                            z12 = c10.t(j02, 3);
                            i11 |= 8;
                        }
                    }
                    z10 = z12;
                    str2 = str4;
                    str3 = str5;
                    i10 = i11;
                }
                String str6 = str;
                c10.b(j02);
                return new d(i10, str6, str3, str2, z10);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39406b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                d value = (d) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39406b;
                ci.d c10 = encoder.c(j02);
                c10.G(j02, 0, value.f39401b);
                c10.G(j02, 1, value.f39402c);
                c10.G(j02, 2, value.f39403d);
                c10.F(j02, 3, value.f39404e);
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(@NotNull String linkOpenId, @NotNull String workflowId, @NotNull String requestId, boolean z10) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f39401b = linkOpenId;
            this.f39402c = workflowId;
            this.f39403d = requestId;
            this.f39404e = z10;
        }

        @Override // com.plaid.internal.N2.h
        @NotNull
        public final String c() {
            return this.f39403d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39401b;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39402c;
        }

        public final boolean i() {
            return this.f39404e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39401b);
            out.writeString(this.f39402c);
            out.writeString(this.f39403d);
            out.writeInt(this.f39404e ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public d(int i10, String str, String str2, String str3, boolean z10) {
            super(0);
            if (15 != (i10 & 15)) {
                di.F0.a(i10, 15, a.f39406b);
            }
            this.f39401b = str;
            this.f39402c = str2;
            this.f39403d = str3;
            this.f39404e = z10;
        }
    }

    @Zh.n
    public static final class l extends N2 implements f, h, g {

        @NotNull
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* renamed from: j, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final InterfaceC1901b[] f39442j;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39443b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f39444c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39445d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f39446e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public final r8 f39447f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<r8> f39448g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public final List<r8> f39449h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f39450i;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39451a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39452b;

            static {
                a aVar = new a();
                f39451a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                j02.n("linkOpenId", false);
                j02.n("workflowId", false);
                j02.n("continuationToken", false);
                j02.n("oauthNonce", false);
                j02.n("currentPane", false);
                j02.n("additionalPanes", false);
                j02.n("backstack", false);
                j02.n("requestId", false);
                f39452b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                InterfaceC1901b[] interfaceC1901bArr = l.f39442j;
                InterfaceC1901b interfaceC1901b = interfaceC1901bArr[5];
                InterfaceC1901b interfaceC1901b2 = interfaceC1901bArr[6];
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{z02, z02, z02, z02, r8.a.f41041a, interfaceC1901b, interfaceC1901b2, z02};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                int i10;
                List list;
                List list2;
                r8 r8Var;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39452b;
                ci.c c10 = decoder.c(j02);
                InterfaceC1901b[] interfaceC1901bArr = l.f39442j;
                String str6 = null;
                if (c10.q()) {
                    String s10 = c10.s(j02, 0);
                    String s11 = c10.s(j02, 1);
                    String s12 = c10.s(j02, 2);
                    String s13 = c10.s(j02, 3);
                    r8 r8Var2 = (r8) c10.i(j02, 4, r8.a.f41041a, null);
                    List list3 = (List) c10.i(j02, 5, interfaceC1901bArr[5], null);
                    list = (List) c10.i(j02, 6, interfaceC1901bArr[6], null);
                    str = s10;
                    str5 = c10.s(j02, 7);
                    str4 = s13;
                    r8Var = r8Var2;
                    str3 = s12;
                    i10 = 255;
                    list2 = list3;
                    str2 = s11;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list4 = null;
                    List list5 = null;
                    r8 r8Var3 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    while (z10) {
                        int e10 = c10.e(j02);
                        switch (e10) {
                            case -1:
                                z10 = false;
                                break;
                            case 0:
                                i11 |= 1;
                                str6 = c10.s(j02, 0);
                                continue;
                            case 1:
                                i11 |= 2;
                                str7 = c10.s(j02, 1);
                                continue;
                            case 2:
                                i11 |= 4;
                                str8 = c10.s(j02, 2);
                                continue;
                            case 3:
                                str9 = c10.s(j02, 3);
                                i11 |= 8;
                                continue;
                            case 4:
                                r8Var3 = (r8) c10.i(j02, 4, r8.a.f41041a, r8Var3);
                                i11 |= 16;
                                break;
                            case 5:
                                list5 = (List) c10.i(j02, 5, interfaceC1901bArr[5], list5);
                                i11 |= 32;
                                break;
                            case 6:
                                list4 = (List) c10.i(j02, 6, interfaceC1901bArr[6], list4);
                                i11 |= 64;
                                break;
                            case 7:
                                str10 = c10.s(j02, 7);
                                i11 |= 128;
                                break;
                            default:
                                throw new Zh.B(e10);
                        }
                    }
                    i10 = i11;
                    list = list4;
                    list2 = list5;
                    r8Var = r8Var3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                }
                c10.b(j02);
                return new l(i10, str, str2, str3, str4, r8Var, list2, list, str5);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39452b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                l value = (l) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39452b;
                ci.d c10 = encoder.c(j02);
                InterfaceC1901b[] interfaceC1901bArr = l.f39442j;
                c10.G(j02, 0, value.f39443b);
                c10.G(j02, 1, value.f39444c);
                c10.G(j02, 2, value.f39445d);
                c10.G(j02, 3, value.f39446e);
                c10.B(j02, 4, r8.a.f41041a, value.f39447f);
                c10.B(j02, 5, interfaceC1901bArr[5], value.f39448g);
                c10.B(j02, 6, interfaceC1901bArr[6], value.f39449h);
                c10.G(j02, 7, value.f39450i);
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                r8 r8Var = (r8) parcel.readParcelable(l.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i11 = 0; i11 != readInt2; i11++) {
                    arrayList2.add(parcel.readParcelable(l.class.getClassLoader()));
                }
                return new l(readString, readString2, readString3, readString4, r8Var, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i10) {
                return new l[i10];
            }
        }

        static {
            r8.a aVar = r8.a.f41041a;
            f39442j = new InterfaceC1901b[]{null, null, null, null, null, new C4087f(aVar), new C4087f(aVar), null};
        }

        public l(@NotNull String linkOpenId, @NotNull String workflowId, @NotNull String continuationToken, @NotNull String oauthNonce, @NotNull r8 currentPane, @NotNull List<r8> additionalPanes, @NotNull List<r8> backstack, @NotNull String requestId) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
            Intrinsics.checkNotNullParameter(oauthNonce, "oauthNonce");
            Intrinsics.checkNotNullParameter(currentPane, "currentPane");
            Intrinsics.checkNotNullParameter(additionalPanes, "additionalPanes");
            Intrinsics.checkNotNullParameter(backstack, "backstack");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f39443b = linkOpenId;
            this.f39444c = workflowId;
            this.f39445d = continuationToken;
            this.f39446e = oauthNonce;
            this.f39447f = currentPane;
            this.f39448g = additionalPanes;
            this.f39449h = backstack;
            this.f39450i = requestId;
        }

        @Override // com.plaid.internal.N2.g
        @NotNull
        public final String a() {
            return this.f39446e;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final String b() {
            return this.f39445d;
        }

        @Override // com.plaid.internal.N2.h
        @NotNull
        public final String c() {
            return this.f39450i;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final List<r8> d() {
            return this.f39449h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final r8 e() {
            return this.f39447f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.f39443b, lVar.f39443b) && Intrinsics.areEqual(this.f39444c, lVar.f39444c) && Intrinsics.areEqual(this.f39445d, lVar.f39445d) && Intrinsics.areEqual(this.f39446e, lVar.f39446e) && Intrinsics.areEqual(this.f39447f, lVar.f39447f) && Intrinsics.areEqual(this.f39448g, lVar.f39448g) && Intrinsics.areEqual(this.f39449h, lVar.f39449h) && Intrinsics.areEqual(this.f39450i, lVar.f39450i);
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39443b;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39444c;
        }

        public final int hashCode() {
            return this.f39450i.hashCode() + ((this.f39449h.hashCode() + ((this.f39448g.hashCode() + ((this.f39447f.hashCode() + C3783x.a(this.f39446e, C3783x.a(this.f39445d, C3783x.a(this.f39444c, this.f39443b.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Workflow(linkOpenId=" + this.f39443b + ", workflowId=" + this.f39444c + ", continuationToken=" + this.f39445d + ", oauthNonce=" + this.f39446e + ", currentPane=" + this.f39447f + ", additionalPanes=" + this.f39448g + ", backstack=" + this.f39449h + ", requestId=" + this.f39450i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39443b);
            out.writeString(this.f39444c);
            out.writeString(this.f39445d);
            out.writeString(this.f39446e);
            out.writeParcelable(this.f39447f, i10);
            List<r8> list = this.f39448g;
            out.writeInt(list.size());
            Iterator<r8> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i10);
            }
            List<r8> list2 = this.f39449h;
            out.writeInt(list2.size());
            Iterator<r8> it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeParcelable(it2.next(), i10);
            }
            out.writeString(this.f39450i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public l(int i10, String str, String str2, String str3, String str4, r8 r8Var, List list, List list2, String str5) {
            super(0);
            if (255 != (i10 & 255)) {
                di.F0.a(i10, 255, a.f39452b);
            }
            this.f39443b = str;
            this.f39444c = str2;
            this.f39445d = str3;
            this.f39446e = str4;
            this.f39447f = r8Var;
            this.f39448g = list;
            this.f39449h = list2;
            this.f39450i = str5;
        }
    }

    @Zh.n
    public static final class i extends N2 implements f, g, h {

        @NotNull
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* renamed from: l, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final InterfaceC1901b[] f39412l = {null, null, null, null, null, new C4087f(r8.a.f41041a), null, new di.I("com.plaid.internal.workflow.error.LocalErrorType", H3.values()), null, null};

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39413b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final r8 f39414c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39415d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f39416e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f39417f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<r8> f39418g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        public final String f39419h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        public final H3 f39420i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f39421j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f39422k;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39423a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39424b;

            static {
                a aVar = new a();
                f39423a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 10);
                j02.n("workflowId", false);
                j02.n("currentPane", false);
                j02.n("continuationToken", false);
                j02.n("errorMessage", false);
                j02.n("errorCode", false);
                j02.n("backstack", false);
                j02.n("requestId", false);
                j02.n("errorType", true);
                j02.n("linkOpenId", true);
                j02.n("oauthNonce", true);
                f39424b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                InterfaceC1901b[] interfaceC1901bArr = i.f39412l;
                InterfaceC1901b interfaceC1901b = interfaceC1901bArr[5];
                InterfaceC1901b interfaceC1901b2 = interfaceC1901bArr[7];
                di.Z0 z02 = di.Z0.f45341a;
                return new InterfaceC1901b[]{z02, r8.a.f41041a, z02, z02, z02, interfaceC1901b, z02, interfaceC1901b2, z02, z02};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                int i10;
                H3 h32;
                List list;
                String str;
                r8 r8Var;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39424b;
                ci.c c10 = decoder.c(j02);
                InterfaceC1901b[] interfaceC1901bArr = i.f39412l;
                int i11 = 9;
                int i12 = 6;
                String str8 = null;
                if (c10.q()) {
                    String s10 = c10.s(j02, 0);
                    r8 r8Var2 = (r8) c10.i(j02, 1, r8.a.f41041a, null);
                    String s11 = c10.s(j02, 2);
                    String s12 = c10.s(j02, 3);
                    String s13 = c10.s(j02, 4);
                    List list2 = (List) c10.i(j02, 5, interfaceC1901bArr[5], null);
                    String s14 = c10.s(j02, 6);
                    H3 h33 = (H3) c10.i(j02, 7, interfaceC1901bArr[7], null);
                    String s15 = c10.s(j02, 8);
                    h32 = h33;
                    str = s10;
                    str7 = c10.s(j02, 9);
                    str5 = s14;
                    str3 = s12;
                    str6 = s15;
                    str4 = s13;
                    str2 = s11;
                    i10 = 1023;
                    list = list2;
                    r8Var = r8Var2;
                } else {
                    boolean z10 = true;
                    int i13 = 0;
                    H3 h34 = null;
                    List list3 = null;
                    r8 r8Var3 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    String str13 = null;
                    String str14 = null;
                    while (z10) {
                        int e10 = c10.e(j02);
                        switch (e10) {
                            case -1:
                                z10 = false;
                                i11 = 9;
                            case 0:
                                str8 = c10.s(j02, 0);
                                i13 |= 1;
                                i11 = 9;
                                i12 = 6;
                            case 1:
                                r8Var3 = (r8) c10.i(j02, 1, r8.a.f41041a, r8Var3);
                                i13 |= 2;
                                i11 = 9;
                                i12 = 6;
                            case 2:
                                str9 = c10.s(j02, 2);
                                i13 |= 4;
                            case 3:
                                str10 = c10.s(j02, 3);
                                i13 |= 8;
                            case 4:
                                str11 = c10.s(j02, 4);
                                i13 |= 16;
                            case 5:
                                list3 = (List) c10.i(j02, 5, interfaceC1901bArr[5], list3);
                                i13 |= 32;
                            case 6:
                                str12 = c10.s(j02, i12);
                                i13 |= 64;
                            case 7:
                                h34 = (H3) c10.i(j02, 7, interfaceC1901bArr[7], h34);
                                i13 |= 128;
                            case 8:
                                str13 = c10.s(j02, 8);
                                i13 |= 256;
                            case 9:
                                str14 = c10.s(j02, i11);
                                i13 |= 512;
                            default:
                                throw new Zh.B(e10);
                        }
                    }
                    i10 = i13;
                    h32 = h34;
                    list = list3;
                    str = str8;
                    r8Var = r8Var3;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                }
                c10.b(j02);
                return new i(i10, str, r8Var, str2, str3, str4, list, str5, h32, str6, str7);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39424b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                i value = (i) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39424b;
                ci.d c10 = encoder.c(j02);
                InterfaceC1901b[] interfaceC1901bArr = i.f39412l;
                c10.G(j02, 0, value.f39413b);
                c10.B(j02, 1, r8.a.f41041a, value.f39414c);
                c10.G(j02, 2, value.f39415d);
                c10.G(j02, 3, value.f39416e);
                c10.G(j02, 4, value.f39417f);
                c10.B(j02, 5, interfaceC1901bArr[5], value.f39418g);
                c10.G(j02, 6, value.f39419h);
                if (c10.m(j02, 7) || value.f39420i != H3.UNKNOWN_ERROR) {
                    c10.B(j02, 7, interfaceC1901bArr[7], value.f39420i);
                }
                if (c10.m(j02, 8) || !Intrinsics.areEqual(value.f39421j, "")) {
                    c10.G(j02, 8, value.f39421j);
                }
                if (c10.m(j02, 9) || !Intrinsics.areEqual(value.f39422k, "")) {
                    c10.G(j02, 9, value.f39422k);
                }
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                r8 r8Var = (r8) parcel.readParcelable(i.class.getClassLoader());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(i.class.getClassLoader()));
                }
                return new i(readString, r8Var, readString2, readString3, readString4, arrayList, parcel.readString(), H3.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(@NotNull String workflowId, @NotNull r8 currentPane, @NotNull String continuationToken, @NotNull String errorMessage, @NotNull String errorCode, @NotNull List<r8> backstack, @NotNull String requestId, @NotNull H3 errorType) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(currentPane, "currentPane");
            Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(backstack, "backstack");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.f39413b = workflowId;
            this.f39414c = currentPane;
            this.f39415d = continuationToken;
            this.f39416e = errorMessage;
            this.f39417f = errorCode;
            this.f39418g = backstack;
            this.f39419h = requestId;
            this.f39420i = errorType;
            this.f39421j = "";
            this.f39422k = "";
        }

        @Override // com.plaid.internal.N2.g
        @NotNull
        public final String a() {
            return this.f39422k;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final String b() {
            return this.f39415d;
        }

        @Override // com.plaid.internal.N2.h
        @NotNull
        public final String c() {
            return this.f39419h;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final List<r8> d() {
            return this.f39418g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2.f
        @NotNull
        public final r8 e() {
            return this.f39414c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f39413b, iVar.f39413b) && Intrinsics.areEqual(this.f39414c, iVar.f39414c) && Intrinsics.areEqual(this.f39415d, iVar.f39415d) && Intrinsics.areEqual(this.f39416e, iVar.f39416e) && Intrinsics.areEqual(this.f39417f, iVar.f39417f) && Intrinsics.areEqual(this.f39418g, iVar.f39418g) && Intrinsics.areEqual(this.f39419h, iVar.f39419h) && this.f39420i == iVar.f39420i;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39421j;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39413b;
        }

        public final int hashCode() {
            return this.f39420i.hashCode() + C3783x.a(this.f39419h, (this.f39418g.hashCode() + C3783x.a(this.f39417f, C3783x.a(this.f39416e, C3783x.a(this.f39415d, (this.f39414c.hashCode() + (this.f39413b.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "LocalError(workflowId=" + this.f39413b + ", currentPane=" + this.f39414c + ", continuationToken=" + this.f39415d + ", errorMessage=" + this.f39416e + ", errorCode=" + this.f39417f + ", backstack=" + this.f39418g + ", requestId=" + this.f39419h + ", errorType=" + this.f39420i + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39413b);
            out.writeParcelable(this.f39414c, i10);
            out.writeString(this.f39415d);
            out.writeString(this.f39416e);
            out.writeString(this.f39417f);
            List<r8> list = this.f39418g;
            out.writeInt(list.size());
            Iterator<r8> it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable(it.next(), i10);
            }
            out.writeString(this.f39419h);
            this.f39420i.writeToParcel(out, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public i(int i10, String str, r8 r8Var, String str2, String str3, String str4, List list, String str5, H3 h32, String str6, String str7) {
            super(0);
            if (127 != (i10 & 127)) {
                di.F0.a(i10, 127, a.f39424b);
            }
            this.f39413b = str;
            this.f39414c = r8Var;
            this.f39415d = str2;
            this.f39416e = str3;
            this.f39417f = str4;
            this.f39418g = list;
            this.f39419h = str5;
            if ((i10 & 128) == 0) {
                this.f39420i = H3.UNKNOWN_ERROR;
            } else {
                this.f39420i = h32;
            }
            if ((i10 & 256) == 0) {
                this.f39421j = "";
            } else {
                this.f39421j = str6;
            }
            if ((i10 & 512) == 0) {
                this.f39422k = "";
            } else {
                this.f39422k = str7;
            }
        }
    }

    @Zh.n
    public static final class k extends N2 implements h, g {

        @NotNull
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39429b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f39430c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f39431d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f39432e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f39433f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f39434g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public final A f39435h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f39436i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f39437j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f39438k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        public final EnumC3612d7 f39439l;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static final class a implements di.N {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f39440a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ di.J0 f39441b;

            static {
                a aVar = new a();
                f39440a = aVar;
                di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 11);
                j02.n("linkOpenId", false);
                j02.n("workflowId", false);
                j02.n("requestId", false);
                j02.n("oauthNonce", false);
                j02.n(EventKeys.URL, false);
                j02.n("webviewFallbackId", false);
                j02.n("channelInfo", true);
                j02.n("hasTransparentBackground", true);
                j02.n("isOutOfProcess", true);
                j02.n("shouldPreloadLink", false);
                j02.n("smsAutofillType", true);
                f39441b = j02;
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] childSerializers() {
                InterfaceC1901b t10 = AbstractC2028a.t(A.a.f39140a);
                di.Z0 z02 = di.Z0.f45341a;
                C4093i c4093i = C4093i.f45370a;
                return new InterfaceC1901b[]{z02, z02, z02, z02, z02, z02, t10, c4093i, c4093i, c4093i, EnumC3612d7.a.f40565a};
            }

            @Override // Zh.InterfaceC1900a
            public final Object deserialize(ci.e decoder) {
                boolean z10;
                EnumC3612d7 enumC3612d7;
                A a10;
                boolean z11;
                boolean z12;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                di.J0 j02 = f39441b;
                ci.c c10 = decoder.c(j02);
                int i10 = 10;
                int i11 = 0;
                if (c10.q()) {
                    String s10 = c10.s(j02, 0);
                    String s11 = c10.s(j02, 1);
                    String s12 = c10.s(j02, 2);
                    String s13 = c10.s(j02, 3);
                    String s14 = c10.s(j02, 4);
                    String s15 = c10.s(j02, 5);
                    A a11 = (A) c10.C(j02, 6, A.a.f39140a, null);
                    boolean t10 = c10.t(j02, 7);
                    boolean t11 = c10.t(j02, 8);
                    boolean t12 = c10.t(j02, 9);
                    i11 = 2047;
                    str = s10;
                    enumC3612d7 = (EnumC3612d7) c10.i(j02, 10, EnumC3612d7.a.f40565a, null);
                    z10 = t12;
                    z11 = t10;
                    a10 = a11;
                    str6 = s15;
                    str4 = s13;
                    z12 = t11;
                    str5 = s14;
                    str3 = s12;
                    str2 = s11;
                } else {
                    boolean z13 = true;
                    boolean z14 = false;
                    boolean z15 = false;
                    EnumC3612d7 enumC3612d72 = null;
                    A a12 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    boolean z16 = false;
                    while (z13) {
                        int e10 = c10.e(j02);
                        switch (e10) {
                            case -1:
                                z13 = false;
                                i10 = 10;
                            case 0:
                                str7 = c10.s(j02, 0);
                                i11 |= 1;
                                i10 = 10;
                            case 1:
                                str8 = c10.s(j02, 1);
                                i11 |= 2;
                                i10 = 10;
                            case 2:
                                str9 = c10.s(j02, 2);
                                i11 |= 4;
                                i10 = 10;
                            case 3:
                                str10 = c10.s(j02, 3);
                                i11 |= 8;
                            case 4:
                                str11 = c10.s(j02, 4);
                                i11 |= 16;
                            case 5:
                                str12 = c10.s(j02, 5);
                                i11 |= 32;
                            case 6:
                                a12 = (A) c10.C(j02, 6, A.a.f39140a, a12);
                                i11 |= 64;
                            case 7:
                                z16 = c10.t(j02, 7);
                                i11 |= 128;
                            case 8:
                                z15 = c10.t(j02, 8);
                                i11 |= 256;
                            case 9:
                                z14 = c10.t(j02, 9);
                                i11 |= 512;
                            case 10:
                                enumC3612d72 = (EnumC3612d7) c10.i(j02, i10, EnumC3612d7.a.f40565a, enumC3612d72);
                                i11 |= 1024;
                            default:
                                throw new Zh.B(e10);
                        }
                    }
                    z10 = z14;
                    enumC3612d7 = enumC3612d72;
                    a10 = a12;
                    z11 = z16;
                    z12 = z15;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                }
                int i12 = i11;
                c10.b(j02);
                return new k(i12, str, str2, str3, str4, str5, str6, a10, z11, z12, z10, enumC3612d7);
            }

            @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
            @NotNull
            public final bi.f getDescriptor() {
                return f39441b;
            }

            @Override // Zh.p
            public final void serialize(ci.f encoder, Object obj) {
                k value = (k) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                di.J0 j02 = f39441b;
                ci.d c10 = encoder.c(j02);
                c10.G(j02, 0, value.f39429b);
                c10.G(j02, 1, value.f39430c);
                c10.G(j02, 2, value.f39431d);
                c10.G(j02, 3, value.f39432e);
                c10.G(j02, 4, value.f39433f);
                c10.G(j02, 5, value.f39434g);
                if (c10.m(j02, 6) || value.f39435h != null) {
                    c10.C(j02, 6, A.a.f39140a, value.f39435h);
                }
                if (c10.m(j02, 7) || value.f39436i) {
                    c10.F(j02, 7, value.f39436i);
                }
                if (c10.m(j02, 8) || value.f39437j) {
                    c10.F(j02, 8, value.f39437j);
                }
                c10.F(j02, 9, value.f39438k);
                if (c10.m(j02, 10) || value.f39439l != EnumC3612d7.NO_SMS_AUTOFILL) {
                    c10.B(j02, 10, EnumC3612d7.a.f40565a, value.f39439l);
                }
                c10.b(j02);
            }

            @Override // di.N
            @NotNull
            public final InterfaceC1901b[] typeParametersSerializers() {
                return N.a.a(this);
            }
        }

        public static final class b implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                boolean z10;
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                A createFromParcel = parcel.readInt() == 0 ? null : A.CREATOR.createFromParcel(parcel);
                boolean z12 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = true;
                    z13 = z10;
                }
                if (parcel.readInt() == 0) {
                    z11 = z10;
                }
                return new k(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, z12, z13, z11, EnumC3612d7.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(@NotNull String linkOpenId, @NotNull String workflowId, @NotNull String requestId, @NotNull String oauthNonce, @NotNull String url, @NotNull String webviewFallbackId, @Nullable A a10, boolean z10, boolean z11, boolean z12, @NotNull EnumC3612d7 smsAutofillType) {
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(oauthNonce, "oauthNonce");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
            this.f39429b = linkOpenId;
            this.f39430c = workflowId;
            this.f39431d = requestId;
            this.f39432e = oauthNonce;
            this.f39433f = url;
            this.f39434g = webviewFallbackId;
            this.f39435h = a10;
            this.f39436i = z10;
            this.f39437j = z11;
            this.f39438k = z12;
            this.f39439l = smsAutofillType;
        }

        @Override // com.plaid.internal.N2.g
        @NotNull
        public final String a() {
            return this.f39432e;
        }

        @Override // com.plaid.internal.N2.h
        @NotNull
        public final String c() {
            return this.f39431d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String g() {
            return this.f39429b;
        }

        @Override // com.plaid.internal.N2
        @NotNull
        public final String h() {
            return this.f39430c;
        }

        @Nullable
        public final A i() {
            return this.f39435h;
        }

        @NotNull
        public final EnumC3612d7 j() {
            return this.f39439l;
        }

        @NotNull
        public final String k() {
            return this.f39433f;
        }

        @NotNull
        public final String l() {
            return this.f39434g;
        }

        public final boolean m() {
            return this.f39437j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i10) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f39429b);
            out.writeString(this.f39430c);
            out.writeString(this.f39431d);
            out.writeString(this.f39432e);
            out.writeString(this.f39433f);
            out.writeString(this.f39434g);
            A a10 = this.f39435h;
            if (a10 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(a10.f39137a);
                out.writeString(a10.f39138b);
                out.writeLong(a10.f39139c);
            }
            out.writeInt(this.f39436i ? 1 : 0);
            out.writeInt(this.f39437j ? 1 : 0);
            out.writeInt(this.f39438k ? 1 : 0);
            this.f39439l.writeToParcel(out, i10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public k(int i10, String str, String str2, String str3, String str4, String str5, String str6, A a10, boolean z10, boolean z11, boolean z12, EnumC3612d7 enumC3612d7) {
            super(0);
            if (575 != (i10 & 575)) {
                di.F0.a(i10, 575, a.f39441b);
            }
            this.f39429b = str;
            this.f39430c = str2;
            this.f39431d = str3;
            this.f39432e = str4;
            this.f39433f = str5;
            this.f39434g = str6;
            if ((i10 & 64) == 0) {
                this.f39435h = null;
            } else {
                this.f39435h = a10;
            }
            if ((i10 & 128) == 0) {
                this.f39436i = false;
            } else {
                this.f39436i = z10;
            }
            if ((i10 & 256) == 0) {
                this.f39437j = false;
            } else {
                this.f39437j = z11;
            }
            this.f39438k = z12;
            if ((i10 & 1024) == 0) {
                this.f39439l = EnumC3612d7.NO_SMS_AUTOFILL;
            } else {
                this.f39439l = enumC3612d7;
            }
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, A a10, boolean z10, EnumC3612d7 enumC3612d7, int i10) {
            this(str, str2, str3, str4, str5, str6, a10, false, true, z10, (i10 & 1024) != 0 ? EnumC3612d7.NO_SMS_AUTOFILL : enumC3612d7);
        }
    }
}
