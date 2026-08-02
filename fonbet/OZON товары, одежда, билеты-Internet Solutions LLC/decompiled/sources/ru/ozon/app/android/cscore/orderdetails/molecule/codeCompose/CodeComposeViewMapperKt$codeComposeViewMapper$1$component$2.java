package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CodeComposeViewMapperKt$codeComposeViewMapper$1$component$2 extends AbstractC7737t implements Function0<CodeComposeComponent> {
    final /* synthetic */ C7475g $widgetComponentStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeComposeViewMapperKt$codeComposeViewMapper$1$component$2(C7475g c7475g) {
        super(0);
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CodeComposeComponent invoke() {
        return (CodeComposeComponent) this.$widgetComponentStorage.getComponent(CodeComposeComponent.class);
    }
}
