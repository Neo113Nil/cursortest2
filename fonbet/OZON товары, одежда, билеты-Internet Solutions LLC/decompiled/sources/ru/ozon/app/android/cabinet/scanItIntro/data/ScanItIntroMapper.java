package ru.ozon.app.android.cabinet.scanItIntro.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.scanItIntro.data.ScanItIntroDTO;
import ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Page;", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "toVO", "(Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Page;)Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO$Page;", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "toButtonAtom", "(Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO$Button;)Lru/ozon/uni/atoms/data/deprecated/Button;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO;Ll20/d;)Ljava/util/List;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScanItIntroMapper implements Function2<ScanItIntroDTO, d, List<? extends ScanItIntroVO>> {
    private final Button toButtonAtom(ScanItIntroDTO.Button button) {
        return new Button(button.getTitle(), null, button.getStyle(), new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, button.getAction(), null, 10, null), null, null, null, 114, null);
    }

    private final ScanItIntroVO.Page toVO(ScanItIntroDTO.Page page) {
        String image = page.getImage();
        String title = page.getTitle();
        String description = page.getDescription();
        ScanItIntroDTO.Button firstButton = page.getFirstButton();
        Button buttonAtom = firstButton != null ? toButtonAtom(firstButton) : null;
        ScanItIntroDTO.Button secondButton = page.getSecondButton();
        return new ScanItIntroVO.Page(image, title, description, buttonAtom, secondButton != null ? toButtonAtom(secondButton) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ScanItIntroVO> invoke(@NotNull ScanItIntroDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ScanItIntroDTO.Page> pages = state.getPages();
        ArrayList arrayList = new ArrayList(C7714v.z(pages, 10));
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ScanItIntroDTO.Page) it.next()));
        }
        return C7714v.a0(new ScanItIntroVO(hashCode, arrayList));
    }
}
