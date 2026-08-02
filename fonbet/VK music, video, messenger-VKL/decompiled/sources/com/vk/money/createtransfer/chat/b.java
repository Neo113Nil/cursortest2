package com.vk.money.createtransfer.chat;

import android.widget.EditText;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import xsna.d7k;

/* compiled from: CreateChatTransferFragment.kt */
/* loaded from: classes3.dex */
public final class b extends CreateChatTransferFragment.b {
    public final /* synthetic */ CreateChatTransferFragment b;

    public b(CreateChatTransferFragment createChatTransferFragment) {
        this.b = createChatTransferFragment;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = CreateChatTransferFragment.F0;
        CreateChatTransferFragment createChatTransferFragment = this.b;
        Object obj = createChatTransferFragment.m0;
        if (obj == null) {
            obj = null;
        }
        d7k d7kVar = (d7k) obj;
        EditText editText = createChatTransferFragment.q0;
        d7kVar.j(String.valueOf(editText != null ? editText.getText() : null));
    }
}
