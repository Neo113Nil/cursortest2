package kotlin.reflect.jvm.internal.impl.builtins.functions;

import defpackage.km5;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(@NotNull StorageManager storageManager, @NotNull FunctionClassDescriptor functionClassDescriptor) {
        super(storageManager, functionClassDescriptor);
        storageManager.getClass();
        functionClassDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    public List<FunctionDescriptor> computeDeclaredFunctions() {
        ClassDescriptor containingClass = getContainingClass();
        containingClass.getClass();
        FunctionTypeKind functionTypeKind = ((FunctionClassDescriptor) containingClass).getFunctionTypeKind();
        return Intrinsics.c(functionTypeKind, FunctionTypeKind.Function.INSTANCE) ? a.c(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), false)) : Intrinsics.c(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? a.c(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), true)) : km5.a;
    }
}
