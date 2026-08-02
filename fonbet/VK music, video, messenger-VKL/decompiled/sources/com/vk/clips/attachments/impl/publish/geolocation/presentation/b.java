package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.attachments.api.publish.geolocation.ClipsGeolocationAttachEntryParams;
import com.vk.clips.attachments.impl.publish.geolocation.model.ClipsGeoPickerExtendedParams;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.location.common.LocationCommon;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.dw20;
import xsna.fpf0;
import xsna.h90;
import xsna.km50;
import xsna.mk50;
import xsna.nf3;
import xsna.nht;
import xsna.qcy;
import xsna.s8g0;
import xsna.tl50;
import xsna.ts90;
import xsna.tvo;
import xsna.tzp0;
import xsna.u9e;
import xsna.vf0;
import xsna.vk50;
import xsna.wpi;
import xsna.xn50;
import xsna.yfb;

/* compiled from: ClipsGeoPickerBottomSheet.kt */
/* loaded from: classes16.dex */
public final class b extends tl50<e, j, com.vk.clips.attachments.impl.publish.geolocation.presentation.a> implements tvo.a, nht, h90.a {
    public static final C0547b k1;
    public static final /* synthetic */ qcy<Object>[] l1;
    public final nf3 i1 = new nf3();
    public final bpn0 j1 = new bpn0(new vf0(this, 24));

    /* compiled from: ClipsGeoPickerBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsGeolocationAttachEntryParams g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ClipsGeolocationAttachEntryParams clipsGeolocationAttachEntryParams) {
            super(context, new tzp0.c.a(new c(), true));
            b.k1.getClass();
            this.g = clipsGeolocationAttachEntryParams;
            c(new ts90(0.85f, 2));
            v0(R.string.clips_geolocation_picker_modal_title);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b();
            Context context = this.c;
            LocationCommon.a.getClass();
            bVar.setArguments(yfb.b(new Pair("geo_input_params", new ClipsGeoPickerExtendedParams(this.g, LocationCommon.b(context) && LocationCommon.a(context)))));
            return bVar;
        }
    }

    /* compiled from: ClipsGeoPickerBottomSheet.kt */
    /* renamed from: com.vk.clips.attachments.impl.publish.geolocation.presentation.b$b, reason: collision with other inner class name */
    public static final class C0547b {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "contentView", "getContentView()Lcom/vk/clips/attachments/impl/publish/geolocation/presentation/ClipsGeoPickerContentView;", 0);
        fpf0.a.getClass();
        l1 = new qcy[]{mutablePropertyReference1Impl};
        k1 = new C0547b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        d dVar = new d(requireContext(), this, false);
        qcy<Object> qcyVar = l1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = dVar;
        return new mk50.c(((d) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((d) this.i1.getValue(this, l1[0])).f((j) ao50Var, new u9e(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        ((s8g0) this.j1.getValue()).K0(i, strArr);
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((e) vk50Var).f.a(new p(this, 22), this);
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((s8g0) this.j1.getValue()).onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LocationCommon.a.getClass();
            if (LocationCommon.b(activity) && LocationCommon.a(activity)) {
                xn50.a.c(this, a.C0546a.b);
            }
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        ((s8g0) this.j1.getValue()).pc(i, list);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        ((s8g0) this.j1.getValue()).wi(i, list);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("geo_input_params", ClipsGeoPickerExtendedParams.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("geo_input_params");
            if (!(parcelable3 instanceof ClipsGeoPickerExtendedParams)) {
                parcelable3 = null;
            }
            parcelable = (ClipsGeoPickerExtendedParams) parcelable3;
        }
        return new e((ClipsGeoPickerExtendedParams) parcelable);
    }
}
