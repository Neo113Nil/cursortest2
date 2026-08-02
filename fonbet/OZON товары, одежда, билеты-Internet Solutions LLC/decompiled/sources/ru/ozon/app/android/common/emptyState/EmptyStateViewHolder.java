package ru.ozon.app.android.common.emptyState;

import Eq.b;
import GZ.g;
import Sc.o;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.emptyState.EmptyStateViewMapper;
import ru.ozon.app.android.common.emptyState.databinding.EmptyStateWidgetBinding;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ#\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u0019\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStateViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/emptyState/EmptyStateVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LGZ/g;", "router", "<init>", "(Landroid/view/View;LGZ/g;)V", "", "action", "", "setAction", "(Ljava/lang/String;)V", "message", "setMessage", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "image", "setImage", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/emptyState/EmptyStateVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/common/emptyState/EmptyStateVO;Ll20/d;Ljava/lang/Object;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/common/emptyState/databinding/EmptyStateWidgetBinding;", "binding", "Lru/ozon/app/android/common/emptyState/databinding/EmptyStateWidgetBinding;", "deeplink", "Ljava/lang/String;", "Ll20/d;", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStateViewHolder extends k<EmptyStateVO> {

    @NotNull
    private final EmptyStateWidgetBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private String deeplink;
    private d info;

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
    public EmptyStateViewHolder(@NotNull View containerView, @NotNull g router) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        EmptyStateWidgetBinding bind = EmptyStateWidgetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.deeplink = "";
        bind.emptyStateActionTv.setOnClickListener(new b(0, router, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(g gVar, EmptyStateViewHolder emptyStateViewHolder, View view) {
        g.a.a(gVar, emptyStateViewHolder.deeplink, null, null, 6);
    }

    private final void setAction(String action) {
        SmallButtonView emptyStateActionTv = this.binding.emptyStateActionTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateActionTv, "emptyStateActionTv");
        TextViewExtKt.setTextOrGone(emptyStateActionTv, action);
    }

    private final void setImage(String image) {
        ImageView emptyStateIv = this.binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
        ImageViewExtKt.loadImageOrGone(emptyStateIv, image);
    }

    private final void setMessage(String message) {
        TextView emptyStateMessageTv = this.binding.emptyStateMessageTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateMessageTv, "emptyStateMessageTv");
        TextViewExtKt.setTextOrGone(emptyStateMessageTv, message);
    }

    private final void setTitle(String title) {
        TextView emptyStateTitleTv = this.binding.emptyStateTitleTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateTitleTv, "emptyStateTitleTv");
        TextViewExtKt.setTextOrGone(emptyStateTitleTv, title);
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
        String deeplink = item.getDeeplink();
        if (deeplink == null) {
            deeplink = "";
        }
        this.deeplink = deeplink;
        this.info = info;
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            setImage(item.getImage());
            setTitle(item.getTitle());
            setMessage(item.getMessage());
            setAction(item.getAction());
            return;
        }
        Iterator it = ((List) payload).iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((EmptyStateViewMapper.EmptyStatePayload) it.next()).ordinal()];
            if (i11 == 1) {
                setImage(item.getImage());
            } else if (i11 == 2) {
                setTitle(item.getTitle());
            } else if (i11 == 3) {
                setMessage(item.getMessage());
            } else if (i11 == 4) {
                setAction(item.getAction());
            } else {
                throw new o();
            }
        }
    }
}
