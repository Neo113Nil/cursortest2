package com.vk.file_picker.external;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.file_picker.external.a;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao50;
import xsna.c5g;
import xsna.f5z;
import xsna.gm50;
import xsna.hb0;
import xsna.ht;
import xsna.j6e;
import xsna.keq;
import xsna.km50;
import xsna.mk50;
import xsna.o1e;
import xsna.oeq;
import xsna.oz50;
import xsna.req;
import xsna.t6g0;
import xsna.vk50;
import xsna.wa0;
import xsna.y9r;
import xsna.z1h0;

/* compiled from: ExternalFilePickerFragment.kt */
@TargetApi(30)
/* loaded from: classes18.dex */
public final class ExternalFilePickerFragment extends MviImplFragment<b, e, com.vk.file_picker.external.a> {
    public static final /* synthetic */ int R = 0;
    public final hb0<String[]> Q = registerForActivityResult(new wa0(), new keq(this, 0));

    /* compiled from: ExternalFilePickerFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ExternalFilePickerFragment.class, null, null);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.appkit_loading);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        e eVar = (e) ao50Var;
        gm50.a.b(this, eVar.c, new ht(24));
        gm50.a.b(this, eVar.a, new o1e(this, 21));
        gm50.a.b(this, eVar.b, new j6e(this, 22));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    /* renamed from: eo */
    public final km50 sf(Parcelable parcelable) {
        if (parcelable instanceof HackedState) {
            return (HackedState) parcelable;
        }
        return null;
    }

    public final void fo(List<? extends File> list) {
        Intent intent = new Intent();
        List<? extends File> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.fromFile((File) it.next()).toString());
        }
        intent.putStringArrayListExtra("files", new ArrayList<>(arrayList));
        z1h0 parentFragment = getParentFragment();
        y9r y9rVar = parentFragment instanceof y9r ? (y9r) parentFragment : null;
        if (y9rVar != null) {
            y9rVar.Fj(list.isEmpty() ? 0 : -1, intent);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        Mf(-1, intent);
    }

    @Override // androidx.fragment.app.Fragment, xsna.gm50
    public final f5z getViewOwner() {
        return getViewLifecycleOwner();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    public final Parcelable vb() {
        return HackedState.b;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        long j = bundle.getLong("size_limit", Long.MAX_VALUE);
        List stringArrayList = bundle.getStringArrayList("unavailable_extensions");
        if (stringArrayList == null) {
            stringArrayList = EmptyList.b;
        }
        List list = stringArrayList;
        a.b bVar = km50Var != null ? null : a.b.b;
        t6g0 t6g0Var = t6g0.b;
        return new b(bVar, new d(new oeq(null, null, 5)), this, new f(this, j, list, this, new req(requireContext())));
    }
}
