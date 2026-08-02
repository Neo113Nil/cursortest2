package ru.ozon.android.messenger.framework.presentation.common.screen;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gE.ViewOnClickListenerC6686a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.models.k;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.app.android.messenger.databinding.MViewButtonActionBinding;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/screen/j;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.google.android.material.bottomsheet.b {

    /* renamed from: c, reason: collision with root package name */
    private static final int f91125c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f91126d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f91127e = 0;

    /* renamed from: a, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f91128a;

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f91129b;

    public static final class a {
        @NotNull
        public static j a(@NotNull ArrayList actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            j jVar = new j();
            ru.ozon.android.messenger.utils.g.g(jVar, new Pair("ARG_BUTTONS", new ArrayList(actions)));
            return jVar;
        }
    }

    static {
        int i11;
        int i12;
        i11 = ru.ozon.android.messenger.utils.e.f91908e;
        f91125c = i11;
        i12 = ru.ozon.android.messenger.utils.e.f91911h;
        f91126d = i12;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R$style.m_ActionsBottomSheetDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ru.ozon.android.messenger.utils.g.d(this).H(this);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IconDTO iconDTO;
        CommonCellSettings commonCellSettings;
        IconTitleSubtitleWrapperPreset preset;
        AtomActionDTO action;
        IconDTO copy;
        CommonAtomIconDTO icon;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(getContext());
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.setPadding(0, f91125c, 0, f91126d);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(true);
        linearLayout.setBackgroundResource(R$drawable.m_bg_bottom_actions_rounded_top);
        this.f91129b = linearLayout;
        if (viewGroup != null) {
            viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        }
        Bundle arguments = getArguments();
        Iterable parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("ARG_BUTTONS") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = K.f71697a;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.k> U02 = C7714v.U0(parcelableArrayList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : U02) {
            if (obj instanceof k.a) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C7714v.z(U02, 10));
            for (ru.ozon.android.messenger.framework.presentation.models.k kVar : U02) {
                Intrinsics.g(kVar, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.models.BottomSheetButton.Default");
                arrayList2.add((k.b) kVar);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                k.b bVar = (k.b) it.next();
                d.a f7 = ru.ozon.android.messenger.utils.g.f(this);
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                MViewButtonActionBinding inflate = MViewButtonActionBinding.inflate(ru.ozon.android.messenger.utils.c.c(requireContext), this.f91129b, false);
                Icon b11 = bVar.b();
                if (b11 != null) {
                    ImageView actionIconIv = inflate.actionIconIv;
                    Intrinsics.checkNotNullExpressionValue(actionIconIv, "actionIconIv");
                    ru.ozon.android.messenger.utils.image.c.b(actionIconIv, b11, Integer.valueOf(R$color.text_primary), f7);
                }
                inflate.actionTextTv.setText(bVar.c());
                inflate.getConstraintLayout().setOnClickListener(new ViewOnClickListenerC6686a(2, bVar, this));
                LinearLayout linearLayout2 = this.f91129b;
                if (linearLayout2 != null) {
                    linearLayout2.addView(inflate.getConstraintLayout());
                }
                View view = new View(getContext());
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                view.setBackgroundColor(ThemeExtKt.themeColor(requireContext2, R$attr.graphicNeutral));
                Context requireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                Intrinsics.checkNotNullParameter(requireContext3, "<this>");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, requireContext3.getResources().getDisplayMetrics()));
                layoutParams.setMarginStart(getResources().getDimensionPixelSize(R$dimen.m_action_button_text_margin_start));
                LinearLayout linearLayout3 = this.f91129b;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view, layoutParams);
                }
            }
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            MViewButtonActionBinding inflate2 = MViewButtonActionBinding.inflate(ru.ozon.android.messenger.utils.c.c(requireContext4), this.f91129b, false);
            inflate2.actionIconIv.setImageResource(R$drawable.ic_m_cross_compact);
            inflate2.actionTextTv.setText(getString(R$string.messenger_header_action_cancel));
            inflate2.getConstraintLayout().setOnClickListener(new FX.a(this, 11));
            LinearLayout linearLayout4 = this.f91129b;
            if (linearLayout4 != null) {
                linearLayout4.addView(inflate2.getConstraintLayout());
            }
        } else {
            ArrayList W02 = C7714v.W0(arrayList);
            IconTitleSubtitleCellDTO a11 = ((k.a) C7714v.K(W02)).a();
            CommonAtomLabelDTO title = a11.getTitle();
            String string = getString(R$string.messenger_header_action_cancel);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CommonAtomLabelDTO copy$default = CommonAtomLabelDTO.copy$default(title, new OzonSpannableString(string), null, null, null, null, null, null, false, null, 510, null);
            IconDTO icon2 = a11.getIcon();
            if (icon2 != null) {
                IconDTO icon3 = a11.getIcon();
                copy = icon2.copy((r34 & 1) != 0 ? icon2.size : null, (r34 & 2) != 0 ? icon2.hasShape : null, (r34 & 4) != 0 ? icon2.shape : null, (r34 & 8) != 0 ? icon2.text : null, (r34 & 16) != 0 ? icon2.icon : (icon3 == null || (icon = icon3.getIcon()) == null) ? null : CommonAtomIconDTO.copy$default(icon, "ic_m_cross_compact", null, 2, null), (r34 & 32) != 0 ? icon2.backgroundImage : null, (r34 & 64) != 0 ? icon2.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon2.textColor : null, (r34 & 256) != 0 ? icon2.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon2.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon2.borderWidth : null, (r34 & 2048) != 0 ? icon2.isBorderInside : null, (r34 & 4096) != 0 ? icon2.hasParanja : null, (r34 & 8192) != 0 ? icon2.getContext() : null, (r34 & 16384) != 0 ? icon2.getTestInfo() : null, (r34 & 32768) != 0 ? icon2.getTrackingInfo() : null);
                iconDTO = copy;
            } else {
                iconDTO = null;
            }
            CommonCellSettings common = a11.getCommon();
            if (common != null) {
                CommonCellSettings common2 = a11.getCommon();
                commonCellSettings = CommonCellSettings.copy$default(common, null, null, null, null, (common2 == null || (action = common2.getAction()) == null) ? null : AtomActionDTO.copy$default(action, null, null, null, null, null, 17, null), null, null, 111, null);
            } else {
                commonCellSettings = null;
            }
            W02.add(new k.a(IconTitleSubtitleCellDTO.copy$default(a11, null, commonCellSettings, copy$default, null, iconDTO, 9, null), null));
            List U03 = C7714v.U0(W02);
            Context context = getContext();
            if (context != null) {
                int i11 = 0;
                for (Object obj2 : U03) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    k.a aVar = (k.a) obj2;
                    IconTitleSubtitleCellView iconTitleSubtitleCellView = new IconTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
                    IconTitleSubtitleCellHolderKt.bind(iconTitleSubtitleCellView, aVar.a(), new k(this, aVar));
                    IconTitleSubtitleCellDTO.IconTitleSubtitleCellPreset preset2 = aVar.a().getPreset();
                    if (preset2 != null && (preset = preset2.getPreset()) != null) {
                        iconTitleSubtitleCellView.setPreset(preset);
                    }
                    iconTitleSubtitleCellView.setSubtitleVisible(false);
                    iconTitleSubtitleCellView.m1862setCellPaddingLeftnOKZfEA(CommonCellSettingsKt.getPadding500());
                    iconTitleSubtitleCellView.m1863setCellPaddingRightnOKZfEA(CommonCellSettingsKt.getPadding500());
                    iconTitleSubtitleCellView.setHasSeparator(true);
                    LinearLayout linearLayout5 = this.f91129b;
                    if (linearLayout5 != null) {
                        linearLayout5.addView(iconTitleSubtitleCellView, new LinearLayout.LayoutParams(-1, -2));
                    }
                    i11 = i12;
                }
            }
        }
        return this.f91129b;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f91129b = null;
    }
}
