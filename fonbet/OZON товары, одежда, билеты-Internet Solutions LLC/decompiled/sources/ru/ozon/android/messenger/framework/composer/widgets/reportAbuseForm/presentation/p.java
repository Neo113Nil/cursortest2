package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/presentation/p;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/presentation/v;", "Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/presentation/n;", "Lru/ozon/android/messenger/framework/composer/widgets/reportAbuseForm/presentation/a;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends v<n, a> {
    public p() {
        super(new n(0));
    }

    @Override // ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void g0(@NotNull a action) {
        Object f02;
        Object f03;
        Object f04;
        Object f05;
        CommonControlSettings common;
        AtomActionDTO action2;
        Map<String, String> params;
        String orDefault;
        CommonControlSettings common2;
        AtomActionDTO action3;
        Map<String, String> params2;
        String orDefault2;
        Object f06;
        AtomActionDTO action4;
        Map<String, String> params3;
        AtomActionDTO action5;
        Map<String, String> params4;
        Intrinsics.checkNotNullParameter(action, "action");
        String str = "";
        boolean z11 = false;
        if (action instanceof a.C1556a) {
            a.C1556a c1556a = (a.C1556a) action;
            List<CellDTO> b11 = c1556a.a().b();
            Iterator<CellDTO> it = b11.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                CellDTO.LeftBlock leftBlock = it.next().getLeftBlock();
                AtomDTO control = leftBlock != null ? leftBlock.getControl() : null;
                RadioDTO radioDTO = control instanceof RadioDTO ? (RadioDTO) control : null;
                if (radioDTO != null ? Intrinsics.d(radioDTO.isSelected(), Boolean.TRUE) : false) {
                    break;
                } else {
                    i11++;
                }
            }
            Integer valueOf = i11 >= 0 ? Integer.valueOf(i11) : null;
            if (valueOf != null) {
                CommonControlSettings common3 = b11.get(valueOf.intValue()).getCommon();
                String str2 = (common3 == null || (action5 = common3.getAction()) == null || (params4 = action5.getParams()) == null) ? null : params4.get("reason");
                if (str2 != null) {
                    str = str2;
                }
            }
            String str3 = str;
            if (valueOf != null) {
                CommonControlSettings common4 = b11.get(valueOf.intValue()).getCommon();
                z11 = Intrinsics.d((common4 == null || (action4 = common4.getAction()) == null || (params3 = action4.getParams()) == null) ? null : params3.get("isDescriptionRequired"), "true");
            }
            boolean z12 = z11;
            f06 = f0();
            n nVar = (n) f06;
            o.a c11 = c1556a.a().c();
            String c12 = c11 != null ? c11.c() : null;
            o.a c13 = c1556a.a().c();
            String b12 = c13 != null ? c13.b() : null;
            o.a c14 = c1556a.a().c();
            v.e0(this, n.a(nVar, b11, valueOf, str3, null, false, z12, false, c12, b12, c14 != null ? Integer.valueOf(c14.a()) : null, c1556a.a().e(), 88));
            return;
        }
        if (!(action instanceof a.b)) {
            if (action instanceof a.d) {
                f04 = f0();
                v.e0(this, n.a((n) f04, null, null, null, null, ((a.d) action).a(), false, false, null, null, null, null, 2031));
                return;
            } else if (action instanceof a.e) {
                f03 = f0();
                v.e0(this, n.a((n) f03, null, null, null, ((a.e) action).a(), false, false, false, null, null, null, null, 1975));
                return;
            } else {
                if (!(action instanceof a.c)) {
                    throw new Sc.o();
                }
                f02 = f0();
                v.e0(this, n.a((n) f02, null, null, null, null, false, false, ((a.c) action).a(), null, null, null, null, 1983));
                return;
            }
        }
        f05 = f0();
        n nVar2 = (n) f05;
        a.b bVar = (a.b) action;
        CellDTO cellDTO = (CellDTO) C7714v.Q(bVar.a(), nVar2.b());
        String str4 = (cellDTO == null || (common2 = cellDTO.getCommon()) == null || (action3 = common2.getAction()) == null || (params2 = action3.getParams()) == null || (orDefault2 = params2.getOrDefault("reason", "")) == null) ? "" : orDefault2;
        boolean parseBoolean = (cellDTO == null || (common = cellDTO.getCommon()) == null || (action2 = common.getAction()) == null || (params = action2.getParams()) == null || (orDefault = params.getOrDefault("isDescriptionRequired", "false")) == null) ? false : Boolean.parseBoolean(orDefault);
        List<CellDTO> b13 = nVar2.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b13, 10));
        int i12 = 0;
        for (Object obj : b13) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            CellDTO cellDTO2 = (CellDTO) obj;
            CellDTO.LeftBlock leftBlock2 = cellDTO2.getLeftBlock();
            AtomDTO control2 = leftBlock2 != null ? leftBlock2.getControl() : null;
            RadioDTO radioDTO2 = control2 instanceof RadioDTO ? (RadioDTO) control2 : null;
            if (radioDTO2 != null) {
                CellDTO.LeftBlock leftBlock3 = cellDTO2.getLeftBlock();
                cellDTO2 = CellDTO.copy$default(cellDTO2, null, null, leftBlock3 != null ? CellDTO.LeftBlock.copy$default(leftBlock3, null, null, null, null, null, null, null, RadioDTO.copy$default(radioDTO2, null, Boolean.valueOf(i12 == bVar.a()), null, null, null, null, 61, null), 127, null) : null, null, null, 27, null);
            }
            arrayList.add(cellDTO2);
            i12 = i13;
        }
        v.e0(this, n.a(nVar2, arrayList, Integer.valueOf(bVar.a()), str4, null, false, parseBoolean, false, null, null, null, null, 1944));
    }
}
