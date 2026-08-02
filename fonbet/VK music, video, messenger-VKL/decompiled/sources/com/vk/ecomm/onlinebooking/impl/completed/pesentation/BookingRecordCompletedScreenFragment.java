package com.vk.ecomm.onlinebooking.impl.completed.pesentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.as7;
import xsna.bpn0;
import xsna.bs7;
import xsna.bu1;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;
import xsna.jb5;
import xsna.kai;
import xsna.mm7;
import xsna.msy;
import xsna.mu7;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.qt7;
import xsna.rt7;
import xsna.rwp;
import xsna.s200;
import xsna.s3q0;
import xsna.st7;
import xsna.tt7;
import xsna.ut7;
import xsna.vt7;
import xsna.wr7;

/* compiled from: BookingRecordCompletedScreenFragment.kt */
/* loaded from: classes.dex */
public final class BookingRecordCompletedScreenFragment extends FragmentImpl implements bs7 {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final bpn0 N = new bpn0(new h(this, 10));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new i(this, 5));
    public final nzw P = s200.M(this, fpf0.d(mu7.class).toString(), new bu1(this, 5));

    /* compiled from: BookingRecordCompletedScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: BookingRecordCompletedScreenFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<qt7, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qt7 qt7Var) {
            mm7 aVar;
            as7.m mVar;
            as7 as7Var;
            qt7 qt7Var2 = qt7Var;
            BookingRecordCompletedScreenFragment bookingRecordCompletedScreenFragment = (BookingRecordCompletedScreenFragment) this.receiver;
            qcy<Object>[] qcyVarArr = BookingRecordCompletedScreenFragment.Q;
            bookingRecordCompletedScreenFragment.getClass();
            if (qt7Var2 instanceof qt7.c) {
                qt7.c cVar = (qt7.c) qt7Var2;
                if (epx.f(cVar, qt7.c.a.a)) {
                    as7Var = as7.b.a;
                } else if (epx.f(cVar, qt7.c.b.a)) {
                    as7Var = new as7.a(bookingRecordCompletedScreenFragment.eo().q);
                } else {
                    if (cVar instanceof qt7.c.e) {
                        mVar = new as7.m(((qt7.c.e) cVar).a, true);
                    } else if (cVar instanceof qt7.c.C3571c) {
                        qt7.c.C3571c c3571c = (qt7.c.C3571c) cVar;
                        UserId userId = c3571c.a;
                        BookingRecord bookingRecord = c3571c.c;
                        int i = a.m.d.a;
                        BookingSettings bookingSettings = c3571c.b;
                        List<BookingServiceModel> list = bookingRecord.e;
                        BookingMaster bookingMaster = bookingRecord.f;
                        String str = bookingRecord.h;
                        BookingScreenParams.DateTime dateTime = new BookingScreenParams.DateTime(str, str, bookingRecord.i, null, null, bookingRecord.o);
                        int i2 = bookingRecord.b;
                        mVar = new as7.m(new BookingScreenParams(userId, i, bookingSettings, list, bookingMaster, false, dateTime, bookingRecord.n, bookingRecord.d, bookingRecord.c, i2, bookingRecord.p, 0, null, null, null, null, 127008, null), false);
                    } else {
                        if (!(cVar instanceof qt7.c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qt7.c.d dVar = (qt7.c.d) cVar;
                        UserId userId2 = dVar.a;
                        int i3 = a.n.d.a;
                        BookingSettings bookingSettings2 = dVar.b;
                        BookingRecord bookingRecord2 = dVar.c;
                        List<BookingServiceModel> list2 = bookingRecord2.e;
                        BookingMaster bookingMaster2 = bookingRecord2.f;
                        int i4 = bookingRecord2.b;
                        mVar = new as7.m(new BookingScreenParams(userId2, i3, bookingSettings2, list2, bookingMaster2, false, null, bookingRecord2.n, bookingRecord2.d, bookingRecord2.c, i4, bookingRecord2.p, 0, null, null, null, null, 127008, null), false);
                    }
                    as7Var = mVar;
                }
                wr7.a(bookingRecordCompletedScreenFragment, as7Var);
            } else if (qt7Var2 instanceof qt7.a) {
                b.h hVar = b.h.b;
                qt7.a aVar2 = (qt7.a) qt7Var2;
                if (aVar2 instanceof rt7) {
                    rt7 rt7Var = (rt7) aVar2;
                    aVar = new mm7.a.C3351a(rt7Var.a, rt7Var.b, bookingRecordCompletedScreenFragment.eo().q);
                } else if (aVar2 instanceof st7) {
                    st7 st7Var = (st7) aVar2;
                    aVar = new mm7.a.e(st7Var.a, st7Var.b, bookingRecordCompletedScreenFragment.eo().q, Integer.valueOf(bookingRecordCompletedScreenFragment.eo().n));
                } else if (aVar2 instanceof tt7) {
                    tt7 tt7Var = (tt7) aVar2;
                    aVar = new mm7.a.f(tt7Var.a, tt7Var.b, bookingRecordCompletedScreenFragment.eo().q);
                } else if (aVar2 instanceof ut7) {
                    ut7 ut7Var = (ut7) aVar2;
                    aVar = new mm7.b.C3352b(ut7Var.a, ut7Var.b, bookingRecordCompletedScreenFragment.eo().q);
                } else if (aVar2 instanceof vt7) {
                    vt7 vt7Var = (vt7) aVar2;
                    aVar = new mm7.b.g(vt7Var.b, vt7Var.c, bookingRecordCompletedScreenFragment.eo().q, vt7Var.a);
                } else {
                    if (!(aVar2 instanceof qt7.a.C3570a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new mm7.b.a(bookingRecordCompletedScreenFragment.eo().b, ((qt7.a.C3570a) aVar2).a, bookingRecordCompletedScreenFragment.eo().q);
                }
                wr7.b(bookingRecordCompletedScreenFragment, hVar, aVar);
            } else {
                if (!(qt7Var2 instanceof qt7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rwp.a(bookingRecordCompletedScreenFragment.requireContext(), ((qt7.b) qt7Var2).a, false);
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BookingRecordCompletedScreenFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/onlinebooking/impl/completed/pesentation/mvi2/BookingRecordCompletedScreenStore;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    @Override // xsna.bs7
    public final com.vk.ecomm.onlinebooking.impl.navhostfragment.b X9() {
        return b.h.b;
    }

    public final BookingScreenParams eo() {
        return (BookingScreenParams) this.N.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(kai.b(-919547758, new jb5(this, 1)));
        return composeView;
    }
}
