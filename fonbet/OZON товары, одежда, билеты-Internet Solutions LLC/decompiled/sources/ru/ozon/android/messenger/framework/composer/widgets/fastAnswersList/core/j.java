package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import d00.C6018d;
import d00.C6020f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerTemplateListDTO;

/* loaded from: classes10.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function1<C6018d<FastAnswerTemplateListDTO>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86958b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f86959c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86960d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86961e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JsonParser jsonParser, k kVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
            super(1);
            this.f86958b = jsonParser;
            this.f86959c = kVar;
            this.f86960d = aVar;
            this.f86961e = aVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6018d<FastAnswerTemplateListDTO> c6018d) {
            C6018d<FastAnswerTemplateListDTO> ComposeWidget = c6018d;
            Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
            ComposeWidget.a(new b(this.f86958b));
            ComposeWidget.p(new i(this.f86959c, this.f86960d, this.f86961e));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final n20.i a(@NotNull JsonParser deserializer, @NotNull k mapper, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        return C6020f.b("messenger", "fastAnswerTemplateList", null, new a(deserializer, mapper, navigator, actionRepository), 4, null);
    }
}
