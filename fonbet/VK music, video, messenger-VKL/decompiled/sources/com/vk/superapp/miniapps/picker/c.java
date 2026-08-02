package com.vk.superapp.miniapps.picker;

import android.view.View;
import com.vk.api.generated.apps.dto.AppsActionForMessengerDto;
import com.vk.movika.sdk.base.observable.q;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vk.superapp.miniapps.picker.j;
import org.json.JSONObject;
import xsna.e370;
import xsna.iu1;
import xsna.jv;
import xsna.lf3;
import xsna.vdx0;
import xsna.yq;

/* compiled from: AppsPickerFragment.kt */
/* loaded from: classes6.dex */
public final class c implements j.a {
    public final /* synthetic */ AppsPickerFragment a;
    public final /* synthetic */ View b;
    public final /* synthetic */ j c;
    public final /* synthetic */ PickerItem.d d;

    public c(AppsPickerFragment appsPickerFragment, View view, j jVar, PickerItem.d dVar) {
        this.a = appsPickerFragment;
        this.b = view;
        this.c = jVar;
        this.d = dVar;
    }

    @Override // com.vk.superapp.miniapps.picker.j.a
    public final void b() {
        AppsPickerFragment appsPickerFragment = this.a;
        io.reactivex.rxjava3.disposables.c cVar = appsPickerFragment.U;
        if (cVar != null) {
            cVar.dispose();
        }
        JSONObject d = yq.d("type", "app_action");
        PickerItem.d dVar = this.d;
        d.put("app_id", dVar.g.b);
        AppsActionForMessengerDto appsActionForMessengerDto = dVar.f;
        d.put("title", appsActionForMessengerDto.e());
        d.put("hash", appsActionForMessengerDto.d());
        String jSONObject = d.toString();
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.disposables.c subscribe = vdx0Var.l().b(appsPickerFragment.io().b, jSONObject).subscribe(new jv(new q(appsPickerFragment, 5), 4), new iu1(new lf3(this.c, appsPickerFragment, this.b, 0), 1));
        appsPickerFragment.eo(subscribe);
        appsPickerFragment.U = subscribe;
    }

    @Override // com.vk.superapp.miniapps.picker.j.a
    public final void c() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.U;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
