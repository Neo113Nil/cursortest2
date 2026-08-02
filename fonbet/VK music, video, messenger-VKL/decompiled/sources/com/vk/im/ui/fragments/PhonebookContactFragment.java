package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.contacts.AndroidContact;
import com.vk.im.engine.models.c;
import kotlin.LazyThreadSafetyMode;
import xsna.g2v;
import xsna.hp30;
import xsna.msy;
import xsna.mxv;
import xsna.oz50;
import xsna.vxd0;
import xsna.wqx0;
import xsna.zwb;

/* compiled from: PhonebookContactFragment.kt */
/* loaded from: classes2.dex */
public final class PhonebookContactFragment extends ImFragment implements zwb.a {
    public static final /* synthetic */ int S = 0;
    public zwb Q;
    public final mxv P = g2v.c();
    public final Object R = msy.a(LazyThreadSafetyMode.NONE, new hp30(this, 8));

    /* compiled from: PhonebookContactFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Vn() {
        wqx0.b(requireView());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        if (this.x) {
            zwb zwbVar = this.Q;
            (zwbVar != null ? zwbVar : null).X0().b(rect, rect2);
            return false;
        }
        zwb zwbVar2 = this.Q;
        (zwbVar2 != null ? zwbVar2 : null).X0().d(rect2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        zwb zwbVar = this.Q;
        if (zwbVar == null) {
            zwbVar = null;
        }
        zwbVar.m.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("android_contact", AndroidContact.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("android_contact");
            if (!(parcelable3 instanceof AndroidContact)) {
                parcelable3 = null;
            }
            parcelable = (AndroidContact) parcelable3;
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("There is no 'android_contact' key in bundle.");
        }
        zwb zwbVar = new zwb(requireContext(), new vxd0.c(requireContext, this.P, (AndroidContact) parcelable), false, (c) this.R.getValue());
        this.Q = zwbVar;
        this.O.add(zwbVar);
        zwb zwbVar2 = this.Q;
        (zwbVar2 != null ? zwbVar2 : null).k = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zwb zwbVar = this.Q;
        if (zwbVar == null) {
            zwbVar = null;
        }
        return zwbVar.D0(layoutInflater.getContext(), viewGroup, null, bundle);
    }
}
