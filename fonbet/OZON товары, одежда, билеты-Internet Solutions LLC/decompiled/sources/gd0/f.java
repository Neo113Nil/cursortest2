package gd0;

import Sc.InterfaceC4008j;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.RestoreAccesDTO;
import ru.ozon.id.nativeauth.data.models.RestoreAccesVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xc0.C10702a;
import xe.M;
import zc0.C11092g;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.restoreAccess.CantLoginInAccountViewModel$load$1", f = "CantLoginInAccountViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64276d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f64277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f64277e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f64277e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        String str;
        InterfaceC4008j interfaceC4008j2;
        Object w11;
        C11092g c11092g;
        RestoreAccesDTO restoreAccesDTO;
        ArrayList arrayList;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64276d;
        h hVar = this.f64277e;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = hVar.f64282c;
            Pc0.c cVar = (Pc0.c) interfaceC4008j.getValue();
            str = hVar.f64280a;
            String b11 = cVar.o(str).b();
            interfaceC4008j2 = hVar.f64281b;
            C10702a c10702a = (C10702a) interfaceC4008j2.getValue();
            this.f64276d = 1;
            w11 = c10702a.w(b11, this);
            if (w11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            w11 = obj;
        }
        c11092g = hVar.f64283d;
        RestoreAccesDTO dto = (RestoreAccesDTO) w11;
        c11092g.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        OzonSpannableString subtitle = dto.getSubtitle();
        List<RestoreAccesDTO.CellButtonDTO> cells = dto.getCells();
        if (cells != null) {
            Intrinsics.checkNotNullParameter(cells, "<this>");
            List<RestoreAccesDTO.CellButtonDTO> list = cells;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (RestoreAccesDTO.CellButtonDTO cellButtonDTO : list) {
                String deeplink = cellButtonDTO.getDeeplink();
                String action = cellButtonDTO.getAction();
                String trackClick = cellButtonDTO.getTrackClick();
                CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_400;
                CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
                CellDTO.Settings settings = new CellDTO.Settings(layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, null, null, "bgPrimary", CornerRadius.NO_RADIUS, null, null, null, 1840, null);
                arrayList.add(new C11092g.a(deeplink, action, trackClick, new CellDTO(new CellDTO.CenterBlock(new CellDTO.CellText(new OzonSpannableString(cellButtonDTO.getTitle()), "textPrimary", null, false, null, null, 60, null), null, null, null, null, null, 62, null), settings, null, new CellDTO.RightBlock(null, null, null, layoutPadding, layoutPadding, null, null, new IconDTO(null, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_chevron_right", "graphicTertiary"), null, null, null, null, null, null, null, null, null, null, null, 65515, null), null, null, null, null, 3943, null), null, 20, null)));
                dto = dto;
            }
            restoreAccesDTO = dto;
        } else {
            restoreAccesDTO = dto;
            arrayList = null;
        }
        h.i0(hVar, new RestoreAccesVO(title, subtitle, arrayList, restoreAccesDTO.getFeatureFlags()));
        return Unit.f71690a;
    }
}
