package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.M;

/* loaded from: classes9.dex */
final class p implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MaterialAutoCompleteTextView f58779a;

    p(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        this.f58779a = materialAutoCompleteTextView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        Object item;
        M m11;
        M m12;
        M m13;
        M m14;
        M m15;
        M m16;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f58779a;
        if (i11 < 0) {
            m16 = materialAutoCompleteTextView.f58607e;
            item = m16.q();
        } else {
            item = materialAutoCompleteTextView.getAdapter().getItem(i11);
        }
        MaterialAutoCompleteTextView.b(materialAutoCompleteTextView, item);
        AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i11 < 0) {
                m12 = materialAutoCompleteTextView.f58607e;
                view = m12.t();
                m13 = materialAutoCompleteTextView.f58607e;
                i11 = m13.s();
                m14 = materialAutoCompleteTextView.f58607e;
                j11 = m14.r();
            }
            View view2 = view;
            int i12 = i11;
            long j12 = j11;
            m15 = materialAutoCompleteTextView.f58607e;
            onItemClickListener.onItemClick(m15.h(), view2, i12, j12);
        }
        m11 = materialAutoCompleteTextView.f58607e;
        m11.dismiss();
    }
}
