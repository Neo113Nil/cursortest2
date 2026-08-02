package ru.ozon.android.messenger.blocks.ai.aiCellWrapper;

import Ae.M0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.a0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.InterfaceC5431s;
import e3.C6285b;
import e3.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.presentation.ai.J0;
import ru.ozon.android.messenger.framework.presentation.ai.K0;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a f83932c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f83933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a aVar, androidx.compose.ui.e eVar) {
        super(2);
        this.f83931b = dVar;
        this.f83932c = aVar;
        this.f83933d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        K0 f89424h;
        Object next;
        CellDTO copy$default;
        CommonControlSettings common;
        CommonControlSettings common2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.core.d dVar = this.f83931b;
            ComponentCallbacksC5392m d11 = dVar.d();
            interfaceC3967k2.o(196977431);
            boolean n11 = interfaceC3967k2.n(d11);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                InterfaceC5431s d12 = dVar.d();
                J0 j02 = d12 instanceof J0 ? (J0) d12 : null;
                C11 = (j02 == null || (f89424h = j02.getF89424h()) == null) ? null : f89424h.b();
                interfaceC3967k2.x(C11);
            }
            M0 m02 = (M0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(196983904);
            InterfaceC3978p0 c11 = m02 == null ? null : C6285b.c(m02, interfaceC3967k2, 0);
            interfaceC3967k2.k();
            boolean booleanValue = c11 != null ? ((Boolean) c11.getValue()).booleanValue() : true;
            ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a aVar = this.f83932c;
            CommonControlSettings common3 = aVar.a().getCommon();
            Map<String, TokenizedTrackingInfo> trackingInfo = common3 != null ? common3.getTrackingInfo() : null;
            CellDTO.RightBlock rightBlock = aVar.a().getRightBlock();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = (rightBlock == null || (common2 = rightBlock.getCommon()) == null) ? null : common2.getTrackingInfo();
            CellDTO.LeftBlock leftBlock = aVar.a().getLeftBlock();
            ArrayList I11 = C7714v.I(C7714v.b0(trackingInfo, trackingInfo2, (leftBlock == null || (common = leftBlock.getCommon()) == null) ? null : common.getTrackingInfo()));
            ArrayList arrayList = new ArrayList();
            Iterator it = I11.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (!((Map) next2).isEmpty()) {
                    arrayList.add(next2);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = U.m((Map) next, (Map) it2.next());
                }
            } else {
                next = null;
            }
            Map map = (Map) next;
            Map<String, MessengerTrackingInfo> a11 = map != null ? h.a(map) : null;
            CellDTO a12 = aVar.a();
            interfaceC3967k2.o(196999772);
            boolean n12 = interfaceC3967k2.n(a12) | interfaceC3967k2.p(booleanValue);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                if (booleanValue) {
                    copy$default = aVar.a();
                } else {
                    CellDTO a13 = aVar.a();
                    CellDTO.Settings settings = aVar.a().getSettings();
                    copy$default = CellDTO.copy$default(a13, null, CellDTO.Settings.copy$default(settings == null ? new CellDTO.Settings(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : settings, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, 2015, null), null, null, null, 29, null);
                }
                C12 = copy$default;
                interfaceC3967k2.x(C12);
            }
            CellDTO cellDTO = (CellDTO) C12;
            interfaceC3967k2.k();
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k2.o(197011412);
            boolean F11 = interfaceC3967k2.F(a11) | interfaceC3967k2.F(dVar);
            Object C13 = interfaceC3967k2.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(a11, dVar);
                interfaceC3967k2.x(C13);
            }
            interfaceC3967k2.k();
            i.a(aVar2, null, (Function0) C13, interfaceC3967k2, 6);
            androidx.compose.ui.e e11 = a0.e(this.f83933d, 1.0f);
            interfaceC3967k2.o(197017912);
            boolean p11 = interfaceC3967k2.p(booleanValue) | interfaceC3967k2.F(a11) | interfaceC3967k2.F(dVar) | interfaceC3967k2.F(cellDTO);
            Object C14 = interfaceC3967k2.C();
            if (p11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new c(booleanValue, a11, dVar, cellDTO);
                interfaceC3967k2.x(C14);
            }
            interfaceC3967k2.k();
            DsCellAtomKt.DsCellAtom(cellDTO, e11, (Function1) C14, interfaceC3967k2, CellDTO.$stable, 0);
        }
        return Unit.f71690a;
    }
}
