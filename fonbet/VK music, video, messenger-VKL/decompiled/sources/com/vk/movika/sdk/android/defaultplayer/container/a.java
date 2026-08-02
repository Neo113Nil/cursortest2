package com.vk.movika.sdk.android.defaultplayer.container;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.model.j;
import com.vk.movika.sdk.base.model.l;
import com.vk.movika.sdk.base.ui.m0;
import com.vk.movika.sdk.base.ui.y;
import com.vk.movika.sdk.base.ui.z;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.e4x0;
import xsna.g0s0;
import xsna.h1y0;
import xsna.j5g;
import xsna.zm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements zm {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.zm
    public boolean a(View view) {
        h1y0 h1y0Var;
        ImageView imageView = (ImageView) this.b;
        com.vk.writebar.g gVar = (com.vk.writebar.g) this.c;
        Context context = imageView.getContext();
        PermissionHelper permissionHelper = PermissionHelper.a;
        Activity h = e3m.h(context);
        permissionHelper.getClass();
        if (!permissionHelper.d(h, PermissionHelper.n, R.string.vkim_permissions_microphone, R.string.vkim_permissions_microphone, new g0s0(5), new e4x0(1)) || (h1y0Var = gVar.d) == null) {
            return true;
        }
        h1y0Var.d();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Collection] */
    public void b(j jVar) {
        b bVar = (b) this.b;
        com.vk.movika.sdk.base.model.g gVar = (com.vk.movika.sdk.base.model.g) this.c;
        if (bVar.g) {
            return;
        }
        com.vk.movika.sdk.base.interactive.a aVar = bVar.j;
        l lVar = new l(bVar.i, jVar, gVar);
        y yVar = y.this;
        m0 m0Var = yVar.d;
        m0Var.w.h(lVar);
        if (yVar.w(new c.f(lVar), true)) {
            yVar.g = j5g.v0(new z(0, yVar, lVar), yVar.g);
        } else {
            m0Var.w.n(lVar);
        }
    }
}
