package com.vk.movika.impl.onboarding;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.b33;
import xsna.bpn0;
import xsna.d5j;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.en;
import xsna.enj;
import xsna.epx;
import xsna.fpf0;
import xsna.jjc;
import xsna.jt;
import xsna.l7s;
import xsna.nef;
import xsna.rm0;
import xsna.sg0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: InteractiveOnboardingModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class InteractiveOnboardingModalBottomSheet extends dw20 {
    public static final /* synthetic */ int n1 = 0;
    public final bpn0 f1 = new bpn0(new nef(this, 15));
    public int g1;
    public VkSimpleButton h1;
    public VkSimpleButton i1;
    public ViewPager2 j1;
    public final c k1;
    public b l1;
    public boolean m1;

    /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
    public static final class OnboardingModalArguments implements Parcelable {
        public static final Parcelable.Creator<OnboardingModalArguments> CREATOR = new a();
        public final List<OnboardingStep> b;

        /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
        public static final class a implements Parcelable.Creator<OnboardingModalArguments> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingModalArguments createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OnboardingStep.CREATOR, parcel, arrayList, i, 1);
                }
                return new OnboardingModalArguments(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingModalArguments[] newArray(int i) {
                return new OnboardingModalArguments[i];
            }
        }

        public OnboardingModalArguments(List<OnboardingStep> list) {
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((OnboardingStep) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
    public static final class OnboardingStep implements Parcelable {
        public static final Parcelable.Creator<OnboardingStep> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final int f;

        /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
        public static final class a implements Parcelable.Creator<OnboardingStep> {
            @Override // android.os.Parcelable.Creator
            public final OnboardingStep createFromParcel(Parcel parcel) {
                return new OnboardingStep(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OnboardingStep[] newArray(int i) {
                return new OnboardingStep[i];
            }
        }

        public OnboardingStep(String str, String str2, String str3, String str4, int i) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingStep)) {
                return false;
            }
            OnboardingStep onboardingStep = (OnboardingStep) obj;
            return epx.f(this.b, onboardingStep.b) && epx.f(this.c, onboardingStep.c) && epx.f(this.d, onboardingStep.d) && epx.f(this.e, onboardingStep.e) && this.f == onboardingStep.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnboardingStep(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", positiveButtonText=");
            sb.append(this.d);
            sb.append(", negativeButtonText=");
            sb.append(this.e);
            sb.append(", imageRes=");
            return vu5.b(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
        }
    }

    /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final OnboardingModalArguments e;
        public final b f;

        public a(OnboardingModalArguments onboardingModalArguments, Context context, d dVar) {
            super(context, null);
            this.e = onboardingModalArguments;
            this.f = dVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            Context context = this.c;
            dhr0.a.getClass();
            l7s l7sVar = new l7s(context, dhr0.u().c);
            View inflate = LayoutInflater.from(l7sVar).inflate(R.layout.interactive_videos_onboarding_view, (ViewGroup) null, false);
            Bundle bundle = new Bundle();
            bundle.putParcelable(fpf0.a(OnboardingModalArguments.class).l(), this.e);
            y(enj.c(R.drawable.onboarding_bg_radius, e3m.f(R.attr.vk_ui_header_background, l7sVar), l7sVar));
            ((dw20.b) D0(inflate, false).P0().J()).F0(true).q0(false).x(0).u(0).I(true).c(new d5j(inflate)).e0(new com.vk.movika.impl.onboarding.b()).f0(new jt(28));
            InteractiveOnboardingModalBottomSheet interactiveOnboardingModalBottomSheet = new InteractiveOnboardingModalBottomSheet();
            interactiveOnboardingModalBottomSheet.setArguments(bundle);
            interactiveOnboardingModalBottomSheet.l1 = this.f;
            return interactiveOnboardingModalBottomSheet;
        }
    }

    /* compiled from: InteractiveOnboardingModalBottomSheet.kt */
    public interface b {
        void onClose();
    }

    public InteractiveOnboardingModalBottomSheet() {
        c cVar = new c();
        cVar.c = EmptyList.b;
        this.k1 = cVar;
    }

    public final void Yn() {
        int i = this.g1;
        bpn0 bpn0Var = this.f1;
        if (i >= ((OnboardingModalArguments) bpn0Var.getValue()).b.size()) {
            this.m1 = true;
            b bVar = this.l1;
            if (bVar != null) {
                bVar.onClose();
            }
            dismiss();
            return;
        }
        OnboardingStep onboardingStep = ((OnboardingModalArguments) bpn0Var.getValue()).b.get(i);
        ViewPager2 viewPager2 = this.j1;
        if (viewPager2 != null) {
            viewPager2.e(i, true);
        }
        VkSimpleButton vkSimpleButton = this.h1;
        if (vkSimpleButton != null) {
            vkSimpleButton.setText(onboardingStep.d);
        }
        VkSimpleButton vkSimpleButton2 = this.i1;
        if (vkSimpleButton2 != null) {
            vkSimpleButton2.setText(onboardingStep.e);
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        b bVar;
        super.onDismiss(dialogInterface);
        if (this.m1 || (bVar = this.l1) == null) {
            return;
        }
        bVar.onClose();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        ViewPager2 viewPager2 = (ViewPager2) yn.findViewById(R.id.view_pager);
        VkSimpleButton vkSimpleButton = null;
        if (viewPager2 != null) {
            c cVar = this.k1;
            viewPager2.setAdapter(cVar);
            viewPager2.setOffscreenPageLimit(2);
            cVar.c = ((OnboardingModalArguments) this.f1.getValue()).b;
            cVar.notifyDataSetChanged();
            viewPager2.setUserInputEnabled(false);
        } else {
            viewPager2 = null;
        }
        this.j1 = viewPager2;
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) yn.findViewById(R.id.button_positive);
        if (vkSimpleButton2 != null) {
            vkSimpleButton2.setOnClickListener(new sg0(this, 9));
        } else {
            vkSimpleButton2 = null;
        }
        this.h1 = vkSimpleButton2;
        VkSimpleButton vkSimpleButton3 = (VkSimpleButton) yn.findViewById(R.id.button_negative);
        if (vkSimpleButton3 != null) {
            jjc.g(vkSimpleButton3, new rm0(14, this, (b33) yn));
            vkSimpleButton = vkSimpleButton3;
        }
        this.i1 = vkSimpleButton;
        Yn();
        return yn;
    }
}
