package kotlin.reflect.jvm.internal.impl.util;

import defpackage.xka;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class Checks {

    @NotNull
    private final Function1<FunctionDescriptor, String> additionalCheck;

    @NotNull
    private final Check[] checks;

    @Nullable
    private final Name name;

    @Nullable
    private final Collection<Name> nameList;

    @Nullable
    private final Regex regex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Name name, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this(name, (Regex) null, (Collection<Name>) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        name.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    @NotNull
    public final CheckResult checkAll(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Check check : this.checks) {
            String invoke = check.invoke(functionDescriptor);
            if (invoke != null) {
                return new CheckResult.IllegalSignature(invoke);
            }
        }
        String str = (String) this.additionalCheck.invoke(functionDescriptor);
        return str != null ? new CheckResult.IllegalSignature(str) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        if (this.name != null && !Intrinsics.c(functionDescriptor.getName(), this.name)) {
            return false;
        }
        if (this.regex != null) {
            String asString = functionDescriptor.getName().asString();
            asString.getClass();
            if (!this.regex.f(asString)) {
                return false;
            }
        }
        Collection<Name> collection = this.nameList;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2, reason: invalid class name */
    public static final class AnonymousClass2 extends xka implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3, reason: invalid class name */
    public static final class AnonymousClass3 extends xka implements Function1 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4, reason: invalid class name */
    public static final class AnonymousClass4 extends xka implements Function1 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass2.INSTANCE : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.name = name;
        this.regex = regex;
        this.nameList = collection;
        this.additionalCheck = function1;
        this.checks = checkArr;
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass3.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Regex regex, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, regex, (Collection<Name>) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        regex.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass4.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> collection, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, (Regex) null, collection, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        collection.getClass();
        checkArr.getClass();
        function1.getClass();
    }
}
