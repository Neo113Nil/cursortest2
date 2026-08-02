package com.vk.clips.attachments.impl.publish.links;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import defpackage.g;
import defpackage.h;
import defpackage.j;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.c5v0;
import xsna.cm;
import xsna.dw20;
import xsna.e3m;
import xsna.f4m;
import xsna.gko;
import xsna.k9x;
import xsna.tje;
import xsna.tlo0;
import xsna.tq;
import xsna.xje;
import xsna.zrp;

/* compiled from: ClipsLinksControllerRootFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsLinksControllerRootFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public dw20 N;
    public dw20 O;
    public dw20 P;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsLinksControllerRootFragment.kt */
    public static final class LaunchType implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LaunchType[] $VALUES;
        public static final Parcelable.Creator<LaunchType> CREATOR;
        public static final LaunchType Edit;
        public static final LaunchType Unavailable;

        /* compiled from: ClipsLinksControllerRootFragment.kt */
        public static final class a implements Parcelable.Creator<LaunchType> {
            @Override // android.os.Parcelable.Creator
            public final LaunchType createFromParcel(Parcel parcel) {
                return LaunchType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchType[] newArray(int i) {
                return new LaunchType[i];
            }
        }

        static {
            LaunchType launchType = new LaunchType("Edit", 0);
            Edit = launchType;
            LaunchType launchType2 = new LaunchType("Unavailable", 1);
            Unavailable = launchType2;
            LaunchType[] launchTypeArr = {launchType, launchType2};
            $VALUES = launchTypeArr;
            $ENTRIES = new asp(launchTypeArr);
            CREATOR = new a();
        }

        public LaunchType() {
            throw null;
        }

        public static LaunchType valueOf(String str) {
            return (LaunchType) Enum.valueOf(LaunchType.class, str);
        }

        public static LaunchType[] values() {
            return (LaunchType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ClipsLinksControllerRootFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LaunchType.values().length];
            try {
                iArr[LaunchType.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LaunchType.Unavailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipsLinksControllerRootFragment() {
        Window window;
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void eo(Context context, ClipsLinksAttachEntryParams clipsLinksAttachEntryParams) {
        FragmentManager fragmentManager = In().a;
        fragmentManager.l0("links_key", this, new tje(this, clipsLinksAttachEntryParams));
        this.N = new xje.a(context, clipsLinksAttachEntryParams).X(new j(this, 22)).a0(new cm(6, this, fragmentManager)).H0(In().a, "ClipsLinksEditBottomSheet");
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
        Bn(2, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            dismiss();
        }
        return new View(requireContext());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LaunchType launchType;
        Parcelable parcelable;
        Object parcelable2;
        char c;
        int i;
        Parcelable parcelable3;
        Object parcelable4;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments.getParcelable("launch_type", LaunchType.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments.getParcelable("launch_type");
                if (!(parcelable5 instanceof LaunchType)) {
                    parcelable5 = null;
                }
                parcelable3 = (LaunchType) parcelable5;
            }
            launchType = (LaunchType) parcelable3;
        } else {
            launchType = null;
        }
        int i2 = launchType == null ? -1 : a.$EnumSwitchMapping$0[launchType.ordinal()];
        if (i2 == -1) {
            dismiss();
            return;
        }
        if (i2 == 1) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments2.getParcelable("input_params", ClipsLinksAttachEntryParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable6 = arguments2.getParcelable("input_params");
                    parcelable = (ClipsLinksAttachEntryParams) (parcelable6 instanceof ClipsLinksAttachEntryParams ? parcelable6 : null);
                }
                ClipsLinksAttachEntryParams clipsLinksAttachEntryParams = (ClipsLinksAttachEntryParams) parcelable;
                if (clipsLinksAttachEntryParams != null) {
                    eo(requireContext(), clipsLinksAttachEntryParams);
                    return;
                }
            }
            dismiss();
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        VkModal.Mode mode = VkModal.Mode.Card;
        c5v0.b bVar = new c5v0.b(12, tq.h(tlo0.Companion, R.string.clips_links_item_from_publication_links_unavailable), new tlo0.f(R.string.clips_links_item_from_publication_links_unavailable_subtitle));
        Context requireContext = requireContext();
        LinearLayout a2 = q1.a(1, requireContext);
        a2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i3 = new k9x(1, 3, 1).c;
        if (1 <= i3) {
            int i4 = 1;
            while (true) {
                VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(requireContext, null, 6);
                vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_info_20), null, 6));
                tlo0.a aVar = tlo0.Companion;
                if (i4 != 1) {
                    c = 2;
                    i = i4 != 2 ? R.string.clips_links_item_from_publication_links_unavailable_info_3 : R.string.clips_links_item_from_publication_links_unavailable_info_2;
                } else {
                    c = 2;
                    i = R.string.clips_links_item_from_publication_links_unavailable_info_1;
                }
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(aVar, i), true, false, false, false, null, 60));
                if (i4 != i3) {
                    f4m.q(e3m.a(R.dimen.vk_ui_spacing_size_xl, vkMiniInfoCell.getContext()), vkMiniInfoCell);
                }
                a2.addView(vkMiniInfoCell);
                if (i4 == i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.P = new VkModal(mode, new b.a.C0790b(null, bVar, a2, new c5v0.a(new c5v0.a.C2643a(tq.h(tlo0.Companion, R.string.clips_links_item_from_publication_understandable), new g(this, 28), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6), 49), new h(this, 24), false, 20).b(requireContext(), "ClipsLinksAttachNotAvailableView");
    }
}
