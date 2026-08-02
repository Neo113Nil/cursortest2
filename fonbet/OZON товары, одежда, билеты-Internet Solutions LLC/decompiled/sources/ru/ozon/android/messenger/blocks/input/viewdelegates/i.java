package ru.ozon.android.messenger.blocks.input.viewdelegates;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes10.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f85581a;

    public i(j jVar) {
        this.f85581a = jVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        ru.ozon.android.messenger.blocks.input.viewmodel.h hVar = this.f85581a.f85582a;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        hVar.A0(str);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
