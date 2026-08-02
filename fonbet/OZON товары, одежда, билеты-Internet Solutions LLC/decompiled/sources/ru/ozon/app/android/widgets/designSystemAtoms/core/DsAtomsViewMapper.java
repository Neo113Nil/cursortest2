package ru.ozon.app.android.widgets.designSystemAtoms.core;

import A00.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.widgets.R$layout;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.app.android.widgets.designSystemAtoms.presentation.DSAtomsWidgetViewHolder;
import ru.ozon.app.android.widgets.designSystemAtoms.presentation.DesignSystemAtomsVO;
import ru.ozon.composer.compose.widget.scrollable.m;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170+0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/core/DsAtomsViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;", "Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;)Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO;Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;)Lru/ozon/composer/ui/widget/h;", "Lru/ozon/app/android/widgets/designSystemAtoms/core/DsAtomsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/widgets/designSystemAtoms/core/DsAtomsMapper;", "mapper", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DsAtomsViewMapper extends g<DesignSystemAtomsDTO, DesignSystemAtomsVO> {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(DsAtomsViewMapper$mapper$2.INSTANCE);
    private final int layout = R$layout.widget_ds_atoms;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(MarkStateDirty.class);

    private final DsAtomsMapper getMapper() {
        return (DsAtomsMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !(((state instanceof DesignSystemAtomsDTO ? (DesignSystemAtomsDTO) state : null) != null ? r3.getAtom() : null) instanceof AspectDTO);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public ru.ozon.composer.ui.widget.k<DesignSystemAtomsVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new DSAtomsWidgetViewHolder(view, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull DesignSystemAtomsDTO state, @NotNull DesignSystemAtomsVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return item != null ? new h.a((int) (item.getWidgetWidthPercent() * m.f94768d)) : h.f.f94874b;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public DesignSystemAtomsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DesignSystemAtomsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((update instanceof MarkStateDirty) && ((MarkStateDirty) update).getId() == oldItem.getId()) {
            return DesignSystemAtomsVO.copy$default(oldItem, 0L, null, null, 0.0f, false, true, 31, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<DesignSystemAtomsVO> map(@NotNull DesignSystemAtomsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
