package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPrimaryButton.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010!\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\"R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/components/IntercomPrimaryButton;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", ViewProps.ON_CLICK, "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick$delegate", "trailingIconId", "getTrailingIconId", "()Ljava/lang/Integer;", "setTrailingIconId", "(Ljava/lang/Integer;)V", "trailingIconId$delegate", "Content", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomPrimaryButton extends AbstractComposeView {
    public static final int $stable = 0;

    /* renamed from: onClick$delegate, reason: from kotlin metadata */
    private final MutableState onClick;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    private final MutableState text;

    /* renamed from: trailingIconId$delegate, reason: from kotlin metadata */
    private final MutableState trailingIconId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(IntercomPrimaryButton tmp0_rcvr, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.text = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.onClick = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function0() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButton$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, null, 2, null);
        this.trailingIconId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getText() {
        return (String) this.text.getValue();
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text.setValue(str);
    }

    public final Function0<Unit> getOnClick() {
        return (Function0) this.onClick.getValue();
    }

    public final void setOnClick(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClick.setValue(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId.getValue();
    }

    public final void setTrailingIconId(Integer num) {
        this.trailingIconId.setValue(num);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(346924157);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), null, getTrailingIconId(), getOnClick(), startRestartGroup, 0, 2);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButton$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Content$lambda$1;
                    Content$lambda$1 = IntercomPrimaryButton.Content$lambda$1(IntercomPrimaryButton.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Content$lambda$1;
                }
            });
        }
    }
}
