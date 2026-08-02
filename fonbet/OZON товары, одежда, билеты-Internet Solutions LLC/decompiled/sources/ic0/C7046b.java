package ic0;

import Sc.InterfaceC4008j;
import Sc.k;
import Ti.d;
import Ve.Iq;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.f;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lic0/b;", "Landroidx/fragment/app/k;", "<init>", "()V", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ic0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7046b extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f66234a = k.b(new C1092b());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f66235b = k.b(new c());

    /* renamed from: ic0.b$a */
    public static final class a {

        /* renamed from: ic0.b$a$a, reason: collision with other inner class name */
        static final class C1091a extends AbstractC7737t implements Function2<String, Bundle, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC7737t f66236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1091a(Function1<? super C7047c, Unit> function1) {
                super(2);
                this.f66236b = (AbstractC7737t) function1;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(String str, Bundle bundle) {
                Bundle resultBundle = bundle;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(resultBundle, "resultBundle");
                Parcelable parcelable = resultBundle.getParcelable("ru.ozon.id.nativeauth.biometry.dialog.BiometryDialogFragment.result");
                if (parcelable == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f66236b.invoke((C7047c) parcelable);
                return Unit.f71690a;
            }
        }

        public static void a(@NotNull ComponentCallbacksC5392m parent, @NotNull String requestKey, @NotNull Function1 onResult) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            C5402x.b(parent, requestKey, new C1091a(onResult));
        }
    }

    /* renamed from: ic0.b$b, reason: collision with other inner class name */
    static final class C1092b extends AbstractC7737t implements Function0<C7045a> {
        C1092b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C7045a invoke() {
            Bundle arguments = C7046b.this.getArguments();
            C7045a c7045a = arguments != null ? (C7045a) arguments.getParcelable("params") : null;
            if (c7045a != null) {
                return c7045a;
            }
            throw new IllegalStateException("`BiometryDialogFragment` arguments were not provided");
        }
    }

    /* renamed from: ic0.b$c */
    static final class c extends AbstractC7737t implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle arguments = C7046b.this.getArguments();
            String string = arguments != null ? arguments.getString("request_key") : null;
            if (string != null) {
                return string;
            }
            throw new IllegalStateException("Request key for `BiometryDialogFragment` were not provided");
        }
    }

    public static void t(C7046b c7046b) {
        c7046b.v(true);
    }

    public static void u(C7046b c7046b) {
        c7046b.v(false);
    }

    private final void v(boolean z11) {
        InterfaceC4008j interfaceC4008j = this.f66234a;
        C7047c c7047c = new C7047c(((C7045a) interfaceC4008j.getValue()).a(), ((C7045a) interfaceC4008j.getValue()).b(), z11);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("ru.ozon.id.nativeauth.biometry.dialog.BiometryDialogFragment.result", c7047c);
        getParentFragmentManager().m1(bundle, (String) this.f66235b.getValue());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final Dialog onCreateDialog(Bundle bundle) {
        f.a aVar = new f.a(requireContext());
        InterfaceC4008j interfaceC4008j = this.f66234a;
        f create = aVar.setTitle(((C7045a) interfaceC4008j.getValue()).getTitle()).f(((C7045a) interfaceC4008j.getValue()).c()).setPositiveButton(R.string.ozonid_biometry_auth_dialog_agree, new Iq(this, 1)).setNegativeButton(R.string.ozonid_biometry_auth_dialog_disagree, new d(this, 2)).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
