package com.vk.superapp.verification.account;

import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Locale;
import xsna.pzl;
import xsna.tf3;

/* compiled from: VkVerificationAccountAdapter.kt */
/* loaded from: classes6.dex */
public final class a extends RecyclerView.Adapter<C1910a> {
    public final ArrayList c = new ArrayList();

    /* compiled from: VkVerificationAccountAdapter.kt */
    /* renamed from: com.vk.superapp.verification.account.a$a, reason: collision with other inner class name */
    public static final class C1910a extends RecyclerView.e0 {
        public final String l;
        public final TextView m;

        public C1910a(ViewGroup viewGroup) {
            super(tf3.b(viewGroup, R.layout.vk_confirmation_account_migrate_data_item, viewGroup, false));
            this.l = " → ";
            View view = this.itemView;
            this.m = view instanceof TextView ? (TextView) view : null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C1910a c1910a, int i) {
        String str;
        C1910a c1910a2 = c1910a;
        b.f fVar = (b.f) this.c.get(i);
        String str2 = c1910a2.l;
        String str3 = fVar.c;
        String str4 = fVar.a;
        if (str4.length() > 0) {
            String b = pzl.b(str4, str2, str3);
            int length = str4.length();
            SpannableString spannableString = new SpannableString(b);
            spannableString.setSpan(new StrikethroughSpan(), 0, length, 33);
            str = spannableString;
        } else {
            str = pzl.b(c1910a2.itemView.getContext().getString(fVar.b).toLowerCase(Locale.ROOT), str2, str3);
        }
        TextView textView = c1910a2.m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C1910a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C1910a(viewGroup);
    }
}
