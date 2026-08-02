package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import de.C6185d;
import de.InterfaceC6187f;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.B0;
import je.C7404y;
import je.F0;
import je.L0;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9857w;
import td.i0;
import td.p0;
import ud.C10032j;
import ud.InterfaceC10030h;
import wd.c0;

/* renamed from: wd.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10539z extends AbstractC10532s implements InterfaceC9857w {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC9857w f104343A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC9836b.a f104344B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC9857w f104345C;

    /* renamed from: D, reason: collision with root package name */
    protected Map<InterfaceC9835a.InterfaceC2188a<?>, Object> f104346D;

    /* renamed from: e, reason: collision with root package name */
    private List<i0> f104347e;

    /* renamed from: f, reason: collision with root package name */
    private List<p0> f104348f;

    /* renamed from: g, reason: collision with root package name */
    private je.N f104349g;

    /* renamed from: h, reason: collision with root package name */
    private List<InterfaceC9834Z> f104350h;

    /* renamed from: i, reason: collision with root package name */
    private U f104351i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9834Z f104352j;

    /* renamed from: k, reason: collision with root package name */
    private EnumC9812C f104353k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC9853s f104354l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f104355m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f104356n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f104357o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f104358p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f104359q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f104360r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f104361s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f104362t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f104363u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f104364v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f104365w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f104366x;

    /* renamed from: y, reason: collision with root package name */
    private Collection<? extends InterfaceC9857w> f104367y;

    /* renamed from: z, reason: collision with root package name */
    private volatile Function0<Collection<InterfaceC9857w>> f104368z;

    /* renamed from: wd.z$a */
    /* loaded from: classes10.dex */
    public class a implements InterfaceC9857w.a<InterfaceC9857w> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        protected B0 f104369a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        protected InterfaceC9845k f104370b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        protected EnumC9812C f104371c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        protected AbstractC9853s f104372d;

        /* renamed from: e, reason: collision with root package name */
        protected InterfaceC9857w f104373e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        protected InterfaceC9836b.a f104374f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        protected List<p0> f104375g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        protected List<InterfaceC9834Z> f104376h;

        /* renamed from: i, reason: collision with root package name */
        protected U f104377i;

        /* renamed from: j, reason: collision with root package name */
        protected InterfaceC9834Z f104378j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        protected je.N f104379k;

        /* renamed from: l, reason: collision with root package name */
        protected Sd.f f104380l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f104381m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f104382n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f104383o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f104384p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f104385q;

        /* renamed from: r, reason: collision with root package name */
        private kotlin.collections.K f104386r;

        /* renamed from: s, reason: collision with root package name */
        private InterfaceC10030h f104387s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f104388t;

        /* renamed from: u, reason: collision with root package name */
        private LinkedHashMap f104389u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f104390v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f104391w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ AbstractC10539z f104392x;

        public a(@NotNull AbstractC10539z abstractC10539z, @NotNull B0 b02, @NotNull InterfaceC9845k interfaceC9845k, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, @NotNull InterfaceC9836b.a aVar, @NotNull List list, List list2, @NotNull U u11, je.N n11) {
            if (b02 == null) {
                s(0);
                throw null;
            }
            if (interfaceC9845k == null) {
                s(1);
                throw null;
            }
            if (enumC9812C == null) {
                s(2);
                throw null;
            }
            if (abstractC9853s == null) {
                s(3);
                throw null;
            }
            if (aVar == null) {
                s(4);
                throw null;
            }
            if (list == null) {
                s(5);
                throw null;
            }
            if (list2 == null) {
                s(6);
                throw null;
            }
            if (n11 == null) {
                s(7);
                throw null;
            }
            this.f104392x = abstractC10539z;
            this.f104373e = null;
            this.f104378j = abstractC10539z.f104352j;
            this.f104381m = true;
            this.f104382n = false;
            this.f104383o = false;
            this.f104384p = false;
            this.f104385q = abstractC10539z.B0();
            this.f104386r = null;
            this.f104387s = null;
            this.f104388t = abstractC10539z.T();
            this.f104389u = new LinkedHashMap();
            this.f104390v = null;
            this.f104391w = false;
            this.f104369a = b02;
            this.f104370b = interfaceC9845k;
            this.f104371c = enumC9812C;
            this.f104372d = abstractC9853s;
            this.f104374f = aVar;
            this.f104375g = list;
            this.f104376h = list2;
            this.f104377i = u11;
            this.f104379k = n11;
            this.f104380l = null;
        }

        private static /* synthetic */ void s(int i11) {
            String str;
            int i12;
            switch (i11) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i11) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 38:
                case 40:
                case 41:
                case 42:
                    i12 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    i12 = 3;
                    break;
            }
            Object[] objArr = new Object[i12];
            switch (i11) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    objArr[0] = "additionalAnnotations";
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                default:
                    objArr[0] = "substitution";
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i11) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i11) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    objArr[2] = "setSubstitution";
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i11) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @NotNull
        public final InterfaceC9857w.a A(InterfaceC9834Z interfaceC9834Z) {
            this.f104377i = (U) interfaceC9834Z;
            return this;
        }

        public final void B(boolean z11) {
            this.f104390v = Boolean.valueOf(z11);
        }

        @NotNull
        public final void C() {
            this.f104391w = true;
        }

        @NotNull
        public final void D(InterfaceC9857w interfaceC9857w) {
            this.f104373e = interfaceC9857w;
        }

        @NotNull
        public final void E() {
            this.f104383o = true;
        }

        @NotNull
        public final void F(@NotNull List list) {
            if (list != null) {
                this.f104375g = list;
            } else {
                s(19);
                throw null;
            }
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a a(@NotNull kotlin.collections.K k11) {
            if (k11 != null) {
                this.f104386r = k11;
                return this;
            }
            s(21);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> b(@NotNull InterfaceC9836b.a aVar) {
            if (aVar != null) {
                this.f104374f = aVar;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        public final InterfaceC9857w build() {
            return this.f104392x.H0(this);
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> c() {
            this.f104385q = true;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> d() {
            this.f104383o = true;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> e(@NotNull je.N n11) {
            if (n11 != null) {
                this.f104379k = n11;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a f() {
            this.f104389u.put(Ed.e.f7839H, Boolean.TRUE);
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a g(InterfaceC9838d interfaceC9838d) {
            this.f104373e = interfaceC9838d;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> h(InterfaceC9834Z interfaceC9834Z) {
            this.f104378j = interfaceC9834Z;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final /* bridge */ /* synthetic */ InterfaceC9857w.a<InterfaceC9857w> i(@NotNull List list) {
            F(list);
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> j() {
            this.f104388t = true;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a k() {
            this.f104381m = false;
            return this;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> l(@NotNull EnumC9812C enumC9812C) {
            if (enumC9812C != null) {
                this.f104371c = enumC9812C;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> m(@NotNull InterfaceC10030h interfaceC10030h) {
            if (interfaceC10030h != null) {
                this.f104387s = interfaceC10030h;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> n(@NotNull AbstractC9853s abstractC9853s) {
            if (abstractC9853s != null) {
                this.f104372d = abstractC9853s;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> o(@NotNull Sd.f fVar) {
            if (fVar != null) {
                this.f104380l = fVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> p(@NotNull B0 b02) {
            if (b02 != null) {
                this.f104369a = b02;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a q(@NotNull InterfaceC9839e interfaceC9839e) {
            if (interfaceC9839e != null) {
                this.f104370b = interfaceC9839e;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // td.InterfaceC9857w.a
        @NotNull
        public final InterfaceC9857w.a<InterfaceC9857w> r() {
            this.f104382n = true;
            return this;
        }

        @NotNull
        public final InterfaceC9857w.a z() {
            this.f104384p = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC10539z(@NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull td.d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        super(interfaceC9845k, interfaceC10030h, fVar, d0Var);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (fVar == null) {
            N(2);
            throw null;
        }
        if (aVar == null) {
            N(3);
            throw null;
        }
        if (d0Var == null) {
            N(4);
            throw null;
        }
        this.f104354l = C9852r.f99407i;
        this.f104355m = false;
        this.f104356n = false;
        this.f104357o = false;
        this.f104358p = false;
        this.f104359q = false;
        this.f104360r = false;
        this.f104361s = false;
        this.f104362t = false;
        this.f104363u = false;
        this.f104364v = false;
        this.f104365w = true;
        this.f104366x = false;
        this.f104367y = null;
        this.f104368z = null;
        this.f104345C = null;
        this.f104346D = null;
        this.f104343A = interfaceC9857w == null ? this : interfaceC9857w;
        this.f104344B = aVar;
    }

    public static ArrayList I0(InterfaceC9857w containingDeclaration, @NotNull List list, @NotNull F0 f02, boolean z11, boolean z12, boolean[] zArr) {
        if (list == null) {
            N(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            je.N type = p0Var.getType();
            L0 l02 = L0.IN_VARIANCE;
            je.N outType = f02.l(type, l02);
            je.N x02 = p0Var.x0();
            je.N l11 = x02 == null ? null : f02.l(x02, l02);
            if (outType == null) {
                return null;
            }
            if ((outType != p0Var.getType() || x02 != l11) && zArr != null) {
                zArr[0] = true;
            }
            C10538y c10538y = p0Var instanceof c0.a ? new C10538y(((c0.a) p0Var).C0()) : null;
            p0 p0Var2 = z11 ? null : p0Var;
            int index = p0Var.getIndex();
            InterfaceC10030h annotations = p0Var.getAnnotations();
            Sd.f name = p0Var.getName();
            boolean R11 = p0Var.R();
            boolean u02 = p0Var.u0();
            boolean t02 = p0Var.t0();
            td.d0 source = z12 ? p0Var.e() : td.d0.f99392a;
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            arrayList.add(c10538y == null ? new c0(containingDeclaration, p0Var2, index, annotations, name, outType, R11, u02, t02, l11, source) : new c0.a(containingDeclaration, p0Var2, index, annotations, name, outType, R11, u02, t02, l11, source, c10538y));
        }
        return arrayList;
    }

    public static ArrayList J0(Z z11, @NotNull List list, @NotNull F0 f02) {
        if (list != null) {
            return I0(z11, list, f02, false, false, null);
        }
        N(28);
        throw null;
    }

    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                i12 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[0] = "substitutor";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                objArr[1] = "copy";
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // td.InterfaceC9857w
    public final boolean B0() {
        return this.f104362t;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    /* renamed from: F0 */
    public InterfaceC9857w u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        InterfaceC9857w build = U().q(interfaceC9839e).l(enumC9812C).n(abstractC9850p).b(aVar).k().build();
        if (build != null) {
            return build;
        }
        N(26);
        throw null;
    }

    @NotNull
    protected abstract AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull td.d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    protected AbstractC10539z H0(@NotNull a aVar) {
        ?? r13;
        U u11;
        ?? r16;
        AbstractC10518d abstractC10518d;
        je.N l11;
        if (aVar == null) {
            N(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        InterfaceC10030h a11 = aVar.f104387s != null ? C10032j.a(getAnnotations(), aVar.f104387s) : getAnnotations();
        InterfaceC9845k interfaceC9845k = aVar.f104370b;
        InterfaceC9857w interfaceC9857w = aVar.f104373e;
        InterfaceC9836b.a aVar2 = aVar.f104374f;
        Sd.f fVar = aVar.f104380l;
        td.d0 e11 = aVar.f104383o ? (interfaceC9857w != null ? interfaceC9857w : n0()).e() : td.d0.f99392a;
        if (e11 == null) {
            N(27);
            throw null;
        }
        AbstractC10539z G02 = G0(fVar, aVar2, interfaceC9845k, interfaceC9857w, e11, a11);
        List<i0> typeParameters = aVar.f104386r == null ? getTypeParameters() : aVar.f104386r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        F0 c11 = C7404y.c(typeParameters, aVar.f104369a, G02, arrayList, zArr);
        if (c11 != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!aVar.f104376h.isEmpty()) {
                int i11 = 0;
                for (InterfaceC9834Z interfaceC9834Z : aVar.f104376h) {
                    je.N l12 = c11.l(interfaceC9834Z.getType(), L0.IN_VARIANCE);
                    if (l12 == null) {
                        break;
                    }
                    int i12 = i11 + 1;
                    arrayList2.add(Vd.h.b(G02, l12, ((InterfaceC6187f) interfaceC9834Z.getValue()).a(), interfaceC9834Z.getAnnotations(), i11));
                    zArr[0] = zArr[0] | (l12 != interfaceC9834Z.getType());
                    i11 = i12;
                }
            }
            U u12 = aVar.f104377i;
            if (u12 != null) {
                je.N l13 = c11.l(u12.getType(), L0.IN_VARIANCE);
                if (l13 != null) {
                    U u13 = new U(G02, new C6185d(G02, l13, aVar.f104377i.getValue()), aVar.f104377i.getAnnotations());
                    zArr[0] = (l13 != aVar.f104377i.getType()) | zArr[0];
                    r13 = 0;
                    u11 = u13;
                }
            } else {
                r13 = 0;
                u11 = null;
            }
            InterfaceC9834Z interfaceC9834Z2 = aVar.f104378j;
            if (interfaceC9834Z2 != null) {
                AbstractC10518d b22 = interfaceC9834Z2.b2(c11);
                if (b22 != null) {
                    zArr[r13] = zArr[r13] | (b22 != aVar.f104378j ? true : r13);
                    r16 = r13;
                    abstractC10518d = b22;
                }
            } else {
                r16 = r13;
                abstractC10518d = null;
            }
            ArrayList I02 = I0(G02, aVar.f104375g, c11, aVar.f104384p, aVar.f104383o, zArr);
            if (I02 != null && (l11 = c11.l(aVar.f104379k, L0.OUT_VARIANCE)) != null) {
                boolean z11 = zArr[r16] | (l11 != aVar.f104379k ? true : r16);
                zArr[r16] = z11;
                if (!z11 && aVar.f104391w) {
                    return this;
                }
                G02.L0(u11, abstractC10518d, arrayList2, arrayList, I02, l11, aVar.f104371c, aVar.f104372d);
                G02.f104355m = this.f104355m;
                G02.f104356n = this.f104356n;
                G02.f104357o = this.f104357o;
                G02.f104358p = this.f104358p;
                G02.f104359q = this.f104359q;
                G02.f104364v = this.f104364v;
                G02.f104360r = this.f104360r;
                G02.f104361s = this.f104361s;
                G02.R0(this.f104365w);
                G02.f104362t = aVar.f104385q;
                G02.f104363u = aVar.f104388t;
                G02.S0(aVar.f104390v != null ? aVar.f104390v.booleanValue() : this.f104366x);
                if (!aVar.f104389u.isEmpty() || this.f104346D != null) {
                    LinkedHashMap linkedHashMap = aVar.f104389u;
                    Map<InterfaceC9835a.InterfaceC2188a<?>, Object> map = this.f104346D;
                    if (map != null) {
                        for (Map.Entry<InterfaceC9835a.InterfaceC2188a<?>, Object> entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        G02.f104346D = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        G02.f104346D = linkedHashMap;
                    }
                }
                if (aVar.f104382n || this.f104345C != null) {
                    InterfaceC9857w interfaceC9857w2 = this.f104345C;
                    if (interfaceC9857w2 == null) {
                        interfaceC9857w2 = this;
                    }
                    G02.f104345C = interfaceC9857w2.b2(c11);
                }
                if (aVar.f104381m && !n0().o().isEmpty()) {
                    if (aVar.f104369a.f()) {
                        Function0<Collection<InterfaceC9857w>> function0 = this.f104368z;
                        if (function0 != null) {
                            G02.f104368z = function0;
                            return G02;
                        }
                        G02.S(o());
                        return G02;
                    }
                    G02.f104368z = new C10537x(this, c11);
                }
                return G02;
            }
        }
        return null;
    }

    public boolean K0() {
        return this.f104365w;
    }

    @NotNull
    public void L0(U u11, InterfaceC9834Z interfaceC9834Z, @NotNull List list, @NotNull List list2, @NotNull List list3, je.N n11, EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s) {
        if (list == null) {
            N(5);
            throw null;
        }
        if (list2 == null) {
            N(6);
            throw null;
        }
        if (list3 == null) {
            N(7);
            throw null;
        }
        if (abstractC9853s == null) {
            N(8);
            throw null;
        }
        this.f104347e = C7714v.U0(list2);
        this.f104348f = C7714v.U0(list3);
        this.f104349g = n11;
        this.f104353k = enumC9812C;
        this.f104354l = abstractC9853s;
        this.f104351i = u11;
        this.f104352j = interfaceC9834Z;
        this.f104350h = list;
        for (int i11 = 0; i11 < list2.size(); i11++) {
            i0 i0Var = (i0) list2.get(i11);
            if (i0Var.getIndex() != i11) {
                throw new IllegalStateException(i0Var + " index is " + i0Var.getIndex() + " but position is " + i11);
            }
        }
        for (int i12 = 0; i12 < list3.size(); i12++) {
            p0 p0Var = (p0) list3.get(i12);
            if (p0Var.getIndex() != i12) {
                throw new IllegalStateException(p0Var + "index is " + p0Var.getIndex() + " but position is " + i12);
            }
        }
    }

    @NotNull
    protected final a M0(@NotNull F0 f02) {
        if (f02 != null) {
            return new a(this, f02.h(), d(), h(), getVisibility(), getKind(), f(), y0(), this.f104351i, getReturnType());
        }
        N(24);
        throw null;
    }

    public final <V> void N0(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a, Object obj) {
        if (this.f104346D == null) {
            this.f104346D = new LinkedHashMap();
        }
        this.f104346D.put(interfaceC2188a, obj);
    }

    public final void O0(boolean z11) {
        this.f104361s = z11;
    }

    public <V> V P(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a) {
        Map<InterfaceC9835a.InterfaceC2188a<?>, Object> map = this.f104346D;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC2188a);
    }

    public final void P0(boolean z11) {
        this.f104360r = z11;
    }

    public final void Q0(boolean z11) {
        this.f104357o = z11;
    }

    public void R0(boolean z11) {
        this.f104365w = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void S(@NotNull Collection<? extends InterfaceC9836b> collection) {
        if (collection == 0) {
            N(17);
            throw null;
        }
        this.f104367y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9857w) it.next()).T()) {
                this.f104363u = true;
                return;
            }
        }
    }

    public void S0(boolean z11) {
        this.f104366x = z11;
    }

    @Override // td.InterfaceC9857w
    public final boolean T() {
        return this.f104363u;
    }

    public final void T0(boolean z11) {
        this.f104356n = z11;
    }

    @NotNull
    public InterfaceC9857w.a<? extends InterfaceC9857w> U() {
        return M0(F0.f69829b);
    }

    public final void U0(boolean z11) {
        this.f104358p = z11;
    }

    public final void V0(boolean z11) {
        this.f104355m = z11;
    }

    public final void W0(@NotNull je.Y y11) {
        if (y11 != null) {
            this.f104349g = y11;
        } else {
            N(11);
            throw null;
        }
    }

    public <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return interfaceC9847m.i(this, d11);
    }

    public final void X0(boolean z11) {
        this.f104364v = z11;
    }

    public final void Y0(boolean z11) {
        this.f104359q = z11;
    }

    public final void Z0(@NotNull AbstractC9853s abstractC9853s) {
        if (abstractC9853s != null) {
            this.f104354l = abstractC9853s;
        } else {
            N(10);
            throw null;
        }
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z c0() {
        return this.f104352j;
    }

    @Override // td.InterfaceC9835a
    public final InterfaceC9834Z d0() {
        return this.f104351i;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<p0> f() {
        List<p0> list = this.f104348f;
        if (list != null) {
            return list;
        }
        N(19);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return this.f104361s;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b.a getKind() {
        InterfaceC9836b.a aVar = this.f104344B;
        if (aVar != null) {
            return aVar;
        }
        N(21);
        throw null;
    }

    public je.N getReturnType() {
        return this.f104349g;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<i0> getTypeParameters() {
        List<i0> list = this.f104347e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = this.f104354l;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        N(16);
        throw null;
    }

    @Override // td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = this.f104353k;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        N(15);
        throw null;
    }

    public boolean isExternal() {
        return this.f104357o;
    }

    @Override // td.InterfaceC9857w
    public final boolean isInfix() {
        if (this.f104356n) {
            return true;
        }
        Iterator<? extends InterfaceC9836b> it = n0().o().iterator();
        while (it.hasNext()) {
            if (((InterfaceC9857w) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f104358p;
    }

    @Override // td.InterfaceC9857w
    public final boolean isOperator() {
        if (this.f104355m) {
            return true;
        }
        Iterator<? extends InterfaceC9836b> it = n0().o().iterator();
        while (it.hasNext()) {
            if (((InterfaceC9857w) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f104364v;
    }

    public boolean m0() {
        return this.f104366x;
    }

    @NotNull
    public Collection<? extends InterfaceC9857w> o() {
        Function0<Collection<InterfaceC9857w>> function0 = this.f104368z;
        if (function0 != null) {
            this.f104367y = function0.invoke();
            this.f104368z = null;
        }
        Collection<? extends InterfaceC9857w> collection = this.f104367y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        N(14);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return this.f104360r;
    }

    @Override // td.InterfaceC9857w
    public final InterfaceC9857w v0() {
        return this.f104345C;
    }

    public boolean y() {
        return this.f104359q;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<InterfaceC9834Z> y0() {
        List<InterfaceC9834Z> list = this.f104350h;
        if (list != null) {
            return list;
        }
        N(13);
        throw null;
    }

    @Override // td.InterfaceC9857w, td.f0
    /* renamed from: b */
    public InterfaceC9857w b2(@NotNull F0 f02) {
        if (f02 == null) {
            N(22);
            throw null;
        }
        if (f02.i()) {
            return this;
        }
        a M02 = M0(f02);
        M02.D(n0());
        M02.E();
        M02.C();
        return M02.build();
    }

    @Override // wd.AbstractC10532s
    @NotNull
    /* renamed from: a */
    public InterfaceC9857w n0() {
        InterfaceC9857w interfaceC9857w = this.f104343A;
        InterfaceC9857w n02 = interfaceC9857w == this ? this : interfaceC9857w.n0();
        if (n02 != null) {
            return n02;
        }
        N(20);
        throw null;
    }
}
