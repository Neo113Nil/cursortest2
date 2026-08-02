package com.vk.video.ui.edit.privacy;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.donut.dto.DonutGetLevelsSourceDto;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.donut.DonutLevel;
import com.vk.privacyui.PrivacyEditFragment;
import com.vkontakte.android.R;
import defpackage.b0;
import io.reactivex.rxjava3.disposables.c;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.drm0;
import xsna.dy2;
import xsna.epx;
import xsna.fpf0;
import xsna.hg1;
import xsna.oo20;
import xsna.pgn;
import xsna.qcy;
import xsna.rsg0;
import xsna.rwi;
import xsna.s6x;
import xsna.sl30;
import xsna.yfb;

/* compiled from: PrivacyEditVideoWatchFragment.kt */
/* loaded from: classes7.dex */
public final class PrivacyEditVideoWatchFragment extends PrivacyEditFragment {
    public static final /* synthetic */ qcy<Object>[] a1;
    public ListBuilder X0;
    public DonutLevel Y0;
    public final pgn Z0 = new pgn();

    /* compiled from: PrivacyEditVideoWatchFragment.kt */
    public static final class a extends PrivacyEditFragment.a {
        public a() {
            super(PrivacyEditVideoWatchFragment.class, null, null);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(PrivacyEditVideoWatchFragment.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        a1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, xsna.na80
    /* renamed from: No */
    public final void fk(PrivacySetting.PrivacyRule privacyRule) {
        if (epx.f(PrivacyRules.f, privacyRule) && this.T0 != null && this.X0 != null) {
            rwi.d().c().c(requireContext(), this.Y0, this.X0);
        } else {
            this.Y0 = null;
            super.fk(privacyRule);
        }
    }

    @Override // com.vk.privacyui.PrivacyEditFragment
    public final void Po(Intent intent) {
        intent.putExtra("donut_level", this.Y0);
        super.Po(intent);
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        FragmentActivity activity;
        Object parcelableExtra;
        if (i2 != -1 || i != 150) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("donut_level", DonutLevel.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("donut_level");
                if (!(parcelableExtra2 instanceof DonutLevel)) {
                    parcelableExtra2 = null;
                }
                parcelable = (DonutLevel) parcelableExtra2;
            }
            DonutLevel donutLevel = (DonutLevel) parcelable;
            this.Y0 = donutLevel;
            if (donutLevel != null) {
                PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.f;
                boolean z = donutLevel.e;
                String str = donutLevel.c;
                if (!z && !drm0.N(str) && ((activity = getActivity()) == null || (str = activity.getString(R.string.video_donut_level_subtitle_with_higher_format, str)) == null)) {
                    str = "";
                }
                To(predefinedSet, str);
                super.fk(predefinedSet);
            }
        }
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        qcy<Object> qcyVar = a1[0];
        this.Z0.b(null);
    }

    @Override // com.vk.privacyui.PrivacyEditFragment, com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(R.string.video_privacy_title);
        if (this.J0.f.contains(PrivacyRules.f.d) && this.T0 != null && this.X0 == null) {
            Bundle arguments = getArguments();
            c subscribe = hg1.m(rsg0.y0(yfb.x(dy2.c(new dy2(), this.T0, DonutGetLevelsSourceDto.PERMISSIONS, 18)), null, null, 3), getActivity(), 0L, false, 62).subscribe(new oo20(new b0(25, this, arguments != null ? Integer.valueOf(arguments.getInt("donut_level_id")) : null), 18), new sl30(new s6x(23), 18));
            qcy<Object> qcyVar = a1[0];
            this.Z0.b(subscribe);
        }
    }
}
