package com.vk.permission;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xsna.g5g;
import xsna.gzs;
import xsna.n3u;
import xsna.nht;
import xsna.rfs;
import xsna.rl3;
import xsna.rx90;
import xsna.tvo;

/* compiled from: PermissionFragment.kt */
/* loaded from: classes4.dex */
public final class d extends Fragment implements tvo.a, nht {

    @SuppressLint({"UseSparseArrays"})
    public final HashMap<Integer, rx90> h = new HashMap<>();

    /* compiled from: PermissionFragment.kt */
    public static final class a {
        public static d a(FragmentActivity fragmentActivity) {
            return (d) fragmentActivity.getSupportFragmentManager().H("PermissionFragmentTag");
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        int i2 = (i ^ 13) / 100;
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, rx90> hashMap = this.h;
        rx90 rx90Var = hashMap.get(valueOf);
        if (rx90Var == null) {
            return;
        }
        rx90Var.d.invoke(rl3.u0(strArr));
        hashMap.remove(Integer.valueOf(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = (i ^ 13) / 100;
        Integer valueOf = Integer.valueOf(i3);
        HashMap<Integer, rx90> hashMap = this.h;
        rx90 rx90Var = hashMap.get(valueOf);
        if (rx90Var != null) {
            String[] strArr = rx90Var.b;
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context requireContext = requireContext();
            String[] strArr2 = rx90Var.a;
            permissionHelper.getClass();
            if (PermissionHelper.b(requireContext, strArr2)) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (tvo.a(requireContext(), str)) {
                        arrayList.add(str);
                    }
                }
                rx90Var.c.invoke(arrayList);
            } else {
                rx90Var.d.invoke(rl3.u0(strArr));
            }
            hashMap.remove(Integer.valueOf(i3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Resources.Theme theme;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("arg_theme");
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null && (theme = mo2getContext.getTheme()) != null) {
                theme.applyStyle(i, true);
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        HashSet hashSet = new HashSet();
        g5g.A(hashSet, strArr);
        tvo.b(Integer.parseInt(((Math.abs(hashSet.hashCode()) % 255) / 100) + "13"), strArr, iArr, this);
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        rx90 rx90Var = this.h.get(Integer.valueOf((i ^ 13) / 100));
        if (rx90Var == null) {
            return;
        }
        String[] strArr = rx90Var.b;
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context requireContext = requireContext();
        String[] strArr2 = rx90Var.a;
        permissionHelper.getClass();
        if (PermissionHelper.b(requireContext, strArr2)) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (tvo.a(requireContext(), str)) {
                    arrayList.add(str);
                }
            }
            rx90Var.c.invoke(arrayList);
        }
        PermissionHelper.a.getClass();
        PermissionHelper.w(strArr);
    }

    @Override // xsna.tvo.a
    public final void wi(final int i, List<String> list) {
        final FragmentActivity activity;
        int i2 = (i ^ 13) / 100;
        final rx90 rx90Var = this.h.get(Integer.valueOf(i2));
        if (rx90Var == null || (activity = getActivity()) == null) {
            return;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        PermissionHelper.a.getClass();
        if (PermissionHelper.t(activity, strArr)) {
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (rl3.G(rx90Var.a, strArr[i3])) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : strArr) {
                        if (!tvo.a(activity, str)) {
                            arrayList.add(str);
                        }
                    }
                    n3u.a(activity, arrayList, new gzs() { // from class: xsna.tx90
                        @Override // xsna.gzs
                        public final Object invoke() {
                            gzs<s3q0> gzsVar = rx90.this.e;
                            if (gzsVar != null) {
                                gzsVar.invoke();
                            }
                            PermissionHelper.a.getClass();
                            this.startActivityForResult(PermissionHelper.m(activity), i);
                            return s3q0.a;
                        }
                    }, new rfs(i2, 1, rx90Var, (ArrayList) list, this)).show();
                } else {
                    i3++;
                }
            }
        }
        PermissionHelper.a.getClass();
        PermissionHelper.w(strArr);
    }
}
