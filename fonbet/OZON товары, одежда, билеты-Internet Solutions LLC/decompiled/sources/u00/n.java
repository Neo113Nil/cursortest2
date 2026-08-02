package u00;

import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import t00.AbstractC9720b;
import t00.C9721c;

/* loaded from: classes3.dex */
public final class n<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f99731a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.list.ComposerDebugMenuItemsListViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ComposerDebugMenuItemsListViewModel.kt", l = {223}, m = "emit")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f99732d;

        /* renamed from: e, reason: collision with root package name */
        int f99733e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f99732d = obj;
            this.f99733e |= LinearLayoutManager.INVALID_OFFSET;
            return n.this.emit(null, this);
        }
    }

    public n(InterfaceC2397i interfaceC2397i) {
        this.f99731a = interfaceC2397i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v3, types: [t00.b$d] */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i11;
        AbstractC9720b.C2174b c2174b;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f99733e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f99733e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f99732d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f99733e;
                if (i11 != 0) {
                    s.b(obj2);
                    C8029a c8029a = (C8029a) obj;
                    Tc.b builder = C7714v.B();
                    for (Map.Entry<InterfaceC8826b<? extends Object>, Object> entry : c8029a.d().entrySet()) {
                        InterfaceC8826b<? extends Object> flagInfo = entry.getKey();
                        Object value = entry.getValue();
                        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (flagInfo instanceof InterfaceC8826b.a) {
                            InterfaceC8826b.a aVar3 = (InterfaceC8826b.a) flagInfo;
                            kotlin.reflect.e.a(aVar3.a(), value);
                            Boolean bool = (Boolean) value;
                            boolean booleanValue = bool.booleanValue();
                            CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(new CellDTO.CellText(OzonSpannableStringKt.toOzonSpannableString(aVar3.b()), null, null, false, null, null, 62, null), null, null, null, null, null, 62, null);
                            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_400;
                            CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
                            Boolean bool2 = Boolean.TRUE;
                            c2174b = new AbstractC9720b.C2174b(new CellDTO(centerBlock, new CellDTO.Settings(null, layoutPadding2, layoutPadding, layoutPadding, bool2, Boolean.FALSE, null, null, null, null, null, 1985, null), null, new CellDTO.RightBlock(null, null, null, null, null, null, null, null, null, null, new ToggleDTO(bool, bool2, null, null, null, ToggleDTO.ToggleSize.SIZE_600, 28, null), null, 3071, null), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, "1", "1", null, 8, null), null, null, 6, null), 4, null), booleanValue, aVar3);
                        } else if (flagInfo instanceof InterfaceC8826b.AbstractC1343b) {
                            InterfaceC8826b.AbstractC1343b abstractC1343b = (InterfaceC8826b.AbstractC1343b) flagInfo;
                            kotlin.reflect.e.a(abstractC1343b.a(), value);
                            c2174b = new AbstractC9720b.d((String) value, new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_600, null, null, "ic_m_check", Boolean.TRUE, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, "1", "1", null, 8, null), null, null, 6, null), null, null, null, null, null, null, 16230, null), abstractC1343b);
                        } else {
                            c2174b = null;
                        }
                        if (c2174b != null) {
                            builder.add(c2174b);
                        }
                    }
                    for (Map.Entry<String, Boolean> entry2 : c8029a.c().entrySet()) {
                        builder.add(new AbstractC9720b.a(entry2.getKey(), entry2.getValue().booleanValue()));
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    C9721c c9721c = new C9721c(builder.B(), c8029a.e());
                    aVar.f99733e = 1;
                    if (this.f99731a.emit(c9721c, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f99732d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f99733e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
