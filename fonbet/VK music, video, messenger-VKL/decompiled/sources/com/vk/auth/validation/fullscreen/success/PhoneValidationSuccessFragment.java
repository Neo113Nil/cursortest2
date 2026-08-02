package com.vk.auth.validation.fullscreen.success;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a66;
import xsna.e370;
import xsna.f4a0;
import xsna.ie90;
import xsna.jjc;
import xsna.krv0;
import xsna.xpu0;
import xsna.yfb;
import xsna.zcl;

/* compiled from: PhoneValidationSuccessFragment.kt */
/* loaded from: classes15.dex */
public final class PhoneValidationSuccessFragment extends a66<f4a0> {
    public xpu0 s;

    /* compiled from: PhoneValidationSuccessFragment.kt */
    public static abstract class SuccessType implements Parcelable {
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        /* compiled from: PhoneValidationSuccessFragment.kt */
        public static final class Unlink extends SuccessType {
            public static final Unlink h = new Unlink(R.drawable.vk_icon_report_outline_56, R.attr.vk_ui_background_negative, R.string.vk_service_validation_confirmation_unlink_result, R.string.vk_service_validation_confirmation_unlink_explanation, R.string.vk_service_validation_confirmation_approve_good, R.drawable.vkui_bg_button_red, null);
            public static final Parcelable.Creator<Unlink> CREATOR = new a();

            /* compiled from: PhoneValidationSuccessFragment.kt */
            public static final class a implements Parcelable.Creator<Unlink> {
                @Override // android.os.Parcelable.Creator
                public final Unlink createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Unlink.h;
                }

                @Override // android.os.Parcelable.Creator
                public final Unlink[] newArray(int i) {
                    return new Unlink[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PhoneValidationSuccessFragment.kt */
        public static final class Validation extends SuccessType {
            public static final Validation h = new Validation(R.drawable.vk_icon_check_shield_outline_56, R.attr.vk_ui_accent_green, R.string.vk_service_validation_confirmation_confirm_result, R.string.vk_service_validation_confirmation_confirm_explanation, R.string.vk_service_validation_confirmation_approve_excellent, R.drawable.vk_auth_bg_primary_btn, null);
            public static final Parcelable.Creator<Validation> CREATOR = new a();

            /* compiled from: PhoneValidationSuccessFragment.kt */
            public static final class a implements Parcelable.Creator<Validation> {
                @Override // android.os.Parcelable.Creator
                public final Validation createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Validation.h;
                }

                @Override // android.os.Parcelable.Creator
                public final Validation[] newArray(int i) {
                    return new Validation[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public SuccessType(int i, int i2, int i3, int i4, int i5, int i6, zcl zclVar) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }
    }

    /* compiled from: PhoneValidationSuccessFragment.kt */
    public static final class a {
        public static Bundle a(PhoneValidationPendingEvent phoneValidationPendingEvent) {
            return yfb.b(new Pair("meta_info", phoneValidationPendingEvent));
        }
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        if (this.s == null) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            this.s = new xpu0(superappUiRouterBridge.u(kn(), false));
        }
        if (z) {
            xpu0 xpu0Var = this.s;
            if (xpu0Var != null) {
                xpu0Var.show();
                return;
            }
            return;
        }
        xpu0 xpu0Var2 = this.s;
        if (xpu0Var2 != null) {
            xpu0Var2.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SuccessType successType;
        Bundle arguments = getArguments();
        PhoneValidationPendingEvent phoneValidationPendingEvent = arguments != null ? (PhoneValidationPendingEvent) arguments.getParcelable("meta_info") : null;
        if (phoneValidationPendingEvent instanceof PhoneValidationPendingEvent.Success) {
            successType = SuccessType.Validation.h;
        } else {
            if (!(phoneValidationPendingEvent instanceof PhoneValidationPendingEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            successType = SuccessType.Unlink.h;
        }
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.vk_auth_phone_validation_success_fragment, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.phone_validation_icon);
        TypedValue typedValue = krv0.a;
        krv0.p(imageView, successType.b, successType.c);
        ((TextView) inflate.findViewById(R.id.phone_validation_title)).setText(getString(successType.d));
        ((TextView) inflate.findViewById(R.id.phone_validation_subtitle)).setText(getString(successType.e));
        TextView textView = (TextView) inflate.findViewById(R.id.phone_validation_action_button);
        textView.setText(getString(successType.f));
        textView.setBackgroundResource(successType.g);
        jjc.g(textView, new ie90(this, 1));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        xpu0 xpu0Var = this.s;
        if (xpu0Var != null) {
            xpu0Var.b();
        }
        this.s = null;
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((f4a0) obj).y0(this);
    }

    @Override // xsna.a66
    public final f4a0 tn(Bundle bundle) {
        Bundle arguments = getArguments();
        return new f4a0(arguments != null ? (PhoneValidationPendingEvent) arguments.getParcelable("meta_info") : null);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        Bundle arguments = getArguments();
        return (arguments != null ? (PhoneValidationPendingEvent) arguments.getParcelable("meta_info") : null) instanceof PhoneValidationPendingEvent.Success ? SchemeStatSak$EventScreen.ALERT_PHONE_SUCCESS_VERIFICATION : SchemeStatSak$EventScreen.ALERT_SUCCESS_UNLINK_PHONE_NUMBER;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
