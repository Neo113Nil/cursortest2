package ru.ozon.app.android.session.instantLoginSettings.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.instantLoginSettings.models.InstantLoginSettingsVO;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginSettingsViewMapper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class InstantLoginSettingsViewHolder$bind$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ InstantLoginSettingsVO $item;
    final /* synthetic */ InstantLoginSettingsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantLoginSettingsViewHolder$bind$1$1(InstantLoginSettingsViewHolder instantLoginSettingsViewHolder, InstantLoginSettingsVO instantLoginSettingsVO) {
        super(1);
        this.this$0 = instantLoginSettingsViewHolder;
        this.$item = instantLoginSettingsVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ComposerReferences composerReferences;
        Function1 function1;
        AtomAction.ComposerAction copy$default;
        composerReferences = this.this$0.composerReferences;
        composerReferences.getController().update(new InstantLoginSettingsViewMapper.ToggleUpdate(this.$item.getId()));
        AtomAction actionTurnOn = z11 ? this.$item.getActionTurnOn() : this.$item.getActionTurnOff();
        AtomAction.ComposerAction composerAction = actionTurnOn instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) actionTurnOn : null;
        if (composerAction != null && (copy$default = AtomAction.ComposerAction.copy$default(composerAction, "instantLoginToggle", null, null, null, null, 30, null)) != null) {
            actionTurnOn = copy$default;
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(actionTurnOn);
    }
}
