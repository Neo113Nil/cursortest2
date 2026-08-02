package com.vk.confirmaccount.impl.di;

import android.content.Context;
import android.content.Intent;
import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.confirmaccount.impl.VkConfirmUserByServiceActivity;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.logic.interactor.l;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a3j;
import xsna.b7m;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.lk;
import xsna.nwy;
import xsna.qcy;
import xsna.y2j;
import xsna.z2j;

/* compiled from: ConfirmAccountComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ConfirmAccountComponentImpl implements ConfirmAccountComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ConfirmAccountComponentImpl.class, "confirmUserByServiceInteractor", "getConfirmUserByServiceInteractor()Lcom/vk/confirmaccount/api/ConfirmUserByServiceInteractor;", 0), fp.c(0, ConfirmAccountComponentImpl.class, "confirmUserByServiceParamsRepository", "getConfirmUserByServiceParamsRepository()Lcom/vk/confirmaccount/api/ConfirmUserByServiceParamsRepository;", fpf0.a)};
    public final nwy a = new nwy(new lk(13));
    public final nwy b = new nwy(new l(15));

    /* compiled from: ConfirmAccountComponentImpl.kt */
    public static final class a implements b7m<ConfirmAccountComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ConfirmAccountComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
    public final y2j d2() {
        qcy<Object> qcyVar = c[0];
        return (y2j) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
    public final a3j le() {
        qcy<Object> qcyVar = c[1];
        return (a3j) this.b.c();
    }

    @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
    public final Intent m9(Context context, String str, List<String> list) {
        String uuid = UUID.randomUUID().toString();
        le().a.put(uuid, new z2j(str, list));
        int i = VkConfirmUserByServiceActivity.m;
        return new Intent(context, (Class<?>) VkConfirmUserByServiceActivity.class).putExtra("arg_session_id", uuid);
    }
}
