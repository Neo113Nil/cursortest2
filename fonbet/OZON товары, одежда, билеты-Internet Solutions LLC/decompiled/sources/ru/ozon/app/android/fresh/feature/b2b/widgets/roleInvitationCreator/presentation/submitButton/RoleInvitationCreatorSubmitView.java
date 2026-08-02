package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton;

import B90.C2618u;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.RoleInvitationCreatorSubmitVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/submitButton/RoleInvitationCreatorSubmitView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "submitButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/RoleInvitationCreatorSubmitVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoleInvitationCreatorSubmitView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View submitButtonView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = ButtonV3View.$stable;
    private static final int PADDING_8 = ResourceExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int PADDING_4 = ResourceExtKt.toPx(Paddings.PADDING_200.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/presentation/submitButton/RoleInvitationCreatorSubmitView$Companion;", "", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleInvitationCreatorSubmitView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.roleInvitationCreatorSubmitButton, 0, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41636i = 0;
        e11.f41642l = 0;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.submitButtonView = buttonV3View;
        int i11 = PADDING_8;
        setPadding(i11, i11, i11, PADDING_4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        gradientDrawable.setCornerRadii(new float[]{ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24), ResourceExtKt.toPxF(24), 0.0f, 0.0f, 0.0f, 0.0f});
        setBackground(gradientDrawable);
    }

    public final void bind(@NotNull RoleInvitationCreatorSubmitVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.submitButtonView, item.getIsLoading() ? ButtonV3DTO.copy$default(item.getSubmitButton(), null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 131007, null) : item.getSubmitButton(), actionHandler);
    }
}
