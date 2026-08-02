package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import d00.C6018d;
import d00.C6020f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
public final class p {

    static final class a extends AbstractC7737t implements Function1<C6018d<ReportAbuseFormDTO>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f87051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a f87052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87053d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87054e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87055f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87056g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JsonParser jsonParser, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a aVar2, ru.ozon.android.messenger.framework.domain.repository.a aVar3, ru.ozon.android.messenger.framework.navigation.controller.a aVar4) {
            super(1);
            this.f87051b = jsonParser;
            this.f87052c = aVar2;
            this.f87053d = iVar;
            this.f87054e = aVar;
            this.f87055f = aVar3;
            this.f87056g = aVar4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6018d<ReportAbuseFormDTO> c6018d) {
            C6018d<ReportAbuseFormDTO> ComposeWidget = c6018d;
            Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
            ComposeWidget.a(new c(this.f87051b));
            ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a aVar = this.f87052c;
            ComposeWidget.p(new i(aVar, this.f87053d));
            ComposeWidget.l(new o(aVar, this.f87054e, this.f87055f, this.f87056g));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final n20.i a(@NotNull JsonParser deserializer, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a navigator, @NotNull ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a mapper, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        return C6020f.b("messenger", "reportAbuseForm", null, new a(deserializer, iVar, navigator, mapper, actionRepository, messengerController), 4, null);
    }
}
