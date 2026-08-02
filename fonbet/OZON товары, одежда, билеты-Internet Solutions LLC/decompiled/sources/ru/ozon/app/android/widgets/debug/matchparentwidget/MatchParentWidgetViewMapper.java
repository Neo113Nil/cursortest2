package ru.ozon.app.android.widgets.debug.matchparentwidget;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.widgets.R$layout;
import ru.ozon.composer.ui.widget.g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetDTO;", "Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetViewHolder;", "Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/widgets/debug/matchparentwidget/MatchParentWidgetMapper;", "mapper", "", "getLayout", "()Ljava/lang/Integer;", "layout", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MatchParentWidgetViewMapper extends g<MatchParentWidgetDTO, MatchParentWidgetVO> {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(MatchParentWidgetViewMapper$mapper$2.INSTANCE);

    private final MatchParentWidgetMapper getMapper() {
        return (MatchParentWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(R$layout.widget_match_parent);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public ru.ozon.composer.ui.widget.k<MatchParentWidgetVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new MatchParentWidgetViewHolder(view);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<MatchParentWidgetVO> map(@NotNull MatchParentWidgetDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
