package wd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import de.C6184c;
import de.C6185d;
import de.InterfaceC6187f;
import ie.InterfaceC7062k;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.B0;
import je.C7404y;
import je.F0;
import je.L0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9833Y;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.i0;
import td.p0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public class Q extends e0 implements InterfaceC9831W {

    /* renamed from: A, reason: collision with root package name */
    private C10536w f104223A;

    /* renamed from: i, reason: collision with root package name */
    private final EnumC9812C f104224i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC9853s f104225j;

    /* renamed from: k, reason: collision with root package name */
    private Collection<? extends InterfaceC9831W> f104226k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9831W f104227l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC9836b.a f104228m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f104229n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f104230o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f104231p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f104232q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f104233r;

    /* renamed from: s, reason: collision with root package name */
    private List<InterfaceC9834Z> f104234s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC9834Z f104235t;

    /* renamed from: u, reason: collision with root package name */
    private U f104236u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f104237v;

    /* renamed from: w, reason: collision with root package name */
    private S f104238w;

    /* renamed from: x, reason: collision with root package name */
    private T f104239x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f104240y;

    /* renamed from: z, reason: collision with root package name */
    private C10536w f104241z;

    /* loaded from: classes10.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC9845k f104242a;

        /* renamed from: b, reason: collision with root package name */
        private EnumC9812C f104243b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC9853s f104244c;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC9836b.a f104246e;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC9834Z f104249h;

        /* renamed from: i, reason: collision with root package name */
        private Sd.f f104250i;

        /* renamed from: j, reason: collision with root package name */
        private je.N f104251j;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC9831W f104245d = null;

        /* renamed from: f, reason: collision with root package name */
        private B0 f104247f = B0.f69825a;

        /* renamed from: g, reason: collision with root package name */
        private boolean f104248g = true;

        public a() {
            this.f104242a = Q.this.d();
            this.f104243b = Q.this.h();
            this.f104244c = Q.this.getVisibility();
            this.f104246e = Q.this.getKind();
            this.f104249h = Q.this.f104235t;
            this.f104250i = Q.this.getName();
            this.f104251j = Q.this.getType();
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "setOwner";
            } else if (i11 == 2) {
                objArr[1] = "setOriginal";
            } else if (i11 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i11 == 5) {
                objArr[1] = "setReturnType";
            } else if (i11 == 7) {
                objArr[1] = "setModality";
            } else if (i11 == 9) {
                objArr[1] = "setVisibility";
            } else if (i11 == 11) {
                objArr[1] = "setKind";
            } else if (i11 == 19) {
                objArr[1] = "setName";
            } else if (i11 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i11 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i11 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i11 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 5 && i11 != 7 && i11 != 9 && i11 != 11 && i11 != 19 && i11 != 13 && i11 != 14 && i11 != 16 && i11 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final Q l() {
            return Q.this.J0(this);
        }

        final InterfaceC9832X m() {
            InterfaceC9831W interfaceC9831W = this.f104245d;
            if (interfaceC9831W == null) {
                return null;
            }
            return interfaceC9831W.getGetter();
        }

        final InterfaceC9833Y n() {
            InterfaceC9831W interfaceC9831W = this.f104245d;
            if (interfaceC9831W == null) {
                return null;
            }
            return interfaceC9831W.getSetter();
        }

        @NotNull
        public final void o() {
            this.f104248g = false;
        }

        @NotNull
        public final void p(@NotNull InterfaceC9836b.a aVar) {
            if (aVar != null) {
                this.f104246e = aVar;
            } else {
                a(10);
                throw null;
            }
        }

        @NotNull
        public final void q(@NotNull EnumC9812C enumC9812C) {
            this.f104243b = enumC9812C;
        }

        @NotNull
        public final void r(InterfaceC9831W interfaceC9831W) {
            this.f104245d = interfaceC9831W;
        }

        @NotNull
        public final void s(@NotNull InterfaceC9839e interfaceC9839e) {
            if (interfaceC9839e != null) {
                this.f104242a = interfaceC9839e;
            } else {
                a(0);
                throw null;
            }
        }

        @NotNull
        public final void t(@NotNull B0 b02) {
            if (b02 != null) {
                this.f104247f = b02;
            } else {
                a(15);
                throw null;
            }
        }

        @NotNull
        public final void u(@NotNull AbstractC9850p abstractC9850p) {
            if (abstractC9850p != null) {
                this.f104244c = abstractC9850p;
            } else {
                a(8);
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Q(@NotNull InterfaceC9845k interfaceC9845k, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC10030h interfaceC10030h, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, @NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull td.d0 d0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC9845k, interfaceC10030h, fVar, z11, d0Var);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (enumC9812C == null) {
            N(2);
            throw null;
        }
        if (abstractC9853s == null) {
            N(3);
            throw null;
        }
        if (fVar == null) {
            N(4);
            throw null;
        }
        if (aVar == null) {
            N(5);
            throw null;
        }
        if (d0Var == null) {
            N(6);
            throw null;
        }
        this.f104226k = null;
        this.f104234s = Collections.EMPTY_LIST;
        this.f104224i = enumC9812C;
        this.f104225j = abstractC9853s;
        this.f104227l = interfaceC9831W == null ? this : interfaceC9831W;
        this.f104228m = aVar;
        this.f104229n = z12;
        this.f104230o = z13;
        this.f104231p = z14;
        this.f104232q = z15;
        this.f104233r = z16;
    }

    @NotNull
    public static Q H0(@NotNull InterfaceC9839e interfaceC9839e, @NotNull InterfaceC10030h.a.C2208a c2208a, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, @NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull td.d0 d0Var) {
        if (interfaceC9839e == null) {
            N(7);
            throw null;
        }
        if (enumC9812C == null) {
            N(9);
            throw null;
        }
        if (abstractC9853s == null) {
            N(10);
            throw null;
        }
        if (fVar == null) {
            N(11);
            throw null;
        }
        if (aVar == null) {
            N(12);
            throw null;
        }
        if (d0Var != null) {
            return new Q(interfaceC9839e, null, c2208a, enumC9812C, abstractC9853s, z11, fVar, aVar, d0Var, false, false, false, false, false);
        }
        N(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void N(int i11) {
        String str;
        int i12;
        if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
            switch (i11) {
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
                switch (i11) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        break;
                    default:
                        i12 = 3;
                        break;
                }
                Object[] objArr = new Object[i12];
                switch (i11) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                        break;
                    case 5:
                    case 12:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case 28:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        objArr[0] = "substitutor";
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i11 != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i11 == 38) {
                    objArr[1] = "getOriginal";
                } else if (i11 == 39) {
                    objArr[1] = "getKind";
                } else if (i11 == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i11 != 42) {
                    switch (i11) {
                        case 21:
                            objArr[1] = "getTypeParameters";
                            break;
                        case 22:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case 23:
                            objArr[1] = "getReturnType";
                            break;
                        case 24:
                            objArr[1] = "getModality";
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            objArr[1] = "getVisibility";
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i11) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case 28:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 41:
                    case 42:
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 28 && i11 != 38 && i11 != 39 && i11 != 41 && i11 != 42) {
                    switch (i11) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            Object[] objArr2 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 28) {
            }
            switch (i11) {
            }
            String format2 = String.format(str, objArr2);
            if (i11 != 28) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 28) {
            switch (i11) {
            }
            Object[] objArr22 = new Object[i12];
            switch (i11) {
            }
            if (i11 != 28) {
            }
            switch (i11) {
            }
            String format22 = String.format(str, objArr22);
            if (i11 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        Object[] objArr222 = new Object[i12];
        switch (i11) {
        }
        if (i11 != 28) {
        }
        switch (i11) {
        }
        String format222 = String.format(str, objArr222);
        if (i11 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // td.InterfaceC9831W
    public final C10536w C() {
        return this.f104223A;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final Q u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, InterfaceC9836b.a aVar) {
        a aVar2 = new a();
        aVar2.s(interfaceC9839e);
        aVar2.r(null);
        aVar2.q(enumC9812C);
        aVar2.u(abstractC9850p);
        aVar2.p(aVar);
        aVar2.o();
        Q l11 = aVar2.l();
        if (l11 != null) {
            return l11;
        }
        N(42);
        throw null;
    }

    @NotNull
    protected Q I0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC9836b.a aVar, @NotNull Sd.f fVar) {
        td.d0 d0Var = td.d0.f99392a;
        if (interfaceC9845k == null) {
            N(32);
            throw null;
        }
        if (enumC9812C == null) {
            N(33);
            throw null;
        }
        if (abstractC9853s == null) {
            N(34);
            throw null;
        }
        if (aVar == null) {
            N(35);
            throw null;
        }
        if (fVar == null) {
            N(36);
            throw null;
        }
        InterfaceC10030h annotations = getAnnotations();
        boolean B11 = B();
        boolean J11 = J();
        boolean isExternal = isExternal();
        return new Q(interfaceC9845k, interfaceC9831W, annotations, enumC9812C, abstractC9853s, B11, fVar, aVar, d0Var, this.f104229n, J11, this.f104231p, isExternal, this.f104233r);
    }

    public boolean J() {
        return this.f104230o;
    }

    protected final Q J0(@NotNull a aVar) {
        AbstractC10518d abstractC10518d;
        U u11;
        S s11;
        T t2;
        F0 f02;
        Function0<InterfaceC7062k<Xd.g<?>>> function0;
        if (aVar == null) {
            N(29);
            throw null;
        }
        InterfaceC9845k interfaceC9845k = aVar.f104242a;
        EnumC9812C enumC9812C = aVar.f104243b;
        AbstractC9853s abstractC9853s = aVar.f104244c;
        InterfaceC9831W interfaceC9831W = aVar.f104245d;
        InterfaceC9836b.a aVar2 = aVar.f104246e;
        Sd.f fVar = aVar.f104250i;
        InterfaceC9831W unused = aVar.f104245d;
        td.d0 d0Var = td.d0.f99392a;
        Q I02 = I0(interfaceC9845k, enumC9812C, abstractC9853s, interfaceC9831W, aVar2, fVar);
        List<i0> typeParameters = getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        F0 b11 = C7404y.b(typeParameters, aVar.f104247f, I02, arrayList);
        je.N n11 = aVar.f104251j;
        je.N l11 = b11.l(n11, L0.OUT_VARIANCE);
        if (l11 != null) {
            L0 l02 = L0.IN_VARIANCE;
            je.N l12 = b11.l(n11, l02);
            if (l12 != null) {
                I02.N0(l12);
            }
            InterfaceC9834Z interfaceC9834Z = aVar.f104249h;
            if (interfaceC9834Z != null) {
                AbstractC10518d b22 = interfaceC9834Z.b2(b11);
                abstractC10518d = b22 != null ? b22 : null;
            }
            U u12 = this.f104236u;
            if (u12 != null) {
                je.N l13 = b11.l(u12.getType(), l02);
                u11 = l13 == null ? null : new U(I02, new C6185d(I02, l13, u12.getValue()), u12.getAnnotations());
            } else {
                u11 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC9834Z interfaceC9834Z2 : this.f104234s) {
                je.N l14 = b11.l(interfaceC9834Z2.getType(), L0.IN_VARIANCE);
                U u13 = l14 == null ? null : new U(I02, new C6184c(I02, l14, ((InterfaceC6187f) interfaceC9834Z2.getValue()).a(), interfaceC9834Z2.getValue()), interfaceC9834Z2.getAnnotations());
                if (u13 != null) {
                    arrayList2.add(u13);
                }
            }
            I02.P0(l11, arrayList, abstractC10518d, u11, arrayList2);
            S s12 = this.f104238w;
            if (s12 == null) {
                s11 = null;
            } else {
                InterfaceC10030h annotations = s12.getAnnotations();
                EnumC9812C enumC9812C2 = aVar.f104243b;
                AbstractC9853s visibility = this.f104238w.getVisibility();
                if (aVar.f104246e == InterfaceC9836b.a.FAKE_OVERRIDE && C9852r.g(visibility.d())) {
                    visibility = C9852r.f99406h;
                }
                s11 = new S(I02, annotations, enumC9812C2, visibility, this.f104238w.G0(), this.f104238w.isExternal(), this.f104238w.isInline(), aVar.f104246e, aVar.m(), d0Var);
            }
            if (s11 != null) {
                je.N returnType = this.f104238w.getReturnType();
                S s13 = this.f104238w;
                if (s13 == null) {
                    N(31);
                    throw null;
                }
                s11.I0(s13.v0() != null ? s13.v0().b2(b11) : null);
                s11.L0(returnType != null ? b11.l(returnType, L0.OUT_VARIANCE) : null);
            }
            T t11 = this.f104239x;
            if (t11 == null) {
                t2 = null;
            } else {
                InterfaceC10030h annotations2 = t11.getAnnotations();
                EnumC9812C enumC9812C3 = aVar.f104243b;
                AbstractC9853s visibility2 = this.f104239x.getVisibility();
                if (aVar.f104246e == InterfaceC9836b.a.FAKE_OVERRIDE && C9852r.g(visibility2.d())) {
                    visibility2 = C9852r.f99406h;
                }
                t2 = new T(I02, annotations2, enumC9812C3, visibility2, this.f104239x.G0(), this.f104239x.isExternal(), this.f104239x.isInline(), aVar.f104246e, aVar.n(), d0Var);
            }
            if (t2 != null) {
                f02 = b11;
                List I03 = AbstractC10539z.I0(t2, this.f104239x.f(), f02, false, false, null);
                if (I03 == null) {
                    I02.f104240y = true;
                    I03 = Collections.singletonList(T.K0(t2, Zd.e.e(aVar.f104242a).B(), this.f104239x.f().get(0).getAnnotations()));
                }
                if (I03.size() != 1) {
                    throw new IllegalStateException();
                }
                T t12 = this.f104239x;
                if (t12 == null) {
                    N(31);
                    throw null;
                }
                t2.I0(t12.v0() != null ? t12.v0().b2(f02) : null);
                t2.M0((p0) I03.get(0));
            } else {
                f02 = b11;
            }
            C10536w c10536w = this.f104241z;
            C10536w c10536w2 = c10536w == null ? null : new C10536w(c10536w.getAnnotations(), I02);
            C10536w c10536w3 = this.f104223A;
            I02.L0(s11, t2, c10536w2, c10536w3 != null ? new C10536w(c10536w3.getAnnotations(), I02) : null);
            if (aVar.f104248g) {
                te.i iVar = new te.i();
                Iterator<? extends InterfaceC9831W> it = o().iterator();
                while (it.hasNext()) {
                    iVar.add(it.next().b2(f02));
                }
                I02.f104226k = iVar;
            }
            if (J() && (function0 = this.f104291h) != null) {
                I02.C0(this.f104290g, function0);
            }
            return I02;
        }
        return null;
    }

    public final S K0() {
        return this.f104238w;
    }

    public final void L0(S s11, T t2, C10536w c10536w, C10536w c10536w2) {
        this.f104238w = s11;
        this.f104239x = t2;
        this.f104241z = c10536w;
        this.f104223A = c10536w2;
    }

    public final boolean M0() {
        return this.f104240y;
    }

    public void N0(@NotNull je.N n11) {
    }

    @Override // td.InterfaceC9831W
    public final C10536w O() {
        return this.f104241z;
    }

    public final void O0(boolean z11) {
        this.f104240y = z11;
    }

    public <V> V P(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a) {
        throw null;
    }

    public final void P0(@NotNull je.N n11, @NotNull List list, InterfaceC9834Z interfaceC9834Z, U u11, @NotNull List list2) {
        if (n11 == null) {
            N(17);
            throw null;
        }
        if (list == null) {
            N(18);
            throw null;
        }
        if (list2 == null) {
            N(19);
            throw null;
        }
        this.f104287e = n11;
        this.f104237v = new ArrayList(list);
        this.f104236u = u11;
        this.f104235t = interfaceC9834Z;
        this.f104234s = list2;
    }

    public final void Q0(@NotNull AbstractC9853s abstractC9853s) {
        if (abstractC9853s != null) {
            this.f104225j = abstractC9853s;
        } else {
            N(20);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9836b
    public final void S(@NotNull Collection<? extends InterfaceC9836b> collection) {
        if (collection != 0) {
            this.f104226k = collection;
        } else {
            N(40);
            throw null;
        }
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(InterfaceC9847m<R, D> interfaceC9847m, D d11) {
        return (R) interfaceC9847m.c(this, d11);
    }

    @Override // td.InterfaceC9831W
    public final boolean Y() {
        return this.f104233r;
    }

    @Override // wd.d0, td.InterfaceC9835a
    public final InterfaceC9834Z c0() {
        return this.f104235t;
    }

    @Override // wd.d0, td.InterfaceC9835a
    public final InterfaceC9834Z d0() {
        return this.f104236u;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // td.InterfaceC9831W
    public final S getGetter() {
        return this.f104238w;
    }

    @Override // td.InterfaceC9836b
    @NotNull
    public final InterfaceC9836b.a getKind() {
        InterfaceC9836b.a aVar = this.f104228m;
        if (aVar != null) {
            return aVar;
        }
        N(39);
        throw null;
    }

    @Override // wd.d0, td.InterfaceC9835a
    @NotNull
    public final je.N getReturnType() {
        je.N type = getType();
        if (type != null) {
            return type;
        }
        N(23);
        throw null;
    }

    @Override // td.InterfaceC9831W
    public final InterfaceC9833Y getSetter() {
        return this.f104239x;
    }

    @Override // wd.d0, td.InterfaceC9835a
    @NotNull
    public final List<i0> getTypeParameters() {
        ArrayList arrayList = this.f104237v;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = this.f104225j;
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        N(25);
        throw null;
    }

    @Override // td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        EnumC9812C enumC9812C = this.f104224i;
        if (enumC9812C != null) {
            return enumC9812C;
        }
        N(24);
        throw null;
    }

    public boolean isExternal() {
        return this.f104232q;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final Collection<? extends InterfaceC9831W> o() {
        Collection<? extends InterfaceC9831W> collection = this.f104226k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        N(41);
        throw null;
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return this.f104231p;
    }

    @Override // td.InterfaceC9831W
    @NotNull
    public final ArrayList t() {
        ArrayList arrayList = new ArrayList(2);
        S s11 = this.f104238w;
        if (s11 != null) {
            arrayList.add(s11);
        }
        T t2 = this.f104239x;
        if (t2 != null) {
            arrayList.add(t2);
        }
        return arrayList;
    }

    @Override // td.InterfaceC9835a
    @NotNull
    public final List<InterfaceC9834Z> y0() {
        List<InterfaceC9834Z> list = this.f104234s;
        if (list != null) {
            return list;
        }
        N(22);
        throw null;
    }

    @Override // td.q0
    public final boolean z0() {
        return this.f104229n;
    }

    @Override // td.f0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9835a b2(@NotNull F0 f02) {
        if (f02 == null) {
            N(27);
            throw null;
        }
        if (f02.i()) {
            return this;
        }
        a aVar = new a();
        aVar.t(f02.h());
        aVar.r(n0());
        return aVar.l();
    }

    @Override // wd.AbstractC10532s
    @NotNull
    /* renamed from: a */
    public final InterfaceC9831W n0() {
        InterfaceC9831W interfaceC9831W = this.f104227l;
        InterfaceC9831W n02 = interfaceC9831W == this ? this : interfaceC9831W.n0();
        if (n02 != null) {
            return n02;
        }
        N(38);
        throw null;
    }
}
