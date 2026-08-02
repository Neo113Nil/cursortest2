package com.socure.idplus.device.internal.input.manager.compose;

import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f864a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Function1 function1) {
        super(1);
        this.f864a = dVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<EditCommand> editCommands = (List) obj;
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        d dVar = this.f864a;
        String str = dVar.e;
        if (str != null) {
            for (EditCommand editCommand : editCommands) {
                if (editCommand instanceof CommitTextCommand) {
                    dVar.a(((CommitTextCommand) editCommand).getText(), str, InputChangeAction.UNKNOWN);
                }
            }
        }
        this.b.invoke(editCommands);
        return Unit.INSTANCE;
    }
}
