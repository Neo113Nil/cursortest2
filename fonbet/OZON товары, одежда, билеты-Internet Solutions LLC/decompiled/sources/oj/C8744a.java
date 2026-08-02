package oj;

import Ar.d;
import Sc.o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Z;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gj.C6743a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.j;
import ru.ozon.android.inAppUpdate.internal.ui.g;
import ru.ozon.app.android.R;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loj/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "in-app-update-sdk_googlePlayStoreRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: oj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8744a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f78403a;

    /* renamed from: oj.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1331a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78404a;

        static {
            int[] iArr = new int[g.c.values().length];
            try {
                iArr[g.c.GOOGLE_PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.c.OTHER_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78404a = iArr;
        }
    }

    /* renamed from: oj.a$b */
    public static final class b extends AbstractC7737t implements Function0<A0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            r requireActivity = C8744a.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            A0 viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: oj.a$c */
    public static final class c extends AbstractC7737t implements Function0<z0.b> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            r requireActivity = C8744a.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            return requireActivity.getDefaultViewModelProviderFactory();
        }
    }

    public C8744a() {
        y0 b11;
        b11 = b0.b(this, N.b(j.class), new b(), new Z(this), new c());
        this.f78403a = b11;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.InAppUpdateBottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        BottomSheetBehavior<FrameLayout> behavior = aVar.getBehavior();
        behavior.setState(3);
        behavior.setSkipCollapsed(true);
        behavior.addBottomSheetCallback(new C8745b());
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
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        String string;
        String string2;
        Integer b11;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g f83885f = ((j) this.f78403a.getValue()).getF83885f();
        Image image = (Image) requireView().findViewById(R.id.imageView);
        TextAtomV2View textAtomV2View = (TextAtomV2View) requireView().findViewById(R.id.titleTextView);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) requireView().findViewById(R.id.descriptionTextView);
        ButtonView buttonView = (ButtonView) requireView().findViewById(R.id.buttonView);
        ButtonV3View buttonV3View = (ButtonV3View) requireView().findViewById(R.id.remindMeLaterButtonView);
        IconButtonView iconButtonView = (IconButtonView) requireView().findViewById(R.id.closeIconButtonView);
        Intrinsics.f(image);
        g.b d11 = f83885f.e().d();
        image.setImageResource((d11 == null || (b11 = d11.b()) == null) ? 2131235621 : b11.intValue());
        image.setRatio(ImageAspectRatio.RATIO_3_2);
        image.setCornerRadius(CornerRadius.RADIUS_500);
        Intrinsics.f(textAtomV2View);
        g.b d12 = f83885f.e().d();
        if (d12 == null || (string = d12.getTitle()) == null) {
            string = textAtomV2View.getContext().getString(R.string.in_app_update_request_permission_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        OzonSpannableString ozonSpannableString = new OzonSpannableString(string);
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, null, layoutPadding, layoutPadding, null, null, textPreset, "tsHeadline700XLarge", "textPrimary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523314, null), null, 2, null);
        Intrinsics.f(textAtomV2View2);
        int i11 = C1331a.f78404a[f83885f.d().ordinal()];
        if (i11 == 1) {
            string2 = textAtomV2View2.getContext().getString(R.string.in_app_update_request_permission_description_play_market);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            string2 = textAtomV2View2.getContext().getString(R.string.in_app_update_request_permission_description_common);
        }
        Intrinsics.f(string2);
        OzonSpannableString ozonSpannableString2 = new OzonSpannableString(string2);
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
        TextHolderKt.bind$default(textAtomV2View2, new TextDTO(ozonSpannableString2, null, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, "tsBody500Medium", "textSecondary", Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523266, null), null, 2, null);
        Intrinsics.f(buttonView);
        ButtonDTO.Preset preset = ButtonDTO.Preset.SIZE_600;
        Style style = Style.ACTION_PRIMARY;
        String string3 = buttonView.getContext().getString(R.string.in_app_update_request_permission_button_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ButtonHolderKt.bind$default(buttonView, new ButtonDTO(preset, style, null, new CommonAtomLabelDTO(new OzonSpannableString(string3), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
        buttonView.setOnClickListener(new Lt.c(5, this, buttonView));
        buttonV3View.setVisibility(8);
        Intrinsics.f(iconButtonView);
        IconButtonHolderKt.bind$default(iconButtonView, new IconButtonDTO(IconButtonDTO.Preset.SIZE_HEADER_400, Style.NEUTRAL_SECONDARY, null, "ic_s_cross", null, 4, null), null, 2, null);
        iconButtonView.setOnClickListener(new d(this, 11));
        C6743a.b(ActionType.PAGE_VIEW.INSTANCE, textAtomV2View.getText().toString());
    }
}
