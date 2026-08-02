package fe;

import Bd.b;
import be.C5655a;
import fe.InterfaceC6517B;
import fe.InterfaceC6534m;
import fe.InterfaceC6536o;
import fe.InterfaceC6542v;
import fe.InterfaceC6544x;
import ie.C7056e;
import java.util.List;
import je.C7400u;
import je.n0;
import ke.q;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9819J;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9821L;
import td.InterfaceC9826Q;
import td.InterfaceC9839e;
import ud.InterfaceC10025c;
import vd.InterfaceC10304a;
import vd.InterfaceC10305b;
import vd.InterfaceC10306c;

/* renamed from: fe.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6535n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7056e f63223a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9815F f63224b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6536o.a f63225c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6531j f63226d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6526e<InterfaceC10025c, Xd.g<?>> f63227e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC9826Q f63228f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6517B.a f63229g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6543w f63230h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final b.a f63231i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC6544x f63232j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Iterable<InterfaceC10305b> f63233k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C9819J f63234l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC6534m.a.C1011a f63235m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC10304a f63236n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC10306c f63237o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Td.f f63238p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ke.q f63239q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final List<n0> f63240r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC6542v f63241s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C6533l f63242t;

    public C6535n(@NotNull C7056e storageManager, @NotNull InterfaceC9815F moduleDescriptor, @NotNull InterfaceC6531j classDataFinder, @NotNull InterfaceC6526e annotationAndConstantLoader, @NotNull InterfaceC9826Q packageFragmentProvider, @NotNull InterfaceC6543w errorReporter, @NotNull InterfaceC6544x flexibleTypeDeserializer, @NotNull Iterable fictitiousClassDescriptorFactories, @NotNull C9819J notFoundClasses, @NotNull InterfaceC6534m.a.C1011a contractDeserializer, @NotNull InterfaceC10304a additionalClassPartsProvider, @NotNull InterfaceC10306c platformDependentDeclarationFilter, @NotNull Td.f extensionRegistryLite, @NotNull ke.q kotlinTypeChecker, @NotNull C5655a samConversionResolver, @NotNull List typeAttributeTranslators, @NotNull InterfaceC6542v enumEntriesDeserializationSupport) {
        InterfaceC6536o.a configuration = InterfaceC6536o.a.f63243a;
        InterfaceC6517B.a localClassifierTypeSettings = InterfaceC6517B.a.f63133a;
        b.a lookupTracker = b.a.f3547a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f63223a = storageManager;
        this.f63224b = moduleDescriptor;
        this.f63225c = configuration;
        this.f63226d = classDataFinder;
        this.f63227e = annotationAndConstantLoader;
        this.f63228f = packageFragmentProvider;
        this.f63229g = localClassifierTypeSettings;
        this.f63230h = errorReporter;
        this.f63231i = lookupTracker;
        this.f63232j = flexibleTypeDeserializer;
        this.f63233k = fictitiousClassDescriptorFactories;
        this.f63234l = notFoundClasses;
        this.f63235m = contractDeserializer;
        this.f63236n = additionalClassPartsProvider;
        this.f63237o = platformDependentDeclarationFilter;
        this.f63238p = extensionRegistryLite;
        this.f63239q = kotlinTypeChecker;
        this.f63240r = typeAttributeTranslators;
        this.f63241s = enumEntriesDeserializationSupport;
        this.f63242t = new C6533l(this);
    }

    @NotNull
    public final C6537p a(@NotNull InterfaceC9820K descriptor, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, @NotNull Pd.h versionRequirementTable, @NotNull Pd.a metadataVersion, Ld.t tVar) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new C6537p(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, tVar, null, kotlin.collections.K.f71697a);
    }

    public final InterfaceC9839e b(@NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        int i11 = C6533l.f63217d;
        return this.f63242t.c(classId, null);
    }

    @NotNull
    public final InterfaceC10304a c() {
        return this.f63236n;
    }

    @NotNull
    public final InterfaceC6526e<InterfaceC10025c, Xd.g<?>> d() {
        return this.f63227e;
    }

    @NotNull
    public final InterfaceC6531j e() {
        return this.f63226d;
    }

    @NotNull
    public final C6533l f() {
        return this.f63242t;
    }

    @NotNull
    public final InterfaceC6536o g() {
        return this.f63225c;
    }

    @NotNull
    public final InterfaceC6534m h() {
        return this.f63235m;
    }

    @NotNull
    public final InterfaceC6542v i() {
        return this.f63241s;
    }

    @NotNull
    public final InterfaceC6543w j() {
        return this.f63230h;
    }

    @NotNull
    public final Td.f k() {
        return this.f63238p;
    }

    @NotNull
    public final Iterable<InterfaceC10305b> l() {
        return this.f63233k;
    }

    @NotNull
    public final InterfaceC6544x m() {
        return this.f63232j;
    }

    @NotNull
    public final ke.q n() {
        return this.f63239q;
    }

    @NotNull
    public final InterfaceC6517B o() {
        return this.f63229g;
    }

    @NotNull
    public final Bd.b p() {
        return this.f63231i;
    }

    @NotNull
    public final InterfaceC9815F q() {
        return this.f63224b;
    }

    @NotNull
    public final C9819J r() {
        return this.f63234l;
    }

    @NotNull
    public final InterfaceC9821L s() {
        return this.f63228f;
    }

    @NotNull
    public final InterfaceC10306c t() {
        return this.f63237o;
    }

    @NotNull
    public final ie.o u() {
        return this.f63223a;
    }

    @NotNull
    public final List<n0> v() {
        return this.f63240r;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C6535n(C7056e c7056e, InterfaceC9815F interfaceC9815F, C6538q c6538q, C6527f c6527f, InterfaceC9826Q interfaceC9826Q, Iterable iterable, C9819J c9819j, InterfaceC6534m.a.C1011a c1011a, InterfaceC10304a interfaceC10304a, InterfaceC10306c interfaceC10306c, Td.f fVar, ke.r rVar, C5655a c5655a, int i11) {
        this(c7056e, interfaceC9815F, c6538q, c6527f, interfaceC9826Q, r6, r7, iterable, c9819j, c1011a, interfaceC10304a, interfaceC10306c, fVar, r14, c5655a, C7714v.a0(C7400u.f69929a), (i11 & 524288) != 0 ? InterfaceC6542v.a.f63261a : r0);
        ke.r rVar2;
        InterfaceC6543w interfaceC6543w = InterfaceC6543w.f63262a;
        InterfaceC6544x.a aVar = InterfaceC6544x.a.f63263a;
        InterfaceC6542v interfaceC6542v = C6546z.f63270a;
        if ((i11 & 65536) != 0) {
            ke.q.f71506b.getClass();
            rVar2 = q.a.a();
        } else {
            rVar2 = rVar;
        }
    }
}
