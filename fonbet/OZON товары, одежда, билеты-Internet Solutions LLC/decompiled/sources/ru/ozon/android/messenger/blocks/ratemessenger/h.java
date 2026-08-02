package ru.ozon.android.messenger.blocks.ratemessenger;

import android.content.Context;
import android.text.Editable;
import java.util.LinkedHashMap;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.l;
import ru.ozon.app.android.messenger.R$string;

/* loaded from: classes10.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f86124a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f86125b;

    h(c cVar, int i11) {
        this.f86124a = cVar;
        this.f86125b = i11;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z11;
        Context context;
        c cVar = this.f86124a;
        if (editable == null || editable.length() <= this.f86125b) {
            cVar.u();
            z11 = false;
        } else {
            context = cVar.getContext();
            cVar.v(ru.ozon.android.messenger.utils.c.d(R$string.messenger_exceeded_number_of_characters, context));
            z11 = true;
        }
        cVar.f86103e = z11;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f86124a.f86101c;
        linkedHashMap.put(d.c.TEXT.a(), String.valueOf(charSequence));
    }
}
