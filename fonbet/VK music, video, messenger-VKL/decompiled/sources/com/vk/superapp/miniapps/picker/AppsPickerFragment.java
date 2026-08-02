package com.vk.superapp.miniapps.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.apps.dto.AppsGetAttachPickerListTypeDto;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.movika.sdk.base.observable.m;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.e370;
import xsna.iin0;
import xsna.kf3;
import xsna.nr;
import xsna.o82;
import xsna.pla;
import xsna.qs2;
import xsna.rdx0;
import xsna.sn;
import xsna.ufx;
import xsna.yv2;
import xsna.zrp;

/* compiled from: AppsPickerFragment.kt */
/* loaded from: classes6.dex */
public final class AppsPickerFragment extends BaseFragment implements iin0 {
    public static final bpn0 V = new bpn0(new yv2(1));
    public i S;
    public ViewGroup T;
    public io.reactivex.rxjava3.disposables.c U;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsPickerFragment.kt */
    public static final class PickerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PickerType[] $VALUES;
        public static final PickerType Apps;

        static {
            PickerType pickerType = new PickerType("Apps", 0);
            Apps = pickerType;
            PickerType[] pickerTypeArr = {pickerType};
            $VALUES = pickerTypeArr;
            $ENTRIES = new asp(pickerTypeArr);
        }

        public PickerType() {
            throw null;
        }

        public static PickerType valueOf(String str) {
            return (PickerType) Enum.valueOf(PickerType.class, str);
        }

        public static PickerType[] values() {
            return (PickerType[]) $VALUES.clone();
        }
    }

    /* compiled from: AppsPickerFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PickerType.values().length];
            try {
                iArr[PickerType.Apps.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppsGetAttachPickerListTypeDto.values().length];
            try {
                iArr2[AppsGetAttachPickerListTypeDto.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[AppsGetAttachPickerListTypeDto.MINI_APPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        if (this.T == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.vk_picker_toolbar, (ViewGroup) null);
            ViewGroup viewGroup = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
            this.T = viewGroup;
            TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(R.id.toolbar_title) : null;
            if (textView != null) {
                if (a.$EnumSwitchMapping$0[jo().ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(R.string.vk_apps_picker_toolbar_apps);
            }
        }
        return this.T;
    }

    public final UserId io() {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("extra_peer_id_key")) == null) {
            throw new IllegalStateException("You must provide peer id to picker fragment");
        }
        return userId;
    }

    public final PickerType jo() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("extra_picker_type_key") : null;
        PickerType pickerType = serializable instanceof PickerType ? (PickerType) serializable : null;
        return pickerType == null ? PickerType.Apps : pickerType;
    }

    public final void ko() {
        HintId hintId;
        PickerItem.e eVar;
        i iVar = this.S;
        if (iVar != null) {
            iVar.setItems(Collections.singletonList(PickerItem.f.b));
        }
        UserId io2 = io();
        int i = 1;
        if (a.$EnumSwitchMapping$0[jo().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        AppsGetAttachPickerListTypeDto appsGetAttachPickerListTypeDto = AppsGetAttachPickerListTypeDto.MINI_APPS;
        int i2 = 3;
        ufx ufxVar = new ufx("apps.getAttachPickerList", new sn(3), new nr(1));
        ufx.m(ufxVar, "peer_id", io2, 0L, 12);
        int i3 = 0;
        ufx.n(ufxVar, "type", appsGetAttachPickerListTypeDto.i(), 0, 12);
        f0 K = rdx0.u(e370.e(ufxVar)).K();
        int[] iArr = a.$EnumSwitchMapping$1;
        int i4 = iArr[appsGetAttachPickerListTypeDto.ordinal()];
        if (i4 == 1) {
            hintId = HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_BANNER_GAMES;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hintId = HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_BANNER_APPS;
        }
        boolean m = pla.e().b().m(hintId);
        int i5 = iArr[appsGetAttachPickerListTypeDto.ordinal()];
        if (i5 == 1) {
            LinkedHashMap linkedHashMap = PickerItem.a;
            eVar = new PickerItem.e(R.string.vk_picker_games_banner_title, R.string.vk_picker_games_banner_subtitle, R.drawable.vk_icon_illustration_games_64h);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMap2 = PickerItem.a;
            eVar = new PickerItem.e(R.string.vk_picker_apps_banner_title, R.string.vk_picker_apps_banner_subtitle, R.drawable.vk_icon_illustration_services_64h);
        }
        eo(K.l(new kf3(new o82(appsGetAttachPickerListTypeDto, m, eVar), i3)).subscribe(new qs2(new com.vk.movika.sdk.base.observable.k(this, 6), i), new defpackage.d(new m(this, 7), i2)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_apps_picker, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView == null) {
            return;
        }
        i iVar = new i(new b(this, view));
        this.S = iVar;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(iVar);
        ko();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = jo() == PickerType.Apps ? MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY_MINI_APPS : MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_GALLERY_GAMES;
    }
}
