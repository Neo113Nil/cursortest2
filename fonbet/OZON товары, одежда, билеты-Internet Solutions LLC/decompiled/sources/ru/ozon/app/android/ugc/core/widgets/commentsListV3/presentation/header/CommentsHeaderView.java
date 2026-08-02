package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "countView", "bindHeader", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "bindNoUiHeader", "bindHeaderData", "applyDefaultConstraints", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsHeaderView extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View countView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        this.countView = textAtomV2View2;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }

    private final void applyDefaultConstraints() {
        d dVar = new d();
        dVar.p(this);
        dVar.n(this.titleView.getId());
        dVar.n(this.countView.getId());
        dVar.A(this.titleView.getId(), -2);
        dVar.w(this.titleView.getId(), -2);
        dVar.A(this.countView.getId(), -2);
        dVar.w(this.countView.getId(), -2);
        dVar.s(this.titleView.getId(), 6, 0, 6);
        dVar.s(this.titleView.getId(), 4, 0, 4);
        dVar.s(this.countView.getId(), 6, this.titleView.getId(), 7);
        dVar.s(this.countView.getId(), 5, this.titleView.getId(), 5);
        dVar.f(this);
    }

    private final void bindHeaderData(CommentsHeaderVO header) {
        TextHolderKt.bind$default(this.titleView, header.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.countView, header.getCountText(), null, 2, null);
    }

    public final void bindHeader(@NotNull CommentsHeaderVO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        applyDefaultConstraints();
        bindHeaderData(header);
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ViewExtKt.showOrGone((View) c5314e0.next(), Boolean.valueOf(header.getCount() != 0));
            }
        }
    }

    public final void bindNoUiHeader(@NotNull CommentsHeaderVO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        d dVar = new d();
        dVar.p(this);
        dVar.A(this.titleView.getId(), -2);
        dVar.w(this.titleView.getId(), -2);
        dVar.A(this.countView.getId(), -2);
        dVar.w(this.countView.getId(), -2);
        dVar.E(new int[]{this.titleView.getId(), this.countView.getId()}, null, 2);
        dVar.s(this.titleView.getId(), 3, 0, 3);
        dVar.s(this.countView.getId(), 5, this.titleView.getId(), 5);
        dVar.f(this);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), Dimens.INSTANCE.getDP_8());
        bindHeaderData(header);
        ViewExtKt.showOrGone(this.countView, Boolean.valueOf(header.getCount() != 0));
    }
}
