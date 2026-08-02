package com.vk.attachpicker.impl.fragment;

import android.content.DialogInterface;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.impl.fragment.GraffitiFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cvk;
import xsna.hx2;
import xsna.i0q0;
import xsna.if20;
import xsna.jx2;

/* compiled from: GraffitiFragment.java */
/* loaded from: classes15.dex */
public final class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ Document b;
    public final /* synthetic */ GraffitiFragment.c c;

    /* compiled from: GraffitiFragment.java */
    public class a implements hx2<Integer> {
        public a() {
        }

        @Override // xsna.hx2
        public final void b(Integer num) {
            Integer num2 = num;
            int i = 0;
            if (num2 == null || num2.intValue() != 1) {
                cvk.u(R.string.picker_graffiti_delete_result, false);
                return;
            }
            b bVar = b.this;
            GraffitiFragment.b wo = GraffitiFragment.this.wo();
            Document document = bVar.b;
            ArrayList<Document> arrayList = wo.d;
            if (document == null) {
                return;
            }
            int i2 = document.b;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i).b == i2) {
                    arrayList.remove(i);
                    wo.notifyItemRemoved(i + 1);
                    break;
                }
                i++;
            }
            if (arrayList.size() == 0) {
                i0q0.d(300L, new com.vk.attachpicker.impl.fragment.a(wo));
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            cvk.u(R.string.picker_graffiti_delete_result, false);
        }
    }

    public b(GraffitiFragment.c cVar, Document document) {
        this.c = cVar;
        this.b = document;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            int i2 = this.b.b;
            if20 if20Var = new if20("messages.hideRecentGraffiti", 0);
            if20Var.C(i2, "doc_id");
            new jx2(if20Var, new a()).a();
        }
    }
}
