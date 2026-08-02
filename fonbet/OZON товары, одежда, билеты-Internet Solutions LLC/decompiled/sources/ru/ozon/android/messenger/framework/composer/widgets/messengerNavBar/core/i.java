package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import d00.C6018d;
import d00.C6020f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;

/* loaded from: classes10.dex */
public final class i {

    static final class a extends AbstractC7737t implements Function1<C6018d<MessengerNavBarDTO>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f87004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.serialize.a f87005c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87006d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JsonParser jsonParser, ru.ozon.android.messenger.framework.data.remote.serialize.a aVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2) {
            super(1);
            this.f87004b = jsonParser;
            this.f87005c = aVar;
            this.f87006d = aVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6018d<MessengerNavBarDTO> c6018d) {
            C6018d<MessengerNavBarDTO> ComposeWidget = c6018d;
            Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
            ComposeWidget.a(new b(this.f87004b));
            ComposeWidget.l(new h(this.f87005c, this.f87006d));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final n20.i a(@NotNull JsonParser deserializer, @NotNull ru.ozon.android.messenger.framework.data.remote.serialize.a mapper, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return C6020f.b("messenger", "navigationHeader", null, new a(deserializer, mapper, aVar), 4, null);
    }
}
