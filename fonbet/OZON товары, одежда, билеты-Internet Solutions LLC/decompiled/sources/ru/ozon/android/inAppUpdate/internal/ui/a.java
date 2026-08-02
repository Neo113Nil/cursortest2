package ru.ozon.android.inAppUpdate.internal.ui;

import Ax.ViewOnClickListenerC2451a;
import Sc.k;
import Sc.n;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gj.C6743a;
import hj.C6960a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mj.ViewOnClickListenerC8342a;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.ui.e;
import ru.ozon.app.android.R;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/inAppUpdate/internal/ui/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f83822a;

    /* renamed from: b, reason: collision with root package name */
    private d f83823b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83824c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83825d;

    /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.a$a, reason: collision with other inner class name */
    static final class C1446a extends AbstractC7737t implements Function0<g> {
        C1446a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final g invoke() {
            Parcelable parcelable = a.this.requireArguments().getParcelable("ru.ozon.android.inAppUpdate.internal.ui.CONFIG_KEY");
            if (parcelable != null) {
                return (g) parcelable;
            }
            throw new IllegalArgumentException("In order for the curtain to work correctly, you must be sure to pass the sdk config.");
        }
    }

    public a() {
        C1446a initializer = new C1446a();
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f83822a = k.a(n.NONE, initializer);
    }

    public static void t(a aVar) {
        C6743a.b(ActionType.CLOSE.INSTANCE, null);
        aVar.x();
    }

    public static void u(ButtonV3View buttonV3View, a aVar) {
        ActionType.CLICK click = ActionType.CLICK.INSTANCE;
        CharSequence title = buttonV3View.getTitle();
        String obj = title != null ? title.toString() : null;
        if (obj == null) {
            obj = "";
        }
        C6743a.b(click, obj);
        aVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        C6960a.d();
        dismiss();
        r activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.InAppUpdateBottomSheetDialogTheme);
        r requireActivity = requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.android.inAppUpdate.internal.ui.OzonInAppUpdateSdkActivity");
        this.f83823b = new d((OzonInAppUpdateSdkActivity) requireActivity, (g) this.f83822a.getValue());
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        BottomSheetBehavior<FrameLayout> behavior = aVar.getBehavior();
        behavior.setState(3);
        behavior.setSkipCollapsed(true);
        behavior.addBottomSheetCallback(new c(this));
        return aVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.in_app_update_bottom_sheet_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        this.f83823b = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        this.f83825d = true;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        r activity;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        e c11 = ((g) this.f83822a.getValue()).c();
        int i11 = C8938a.f81237c;
        C8938a.b("onDismiss for screenType: " + c11);
        if (((c11 instanceof e.d) || (c11 instanceof e.C1451e)) && this.f83824c) {
            return;
        }
        C8938a.b("Activity was finished for screenType: " + c11);
        this.f83824c = false;
        C6960a.e();
        if (this.f83825d || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f83825d = false;
        Image image = (Image) view.findViewById(R.id.imageView);
        TextAtomV2View textAtomV2View = (TextAtomV2View) view.findViewById(R.id.titleTextView);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) view.findViewById(R.id.descriptionTextView);
        ButtonView buttonView = (ButtonView) view.findViewById(R.id.buttonView);
        ButtonV3View buttonV3View = (ButtonV3View) view.findViewById(R.id.remindMeLaterButtonView);
        IconButtonView iconButtonView = (IconButtonView) view.findViewById(R.id.closeIconButtonView);
        Intrinsics.f(image);
        Intrinsics.f(textAtomV2View);
        Intrinsics.f(textAtomV2View2);
        Intrinsics.f(buttonView);
        Intrinsics.f(buttonV3View);
        Intrinsics.f(iconButtonView);
        IconButtonHolderKt.bind$default(iconButtonView, new IconButtonDTO(IconButtonDTO.Preset.SIZE_HEADER_400, Style.NEUTRAL_SECONDARY, null, "ic_s_cross", null, 4, null), null, 2, null);
        iconButtonView.setOnClickListener(new ViewOnClickListenerC2451a(this, 13));
        d dVar = this.f83823b;
        if (dVar != null) {
            dVar.b(image, textAtomV2View, textAtomV2View2, buttonView, buttonV3View);
        }
        d dVar2 = this.f83823b;
        if (dVar2 != null) {
            b clickCallback = new b(this);
            Intrinsics.checkNotNullParameter(buttonView, "buttonView");
            Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
            buttonView.setOnClickListener(new ViewOnClickListenerC8342a(dVar2, buttonView, clickCallback, 0));
        }
        buttonV3View.setOnClickListener(new IK.a(4, buttonV3View, this));
        C6743a.b(ActionType.PAGE_VIEW.INSTANCE, textAtomV2View.getText().toString());
    }
}
