package com.vk.friends.recommendations.impl.presentation;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.contacts.ContactsManager;
import com.vk.contacts.d;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.jjc;
import xsna.jrh;
import xsna.vif0;

/* compiled from: ImportContactsHolder.kt */
/* loaded from: classes16.dex */
public final class b extends vif0<Item> implements View.OnClickListener {
    public final View n;

    public b(ViewGroup viewGroup) {
        super(viewGroup, R.layout.friends_recommendations_import_button, 0);
        View findViewById = this.itemView.findViewById(R.id.button);
        this.n = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(Item item) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity h;
        if (jjc.b() || (h = e3m.h(this.itemView.getContext())) == null) {
            return;
        }
        ContactsManager.R0(d.a, h, false, null, null, new jrh(h, 19), 30);
    }
}
