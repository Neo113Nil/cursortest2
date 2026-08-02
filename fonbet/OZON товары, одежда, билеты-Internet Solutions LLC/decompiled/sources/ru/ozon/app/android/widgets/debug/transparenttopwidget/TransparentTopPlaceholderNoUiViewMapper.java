package ru.ozon.app.android.widgets.debug.transparenttopwidget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentPlaceholderDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$color;
import v10.C10183a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentTopPlaceholderNoUiViewMapper;", "Lc20/r;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderMapper;", "mapper", "<init>", "(Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderMapper;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderMapper;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransparentTopPlaceholderNoUiViewMapper extends r<TransparentPlaceholderDTO, TransparentPlaceholderVO> {

    @NotNull
    private final TransparentPlaceholderMapper mapper;

    @NotNull
    private final r.a viewType;

    public TransparentTopPlaceholderNoUiViewMapper(@NotNull TransparentPlaceholderMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TransparentPlaceholderDTO) && ((TransparentPlaceholderDTO) state).getPosition() == TransparentPlaceholderDTO.Position.TOP;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TransparentPlaceholderVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        LinearLayout o11 = C10183a.o(container.Y());
        View view = new View(container.L());
        view.setBackgroundResource(R$color.black_transparent_320);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, UiExtKt.toPx(40)));
        return new TransparentPlaceholderViewHolder(o11, view);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TransparentPlaceholderVO> map(@NotNull TransparentPlaceholderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
