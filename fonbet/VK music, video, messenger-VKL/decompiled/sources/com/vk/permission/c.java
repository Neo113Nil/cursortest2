package com.vk.permission;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.permission.b;
import xsna.c33;
import xsna.ebs;
import xsna.mht;
import xsna.oht;
import xsna.q90;
import xsna.z0h;

/* compiled from: GdprRationaleDialogFragment.kt */
/* loaded from: classes4.dex */
public final class c extends c33 implements mht {

    /* compiled from: GdprRationaleDialogFragment.kt */
    public static final class a {
        public static c a(FragmentManager fragmentManager, b bVar) {
            if (fragmentManager.H("com.vk.permission.GdprRationaleDialogFragmentCompat") instanceof c) {
                return null;
            }
            c cVar = new c();
            bVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("arg_rationale_text", bVar.a);
            bundle.putString("arg_positive_button_text", bVar.b);
            bundle.putString("arg_negative_button_text", bVar.c);
            bundle.putInt("arg_request_code", bVar.d);
            bundle.putStringArray("arg_permissions", bVar.e);
            Integer num = bVar.f;
            if (num != null) {
                bundle.putInt("arg_theme_id", num.intValue());
            }
            cVar.setArguments(bundle);
            if (fragmentManager.T()) {
                return cVar;
            }
            cVar.Td(fragmentManager, "com.vk.permission.GdprRationaleDialogFragmentCompat");
            return cVar;
        }
    }

    @Override // xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        An(false);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("No arguments.");
        }
        b a2 = b.a.a(arguments);
        Fragment parentFragment = getParentFragment();
        oht ohtVar = new oht(parentFragment != null ? new ebs(parentFragment, null) : new q90(kn(), null), a2, new z0h(this, 15));
        Integer num = a2.f;
        d.a aVar = new d.a(num != null ? new ContextThemeWrapper(requireContext(), num.intValue()) : requireContext());
        AlertController.b bVar = aVar.a;
        bVar.m = false;
        bVar.f = a2.a;
        aVar.j(a2.b, ohtVar);
        aVar.f(a2.c, ohtVar);
        return aVar.create();
    }
}
