package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import d00.C6018d;
import d00.C6020f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data.FastAnswerTemplateEditorDTO;

/* loaded from: classes10.dex */
public final class p {

    static final class a extends AbstractC7737t implements Function1<C6018d<FastAnswerTemplateEditorDTO>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f86858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86859d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86860e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JsonParser jsonParser, q qVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
            super(1);
            this.f86857b = jsonParser;
            this.f86858c = qVar;
            this.f86859d = aVar;
            this.f86860e = aVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6018d<FastAnswerTemplateEditorDTO> c6018d) {
            C6018d<FastAnswerTemplateEditorDTO> ComposeWidget = c6018d;
            Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
            ComposeWidget.a(new d(this.f86857b));
            q qVar = this.f86858c;
            ComposeWidget.p(new h(qVar));
            ComposeWidget.l(new o(qVar, this.f86859d, this.f86860e));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final n20.i a(@NotNull JsonParser deserializer, @NotNull q mapper, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        return C6020f.b("messenger", "fastAnswerTemplateEditor", null, new a(deserializer, mapper, navigator, actionRepository), 4, null);
    }
}
