package qe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import qe.AbstractC9036g;
import td.InterfaceC9857w;

/* renamed from: qe.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9040k {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.f f81957a;

    /* renamed from: b, reason: collision with root package name */
    private final Regex f81958b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<Sd.f> f81959c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC9857w, String> f81960d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC9035f[] f81961e;

    public C9040k() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9040k(Sd.f fVar, Regex regex, Collection<Sd.f> collection, Function1<? super InterfaceC9857w, String> function1, InterfaceC9035f... interfaceC9035fArr) {
        this.f81957a = fVar;
        this.f81958b = regex;
        this.f81959c = collection;
        this.f81960d = function1;
        this.f81961e = interfaceC9035fArr;
    }

    @NotNull
    public final AbstractC9036g a(@NotNull Ed.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (InterfaceC9035f interfaceC9035f : this.f81961e) {
            String b11 = interfaceC9035f.b(functionDescriptor);
            if (b11 != null) {
                return new AbstractC9036g.b(b11);
            }
        }
        String invoke = this.f81960d.invoke(functionDescriptor);
        return invoke != null ? new AbstractC9036g.b(invoke) : AbstractC9036g.c.f81953b;
    }

    public final boolean b(@NotNull Ed.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Sd.f fVar = this.f81957a;
        if (fVar != null && !Intrinsics.d(functionDescriptor.getName(), fVar)) {
            return false;
        }
        Regex regex = this.f81958b;
        if (regex != null) {
            String b11 = functionDescriptor.getName().b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            if (!regex.f(b11)) {
                return false;
            }
        }
        Collection<Sd.f> collection = this.f81959c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ C9040k(Sd.f fVar, InterfaceC9035f[] interfaceC9035fArr) {
        this(fVar, interfaceC9035fArr, C9037h.f81954a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9040k(@NotNull Sd.f name, @NotNull InterfaceC9035f[] checks, @NotNull Function1<? super InterfaceC9857w, String> additionalChecks) {
        this(name, null, null, additionalChecks, (InterfaceC9035f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9040k(Regex regex, InterfaceC9035f[] checks) {
        this(null, regex, null, additionalChecks, (InterfaceC9035f[]) Arrays.copyOf(checks, checks.length));
        C9038i additionalChecks = C9038i.f81955a;
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C9040k(Set set, InterfaceC9035f[] interfaceC9035fArr) {
        this(set, interfaceC9035fArr, C9039j.f81956a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9040k(@NotNull Collection<Sd.f> nameList, @NotNull InterfaceC9035f[] checks, @NotNull Function1<? super InterfaceC9857w, String> additionalChecks) {
        this(null, null, nameList, additionalChecks, (InterfaceC9035f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
