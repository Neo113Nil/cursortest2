package com.plaid.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.U;
import com.plaid.internal.N2;
import com.plaid.internal.U0;
import com.plaid.internal.V0;
import com.plaid.link.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/U0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorFragment.kt\ncom/plaid/internal/workflow/error/ErrorFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,115:1\n168#2,2:116\n*S KotlinDebug\n*F\n+ 1 ErrorFragment.kt\ncom/plaid/internal/workflow/error/ErrorFragment\n*L\n54#1:116,2\n*E\n"})
/* loaded from: classes3.dex */
public final class U0 extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39651c = 0;

    /* renamed from: a, reason: collision with root package name */
    public C3700n5 f39652a;

    /* renamed from: b, reason: collision with root package name */
    public V0 f39653b;

    public static final class a {
        @NotNull
        public static U0 a(@NotNull N2.i errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            U0 u02 = new U0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error_state", errorState);
            u02.setArguments(bundle);
            return u02;
        }
    }

    public static final class b implements U.c {
        public b() {
        }

        @Override // androidx.lifecycle.U.c
        @NotNull
        public /* bridge */ /* synthetic */ androidx.lifecycle.Q create(@NotNull Class cls, @NotNull X0.a aVar) {
            return super.create(cls, aVar);
        }

        @Override // androidx.lifecycle.U.c
        @NotNull
        public /* bridge */ /* synthetic */ androidx.lifecycle.Q create(@NotNull KClass kClass, @NotNull X0.a aVar) {
            return super.create(kClass, aVar);
        }

        @Override // androidx.lifecycle.U.c
        @NotNull
        public final <T extends androidx.lifecycle.Q> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Resources resources = U0.this.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new V0(resources);
        }
    }

    public static final androidx.core.view.F0 a(View v10, androidx.core.view.F0 windowInsets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.e f10 = windowInsets.f(F0.p.g());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        v10.setPadding(f10.f19098a, f10.f19099b, f10.f19100c, f10.f19101d);
        return androidx.core.view.F0.f19136b;
    }

    public static final void b(U0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f39653b = (V0) new androidx.lifecycle.U(this, new b()).a(V0.class);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_error_fragment, viewGroup, false);
        int i10 = R.id.error_content;
        TextView textView = (TextView) N2.a.a(inflate, i10);
        if (textView != null) {
            i10 = R.id.error_header;
            TextView textView2 = (TextView) N2.a.a(inflate, i10);
            if (textView2 != null) {
                i10 = R.id.error_image;
                if (((ImageView) N2.a.a(inflate, i10)) != null) {
                    i10 = R.id.exit_button;
                    AppCompatButton appCompatButton = (AppCompatButton) N2.a.a(inflate, i10);
                    if (appCompatButton != null) {
                        i10 = R.id.plaid_close_icon;
                        if (((ImageView) N2.a.a(inflate, i10)) != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            i10 = R.id.plaid_navigation;
                            LinearLayout linearLayout2 = (LinearLayout) N2.a.a(inflate, i10);
                            if (linearLayout2 != null) {
                                C3700n5 c3700n5 = new C3700n5(linearLayout, textView, textView2, appCompatButton, linearLayout, linearLayout2);
                                Intrinsics.checkNotNullExpressionValue(c3700n5, "inflate(...)");
                                this.f39652a = c3700n5;
                                AbstractC2082d0.x0(linearLayout, new androidx.core.view.J() { // from class: hc.k
                                    @Override // androidx.core.view.J
                                    public final F0 f(View view, F0 f02) {
                                        return U0.a(view, f02);
                                    }
                                });
                                C3700n5 c3700n52 = this.f39652a;
                                if (c3700n52 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    c3700n52 = null;
                                }
                                LinearLayout linearLayout3 = c3700n52.f40853a;
                                Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
                                return linearLayout3;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        N2.i state;
        V0.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C3700n5 c3700n5 = this.f39652a;
        C3700n5 c3700n52 = null;
        if (c3700n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3700n5 = null;
        }
        c3700n5.f40857e.findViewById(R.id.plaid_close_icon).setOnClickListener(new View.OnClickListener() { // from class: hc.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                U0.a(U0.this, view2);
            }
        });
        C3700n5 c3700n53 = this.f39652a;
        if (c3700n53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3700n53 = null;
        }
        c3700n53.f40856d.setOnClickListener(new View.OnClickListener() { // from class: hc.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                U0.b(U0.this, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (state = (N2.i) arguments.getParcelable("error_state")) == null) {
            Log.e("ErrorFragment", "No error state provided, using default UNKNOWN_ERROR state");
            r8.CREATOR.getClass();
            state = new N2.i("", r8.f41036e, "", "", "", CollectionsKt.emptyList(), "", H3.UNKNOWN_ERROR);
        }
        Intrinsics.checkNotNull(state);
        V0 v02 = this.f39653b;
        if (v02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v02 = null;
        }
        v02.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = V0.b.f39702a[state.f39420i.ordinal()];
        if (i10 == 1) {
            String string = v02.f39698a.getString(R.string.plaid_error_no_network_connection_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = v02.f39698a.getString(R.string.plaid_error_no_network_connection_content);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = v02.f39698a.getString(R.string.plaid_error_no_network_connection_exit);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            aVar = new V0.a(string, string2, string3);
        } else if (i10 == 2) {
            String string4 = v02.f39698a.getString(R.string.plaid_error_session_expired_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = v02.f39698a.getString(R.string.plaid_error_session_expired_content);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = v02.f39698a.getString(R.string.plaid_error_session_expired_exit);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            aVar = new V0.a(string4, string5, string6);
        } else if (i10 == 3) {
            String string7 = v02.f39698a.getString(R.string.plaid_error_initialization_header);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = v02.f39698a.getString(R.string.plaid_error_initialization_content);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String string9 = v02.f39698a.getString(R.string.plaid_error_initialization_button_text);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            aVar = new V0.a(string7, string8, string9);
        } else if (i10 == 4) {
            String string10 = v02.f39698a.getString(R.string.plaid_error_internal_server_error_something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            String string11 = v02.f39698a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            String string12 = v02.f39698a.getString(R.string.plaid_error_internal_error_exit);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            aVar = new V0.a(string10, string11, string12);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String string13 = v02.f39698a.getString(R.string.plaid_error_fallback_header);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            String string14 = v02.f39698a.getString(R.string.plaid_error_fallback_content);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            String string15 = v02.f39698a.getString(R.string.plaid_error_fallback_button_text);
            Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
            aVar = new V0.a(string13, string14, string15);
        }
        C3700n5 c3700n54 = this.f39652a;
        if (c3700n54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3700n54 = null;
        }
        c3700n54.f40855c.setText(aVar.f39699a);
        C3700n5 c3700n55 = this.f39652a;
        if (c3700n55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c3700n55 = null;
        }
        c3700n55.f40854b.setText(aVar.f39700b);
        C3700n5 c3700n56 = this.f39652a;
        if (c3700n56 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c3700n52 = c3700n56;
        }
        c3700n52.f40856d.setText(aVar.f39701c);
    }

    public static final void a(U0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }
}
