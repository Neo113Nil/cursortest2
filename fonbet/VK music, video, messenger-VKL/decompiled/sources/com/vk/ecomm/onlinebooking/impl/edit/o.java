package com.vk.ecomm.onlinebooking.impl.edit;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.common.links.LinksParserData;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.edit.p;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dm50;
import xsna.epx;
import xsna.ft7;
import xsna.hq7;
import xsna.i5g;
import xsna.saz;
import xsna.sdz;
import xsna.taz;
import xsna.yy;
import xsna.zp7;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final class o extends dm50<hq7, f, BookingEditScreenState> {
    public final sdz d;

    public o(BookingScreenParams bookingScreenParams, sdz sdzVar) {
        super(new BookingEditScreenState(bookingScreenParams, BookingEditModel.j, null, null, false, BookingEditScreenState.a.C0956a.g, BookingEditScreenState.InfoBlock.a(BookingEditScreenState.InfoBlock.k, null, null, null, null, bookingScreenParams.i, null, false, 991), BookingEditScreenState.f.b, BookingEditScreenState.b.e, false));
        this.d = sdzVar;
    }

    @Override // xsna.dm50
    public final BookingEditScreenState c(BookingEditScreenState bookingEditScreenState, f fVar) {
        BookingEditScreenState.a c0956a;
        BookingEditScreenState.InfoBlock.State state;
        BookingEditScreenState bookingEditScreenState2 = bookingEditScreenState;
        f fVar2 = fVar;
        BookingEditModel bookingEditModel = bookingEditScreenState2.c;
        if (fVar2 instanceof f.e) {
            f.e eVar = (f.e) fVar2;
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, new BookingEditScreenState.d(eVar.b, eVar.c), null, false, null, null, null, null, false, 1019);
        }
        if (fVar2 instanceof f.j) {
            f.j jVar = (f.j) fVar2;
            BookingEditModel bookingEditModel2 = jVar.b;
            BookingEditModel.EditMode editMode = bookingEditModel2.a;
            List<BookingServiceModel> list = bookingEditModel2.d;
            int[] iArr = p.a.$EnumSwitchMapping$0;
            int i = iArr[editMode.ordinal()];
            if (i == 1 || i == 2) {
                c0956a = new BookingEditScreenState.a.C0956a(list.size(), bookingEditModel2.c.b, ft7.a.a(new i5g(list)), this.d.d(bookingEditModel2.f, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)), bookingEditModel2.g, bookingEditModel2.h);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c0956a = BookingEditScreenState.a.b.a;
            }
            BookingEditModel bookingEditModel3 = jVar.b;
            int i2 = iArr[bookingEditModel3.a.ordinal()];
            if (i2 == 1) {
                state = BookingEditScreenState.InfoBlock.State.Editable;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                state = BookingEditScreenState.InfoBlock.State.ReadOnly;
            }
            BookingEditScreenState.InfoBlock.State state2 = state;
            BookingEditModel.b bVar = bookingEditModel3.e;
            return BookingEditScreenState.a(bookingEditScreenState2, null, bookingEditModel2, null, null, false, c0956a, new BookingEditScreenState.InfoBlock(state2, bVar.a, BookingEditScreenState.InfoBlock.NameError.None, bVar.c, BookingEditScreenState.InfoBlock.PhoneError.None, bVar.e, BookingEditScreenState.InfoBlock.Error.None, bVar.f, bVar.g, bVar.h), null, null, false, 913);
        }
        if (fVar2 instanceof f.m) {
            ((f.m) fVar2).getClass();
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, null, null, null, false, 1015);
        }
        if (fVar2 instanceof f.o) {
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, true, null, null, null, null, false, 1007);
        }
        if (fVar2 instanceof f.d) {
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, null, null, null, false, 1007);
        }
        if (fVar2 instanceof f.h) {
            f.h hVar = (f.h) fVar2;
            return BookingEditScreenState.a(bookingEditScreenState2, null, BookingEditModel.a(bookingEditModel, null, null, BookingEditModel.b.a(bookingEditModel.e, hVar.b, null, null, false, 254), 0, 495), null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, hVar.b, null, null, null, null, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT), null, null, false, 957);
        }
        if (fVar2 instanceof f.i) {
            f.i iVar = (f.i) fVar2;
            return BookingEditScreenState.a(bookingEditScreenState2, null, BookingEditModel.a(bookingEditModel, null, null, BookingEditModel.b.a(bookingEditModel.e, null, iVar.b, null, false, 251), 0, 495), null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, iVar.b, null, null, null, false, 1015), null, null, false, 957);
        }
        if (fVar2 instanceof f.C0968f) {
            f.C0968f c0968f = (f.C0968f) fVar2;
            return BookingEditScreenState.a(bookingEditScreenState2, null, BookingEditModel.a(bookingEditModel, null, null, BookingEditModel.b.a(bookingEditModel.e, null, null, c0968f.b, false, 239), 0, 495), null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, null, c0968f.b, null, false, 991), null, null, false, 957);
        }
        if (fVar2 instanceof f.g) {
            f.g gVar = (f.g) fVar2;
            BookingEditScreenState.InfoBlock infoBlock = bookingEditScreenState2.h;
            boolean z = gVar.b;
            BookingEditScreenState.InfoBlock a = BookingEditScreenState.InfoBlock.a(infoBlock, z ? bookingEditModel.e.b : infoBlock.b, BookingEditScreenState.InfoBlock.NameError.None, z ? bookingEditModel.e.d : "", BookingEditScreenState.InfoBlock.PhoneError.None, null, null, z, 865);
            BookingEditModel.b bVar2 = bookingEditModel.e;
            boolean z2 = gVar.b;
            return BookingEditScreenState.a(bookingEditScreenState2, null, BookingEditModel.a(bookingEditModel, null, null, BookingEditModel.b.a(bVar2, z2 ? bVar2.b : bookingEditScreenState2.h.b, z2 ? bVar2.d : "", null, z2, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE), 0, 495), null, null, false, null, a, null, null, false, 957);
        }
        if (fVar2 instanceof f.a) {
            f.a aVar = (f.a) fVar2;
            if (epx.f(aVar, f.a.C0966a.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, null, null, BookingEditScreenState.InfoBlock.Error.None, false, 959), null, null, false, 959);
            }
            if (epx.f(aVar, f.a.b.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, null, null, BookingEditScreenState.InfoBlock.Error.TooLong, false, 959), null, null, false, 959);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fVar2 instanceof f.l) {
            f.l lVar = (f.l) fVar2;
            if (epx.f(lVar, f.l.a.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, BookingEditScreenState.InfoBlock.PhoneError.None, null, null, false, 1007), null, null, false, 959);
            }
            if (epx.f(lVar, f.l.c.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, BookingEditScreenState.InfoBlock.PhoneError.TooLong, null, null, false, 1007), null, null, false, 959);
            }
            if (epx.f(lVar, f.l.d.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, BookingEditScreenState.InfoBlock.PhoneError.WrongFormat, null, null, false, 1007), null, null, false, 959);
            }
            if (epx.f(lVar, f.l.b.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, null, null, BookingEditScreenState.InfoBlock.PhoneError.Empty, null, null, false, 1007), null, null, false, 959);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fVar2 instanceof f.k) {
            f.k kVar = (f.k) fVar2;
            if (epx.f(kVar, f.k.a.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, BookingEditScreenState.InfoBlock.NameError.None, null, null, null, null, false, 1019), null, null, false, 959);
            }
            if (epx.f(kVar, f.k.c.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, BookingEditScreenState.InfoBlock.NameError.TooLong, null, null, null, null, false, 1019), null, null, false, 959);
            }
            if (epx.f(kVar, f.k.b.b)) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, BookingEditScreenState.InfoBlock.a(bookingEditScreenState2.h, null, BookingEditScreenState.InfoBlock.NameError.Empty, null, null, null, null, false, 1019), null, null, false, 959);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fVar2 instanceof f.n) {
            return BookingEditScreenState.a(bookingEditScreenState2, BookingScreenParams.a(bookingEditScreenState2.b, 0, ((f.n) fVar2).b, null, null, null, 0, null, 0, null, 131067), null, null, null, false, null, null, null, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        if (fVar2 instanceof zp7) {
            NotificationVariants notificationVariants = ((zp7) fVar2).b;
            return BookingEditScreenState.a(bookingEditScreenState2, null, BookingEditModel.a(bookingEditScreenState2.c, null, null, null, notificationVariants.j(), 255), null, null, false, null, null, new BookingEditScreenState.f(notificationVariants), null, false, 893);
        }
        if (fVar2 instanceof f.c) {
            f.c cVar = (f.c) fVar2;
            BookingEditScreenState.b bVar3 = bookingEditScreenState2.j;
            if (bVar3 == null) {
                return bookingEditScreenState2;
            }
            if (cVar instanceof f.c.a) {
                return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, null, null, BookingEditScreenState.b.a(bVar3, ((f.c.a) cVar).b, null, null, null, 14), false, 767);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(fVar2 instanceof f.b)) {
            throw new NoWhenBranchMatchedException();
        }
        f.b bVar4 = (f.b) fVar2;
        if (epx.f(bVar4, f.b.a.b)) {
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, null, null, null, true, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        if (epx.f(bVar4, f.b.C0967b.b)) {
            return BookingEditScreenState.a(bookingEditScreenState2, null, null, null, null, false, null, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final hq7 d() {
        return new hq7(e(new yy(6)));
    }

    @Override // xsna.dm50
    public final void h(BookingEditScreenState bookingEditScreenState, hq7 hq7Var) {
        f(hq7Var.a, bookingEditScreenState);
    }
}
