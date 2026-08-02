package androidx.fragment.app;

import androidx.lifecycle.U;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class T {

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f20105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f20105d = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U.c invoke() {
            return this.f20105d.getDefaultViewModelProviderFactory();
        }
    }

    public static final Lazy b(Fragment fragment, KClass kClass, Function0 function0, Function0 function02, Function0 function03) {
        if (function03 == null) {
            function03 = new a(fragment);
        }
        return new androidx.lifecycle.T(kClass, function0, function03, function02);
    }

    public static final androidx.lifecycle.W c(Lazy lazy) {
        return (androidx.lifecycle.W) lazy.getValue();
    }
}
