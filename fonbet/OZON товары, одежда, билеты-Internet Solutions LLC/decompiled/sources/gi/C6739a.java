package gi;

import android.content.Context;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import hi.InterfaceC6958a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gi.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6739a {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final InterfaceC6741c a(@NotNull Context context, @NotNull Class<? extends InterfaceC6958a> clazz) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        InterfaceC6741c interfaceC6741c = context instanceof InterfaceC6741c ? (InterfaceC6741c) context : null;
        if (interfaceC6741c == null || !interfaceC6741c.getDependencyStorage().a(clazz)) {
            Object applicationContext = context.getApplicationContext();
            interfaceC6741c = applicationContext instanceof InterfaceC6741c ? (InterfaceC6741c) applicationContext : null;
        }
        if (interfaceC6741c != null) {
            return interfaceC6741c;
        }
        throw new IllegalStateException("Can not find suitable di provider " + clazz.getSimpleName() + " for " + context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final InterfaceC6741c b(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull Class<? extends InterfaceC6958a> clazz) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (componentCallbacksC5392m instanceof InterfaceC6741c) {
            InterfaceC6741c interfaceC6741c = (InterfaceC6741c) componentCallbacksC5392m;
            if (interfaceC6741c.getDependencyStorage().a(clazz)) {
                return interfaceC6741c;
            }
        }
        for (ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC6741c) {
                InterfaceC6741c interfaceC6741c2 = (InterfaceC6741c) parentFragment;
                if (interfaceC6741c2.getDependencyStorage().a(clazz)) {
                    return interfaceC6741c2;
                }
            }
        }
        M activity = componentCallbacksC5392m.getActivity();
        InterfaceC6741c interfaceC6741c3 = activity instanceof InterfaceC6741c ? (InterfaceC6741c) activity : null;
        if (interfaceC6741c3 != null) {
            if (!interfaceC6741c3.getDependencyStorage().a(clazz)) {
                interfaceC6741c3 = null;
            }
            if (interfaceC6741c3 != null) {
                return interfaceC6741c3;
            }
        }
        r activity2 = componentCallbacksC5392m.getActivity();
        Object application = activity2 != null ? activity2.getApplication() : null;
        InterfaceC6741c interfaceC6741c4 = application instanceof InterfaceC6741c ? (InterfaceC6741c) application : null;
        if (interfaceC6741c4 != null) {
            return interfaceC6741c4;
        }
        throw new IllegalStateException("Can not find suitable di provider " + clazz.getSimpleName() + " for " + componentCallbacksC5392m);
    }
}
