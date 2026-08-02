package com.vk.movika.sdk.base.asset;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.permission.PermissionHelper;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bf01;
import xsna.cfl;
import xsna.g94;
import xsna.jy90;
import xsna.kz30;
import xsna.ldl;
import xsna.mb01;
import xsna.msy;
import xsna.oxz;
import xsna.rk01;
import xsna.rmk0;

/* loaded from: classes3.dex */
public final class b implements g94, rk01 {
    public final Object b;

    public /* synthetic */ b(Object obj) {
        this.b = obj;
    }

    public boolean a(PermissionType permissionType) {
        Context context = ((jy90) this.b).a;
        int i = jy90.a.$EnumSwitchMapping$0[permissionType.ordinal()];
        if (i == 1) {
            PermissionHelper.a.getClass();
            return PermissionHelper.b(context, PermissionHelper.l);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            AtomicReference<Location> atomicReference = oxz.a;
            return oxz.a(context);
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        rmk0 rmk0Var = new rmk0(2);
        permissionHelper.getClass();
        rmk0Var.b(PermissionHelper.e);
        rmk0Var.b(PermissionHelper.f);
        ArrayList<Object> arrayList = rmk0Var.a;
        return PermissionHelper.c(context, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // xsna.rk01
    public void c(Bundle bundle, String str) {
        bf01 bf01Var = (bf01) this.b;
        if (!TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((mb01) bf01Var.b).o.getClass();
        bf01Var.q("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // xsna.g94
    public int d(Attachment attachment) {
        return -1;
    }

    @Override // xsna.g94
    public List getAll() {
        WriteBar writeBar = ((kz30) this.b).t;
        if (writeBar == null) {
            writeBar = null;
        }
        return writeBar.getAttachments();
    }

    public b(cfl cflVar) {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new ldl(cflVar, 0));
    }

    @Override // xsna.g94
    public void i(int i) {
    }

    @Override // xsna.g94
    public void j(LinkedHashMap linkedHashMap) {
    }

    @Override // xsna.g94
    public void g(PendingPhotoAttachment pendingPhotoAttachment, Integer num) {
    }
}
