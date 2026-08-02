package ru.ozon.app.android.common.emptyState;

import GZ.g;
import Sc.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.emptyState.EmptyStateViewMapper;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStatePrecreationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/emptyState/EmptyStateVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "containerView", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;LGZ/g;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/emptyState/EmptyStateVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/common/emptyState/EmptyStateVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "getContainerView", "()Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "LGZ/g;", "getRouter", "()LGZ/g;", "widgetInfo", "Ll20/d;", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStatePrecreationViewHolder extends k<EmptyStateVO> {

    @NotNull
    private final EmptyStateViewGroup containerView;

    @NotNull
    private final g router;
    private d widgetInfo;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.emptyState.EmptyStatePrecreationViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String deeplink;
            EmptyStateVO boundedData = EmptyStatePrecreationViewHolder.this.getBoundedData();
            if (boundedData == null || (deeplink = boundedData.getDeeplink()) == null) {
                return;
            }
            g.a.a(EmptyStatePrecreationViewHolder.this.getRouter(), deeplink, null, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmptyStateViewMapper.EmptyStatePayload.values().length];
            try {
                iArr[EmptyStateViewMapper.EmptyStatePayload.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmptyStateViewMapper.EmptyStatePayload.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmptyStateViewMapper.EmptyStatePayload.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmptyStateViewMapper.EmptyStatePayload.ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStatePrecreationViewHolder(@NotNull EmptyStateViewGroup containerView, @NotNull g router) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        this.router = router;
        containerView.onActionButtonClick(new AnonymousClass1());
    }

    @NotNull
    public final g getRouter() {
        return this.router;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        EmptyStateViewGroup emptyStateViewGroup = this.containerView;
        this.widgetInfo = info;
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            emptyStateViewGroup.setImage(item.getImage());
            emptyStateViewGroup.setTitle(item.getTitle());
            emptyStateViewGroup.setMessage(item.getMessage());
            emptyStateViewGroup.setAction(item.getAction());
            return;
        }
        Iterator it = ((List) payload).iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((EmptyStateViewMapper.EmptyStatePayload) it.next()).ordinal()];
            if (i11 == 1) {
                emptyStateViewGroup.setImage(item.getImage());
            } else if (i11 == 2) {
                emptyStateViewGroup.setTitle(item.getTitle());
            } else if (i11 == 3) {
                emptyStateViewGroup.setMessage(item.getMessage());
            } else if (i11 == 4) {
                emptyStateViewGroup.setAction(item.getAction());
            } else {
                throw new o();
            }
        }
    }
}
