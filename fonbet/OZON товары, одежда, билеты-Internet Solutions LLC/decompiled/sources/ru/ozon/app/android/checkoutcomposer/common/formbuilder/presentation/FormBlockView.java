package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.map.R$id;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getTitleVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "fieldsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getFieldsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBlockView extends ConstraintLayout {

    @NotNull
    private final RecyclerView fieldsRv;

    @NotNull
    private final VerticalAtomsLayout titleVAL;

    public /* synthetic */ FormBlockView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final RecyclerView getFieldsRv() {
        return this.fieldsRv;
    }

    @NotNull
    public final VerticalAtomsLayout getTitleVAL() {
        return this.titleVAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.titleVAL);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewExtKt.gone(verticalAtomsLayout);
        addView(verticalAtomsLayout);
        this.titleVAL = verticalAtomsLayout;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.fieldsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        addView(recyclerView);
        this.fieldsRv = recyclerView;
        d dVar = new d();
        dVar.p(this);
        int px = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(4, context);
        ConstraintSetExtKt.startToStart$default(dVar, verticalAtomsLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, verticalAtomsLayout.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop(dVar, verticalAtomsLayout.getId(), 0, px);
        ConstraintSetExtKt.bottomToTop$default(dVar, verticalAtomsLayout.getId(), recyclerView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart(dVar, recyclerView.getId(), 0, px2);
        ConstraintSetExtKt.endToEnd(dVar, recyclerView.getId(), 0, px2);
        ConstraintSetExtKt.topToBottom$default(dVar, recyclerView.getId(), verticalAtomsLayout.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, recyclerView.getId(), 0, 0, 4, null);
        dVar.Z(recyclerView.getId(), 3, 0);
        dVar.f(this);
    }
}
