package ru.ozon.app.android.returns.ui.molecules.reason.viewModel;

import Tc.d;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "changedText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "onInputChanged", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/jvm/functions/Function1;)V", "text", "Ljava/lang/String;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private String text = "EMPTY";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel$Companion;", "", "<init>", "()V", "ARG_TEXT", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void onInputChanged(@NotNull String changedText, @NotNull AtomActionDTO action, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(changedText, "changedText");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (Intrinsics.d(this.text, changedText)) {
            return;
        }
        this.text = changedText.toString();
        d builder = new d();
        builder.put("text", this.text);
        Map<String, String> params = action.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        onAction.invoke(AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, null, null, builder.u(), null, 23, null), null));
    }
}
