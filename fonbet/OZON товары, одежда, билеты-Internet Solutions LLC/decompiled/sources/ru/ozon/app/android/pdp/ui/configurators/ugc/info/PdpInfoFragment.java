package ru.ozon.app.android.pdp.ui.configurators.ugc.info;

import GZ.g;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentPdpInfoBinding;
import ru.ozon.app.android.pdp.ui.configurators.di.DaggerPdpInfoFragmentComponent;
import ru.ozon.app.android.pdp.ui.configurators.di.PdpInfoFragmentComponent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u001f\u0010$\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/info/PdpInfoFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroyView", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "infoText", "updateArgs", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;)Lru/ozon/app/android/pdp/ui/configurators/ugc/info/PdpInfoFragment;", "LGZ/g;", "screenRouter", "LGZ/g;", "getScreenRouter", "()LGZ/g;", "setScreenRouter", "(LGZ/g;)V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpInfoBinding;", "_binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpInfoBinding;", "getBinding", "()Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpInfoBinding;", "binding", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpInfoFragment extends b {
    private FragmentPdpInfoBinding _binding;
    public g screenRouter;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/info/PdpInfoFragment$Companion;", "", "<init>", "()V", "ARG_INFO_TEXT", "", "ARG_INFO_TITLE", "newInstance", "Lru/ozon/app/android/pdp/ui/configurators/ugc/info/PdpInfoFragment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "infoText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PdpInfoFragment newInstance(String title, @NotNull OzonSpannableString infoText) {
            Intrinsics.checkNotNullParameter(infoText, "infoText");
            PdpInfoFragment pdpInfoFragment = new PdpInfoFragment();
            pdpInfoFragment.updateArgs(title, infoText);
            return pdpInfoFragment;
        }

        private Companion() {
        }
    }

    private final FragmentPdpInfoBinding getBinding() {
        FragmentPdpInfoBinding fragmentPdpInfoBinding = this._binding;
        Intrinsics.f(fragmentPdpInfoBinding);
        return fragmentPdpInfoBinding;
    }

    @NotNull
    public final g getScreenRouter() {
        g gVar = this.screenRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("screenRouter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PdpInfoFragmentComponent.Factory factory = DaggerPdpInfoFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, true, false, null, false, 918, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentPdpInfoBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        r activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("ARG_INFO_TITLE")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        CharSequence charSequence = arguments2 != null ? arguments2.getCharSequence("ARG_INFO_TEXT") : null;
        OzonSpannableString ozonSpannableString = charSequence instanceof OzonSpannableString ? (OzonSpannableString) charSequence : null;
        if (ozonSpannableString == null) {
            dismiss();
            return;
        }
        TextView textView = getBinding().titleTv;
        Intrinsics.f(textView);
        ViewExtKt.showOrGone(textView, Boolean.valueOf(!h.K(str)));
        textView.setText(str);
        TextView textView2 = getBinding().infoTv;
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        Intrinsics.f(textView2);
        textView2.setText(companion.setOnUrlSpanClick(ozonSpannableString, textView2, new PdpInfoFragment$onViewCreated$2$1(getScreenRouter())));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @NotNull
    public final PdpInfoFragment updateArgs(String title, @NotNull OzonSpannableString infoText) {
        Intrinsics.checkNotNullParameter(infoText, "infoText");
        Bundle bundle = new Bundle();
        if (title != null) {
            bundle.putString("ARG_INFO_TITLE", title);
        }
        bundle.putCharSequence("ARG_INFO_TEXT", infoText);
        setArguments(bundle);
        return this;
    }
}
