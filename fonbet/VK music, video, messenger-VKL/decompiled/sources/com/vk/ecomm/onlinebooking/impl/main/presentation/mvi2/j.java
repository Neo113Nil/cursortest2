package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.i;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm50;
import xsna.j5g;
import xsna.wz7;
import xsna.xz7;

/* compiled from: BookingStartScreenReducer.kt */
/* loaded from: classes18.dex */
public final class j implements bm50<k, i> {
    @Override // xsna.bm50
    public final k a(k kVar, i iVar) {
        k kVar2 = kVar;
        i iVar2 = iVar;
        if (iVar2 instanceof xz7) {
            return k.a(kVar2, null, true, null, null, null, null, null, false, false, null, 1019);
        }
        if (iVar2 instanceof wz7) {
            wz7 wz7Var = (wz7) iVar2;
            BookingSettings bookingSettings = wz7Var.a;
            ArrayList arrayList = wz7Var.b;
            String str = bookingSettings != null ? bookingSettings.d : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            BookingMaster bookingMaster = (BookingMaster) j5g.a0(arrayList);
            return k.a(kVar2, null, false, str2, bookingMaster != null ? bookingMaster.j : null, bookingSettings, arrayList, wz7Var.c, wz7Var.d, false, wz7Var.e, 513);
        }
        if (iVar2 instanceof i.d) {
            i.d dVar = (i.d) iVar2;
            return k.a(kVar2, new k.a(com.vk.ecomm.onlinebooking.impl.common.b.c(dVar.a), dVar.b), false, null, null, null, null, null, false, false, null, 2041);
        }
        if (iVar2.equals(i.c.a)) {
            return k.a(kVar2, null, false, null, null, null, null, null, false, true, null, 1535);
        }
        if (iVar2 instanceof i.a) {
            return k.a(kVar2, null, false, null, null, null, null, null, false, false, null, 1535);
        }
        if (iVar2.equals(i.b.a)) {
            return k.a(kVar2, null, false, null, null, null, null, null, false, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(i iVar) {
        return true;
    }
}
